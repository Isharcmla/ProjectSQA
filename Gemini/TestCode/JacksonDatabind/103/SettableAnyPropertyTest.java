package com.fasterxml.jackson.databind.deser;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class SettableAnyPropertyTest {

    public static class TestBean {
        public Map<Object, Object> map = new HashMap<Object, Object>();
        public Map<Object, Object> nullMap = null;
        private final Map<Object, Object> privateMap = new HashMap<Object, Object>();

        public void anySetter(String name, Object value) {
            map.put(name, value);
        }

        private void privateAnySetter(String name, Object value) {
            privateMap.put(name, value);
        }

        public void failingSetter(String name, Object value) {
            throw new IllegalArgumentException("explicit error");
        }

        public void failingNullMsgSetter(String name, Object value) {
            throw new IllegalArgumentException((String) null);
        }

        public void failingIoeSetter(String name, Object value) throws IOException {
            throw new IOException("custom IO error");
        }

        public void failingRteSetter(String name, Object value) {
            throw new IllegalStateException("custom RTE error");
        }

        public void failingCustomCheckedSetter(String name, Object value) throws Exception {
            throw new Exception("checked root cause");
        }
    }

    private ObjectMapper _mapper;
    private JsonFactory _jsonFactory;
    private JavaType _type;
    private AnnotatedMethod _annotatedMethod;
    private AnnotatedField _annotatedField;
    private AnnotatedField _nullAnnotatedField;
    private BeanProperty.Std _beanProperty;

    @Before
    public void setUp() throws Exception {
        _mapper = new ObjectMapper();
        _jsonFactory = _mapper.getFactory();
        _type = _mapper.constructType(TestBean.class);

        AnnotatedClass ac = AnnotatedClassResolver.resolve(
                _mapper.getDeserializationConfig(),
                _type,
                _mapper.getDeserializationConfig()
        );

        Method m = TestBean.class.getMethod("anySetter", String.class, Object.class);
        TypeResolutionContext typeResCtxt = new TypeResolutionContext.Basic(
                _mapper.getTypeFactory(), TypeBindings.emptyBindings());
        _annotatedMethod = new AnnotatedMethod(typeResCtxt, m, new AnnotationMap(), null);

        Field f = TestBean.class.getField("map");
        _annotatedField = new AnnotatedField(typeResCtxt, f, new AnnotationMap());

        Field nullF = TestBean.class.getField("nullMap");
        _nullAnnotatedField = new AnnotatedField(typeResCtxt, nullF, new AnnotationMap());

        _beanProperty = new BeanProperty.Std(
                PropertyName.construct("testProperty"),
                _type,
                PropertyName.NO_NAME,
                _annotatedMethod,
                PropertyMetadata.STD_REQUIRED
        );
    }

    @Test
    public void testConstructorsAndAccessors_validInputs_returnsExpected() {
        JsonDeserializer<Object> valDeser = new UntypedObjectDeserializer(null, null);
        SettableAnyProperty prop1 = new SettableAnyProperty(_beanProperty, _annotatedMethod, _type, null, valDeser, null);

        Assert.assertSame(_beanProperty, prop1.getProperty());
        Assert.assertSame(_type, prop1.getType());
        Assert.assertTrue(prop1.hasValueDeserializer());

        SettableAnyProperty prop2 = new SettableAnyProperty(_beanProperty, _annotatedField, _type, null, null);
        Assert.assertFalse(prop2.hasValueDeserializer());
        Assert.assertTrue(prop2._setterIsField);
        Assert.assertFalse(prop1._setterIsField);
    }

    @Test
    public void testWithValueDeserializer_validNewDeserializer_returnsNewInstanceWithUpdatedDeserializer() {
        SettableAnyProperty prop = new SettableAnyProperty(_beanProperty, _annotatedMethod, _type, null, null, null);
        Assert.assertFalse(prop.hasValueDeserializer());

        JsonDeserializer<Object> valDeser = new UntypedObjectDeserializer(null, null);
        SettableAnyProperty newProp = prop.withValueDeserializer(valDeser);

        Assert.assertNotSame(prop, newProp);
        Assert.assertTrue(newProp.hasValueDeserializer());
        Assert.assertSame(_type, newProp.getType());
        Assert.assertSame(_beanProperty, newProp.getProperty());
    }

    @Test
    public void testFixAccess_withMethodAndField_updatesAccessibility() throws Exception {
        Method privateM = TestBean.class.getDeclaredMethod("privateAnySetter", String.class, Object.class);
        TypeResolutionContext typeResCtxt = new TypeResolutionContext.Basic(
                _mapper.getTypeFactory(), TypeBindings.emptyBindings());
        AnnotatedMethod privateAnnotatedMethod = new AnnotatedMethod(typeResCtxt, privateM, new AnnotationMap(), null);

        SettableAnyProperty prop = new SettableAnyProperty(_beanProperty, privateAnnotatedMethod, _type, null, null, null);

        DeserializationConfig config = _mapper.getDeserializationConfig()
                .with(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
        prop.fixAccess(config);

        TestBean bean = new TestBean();
        prop.set(bean, "k1", "v1");
        Assert.assertEquals("v1", bean.privateMap.get("k1"));
    }

    @Test
    public void testReadResolve_validMember_returnsThis() {
        SettableAnyProperty prop = new SettableAnyProperty(_beanProperty, _annotatedMethod, _type, null, null, null);
        Object resolved = prop.readResolve();
        Assert.assertSame(prop, resolved);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadResolve_nullSetter_throwsIllegalArgumentException() {
        SettableAnyProperty prop = new SettableAnyProperty(_beanProperty, null, _type, null, null, null);
        prop.readResolve();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadResolve_setterWithNullAnnotated_throwsIllegalArgumentException() {
        AnnotatedMember mockMember = new AnnotatedMember(null, new AnnotationMap()) {
            @Override
            public java.lang.reflect.AnnotatedElement getAnnotated() {
                return null;
            }
            @Override
            public int getModifiers() { return 0; }
            @Override
            public String getName() { return "mock"; }
            @Override
            public Class<?> getRawType() { return Object.class; }
            @Override
            public JavaType getType() { return _type; }
            @Override
            public Class<?> getDeclaringClass() { return Object.class; }
            @Override
            public AnnotatedMember withAnnotations(AnnotationMap fallback) { return this; }
            @Override
            public Object getValue(Object pojo) { return null; }
            @Override
            public void setValue(Object pojo, Object value) { }
        };

        SettableAnyProperty prop = new SettableAnyProperty(_beanProperty, mockMember, _type, null, null, null);
        prop.readResolve();
    }

    @Test
    public void testSet_usingAnnotatedMethod_success() throws Exception {
        SettableAnyProperty prop = new SettableAnyProperty(_beanProperty, _annotatedMethod, _type, null, null, null);
        TestBean bean = new TestBean();
        prop.set(bean, "key1", "val1");
        Assert.assertEquals("val1", bean.map.get("key1"));
    }

    @Test
    public void testSet_usingAnnotatedField_success() throws Exception {
        SettableAnyProperty prop = new SettableAnyProperty(_beanProperty, _annotatedField, _type, null, null, null);
        TestBean bean = new TestBean();
        prop.set(bean, "fieldKey", "fieldVal");
        Assert.assertEquals("fieldVal", bean.map.get("fieldKey"));
    }

    @Test
    public void testSet_usingAnnotatedFieldNullMap_ignoresGracefully() throws Exception {
        SettableAnyProperty prop = new SettableAnyProperty(_beanProperty, _nullAnnotatedField, _type, null, null, null);
        TestBean bean = new TestBean();
        prop.set(bean, "fieldKey", "fieldVal");
        Assert.assertNull(bean.nullMap);
    }

    @Test
    public void testDeserializeAndSet_withoutKeyDeserializer_success() throws Exception {
        JsonDeserializer<Object> valDeser = new StdDeserializer<Object>(String.class) {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return p.getText();
            }
        };

        SettableAnyProperty prop = new SettableAnyProperty(_beanProperty, _annotatedMethod, _type, null, valDeser, null);

        JsonParser parser = _jsonFactory.createParser("\"deserializedValue\"");
        parser.nextToken();
        DeserializationContext ctxt = _mapper.getDeserializationContext();

        TestBean bean = new TestBean();
        prop.deserializeAndSet(parser, ctxt, bean, "directKey");

        Assert.assertEquals("deserializedValue", bean.map.get("directKey"));
    }

    @Test
    public void testDeserializeAndSet_withKeyDeserializer_transformsKey() throws Exception {
        KeyDeserializer keyDeser = new KeyDeserializer() {
            @Override
            public Object deserializeKey(String key, DeserializationContext ctxt) {
                return "PREFIX_" + key;
            }
        };

        JsonDeserializer<Object> valDeser = new StdDeserializer<Object>(String.class) {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return p.getText();
            }
        };

        SettableAnyProperty prop = new SettableAnyProperty(_beanProperty, _annotatedMethod, _type, keyDeser, valDeser, null);

        JsonParser parser = _jsonFactory.createParser("\"myValue\"");
        parser.nextToken();
        DeserializationContext ctxt = _mapper.getDeserializationContext();

        TestBean bean = new TestBean();
        prop.deserializeAndSet(parser, ctxt, bean, "targetKey");

        Assert.assertEquals("myValue", bean.map.get("PREFIX_targetKey"));
    }

    @Test
    public void testDeserialize_nullToken_returnsNullValue() throws Exception {
        JsonDeserializer<Object> valDeser = new StdDeserializer<Object>(String.class) {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return "notNull";
            }
            @Override
            public Object getNullValue(DeserializationContext ctxt) {
                return "customNull";
            }
        };

        SettableAnyProperty prop = new SettableAnyProperty(_beanProperty, _annotatedMethod, _type, null, valDeser, null);

        JsonParser parser = _jsonFactory.createParser("null");
        parser.nextToken();
        DeserializationContext ctxt = _mapper.getDeserializationContext();

        Object result = prop.deserialize(parser, ctxt);
        Assert.assertEquals("customNull", result);
    }

    @Test
    public void testDeserialize_withTypeDeserializer_invokesDeserializeWithType() throws Exception {
        TypeDeserializer typeDeser = new AsPropertyTypeDeserializer(
                _mapper.constructType(Object.class),
                new ClassNameIdResolver(_mapper.constructType(Object.class), _mapper.getTypeFactory()),
                "@type",
                false,
                _mapper.constructType(Object.class)
        );

        final boolean[] calledWithType = new boolean[]{false};
        JsonDeserializer<Object> valDeser = new StdDeserializer<Object>(Object.class) {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return "plain";
            }
            @Override
            public Object deserializeWithType(JsonParser p, DeserializationContext ctxt, TypeDeserializer typeDeserializer) {
                calledWithType[0] = true;
                return "withType";
            }
        };

        SettableAnyProperty prop = new SettableAnyProperty(_beanProperty, _annotatedMethod, _type, null, valDeser, typeDeser);

        JsonParser parser = _jsonFactory.createParser("\"someString\"");
        parser.nextToken();
        DeserializationContext ctxt = _mapper.getDeserializationContext();

        Object result = prop.deserialize(parser, ctxt);
        Assert.assertEquals("withType", result);
        Assert.assertTrue(calledWithType[0]);
    }

    @Test
    public void testDeserializeAndSet_unresolvedForwardReferenceWithoutObjectIdReader_throwsJsonMappingException() throws Exception {
        final ReadableObjectId roid = new ReadableObjectId(new ObjectIdGenerators.StringIdGenerator().key("testId"));

        JsonDeserializer<Object> valDeser = new StdDeserializer<Object>(Object.class) {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                UnresolvedForwardReference ref = new UnresolvedForwardReference(p, "unresolved ref", p.getCurrentLocation(), roid);
                throw ref;
            }
        };

        SettableAnyProperty prop = new SettableAnyProperty(_beanProperty, _annotatedMethod, _type, null, valDeser, null);

        JsonParser parser = _jsonFactory.createParser("\"val\"");
        parser.nextToken();
        DeserializationContext ctxt = _mapper.getDeserializationContext();

        try {
            prop.deserializeAndSet(parser, ctxt, new TestBean(), "propName");
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Unresolved forward reference but no identity info."));
        }
    }

    @Test
    public void testDeserializeAndSet_unresolvedForwardReferenceWithObjectIdReader_appendsReferringAndResolves() throws Exception {
        final ObjectIdReader oidReader = ObjectIdReader.construct(
                _type,
                PropertyName.construct("id"),
                new ObjectIdGenerators.StringIdGenerator(),
                null,
                null,
                new SimpleObjectIdResolver()
        );

        final ReadableObjectId roid = new ReadableObjectId(new ObjectIdGenerators.StringIdGenerator().key("testId"));

        JsonDeserializer<Object> valDeser = new StdDeserializer<Object>(Object.class) {
            @Override
            public ObjectIdReader getObjectIdReader() {
                return oidReader;
            }

            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                UnresolvedForwardReference ref = new UnresolvedForwardReference(p, "unresolved ref", p.getCurrentLocation(), roid);
                throw ref;
            }
        };

        SettableAnyProperty prop = new SettableAnyProperty(_beanProperty, _annotatedMethod, _type, null, valDeser, null);

        JsonParser parser = _jsonFactory.createParser("\"val\"");
        parser.nextToken();
        DeserializationContext ctxt = _mapper.getDeserializationContext();
        TestBean bean = new TestBean();

        prop.deserializeAndSet(parser, ctxt, bean, "forwardKey");

        Assert.assertTrue(roid.hasReferringProperties());

        roid.setResolver(new SimpleObjectIdResolver());
        roid.bindItem("resolvedVal");

        Assert.assertEquals("resolvedVal", bean.map.get("forwardKey"));
    }

    @Test
    public void testAnySetterReferring_unregisteredId_throwsIllegalArgumentException() throws Exception {
        final ObjectIdReader oidReader = ObjectIdReader.construct(
                _type,
                PropertyName.construct("id"),
                new ObjectIdGenerators.StringIdGenerator(),
                null,
                null,
                new SimpleObjectIdResolver()
        );

        final ReadableObjectId roid = new ReadableObjectId(new ObjectIdGenerators.StringIdGenerator().key("expectedId"));
        final UnresolvedForwardReference[] capturedRef = new UnresolvedForwardReference[1];

        JsonDeserializer<Object> valDeser = new StdDeserializer<Object>(Object.class) {
            @Override
            public ObjectIdReader getObjectIdReader() {
                return oidReader;
            }

            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                capturedRef[0] = new UnresolvedForwardReference(p, "unresolved ref", p.getCurrentLocation(), roid);
                throw capturedRef[0];
            }
        };

        SettableAnyProperty prop = new SettableAnyProperty(_beanProperty, _annotatedMethod, _type, null, valDeser, null);

        JsonParser parser = _jsonFactory.createParser("\"val\"");
        parser.nextToken();
        DeserializationContext ctxt = _mapper.getDeserializationContext();
        TestBean bean = new TestBean();

        prop.deserializeAndSet(parser, ctxt, bean, "forwardKey");

        ReadableObjectId.Referring referring = (ReadableObjectId.Referring) roid.referringProperties().next();
        try {
            referring.handleResolvedForwardReference("wrongId", "resolvedVal");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("wasn't previously registered"));
        }
    }

    @Test
    public void testThrowAsIOE_illegalArgumentExceptionWithMessage_wrapsInJsonMappingException() throws Exception {
        Method m = TestBean.class.getMethod("failingSetter", String.class, Object.class);
        TypeResolutionContext typeResCtxt = new TypeResolutionContext.Basic(
                _mapper.getTypeFactory(), TypeBindings.emptyBindings());
        AnnotatedMethod annotatedM = new AnnotatedMethod(typeResCtxt, m, new AnnotationMap(), null);
        SettableAnyProperty prop = new SettableAnyProperty(_beanProperty, annotatedM, _type, null, null, null);

        TestBean bean = new TestBean();
        try {
            prop.set(bean, "errProp", 123);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Problem deserializing \"any\" property 'errProp'"));
            Assert.assertTrue(e.getMessage().contains("problem: explicit error"));
            Assert.assertTrue(e.getMessage().contains("actual type: java.lang.Integer"));
        }
    }

    @Test
    public void testThrowAsIOE_illegalArgumentExceptionWithoutMessage_wrapsWithNoErrorMessageText() throws Exception {
        Method m = TestBean.class.getMethod("failingNullMsgSetter", String.class, Object.class);
        TypeResolutionContext typeResCtxt = new TypeResolutionContext.Basic(
                _mapper.getTypeFactory(), TypeBindings.emptyBindings());
        AnnotatedMethod annotatedM = new AnnotatedMethod(typeResCtxt, m, new AnnotationMap(), null);
        SettableAnyProperty prop = new SettableAnyProperty(_beanProperty, annotatedM, _type, null, null, null);

        TestBean bean = new TestBean();
        try {
            prop.set(bean, "errProp", "testStr");
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("(no error message provided)"));
        }
    }

    @Test
    public void testThrowAsIOE_ioException_rethrowsDirectly() throws Exception {
        Method m = TestBean.class.getMethod("failingIoeSetter", String.class, Object.class);
        TypeResolutionContext typeResCtxt = new TypeResolutionContext.Basic(
                _mapper.getTypeFactory(), TypeBindings.emptyBindings());
        AnnotatedMethod annotatedM = new AnnotatedMethod(typeResCtxt, m, new AnnotationMap(), null);
        SettableAnyProperty prop = new SettableAnyProperty(_beanProperty, annotatedM, _type, null, null, null);

        TestBean bean = new TestBean();
        try {
            prop.set(bean, "errProp", "val");
            Assert.fail("Expected IOException");
        } catch (IOException e) {
            Assert.assertEquals("custom IO error", e.getMessage());
        }
    }

    @Test
    public void testThrowAsIOE_runtimeException_rethrowsDirectly() throws Exception {
        Method m = TestBean.class.getMethod("failingRteSetter", String.class, Object.class);
        TypeResolutionContext typeResCtxt = new TypeResolutionContext.Basic(
                _mapper.getTypeFactory(), TypeBindings.emptyBindings());
        AnnotatedMethod annotatedM = new AnnotatedMethod(typeResCtxt, m, new AnnotationMap(), null);
        SettableAnyProperty prop = new SettableAnyProperty(_beanProperty, annotatedM, _type, null, null, null);

        TestBean bean = new TestBean();
        try {
            prop.set(bean, "errProp", "val");
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            Assert.assertEquals("custom RTE error", e.getMessage());
        }
    }

    @Test
    public void testThrowAsIOE_genericCheckedException_wrapsInJsonMappingException() throws Exception {
        Method m = TestBean.class.getMethod("failingCustomCheckedSetter", String.class, Object.class);
        TypeResolutionContext typeResCtxt = new TypeResolutionContext.Basic(
                _mapper.getTypeFactory(), TypeBindings.emptyBindings());
        AnnotatedMethod annotatedM = new AnnotatedMethod(typeResCtxt, m, new AnnotationMap(), null);
        SettableAnyProperty prop = new SettableAnyProperty(_beanProperty, annotatedM, _type, null, null, null);

        TestBean bean = new TestBean();
        try {
            prop.set(bean, "errProp", "val");
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("checked root cause"));
        }
    }

    @Test
    public void testToString_validSetter_containsClassName() {
        SettableAnyProperty prop = new SettableAnyProperty(_beanProperty, _annotatedMethod, _type, null, null, null);
        String str = prop.toString();
        Assert.assertEquals("[any property on class " + TestBean.class.getName() + "]", str);
    }
}
