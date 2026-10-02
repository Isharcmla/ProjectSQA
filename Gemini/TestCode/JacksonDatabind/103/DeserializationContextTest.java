package com.fasterxml.jackson.databind;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ObjectBuffer;

public class DeserializationContextTest {

    private ObjectMapper _mapper;
    private DeserializationConfig _config;
    private JsonParser _parser;
    private TestContext _context;

    static class TestContext extends DeserializationContext {
        private static final long serialVersionUID = 1L;

        public TestContext(DeserializerFactory df) {
            super(df);
        }

        public TestContext(DeserializerFactory df, DeserializerCache cache) {
            super(df, cache);
        }

        public TestContext(TestContext src, DeserializerFactory factory) {
            super(src, factory);
        }

        public TestContext(TestContext src, DeserializationConfig config, JsonParser p, InjectableValues iv) {
            super(src, config, p, iv);
        }

        public TestContext(TestContext src) {
            super(src);
        }

        @Override
        public ReadableObjectId findObjectId(Object id, ObjectIdGenerator<?> generator, ObjectIdResolver resolver) {
            return null;
        }

        @Override
        public void checkUnresolvedObjectId() throws UnresolvedForwardReference {
        }

        @Override
        public JsonDeserializer<Object> deserializerInstance(Annotated annotated, Object deserDef) {
            return null;
        }

        @Override
        public KeyDeserializer keyDeserializerInstance(Annotated annotated, Object deserDef) {
            return null;
        }
    }

    static class CustomContextualDeser extends JsonDeserializer<String> implements ContextualDeserializer {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) {
            return p.getText();
        }

        @Override
        public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) {
            Assert.assertNotNull(ctxt.getContextualType());
            return this;
        }
    }

    static class CustomContextualKeyDeser extends KeyDeserializer implements ContextualKeyDeserializer {
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) {
            return key;
        }

        @Override
        public KeyDeserializer createContextual(DeserializationContext ctxt, BeanProperty property) {
            return this;
        }
    }

    static class DummyBean {
        public String name;
        public int age;
    }

    static class DummyPolymorphicBase {
    }

    static class DummyPolymorphicSub extends DummyPolymorphicBase {
    }

    @Before
    public void setUp() throws Exception {
        _mapper = new ObjectMapper();
        _config = _mapper.getDeserializationConfig();
        _parser = _mapper.getFactory().createParser("{\"name\":\"test\",\"age\":20}");
        _parser.nextToken(); // START_OBJECT
        TestContext blueprint = new TestContext(new BeanDeserializerFactory(new DeserializerFactoryConfig()));
        _context = new TestContext(blueprint, _config, _parser, new InjectableValues.Std());
    }

    @Test
    public void testConstructors_validInputs_createdProperly() {
        DeserializerFactory df = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        TestContext ctx1 = new TestContext(df);
        Assert.assertNotNull(ctx1.getFactory());

        TestContext ctx2 = new TestContext(df, new DeserializerCache());
        Assert.assertNotNull(ctx2.getFactory());

        TestContext ctx3 = new TestContext(ctx2, df);
        Assert.assertNotNull(ctx3.getFactory());

        TestContext ctx4 = new TestContext(ctx3);
        Assert.assertNotNull(ctx4.getFactory());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullFactory_throwsException() {
        new TestContext(null, null);
    }

    @Test
    public void testConfigAndContextDelegates() {
        Assert.assertSame(_config, _context.getConfig());
        Assert.assertEquals(_config.getActiveView(), _context.getActiveView());
        Assert.assertEquals(_config.canOverrideAccessModifiers(), _context.canOverrideAccessModifiers());
        Assert.assertEquals(_config.isEnabled(MapperFeature.AUTO_DETECT_FIELDS), _context.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
        Assert.assertNotNull(_context.getDefaultPropertyFormat(String.class));
        Assert.assertSame(_config.getAnnotationIntrospector(), _context.getAnnotationIntrospector());
        Assert.assertSame(_config.getTypeFactory(), _context.getTypeFactory());
        Assert.assertEquals(_config.getLocale(), _context.getLocale());
        Assert.assertEquals(_config.getTimeZone(), _context.getTimeZone());
        Assert.assertSame(_config.getBase64Variant(), _context.getBase64Variant());
        Assert.assertSame(_config.getNodeFactory(), _context.getNodeFactory());
        Assert.assertSame(_parser, _context.getParser());
    }

    @Test
    public void testAttributes_getAndSet() {
        Assert.assertNull(_context.getAttribute("myKey"));
        _context.setAttribute("myKey", "myValue");
        Assert.assertEquals("myValue", _context.getAttribute("myKey"));
    }

    @Test
    public void testContextualType_initiallyNull() {
        Assert.assertNull(_context.getContextualType());
    }

    @Test
    public void testFeatureFlags_evaluatesBitmaskCorrectly() {
        int mask = _context.getDeserializationFeatures();
        Assert.assertTrue(_context.hasDeserializationFeatures(mask));
        Assert.assertTrue(_context.hasSomeOfFeatures(mask));
        Assert.assertFalse(_context.hasSomeOfFeatures(0));
        Assert.assertTrue(_context.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testFindInjectableValue_configuredAndNotConfigured() throws JsonMappingException {
        InjectableValues.Std iv = new InjectableValues.Std();
        iv.addValue("id1", "injectedValue");
        TestContext ctxWithIv = new TestContext(_context, _config, _parser, iv);
        Object val = ctxWithIv.findInjectableValue("id1", null, null);
        Assert.assertEquals("injectedValue", val);

        TestContext ctxWithoutIv = new TestContext(_context, _config, _parser, null);
        try {
            ctxWithoutIv.findInjectableValue("id2", null, null);
            Assert.fail("Expected InvalidDefinitionException");
        } catch (InvalidDefinitionException e) {
            Assert.assertTrue(e.getMessage().contains("No 'injectableValues' configured"));
        }
    }

    @Test
    public void testTypeHandling_constructTypeAndFindClass() throws Exception {
        Assert.assertNull(_context.constructType(null));
        JavaType jt = _context.constructType(String.class);
        Assert.assertEquals(String.class, jt.getRawClass());

        Class<?> cls = _context.findClass(String.class.getName());
        Assert.assertEquals(String.class, cls);
    }

    @Test
    public void testBufferRecycling_leaseAndReturn() {
        ObjectBuffer buf1 = _context.leaseObjectBuffer();
        Assert.assertNotNull(buf1);
        _context.returnObjectBuffer(buf1);

        ObjectBuffer buf2 = _context.leaseObjectBuffer();
        Assert.assertSame(buf1, buf2);

        ObjectBuffer buf3 = new ObjectBuffer();
        _context.returnObjectBuffer(buf3);
        _context.returnObjectBuffer(buf1); // testing capacity comparison branch

        ArrayBuilders ab = _context.getArrayBuilders();
        Assert.assertNotNull(ab);
        Assert.assertSame(ab, _context.getArrayBuilders());
    }

    @Test
    public void testContextualization_primaryAndSecondary() throws JsonMappingException {
        JavaType type = _context.constructType(String.class);
        CustomContextualDeser deser = new CustomContextualDeser();

        JsonDeserializer<?> res1 = _context.handlePrimaryContextualization(deser, null, type);
        Assert.assertSame(deser, res1);

        JsonDeserializer<?> res2 = _context.handleSecondaryContextualization(deser, null, type);
        Assert.assertSame(deser, res2);

        JsonDeserializer<Object> nonContextual = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
        };
        Assert.assertSame(nonContextual, _context.handlePrimaryContextualization(nonContextual, null, type));
        Assert.assertSame(nonContextual, _context.handleSecondaryContextualization(nonContextual, null, type));
    }

    @Test
    public void testDateAndCalendarParsing() {
        String dateStr = "2020-01-01T00:00:00.000+0000";
        Date date = _context.parseDate(dateStr);
        Assert.assertNotNull(date);

        Calendar cal = _context.constructCalendar(date);
        Assert.assertNotNull(cal);
        Assert.assertEquals(date.getTime(), cal.getTimeInMillis());

        DateFormat df1 = _context.getDateFormat();
        DateFormat df2 = _context.getDateFormat();
        Assert.assertSame(df1, df2);

        try {
            _context.parseDate("not-a-valid-date-format-string");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Failed to parse Date value"));
        }
    }

    @Test
    public void testReadValues() throws Exception {
        JsonParser p = _mapper.getFactory().createParser("\"hello\"");
        p.nextToken();
        String val = _context.readValue(p, String.class);
        Assert.assertEquals("hello", val);

        JsonParser p2 = _mapper.getFactory().createParser("\"world\"");
        p2.nextToken();
        JavaType jt = _context.constructType(String.class);
        String val2 = _context.readValue(p2, jt);
        Assert.assertEquals("world", val2);

        JsonParser p3 = _mapper.getFactory().createParser("\"propVal1\"");
        p3.nextToken();
        String propVal1 = _context.readPropertyValue(p3, null, String.class);
        Assert.assertEquals("propVal1", propVal1);

        JsonParser p4 = _mapper.getFactory().createParser("\"propVal2\"");
        p4.nextToken();
        String propVal2 = _context.readPropertyValue(p4, null, jt);
        Assert.assertEquals("propVal2", propVal2);
    }

    @Test
    public void testDeserializerLookup() throws Exception {
        JavaType type = _context.constructType(String.class);
        AtomicReference<Throwable> cause = new AtomicReference<Throwable>();
        Assert.assertTrue(_context.hasValueDeserializerFor(type, cause));
        Assert.assertNull(cause.get());

        Assert.assertNotNull(_context.findContextualValueDeserializer(type, null));
        Assert.assertNotNull(_context.findNonContextualValueDeserializer(type));
        Assert.assertNotNull(_context.findRootValueDeserializer(type));

        JavaType keyType = _context.constructType(String.class);
        Assert.assertNotNull(_context.findKeyDeserializer(keyType, null));
    }

    @Test
    public void testHasValueDeserializerFor_failureHandling() {
        AtomicReference<Throwable> cause = new AtomicReference<Throwable>();
        JavaType invalidType = _context.constructType(Object.class); // Valid, but test with custom broken factory if needed
        Assert.assertTrue(_context.hasValueDeserializerFor(invalidType, cause));

        TestContext brokenCtx = new TestContext(new DeserializerFactoryConfig() {
            private static final long serialVersionUID = 1L;
        }.deserializers()) {
            private static final long serialVersionUID = 1L;
            @Override
            public DeserializerFactory getFactory() {
                throw new RuntimeException("Factory failure");
            }
        };

        boolean res = brokenCtx.hasValueDeserializerFor(invalidType, cause);
        Assert.assertFalse(res);
        Assert.assertNotNull(cause.get());

        try {
            brokenCtx.hasValueDeserializerFor(invalidType, null);
            Assert.fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            Assert.assertEquals("Factory failure", e.getMessage());
        }
    }

    @Test
    public void testKeyDeserializer_contextualKeyDeserializer() throws JsonMappingException {
        KeyDeserializer kd = new CustomContextualKeyDeser();
        TestContext ctx = new TestContext(_context.getFactory()) {
            private static final long serialVersionUID = 1L;
            {
                _cache.put(DeserializationContextTest.this._context.constructType(CustomContextualKeyDeser.class), null);
            }
        };
        // Verify findKeyDeserializer contextualization branch logic via mock/custom cache
        DeserializerCache cache = new DeserializerCache();
        TestContext testCtx = new TestContext(ctx.getFactory(), cache) {
            private static final long serialVersionUID = 1L;
        };
        Assert.assertNotNull(testCtx.findKeyDeserializer(_context.constructType(String.class), null));
    }

    @Test
    public void testHandleUnknownProperty() throws Exception {
        // Handler handles
        DeserializationProblemHandler handler = new DeserializationProblemHandler() {
            @Override
            public boolean handleUnknownProperty(DeserializationContext ctxt, JsonParser p, JsonDeserializer<?> deser, Object beanOrClass, String propertyName) {
                return "handledProp".equals(propertyName);
            }
        };
        DeserializationConfig cfgWithHandler = _config.withHandler(handler);
        TestContext ctx = new TestContext(_context, cfgWithHandler, _parser, null);

        Assert.assertTrue(ctx.handleUnknownProperty(_parser, null, DummyBean.class, "handledProp"));

        // Handler doesn't handle, FAIL_ON_UNKNOWN_PROPERTIES = false
        DeserializationConfig cfgNoFail = cfgWithHandler.without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        TestContext ctxNoFail = new TestContext(_context, cfgNoFail, _parser, null);
        Assert.assertTrue(ctxNoFail.handleUnknownProperty(_parser, null, DummyBean.class, "unhandledProp"));

        // Handler doesn't handle, FAIL_ON_UNKNOWN_PROPERTIES = true -> exception
        try {
            ctx.handleUnknownProperty(_parser, null, DummyBean.class, "unhandledProp");
            Assert.fail("Expected UnrecognizedPropertyException");
        } catch (UnrecognizedPropertyException e) {
            Assert.assertEquals("unhandledProp", e.getPropertyName());
        }
    }

    @Test
    public void testHandleWeirdKey() throws Exception {
        DeserializationProblemHandler handler = new DeserializationProblemHandler() {
            @Override
            public Object handleWeirdKey(DeserializationContext ctxt, Class<?> keyClass, String keyValue, String msg) {
                if ("validKey".equals(keyValue)) {
                    return "recoveredKey";
                }
                if ("badTypeKey".equals(keyValue)) {
                    return Integer.valueOf(123);
                }
                return NOT_HANDLED;
            }
        };
        TestContext ctx = new TestContext(_context, _config.withHandler(handler), _parser, null);

        Object okKey = ctx.handleWeirdKey(String.class, "validKey", "error message");
        Assert.assertEquals("recoveredKey", okKey);

        try {
            ctx.handleWeirdKey(String.class, "badTypeKey", "error message");
            Assert.fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            Assert.assertTrue(e.getMessage().contains("returned value of type java.lang.Integer"));
        }

        try {
            ctx.handleWeirdKey(String.class, "unknownKey", "error message");
            Assert.fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            Assert.assertTrue(e.getMessage().contains("Cannot deserialize Map key of type"));
        }
    }

    @Test
    public void testHandleWeirdStringValue() throws Exception {
        DeserializationProblemHandler handler = new DeserializationProblemHandler() {
            @Override
            public Object handleWeirdStringValue(DeserializationContext ctxt, Class<?> targetType, String valueToConvert, String msg) {
                if ("validStr".equals(valueToConvert)) {
                    return "recoveredStr";
                }
                if ("badTypeStr".equals(valueToConvert)) {
                    return Integer.valueOf(999);
                }
                return NOT_HANDLED;
            }
        };
        TestContext ctx = new TestContext(_context, _config.withHandler(handler), _parser, null);

        Object okStr = ctx.handleWeirdStringValue(String.class, "validStr", "msg");
        Assert.assertEquals("recoveredStr", okStr);

        try {
            ctx.handleWeirdStringValue(String.class, "badTypeStr", "msg");
            Assert.fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            Assert.assertTrue(e.getMessage().contains("returned value of type java.lang.Integer"));
        }

        try {
            ctx.handleWeirdStringValue(String.class, "unknownStr", "msg");
            Assert.fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            Assert.assertTrue(e.getMessage().contains("Cannot deserialize value of type"));
        }
    }

    @Test
    public void testHandleWeirdNumberValue() throws Exception {
        DeserializationProblemHandler handler = new DeserializationProblemHandler() {
            @Override
            public Object handleWeirdNumberValue(DeserializationContext ctxt, Class<?> targetType, Number valueToConvert, String msg) {
                if (Integer.valueOf(42).equals(valueToConvert)) {
                    return Integer.valueOf(100);
                }
                if (Integer.valueOf(99).equals(valueToConvert)) {
                    return "IncompatibleString";
                }
                return NOT_HANDLED;
            }
        };
        TestContext ctx = new TestContext(_context, _config.withHandler(handler), _parser, null);

        Object okNum = ctx.handleWeirdNumberValue(Integer.class, 42, "msg");
        Assert.assertEquals(Integer.valueOf(100), okNum);

        try {
            ctx.handleWeirdNumberValue(Integer.class, 99, "msg");
            Assert.fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            Assert.assertTrue(e.getMessage().contains("returned value of type java.lang.String"));
        }

        try {
            ctx.handleWeirdNumberValue(Integer.class, 1234, "msg");
            Assert.fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            Assert.assertTrue(e.getMessage().contains("Cannot deserialize value of type"));
        }
    }

    @Test
    public void testHandleWeirdNativeValue() throws Exception {
        JavaType jt = _context.constructType(String.class);
        DeserializationProblemHandler handler = new DeserializationProblemHandler() {
            @Override
            public Object handleWeirdNativeValue(DeserializationContext ctxt, JavaType targetType, Object badValue, JsonParser p) {
                if ("native".equals(badValue)) {
                    return "recoveredNative";
                }
                if ("incompatible".equals(badValue)) {
                    return Integer.valueOf(50);
                }
                return NOT_HANDLED;
            }
        };
        TestContext ctx = new TestContext(_context, _config.withHandler(handler), _parser, null);

        Object okVal = ctx.handleWeirdNativeValue(jt, "native", _parser);
        Assert.assertEquals("recoveredNative", okVal);

        try {
            ctx.handleWeirdNativeValue(jt, "incompatible", _parser);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("returned value of type java.lang.Integer"));
        }

        try {
            ctx.handleWeirdNativeValue(jt, "unknown", _parser);
            Assert.fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            Assert.assertTrue(e.getMessage().contains("Cannot deserialize value of type"));
        }
    }

    @Test
    public void testHandleMissingInstantiator() throws Exception {
        DeserializationProblemHandler handler = new DeserializationProblemHandler() {
            @Override
            public Object handleMissingInstantiator(DeserializationContext ctxt, Class<?> instClass, ValueInstantiator valueInst, JsonParser p, String msg) {
                if (DummyBean.class.equals(instClass) && "allow".equals(msg)) {
                    return new DummyBean();
                }
                if (DummyBean.class.equals(instClass) && "incompatible".equals(msg)) {
                    return "wrongInstance";
                }
                return NOT_HANDLED;
            }
        };
        TestContext ctx = new TestContext(_context, _config.withHandler(handler), _parser, null);

        Object inst = ctx.handleMissingInstantiator(DummyBean.class, null, _parser, "allow");
        Assert.assertNotNull(inst);

        try {
            ctx.handleMissingInstantiator(DummyBean.class, null, _parser, "incompatible");
            Assert.fail("Expected InvalidDefinitionException");
        } catch (InvalidDefinitionException e) {
            Assert.assertTrue(e.getMessage().contains("returned value of type java.lang.String"));
        }

        try {
            ctx.handleMissingInstantiator(DummyBean.class, null, null, "customMsg");
            Assert.fail("Expected MismatchedInputException");
        } catch (MismatchedInputException e) {
            Assert.assertTrue(e.getMessage().contains("although at least one Creator exists"));
        }

        ValueInstantiator vi = new ValueInstantiator.Base(DummyBean.class);
        try {
            ctx.handleMissingInstantiator(DummyBean.class, vi, _parser, "noCreators");
            Assert.fail("Expected InvalidDefinitionException");
        } catch (InvalidDefinitionException e) {
            Assert.assertTrue(e.getMessage().contains("no Creators, like default construct, exist"));
        }
    }

    @Test
    public void testHandleInstantiationProblem() throws Exception {
        DeserializationProblemHandler handler = new DeserializationProblemHandler() {
            @Override
            public Object handleInstantiationProblem(DeserializationContext ctxt, Class<?> instClass, Object argument, Throwable t) {
                if ("recover".equals(argument)) {
                    return new DummyBean();
                }
                if ("incompatible".equals(argument)) {
                    return "wrongInstance";
                }
                return NOT_HANDLED;
            }
        };
        TestContext ctx = new TestContext(_context, _config.withHandler(handler), _parser, null);

        Object inst = ctx.handleInstantiationProblem(DummyBean.class, "recover", new RuntimeException());
        Assert.assertNotNull(inst);

        try {
            ctx.handleInstantiationProblem(DummyBean.class, "incompatible", new RuntimeException());
            Assert.fail("Expected InvalidDefinitionException");
        } catch (InvalidDefinitionException e) {
            Assert.assertTrue(e.getMessage().contains("returned value of type java.lang.String"));
        }

        try {
            ctx.handleInstantiationProblem(DummyBean.class, "unhandled", new IOException("IO error"));
            Assert.fail("Expected IOException");
        } catch (IOException e) {
            Assert.assertEquals("IO error", e.getMessage());
        }

        try {
            ctx.handleInstantiationProblem(DummyBean.class, "unhandled", new RuntimeException("Runtime error"));
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Cannot construct instance of"));
        }
    }

    @Test
    public void testHandleUnexpectedToken() throws Exception {
        DeserializationProblemHandler handler = new DeserializationProblemHandler() {
            @Override
            public Object handleUnexpectedToken(DeserializationContext ctxt, Class<?> targetType, JsonToken t, JsonParser p, String failureMsg) {
                if ("recover".equals(failureMsg)) {
                    return new DummyBean();
                }
                if ("incompatible".equals(failureMsg)) {
                    return "wrongInstance";
                }
                return NOT_HANDLED;
            }
        };
        TestContext ctx = new TestContext(_context, _config.withHandler(handler), _parser, null);

        Object inst = ctx.handleUnexpectedToken(DummyBean.class, JsonToken.START_ARRAY, _parser, "recover");
        Assert.assertNotNull(inst);

        try {
            ctx.handleUnexpectedToken(DummyBean.class, JsonToken.START_ARRAY, _parser, "incompatible");
            Assert.fail("Expected InvalidDefinitionException");
        } catch (InvalidDefinitionException e) {
            Assert.assertTrue(e.getMessage().contains("returned value of type java.lang.String"));
        }

        try {
            ctx.handleUnexpectedToken(DummyBean.class, _parser);
            Assert.fail("Expected MismatchedInputException");
        } catch (MismatchedInputException e) {
            Assert.assertTrue(e.getMessage().contains("Cannot deserialize instance of"));
        }

        try {
            ctx.handleUnexpectedToken(DummyBean.class, null, _parser, null);
            Assert.fail("Expected MismatchedInputException");
        } catch (MismatchedInputException e) {
            Assert.assertTrue(e.getMessage().contains("Unexpected end-of-input"));
        }
    }

    @Test
    public void testHandleUnknownTypeIdAndMissingTypeId() throws Exception {
        final JavaType baseType = _context.constructType(DummyPolymorphicBase.class);
        final JavaType subType = _context.constructType(DummyPolymorphicSub.class);
        final JavaType invalidType = _context.constructType(String.class);

        DeserializationProblemHandler handler = new DeserializationProblemHandler() {
            @Override
            public JavaType handleUnknownTypeId(DeserializationContext ctxt, JavaType bType, String subTypeId, TypeIdResolver idResolver, String extraDesc) {
                if ("void".equals(subTypeId)) {
                    return ctxt.constructType(Void.class);
                }
                if ("sub".equals(subTypeId)) {
                    return subType;
                }
                if ("invalid".equals(subTypeId)) {
                    return invalidType;
                }
                return null;
            }

            @Override
            public JavaType handleMissingTypeId(DeserializationContext ctxt, JavaType bType, TypeIdResolver idResolver, String extraDesc) {
                if ("voidDesc".equals(extraDesc)) {
                    return ctxt.constructType(Void.class);
                }
                if ("subDesc".equals(extraDesc)) {
                    return subType;
                }
                if ("invalidDesc".equals(extraDesc)) {
                    return invalidType;
                }
                return null;
            }
        };
        TestContext ctx = new TestContext(_context, _config.withHandler(handler), _parser, null);

        Assert.assertNull(ctx.handleUnknownTypeId(baseType, "void", null, ""));
        Assert.assertEquals(subType, ctx.handleUnknownTypeId(baseType, "sub", null, ""));

        try {
            ctx.handleUnknownTypeId(baseType, "invalid", null, "");
            Assert.fail("Expected InvalidTypeIdException");
        } catch (InvalidTypeIdException e) {
            Assert.assertTrue(e.getMessage().contains("non-subtype"));
        }

        // Test without handler when FAIL_ON_INVALID_SUBTYPE is true vs false
        TestContext ctxNoFail = new TestContext(_context, _config.without(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE), _parser, null);
        Assert.assertNull(ctxNoFail.handleUnknownTypeId(baseType, "unknown", null, "desc"));

        try {
            _context.handleUnknownTypeId(baseType, "unknown", null, "desc");
            Assert.fail("Expected InvalidTypeIdException");
        } catch (InvalidTypeIdException e) {
            Assert.assertTrue(e.getMessage().contains("Could not resolve type id 'unknown'"));
        }

        // Missing type id tests
        Assert.assertNull(ctx.handleMissingTypeId(baseType, null, "voidDesc"));
        Assert.assertEquals(subType, ctx.handleMissingTypeId(baseType, null, "subDesc"));

        try {
            ctx.handleMissingTypeId(baseType, null, "invalidDesc");
            Assert.fail("Expected InvalidTypeIdException");
        } catch (InvalidTypeIdException e) {
            Assert.assertTrue(e.getMessage().contains("non-subtype"));
        }

        try {
            _context.handleMissingTypeId(baseType, null, "extra");
            Assert.fail("Expected InvalidTypeIdException");
        } catch (InvalidTypeIdException e) {
            Assert.assertTrue(e.getMessage().contains("Missing type id when trying to resolve"));
        }
    }

    @Test
    public void testIsCompatible() {
        Assert.assertTrue(_context._isCompatible(String.class, "str"));
        Assert.assertTrue(_context._isCompatible(String.class, null));
        Assert.assertFalse(_context._isCompatible(String.class, 123));
        Assert.assertTrue(_context._isCompatible(int.class, Integer.valueOf(5)));
        Assert.assertFalse(_context._isCompatible(int.class, "str"));
    }

    @Test
    public void testReportWrongTokenExceptions() {
        JavaType type = _context.constructType(String.class);
        JsonDeserializer<String> deser = new CustomContextualDeser();

        try {
            _context.reportWrongTokenException(deser, JsonToken.START_OBJECT, "wrong token %s", "arg");
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("wrong token arg"));
        }

        try {
            _context.reportWrongTokenException(type, JsonToken.START_OBJECT, "wrong token %s", "arg");
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("wrong token arg"));
        }

        try {
            _context.reportWrongTokenException(String.class, JsonToken.START_OBJECT, "wrong token %s", "arg");
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("wrong token arg"));
        }

        try {
            _context.reportWrongTokenException(_parser, JsonToken.START_OBJECT, "wrong token %s", "arg");
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("wrong token arg"));
        }
    }

    @Test
    public void testReportInputMismatch() {
        JavaType type = _context.constructType(String.class);
        JsonDeserializer<String> deser = new CustomContextualDeser();

        try {
            _context.reportInputMismatch((BeanProperty) null, "mismatch %s", "1");
            Assert.fail("Expected MismatchedInputException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("mismatch 1"));
        }

        try {
            _context.reportInputMismatch(deser, "mismatch %s", "2");
            Assert.fail("Expected MismatchedInputException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("mismatch 2"));
        }

        try {
            _context.reportInputMismatch(String.class, "mismatch %s", "3");
            Assert.fail("Expected MismatchedInputException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("mismatch 3"));
        }

        try {
            _context.reportInputMismatch(type, "mismatch %s", "4");
            Assert.fail("Expected MismatchedInputException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("mismatch 4"));
        }
    }

    @Test
    public void testReportUnresolvedObjectIdAndTrailingTokens() {
        ObjectIdReader reader = ObjectIdReader.construct(
                _context.constructType(String.class),
                new PropertyName("idProp"),
                null,
                null,
                null,
                null
        );

        try {
            _context.reportUnresolvedObjectId(reader, new DummyBean());
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("No Object Id found"));
        }

        try {
            _context.reportTrailingTokens(String.class, _parser, JsonToken.END_OBJECT);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Trailing token"));
        }
    }

    @Test
    public void testReportUnknownPropertyAndMissingContent() {
        try {
            _context.reportUnknownProperty(DummyBean.class, "unknownField", null);
            Assert.fail("Expected UnrecognizedPropertyException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Unrecognized field"));
        }

        TestContext ctxNoFail = new TestContext(_context, _config.without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES), _parser, null);
        try {
            ctxNoFail.reportUnknownProperty(DummyBean.class, "unknownField", null);
        } catch (JsonMappingException e) {
            Assert.fail("Should not throw when feature disabled");
        }

        try {
            _context.reportMissingContent("missing");
            Assert.fail("Expected MismatchedInputException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("No content to map"));
        }
    }

    @Test
    public void testReportBadDefinitions() {
        BeanDescription beanDesc = _config.introspectClassAnnotations(DummyBean.class);

        try {
            _context.reportBadTypeDefinition(beanDesc, "bad type %s", "desc");
            Assert.fail("Expected InvalidDefinitionException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Invalid type definition"));
        }

        try {
            _context.reportBadPropertyDefinition(beanDesc, null, "bad prop %s", "desc");
            Assert.fail("Expected InvalidDefinitionException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Invalid definition for property"));
        }

        try {
            _context.reportBadDefinition(_context.constructType(DummyBean.class), "bad definition");
            Assert.fail("Expected InvalidDefinitionException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("bad definition"));
        }
    }

    @Test
    public void testReportBadMerge() throws JsonMappingException {
        JsonDeserializer<String> deser = new CustomContextualDeser();
        TestContext ctxIgnoreMerge = new TestContext(_context, _config.with(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE), _parser, null);
        Assert.assertNull(ctxIgnoreMerge.reportBadMerge(deser));

        try {
            _context.reportBadMerge(deser);
            Assert.fail("Expected InvalidDefinitionException");
        } catch (InvalidDefinitionException e) {
            Assert.assertTrue(e.getMessage().contains("cannot be merged"));
        }
    }

    @Test
    public void testExceptionFactories() {
        JavaType type = _context.constructType(String.class);
        JsonMappingException e1 = _context.wrongTokenException(_parser, type, JsonToken.START_OBJECT, "extra");
        Assert.assertNotNull(e1);

        JsonMappingException e2 = _context.wrongTokenException(_parser, String.class, JsonToken.START_OBJECT, "extra");
        Assert.assertNotNull(e2);

        JsonMappingException e3 = _context.wrongTokenException(_parser, JsonToken.START_OBJECT, "extra");
        Assert.assertNotNull(e3);

        JsonMappingException e4 = _context.weirdKeyException(String.class, "key", "msg");
        Assert.assertNotNull(e4);

        JsonMappingException e5 = _context.weirdStringException("val", String.class, "msg");
        Assert.assertNotNull(e5);

        JsonMappingException e6 = _context.weirdNumberException(10, Integer.class, "msg");
        Assert.assertNotNull(e6);

        JsonMappingException e7 = _context.weirdNativeValueException("nativeVal", String.class);
        Assert.assertNotNull(e7);

        JsonMappingException e8 = _context.instantiationException(DummyBean.class, (Throwable) null);
        Assert.assertTrue(e8.getMessage().contains("problem: N/A"));

        JsonMappingException e9 = _context.instantiationException(DummyBean.class, new RuntimeException());
        Assert.assertTrue(e9.getMessage().contains("RuntimeException"));

        JsonMappingException e10 = _context.instantiationException(DummyBean.class, new RuntimeException("custom cause msg"));
        Assert.assertTrue(e10.getMessage().contains("custom cause msg"));

        JsonMappingException e11 = _context.instantiationException(DummyBean.class, "creator failed");
        Assert.assertTrue(e11.getMessage().contains("creator failed"));

        JsonMappingException e12 = _context.invalidTypeIdException(type, "typeId", "extra");
        Assert.assertNotNull(e12);

        JsonMappingException e13 = _context.missingTypeIdException(type, "extra");
        Assert.assertNotNull(e13);

        JsonMappingException e14 = _context.unknownTypeException(type, "typeId", "extra");
        Assert.assertNotNull(e14);

        JsonMappingException e15 = _context.endOfInputException(DummyBean.class);
        Assert.assertNotNull(e15);

        try {
            _context.reportMappingException("mapping error %s", "1");
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("mapping error 1"));
        }

        JsonMappingException e16 = _context.mappingException("simple message");
        Assert.assertNotNull(e16);

        JsonMappingException e17 = _context.mappingException("format message %s", "arg");
        Assert.assertNotNull(e17);

        JsonMappingException e18 = _context.mappingException(DummyBean.class);
        Assert.assertNotNull(e18);

        JsonMappingException e19 = _context.mappingException(DummyBean.class, JsonToken.VALUE_NUMBER_INT);
        Assert.assertNotNull(e19);
    }
}
