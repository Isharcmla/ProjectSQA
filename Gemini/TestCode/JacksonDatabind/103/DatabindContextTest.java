package com.fasterxml.jackson.databind;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.StdConverter;

public class DatabindContextTest {

    private static class TestDatabindContext extends DatabindContext {
        private final ObjectMapper _mapper;
        private final MapperConfig<?> _config;
        private HandlerInstantiator _handlerInstantiator;

        public TestDatabindContext() {
            _mapper = new ObjectMapper();
            _config = _mapper.getDeserializationConfig();
        }

        public void setHandlerInstantiator(HandlerInstantiator hi) {
            _handlerInstantiator = hi;
        }

        @Override
        public MapperConfig<?> getConfig() {
            if (_handlerInstantiator != null) {
                return _config.with(_handlerInstantiator);
            }
            return _config;
        }

        @Override
        public AnnotationIntrospector getAnnotationIntrospector() {
            return getConfig().getAnnotationIntrospector();
        }

        @Override
        public boolean isEnabled(MapperFeature feature) {
            return getConfig().isEnabled(feature);
        }

        @Override
        public boolean canOverrideAccessModifiers() {
            return getConfig().canOverrideAccessModifiers();
        }

        @Override
        public Class<?> getActiveView() {
            return getConfig().getActiveView();
        }

        @Override
        public Locale getLocale() {
            return getConfig().getLocale();
        }

        @Override
        public TimeZone getTimeZone() {
            return getConfig().getTimeZone();
        }

        @Override
        public JsonFormat.Value getDefaultPropertyFormat(Class<?> baseType) {
            return getConfig().getDefaultPropertyFormat(baseType);
        }

        @Override
        public Object getAttribute(Object key) {
            return null;
        }

        @Override
        public DatabindContext setAttribute(Object key, Object value) {
            return this;
        }

        @Override
        public TypeFactory getTypeFactory() {
            return _config.getTypeFactory();
        }

        @Override
        protected JsonMappingException invalidTypeIdException(JavaType baseType, String typeId, String extraDesc) {
            String msg = "Could not resolve type id '" + typeId + "' into a subtype of " + baseType;
            if (extraDesc != null) {
                msg += ": " + extraDesc;
            }
            return JsonMappingException.from((DeserializationContext) null, msg);
        }

        @Override
        public <T> T reportBadDefinition(JavaType type, String msg) throws JsonMappingException {
            throw JsonMappingException.from((DeserializationContext) null, "Bad definition for " + type + ": " + msg);
        }

        public String format(String msg, Object... msgArgs) {
            return _format(msg, msgArgs);
        }

        public String truncate(String desc) {
            return _truncate(desc);
        }

        public String quotedString(String desc) {
            return _quotedString(desc);
        }

        public String colonConcat(String msgBase, String extra) {
            return _colonConcat(msgBase, extra);
        }

        public String desc(String desc) {
            return _desc(desc);
        }
    }

    public static class StringToIntegerConverter extends StdConverter<String, Integer> {
        @Override
        public Integer convert(String value) {
            return Integer.valueOf(value);
        }
    }

    private TestDatabindContext _context;

    @Before
    public void setUp() {
        _context = new TestDatabindContext();
    }

    @Test
    public void testConstructType_withNull_returnsNull() {
        JavaType result = _context.constructType((Type) null);
        Assert.assertNull(result);
    }

    @Test
    public void testConstructType_withValidClass_returnsJavaType() {
        JavaType result = _context.constructType(String.class);
        Assert.assertNotNull(result);
        Assert.assertEquals(String.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_sameClass_returnsBaseType() {
        JavaType baseType = _context.constructType(Number.class);
        JavaType specialized = _context.constructSpecializedType(baseType, Number.class);
        Assert.assertSame(baseType, specialized);
    }

    @Test
    public void testConstructSpecializedType_subclass_returnsSpecializedType() {
        JavaType baseType = _context.constructType(Number.class);
        JavaType specialized = _context.constructSpecializedType(baseType, Integer.class);
        Assert.assertEquals(Integer.class, specialized.getRawClass());
    }

    @Test
    public void testResolveSubType_genericStringMatching_returnsResolvedType() throws Exception {
        JavaType baseType = _context.constructType(List.class);
        JavaType result = _context.resolveSubType(baseType, "java.util.ArrayList<java.lang.String>");
        Assert.assertNotNull(result);
        Assert.assertEquals(ArrayList.class, result.getRawClass());
        Assert.assertEquals(String.class, result.getContentType().getRawClass());
    }

    @Test(expected = JsonMappingException.class)
    public void testResolveSubType_genericStringNotSubtype_throwsException() throws Exception {
        JavaType baseType = _context.constructType(String.class);
        _context.resolveSubType(baseType, "java.util.ArrayList<java.lang.String>");
    }

    @Test
    public void testResolveSubType_nonGenericClassSubtype_returnsResolvedType() throws Exception {
        JavaType baseType = _context.constructType(Number.class);
        JavaType result = _context.resolveSubType(baseType, "java.lang.Integer");
        Assert.assertNotNull(result);
        Assert.assertEquals(Integer.class, result.getRawClass());
    }

    @Test
    public void testResolveSubType_classNotFound_returnsNull() throws Exception {
        JavaType baseType = _context.constructType(Number.class);
        JavaType result = _context.resolveSubType(baseType, "com.nonexistent.NoSuchClass");
        Assert.assertNull(result);
    }

    @Test(expected = JsonMappingException.class)
    public void testResolveSubType_invalidClassName_throwsException() throws Exception {
        JavaType baseType = _context.constructType(Number.class);
        _context.resolveSubType(baseType, "not.a.valid...class");
    }

    @Test(expected = JsonMappingException.class)
    public void testResolveSubType_existingClassNotSubtype_throwsException() throws Exception {
        JavaType baseType = _context.constructType(Number.class);
        _context.resolveSubType(baseType, "java.lang.String");
    }

    @Test
    public void testObjectIdGeneratorInstance_withoutHandlerInstantiator_returnsNewInstance() throws Exception {
        ObjectIdInfo info = new ObjectIdInfo(
                PropertyName.construct("id"),
                Object.class,
                ObjectIdGenerators.IntSequenceGenerator.class,
                SimpleObjectIdResolver.class
        );
        ObjectIdGenerator<?> gen = _context.objectIdGeneratorInstance(null, info);
        Assert.assertNotNull(gen);
        Assert.assertTrue(gen instanceof ObjectIdGenerators.IntSequenceGenerator);
        Assert.assertEquals(Object.class, gen.getScope());
    }

    @Test
    public void testObjectIdGeneratorInstance_withHandlerInstantiator_returnsCustomInstance() throws Exception {
        final ObjectIdGenerator<?> customGen = new ObjectIdGenerators.IntSequenceGenerator();
        _context.setHandlerInstantiator(new HandlerInstantiator() {
            @Override
            public JsonDeserializer<?> deserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> deserClass) { return null; }
            @Override
            public KeyDeserializer keyDeserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> keyDeserClass) { return null; }
            @Override
            public JsonSerializer<?> serializerInstance(SerializationConfig config, Annotated annotated, Class<?> serClass) { return null; }
            @Override
            public TypeResolverBuilder<?> typeResolverBuilderInstance(MapperConfig<?> config, Annotated annotated, Class<?> builderClass) { return null; }
            @Override
            public TypeIdResolver typeIdResolverInstance(MapperConfig<?> config, Annotated annotated, Class<?> resolverClass) { return null; }
            @Override
            public ObjectIdGenerator<?> objectIdGeneratorInstance(MapperConfig<?> config, Annotated annotated, Class<?> implClass) {
                return customGen;
            }
            @Override
            public ObjectIdResolver resolverIdGeneratorInstance(MapperConfig<?> config, Annotated annotated, Class<?> implClass) { return null; }
            @Override
            public Converter<?, ?> converterInstance(MapperConfig<?> config, Annotated annotated, Class<?> implClass) { return null; }
        });

        ObjectIdInfo info = new ObjectIdInfo(
                PropertyName.construct("id"),
                String.class,
                ObjectIdGenerators.IntSequenceGenerator.class,
                SimpleObjectIdResolver.class
        );
        ObjectIdGenerator<?> gen = _context.objectIdGeneratorInstance(null, info);
        Assert.assertNotNull(gen);
        Assert.assertEquals(String.class, gen.getScope());
    }

    @Test
    public void testObjectIdResolverInstance_withoutHandlerInstantiator_returnsNewInstance() {
        ObjectIdInfo info = new ObjectIdInfo(
                PropertyName.construct("id"),
                Object.class,
                ObjectIdGenerators.IntSequenceGenerator.class,
                SimpleObjectIdResolver.class
        );
        ObjectIdResolver resolver = _context.objectIdResolverInstance(null, info);
        Assert.assertNotNull(resolver);
        Assert.assertTrue(resolver instanceof SimpleObjectIdResolver);
    }

    @Test
    public void testObjectIdResolverInstance_withHandlerInstantiator_returnsCustomInstance() {
        final ObjectIdResolver customResolver = new SimpleObjectIdResolver();
        _context.setHandlerInstantiator(new HandlerInstantiator() {
            @Override
            public JsonDeserializer<?> deserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> deserClass) { return null; }
            @Override
            public KeyDeserializer keyDeserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> keyDeserClass) { return null; }
            @Override
            public JsonSerializer<?> serializerInstance(SerializationConfig config, Annotated annotated, Class<?> serClass) { return null; }
            @Override
            public TypeResolverBuilder<?> typeResolverBuilderInstance(MapperConfig<?> config, Annotated annotated, Class<?> builderClass) { return null; }
            @Override
            public TypeIdResolver typeIdResolverInstance(MapperConfig<?> config, Annotated annotated, Class<?> resolverClass) { return null; }
            @Override
            public ObjectIdGenerator<?> objectIdGeneratorInstance(MapperConfig<?> config, Annotated annotated, Class<?> implClass) { return null; }
            @Override
            public ObjectIdResolver resolverIdGeneratorInstance(MapperConfig<?> config, Annotated annotated, Class<?> implClass) {
                return customResolver;
            }
            @Override
            public Converter<?, ?> converterInstance(MapperConfig<?> config, Annotated annotated, Class<?> implClass) { return null; }
        });

        ObjectIdInfo info = new ObjectIdInfo(
                PropertyName.construct("id"),
                Object.class,
                ObjectIdGenerators.IntSequenceGenerator.class,
                SimpleObjectIdResolver.class
        );
        ObjectIdResolver resolver = _context.objectIdResolverInstance(null, info);
        Assert.assertSame(customResolver, resolver);
    }

    @Test
    public void testConverterInstance_null_returnsNull() throws Exception {
        Converter<Object, Object> conv = _context.converterInstance(null, null);
        Assert.assertNull(conv);
    }

    @Test
    public void testConverterInstance_alreadyConverterInstance_returnsSameInstance() throws Exception {
        Converter<Object, Object> input = new Converter<Object, Object>() {
            @Override
            public Object convert(Object value) { return value; }
            @Override
            public JavaType getInputType(TypeFactory typeFactory) { return null; }
            @Override
            public JavaType getOutputType(TypeFactory typeFactory) { return null; }
        };
        Converter<Object, Object> result = _context.converterInstance(null, input);
        Assert.assertSame(input, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testConverterInstance_notConverterAndNotClass_throwsIllegalStateException() throws Exception {
        _context.converterInstance(null, "invalidStringDefinition");
    }

    @Test
    public void testConverterInstance_converterNoneClass_returnsNull() throws Exception {
        Converter<Object, Object> result = _context.converterInstance(null, Converter.None.class);
        Assert.assertNull(result);
    }

    @Test
    public void testConverterInstance_bogusClass_returnsNull() throws Exception {
        Converter<Object, Object> result = _context.converterInstance(null, Void.class);
        Assert.assertNull(result);
    }

    @Test(expected = IllegalStateException.class)
    public void testConverterInstance_classNotImplementingConverter_throwsIllegalStateException() throws Exception {
        _context.converterInstance(null, String.class);
    }

    @Test
    public void testConverterInstance_validConverterClassWithoutHandlerInstantiator_createsInstance() throws Exception {
        Converter<Object, Object> result = _context.converterInstance(null, StringToIntegerConverter.class);
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof StringToIntegerConverter);
    }

    @Test
    public void testConverterInstance_withHandlerInstantiator_returnsCustomInstance() throws Exception {
        final Converter<?, ?> customConv = new StringToIntegerConverter();
        _context.setHandlerInstantiator(new HandlerInstantiator() {
            @Override
            public JsonDeserializer<?> deserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> deserClass) { return null; }
            @Override
            public KeyDeserializer keyDeserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> keyDeserClass) { return null; }
            @Override
            public JsonSerializer<?> serializerInstance(SerializationConfig config, Annotated annotated, Class<?> serClass) { return null; }
            @Override
            public TypeResolverBuilder<?> typeResolverBuilderInstance(MapperConfig<?> config, Annotated annotated, Class<?> builderClass) { return null; }
            @Override
            public TypeIdResolver typeIdResolverInstance(MapperConfig<?> config, Annotated annotated, Class<?> resolverClass) { return null; }
            @Override
            public ObjectIdGenerator<?> objectIdGeneratorInstance(MapperConfig<?> config, Annotated annotated, Class<?> implClass) { return null; }
            @Override
            public ObjectIdResolver resolverIdGeneratorInstance(MapperConfig<?> config, Annotated annotated, Class<?> implClass) { return null; }
            @Override
            public Converter<?, ?> converterInstance(MapperConfig<?> config, Annotated annotated, Class<?> implClass) {
                return customConv;
            }
        });

        Converter<Object, Object> result = _context.converterInstance(null, StringToIntegerConverter.class);
        Assert.assertSame(customConv, result);
    }

    @Test(expected = JsonMappingException.class)
    public void testReportBadDefinition_withClass_delegatesToReportBadDefinitionWithJavaType() throws Exception {
        _context.reportBadDefinition(String.class, "Invalid type definition");
    }

    @Test
    public void testFormat_withArgs_formatsString() {
        String formatted = _context.format("Hello %s %d", "World", 123);
        Assert.assertEquals("Hello World 123", formatted);
    }

    @Test
    public void testFormat_withoutArgs_returnsOriginalString() {
        String msg = "Hello %s";
        String formatted = _context.format(msg);
        Assert.assertSame(msg, formatted);
    }

    @Test
    public void testTruncate_null_returnsEmptyString() {
        Assert.assertEquals("", _context.truncate(null));
    }

    @Test
    public void testTruncate_shortString_returnsSameString() {
        String shortStr = "short text";
        Assert.assertEquals(shortStr, _context.truncate(shortStr));
    }

    @Test
    public void testTruncate_longString_truncatesCorrectly() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 600; i++) {
            sb.append('a');
        }
        for (int i = 0; i < 600; i++) {
            sb.append('z');
        }
        String longStr = sb.toString();
        String truncated = _context.truncate(longStr);
        Assert.assertEquals(1005, truncated.length());
        Assert.assertTrue(truncated.startsWith("aaaa"));
        Assert.assertTrue(truncated.contains("]...["));
        Assert.assertTrue(truncated.endsWith("zzzz"));
    }

    @Test
    public void testQuotedString_null_returnsNA() {
        Assert.assertEquals("[N/A]", _context.quotedString(null));
    }

    @Test
    public void testQuotedString_nonNull_returnsQuotedTruncatedString() {
        Assert.assertEquals("\"hello\"", _context.quotedString("hello"));
    }

    @Test
    public void testColonConcat_extraNull_returnsBase() {
        Assert.assertEquals("base", _context.colonConcat("base", null));
    }

    @Test
    public void testColonConcat_extraNonNull_returnsConcatenated() {
        Assert.assertEquals("base: extra", _context.colonConcat("base", "extra"));
    }

    @Test
    public void testDesc_null_returnsNA() {
        Assert.assertEquals("[N/A]", _context.desc(null));
    }

    @Test
    public void testDesc_nonNull_returnsTruncatedDesc() {
        Assert.assertEquals("description", _context.desc("description"));
    }
}
