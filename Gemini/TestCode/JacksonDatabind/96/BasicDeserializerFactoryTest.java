package com.fasterxml.jackson.databind.deser;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
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

public class BasicDeserializerFactoryTest {

    private ObjectMapper _mapper;
    private DeserializationContext _ctxt;
    private DeserializationConfig _config;
    private BasicDeserializerFactory _factory;

    // Concrete dummy implementation of abstract BasicDeserializerFactory for isolated testing
    static class TestBasicDeserializerFactory extends BasicDeserializerFactory implements Serializable {
        private static final long serialVersionUID = 1L;

        public TestBasicDeserializerFactory(DeserializerFactoryConfig config) {
            super(config);
        }

        @Override
        protected DeserializerFactory withConfig(DeserializerFactoryConfig config) {
            return new TestBasicDeserializerFactory(config);
        }
    }

    // Test helper classes
    enum TestEnum {
        ALPHA, BETA
    }

    enum CreatorEnum {
        A, B;
        @JsonCreator
        public static CreatorEnum fromString(String val) {
            return "A".equals(val) ? A : B;
        }
    }

    enum CreatorEnumNoArgs {
        A, B;
        @JsonCreator
        public static CreatorEnumNoArgs createDefault() {
            return A;
        }
    }

    enum InvalidCreatorEnum {
        A;
        @JsonCreator
        public static InvalidCreatorEnum fromInt(int val) {
            return A;
        }
    }

    enum JsonValueEnum {
        VAL1, VAL2;
        @JsonValue
        public String toValue() {
            return name().toLowerCase();
        }
    }

    static class SimplePOJO {
        public String name;
        public int age;

        public SimplePOJO() {}

        public SimplePOJO(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    static class SingleStringCreator {
        String value;
        @JsonCreator public SingleStringCreator(String v) { this.value = v; }
    }

    static class SingleCharSequenceCreator {
        CharSequence value;
        @JsonCreator public SingleCharSequenceCreator(CharSequence v) { this.value = v; }
    }

    static class SingleIntCreator {
        int value;
        @JsonCreator public SingleIntCreator(int v) { this.value = v; }
    }

    static class SingleLongCreator {
        long value;
        @JsonCreator public SingleLongCreator(long v) { this.value = v; }
    }

    static class SingleDoubleCreator {
        double value;
        @JsonCreator public SingleDoubleCreator(double v) { this.value = v; }
    }

    static class SingleBooleanCreator {
        boolean value;
        @JsonCreator public SingleBooleanCreator(boolean v) { this.value = v; }
    }

    static class DelegatingCreatorPOJO {
        SimplePOJO value;
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public DelegatingCreatorPOJO(SimplePOJO v) { this.value = v; }
    }

    static class MultiArgDelegatingCreatorPOJO {
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public MultiArgDelegatingCreatorPOJO(String a, String b) {}
    }

    static class NoArgDelegatingCreatorPOJO {
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public NoArgDelegatingCreatorPOJO(@JacksonInject String a) {}
    }

    static class PropsCreatorPOJO {
        String x;
        int y;
        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        public PropsCreatorPOJO(@JsonProperty("x") String x, @JsonProperty("y") int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class UnwrappedInCreatorPOJO {
        @JsonCreator
        public UnwrappedInCreatorPOJO(@JsonUnwrapped SimplePOJO pojo) {}
    }

    static class FactoryCreatorPOJO {
        String name;
        private FactoryCreatorPOJO(String name) { this.name = name; }

        @JsonCreator
        public static FactoryCreatorPOJO create(@JsonProperty("name") String name) {
            return new FactoryCreatorPOJO(name);
        }
    }

    static class FactoryNoArgsPOJO {
        @JsonCreator
        public static FactoryNoArgsPOJO make() {
            return new FactoryNoArgsPOJO();
        }
    }

    static class FactoryDelegatingPOJO {
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public static FactoryDelegatingPOJO create(SimplePOJO pojo) {
            return new FactoryDelegatingPOJO();
        }
    }

    static class DisabledCreatorPOJO {
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        public DisabledCreatorPOJO(String s) {}
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
    static class PolymorphicBase {}

    static class PolymorphicImpl extends PolymorphicBase {}

    interface UnmappedInterface {}

    @Before
    public void setUp() {
        _mapper = new ObjectMapper();
        _config = _mapper.getDeserializationConfig();
        _ctxt = _mapper.getDeserializationContext();
        if (_ctxt instanceof DefaultDeserializationContext) {
            _ctxt = ((DefaultDeserializationContext) _ctxt).createInstance(_config, _mapper.createParser("{}"), null);
        }
        _factory = BeanDeserializerFactory.instance;
    }

    @Test
    public void testFactoryConfigAndFluentWithMethods_validConfig_returnsNewInstances() {
        BasicDeserializerFactory factory = new TestBasicDeserializerFactory(new DeserializerFactoryConfig());
        Assert.assertNotNull(factory.getFactoryConfig());

        DeserializerFactory f1 = factory.withAdditionalDeserializers(new SimpleDeserializers());
        Assert.assertNotSame(factory, f1);

        DeserializerFactory f2 = factory.withAdditionalKeyDeserializers(new SimpleKeyDeserializers());
        Assert.assertNotSame(factory, f2);

        DeserializerFactory f3 = factory.withDeserializerModifier(new BeanDeserializerModifier() {});
        Assert.assertNotSame(factory, f3);

        DeserializerFactory f4 = factory.withAbstractTypeResolver(new SimpleAbstractTypeResolver());
        Assert.assertNotSame(factory, f4);

        DeserializerFactory f5 = factory.withValueInstantiators(new SimpleValueInstantiators());
        Assert.assertNotSame(factory, f5);
    }

    @Test
    public void testMapAbstractType_registeredResolver_resolvesSubtype() throws Exception {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(CharSequence.class, String.class);
        DeserializerFactory factory = _factory.withAbstractTypeResolver(resolver);

        JavaType input = _mapper.constructType(CharSequence.class);
        JavaType resolved = factory.mapAbstractType(_config, input);

        Assert.assertEquals(String.class, resolved.getRawClass());
    }

    @Test
    public void testMapAbstractType_noMapping_returnsSameType() throws Exception {
        JavaType input = _mapper.constructType(CharSequence.class);
        JavaType resolved = _factory.mapAbstractType(_config, input);
        Assert.assertSame(input, resolved);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapAbstractType_invalidMapping_throwsException() throws Exception {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(CharSequence.class, Integer.class); // Integer does not implement CharSequence
        DeserializerFactory factory = _factory.withAbstractTypeResolver(resolver);

        JavaType input = _mapper.constructType(CharSequence.class);
        factory.mapAbstractType(_config, input);
    }

    @Test
    public void testFindValueInstantiator_stdTypes_returnsInstantiator() throws Exception {
        BeanDescription descLocation = _config.introspectClassAnnotations(JsonLocation.class);
        ValueInstantiator viLoc = _factory.findValueInstantiator(_ctxt, descLocation);
        Assert.assertNotNull(viLoc);

        BeanDescription descEmptySet = _config.introspectClassAnnotations(Collections.EMPTY_SET.getClass());
        ValueInstantiator viSet = _factory.findValueInstantiator(_ctxt, descEmptySet);
        Assert.assertNotNull(viSet);
        Assert.assertTrue(viSet.canCreateUsingDefault());

        BeanDescription descEmptyList = _config.introspectClassAnnotations(Collections.EMPTY_LIST.getClass());
        ValueInstantiator viList = _factory.findValueInstantiator(_ctxt, descEmptyList);
        Assert.assertNotNull(viList);
        Assert.assertTrue(viList.canCreateUsingDefault());

        BeanDescription descEmptyMap = _config.introspectClassAnnotations(Collections.EMPTY_MAP.getClass());
        ValueInstantiator viMap = _factory.findValueInstantiator(_ctxt, descEmptyMap);
        Assert.assertNotNull(viMap);
        Assert.assertTrue(viMap.canCreateUsingDefault());
    }

    @Test
    public void testFindValueInstantiator_withCustomModifier_invokesModifier() throws Exception {
        final boolean[] called = new boolean[1];
        ValueInstantiators custom = new ValueInstantiators.Base() {
            @Override
            public ValueInstantiator findValueInstantiator(DeserializationConfig config, BeanDescription beanDesc, ValueInstantiator defaultInstantiator) {
                called[0] = true;
                return defaultInstantiator;
            }
        };
        DeserializerFactory f = _factory.withValueInstantiators(custom);
        BeanDescription desc = _config.introspect(_mapper.constructType(SimplePOJO.class));
        ValueInstantiator vi = f.findValueInstantiator(_ctxt, desc);

        Assert.assertTrue(called[0]);
        Assert.assertNotNull(vi);
    }

    @Test(expected = JsonMappingException.class)
    public void testFindValueInstantiator_customModifierReturnsNull_throwsException() throws Exception {
        ValueInstantiators broken = new ValueInstantiators.Base() {
            @Override
            public ValueInstantiator findValueInstantiator(DeserializationConfig config, BeanDescription beanDesc, ValueInstantiator defaultInstantiator) {
                return null;
            }
        };
        DeserializerFactory f = _factory.withValueInstantiators(broken);
        BeanDescription desc = _config.introspect(_mapper.constructType(SimplePOJO.class));
        f.findValueInstantiator(_ctxt, desc);
    }

    @Test
    public void testValueInstantiatorInstance_variousInputs_expectedBehavior() throws Exception {
        AnnotatedClass ac = AnnotatedClassResolver.resolveWithoutSuperTypes(_config, SimplePOJO.class);
        ValueInstantiator direct = new StdValueInstantiator(_config, SimplePOJO.class);

        Assert.assertNull(_factory._valueInstantiatorInstance(_config, ac, null));
        Assert.assertSame(direct, _factory._valueInstantiatorInstance(_config, ac, direct));
        Assert.assertNull(_factory._valueInstantiatorInstance(_config, ac, com.fasterxml.jackson.databind.annotation.NoClass.class));

        ValueInstantiator created = _factory._valueInstantiatorInstance(_config, ac, StdValueInstantiator.class);
        Assert.assertNotNull(created);
    }

    @Test(expected = IllegalStateException.class)
    public void testValueInstantiatorInstance_nonClassNonInstantiator_throwsException() throws Exception {
        AnnotatedClass ac = AnnotatedClassResolver.resolveWithoutSuperTypes(_config, SimplePOJO.class);
        _factory._valueInstantiatorInstance(_config, ac, "invalid-def");
    }

    @Test(expected = IllegalStateException.class)
    public void testValueInstantiatorInstance_wrongClassType_throwsException() throws Exception {
        AnnotatedClass ac = AnnotatedClassResolver.resolveWithoutSuperTypes(_config, SimplePOJO.class);
        _factory._valueInstantiatorInstance(_config, ac, String.class);
    }

    @Test
    public void testValueInstantiatorInstance_withHandlerInstantiator_returnsInstance() throws Exception {
        final ValueInstantiator mockInst = new StdValueInstantiator(_config, SimplePOJO.class);
        HandlerInstantiator hi = new HandlerInstantiator() {
            @Override
            public JsonDeserializer<?> deserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> deserClass) { return null; }
            @Override
            public KeyDeserializer keyDeserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> keyDeserClass) { return null; }
            @Override
            public TypeResolverBuilder<?> typeResolverBuilderInstance(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config, Annotated annotated, Class<?> builderClass) { return null; }
            @Override
            public com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolverInstance(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config, Annotated annotated, Class<?> resolverClass) { return null; }
            @Override
            public ValueInstantiator valueInstantiatorInstance(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config, Annotated annotated, Class<?> resolverClass) {
                return mockInst;
            }
        };

        DeserializationConfig cfg = _config.with(hi);
        AnnotatedClass ac = AnnotatedClassResolver.resolveWithoutSuperTypes(cfg, SimplePOJO.class);
        ValueInstantiator result = _factory._valueInstantiatorInstance(cfg, ac, StdValueInstantiator.class);
        Assert.assertSame(mockInst, result);
    }

    @Test
    public void testCreateArrayDeserializer_primitivesAndObjects_returnsDeserializers() throws Exception {
        ArrayType intArrType = _mapper.getTypeFactory().constructArrayType(int.class);
        BeanDescription bdInt = _config.introspect(intArrType);
        JsonDeserializer<?> deserInt = _factory.createArrayDeserializer(_ctxt, intArrType, bdInt);
        Assert.assertNotNull(deserInt);

        ArrayType strArrType = _mapper.getTypeFactory().constructArrayType(String.class);
        BeanDescription bdStr = _config.introspect(strArrType);
        JsonDeserializer<?> deserStr = _factory.createArrayDeserializer(_ctxt, strArrType, bdStr);
        Assert.assertNotNull(deserStr);

        ArrayType objArrType = _mapper.getTypeFactory().constructArrayType(SimplePOJO.class);
        BeanDescription bdObj = _config.introspect(objArrType);
        JsonDeserializer<?> deserObj = _factory.createArrayDeserializer(_ctxt, objArrType, bdObj);
        Assert.assertNotNull(deserObj);
    }

    @Test
    public void testCreateArrayDeserializer_withModifier_modifiesDeserializer() throws Exception {
        final boolean[] modified = new boolean[1];
        BeanDeserializerModifier mod = new BeanDeserializerModifier() {
            @Override
            public JsonDeserializer<?> modifyArrayDeserializer(DeserializationConfig config, ArrayType valueType, BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                modified[0] = true;
                return deserializer;
            }
        };
        DeserializerFactory f = _factory.withDeserializerModifier(mod);
        ArrayType arrType = _mapper.getTypeFactory().constructArrayType(String.class);
        f.createArrayDeserializer(_ctxt, arrType, _config.introspect(arrType));
        Assert.assertTrue(modified[0]);
    }

    @Test
    public void testCreateCollectionDeserializer_allFallbacks_constructsProperly() throws Exception {
        TypeFactory tf = _mapper.getTypeFactory();
        Class<?>[] collClasses = new Class<?>[] {
                Collection.class, List.class, Set.class, SortedSet.class,
                Queue.class, Deque.class, NavigableSet.class, ArrayList.class,
                HashSet.class, LinkedList.class, TreeSet.class
        };

        for (Class<?> cls : collClasses) {
            CollectionType ct = tf.constructCollectionType((Class<? extends Collection>) cls, String.class);
            BeanDescription bd = _config.introspect(ct);
            JsonDeserializer<?> deser = _factory.createCollectionDeserializer(_ctxt, ct, bd);
            Assert.assertNotNull("Should construct deser for " + cls.getName(), deser);
        }

        // EnumSet special handling
        CollectionType enumSetType = tf.constructCollectionType(EnumSet.class, TestEnum.class);
        JsonDeserializer<?> enumSetDeser = _factory.createCollectionDeserializer(_ctxt, enumSetType, _config.introspect(enumSetType));
        Assert.assertNotNull(enumSetDeser);

        // ArrayBlockingQueue special handling
        CollectionType abqType = tf.constructCollectionType(ArrayBlockingQueue.class, Integer.class);
        JsonDeserializer<?> abqDeser = _factory.createCollectionDeserializer(_ctxt, abqType, _config.introspect(abqType));
        Assert.assertNotNull(abqDeser);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCollectionDeserializer_unhandledAbstractCollection_throwsException() throws Exception {
        TypeFactory tf = _mapper.getTypeFactory();
        CollectionType ct = CollectionType.construct(UnmappedInterface.class, null, null, null, tf.constructType(String.class));
        _factory.createCollectionDeserializer(_ctxt, ct, _config.introspect(ct));
    }

    @Test
    public void testCreateCollectionLikeDeserializer_customOrModifier() throws Exception {
        TypeFactory tf = _mapper.getTypeFactory();
        CollectionLikeType clt = tf.constructCollectionLikeType(SimplePOJO.class, String.class);
        BeanDescription bd = _config.introspect(clt);

        final boolean[] modified = new boolean[1];
        SimpleDeserializers desers = new SimpleDeserializers();
        desers.addDeserializer(SimplePOJO.class, new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) { return null; }
        });
        BeanDeserializerModifier mod = new BeanDeserializerModifier() {
            @Override
            public JsonDeserializer<?> modifyCollectionLikeDeserializer(DeserializationConfig config, CollectionLikeType type, BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                modified[0] = true;
                return deserializer;
            }
        };

        DeserializerFactory f = _factory.withAdditionalDeserializers(desers).withDeserializerModifier(mod);
        JsonDeserializer<?> deser = f.createCollectionLikeDeserializer(_ctxt, clt, bd);
        Assert.assertNotNull(deser);
        Assert.assertTrue(modified[0]);
    }

    @Test
    public void testCreateMapDeserializer_fallbacksAndEnumMap() throws Exception {
        TypeFactory tf = _mapper.getTypeFactory();
        Class<?>[] mapClasses = new Class<?>[] {
                Map.class, ConcurrentMap.class, SortedMap.class,
                NavigableMap.class, ConcurrentNavigableMap.class,
                HashMap.class, TreeMap.class, LinkedHashMap.class, ConcurrentHashMap.class
        };

        for (Class<?> cls : mapClasses) {
            MapType mt = tf.constructMapType((Class<? extends Map>) cls, String.class, Object.class);
            BeanDescription bd = _config.introspect(mt);
            JsonDeserializer<?> deser = _factory.createMapDeserializer(_ctxt, mt, bd);
            Assert.assertNotNull("Should construct deser for " + cls.getName(), deser);
        }

        // EnumMap
        MapType emt = tf.constructMapType(EnumMap.class, TestEnum.class, String.class);
        JsonDeserializer<?> emDeser = _factory.createMapDeserializer(_ctxt, emt, _config.introspect(emt));
        Assert.assertNotNull(emDeser);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateMapDeserializer_enumMapWithNonEnumKey_throwsException() throws Exception {
        TypeFactory tf = _mapper.getTypeFactory();
        MapType emt = tf.constructMapType(EnumMap.class, String.class, String.class);
        _factory.createMapDeserializer(_ctxt, emt, _config.introspect(emt));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateMapDeserializer_unhandledAbstractMap_throwsException() throws Exception {
        TypeFactory tf = _mapper.getTypeFactory();
        MapType mt = MapType.construct(UnmappedInterface.class, null, null, null, tf.constructType(String.class), tf.constructType(String.class));
        _factory.createMapDeserializer(_ctxt, mt, _config.introspect(mt));
    }

    @Test
    public void testCreateMapLikeDeserializer_customOrModifier() throws Exception {
        TypeFactory tf = _mapper.getTypeFactory();
        MapLikeType mlt = tf.constructMapLikeType(SimplePOJO.class, String.class, Integer.class);
        BeanDescription bd = _config.introspect(mlt);

        final boolean[] modified = new boolean[1];
        SimpleDeserializers desers = new SimpleDeserializers();
        desers.addDeserializer(SimplePOJO.class, new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) { return null; }
        });
        BeanDeserializerModifier mod = new BeanDeserializerModifier() {
            @Override
            public JsonDeserializer<?> modifyMapLikeDeserializer(DeserializationConfig config, MapLikeType type, BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                modified[0] = true;
                return deserializer;
            }
        };

        DeserializerFactory f = _factory.withAdditionalDeserializers(desers).withDeserializerModifier(mod);
        JsonDeserializer<?> deser = f.createMapLikeDeserializer(_ctxt, mlt, bd);
        Assert.assertNotNull(deser);
        Assert.assertTrue(modified[0]);
    }

    @Test
    public void testCreateEnumDeserializer_variousEnums() throws Exception {
        // Plain enum
        JavaType plainType = _mapper.constructType(TestEnum.class);
        JsonDeserializer<?> plainDeser = _factory.createEnumDeserializer(_ctxt, plainType, _config.introspect(plainType));
        Assert.assertNotNull(plainDeser);

        // Creator factory enum
        JavaType creatorType = _mapper.constructType(CreatorEnum.class);
        JsonDeserializer<?> creatorDeser = _factory.createEnumDeserializer(_ctxt, creatorType, _config.introspect(creatorType));
        Assert.assertNotNull(creatorDeser);

        // Creator no-args enum
        JavaType noArgsType = _mapper.constructType(CreatorEnumNoArgs.class);
        JsonDeserializer<?> noArgsDeser = _factory.createEnumDeserializer(_ctxt, noArgsType, _config.introspect(noArgsType));
        Assert.assertNotNull(noArgsDeser);

        // JsonValue enum
        JavaType jsonValType = _mapper.constructType(JsonValueEnum.class);
        JsonDeserializer<?> jsonValDeser = _factory.createEnumDeserializer(_ctxt, jsonValType, _config.introspect(jsonValType));
        Assert.assertNotNull(jsonValDeser);
    }

    @Test
    public void testCreateTreeDeserializer_validNodeTypes() throws Exception {
        JavaType nodeType = _mapper.constructType(JsonNode.class);
        JsonDeserializer<?> deserNode = _factory.createTreeDeserializer(_config, nodeType, _config.introspect(nodeType));
        Assert.assertNotNull(deserNode);

        JavaType objNodeType = _mapper.constructType(ObjectNode.class);
        JsonDeserializer<?> deserObjNode = _factory.createTreeDeserializer(_config, objNodeType, _config.introspect(objNodeType));
        Assert.assertNotNull(deserObjNode);

        JavaType arrNodeType = _mapper.constructType(ArrayNode.class);
        JsonDeserializer<?> deserArrNode = _factory.createTreeDeserializer(_config, arrNodeType, _config.introspect(arrNodeType));
        Assert.assertNotNull(deserArrNode);
    }

    @Test
    public void testCreateReferenceDeserializer_atomicReference() throws Exception {
        JavaType refType = _mapper.getTypeFactory().constructReferenceType(AtomicReference.class, _mapper.constructType(String.class));
        JsonDeserializer<?> deser = _factory.createReferenceDeserializer(_ctxt, (ReferenceType) refType, _config.introspect(refType));
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindTypeDeserializer_polymorphicTypes() throws Exception {
        JavaType polyType = _mapper.constructType(PolymorphicBase.class);
        TypeDeserializer td = _factory.findTypeDeserializer(_config, polyType);
        Assert.assertNotNull(td);

        JavaType plainType = _mapper.constructType(SimplePOJO.class);
        TypeDeserializer tdPlain = _factory.findTypeDeserializer(_config, plainType);
        Assert.assertNull(tdPlain);
    }

    @Test
    public void testCreateKeyDeserializer_enumAndStringBased() throws Exception {
        // Plain Enum Key
        KeyDeserializer kdEnum = _factory.createKeyDeserializer(_ctxt, _mapper.constructType(TestEnum.class));
        Assert.assertNotNull(kdEnum);

        // Creator Enum Key
        KeyDeserializer kdCreatorEnum = _factory.createKeyDeserializer(_ctxt, _mapper.constructType(CreatorEnum.class));
        Assert.assertNotNull(kdCreatorEnum);

        // JsonValue Enum Key
        KeyDeserializer kdJsonValEnum = _factory.createKeyDeserializer(_ctxt, _mapper.constructType(JsonValueEnum.class));
        Assert.assertNotNull(kdJsonValEnum);

        // String Key
        KeyDeserializer kdString = _factory.createKeyDeserializer(_ctxt, _mapper.constructType(String.class));
        Assert.assertNull(kdString); // Null represents standard/default string key handling

        // Custom Key
        KeyDeserializer kdInt = _factory.createKeyDeserializer(_ctxt, _mapper.constructType(Integer.class));
        Assert.assertNotNull(kdInt);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateKeyDeserializer_invalidEnumCreatorParam_throwsException() throws Exception {
        _factory.createKeyDeserializer(_ctxt, _mapper.constructType(InvalidCreatorEnum.class));
    }

    @Test
    public void testFindDefaultDeserializer_allKnownJdkTypes() throws Exception {
        Class<?>[] standardTypes = new Class<?>[] {
                Object.class, String.class, CharSequence.class, Iterable.class, Map.Entry.class,
                int.class, Integer.class, long.class, Long.class, double.class, Double.class,
                boolean.class, Boolean.class, byte.class, Byte.class, short.class, Short.class,
                float.class, Float.class, char.class, Character.class,
                BigInteger.class, BigDecimal.class,
                Date.class, Calendar.class,
                TokenBuffer.class,
                URL.class, URI.class, UUID.class, Pattern.class, Locale.class,
                StackTraceElement.class, Currency.class
        };

        for (Class<?> cls : standardTypes) {
            JavaType type = _mapper.constructType(cls);
            BeanDescription bd = _config.introspect(type);
            JsonDeserializer<?> deser = _factory.findDefaultDeserializer(_ctxt, type, bd);
            Assert.assertNotNull("Default deser should exist for " + cls.getName(), deser);
        }
    }

    @Test
    public void testFindDefaultDeserializer_objectWithAbstractResolvers() throws Exception {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(List.class, ArrayList.class);
        resolver.addMapping(Map.class, HashMap.class);
        DeserializerFactory f = _factory.withAbstractTypeResolver(resolver);

        JavaType type = _mapper.constructType(Object.class);
        BeanDescription bd = _config.introspect(type);
        JsonDeserializer<?> deser = f.findDefaultDeserializer(_ctxt, type, bd);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testCreatorIntrospections_singleArgCreators() throws Exception {
        Class<?>[] singleArgClasses = new Class<?>[] {
                SingleStringCreator.class,
                SingleCharSequenceCreator.class,
                SingleIntCreator.class,
                SingleLongCreator.class,
                SingleDoubleCreator.class,
                SingleBooleanCreator.class,
                DelegatingCreatorPOJO.class
        };

        for (Class<?> cls : singleArgClasses) {
            BeanDescription bd = _config.introspect(_mapper.constructType(cls));
            ValueInstantiator vi = _factory.findValueInstantiator(_ctxt, bd);
            Assert.assertNotNull("ValueInstantiator should be constructed for " + cls.getSimpleName(), vi);
        }
    }

    @Test
    public void testCreatorIntrospections_propertiesAndFactoryCreators() throws Exception {
        Class<?>[] creatorClasses = new Class<?>[] {
                PropsCreatorPOJO.class,
                FactoryCreatorPOJO.class,
                FactoryNoArgsPOJO.class,
                FactoryDelegatingPOJO.class,
                DisabledCreatorPOJO.class
        };

        for (Class<?> cls : creatorClasses) {
            BeanDescription bd = _config.introspect(_mapper.constructType(cls));
            ValueInstantiator vi = _factory.findValueInstantiator(_ctxt, bd);
            Assert.assertNotNull("ValueInstantiator should be constructed for " + cls.getSimpleName(), vi);
        }
    }

    @Test(expected = JsonMappingException.class)
    public void testCreatorIntrospections_unwrappedParam_throwsException() throws Exception {
        BeanDescription bd = _config.introspect(_mapper.constructType(UnwrappedInCreatorPOJO.class));
        _factory.findValueInstantiator(_ctxt, bd);
    }

    @Test(expected = JsonMappingException.class)
    public void testCreatorIntrospections_multipleDelegatingArgs_throwsException() throws Exception {
        BeanDescription bd = _config.introspect(_mapper.constructType(MultiArgDelegatingCreatorPOJO.class));
        _factory.findValueInstantiator(_ctxt, bd);
    }

    @Test(expected = JsonMappingException.class)
    public void testCreatorIntrospections_noDelegatingArg_throwsException() throws Exception {
        BeanDescription bd = _config.introspect(_mapper.constructType(NoArgDelegatingCreatorPOJO.class));
        _factory.findValueInstantiator(_ctxt, bd);
    }

    @Test
    public void testMemberAndTypeAnnotationsResolution_memberHandlers() throws Exception {
        JavaType mapType = _mapper.getTypeFactory().constructMapType(HashMap.class, String.class, String.class);
        AnnotatedClass ac = AnnotatedClassResolver.resolveWithoutSuperTypes(_config, SimplePOJO.class);
        AnnotatedConstructor ctor = ac.getDefaultConstructor();

        JavaType resolved = _factory.resolveMemberAndTypeAnnotations(_ctxt, ctor, mapType);
        Assert.assertNotNull(resolved);
        Assert.assertEquals(HashMap.class, resolved.getRawClass());
    }

    @Test
    public void testDeprecatedMethodsCoverage() throws Exception {
        AnnotatedClass ac = AnnotatedClassResolver.resolveWithoutSuperTypes(_config, SimplePOJO.class);
        AnnotatedConstructor ctor = ac.getDefaultConstructor();
        JavaType strType = _mapper.constructType(String.class);
        BeanDescription bd = _config.introspect(strType);

        @SuppressWarnings("deprecation")
        JavaType mod1 = _factory.modifyTypeByAnnotation(_ctxt, ctor, strType);
        Assert.assertEquals(strType, mod1);

        @SuppressWarnings("deprecation")
        JavaType mod2 = _factory.resolveType(_ctxt, bd, strType, ctor);
        Assert.assertEquals(strType, mod2);

        @SuppressWarnings("deprecation")
        AnnotatedMethod jvMethod = _factory._findJsonValueFor(_config, _mapper.constructType(JsonValueEnum.class));
        Assert.assertNotNull(jvMethod);

        @SuppressWarnings("deprecation")
        AnnotatedMethod jvNull = _factory._findJsonValueFor(_config, null);
        Assert.assertNull(jvNull);
    }

    @Test
    public void testPropertyTypeDeserializers() throws Exception {
        AnnotatedClass ac = AnnotatedClassResolver.resolveWithoutSuperTypes(_config, SimplePOJO.class);
        AnnotatedConstructor ctor = ac.getDefaultConstructor();

        JavaType plainType = _mapper.constructType(SimplePOJO.class);
        TypeDeserializer propTypeDeser = _factory.findPropertyTypeDeserializer(_config, plainType, ctor);
        Assert.assertNull(propTypeDeser);

        JavaType listType = _mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        TypeDeserializer contentPropTypeDeser = _factory.findPropertyContentTypeDeserializer(_config, listType, ctor);
        Assert.assertNull(contentPropTypeDeser);
    }

    @Test
    public void testConstructEnumResolver_withAndWithoutJsonValue() {
        EnumResolver resPlain = _factory.constructEnumResolver(TestEnum.class, _config, null);
        Assert.assertNotNull(resPlain);
        Assert.assertEquals(TestEnum.class, resPlain.getEnumClass());

        BeanDescription bdJsonVal = _config.introspect(_mapper.constructType(JsonValueEnum.class));
        AnnotatedMember jsonValAccessor = bdJsonVal.findJsonValueAccessor();
        EnumResolver resJsonVal = _factory.constructEnumResolver(JsonValueEnum.class, _config, jsonValAccessor);
        Assert.assertNotNull(resJsonVal);
        Assert.assertEquals(JsonValueEnum.class, resJsonVal.getEnumClass());
    }
}
