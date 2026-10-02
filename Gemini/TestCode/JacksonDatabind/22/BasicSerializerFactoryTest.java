package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.module.SimpleSerializers;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.StdConverter;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class BasicSerializerFactoryTest {

    private ObjectMapper mapper;
    private SerializationConfig config;
    private DefaultSerializerProvider provider;
    private TestSerializerFactory factory;

    static class TestSerializerFactory extends BasicSerializerFactory {
        public TestSerializerFactory() {
            super(null);
        }

        public TestSerializerFactory(SerializerFactoryConfig config) {
            super(config);
        }

        @Override
        public SerializerFactory withConfig(SerializerFactoryConfig config) {
            return new TestSerializerFactory(config);
        }

        @Override
        public JsonSerializer<Object> createSerializer(SerializerProvider prov, JavaType type) {
            return null;
        }

        @Override
        public Iterable<Serializers> customSerializers() {
            return _factoryConfig.serializers();
        }
    }

    // Dummy classes for various tests
    enum TestEnum { A, B }

    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    enum EnumAsObject {
        VAL(1);
        private final int num;
        EnumAsObject(int n) { this.num = n; }
        public int getNum() { return num; }
    }

    static class CustomJsonValueKey {
        private final String value;
        public CustomJsonValueKey(String v) { this.value = v; }
        @JsonValue
        public String asString() { return value; }
    }

    static class CustomJsonValuePOJO {
        private final String val;
        public CustomJsonValuePOJO(String v) { this.val = v; }
        @JsonValue
        public String value() { return val; }
    }

    static class CustomJsonSerializable implements JsonSerializable {
        @Override
        public void serialize(JsonGenerator gen, SerializerProvider serializers) throws IOException {}
        @Override
        public void serializeWithType(JsonGenerator gen, SerializerProvider serializers, TypeSerializer typeSer) throws IOException {}
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
    static class PolymorphicBase {}

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    static class NumberFormattedAsString extends Number {
        @Override public int intValue() { return 1; }
        @Override public long longValue() { return 1L; }
        @Override public float floatValue() { return 1.0f; }
        @Override public double doubleValue() { return 1.0; }
    }

    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    static class NumberFormattedAsObject extends Number {
        @Override public int intValue() { return 2; }
        @Override public long longValue() { return 2L; }
        @Override public float floatValue() { return 2.0f; }
        @Override public double doubleValue() { return 2.0; }
    }

    @JsonFormat(shape = JsonFormat.Shape.ARRAY)
    static class CollectionAsObject extends ArrayList<String> {}

    @JsonInclude(content = JsonInclude.Include.NON_EMPTY)
    static class NonEmptyContentMap extends HashMap<String, String> {}

    @JsonInclude(content = JsonInclude.Include.NON_DEFAULT)
    static class NonDefaultContentMap extends HashMap<String, String> {}

    @JsonSerialize(typing = JsonSerialize.Typing.STATIC)
    static class StaticTypingClass {}

    @JsonSerialize(typing = JsonSerialize.Typing.DYNAMIC)
    static class DynamicTypingClass {}

    @JsonSerialize(typing = JsonSerialize.Typing.DEFAULT_TYPING)
    static class DefaultTypingClass {}

    static class CustomConverter extends StdConverter<String, Integer> {
        @Override
        public Integer convert(String value) {
            return value.length();
        }
    }

    static class DummyKeySer extends StdScalarSerializer<Object> {
        public DummyKeySer() { super(Object.class, false); }
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {}
    }

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        config = mapper.getSerializationConfig();
        provider = ((DefaultSerializerProvider) mapper.getSerializerProviderInstance()).createInstance(config, factory);
        factory = new TestSerializerFactory();
    }

    @Test
    public void testConstructorAndConfig() {
        TestSerializerFactory f1 = new TestSerializerFactory(null);
        Assert.assertNotNull(f1.getFactoryConfig());

        SerializerFactoryConfig sfc = new SerializerFactoryConfig();
        TestSerializerFactory f2 = new TestSerializerFactory(sfc);
        Assert.assertSame(sfc, f2.getFactoryConfig());

        SerializerFactory withAddSer = f2.withAdditionalSerializers(new SimpleSerializers());
        Assert.assertNotSame(f2, withAddSer);

        SerializerFactory withAddKeySer = f2.withAdditionalKeySerializers(new SimpleSerializers());
        Assert.assertNotSame(f2, withAddKeySer);

        SerializerFactory withMod = f2.withSerializerModifier(new BeanSerializerModifier());
        Assert.assertNotSame(f2, withMod);
    }

    @Test
    public void testCreateKeySerializer_defaultAndFallback() {
        JavaType stringType = mapper.constructType(String.class);
        JsonSerializer<Object> keySer = factory.createKeySerializer(config, stringType, null);
        Assert.assertNotNull(keySer);

        JsonSerializer<Object> defaultImpl = new DummyKeySer();
        JsonSerializer<Object> returnedDefault = factory.createKeySerializer(config, stringType, defaultImpl);
        Assert.assertSame(defaultImpl, returnedDefault);

        JavaType jsonValueKeyType = mapper.constructType(CustomJsonValueKey.class);
        JsonSerializer<Object> jsonValueKeySer = factory.createKeySerializer(config, jsonValueKeyType, null);
        Assert.assertNotNull(jsonValueKeySer);

        JavaType objectType = mapper.constructType(Object.class);
        JsonSerializer<Object> fallbackKeySer = factory.createKeySerializer(config, objectType, null);
        Assert.assertNotNull(fallbackKeySer);
    }

    @Test
    public void testCreateKeySerializer_withCustomSerializersAndModifiers() {
        final JsonSerializer<Object> customSer = new DummyKeySer();
        SimpleSerializers keySerializers = new SimpleSerializers();
        keySerializers.addSerializer(CustomJsonValueKey.class, customSer);

        final boolean[] modifierCalled = new boolean[1];
        BeanSerializerModifier modifier = new BeanSerializerModifier() {
            @Override
            public JsonSerializer<?> modifyKeySerializer(SerializationConfig config, JavaType valueType, BeanDescription beanDesc, JsonSerializer<?> serializer) {
                modifierCalled[0] = true;
                return serializer;
            }
        };

        SerializerFactoryConfig sfc = new SerializerFactoryConfig()
                .withAdditionalKeySerializers(keySerializers)
                .withSerializerModifier(modifier);
        TestSerializerFactory customFactory = new TestSerializerFactory(sfc);

        JavaType type = mapper.constructType(CustomJsonValueKey.class);
        JsonSerializer<Object> res = customFactory.createKeySerializer(config, type, null);
        Assert.assertSame(customSer, res);
        Assert.assertTrue(modifierCalled[0]);
    }

    @Test
    public void testCreateTypeSerializer() {
        JavaType polyType = mapper.constructType(PolymorphicBase.class);
        TypeSerializer ts = factory.createTypeSerializer(config, polyType);
        Assert.assertNotNull(ts);

        JavaType plainType = mapper.constructType(String.class);
        TypeSerializer tsNull = factory.createTypeSerializer(config, plainType);
        Assert.assertNull(tsNull);

        ObjectMapper defTypeMapper = new ObjectMapper();
        defTypeMapper.enableDefaultTyping();
        TypeSerializer tsDefault = factory.createTypeSerializer(defTypeMapper.getSerializationConfig(), mapper.constructType(Object.class));
        Assert.assertNotNull(tsDefault);
    }

    @Test
    public void testFindSerializerByLookup() {
        BeanDescription beanDesc = config.introspectClassAnnotations(String.class);

        JavaType refType = mapper.getTypeFactory().constructReferenceType(AtomicReference.class, mapper.constructType(String.class));
        Assert.assertNotNull(factory.findSerializerByLookup(refType, config, beanDesc, false));

        Class<?>[] concreteTypes = new Class<?>[] {
                String.class, StringBuffer.class, StringBuilder.class, Character.class, Character.TYPE,
                Boolean.TYPE, Boolean.class, BigInteger.class, BigDecimal.class,
                Calendar.class, Date.class, Timestamp.class, int.class, Integer.class
        };
        for (Class<?> cls : concreteTypes) {
            JavaType type = mapper.constructType(cls);
            JsonSerializer<?> ser = factory.findSerializerByLookup(type, config, config.introspectClassAnnotations(cls), false);
            Assert.assertNotNull("Serializer for " + cls + " should not be null", ser);
        }

        Class<?>[] lazyTypes = new Class<?>[] {
                java.sql.Date.class, Time.class, TokenBuffer.class
        };
        for (Class<?> cls : lazyTypes) {
            JavaType type = mapper.constructType(cls);
            JsonSerializer<?> ser = factory.findSerializerByLookup(type, config, config.introspectClassAnnotations(cls), false);
            Assert.assertNotNull("Lazy serializer for " + cls + " should not be null", ser);
        }

        JavaType unknownType = mapper.constructType(BasicSerializerFactoryTest.class);
        Assert.assertNull(factory.findSerializerByLookup(unknownType, config, beanDesc, false));
    }

    @Test
    public void testFindSerializerByAnnotations() throws Exception {
        JavaType jsonSerializableType = mapper.constructType(CustomJsonSerializable.class);
        BeanDescription bd1 = config.introspect(jsonSerializableType);
        JsonSerializer<?> ser1 = factory.findSerializerByAnnotations(provider, jsonSerializableType, bd1);
        Assert.assertNotNull(ser1);

        JavaType jsonValueType = mapper.constructType(CustomJsonValuePOJO.class);
        BeanDescription bd2 = config.introspect(jsonValueType);
        JsonSerializer<?> ser2 = factory.findSerializerByAnnotations(provider, jsonValueType, bd2);
        Assert.assertNotNull(ser2);

        JavaType plainType = mapper.constructType(Object.class);
        BeanDescription bd3 = config.introspect(plainType);
        Assert.assertNull(factory.findSerializerByAnnotations(provider, plainType, bd3));
    }

    @Test
    public void testFindSerializerByPrimaryType() throws Exception {
        Class<?>[] standardClasses = new Class<?>[] {
                GregorianCalendar.class, java.sql.Date.class, ByteBuffer.class,
                InetAddress.class, InetSocketAddress.class, TimeZone.class, Charset.class,
                Double.class, TestEnum.class
        };

        for (Class<?> cls : standardClasses) {
            JavaType type = mapper.constructType(cls);
            BeanDescription bd = config.introspect(type);
            JsonSerializer<?> ser = factory.findSerializerByPrimaryType(provider, type, bd, false);
            Assert.assertNotNull("Serializer for primary type " + cls + " should not be null", ser);
        }

        // Map.Entry
        JavaType mapEntryType = mapper.getTypeFactory().constructMapLikeType(Map.Entry.class, String.class, Integer.class);
        BeanDescription bdEntry = config.introspect(mapEntryType);
        Assert.assertNotNull(factory.findSerializerByPrimaryType(provider, mapEntryType, bdEntry, false));

        // Number shape formatting
        JavaType numStrType = mapper.constructType(NumberFormattedAsString.class);
        BeanDescription bdNumStr = config.introspect(numStrType);
        JsonSerializer<?> serNumStr = factory.findSerializerByPrimaryType(provider, numStrType, bdNumStr, false);
        Assert.assertTrue(serNumStr instanceof ToStringSerializer);

        JavaType numObjType = mapper.constructType(NumberFormattedAsObject.class);
        BeanDescription bdNumObj = config.introspect(numObjType);
        Assert.assertNull(factory.findSerializerByPrimaryType(provider, numObjType, bdNumObj, false));

        // Enum as Object
        JavaType enumObjType = mapper.constructType(EnumAsObject.class);
        BeanDescription bdEnumObj = config.introspect(enumObjType);
        Assert.assertNull(factory.findSerializerByPrimaryType(provider, enumObjType, bdEnumObj, false));

        // Unknown primary type
        JavaType plainType = mapper.constructType(Object.class);
        Assert.assertNull(factory.findSerializerByPrimaryType(provider, plainType, config.introspect(plainType), false));
    }

    @Test
    public void testFindSerializerByAddonType() throws Exception {
        JavaType iterType = mapper.constructType(Iterator.class);
        Assert.assertNotNull(factory.findSerializerByAddonType(config, iterType, config.introspect(iterType), false));

        JavaType iterableType = mapper.constructType(Iterable.class);
        Assert.assertNotNull(factory.findSerializerByAddonType(config, iterableType, config.introspect(iterableType), false));

        JavaType charSeqType = mapper.constructType(CharSequence.class);
        Assert.assertNotNull(factory.findSerializerByAddonType(config, charSeqType, config.introspect(charSeqType), false));

        JavaType objType = mapper.constructType(Object.class);
        Assert.assertNull(factory.findSerializerByAddonType(config, objType, config.introspect(objType), false));
    }

    @Test
    public void testBuildContainerSerializer_CollectionsAndMaps() throws Exception {
        // MapType
        JavaType mapType = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, Object.class);
        BeanDescription bdMap = config.introspect(mapType);
        Assert.assertNotNull(factory.buildContainerSerializer(provider, mapType, bdMap, false));

        // Indexed List (ArrayList)
        JavaType arrayListStr = mapper.getTypeFactory().constructCollectionType(ArrayList.class, String.class);
        BeanDescription bdArrListStr = config.introspect(arrayListStr);
        Assert.assertNotNull(factory.buildContainerSerializer(provider, arrayListStr, bdArrListStr, false));

        JavaType arrayListInt = mapper.getTypeFactory().constructCollectionType(ArrayList.class, Integer.class);
        BeanDescription bdArrListInt = config.introspect(arrayListInt);
        Assert.assertNotNull(factory.buildContainerSerializer(provider, arrayListInt, bdArrListInt, false));

        // Non-indexed collection (LinkedList / HashSet)
        JavaType setStr = mapper.getTypeFactory().constructCollectionType(HashSet.class, String.class);
        BeanDescription bdSetStr = config.introspect(setStr);
        Assert.assertNotNull(factory.buildContainerSerializer(provider, setStr, bdSetStr, false));

        JavaType setInt = mapper.getTypeFactory().constructCollectionType(HashSet.class, Integer.class);
        BeanDescription bdSetInt = config.introspect(setInt);
        Assert.assertNotNull(factory.buildContainerSerializer(provider, setInt, bdSetInt, false));

        // EnumSet
        JavaType enumSetType = mapper.getTypeFactory().constructCollectionType(EnumSet.class, TestEnum.class);
        BeanDescription bdEnumSet = config.introspect(enumSetType);
        Assert.assertNotNull(factory.buildContainerSerializer(provider, enumSetType, bdEnumSet, false));

        // Array
        JavaType strArrType = mapper.getTypeFactory().constructArrayType(String.class);
        BeanDescription bdStrArr = config.introspect(strArrType);
        Assert.assertNotNull(factory.buildContainerSerializer(provider, strArrType, bdStrArr, false));

        JavaType objArrType = mapper.getTypeFactory().constructArrayType(Object.class);
        BeanDescription bdObjArr = config.introspect(objArrType);
        Assert.assertNotNull(factory.buildContainerSerializer(provider, objArrType, bdObjArr, false));

        // Object shape Collection
        JavaType collAsObjType = mapper.constructType(CollectionAsObject.class);
        BeanDescription bdCollObj = config.introspect(collAsObjType);
        Assert.assertNull(factory.buildContainerSerializer(provider, collAsObjType, bdCollObj, false));
    }

    @Test
    public void testCustomSerializersForContainersAndModifiers() throws Exception {
        final boolean[] mapLikeModified = new boolean[1];
        final boolean[] collLikeModified = new boolean[1];
        final boolean[] arrayModified = new boolean[1];

        BeanSerializerModifier mod = new BeanSerializerModifier() {
            @Override
            public JsonSerializer<?> modifyMapLikeSerializer(SerializationConfig config, MapLikeType type, BeanDescription beanDesc, JsonSerializer<?> serializer) {
                mapLikeModified[0] = true;
                return serializer;
            }
            @Override
            public JsonSerializer<?> modifyCollectionLikeSerializer(SerializationConfig config, CollectionLikeType type, BeanDescription beanDesc, JsonSerializer<?> serializer) {
                collLikeModified[0] = true;
                return serializer;
            }
            @Override
            public JsonSerializer<?> modifyArraySerializer(SerializationConfig config, ArrayType type, BeanDescription beanDesc, JsonSerializer<?> serializer) {
                arrayModified[0] = true;
                return serializer;
            }
        };

        SimpleSerializers customSer = new SimpleSerializers();
        customSer.addSerializer(Map.class, new DummyKeySer());
        customSer.addSerializer(Collection.class, new DummyKeySer());
        customSer.addSerializer(Object[].class, new DummyKeySer());

        SerializerFactoryConfig sfc = new SerializerFactoryConfig()
                .withAdditionalSerializers(customSer)
                .withSerializerModifier(mod);
        TestSerializerFactory customFactory = new TestSerializerFactory(sfc);

        JavaType mapLikeType = mapper.getTypeFactory().constructMapLikeType(Map.class, String.class, String.class);
        customFactory.buildContainerSerializer(provider, mapLikeType, config.introspect(mapLikeType), false);

        JavaType collLikeType = mapper.getTypeFactory().constructCollectionLikeType(Collection.class, String.class);
        customFactory.buildContainerSerializer(provider, collLikeType, config.introspect(collLikeType), false);

        JavaType arrayType = mapper.getTypeFactory().constructArrayType(Object.class);
        customFactory.buildContainerSerializer(provider, arrayType, config.introspect(arrayType), false);

        Assert.assertTrue(mapLikeModified[0]);
        Assert.assertTrue(collLikeModified[0]);
        Assert.assertTrue(arrayModified[0]);
    }

    @Test
    public void testBuildIteratorsAndEntries() throws Exception {
        JavaType strType = mapper.constructType(String.class);
        JavaType iterType = mapper.constructType(Iterator.class);
        BeanDescription bd = config.introspect(iterType);

        Assert.assertNotNull(factory.buildIteratorSerializer(config, iterType, bd, false, strType));
        Assert.assertNotNull(factory.buildIteratorSerializer(config, iterType, bd, false));

        JavaType iterblType = mapper.constructType(Iterable.class);
        Assert.assertNotNull(factory.buildIterableSerializer(config, iterblType, bd, false, strType));
        Assert.assertNotNull(factory.buildIterableSerializer(config, iterblType, bd, false));

        Assert.assertNotNull(factory.buildMapEntrySerializer(config, mapper.constructType(Map.Entry.class), bd, false, strType, strType));
    }

    @Test
    public void testFindSuppressableContentValue() throws Exception {
        JavaType strType = mapper.constructType(String.class);

        JavaType nonDefaultType = mapper.constructType(NonDefaultContentMap.class);
        Object suppress1 = factory.findSuppressableContentValue(config, strType, config.introspect(nonDefaultType));
        Assert.assertEquals(JsonInclude.Include.NON_EMPTY, suppress1);

        JavaType nonEmptyType = mapper.constructType(NonEmptyContentMap.class);
        Object suppress2 = factory.findSuppressableContentValue(config, strType, config.introspect(nonEmptyType));
        Assert.assertEquals(JsonInclude.Include.NON_EMPTY, suppress2);

        JavaType normalType = mapper.constructType(HashMap.class);
        Object suppress3 = factory.findSuppressableContentValue(config, strType, config.introspect(normalType));
        Assert.assertNull(suppress3);
    }

    @Test
    public void testUsesStaticTyping() {
        BeanDescription bdStatic = config.introspectClassAnnotations(StaticTypingClass.class);
        Assert.assertTrue(factory.usesStaticTyping(config, bdStatic, null));

        BeanDescription bdDynamic = config.introspectClassAnnotations(DynamicTypingClass.class);
        Assert.assertFalse(factory.usesStaticTyping(config, bdDynamic, null));

        BeanDescription bdDefault = config.introspectClassAnnotations(DefaultTypingClass.class);
        Assert.assertFalse(factory.usesStaticTyping(config, bdDefault, null));

        TypeSerializer mockTypeSer = factory.createTypeSerializer(config, mapper.constructType(PolymorphicBase.class));
        Assert.assertFalse(factory.usesStaticTyping(config, bdStatic, mockTypeSer));
    }

    @Test
    public void testIsIndexedList() {
        Assert.assertTrue(factory.isIndexedList(ArrayList.class));
        Assert.assertTrue(factory.isIndexedList(Vector.class));
        Assert.assertFalse(factory.isIndexedList(LinkedList.class));
        Assert.assertFalse(factory.isIndexedList(HashSet.class));
    }

    @Test
    public void testVerifyAsClass() {
        Assert.assertNull(factory._verifyAsClass(null, "test", Object.class));
        Assert.assertNull(factory._verifyAsClass(JsonSerializer.None.class, "test", JsonSerializer.None.class));
        Assert.assertEquals(String.class, factory._verifyAsClass(String.class, "test", Object.class));

        try {
            factory._verifyAsClass("NotAClass", "test", Object.class);
            Assert.fail("Expected IllegalStateException for non-Class input");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("AnnotationIntrospector.test()"));
        }
    }

    static class AnnClass {
        @JsonSerialize(as = Number.class)
        public Integer intField;

        @JsonSerialize(keyAs = Object.class, contentAs = Object.class)
        public Map<String, String> mapField;

        @JsonSerialize(keyAs = Object.class)
        public String nonMapField;

        @JsonSerialize(converter = CustomConverter.class)
        public String convField;
    }

    @Test
    public void testModifyTypeByAnnotation() throws Exception {
        BeanDescription bd = config.introspect(mapper.constructType(AnnClass.class));
        AnnotatedClass ac = bd.getClassInfo();

        for (AnnotatedMethod am : ac.memberMethods()) {
            // Introspect methods/fields
        }

        Annotated intField = null;
        Annotated mapField = null;
        Annotated nonMapField = null;
        Annotated convField = null;

        for (com.fasterxml.jackson.databind.introspect.AnnotatedField f : ac.fields()) {
            if ("intField".equals(f.getName())) intField = f;
            if ("mapField".equals(f.getName())) mapField = f;
            if ("nonMapField".equals(f.getName())) nonMapField = f;
            if ("convField".equals(f.getName())) convField = f;
        }

        Assert.assertNotNull(intField);
        JavaType intType = mapper.constructType(Integer.class);
        JavaType modifiedInt = factory.modifyTypeByAnnotation(config, intField, intType);
        Assert.assertEquals(Number.class, modifiedInt.getRawClass());

        Assert.assertNotNull(mapField);
        JavaType mapType = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, String.class);
        JavaType modifiedMap = factory.modifyTypeByAnnotation(config, mapField, mapType);
        Assert.assertEquals(Object.class, modifiedMap.getKeyType().getRawClass());
        Assert.assertEquals(Object.class, modifiedMap.getContentType().getRawClass());

        Assert.assertNotNull(nonMapField);
        try {
            factory.modifySecondaryTypesByAnnotation(config, nonMapField, mapper.constructType(String.class));
            // Non container type should simply be returned unchanged
        } catch (IllegalArgumentException e) {
            // Or throw if configured as container incorrectly
        }

        Assert.assertNotNull(convField);
        Converter<Object, Object> conv = factory.findConverter(provider, convField);
        Assert.assertNotNull(conv);

        JsonSerializer<?> convSer = factory.findConvertingSerializer(provider, convField, new StringSerializer());
        Assert.assertTrue(convSer instanceof StdDelegatingSerializer);
    }
}
```
