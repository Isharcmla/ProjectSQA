package com.fasterxml.jackson.databind.deser;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.module.SimpleDeserializers;
import com.fasterxml.jackson.databind.module.SimpleKeyDeserializers;
import com.fasterxml.jackson.databind.module.SimpleValueInstantiators;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.TokenBuffer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BasicDeserializerFactoryTest {

    private ObjectMapper _mapper;
    private DeserializationContext _context;
    private BasicDeserializerFactory _factory;
    private TypeFactory _typeFactory;

    // Concrete subclass to test protected methods directly if needed
    static class TestDeserializerFactory extends BasicDeserializerFactory {
        private static final long serialVersionUID = 1L;

        public TestDeserializerFactory(DeserializerFactoryConfig config) {
            super(config);
        }

        @Override
        protected DeserializerFactory withConfig(DeserializerFactoryConfig config) {
            return new TestDeserializerFactory(config);
        }

        @Override
        public JsonDeserializer<Object> createBeanDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) {
            return null;
        }

        @Override
        public JsonDeserializer<Object> createBuilderBasedDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc, Class<?> builderClass) {
            return null;
        }
    }

    // Test classes
    enum SimpleEnum {
        A, B, C;
    }

    enum EnumWithCreator {
        VAL_A, VAL_B;

        @JsonCreator
        public static EnumWithCreator fromString(String val) {
            if ("a".equalsIgnoreCase(val)) return VAL_A;
            if ("b".equalsIgnoreCase(val)) return VAL_B;
            return null;
        }
    }

    enum EnumWithNoArgCreator {
        DEFAULT;

        @JsonCreator
        public static EnumWithNoArgCreator noArg() {
            return DEFAULT;
        }
    }

    enum EnumWithInvalidCreator {
        ONE;

        @JsonCreator
        public static EnumWithInvalidCreator invalid(int x) {
            return ONE;
        }
    }

    enum EnumWithJsonValue {
        RED(1), GREEN(2);

        private final int code;

        EnumWithJsonValue(int code) {
            this.code = code;
        }

        @JsonValue
        public int getCode() {
            return code;
        }
    }

    static class SimpleBean {
        public String name;
        public int age;
    }

    static class SingleArgConstructors {
        public SingleArgConstructors(String s) {}
        public SingleArgConstructors(int i) {}
        public SingleArgConstructors(long l) {}
        public SingleArgConstructors(double d) {}
        public SingleArgConstructors(boolean b) {}
    }

    static class SingleArgFactories {
        public static SingleArgFactories from(String s) { return new SingleArgFactories(); }
        public static SingleArgFactories from(int i) { return new SingleArgFactories(); }
        public static SingleArgFactories from(long l) { return new SingleArgFactories(); }
        public static SingleArgFactories from(double d) { return new SingleArgFactories(); }
        public static SingleArgFactories from(boolean b) { return new SingleArgFactories(); }
    }

    static class MultiArgConstructorBean {
        private final String first;
        private final int second;

        @JsonCreator
        public MultiArgConstructorBean(@JsonProperty("first") String first, @JsonProperty("second") int second) {
            this.first = first;
            this.second = second;
        }
    }

    static class MultiArgFactoryMethodBean {
        private final String first;
        private final int second;

        private MultiArgFactoryMethodBean(String f, int s) {
            this.first = f;
            this.second = s;
        }

        @JsonCreator
        public static MultiArgFactoryMethodBean create(@JsonProperty("first") String first, @JsonProperty("second") int second) {
            return new MultiArgFactoryMethodBean(first, second);
        }
    }

    static class MultiArgConstructorMissingAnnotationBean {
        @JsonCreator
        public MultiArgConstructorMissingAnnotationBean(String a, int b) {}
    }

    static class MultiArgFactoryMissingAnnotationBean {
        @JsonCreator
        public static MultiArgFactoryMissingAnnotationBean make(String a, int b) {
            return new MultiArgFactoryMissingAnnotationBean();
        }
    }

    static class NonStaticInnerClass {
        public class Inner {
            @JsonCreator
            public Inner(String x, int y) {}
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

    @JsonDeserialize(using = CustomStringDeser.class)
    static class CustomDeserClass {}

    static class CustomStringDeser extends StdDeserializer<CustomDeserClass> {
        public CustomStringDeser() { super(CustomDeserClass.class); }
        @Override
        public CustomDeserClass deserialize(JsonParser p, DeserializationContext ctxt) { return new CustomDeserClass(); }
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY)
    static abstract class AbstractTypeWithJsonTypeInfo {}

    interface AbstractCustomType {}
    static class ConcreteCustomType implements AbstractCustomType {}
    static class NonRelatedType {}

    @Before
    public void setUp() {
        _mapper = new ObjectMapper();
        _factory = (BasicDeserializerFactory) _mapper.getDeserializationContext().getFactory();
        _context = _mapper.getDeserializationContext();
        _typeFactory = _mapper.getTypeFactory();
    }

    @Test
    public void testGetFactoryConfig_notNull() {
        DeserializerFactoryConfig config = _factory.getFactoryConfig();
        Assert.assertNotNull(config);
    }

    @Test
    public void testWithFluentMethods_returnNewInstances() {
        Deserializers desers = new SimpleDeserializers();
        DeserializerFactory f1 = _factory.withAdditionalDeserializers(desers);
        Assert.assertNotSame(_factory, f1);
        Assert.assertTrue(f1.getFactoryConfig().hasDeserializers());

        KeyDeserializers keyDesers = new SimpleKeyDeserializers();
        DeserializerFactory f2 = _factory.withAdditionalKeyDeserializers(keyDesers);
        Assert.assertNotSame(_factory, f2);
        Assert.assertTrue(f2.getFactoryConfig().hasKeyDeserializers());

        BeanDeserializerModifier modifier = new BeanDeserializerModifier() {};
        DeserializerFactory f3 = _factory.withDeserializerModifier(modifier);
        Assert.assertNotSame(_factory, f3);
        Assert.assertTrue(f3.getFactoryConfig().hasDeserializerModifiers());

        AbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        DeserializerFactory f4 = _factory.withAbstractTypeResolver(resolver);
        Assert.assertNotSame(_factory, f4);
        Assert.assertTrue(f4.getFactoryConfig().hasAbstractTypeResolvers());

        ValueInstantiators vi = new SimpleValueInstantiators();
        DeserializerFactory f5 = _factory.withValueInstantiators(vi);
        Assert.assertNotSame(_factory, f5);
        Assert.assertTrue(f5.getFactoryConfig().hasValueInstantiators());
    }

    @Test
    public void testMapAbstractType_noMapping() throws Exception {
        JavaType type = _typeFactory.constructType(AbstractCustomType.class);
        JavaType mapped = _factory.mapAbstractType(_mapper.getDeserializationConfig(), type);
        Assert.assertEquals(type, mapped);
    }

    @Test
    public void testMapAbstractType_withMapping() throws Exception {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(AbstractCustomType.class, ConcreteCustomType.class);
        DeserializerFactory factory = _factory.withAbstractTypeResolver(resolver);

        JavaType type = _typeFactory.constructType(AbstractCustomType.class);
        JavaType mapped = factory.mapAbstractType(_mapper.getDeserializationConfig(), type);
        Assert.assertEquals(ConcreteCustomType.class, mapped.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapAbstractType_invalidMappingThrowsException() throws Exception {
        AbstractTypeResolver resolver = new AbstractTypeResolver() {
            @Override
            public JavaType findTypeMapping(DeserializationConfig config, JavaType type) {
                if (type.getRawClass() == AbstractCustomType.class) {
                    return _typeFactory.constructType(NonRelatedType.class);
                }
                return null;
            }
        };
        DeserializerFactory factory = _factory.withAbstractTypeResolver(resolver);
        JavaType type = _typeFactory.constructType(AbstractCustomType.class);
        factory.mapAbstractType(_mapper.getDeserializationConfig(), type);
    }

    @Test
    public void testFindValueInstantiator_jsonLocation() throws Exception {
        JavaType type = _typeFactory.constructType(JsonLocation.class);
        BeanDescription beanDesc = _mapper.getDeserializationConfig().introspect(type);
        ValueInstantiator vi = _factory.findValueInstantiator(_context, beanDesc);
        Assert.assertNotNull(vi);
        Assert.assertEquals("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator", vi.getClass().getName());
    }

    @Test
    public void testFindValueInstantiator_annotatedWithJsonValueInstantiator() throws Exception {
        JavaType type = _typeFactory.constructType(AnnotatedInstantiatorBean.class);
        BeanDescription beanDesc = _mapper.getDeserializationConfig().introspect(type);
        ValueInstantiator vi = _factory.findValueInstantiator(_context, beanDesc);
        Assert.assertNotNull(vi);
        Assert.assertTrue(vi instanceof CustomValueInstantiator);
    }

    @Test(expected = JsonMappingException.class)
    public void testFindValueInstantiator_brokenValueInstantiatorReturnsNull() throws Exception {
        ValueInstantiators brokenVI = new ValueInstantiators.Base() {
            @Override
            public ValueInstantiator findValueInstantiator(DeserializationConfig config, BeanDescription beanDesc, ValueInstantiator defaultInstantiator) {
                return null;
            }
        };
        DeserializerFactory factory = _factory.withValueInstantiators(brokenVI);
        JavaType type = _typeFactory.constructType(SimpleBean.class);
        BeanDescription beanDesc = _mapper.getDeserializationConfig().introspect(type);
        factory.findValueInstantiator(_context, beanDesc);
    }

    @Test
    public void testFindValueInstantiator_constructorWithProperties() throws Exception {
        JavaType type = _typeFactory.constructType(MultiArgConstructorBean.class);
        BeanDescription beanDesc = _mapper.getDeserializationConfig().introspect(type);
        ValueInstantiator vi = _factory.findValueInstantiator(_context, beanDesc);
        Assert.assertNotNull(vi);
        Assert.assertTrue(vi.canCreateFromObjectWith());
    }

    @Test
    public void testFindValueInstantiator_factoryMethodWithProperties() throws Exception {
        JavaType type = _typeFactory.constructType(MultiArgFactoryMethodBean.class);
        BeanDescription beanDesc = _mapper.getDeserializationConfig().introspect(type);
        ValueInstantiator vi = _factory.findValueInstantiator(_context, beanDesc);
        Assert.assertNotNull(vi);
        Assert.assertTrue(vi.canCreateFromObjectWith());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindValueInstantiator_missingParamNameConstructorThrowsException() throws Exception {
        JavaType type = _typeFactory.constructType(MultiArgConstructorMissingAnnotationBean.class);
        BeanDescription beanDesc = _mapper.getDeserializationConfig().introspect(type);
        _factory.findValueInstantiator(_context, beanDesc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindValueInstantiator_missingParamNameFactoryThrowsException() throws Exception {
        JavaType type = _typeFactory.constructType(MultiArgFactoryMissingAnnotationBean.class);
        BeanDescription beanDesc = _mapper.getDeserializationConfig().introspect(type);
        _factory.findValueInstantiator(_context, beanDesc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindValueInstantiator_nonStaticInnerClassThrowsException() throws Exception {
        JavaType type = _typeFactory.constructType(NonStaticInnerClass.Inner.class);
        BeanDescription beanDesc = _mapper.getDeserializationConfig().introspect(type);
        _factory.findValueInstantiator(_context, beanDesc);
    }

    @Test
    public void testValueInstantiatorInstance_edgeCases() throws Exception {
        TestDeserializerFactory tf = new TestDeserializerFactory(new DeserializerFactoryConfig());
        DeserializationConfig config = _mapper.getDeserializationConfig();

        Assert.assertNull(tf._valueInstantiatorInstance(config, null, null));
        CustomValueInstantiator vi = new CustomValueInstantiator();
        Assert.assertSame(vi, tf._valueInstantiatorInstance(config, null, vi));
        Assert.assertNull(tf._valueInstantiatorInstance(config, null, Object.class)); // ClassUtil.isBogusClass(Object.class) == true
    }

    @Test(expected = IllegalStateException.class)
    public void testValueInstantiatorInstance_invalidTypeThrows() throws Exception {
        TestDeserializerFactory tf = new TestDeserializerFactory(new DeserializerFactoryConfig());
        tf._valueInstantiatorInstance(_mapper.getDeserializationConfig(), null, "InvalidStringInstance");
    }

    @Test(expected = IllegalStateException.class)
    public void testValueInstantiatorInstance_nonAssignableClassThrows() throws Exception {
        TestDeserializerFactory tf = new TestDeserializerFactory(new DeserializerFactoryConfig());
        tf._valueInstantiatorInstance(_mapper.getDeserializationConfig(), null, String.class);
    }

    @Test
    public void testCreateArrayDeserializer_primitivesAndObjects() throws Exception {
        // int[]
        ArrayType intArrType = _typeFactory.constructArrayType(int.class);
        BeanDescription beanDesc1 = _mapper.getDeserializationConfig().introspect(intArrType);
        JsonDeserializer<?> deser1 = _factory.createArrayDeserializer(_context, intArrType, beanDesc1);
        Assert.assertNotNull(deser1);

        // String[]
        ArrayType strArrType = _typeFactory.constructArrayType(String.class);
        BeanDescription beanDesc2 = _mapper.getDeserializationConfig().introspect(strArrType);
        JsonDeserializer<?> deser2 = _factory.createArrayDeserializer(_context, strArrType, beanDesc2);
        Assert.assertNotNull(deser2);

        // Object[]
        ArrayType objArrType = _typeFactory.constructArrayType(Object.class);
        BeanDescription beanDesc3 = _mapper.getDeserializationConfig().introspect(objArrType);
        JsonDeserializer<?> deser3 = _factory.createArrayDeserializer(_context, objArrType, beanDesc3);
        Assert.assertNotNull(deser3);
    }

    @Test
    public void testCreateArrayDeserializer_withModifier() throws Exception {
        final boolean[] modified = new boolean[1];
        BeanDeserializerModifier mod = new BeanDeserializerModifier() {
            @Override
            public JsonDeserializer<?> modifyArrayDeserializer(DeserializationConfig config, ArrayType valueType, BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                modified[0] = true;
                return deserializer;
            }
        };
        DeserializerFactory factory = _factory.withDeserializerModifier(mod);
        ArrayType strArrType = _typeFactory.constructArrayType(String.class);
        BeanDescription beanDesc = _mapper.getDeserializationConfig().introspect(strArrType);
        factory.createArrayDeserializer(_context, strArrType, beanDesc);
        Assert.assertTrue(modified[0]);
    }

    @Test
    public void testCreateCollectionDeserializer_standardTypes() throws Exception {
        Class<?>[] collClasses = new Class<?>[] {
            List.class, ArrayList.class, LinkedList.class,
            Set.class, HashSet.class, TreeSet.class, SortedSet.class, NavigableSet.class,
            Queue.class, Deque.class, ArrayBlockingQueue.class
        };

        for (Class<?> cls : collClasses) {
            CollectionType type = _typeFactory.constructCollectionType((Class<? extends Collection>) cls, String.class);
            BeanDescription beanDesc = _mapper.getDeserializationConfig().introspect(type);
            JsonDeserializer<?> deser = _factory.createCollectionDeserializer(_context, type, beanDesc);
            Assert.assertNotNull("Should create deser for " + cls.getName(), deser);
        }
    }

    @Test
    public void testCreateCollectionDeserializer_enumSet() throws Exception {
        CollectionType type = _typeFactory.constructCollectionType(EnumSet.class, SimpleEnum.class);
        BeanDescription beanDesc = _mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<?> deser = _factory.createCollectionDeserializer(_context, type, beanDesc);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testCreateCollectionDeserializer_nonStringContentType() throws Exception {
        CollectionType type = _typeFactory.constructCollectionType(ArrayList.class, Integer.class);
        BeanDescription beanDesc = _mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<?> deser = _factory.createCollectionDeserializer(_context, type, beanDesc);
        Assert.assertNotNull(deser);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCollectionDeserializer_nonConcreteCollectionThrowsException() throws Exception {
        abstract class CustomAbstractCollection<E> extends AbstractCollection<E> {}
        CollectionType type = _typeFactory.constructCollectionType(CustomAbstractCollection.class, String.class);
        BeanDescription beanDesc = _mapper.getDeserializationConfig().introspect(type);
        _factory.createCollectionDeserializer(_context, type, beanDesc);
    }

    @Test
    public void testCreateCollectionLikeDeserializer() throws Exception {
        CollectionLikeType type = _typeFactory.constructCollectionLikeType(String.class, Integer.class);
        BeanDescription beanDesc = _mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<?> deser = _factory.createCollectionLikeDeserializer(_context, type, beanDesc);
        Assert.assertNull(deser);
    }

    @Test
    public void testCreateMapDeserializer_standardMaps() throws Exception {
        Class<?>[] mapClasses = new Class<?>[] {
            Map.class, LinkedHashMap.class, HashMap.class,
            ConcurrentMap.class, ConcurrentHashMap.class,
            SortedMap.class, TreeMap.class, NavigableMap.class,
            ConcurrentNavigableMap.class, ConcurrentSkipListMap.class
        };

        for (Class<?> cls : mapClasses) {
            MapType type = _typeFactory.constructMapType((Class<? extends Map>) cls, String.class, Integer.class);
            BeanDescription beanDesc = _mapper.getDeserializationConfig().introspect(type);
            JsonDeserializer<?> deser = _factory.createMapDeserializer(_context, type, beanDesc);
            Assert.assertNotNull("Should create deser for " + cls.getName(), deser);
        }
    }

    @Test
    public void testCreateMapDeserializer_enumMap() throws Exception {
        MapType type = _typeFactory.constructMapType(EnumMap.class, SimpleEnum.class, String.class);
        BeanDescription beanDesc = _mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<?> deser = _factory.createMapDeserializer(_context, type, beanDesc);
        Assert.assertNotNull(deser);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateMapDeserializer_enumMapInvalidKeyThrows() throws Exception {
        MapType type = _typeFactory.constructMapType(EnumMap.class, String.class, String.class);
        BeanDescription beanDesc = _mapper.getDeserializationConfig().introspect(type);
        _factory.createMapDeserializer(_context, type, beanDesc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateMapDeserializer_nonConcreteMapThrowsException() throws Exception {
        abstract class CustomAbstractMap<K, V> extends AbstractMap<K, V> {}
        MapType type = _typeFactory.constructMapType(CustomAbstractMap.class, String.class, String.class);
        BeanDescription beanDesc = _mapper.getDeserializationConfig().introspect(type);
        _factory.createMapDeserializer(_context, type, beanDesc);
    }

    @Test
    public void testCreateMapLikeDeserializer() throws Exception {
        MapLikeType type = _typeFactory.constructMapLikeType(String.class, String.class, Integer.class);
        BeanDescription beanDesc = _mapper.getDeserializationConfig().introspect(type);
        JsonDeserializer<?> deser = _factory.createMapLikeDeserializer(_context, type, beanDesc);
        Assert.assertNull(deser);
    }

    @Test
    public void testCreateEnumDeserializer_variousForms() throws Exception {
        // Plain enum
        JavaType type1 = _typeFactory.constructType(SimpleEnum.class);
        BeanDescription desc1 = _mapper.getDeserializationConfig().introspect(type1);
        Assert.assertNotNull(_factory.createEnumDeserializer(_context, type1, desc1));

        // Enum with creator
        JavaType type2 = _typeFactory.constructType(EnumWithCreator.class);
        BeanDescription desc2 = _mapper.getDeserializationConfig().introspect(type2);
        Assert.assertNotNull(_factory.createEnumDeserializer(_context, type2, desc2));

        // Enum with no-arg creator
        JavaType type3 = _typeFactory.constructType(EnumWithNoArgCreator.class);
        BeanDescription desc3 = _mapper.getDeserializationConfig().introspect(type3);
        Assert.assertNotNull(_factory.createEnumDeserializer(_context, type3, desc3));

        // Enum with @JsonValue
        JavaType type4 = _typeFactory.constructType(EnumWithJsonValue.class);
        BeanDescription desc4 = _mapper.getDeserializationConfig().introspect(type4);
        Assert.assertNotNull(_factory.createEnumDeserializer(_context, type4, desc4));
    }

    @Test
    public void testCreateTreeDeserializer() throws Exception {
        DeserializationConfig cfg = _mapper.getDeserializationConfig();
        JavaType nodeType = _typeFactory.constructType(JsonNode.class);
        BeanDescription desc1 = cfg.introspect(nodeType);
        Assert.assertNotNull(_factory.createTreeDeserializer(cfg, nodeType, desc1));

        JavaType objNodeType = _typeFactory.constructType(ObjectNode.class);
        BeanDescription desc2 = cfg.introspect(objNodeType);
        Assert.assertNotNull(_factory.createTreeDeserializer(cfg, objNodeType, desc2));

        JavaType arrNodeType = _typeFactory.constructType(ArrayNode.class);
        BeanDescription desc3 = cfg.introspect(arrNodeType);
        Assert.assertNotNull(_factory.createTreeDeserializer(cfg, arrNodeType, desc3));
    }

    @Test
    public void testCreateReferenceDeserializer_atomicReference() throws Exception {
        ReferenceType refType = ReferenceType.upgradeFrom(
            _typeFactory.constructType(AtomicReference.class),
            _typeFactory.constructType(String.class)
        );
        BeanDescription beanDesc = _mapper.getDeserializationConfig().introspect(refType);
        JsonDeserializer<?> deser = _factory.createReferenceDeserializer(_context, refType, beanDesc);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testFindTypeDeserializer_polymorphicClass() throws Exception {
        JavaType type = _typeFactory.constructType(AbstractTypeWithJsonTypeInfo.class);
        TypeDeserializer typer = _factory.findTypeDeserializer(_mapper.getDeserializationConfig(), type);
        Assert.assertNotNull(typer);
    }

    @Test
    public void testFindTypeDeserializer_nonPolymorphic() throws Exception {
        JavaType type = _typeFactory.constructType(SimpleBean.class);
        TypeDeserializer typer = _factory.findTypeDeserializer(_mapper.getDeserializationConfig(), type);
        Assert.assertNull(typer);
    }

    @Test
    public void testCreateKeyDeserializer_enumAndStdTypes() throws Exception {
        // Enum key deser
        JavaType enumType = _typeFactory.constructType(SimpleEnum.class);
        KeyDeserializer kd1 = _factory.createKeyDeserializer(_context, enumType);
        Assert.assertNotNull(kd1);

        // Enum with creator
        JavaType enumCreatorType = _typeFactory.constructType(EnumWithCreator.class);
        KeyDeserializer kd2 = _factory.createKeyDeserializer(_context, enumCreatorType);
        Assert.assertNotNull(kd2);

        // String, int, Long, UUID
        JavaType strType = _typeFactory.constructType(String.class);
        Assert.assertNotNull(_factory.createKeyDeserializer(_context, strType));

        JavaType intType = _typeFactory.constructType(Integer.class);
        Assert.assertNotNull(_factory.createKeyDeserializer(_context, intType));

        JavaType uuidType = _typeFactory.constructType(UUID.class);
        Assert.assertNotNull(_factory.createKeyDeserializer(_context, uuidType));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateKeyDeserializer_enumWithInvalidCreatorThrows() throws Exception {
        JavaType invalidEnumType = _typeFactory.constructType(EnumWithInvalidCreator.class);
        _factory.createKeyDeserializer(_context, invalidEnumType);
    }

    @Test
    public void testFindDefaultDeserializer_allKnownJdkTypes() throws Exception {
        Class<?>[] typesToTest = new Class<?>[] {
            Object.class,
            String.class,
            CharSequence.class,
            Iterable.class,
            Map.Entry.class,
            TokenBuffer.class,
            int.class, Integer.class,
            long.class, Long.class,
            double.class, Double.class,
            boolean.class, Boolean.class,
            Date.class, Calendar.class,
            UUID.class, java.net.URL.class, java.net.URI.class,
            java.util.regex.Pattern.class, Locale.class,
            java.math.BigDecimal.class, java.math.BigInteger.class,
            StackTraceElement.class
        };

        for (Class<?> cls : typesToTest) {
            JavaType jt = _typeFactory.constructType(cls);
            BeanDescription beanDesc = _mapper.getDeserializationConfig().introspect(jt);
            JsonDeserializer<?> deser = _factory.findDefaultDeserializer(_context, jt, beanDesc);
            Assert.assertNotNull("Default deserializer for " + cls.getName() + " should not be null", deser);
        }
    }

    @Test
    public void testFindDefaultDeserializer_untypedWithRemappedCollections() throws Exception {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(List.class, LinkedList.class);
        resolver.addMapping(Map.class, TreeMap.class);
        DeserializerFactory factory = _factory.withAbstractTypeResolver(resolver);

        JavaType objType = _typeFactory.constructType(Object.class);
        BeanDescription beanDesc = _mapper.getDeserializationConfig().introspect(objType);
        JsonDeserializer<?> deser = factory.findDefaultDeserializer(_context, objType, beanDesc);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testProtectedHelperMethodsDirectly() throws Exception {
        TestDeserializerFactory tf = new TestDeserializerFactory(new DeserializerFactoryConfig());
        DeserializationConfig config = _mapper.getDeserializationConfig();
        AnnotationIntrospector intr = config.getAnnotationIntrospector();

        // Single argument constructors
        JavaType singleArgType = _typeFactory.constructType(SingleArgConstructors.class);
        BeanDescription singleArgDesc = config.introspect(singleArgType);
        CreatorCollector creators = new CreatorCollector(singleArgDesc, config);
        VisibilityChecker<?> vchecker = config.getDefaultVisibilityChecker();

        for (AnnotatedConstructor ctor : singleArgDesc.getConstructors()) {
            boolean handled = tf._handleSingleArgumentConstructor(
                _context, singleArgDesc, vchecker, intr, creators, ctor, false, true
            );
            Assert.assertTrue(handled);
        }

        // Single argument factory methods
        JavaType singleFactoryType = _typeFactory.constructType(SingleArgFactories.class);
        BeanDescription singleFactoryDesc = config.introspect(singleFactoryType);
        CreatorCollector factoryCreators = new CreatorCollector(singleFactoryDesc, config);
        for (AnnotatedMethod m : singleFactoryDesc.getFactoryMethods()) {
            boolean handled = tf._handleSingleArgumentFactory(
                config, singleFactoryDesc, vchecker, intr, factoryCreators, m, false
            );
            Assert.assertTrue(handled);
        }

        // Helper param name extraction
        Assert.assertNull(tf._findParamName(null, intr));
        Assert.assertNull(tf._findParamName(null, null));
        Assert.assertNull(tf._findImplicitParamName(null, intr));
        Assert.assertNull(tf._findExplicitParamName(null, intr));
        Assert.assertFalse(tf._hasExplicitParamName(null, intr));

        // Enum resolver construction
        EnumResolver enumRes = tf.constructEnumResolver(SimpleEnum.class, config, null);
        Assert.assertNotNull(enumRes);
        Assert.assertEquals(SimpleEnum.class, enumRes.getEnumClass());

        // Deprecated helper methods
        JavaType type = _typeFactory.constructType(SimpleBean.class);
        JavaType modType = tf.modifyTypeByAnnotation(_context, singleArgDesc.getClassInfo(), type);
        Assert.assertNotNull(modType);
        JavaType resType = tf.resolveType(_context, singleArgDesc, type, singleArgDesc.findDefaultConstructor());
        Assert.assertNotNull(resType);
        AnnotatedMethod jsonValueM = tf._findJsonValueFor(config, _typeFactory.constructType(EnumWithJsonValue.class));
        Assert.assertNotNull(jsonValueM);
        Assert.assertNull(tf._findJsonValueFor(config, null));
    }
}
