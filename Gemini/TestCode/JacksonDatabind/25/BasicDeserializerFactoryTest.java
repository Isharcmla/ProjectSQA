package com.fasterxml.jackson.databind.deser;

import java.io.File;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URL;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonValueInstantiator;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
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
import com.fasterxml.jackson.databind.util.TokenBuffer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BasicDeserializerFactoryTest {

    static class TestBasicDeserializerFactory extends BasicDeserializerFactory {
        private static final long serialVersionUID = 1L;

        public TestBasicDeserializerFactory(DeserializerFactoryConfig config) {
            super(config);
        }

        @Override
        protected DeserializerFactory withConfig(DeserializerFactoryConfig config) {
            return new TestBasicDeserializerFactory(config);
        }
    }

    enum TestEnum {
        A, B, C;
    }

    enum EnumWithCreator {
        VAL1, VAL2;

        @JsonCreator
        public static EnumWithCreator fromString(String val) {
            if ("1".equals(val)) return VAL1;
            return VAL2;
        }
    }

    enum EnumWithInvalidCreator {
        VAL1;

        @JsonCreator
        public static EnumWithInvalidCreator invalid(int val, String other) {
            return VAL1;
        }
    }

    enum EnumWithJsonValue {
        X("custom_x"), Y("custom_y");

        private final String code;

        EnumWithJsonValue(String code) {
            this.code = code;
        }

        @JsonValue
        public String getCode() {
            return code;
        }
    }

    static class CustomValueInstantiator extends ValueInstantiator {
        @Override
        public String getValueTypeDesc() {
            return "CustomValueInstantiator";
        }

        @Override
        public boolean canCreateUsingDefault() {
            return true;
        }

        @Override
        public Object createUsingDefault(DeserializationContext ctxt) {
            return new AnnotatedInstantiatorBean();
        }
    }

    @JsonValueInstantiator(CustomValueInstantiator.class)
    static class AnnotatedInstantiatorBean {}

    static class SimpleBean {
        public String name;
        public int age;

        public SimpleBean() {}

        public SimpleBean(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    static class SingleArgCtorsBean {
        public SingleArgCtorsBean(String s) {}
        public SingleArgCtorsBean(int i) {}
        public SingleArgCtorsBean(long l) {}
        public SingleArgCtorsBean(double d) {}
        public SingleArgCtorsBean(boolean b) {}
    }

    static class SingleArgDelegatingBean {
        public Object val;

        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public SingleArgDelegatingBean(SimpleBean b) {
            this.val = b;
        }
    }

    static class SingleArgFactoryMethodsBean {
        public static SingleArgFactoryMethodsBean fromString(String s) { return new SingleArgFactoryMethodsBean(); }
        public static SingleArgFactoryMethodsBean fromInt(int i) { return new SingleArgFactoryMethodsBean(); }
        public static SingleArgFactoryMethodsBean fromLong(long l) { return new SingleArgFactoryMethodsBean(); }
        public static SingleArgFactoryMethodsBean fromDouble(double d) { return new SingleArgFactoryMethodsBean(); }
        public static SingleArgFactoryMethodsBean fromBoolean(boolean b) { return new SingleArgFactoryMethodsBean(); }

        @JsonCreator
        public static SingleArgFactoryMethodsBean createDelegating(SimpleBean b) { return new SingleArgFactoryMethodsBean(); }
    }

    static class ZeroArgCreatorMethodBean {
        @JsonCreator
        public static ZeroArgCreatorMethodBean create() {
            return new ZeroArgCreatorMethodBean();
        }
    }

    static class CreatorPropsBean {
        public String a;
        public int b;

        @JsonCreator
        public CreatorPropsBean(@JsonProperty("a") String a, @JsonProperty("b") int b) {
            this.a = a;
            this.b = b;
        }
    }

    static class InjectCreatorBean {
        public String a;
        public String b;

        @JsonCreator
        public InjectCreatorBean(@JacksonInject("id_a") String a, @JsonProperty("b") String b) {
            this.a = a;
            this.b = b;
        }
    }

    static class UnwrappedChild {
        public String field;
    }

    static class UnwrappedCreatorBean {
        public String name;
        public UnwrappedChild child;

        @JsonCreator
        public UnwrappedCreatorBean(@JsonProperty("name") String name, @JsonUnwrapped UnwrappedChild child) {
            this.name = name;
            this.child = child;
        }
    }

    static class FactoryCreatorPropsBean {
        @JsonCreator
        public static FactoryCreatorPropsBean create(@JsonProperty("x") String x, @JacksonInject("inj") String y) {
            return new FactoryCreatorPropsBean();
        }
    }

    static class MissingParamNameBean {
        @JsonCreator
        public MissingParamNameBean(String a, String b) {}
    }

    static class FactoryMissingParamNameBean {
        @JsonCreator
        public static FactoryMissingParamNameBean create(String a, String b) {
            return new FactoryMissingParamNameBean();
        }
    }

    class NonStaticInnerMissingParamName {
        @JsonCreator
        public NonStaticInnerMissingParamName(String a, String b) {}
    }

    interface AbstractParent {}
    static class ConcreteChild implements AbstractParent {}

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
    static class PolymorphicBase {}

    static class ContainerPropertyHolder {
        public List<String> list;
        public Map<String, Integer> map;
    }

    private ObjectMapper mapper;
    private DeserializationContext context;
    private DeserializationConfig config;
    private TestBasicDeserializerFactory factory;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        context = ((DefaultDeserializationContext) mapper.getDeserializationContext())
                .createInstance(mapper.getDeserializationConfig(), mapper.getFactory().createParser(new char[0]), null);
        config = mapper.getDeserializationConfig();
        factory = new TestBasicDeserializerFactory(new DeserializerFactoryConfig());
    }

    @Test
    public void testGetFactoryConfig_standard_returnsConfig() {
        DeserializerFactoryConfig cfg = factory.getFactoryConfig();
        Assert.assertNotNull(cfg);
    }

    @Test
    public void testFluentConfigMethods_modifiersAndResolvers_configuredInstancesReturned() {
        SimpleDeserializers desers = new SimpleDeserializers();
        SimpleKeyDeserializers keyDesers = new SimpleKeyDeserializers();
        BeanDeserializerModifier modifier = new BeanDeserializerModifier() {};
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        SimpleValueInstantiators valInsts = new SimpleValueInstantiators();

        DeserializerFactory f1 = factory.withAdditionalDeserializers(desers);
        DeserializerFactory f2 = factory.withAdditionalKeyDeserializers(keyDesers);
        DeserializerFactory f3 = factory.withDeserializerModifier(modifier);
        DeserializerFactory f4 = factory.withAbstractTypeResolver(resolver);
        DeserializerFactory f5 = factory.withValueInstantiators(valInsts);

        Assert.assertNotNull(f1);
        Assert.assertNotNull(f2);
        Assert.assertNotNull(f3);
        Assert.assertNotNull(f4);
        Assert.assertNotNull(f5);

        Assert.assertTrue(f1.getFactoryConfig().hasDeserializers());
        Assert.assertTrue(f2.getFactoryConfig().hasKeyDeserializers());
        Assert.assertTrue(f3.getFactoryConfig().hasDeserializerModifiers());
        Assert.assertTrue(f4.getFactoryConfig().hasAbstractTypeResolvers());
        Assert.assertTrue(f5.getFactoryConfig().hasValueInstantiators());
    }

    @Test
    public void testMapAbstractType_withoutResolver_returnsOriginalType() throws Exception {
        JavaType type = mapper.constructType(AbstractParent.class);
        JavaType mapped = factory.mapAbstractType(config, type);
        Assert.assertEquals(type, mapped);
    }

    @Test
    public void testMapAbstractType_withValidResolver_resolvesSubtype() throws Exception {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(AbstractParent.class, ConcreteChild.class);
        DeserializerFactory f = factory.withAbstractTypeResolver(resolver);

        JavaType type = mapper.constructType(AbstractParent.class);
        JavaType mapped = f.mapAbstractType(config, type);
        Assert.assertEquals(ConcreteChild.class, mapped.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapAbstractType_withInvalidSubtype_throwsException() throws Exception {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(AbstractParent.class, String.class);
        DeserializerFactory f = factory.withAbstractTypeResolver(resolver);

        JavaType type = mapper.constructType(AbstractParent.class);
        f.mapAbstractType(config, type);
    }

    @Test
    public void testFindValueInstantiator_annotatedCustomInstantiator_returnsCustom() throws Exception {
        BeanDescription beanDesc = config.introspect(mapper.constructType(AnnotatedInstantiatorBean.class));
        ValueInstantiator vi = factory.findValueInstantiator(context, beanDesc);
        Assert.assertNotNull(vi);
        Assert.assertTrue(vi instanceof CustomValueInstantiator);
    }

    @Test
    public void testFindValueInstantiator_jsonLocation_returnsLocationInstantiator() throws Exception {
        BeanDescription beanDesc = config.introspect(mapper.constructType(JsonLocation.class));
        ValueInstantiator vi = factory.findValueInstantiator(context, beanDesc);
        Assert.assertNotNull(vi);
        Assert.assertEquals("JsonLocation", vi.getValueTypeDesc());
    }

    @Test
    public void testFindValueInstantiator_simpleBeanAndModifier_instantiatesProperly() throws Exception {
        BeanDescription beanDesc = config.introspect(mapper.constructType(SimpleBean.class));
        ValueInstantiator vi = factory.findValueInstantiator(context, beanDesc);
        Assert.assertNotNull(vi);
        Assert.assertTrue(vi.canCreateUsingDefault());

        SimpleValueInstantiators valInsts = new SimpleValueInstantiators();
        final ValueInstantiator custom = new StdValueInstantiator(config, mapper.constructType(SimpleBean.class));
        valInsts.addValueInstantiator(SimpleBean.class, custom);
        DeserializerFactory f = factory.withValueInstantiators(valInsts);
        ValueInstantiator vi2 = f.findValueInstantiator(context, beanDesc);
        Assert.assertSame(custom, vi2);
    }

    @Test(expected = JsonMappingException.class)
    public void testFindValueInstantiator_brokenModifierReturningNull_throwsException() throws Exception {
        BeanDescription beanDesc = config.introspect(mapper.constructType(SimpleBean.class));
        ValueInstantiators broken = new ValueInstantiators.Base() {
            @Override
            public ValueInstantiator findValueInstantiator(DeserializationConfig config, BeanDescription beanDesc, ValueInstantiator defaultInstantiator) {
                return null;
            }
        };
        DeserializerFactory f = factory.withValueInstantiators(broken);
        f.findValueInstantiator(context, beanDesc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindValueInstantiator_missingParamName_throwsException() throws Exception {
        BeanDescription beanDesc = config.introspect(mapper.constructType(MissingParamNameBean.class));
        factory.findValueInstantiator(context, beanDesc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindValueInstantiator_factoryMissingParamName_throwsException() throws Exception {
        BeanDescription beanDesc = config.introspect(mapper.constructType(FactoryMissingParamNameBean.class));
        factory.findValueInstantiator(context, beanDesc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindValueInstantiator_nonStaticInnerClassCreator_throwsException() throws Exception {
        BeanDescription beanDesc = config.introspect(mapper.constructType(NonStaticInnerMissingParamName.class));
        factory.findValueInstantiator(context, beanDesc);
    }

    @Test
    public void testFindValueInstantiator_creatorsWithInjectionsAndUnwrapped() throws Exception {
        BeanDescription desc1 = config.introspect(mapper.constructType(CreatorPropsBean.class));
        ValueInstantiator vi1 = factory.findValueInstantiator(context, desc1);
        Assert.assertTrue(vi1.canCreateFromObjectWith());

        BeanDescription desc2 = config.introspect(mapper.constructType(InjectCreatorBean.class));
        ValueInstantiator vi2 = factory.findValueInstantiator(context, desc2);
        Assert.assertTrue(vi2.canCreateFromObjectWith());

        BeanDescription desc3 = config.introspect(mapper.constructType(UnwrappedCreatorBean.class));
        ValueInstantiator vi3 = factory.findValueInstantiator(context, desc3);
        Assert.assertTrue(vi3.canCreateFromObjectWith());

        BeanDescription desc4 = config.introspect(mapper.constructType(FactoryCreatorPropsBean.class));
        ValueInstantiator vi4 = factory.findValueInstantiator(context, desc4);
        Assert.assertTrue(vi4.canCreateFromObjectWith());

        BeanDescription desc5 = config.introspect(mapper.constructType(ZeroArgCreatorMethodBean.class));
        ValueInstantiator vi5 = factory.findValueInstantiator(context, desc5);
        Assert.assertTrue(vi5.canCreateUsingDefault());

        BeanDescription desc6 = config.introspect(mapper.constructType(SingleArgCtorsBean.class));
        ValueInstantiator vi6 = factory.findValueInstantiator(context, desc6);
        Assert.assertNotNull(vi6);

        BeanDescription desc7 = config.introspect(mapper.constructType(SingleArgDelegatingBean.class));
        ValueInstantiator vi7 = factory.findValueInstantiator(context, desc7);
        Assert.assertTrue(vi7.canCreateUsingDelegate());

        BeanDescription desc8 = config.introspect(mapper.constructType(SingleArgFactoryMethodsBean.class));
        ValueInstantiator vi8 = factory.findValueInstantiator(context, desc8);
        Assert.assertNotNull(vi8);
    }

    @Test
    public void test_valueInstantiatorInstance_variousInputs() throws Exception {
        AnnotatedClass ac = config.introspectClassAnnotations(SimpleBean.class).getClassInfo();

        Assert.assertNull(factory._valueInstantiatorInstance(config, ac, null));

        ValueInstantiator viInstance = new StdValueInstantiator(config, mapper.constructType(SimpleBean.class));
        Assert.assertSame(viInstance, factory._valueInstantiatorInstance(config, ac, viInstance));

        Assert.assertNull(factory._valueInstantiatorInstance(config, ac, Void.class));

        ValueInstantiator created = factory._valueInstantiatorInstance(config, ac, CustomValueInstantiator.class);
        Assert.assertTrue(created instanceof CustomValueInstantiator);

        ObjectMapper customMapper = new ObjectMapper();
        customMapper.setHandlerInstantiator(new HandlerInstantiator() {
            @Override
            public JsonDeserializer<?> deserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> deserClass) { return null; }
            @Override
            public KeyDeserializer keyDeserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> keyDeserClass) { return null; }
            @Override
            public JsonSerializer<?> serializerInstance(SerializationConfig config, Annotated annotated, Class<?> serClass) { return null; }
            @Override
            public TypeResolverBuilder<?> typeResolverBuilderInstance(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config, Annotated annotated, Class<?> builderClass) { return null; }
            @Override
            public com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolverInstance(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config, Annotated annotated, Class<?> resolverClass) { return null; }
            @Override
            public ValueInstantiator valueInstantiatorInstance(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config, Annotated annotated, Class<?> resolverClass) {
                return viInstance;
            }
        });
        DeserializationConfig cfgWithHI = customMapper.getDeserializationConfig();
        Assert.assertSame(viInstance, factory._valueInstantiatorInstance(cfgWithHI, ac, CustomValueInstantiator.class));
    }

    @Test(expected = IllegalStateException.class)
    public void test_valueInstantiatorInstance_invalidType_throwsException() throws Exception {
        AnnotatedClass ac = config.introspectClassAnnotations(SimpleBean.class).getClassInfo();
        factory._valueInstantiatorInstance(config, ac, 12345);
    }

    @Test(expected = IllegalStateException.class)
    public void test_valueInstantiatorInstance_classNotImplementingInterface_throwsException() throws Exception {
        AnnotatedClass ac = config.introspectClassAnnotations(SimpleBean.class).getClassInfo();
        factory._valueInstantiatorInstance(config, ac, String.class);
    }

    @Test
    public void testCreateArrayDeserializer_primitiveAndObjectArrays() throws Exception {
        ArrayType intArrayType = TypeFactory.defaultInstance().constructArrayType(int.class);
        BeanDescription beanDesc1 = config.introspectClassAnnotations(intArrayType);
        JsonDeserializer<?> deser1 = factory.createArrayDeserializer(context, intArrayType, beanDesc1);
        Assert.assertNotNull(deser1);

        ArrayType strArrayType = TypeFactory.defaultInstance().constructArrayType(String.class);
        BeanDescription beanDesc2 = config.introspectClassAnnotations(strArrayType);
        JsonDeserializer<?> deser2 = factory.createArrayDeserializer(context, strArrayType, beanDesc2);
        Assert.assertNotNull(deser2);

        ArrayType objArrayType = TypeFactory.defaultInstance().constructArrayType(SimpleBean.class);
        BeanDescription beanDesc3 = config.introspectClassAnnotations(objArrayType);
        JsonDeserializer<?> deser3 = factory.createArrayDeserializer(context, objArrayType, beanDesc3);
        Assert.assertNotNull(deser3);

        SimpleDeserializers customDesers = new SimpleDeserializers();
        final JsonDeserializer<?> customArrayDeser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(com.fasterxml.jackson.core.JsonParser p, DeserializationContext ctxt) { return null; }
        };
        customDesers.addDeserializer(SimpleBean[].class, customArrayDeser);
        DeserializerFactory f = factory.withAdditionalDeserializers(customDesers);
        JsonDeserializer<?> customResult = f.createArrayDeserializer(context, objArrayType, beanDesc3);
        Assert.assertSame(customArrayDeser, customResult);
    }

    @Test
    public void testCreateCollectionDeserializer_standardAndFallbacks() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();

        Class<?>[] collClasses = new Class<?>[] {
                Collection.class, List.class, ArrayList.class,
                Set.class, HashSet.class, SortedSet.class, TreeSet.class,
                Queue.class, LinkedList.class, Deque.class, NavigableSet.class,
                ArrayBlockingQueue.class
        };

        for (Class<?> cls : collClasses) {
            CollectionType ct = tf.constructCollectionType((Class<? extends Collection>) cls, String.class);
            BeanDescription beanDesc = config.introspect(ct);
            JsonDeserializer<?> deser = factory.createCollectionDeserializer(context, ct, beanDesc);
            Assert.assertNotNull("Should create deser for " + cls.getName(), deser);
        }

        CollectionType enumSetType = tf.constructCollectionType(EnumSet.class, TestEnum.class);
        BeanDescription enumSetDesc = config.introspect(enumSetType);
        JsonDeserializer<?> enumSetDeser = factory.createCollectionDeserializer(context, enumSetType, enumSetDesc);
        Assert.assertNotNull(enumSetDeser);

        CollectionType intListType = tf.constructCollectionType(List.class, Integer.class);
        BeanDescription intListDesc = config.introspect(intListType);
        JsonDeserializer<?> intListDeser = factory.createCollectionDeserializer(context, intListType, intListDesc);
        Assert.assertNotNull(intListDeser);
    }

    interface CustomCollectionInterface<E> extends Collection<E> {}

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCollectionDeserializer_unresolvableAbstractCollection_throwsException() throws Exception {
        CollectionType ct = TypeFactory.defaultInstance().constructCollectionType(CustomCollectionInterface.class, String.class);
        BeanDescription beanDesc = config.introspect(ct);
        factory.createCollectionDeserializer(context, ct, beanDesc);
    }

    @Test
    public void testCreateCollectionLikeDeserializer_customOrModifiers() throws Exception {
        CollectionLikeType clt = TypeFactory.defaultInstance().constructCollectionLikeType(SimpleBean.class, String.class);
        BeanDescription beanDesc = config.introspectClassAnnotations(clt);

        JsonDeserializer<?> deser = factory.createCollectionLikeDeserializer(context, clt, beanDesc);
        Assert.assertNull(deser);

        SimpleDeserializers customDesers = new SimpleDeserializers();
        final JsonDeserializer<?> custom = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(com.fasterxml.jackson.core.JsonParser p, DeserializationContext ctxt) { return null; }
        };
        customDesers.addDeserializer(SimpleBean.class, custom);
        DeserializerFactory f = factory.withAdditionalDeserializers(customDesers);
        JsonDeserializer<?> result = f.createCollectionLikeDeserializer(context, clt, beanDesc);
        Assert.assertSame(custom, result);
    }

    @Test
    public void testCreateMapDeserializer_standardAndFallbacks() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();

        Class<?>[] mapClasses = new Class<?>[] {
                Map.class, LinkedHashMap.class, HashMap.class,
                ConcurrentMap.class, ConcurrentHashMap.class,
                SortedMap.class, TreeMap.class, NavigableMap.class,
                ConcurrentNavigableMap.class, ConcurrentSkipListMap.class
        };

        for (Class<?> cls : mapClasses) {
            MapType mt = tf.constructMapType((Class<? extends Map>) cls, String.class, Object.class);
            BeanDescription beanDesc = config.introspect(mt);
            JsonDeserializer<?> deser = factory.createMapDeserializer(context, mt, beanDesc);
            Assert.assertNotNull("Should create deser for " + cls.getName(), deser);
        }

        MapType enumMapType = tf.constructMapType(EnumMap.class, TestEnum.class, String.class);
        BeanDescription enumMapDesc = config.introspect(enumMapType);
        JsonDeserializer<?> enumMapDeser = factory.createMapDeserializer(context, enumMapType, enumMapDesc);
        Assert.assertNotNull(enumMapDeser);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateMapDeserializer_enumMapWithInvalidKey_throwsException() throws Exception {
        MapType invalidEnumMapType = TypeFactory.defaultInstance().constructMapType(EnumMap.class, String.class, String.class);
        BeanDescription desc = config.introspect(invalidEnumMapType);
        factory.createMapDeserializer(context, invalidEnumMapType, desc);
    }

    interface CustomMapInterface<K, V> extends Map<K, V> {}

    @Test(expected = IllegalArgumentException.class)
    public void testCreateMapDeserializer_unresolvableAbstractMap_throwsException() throws Exception {
        MapType mt = TypeFactory.defaultInstance().constructMapType(CustomMapInterface.class, String.class, String.class);
        BeanDescription beanDesc = config.introspect(mt);
        factory.createMapDeserializer(context, mt, beanDesc);
    }

    @Test
    public void testCreateMapLikeDeserializer_customOrModifiers() throws Exception {
        MapLikeType mlt = TypeFactory.defaultInstance().constructMapLikeType(SimpleBean.class, String.class, Integer.class);
        BeanDescription beanDesc = config.introspectClassAnnotations(mlt);

        JsonDeserializer<?> deser = factory.createMapLikeDeserializer(context, mlt, beanDesc);
        Assert.assertNull(deser);

        SimpleDeserializers customDesers = new SimpleDeserializers();
        final JsonDeserializer<?> custom = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(com.fasterxml.jackson.core.JsonParser p, DeserializationContext ctxt) { return null; }
        };
        customDesers.addDeserializer(SimpleBean.class, custom);
        DeserializerFactory f = factory.withAdditionalDeserializers(customDesers);
        JsonDeserializer<?> result = f.createMapLikeDeserializer(context, mlt, beanDesc);
        Assert.assertSame(custom, result);
    }

    @Test
    public void testCreateEnumDeserializer_variousEnums() throws Exception {
        JavaType stdType = mapper.constructType(TestEnum.class);
        BeanDescription stdDesc = config.introspect(stdType);
        JsonDeserializer<?> deser1 = factory.createEnumDeserializer(context, stdType, stdDesc);
        Assert.assertNotNull(deser1);

        JavaType creatorType = mapper.constructType(EnumWithCreator.class);
        BeanDescription creatorDesc = config.introspect(creatorType);
        JsonDeserializer<?> deser2 = factory.createEnumDeserializer(context, creatorType, creatorDesc);
        Assert.assertNotNull(deser2);

        JavaType valType = mapper.constructType(EnumWithJsonValue.class);
        BeanDescription valDesc = config.introspect(valType);
        JsonDeserializer<?> deser3 = factory.createEnumDeserializer(context, valType, valDesc);
        Assert.assertNotNull(deser3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateEnumDeserializer_invalidCreator_throwsException() throws Exception {
        JavaType invalidType = mapper.constructType(EnumWithInvalidCreator.class);
        BeanDescription desc = config.introspect(invalidType);
        factory.createEnumDeserializer(context, invalidType, desc);
    }

    @Test
    public void testCreateTreeDeserializer_treeNodes() throws Exception {
        JavaType jsonNodeType = mapper.constructType(JsonNode.class);
        BeanDescription desc1 = config.introspectClassAnnotations(jsonNodeType);
        Assert.assertNotNull(factory.createTreeDeserializer(config, jsonNodeType, desc1));

        JavaType objNodeType = mapper.constructType(ObjectNode.class);
        BeanDescription desc2 = config.introspectClassAnnotations(objNodeType);
        Assert.assertNotNull(factory.createTreeDeserializer(config, objNodeType, desc2));

        JavaType arrNodeType = mapper.constructType(ArrayNode.class);
        BeanDescription desc3 = config.introspectClassAnnotations(arrNodeType);
        Assert.assertNotNull(factory.createTreeDeserializer(config, arrNodeType, desc3));
    }

    @Test
    public void testFindTypeDeserializer_polymorphicAndDefault() throws Exception {
        JavaType polyType = mapper.constructType(PolymorphicBase.class);
        TypeDeserializer td = factory.findTypeDeserializer(config, polyType);
        Assert.assertNotNull(td);

        JavaType nonPoly = mapper.constructType(SimpleBean.class);
        TypeDeserializer tdNull = factory.findTypeDeserializer(config, nonPoly);
        Assert.assertNull(tdNull);
    }

    @Test
    public void testCreateKeyDeserializer_enumAndStdTypes() throws Exception {
        JavaType enumType = mapper.constructType(TestEnum.class);
        KeyDeserializer kd1 = factory.createKeyDeserializer(context, enumType);
        Assert.assertNotNull(kd1);

        JavaType enumCreatorType = mapper.constructType(EnumWithCreator.class);
        KeyDeserializer kd2 = factory.createKeyDeserializer(context, enumCreatorType);
        Assert.assertNotNull(kd2);

        JavaType enumValType = mapper.constructType(EnumWithJsonValue.class);
        KeyDeserializer kd3 = factory.createKeyDeserializer(context, enumValType);
        Assert.assertNotNull(kd3);

        JavaType intType = mapper.constructType(int.class);
        KeyDeserializer kd4 = factory.createKeyDeserializer(context, intType);
        Assert.assertNotNull(kd4);

        JavaType strType = mapper.constructType(String.class);
        KeyDeserializer kd5 = factory.createKeyDeserializer(context, strType);
        Assert.assertNull(kd5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateKeyDeserializer_invalidEnumCreator_throwsException() throws Exception {
        JavaType invalidEnumType = mapper.constructType(EnumWithInvalidCreator.class);
        factory.createKeyDeserializer(context, invalidEnumType);
    }

    @Test
    public void testFindPropertyTypeDeserializerAndContentTypeDeserializer() throws Exception {
        JavaType holderType = mapper.constructType(ContainerPropertyHolder.class);
        BeanDescription beanDesc = config.introspect(holderType);

        AnnotatedMember listMember = null;
        for (AnnotatedField f : beanDesc.getClassInfo().fields()) {
            if ("list".equals(f.getName())) {
                listMember = f;
                break;
            }
        }
        Assert.assertNotNull(listMember);

        JavaType listType = mapper.constructType(ContainerPropertyHolder.class.getField("list").getGenericType());
        TypeDeserializer ptd = factory.findPropertyTypeDeserializer(config, listType, listMember);
        Assert.assertNull(ptd);

        TypeDeserializer pctd = factory.findPropertyContentTypeDeserializer(config, listType, listMember);
        Assert.assertNull(pctd);
    }

    @Test
    public void testFindDefaultDeserializer_variousJdkAndJacksonTypes() throws Exception {
        Class<?>[] testClasses = new Class<?>[] {
                Object.class, String.class, CharSequence.class,
                AtomicReference.class, Iterable.class, Map.Entry.class,
                int.class, Integer.class, long.class, Long.class,
                double.class, Double.class, boolean.class, Boolean.class,
                byte.class, Byte.class, short.class, Short.class, float.class, Float.class,
                Date.class, Calendar.class, File.class, URL.class, UUID.class,
                TokenBuffer.class
        };

        for (Class<?> cls : testClasses) {
            JavaType jt = mapper.constructType(cls);
            BeanDescription beanDesc = config.introspect(jt);
            JsonDeserializer<?> deser = factory.findDefaultDeserializer(context, jt, beanDesc);
            Assert.assertNotNull("findDefaultDeserializer should return deserializer for " + cls.getName(), deser);
        }

        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(List.class, ArrayList.class);
        resolver.addMapping(Map.class, LinkedHashMap.class);
        DeserializerFactory f = factory.withAbstractTypeResolver(resolver);
        JavaType objType = mapper.constructType(Object.class);
        BeanDescription objDesc = config.introspect(objType);
        JsonDeserializer<?> untypedDeser = f.findDefaultDeserializer(context, objType, objDesc);
        Assert.assertNotNull(untypedDeser);
    }
}
