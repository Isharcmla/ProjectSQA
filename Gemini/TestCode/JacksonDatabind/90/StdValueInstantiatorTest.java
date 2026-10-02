package com.fasterxml.jackson.databind.deser.std;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class StdValueInstantiatorTest {

    static class DummyBean {
        String strVal;
        int intVal;
        long longVal;
        double doubleVal;
        boolean boolVal;

        public DummyBean() {}

        public DummyBean(String strVal) {
            if ("throw".equals(strVal)) {
                throw new IllegalArgumentException("invalid string");
            }
            this.strVal = strVal;
        }

        public DummyBean(String strVal, int intVal) {
            if ("throw".equals(strVal)) {
                throw new RuntimeException("custom ctor error");
            }
            this.strVal = strVal;
            this.intVal = intVal;
        }

        public static DummyBean createInt(int val) {
            if (val == -999) {
                throw new IllegalArgumentException("bad int");
            }
            DummyBean bean = new DummyBean();
            bean.intVal = val;
            return bean;
        }

        public static DummyBean createLong(long val) {
            if (val == -999L) {
                throw new IllegalArgumentException("bad long");
            }
            DummyBean bean = new DummyBean();
            bean.longVal = val;
            return bean;
        }

        public static DummyBean createDouble(double val) {
            if (val < 0) {
                throw new IllegalArgumentException("bad double");
            }
            DummyBean bean = new DummyBean();
            bean.doubleVal = val;
            return bean;
        }

        public static DummyBean createBoolean(boolean val) {
            DummyBean bean = new DummyBean();
            bean.boolVal = val;
            return bean;
        }

        public static DummyBean createThrowing(String s) {
            throw new RuntimeException("factory error");
        }
    }

    static class FailingConstructorBean {
        public FailingConstructorBean() {
            throw new IllegalStateException("default ctor boom");
        }
    }

    static class TestSettableBeanProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;
        private final Object _injectableId;

        public TestSettableBeanProperty(PropertyName name, JavaType type, Object injectableId) {
            super(name, type, null, null);
            this._injectableId = injectableId;
        }

        @Override
        public Object getInjectableValueId() {
            return _injectableId;
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
        @Override
        public SettableBeanProperty withName(PropertyName newName) { return this; }
        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
        @Override
        public AnnotatedMember getMember() { return null; }
        @Override
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {}
        @Override
        public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException { return instance; }
        @Override
        public void set(Object instance, Object value) throws IOException {}
        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException { return instance; }
    }

    static class SubStdValueInstantiator extends StdValueInstantiator {
        private static final long serialVersionUID = 1L;

        public SubStdValueInstantiator(StdValueInstantiator src) {
            super(src);
        }

        @SuppressWarnings("deprecation")
        @Override
        public JsonMappingException wrapException(Throwable t) {
            return super.wrapException(t);
        }

        @Override
        public JsonMappingException unwrapAndWrapException(DeserializationContext ctxt, Throwable t) {
            return super.unwrapAndWrapException(ctxt, t);
        }

        @Override
        public JsonMappingException wrapAsJsonMappingException(DeserializationContext ctxt, Throwable t) {
            return super.wrapAsJsonMappingException(ctxt, t);
        }

        @Override
        public JsonMappingException rewrapCtorProblem(DeserializationContext ctxt, Throwable t) {
            return super.rewrapCtorProblem(ctxt, t);
        }
    }

    private DeserializationContext createDeserializationContext(ObjectMapper mapper) throws Exception {
        return mapper.getDeserializationContext();
    }

    private AnnotatedConstructor findConstructor(Class<?> cls, Class<?>... paramTypes) throws Exception {
        Constructor<?> ctor = cls.getDeclaredConstructor(paramTypes);
        TypeResolutionContext typeRes = new TypeResolutionContext.Basic(TypeFactory.defaultInstance(), TypeFactory.defaultInstance().constructType(cls).getBindings());
        return new AnnotatedConstructor(typeRes, ctor, new AnnotationMap(), new AnnotationMap[paramTypes.length]);
    }

    private AnnotatedMethod findMethod(Class<?> cls, String name, Class<?>... paramTypes) throws Exception {
        Method method = cls.getDeclaredMethod(name, paramTypes);
        TypeResolutionContext typeRes = new TypeResolutionContext.Basic(TypeFactory.defaultInstance(), TypeFactory.defaultInstance().constructType(cls).getBindings());
        return new AnnotatedMethod(typeRes, method, new AnnotationMap(), new AnnotationMap[paramTypes.length]);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructors_nullAndNonNull() {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();

        StdValueInstantiator instClassNull = new StdValueInstantiator(config, (Class<?>) null);
        Assert.assertEquals("UNKNOWN TYPE", instClassNull.getValueTypeDesc());
        Assert.assertEquals(Object.class, instClassNull.getValueClass());

        StdValueInstantiator instClass = new StdValueInstantiator(config, DummyBean.class);
        Assert.assertEquals(DummyBean.class.getName(), instClass.getValueTypeDesc());
        Assert.assertEquals(DummyBean.class, instClass.getValueClass());

        StdValueInstantiator instTypeNull = new StdValueInstantiator(config, (JavaType) null);
        Assert.assertEquals("UNKNOWN TYPE", instTypeNull.getValueTypeDesc());
        Assert.assertEquals(Object.class, instTypeNull.getValueClass());

        JavaType jt = TypeFactory.defaultInstance().constructType(DummyBean.class);
        StdValueInstantiator instType = new StdValueInstantiator(config, jt);
        Assert.assertEquals(jt.toString(), instType.getValueTypeDesc());
        Assert.assertEquals(DummyBean.class, instType.getValueClass());
    }

    @Test
    public void testCopyConstructor_andGetters() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType jt = TypeFactory.defaultInstance().constructType(DummyBean.class);

        StdValueInstantiator src = new StdValueInstantiator(config, jt);

        AnnotatedConstructor defaultCtor = findConstructor(DummyBean.class);
        AnnotatedConstructor withArgsCtor = findConstructor(DummyBean.class, String.class, int.class);
        AnnotatedMethod stringMethod = findMethod(DummyBean.class, "createThrowing", String.class);
        AnnotatedMethod intMethod = findMethod(DummyBean.class, "createInt", int.class);
        AnnotatedMethod longMethod = findMethod(DummyBean.class, "createLong", long.class);
        AnnotatedMethod doubleMethod = findMethod(DummyBean.class, "createDouble", double.class);
        AnnotatedMethod boolMethod = findMethod(DummyBean.class, "createBoolean", boolean.class);

        src.configureFromObjectSettings(defaultCtor, stringMethod, jt, null, withArgsCtor, null);
        src.configureFromArraySettings(stringMethod, jt, null);
        src.configureFromStringCreator(stringMethod);
        src.configureFromIntCreator(intMethod);
        src.configureFromLongCreator(longMethod);
        src.configureFromDoubleCreator(doubleMethod);
        src.configureFromBooleanCreator(boolMethod);

        TypeResolutionContext typeRes = new TypeResolutionContext.Basic(TypeFactory.defaultInstance(), jt.getBindings());
        AnnotatedParameter param = new AnnotatedParameter(withArgsCtor, jt, typeRes, new AnnotationMap(), 0);
        src.configureIncompleteParameter(param);

        SubStdValueInstantiator copy = new SubStdValueInstantiator(src);

        Assert.assertEquals(src.getValueTypeDesc(), copy.getValueTypeDesc());
        Assert.assertEquals(src.getValueClass(), copy.getValueClass());
        Assert.assertEquals(src.getDefaultCreator(), copy.getDefaultCreator());
        Assert.assertEquals(src.getDelegateCreator(), copy.getDelegateCreator());
        Assert.assertEquals(src.getArrayDelegateCreator(), copy.getArrayDelegateCreator());
        Assert.assertEquals(src.getWithArgsCreator(), copy.getWithArgsCreator());
        Assert.assertEquals(src.getDelegateType(config), copy.getDelegateType(config));
        Assert.assertEquals(src.getArrayDelegateType(config), copy.getArrayDelegateType(config));
        Assert.assertEquals(src.getFromObjectArguments(config), copy.getFromObjectArguments(config));
        Assert.assertEquals(param, src.getIncompleteParameter());
        Assert.assertTrue(copy.canCreateUsingDefault());
        Assert.assertTrue(copy.canCreateUsingDelegate());
        Assert.assertTrue(copy.canCreateUsingArrayDelegate());
        Assert.assertTrue(copy.canCreateFromObjectWith());
        Assert.assertTrue(copy.canCreateFromString());
        Assert.assertTrue(copy.canCreateFromInt());
        Assert.assertTrue(copy.canCreateFromLong());
        Assert.assertTrue(copy.canCreateFromDouble());
        Assert.assertTrue(copy.canCreateFromBoolean());
    }

    @Test
    public void testCreateUsingDefault_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        StdValueInstantiator inst = new StdValueInstantiator(mapper.getDeserializationConfig(), DummyBean.class);

        AnnotatedConstructor ctor = findConstructor(DummyBean.class);
        inst.configureFromObjectSettings(ctor, null, null, null, null, null);

        Object result = inst.createUsingDefault(ctxt);
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof DummyBean);
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateUsingDefault_unconfigured_throwsException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        StdValueInstantiator inst = new StdValueInstantiator(mapper.getDeserializationConfig(), DummyBean.class);

        inst.createUsingDefault(ctxt);
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateUsingDefault_throwingCtor_throwsException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        StdValueInstantiator inst = new StdValueInstantiator(mapper.getDeserializationConfig(), FailingConstructorBean.class);

        AnnotatedConstructor ctor = findConstructor(FailingConstructorBean.class);
        inst.configureFromObjectSettings(ctor, null, null, null, null, null);

        inst.createUsingDefault(ctxt);
    }

    @Test
    public void testCreateFromObjectWith_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        StdValueInstantiator inst = new StdValueInstantiator(mapper.getDeserializationConfig(), DummyBean.class);

        AnnotatedConstructor ctor = findConstructor(DummyBean.class, String.class, int.class);
        inst.configureFromObjectSettings(null, null, null, null, ctor, null);

        Object[] args = new Object[] { "testVal", 42 };
        Object result = inst.createFromObjectWith(ctxt, args);
        Assert.assertNotNull(result);
        DummyBean bean = (DummyBean) result;
        Assert.assertEquals("testVal", bean.strVal);
        Assert.assertEquals(42, bean.intVal);
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateFromObjectWith_unconfigured_throwsException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        StdValueInstantiator inst = new StdValueInstantiator(mapper.getDeserializationConfig(), DummyBean.class);

        inst.createFromObjectWith(ctxt, new Object[] { "val", 1 });
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateFromObjectWith_throwingCtor_throwsException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        StdValueInstantiator inst = new StdValueInstantiator(mapper.getDeserializationConfig(), DummyBean.class);

        AnnotatedConstructor ctor = findConstructor(DummyBean.class, String.class, int.class);
        inst.configureFromObjectSettings(null, null, null, null, ctor, null);

        inst.createFromObjectWith(ctxt, new Object[] { "throw", 1 });
    }

    @Test
    public void testCreateFromString_successAndFallback() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        StdValueInstantiator inst = new StdValueInstantiator(mapper.getDeserializationConfig(), DummyBean.class);

        AnnotatedConstructor ctor = findConstructor(DummyBean.class, String.class);
        inst.configureFromStringCreator(ctor);

        Object res1 = inst.createFromString(ctxt, "hello");
        Assert.assertEquals("hello", ((DummyBean) res1).strVal);

        Object resEmpty = inst.createFromString(ctxt, "");
        Assert.assertEquals("", ((DummyBean) resEmpty).strVal);
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateFromString_throwing_throwsException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        StdValueInstantiator inst = new StdValueInstantiator(mapper.getDeserializationConfig(), DummyBean.class);

        AnnotatedConstructor ctor = findConstructor(DummyBean.class, String.class);
        inst.configureFromStringCreator(ctor);

        inst.createFromString(ctxt, "throw");
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateFromString_nullCreatorFallback_throwsException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        StdValueInstantiator inst = new StdValueInstantiator(mapper.getDeserializationConfig(), DummyBean.class);

        inst.createFromString(ctxt, "fallback");
    }

    @Test
    public void testCreateFromInt_successWideningAndFailures() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = createDeserializationContext(mapper);

        StdValueInstantiator instInt = new StdValueInstantiator(mapper.getDeserializationConfig(), DummyBean.class);
        AnnotatedMethod intMethod = findMethod(DummyBean.class, "createInt", int.class);
        instInt.configureFromIntCreator(intMethod);
        Object resInt = instInt.createFromInt(ctxt, 123);
        Assert.assertEquals(123, ((DummyBean) resInt).intVal);

        StdValueInstantiator instLong = new StdValueInstantiator(mapper.getDeserializationConfig(), DummyBean.class);
        AnnotatedMethod longMethod = findMethod(DummyBean.class, "createLong", long.class);
        instLong.configureFromLongCreator(longMethod);
        Object resWidened = instLong.createFromInt(ctxt, 456);
        Assert.assertEquals(456L, ((DummyBean) resWidened).longVal);

        StdValueInstantiator instNone = new StdValueInstantiator(mapper.getDeserializationConfig(), DummyBean.class);
        try {
            instNone.createFromInt(ctxt, 789);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException ignored) {}

        try {
            instInt.createFromInt(ctxt, -999);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException ignored) {}

        try {
            instLong.createFromInt(ctxt, -999);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException ignored) {}
    }

    @Test
    public void testCreateFromLong_successAndFailure() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        StdValueInstantiator inst = new StdValueInstantiator(mapper.getDeserializationConfig(), DummyBean.class);

        AnnotatedMethod longMethod = findMethod(DummyBean.class, "createLong", long.class);
        inst.configureFromLongCreator(longMethod);

        Object res = inst.createFromLong(ctxt, 9876543210L);
        Assert.assertEquals(9876543210L, ((DummyBean) res).longVal);

        try {
            inst.createFromLong(ctxt, -999L);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException ignored) {}

        StdValueInstantiator instUnconf = new StdValueInstantiator(mapper.getDeserializationConfig(), DummyBean.class);
        try {
            instUnconf.createFromLong(ctxt, 10L);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException ignored) {}
    }

    @Test
    public void testCreateFromDouble_successAndFailure() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        StdValueInstantiator inst = new StdValueInstantiator(mapper.getDeserializationConfig(), DummyBean.class);

        AnnotatedMethod doubleMethod = findMethod(DummyBean.class, "createDouble", double.class);
        inst.configureFromDoubleCreator(doubleMethod);

        Object res = inst.createFromDouble(ctxt, 3.1415);
        Assert.assertEquals(3.1415, ((DummyBean) res).doubleVal, 0.00001);

        try {
            inst.createFromDouble(ctxt, -1.0);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException ignored) {}

        StdValueInstantiator instUnconf = new StdValueInstantiator(mapper.getDeserializationConfig(), DummyBean.class);
        try {
            instUnconf.createFromDouble(ctxt, 2.0);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException ignored) {}
    }

    @Test
    public void testCreateFromBoolean_successAndFailure() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        StdValueInstantiator inst = new StdValueInstantiator(mapper.getDeserializationConfig(), DummyBean.class);

        AnnotatedMethod boolMethod = findMethod(DummyBean.class, "createBoolean", boolean.class);
        inst.configureFromBooleanCreator(boolMethod);

        Object resTrue = inst.createFromBoolean(ctxt, true);
        Assert.assertTrue(((DummyBean) resTrue).boolVal);

        Object resFalse = inst.createFromBoolean(ctxt, false);
        Assert.assertFalse(((DummyBean) resFalse).boolVal);

        StdValueInstantiator instUnconf = new StdValueInstantiator(mapper.getDeserializationConfig(), DummyBean.class);
        try {
            instUnconf.createFromBoolean(ctxt, true);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException ignored) {}
    }

    @Test
    public void testCreateUsingDelegate_andArrayDelegate_fallbackAndArguments() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType jt = TypeFactory.defaultInstance().constructType(DummyBean.class);
        DeserializationConfig config = mapper.getDeserializationConfig();

        InjectableValues.Std injectables = new InjectableValues.Std();
        injectables.addValue("injectedKey", 777);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        StdValueInstantiator inst = new StdValueInstantiator(config, jt);
        AnnotatedConstructor stringCtor = findConstructor(DummyBean.class, String.class);
        AnnotatedConstructor withArgsCtor = findConstructor(DummyBean.class, String.class, int.class);

        inst.configureFromObjectSettings(null, stringCtor, jt, null, null, null);
        Object obj1 = inst.createUsingDelegate(ctxt, "delegateVal");
        Assert.assertEquals("delegateVal", ((DummyBean) obj1).strVal);

        TestSettableBeanProperty propInject = new TestSettableBeanProperty(
                new PropertyName("intVal"),
                TypeFactory.defaultInstance().constructType(int.class),
                "injectedKey"
        );
        SettableBeanProperty[] delegateArgs = new SettableBeanProperty[] { null, propInject };
        inst.configureFromObjectSettings(null, withArgsCtor, jt, delegateArgs, null, null);

        ctxt = ((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext) ctxt).createInstance(
                config.with(injectables),
                mapper.getFactory().createParser("{}"),
                null
        );

        Object obj2 = inst.createUsingDelegate(ctxt, "delVal");
        Assert.assertEquals("delVal", ((DummyBean) obj2).strVal);
        Assert.assertEquals(777, ((DummyBean) obj2).intVal);

        StdValueInstantiator instFallback1 = new StdValueInstantiator(config, jt);
        instFallback1.configureFromArraySettings(stringCtor, jt, null);
        Object obj3 = instFallback1.createUsingDelegate(ctxt, "arrayToDelegate");
        Assert.assertEquals("arrayToDelegate", ((DummyBean) obj3).strVal);

        StdValueInstantiator instFallback2 = new StdValueInstantiator(config, jt);
        instFallback2.configureFromObjectSettings(null, stringCtor, jt, null, null, null);
        Object obj4 = instFallback2.createUsingArrayDelegate(ctxt, "delegateToArray");
        Assert.assertEquals("delegateToArray", ((DummyBean) obj4).strVal);

        StdValueInstantiator instArr = new StdValueInstantiator(config, jt);
        instArr.configureFromArraySettings(stringCtor, jt, null);
        Object obj5 = instArr.createUsingArrayDelegate(ctxt, "arrayDirect");
        Assert.assertEquals("arrayDirect", ((DummyBean) obj5).strVal);

        StdValueInstantiator emptyInst = new StdValueInstantiator(config, jt);
        try {
            emptyInst.createUsingDelegate(ctxt, "nothing");
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException ignored) {}

        try {
            emptyInst.createUsingArrayDelegate(ctxt, "nothing");
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException ignored) {}
    }

    @Test
    public void testCreateUsingDelegate_throwingException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType jt = TypeFactory.defaultInstance().constructType(DummyBean.class);
        DeserializationContext ctxt = createDeserializationContext(mapper);

        StdValueInstantiator inst = new StdValueInstantiator(mapper.getDeserializationConfig(), jt);
        AnnotatedConstructor stringCtor = findConstructor(DummyBean.class, String.class);
        inst.configureFromObjectSettings(null, stringCtor, jt, null, null, null);

        try {
            inst.createUsingDelegate(ctxt, "throw");
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException ignored) {}
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testExceptionWrappingMethods() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        SubStdValueInstantiator inst = new SubStdValueInstantiator(
                new StdValueInstantiator(mapper.getDeserializationConfig(), DummyBean.class)
        );

        JsonMappingException jme = new JsonMappingException(null, "jme original");
        RuntimeException nestedJme = new RuntimeException("wrapper", jme);
        RuntimeException plainEx = new RuntimeException("plain error");

        Assert.assertSame(jme, inst.wrapException(nestedJme));
        JsonMappingException wrappedPlain = inst.wrapException(plainEx);
        Assert.assertTrue(wrappedPlain.getMessage().contains("Instantiation of com.fasterxml.jackson.databind.deser.std.StdValueInstantiatorTest$DummyBean value failed"));

        Assert.assertSame(jme, inst.unwrapAndWrapException(ctxt, nestedJme));
        JsonMappingException unwrapPlain = inst.unwrapAndWrapException(ctxt, plainEx);
        Assert.assertNotNull(unwrapPlain);

        Assert.assertSame(jme, inst.wrapAsJsonMappingException(ctxt, jme));
        JsonMappingException wrapNonJme = inst.wrapAsJsonMappingException(ctxt, plainEx);
        Assert.assertNotNull(wrapNonJme);

        ExceptionInInitializerError initErr = new ExceptionInInitializerError(new IllegalArgumentException("init cause"));
        JsonMappingException fromInit = inst.rewrapCtorProblem(ctxt, initErr);
        Assert.assertNotNull(fromInit);

        InvocationTargetException ite = new InvocationTargetException(new IllegalStateException("ite cause"));
        JsonMappingException fromIte = inst.rewrapCtorProblem(ctxt, ite);
        Assert.assertNotNull(fromIte);

        ExceptionInInitializerError initNoCause = new ExceptionInInitializerError();
        JsonMappingException fromInitNoCause = inst.rewrapCtorProblem(ctxt, initNoCause);
        Assert.assertNotNull(fromInitNoCause);

        InvocationTargetException iteNoCause = new InvocationTargetException(null);
        JsonMappingException fromIteNoCause = inst.rewrapCtorProblem(ctxt, iteNoCause);
        Assert.assertNotNull(fromIteNoCause);

        JsonMappingException fromPlain = inst.rewrapCtorProblem(ctxt, plainEx);
        Assert.assertNotNull(fromPlain);
    }
}
