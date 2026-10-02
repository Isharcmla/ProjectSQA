package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.module.SimpleDeserializers;
import com.fasterxml.jackson.databind.module.SimpleKeyDeserializers;
import com.fasterxml.jackson.databind.module.SimpleValueInstantiators;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.Serializable;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

public class BasicDeserializerFactoryTest {

    private ObjectMapper mapper;
    private DeserializationContext ctxt;
    private DeserializationConfig config;
    private BeanDeserializerFactory factory;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        ctxt = mapper.getDeserializationContext();
        config = mapper.getDeserializationConfig();
        factory = BeanDeserializerFactory.instance;
    }

    enum SimpleEnum {
        A, B, C;
    }

    enum EnumWithCreator {
        X, Y;
        @JsonCreator
        public static EnumWithCreator fromString(String val) {
            return "x".equalsIgnoreCase(val) ? X : Y;
        }
    }

    enum EnumWithNoArgCreator {
        SINGLETON;
        @JsonCreator
        public static EnumWithNoArgCreator create() {
            return SINGLETON;
        }
    }

    enum EnumWithJsonValue {
        VAL1("1"), VAL2("2");
        private final String code;
        EnumWithJsonValue(String code) { this.code = code; }
        @JsonValue
        public String getCode() { return code; }
    }

    enum BrokenEnumCreator {
        A;
        @JsonCreator
        public static BrokenEnumCreator fromInt(int i) { return A; }
    }

    enum BrokenMultiParamCreator {
        A;
        @JsonCreator
        public static BrokenMultiParamCreator fromTwo(String a, String b) { return A; }
    }

    static class CustomCustomValueInstantiator extends ValueInstantiator implements Serializable {
        @Override
        public String getValueTypeDesc() { return "CustomCustomValueInstantiator"; }
        @Override
        public boolean canCreateUsingDefault() { return true; }
        @Override
        public Object createUsingDefault(DeserializationContext ctxt) { return new ValueInstantiatorBean(); }
    }

    @JsonDeserialize(valueInstantiator = CustomCustomValueInstantiator.class)
    static class ValueInstantiatorBean {}

    static class CustomKeyDeser extends KeyDeserializer {
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) {
            return key;
        }
    }

    @JsonDeserialize(keyUsing = CustomKeyDeser.class)
    static class CustomKeyBean {}

    static class CustomItemDeser extends JsonDeserializer<String> {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) {
            return "custom";
        }
    }

    static class ContainerAnnotationBean {
        @JsonDeserialize(contentUsing = CustomItemDeser.class, keyUsing = CustomKeyDeser.class)
        public Map<String, String> map;
    }

    static class SimplePojo {
        public String name;
        public SimplePojo() {}
        public SimplePojo(String name) { this.name = name; }
    }

    static class DelegatingExplicitPojo {
        public final String val;
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public DelegatingExplicitPojo(String val) { this.val = val; }
    }

    static class MultiArgDelegatingExplicitPojo {
        public final String val;
        public final int injected;
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public MultiArgDelegatingExplicitPojo(String val, @JacksonInject("inj") int injected) {
            this.val = val;
            this.injected = injected;
        }
    }

    static class PropertiesExplicitPojo {
        public final String a;
        public final int b;
        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        public PropertiesExplicitPojo(@JsonProperty("a") String a, @JsonProperty("b") int b) {
            this.a = a;
            this.b = b;
        }
    }

    static class ExplicitAnyPojo {
        public final String a;
        public final int b;
        @JsonCreator
        public ExplicitAnyPojo(@JsonProperty("a") String a, @JsonProperty("b") int b) {
            this.a = a;
            this.b = b;
        }
    }

    static class ExplicitAnySingleArgProps {
        public final String val;
        @JsonCreator
        public ExplicitAnySingleArgProps(@JsonProperty("val") String val) {
            this.val = val;
        }
    }

    static class ExplicitAnySingleArgDelegate {
        public final SimplePojo pojo;
        @JsonCreator
        public ExplicitAnySingleArgDelegate(SimplePojo pojo) {
            this.pojo = pojo;
        }
    }

    static class ImplicitCtorPojo {
        public final String x;
        public final int y;
        public ImplicitCtorPojo(String x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class SingleArgPrimitivesPojo {
        public int i;
        public long l;
        public double d;
        public boolean b;
        public SingleArgPrimitivesPojo(int i) { this.i = i; }
        public SingleArgPrimitivesPojo(long l) { this.l = l; }
        public SingleArgPrimitivesPojo(double d) { this.d = d; }
        public SingleArgPrimitivesPojo(boolean b) { this.b = b; }
    }

    static class FactoryMethodsPojo {
        public String str;
        private FactoryMethodsPojo(String str) { this.str = str; }

        @JsonCreator
        public static FactoryMethodsPojo noArgFactory() { return new FactoryMethodsPojo("noArg"); }

        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public static FactoryMethodsPojo delegatingFactory(Integer i) { return new FactoryMethodsPojo(String.valueOf(i)); }

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        public static FactoryMethodsPojo propsFactory(@JsonProperty("name") String name) { return new FactoryMethodsPojo(name); }
    }

    static class ImplicitFactoryPojo {
        public String val;
        private ImplicitFactoryPojo(String val) { this.val = val; }
        public static ImplicitFactoryPojo create(String val) { return new ImplicitFactoryPojo(val); }
    }

    @JsonIgnoreProperties({"ign1", "ign2"})
    static class IgnoralsMap extends HashMap<String, String> {}

    static class BrokenUnwrappedCreator {
        @JsonCreator
        public BrokenUnwrappedCreator(@JsonUnwrapped SimplePojo pojo) {}
    }

    static class BrokenDoubleDelegatingCreator {
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public BrokenDoubleDelegatingCreator(String a, Integer b) {}
    }

    static class BrokenNoDelegatingCreator {
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public BrokenNoDelegatingCreator(@JacksonInject("a") String a, @JacksonInject("b") Integer b) {}
    }

    static class BrokenPropertyCreator {
        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        public BrokenPropertyCreator(String unannotated) {}
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
    @JsonTypeName("polySub")
    static class PolySub extends SimplePojo {}

    interface CustomInterfaceCollection<E> extends Collection<E> {}
    interface CustomInterfaceMap<K, V> extends Map<K, V> {}

    @Test
    public void testGetFactoryConfig_standard_returnsNonNullConfig() {
        DeserializerFactoryConfig cfg = factory.getFactoryConfig();
        Assert.assertNotNull(cfg);
    }

    @Test
    public void testWithAdditionalDeserializers_validInstance_createsNewConfig() {
        DeserializerFactory df = factory.withAdditionalDeserializers(new SimpleDeserializers());
        Assert.assertNotSame(factory, df);
        Assert.assertTrue(df.getFactoryConfig().hasDeserializers());
    }

    @Test
    public void testWithAdditionalKeyDeserializers_validInstance_createsNewConfig() {
        DeserializerFactory df = factory.withAdditionalKeyDeserializers(new SimpleKeyDeserializers());
        Assert.assertNotSame(factory, df);
        Assert.assertTrue(df.getFactoryConfig().hasKeyDeserializers());
    }

    @Test
    public void testWithDeserializerModifier_validModifier_createsNewConfig() {
        DeserializerFactory df = factory.withDeserializerModifier(new BeanDeserializerModifier() {});
        Assert.assertNotSame(factory, df);
        Assert.assertTrue(df.getFactoryConfig().hasDeserializerModifiers());
    }

    @Test
    public void testWithAbstractTypeResolver_validResolver_createsNewConfig() {
        DeserializerFactory df = factory.withAbstractTypeResolver(new SimpleAbstractTypeResolver());
        Assert.assertNotSame(factory, df);
        Assert.assertTrue(df.getFactoryConfig().hasAbstractTypeResolvers());
    }

    @Test
    public void testWithValueInstantiators_validInstantiators_createsNewConfig() {
        DeserializerFactory df = factory.withValueInstantiators(new SimpleValueInstantiators());
        Assert.assertNotSame(factory, df);
        Assert.assertTrue(df.getFactoryConfig().hasValueInstantiators());
    }

    @Test
    public void testMapAbstractType_unregisteredAbstractType_returnsOriginalType() throws Exception {
        JavaType type = config.constructType(CharSequence.class);
        JavaType mapped = factory.mapAbstractType(config, type);
        Assert.assertEquals(type, mapped);
    }

    @Test
    public void testMapAbstractType_registeredResolver_resolvesConcrete() throws Exception {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(List.class, ArrayList.class);
        DeserializerFactory df = factory.withAbstractTypeResolver(resolver);

        JavaType type = config.constructType(List.class);
        JavaType mapped = df.mapAbstractType(config, type);
        Assert.assertEquals(ArrayList.class, mapped.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapAbstractType_invalidCycleOrNonSubtype_throwsException() throws Exception {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(List.class, (Class) Set.class);
        DeserializerFactory df = factory.withAbstractTypeResolver(resolver);

        JavaType type = config.constructType(List.class);
        df.mapAbstractType(config, type);
    }

    @Test
    public void testFindValueInstantiator_customAnnotation_returnsCustomInstantiator() throws Exception {
        JavaType type = config.constructType(ValueInstantiatorBean.class);
        BeanDescription desc = config.introspect(type);
        ValueInstantiator vi = factory.findValueInstantiator(ctxt, desc);
        Assert.assertNotNull(vi);
        Assert.assertTrue(vi instanceof CustomCustomValueInstantiator);
    }

    @Test
    public void testFindValueInstantiator_specialStandardTypes_returnsSpecialInstantiators() throws Exception {
        BeanDescription descLoc = config.introspect(config.constructType(JsonLocation.class));
        ValueInstantiator viLoc = factory.findValueInstantiator(ctxt, descLoc);
        Assert.assertNotNull(viLoc);

        BeanDescription descSet = config.introspect(config.constructType(Collections.EMPTY_SET.getClass()));
        ValueInstantiator viSet = factory.findValueInstantiator(ctxt, descSet);
        Assert.assertNotNull(viSet);

        BeanDescription descList = config.introspect(config.constructType(Collections.EMPTY_LIST.getClass()));
        ValueInstantiator viList = factory.findValueInstantiator(ctxt, descList);
        Assert.assertNotNull(viList);

        BeanDescription descMap = config.introspect(config.constructType(Collections.EMPTY_MAP.getClass()));
        ValueInstantiator viMap = factory.findValueInstantiator(ctxt, descMap);
        Assert.assertNotNull(viMap);
    }

    @Test
    public void testFindValueInstantiator_registeredValueInstantiators_invokesCustom() throws Exception {
        SimpleValueInstantiators instantiators = new SimpleValueInstantiators();
        final StdValueInstantiator custom = new StdValueInstantiator(config, SimplePojo.class);
        instantiators.addValueInstantiator(SimplePojo.class, custom);
        DeserializerFactory df = factory.withValueInstantiators(instantiators);

        BeanDescription desc = config.introspect(config.constructType(SimplePojo.class));
        ValueInstantiator vi = df.findValueInstantiator(ctxt, desc);
        Assert.assertSame(custom, vi);
    }

    @Test
    public void testValueInstantiatorInstance_directInstanceAndClasses_handlesProperly() throws Exception {
        ValueInstantiator direct = new StdValueInstantiator(config, Object.class);
        Assert.assertSame(direct, factory._valueInstantiatorInstance(config, null, direct));
        Assert.assertNull(factory._valueInstantiatorInstance(config, null, null));
        Assert.assertNull(factory._valueInstantiatorInstance(config, null, NoClass.class));

        ValueInstantiator instantiated = factory._valueInstantiatorInstance(config, null, CustomCustomValueInstantiator.class);
        Assert.assertTrue(instantiated instanceof CustomCustomValueInstantiator);
    }

    @Test(expected = IllegalStateException.class)
    public void testValueInstantiatorInstance_invalidType_throwsException() throws Exception {
        factory._valueInstantiatorInstance(config, null, 12345);
    }

    @Test(expected = IllegalStateException.class)
    public void testValueInstantiatorInstance_nonInstantiatorClass_throwsException() throws Exception {
        factory._valueInstantiatorInstance(config, null, String.class);
    }

    @Test
    public void testConstructValueInstantiator_variousCreators_constructsSuccessfully() throws Exception {
        Class<?>[] classes = new Class<?>[] {
                DelegatingExplicitPojo.class,
                MultiArgDelegatingExplicitPojo.class,
                PropertiesExplicitPojo.class,
                ExplicitAnyPojo.class,
                ExplicitAnySingleArgProps.class,
                ExplicitAnySingleArgDelegate.class,
                ImplicitCtorPojo.class,
                SingleArgPrimitivesPojo.class,
                FactoryMethodsPojo.class,
                ImplicitFactoryPojo.class
        };

        for (Class<?> cls : classes) {
            BeanDescription desc = config.introspect(config.constructType(cls));
            ValueInstantiator vi = factory.findValueInstantiator(ctxt, desc);
            Assert.assertNotNull(vi);
        }
    }

    @Test(expected = JsonMappingException.class)
    public void testConstructValueInstantiator_unwrappedInCreator_throwsException() throws Exception {
        BeanDescription desc = config.introspect(config.constructType(BrokenUnwrappedCreator.class));
        factory.findValueInstantiator(ctxt, desc);
    }

    @Test(expected = JsonMappingException.class)
    public void testConstructValueInstantiator_doubleDelegating_throwsException() throws Exception {
        BeanDescription desc = config.introspect(config.constructType(BrokenDoubleDelegatingCreator.class));
        factory.findValueInstantiator(ctxt, desc);
    }

    @Test(expected = JsonMappingException.class)
    public void testConstructValueInstantiator_noDelegatingArg_throwsException() throws Exception {
        BeanDescription desc = config.introspect(config.constructType(BrokenNoDelegatingCreator.class));
        factory.findValueInstantiator(ctxt, desc);
    }

    @Test(expected = JsonMappingException.class)
    public void testConstructValueInstantiator_propertyCreatorWithoutName_throwsException() throws Exception {
        BeanDescription desc = config.introspect(config.constructType(BrokenPropertyCreator.class));
        factory.findValueInstantiator(ctxt, desc);
    }

    @Test
    public void testCreateArrayDeserializer_primitiveObjectAndCustomModifiers() throws Exception {
        JavaType intArrayType = config.constructType(int[].class);
        BeanDescription descInt = config.introspect(intArrayType);
        JsonDeserializer<?> deserInt = factory.createArrayDeserializer(ctxt, (ArrayType) intArrayType, descInt);
        Assert.assertNotNull(deserInt);

        JavaType strArrayType = config.constructType(String[].class);
        BeanDescription descStr = config.introspect(strArrayType);
        JsonDeserializer<?> deserStr = factory.createArrayDeserializer(ctxt, (ArrayType) strArrayType, descStr);
        Assert.assertNotNull(deserStr);

        JavaType objArrayType = config.constructType(SimplePojo[].class);
        BeanDescription descObj = config.introspect(objArrayType);
        JsonDeserializer<?> deserObj = factory.createArrayDeserializer(ctxt, (ArrayType) objArrayType, descObj);
        Assert.assertNotNull(deserObj);

        final boolean[] modified = new boolean[1];
        DeserializerFactory df = factory.withDeserializerModifier(new BeanDeserializerModifier() {
            @Override
            public JsonDeserializer<?> modifyArrayDeserializer(DeserializationConfig config, ArrayType valueType, BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                modified[0] = true;
                return deserializer;
            }
        });
        df.createArrayDeserializer(ctxt, (ArrayType) strArrayType, descStr);
        Assert.assertTrue(modified[0]);
    }

    @Test
    public void testCreateCollectionDeserializer_standardAndFallbacks() throws Exception {
        Class<?>[] collClasses = new Class<?>[] {
                ArrayList.class,
                HashSet.class,
                TreeSet.class,
                LinkedList.class,
                ArrayBlockingQueue.class,
                EnumSet.class,
                List.class,
                Set.class,
                Queue.class,
                Deque.class,
                NavigableSet.class,
                SortedSet.class
        };

        for (Class<?> cls : collClasses) {
            JavaType type;
            if (cls == EnumSet.class) {
                type = config.getTypeFactory().constructCollectionType(EnumSet.class, SimpleEnum.class);
            } else {
                type = config.getTypeFactory().constructCollectionType((Class<? extends Collection>) cls, String.class);
            }
            BeanDescription desc = config.introspect(type);
            JsonDeserializer<?> deser = factory.createCollectionDeserializer(ctxt, (CollectionType) type, desc);
            Assert.assertNotNull(deser);
        }

        JavaType intCollType = config.getTypeFactory().constructCollectionType(ArrayList.class, Integer.class);
        BeanDescription descInt = config.introspect(intCollType);
        JsonDeserializer<?> deserInt = factory.createCollectionDeserializer(ctxt, (CollectionType) intCollType, descInt);
        Assert.assertNotNull(deserInt);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCollectionDeserializer_abstractNoFallback_throwsException() throws Exception {
        JavaType type = config.getTypeFactory().constructCollectionType(CustomInterfaceCollection.class, String.class);
        BeanDescription desc = config.introspect(type);
        factory.createCollectionDeserializer(ctxt, (CollectionType) type, desc);
    }

    @Test
    public void testCreateCollectionLikeDeserializer_andModifiers() throws Exception {
        JavaType type = config.getTypeFactory().constructCollectionLikeType(ArrayList.class, String.class);
        BeanDescription desc = config.introspect(type);
        JsonDeserializer<?> deser = factory.createCollectionLikeDeserializer(ctxt, (CollectionLikeType) type, desc);
        Assert.assertNull(deser);

        final boolean[] modified = new boolean[1];
        SimpleDeserializers desers = new SimpleDeserializers();
        desers.addDeserializer(ArrayList.class, new CustomItemDeser());
        DeserializerFactory df = factory.withAdditionalDeserializers(desers).withDeserializerModifier(new BeanDeserializerModifier() {
            @Override
            public JsonDeserializer<?> modifyCollectionLikeDeserializer(DeserializationConfig config, CollectionLikeType type, BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                modified[0] = true;
                return deserializer;
            }
        });
        df.createCollectionLikeDeserializer(ctxt, (CollectionLikeType) type, desc);
        Assert.assertTrue(modified[0]);
    }

    @Test
    public void testCreateMapDeserializer_standardAndFallbacks() throws Exception {
        Class<?>[] mapClasses = new Class<?>[] {
                HashMap.class,
                LinkedHashMap.class,
                TreeMap.class,
                ConcurrentHashMap.class,
                ConcurrentSkipListMap.class,
                Map.class,
                ConcurrentMap.class,
                SortedMap.class,
                NavigableMap.class,
                ConcurrentNavigableMap.class,
                IgnoralsMap.class
        };

        for (Class<?> cls : mapClasses) {
            JavaType type = config.getTypeFactory().constructMapType((Class<? extends Map>) cls, String.class, String.class);
            BeanDescription desc = config.introspect(type);
            JsonDeserializer<?> deser = factory.createMapDeserializer(ctxt, (MapType) type, desc);
            Assert.assertNotNull(deser);
        }

        JavaType enumMapType = config.getTypeFactory().constructMapType(EnumMap.class, SimpleEnum.class, String.class);
        BeanDescription descEnum = config.introspect(enumMapType);
        JsonDeserializer<?> deserEnum = factory.createMapDeserializer(ctxt, (MapType) enumMapType, descEnum);
        Assert.assertNotNull(deserEnum);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateMapDeserializer_enumMapWithNonEnumKey_throwsException() throws Exception {
        JavaType invalidEnumMapType = config.getTypeFactory().constructMapType(EnumMap.class, String.class, String.class);
        BeanDescription desc = config.introspect(invalidEnumMapType);
        factory.createMapDeserializer(ctxt, (MapType) invalidEnumMapType, desc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateMapDeserializer_abstractNoFallback_throwsException() throws Exception {
        JavaType type = config.getTypeFactory().constructMapType(CustomInterfaceMap.class, String.class, String.class);
        BeanDescription desc = config.introspect(type);
        factory.createMapDeserializer(ctxt, (MapType) type, desc);
    }

    @Test
    public void testCreateMapLikeDeserializer_andModifiers() throws Exception {
        JavaType type = config.getTypeFactory().constructMapLikeType(HashMap.class, String.class, String.class);
        BeanDescription desc = config.introspect(type);
        JsonDeserializer<?> deser = factory.createMapLikeDeserializer(ctxt, (MapLikeType) type, desc);
        Assert.assertNull(deser);

        final boolean[] modified = new boolean[1];
        SimpleDeserializers desers = new SimpleDeserializers();
        desers.addDeserializer(HashMap.class, new CustomItemDeser());
        DeserializerFactory df = factory.withAdditionalDeserializers(desers).withDeserializerModifier(new BeanDeserializerModifier() {
            @Override
            public JsonDeserializer<?> modifyMapLikeDeserializer(DeserializationConfig config, MapLikeType type, BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                modified[0] = true;
                return deserializer;
            }
        });
        df.createMapLikeDeserializer(ctxt, (MapLikeType) type, desc);
        Assert.assertTrue(modified[0]);
    }

    @Test
    public void testCreateEnumDeserializer_variousForms() throws Exception {
        Class<?>[] enums = new Class<?>[] {
                SimpleEnum.class,
                EnumWithCreator.class,
                EnumWithNoArgCreator.class,
                EnumWithJsonValue.class
        };

        for (Class<?> cls : enums) {
            JavaType type = config.constructType(cls);
            BeanDescription desc = config.introspect(type);
            JsonDeserializer<?> deser = factory.createEnumDeserializer(ctxt, type, desc);
            Assert.assertNotNull(deser);
        }

        final boolean[] modified = new boolean[1];
        DeserializerFactory df = factory.withDeserializerModifier(new BeanDeserializerModifier() {
            @Override
            public JsonDeserializer<?> modifyEnumDeserializer(DeserializationConfig config, JavaType type, BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                modified[0] = true;
                return deserializer;
            }
        });
        JavaType type = config.constructType(SimpleEnum.class);
        df.createEnumDeserializer(ctxt, type, config.introspect(type));
        Assert.assertTrue(modified[0]);
    }

    @Test
    public void testCreateTreeDeserializer_validNodes_returnsDeserializer() throws Exception {
        JavaType nodeType = config.constructType(JsonNode.class);
        BeanDescription descNode = config.introspect(nodeType);
        Assert.assertNotNull(factory.createTreeDeserializer(config, nodeType, descNode));

        JavaType objNodeType = config.constructType(ObjectNode.class);
        BeanDescription descObj = config.introspect(objNodeType);
        Assert.assertNotNull(factory.createTreeDeserializer(config, objNodeType, descObj));

        JavaType arrNodeType = config.constructType(ArrayNode.class);
        BeanDescription descArr = config.introspect(arrNodeType);
        Assert.assertNotNull(factory.createTreeDeserializer(config, arrNodeType, descArr));
    }

    @Test
    public void testCreateReferenceDeserializer_atomicReference_returnsDeserializer() throws Exception {
        JavaType refType = config.getTypeFactory().constructReferenceType(AtomicReference.class, config.constructType(String.class));
        BeanDescription desc = config.introspect(refType);
        JsonDeserializer<?> deser = factory.createReferenceDeserializer(ctxt, (ReferenceType) refType, desc);
        Assert.assertNotNull(deser);

        final boolean[] modified = new boolean[1];
        DeserializerFactory df = factory.withDeserializerModifier(new BeanDeserializerModifier() {
            @Override
            public JsonDeserializer<?> modifyReferenceDeserializer(DeserializationConfig config, ReferenceType type, BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                modified[0] = true;
                return deserializer;
            }
        });
        df.createReferenceDeserializer(ctxt, (ReferenceType) refType, desc);
        Assert.assertTrue(modified[0]);
    }

    @Test
    public void testFindTypeDeserializer_polymorphicAndDefault_returnsCorrectDeserializer() throws Exception {
        JavaType polyType = config.constructType(PolySub.class);
        TypeDeserializer td = factory.findTypeDeserializer(config, polyType);
        Assert.assertNotNull(td);

        JavaType normalType = config.constructType(SimplePojo.class);
        TypeDeserializer tdNull = factory.findTypeDeserializer(config, normalType);
        Assert.assertNull(tdNull);
    }

    @Test
    public void testFindOptionalStdDeserializer_jdkOrOptional_returnsDeserializer() throws Exception {
        JavaType type = config.constructType(java.sql.Date.class);
        BeanDescription desc = config.introspect(type);
        JsonDeserializer<?> deser = factory.findOptionalStdDeserializer(ctxt, type, desc);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testCreateKeyDeserializer_enumAndStringBased_returnsKeyDeser() throws Exception {
        KeyDeserializer kdEnum = factory.createKeyDeserializer(ctxt, config.constructType(SimpleEnum.class));
        Assert.assertNotNull(kdEnum);

        KeyDeserializer kdEnumCreator = factory.createKeyDeserializer(ctxt, config.constructType(EnumWithCreator.class));
        Assert.assertNotNull(kdEnumCreator);

        KeyDeserializer kdEnumJsonVal = factory.createKeyDeserializer(ctxt, config.constructType(EnumWithJsonValue.class));
        Assert.assertNotNull(kdEnumJsonVal);

        KeyDeserializer kdString = factory.createKeyDeserializer(ctxt, config.constructType(String.class));
        Assert.assertNotNull(kdString);

        KeyDeserializer kdInt = factory.createKeyDeserializer(ctxt, config.constructType(Integer.class));
        Assert.assertNotNull(kdInt);

        KeyDeserializer kdCustom = factory.createKeyDeserializer(ctxt, config.constructType(CustomKeyBean.class));
        Assert.assertNotNull(kdCustom);

        final boolean[] modified = new boolean[1];
        DeserializerFactory df = factory.withDeserializerModifier(new BeanDeserializerModifier() {
            @Override
            public KeyDeserializer modifyKeyDeserializer(DeserializationConfig config, JavaType type, KeyDeserializer deserializer) {
                modified[0] = true;
                return deserializer;
            }
        });
        df.createKeyDeserializer(ctxt, config.constructType(String.class));
        Assert.assertTrue(modified[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateKeyDeserializer_brokenEnumCreatorNonString_throwsException() throws Exception {
        factory.createKeyDeserializer(ctxt, config.constructType(BrokenEnumCreator.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateKeyDeserializer_brokenEnumCreatorMultiParam_throwsException() throws Exception {
        factory.createKeyDeserializer(ctxt, config.constructType(BrokenMultiParamCreator.class));
    }

    @Test
    public void testFindPropertyTypeDeserializerAndContentTypeDeserializer() throws Exception {
        BeanDescription desc = config.introspect(config.constructType(ContainerAnnotationBean.class));
        AnnotatedMember member = desc.findProperties().get(0).getPrimaryMember();

        TypeDeserializer propTypeDeser = factory.findPropertyTypeDeserializer(config, member.getType(), member);
        Assert.assertNull(propTypeDeser);

        TypeDeserializer contTypeDeser = factory.findPropertyContentTypeDeserializer(config, member.getType(), member);
        Assert.assertNull(contTypeDeser);
    }

    @Test
    public void testFindDefaultDeserializer_variousJdkAndCoreTypes() throws Exception {
        Class<?>[] types = new Class<?>[] {
                Object.class,
                String.class,
                CharSequence.class,
                Iterable.class,
                Map.Entry.class,
                int.class,
                Integer.class,
                Date.class,
                Calendar.class,
                TokenBuffer.class,
                UUID.class,
                StackTraceElement.class
        };

        for (Class<?> cls : types) {
            JavaType type;
            if (cls == Map.Entry.class) {
                type = config.getTypeFactory().constructMapLikeType(Map.Entry.class, String.class, Object.class);
            } else if (cls == Iterable.class) {
                type = config.getTypeFactory().constructCollectionLikeType(Iterable.class, String.class);
            } else {
                type = config.constructType(cls);
            }
            BeanDescription desc = config.introspect(type);
            JsonDeserializer<?> deser = factory.findDefaultDeserializer(ctxt, type, desc);
            Assert.assertNotNull("Expected deserializer for " + cls.getName(), deser);
        }

        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(List.class, ArrayList.class);
        resolver.addMapping(Map.class, LinkedHashMap.class);
        DeserializerFactory df = factory.withAbstractTypeResolver(resolver);
        JavaType objType = config.constructType(Object.class);
        JsonDeserializer<?> untypedDeser = df.findDefaultDeserializer(ctxt, objType, config.introspect(objType));
        Assert.assertNotNull(untypedDeser);
    }

    @Test
    public void testDeprecatedMethods_compatibility() throws Exception {
        BeanDescription desc = config.introspect(config.constructType(SimplePojo.class));
        AnnotatedMember member = desc.findProperties().get(0).getPrimaryMember();

        JavaType t1 = factory.modifyTypeByAnnotation(ctxt, member, member.getType());
        Assert.assertEquals(member.getType(), t1);

        JavaType t2 = factory.resolveType(ctxt, desc, member.getType(), member);
        Assert.assertEquals(member.getType(), t2);

        JavaType enumType = config.constructType(EnumWithJsonValue.class);
        AnnotatedMethod jvMethod = factory._findJsonValueFor(config, enumType);
        Assert.assertNotNull(jvMethod);

        Assert.assertNull(factory._findJsonValueFor(config, null));
    }
}
