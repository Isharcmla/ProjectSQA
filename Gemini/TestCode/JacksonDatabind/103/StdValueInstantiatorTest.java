package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedElement;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;

public class StdValueInstantiatorTest {

    private ObjectMapper mapper;
    private DeserializationContext ctxt;
    private JavaType stringType;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        ctxt = mapper.getDeserializationContext();
        stringType = TypeFactory.defaultInstance().constructType(String.class);
    }

    private static class SubStdValueInstantiator extends StdValueInstantiator {
        private static final long serialVersionUID = 1L;

        public SubStdValueInstantiator(StdValueInstantiator src) {
            super(src);
        }

        public JsonMappingException testWrapException(Throwable t) {
            return wrapException(t);
        }

        public JsonMappingException testUnwrapAndWrapException(DeserializationContext ctxt, Throwable t) {
            return unwrapAndWrapException(ctxt, t);
        }

        public JsonMappingException testWrapAsJsonMappingException(DeserializationContext ctxt, Throwable t) {
            return wrapAsJsonMappingException(ctxt, t);
        }

        public JsonMappingException testRewrapCtorProblem(DeserializationContext ctxt, Throwable t) {
            return rewrapCtorProblem(ctxt, t);
        }
    }

    private static class DummyAnnotatedWithParams extends AnnotatedWithParams {
        private static final long serialVersionUID = 1L;
        private final Class<?> declaringClass;
        private final CreatorFunction function;

        public DummyAnnotatedWithParams(Class<?> declaringClass, CreatorFunction function) {
            super(null, null, null);
            this.declaringClass = declaringClass;
            this.function = function;
        }

        @Override
        public Object call() throws Exception {
            return function.apply(new Object[0]);
        }

        @Override
        public Object call(Object[] args) throws Exception {
            return function.apply(args);
        }

        @Override
        public Object call1(Object arg) throws Exception {
            return function.apply(new Object[]{arg});
        }

        @Override
        public Class<?> getDeclaringClass() {
            return declaringClass;
        }

        @Override
        public Member getMember() {
            return null;
        }

        @Override
        public Object getValue(Object pojo) {
            return null;
        }

        @Override
        public void setValue(Object pojo, Object value) {
        }

        @Override
        public int getParameterCount() {
            return 0;
        }

        @Override
        public JavaType getParameterType(int index) {
            return null;
        }

        @Override
        public JavaType getType() {
            return null;
        }

        @Override
        public Class<?> getRawType() {
            return declaringClass;
        }

        @Override
        public AnnotatedElement getAnnotated() {
            return null;
        }

        @Override
        protected int getModifiers() {
            return 0;
        }

        @Override
        public String getName() {
            return "dummy";
        }

        @Override
        public boolean equals(Object o) {
            return o == this;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public String toString() {
            return "DummyAnnotatedWithParams";
        }

        @Override
        public AnnotatedWithParams withAnnotations(AnnotationMap fallback) {
            return this;
        }
    }

    private interface CreatorFunction {
        Object apply(Object[] args) throws Exception;
    }

    private static class DummySettableBeanProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;
        private final Object injectableId;

        public DummySettableBeanProperty(String name, JavaType type, Object injectableId) {
            super(PropertyName.construct(name), type, PropertyMetadata.STD_REQUIRED, null);
            this.injectableId = injectableId;
        }

        @Override
        public Object getInjectableValueId() {
            return injectableId;
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            return this;
        }

        @Override
        public SettableBeanProperty withName(PropertyName newName) {
            return this;
        }

        @Override
        public SettableBeanProperty withNullProvider(NullValueProvider nvs) {
            return this;
        }

        @Override
        public AnnotatedMember getMember() {
            return null;
        }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            return null;
        }

        @Override
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) {
        }

        @Override
        public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) {
            return null;
        }

        @Override
        public void set(Object instance, Object value) {
        }

        @Override
        public Object setAndReturn(Object instance, Object value) {
            return null;
        }
    }

    @Test
    public void testConstructors_nullAndNonNull() {
        StdValueInstantiator viClassNonNull = new StdValueInstantiator((DeserializationConfig) null, String.class);
        Assert.assertEquals("java.lang.String", viClassNonNull.getValueTypeDesc());
        Assert.assertEquals(String.class, viClassNonNull.getValueClass());

        StdValueInstantiator viClassNull = new StdValueInstantiator((DeserializationConfig) null, (Class<?>) null);
        Assert.assertEquals("UNKNOWN", viClassNull.getValueTypeDesc());
        Assert.assertEquals(Object.class, viClassNull.getValueClass());

        StdValueInstantiator viTypeNonNull = new StdValueInstantiator((DeserializationConfig) null, stringType);
        Assert.assertEquals(stringType.toString(), viTypeNonNull.getValueTypeDesc());
        Assert.assertEquals(String.class, viTypeNonNull.getValueClass());

        StdValueInstantiator viTypeNull = new StdValueInstantiator((DeserializationConfig) null, (JavaType) null);
        Assert.assertEquals("UNKNOWN TYPE", viTypeNull.getValueTypeDesc());
        Assert.assertEquals(Object.class, viTypeNull.getValueClass());
    }

    @Test
    public void testCopyConstructor_allFieldsCopied() {
        StdValueInstantiator src = new StdValueInstantiator(null, stringType);

        DummyAnnotatedWithParams defCreator = new DummyAnnotatedWithParams(String.class, args -> "default");
        DummyAnnotatedWithParams delCreator = new DummyAnnotatedWithParams(String.class, args -> "delegate");
        DummyAnnotatedWithParams arrDelCreator = new DummyAnnotatedWithParams(String.class, args -> "arrDelegate");
        DummyAnnotatedWithParams withArgsCreator = new DummyAnnotatedWithParams(String.class, args -> "withArgs");
        DummyAnnotatedWithParams strCreator = new DummyAnnotatedWithParams(String.class, args -> args[0]);
        DummyAnnotatedWithParams intCreator = new DummyAnnotatedWithParams(String.class, args -> args[0]);
        DummyAnnotatedWithParams longCreator = new DummyAnnotatedWithParams(String.class, args -> args[0]);
        DummyAnnotatedWithParams dblCreator = new DummyAnnotatedWithParams(String.class, args -> args[0]);
        DummyAnnotatedWithParams boolCreator = new DummyAnnotatedWithParams(String.class, args -> args[0]);

        SettableBeanProperty[] delArgs = new SettableBeanProperty[0];
        SettableBeanProperty[] arrDelArgs = new SettableBeanProperty[0];
        SettableBeanProperty[] withArgs = new SettableBeanProperty[0];

        src.configureFromObjectSettings(defCreator, delCreator, stringType, delArgs, withArgsCreator, withArgs);
        src.configureFromArraySettings(arrDelCreator, stringType, arrDelArgs);
        src.configureFromStringCreator(strCreator);
        src.configureFromIntCreator(intCreator);
        src.configureFromLongCreator(longCreator);
        src.configureFromDoubleCreator(dblCreator);
        src.configureFromBooleanCreator(boolCreator);

        SubStdValueInstantiator copy = new SubStdValueInstantiator(src);

        Assert.assertEquals(src.getValueTypeDesc(), copy.getValueTypeDesc());
        Assert.assertEquals(src.getValueClass(), copy.getValueClass());
        Assert.assertSame(defCreator, copy.getDefaultCreator());
        Assert.assertSame(delCreator, copy.getDelegateCreator());
        Assert.assertSame(stringType, copy.getDelegateType(null));
        Assert.assertSame(arrDelCreator, copy.getArrayDelegateCreator());
        Assert.assertSame(stringType, copy.getArrayDelegateType(null));
        Assert.assertSame(withArgsCreator, copy.getWithArgsCreator());
        Assert.assertSame(withArgs, copy.getFromObjectArguments(null));
        Assert.assertTrue(copy.canCreateFromString());
        Assert.assertTrue(copy.canCreateFromInt());
        Assert.assertTrue(copy.canCreateFromLong());
        Assert.assertTrue(copy.canCreateFromDouble());
        Assert.assertTrue(copy.canCreateFromBoolean());
        Assert.assertTrue(copy.canCreateUsingDefault());
        Assert.assertTrue(copy.canCreateUsingDelegate());
        Assert.assertTrue(copy.canCreateUsingArrayDelegate());
        Assert.assertTrue(copy.canCreateFromObjectWith());
        Assert.assertTrue(copy.canInstantiate());
    }

    @Test
    public void testCanInstantiate_allBranches() {
        StdValueInstantiator vi = new StdValueInstantiator(null, stringType);
        Assert.assertFalse(vi.canInstantiate());

        vi.configureFromStringCreator(new DummyAnnotatedWithParams(String.class, args -> ""));
        Assert.assertTrue(vi.canInstantiate());

        vi = new StdValueInstantiator(null, stringType);
        vi.configureFromIntCreator(new DummyAnnotatedWithParams(String.class, args -> ""));
        Assert.assertTrue(vi.canInstantiate());

        vi = new StdValueInstantiator(null, stringType);
        vi.configureFromLongCreator(new DummyAnnotatedWithParams(String.class, args -> ""));
        Assert.assertTrue(vi.canInstantiate());

        vi = new StdValueInstantiator(null, stringType);
        vi.configureFromDoubleCreator(new DummyAnnotatedWithParams(String.class, args -> ""));
        Assert.assertTrue(vi.canInstantiate());

        vi = new StdValueInstantiator(null, stringType);
        vi.configureFromBooleanCreator(new DummyAnnotatedWithParams(String.class, args -> ""));
        Assert.assertTrue(vi.canInstantiate());

        vi = new StdValueInstantiator(null, stringType);
        vi.configureFromObjectSettings(new DummyAnnotatedWithParams(String.class, args -> ""), null, null, null, null, null);
        Assert.assertTrue(vi.canInstantiate());

        vi = new StdValueInstantiator(null, stringType);
        vi.configureFromObjectSettings(null, null, stringType, null, null, null);
        Assert.assertTrue(vi.canInstantiate());

        vi = new StdValueInstantiator(null, stringType);
        vi.configureFromArraySettings(null, stringType, null);
        Assert.assertTrue(vi.canInstantiate());

        vi = new StdValueInstantiator(null, stringType);
        vi.configureFromObjectSettings(null, null, null, null, new DummyAnnotatedWithParams(String.class, args -> ""), null);
        Assert.assertTrue(vi.canInstantiate());
    }

    @Test
    public void testIncompleteParameter() {
        StdValueInstantiator vi = new StdValueInstantiator(null, stringType);
        Assert.assertNull(vi.getIncompleteParameter());
        AnnotatedParameter param = new AnnotatedParameter(null, stringType, null, null, 0);
        vi.configureIncompleteParameter(param);
        Assert.assertSame(param, vi.getIncompleteParameter());
    }

    @Test
    public void testCreateUsingDefault_success() throws IOException {
        StdValueInstantiator vi = new StdValueInstantiator(null, stringType);
        vi.configureFromObjectSettings(new DummyAnnotatedWithParams(String.class, args -> "default_val"), null, null, null, null, null);
        Object result = vi.createUsingDefault(ctxt);
        Assert.assertEquals("default_val", result);
    }

    @Test
    public void testCreateUsingDefault_nullCreator_throwsException() {
        StdValueInstantiator vi = new StdValueInstantiator(null, stringType);
        try {
            vi.createUsingDefault(ctxt);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Success
        } catch (IOException e) {
            Assert.fail("Unexpected IOException: " + e.getMessage());
        }
    }

    @Test
    public void testCreateUsingDefault_creatorThrows_handled() {
        StdValueInstantiator vi = new StdValueInstantiator(null, stringType);
        vi.configureFromObjectSettings(new DummyAnnotatedWithParams(String.class, args -> {
            throw new IllegalStateException("Ctor failed");
        }), null, null, null, null, null);
        try {
            vi.createUsingDefault(ctxt);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Handled
        } catch (IOException e) {
            Assert.fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testCreateFromObjectWith_success() throws IOException {
        StdValueInstantiator vi = new StdValueInstantiator(null, stringType);
        vi.configureFromObjectSettings(null, null, null, null,
                new DummyAnnotatedWithParams(String.class, args -> args[0] + "_" + args[1]), null);
        Object result = vi.createFromObjectWith(ctxt, new Object[]{"hello", 123});
        Assert.assertEquals("hello_123", result);
    }

    @Test
    public void testCreateFromObjectWith_nullCreator_throwsException() {
        StdValueInstantiator vi = new StdValueInstantiator(null, stringType);
        try {
            vi.createFromObjectWith(ctxt, new Object[]{"val"});
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Success
        } catch (IOException e) {
            Assert.fail("Unexpected exception");
        }
    }

    @Test
    public void testCreateFromObjectWith_creatorThrows_handled() {
        StdValueInstantiator vi = new StdValueInstantiator(null, stringType);
        vi.configureFromObjectSettings(null, null, null, null,
                new DummyAnnotatedWithParams(String.class, args -> {
                    throw new RuntimeException("fail");
                }), null);
        try {
            vi.createFromObjectWith(ctxt, new Object[]{"val"});
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Handled
        } catch (IOException e) {
            Assert.fail("Unexpected exception");
        }
    }

    @Test
    public void testCreateUsingDelegate_successNoInjectables() throws IOException {
        StdValueInstantiator vi = new StdValueInstantiator(null, stringType);
        vi.configureFromObjectSettings(null,
                new DummyAnnotatedWithParams(String.class, args -> "delegated:" + args[0]),
                stringType, null, null, null);

        Object result = vi.createUsingDelegate(ctxt, "input");
        Assert.assertEquals("delegated:input", result);
    }

    @Test
    public void testCreateUsingDelegate_withInjectablesAndDelegateArg() throws IOException {
        StdValueInstantiator vi = new StdValueInstantiator(null, stringType);
        SettableBeanProperty[] args = new SettableBeanProperty[]{
                null,
                new DummySettableBeanProperty("inj", stringType, "injectableId")
        };
        vi.configureFromObjectSettings(null,
                new DummyAnnotatedWithParams(String.class, a -> a[0] + "_" + a[1]),
                stringType, args, null, null);

        Object result = vi.createUsingDelegate(ctxt, "delegatedVal");
        Assert.assertEquals("delegatedVal_null", result);
    }

    @Test
    public void testCreateUsingDelegate_fallbackToArrayDelegate() throws IOException {
        StdValueInstantiator vi = new StdValueInstantiator(null, stringType);
        vi.configureFromArraySettings(
                new DummyAnnotatedWithParams(String.class, args -> "arrayDel:" + args[0]),
                stringType, null);

        Object result = vi.createUsingDelegate(ctxt, "arrInput");
        Assert.assertEquals("arrayDel:arrInput", result);
    }

    @Test(expected = IllegalStateException.class)
    public void testCreateUsingDelegate_nullCreator_throwsIllegalStateException() throws IOException {
        StdValueInstantiator vi = new StdValueInstantiator(null, stringType);
        vi.createUsingDelegate(ctxt, "delegate");
    }

    @Test
    public void testCreateUsingDelegate_creatorThrows_wrapsException() {
        StdValueInstantiator vi = new StdValueInstantiator(null, stringType);
        vi.configureFromObjectSettings(null,
                new DummyAnnotatedWithParams(String.class, args -> {
                    throw new RuntimeException("delegate error");
                }), stringType, null, null, null);

        try {
            vi.createUsingDelegate(ctxt, "input");
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Expected
        } catch (IOException e) {
            Assert.fail("Unexpected exception");
        }
    }

    @Test
    public void testCreateUsingArrayDelegate_success() throws IOException {
        StdValueInstantiator vi = new StdValueInstantiator(null, stringType);
        vi.configureFromArraySettings(
                new DummyAnnotatedWithParams(String.class, args -> "array:" + args[0]),
                stringType, null);

        Object result = vi.createUsingArrayDelegate(ctxt, "arrayData");
        Assert.assertEquals("array:arrayData", result);
    }

    @Test
    public void testCreateUsingArrayDelegate_fallbackToDelegateCreator() throws IOException {
        StdValueInstantiator vi = new StdValueInstantiator(null, stringType);
        vi.configureFromObjectSettings(null,
                new DummyAnnotatedWithParams(String.class, args -> "fallback:" + args[0]),
                stringType, null, null, null);

        Object result = vi.createUsingArrayDelegate(ctxt, "data");
        Assert.assertEquals("fallback:data", result);
    }

    @Test
    public void testCreateFromString_successAndNullFallbackAndThrows() {
        StdValueInstantiator vi = new StdValueInstantiator(null, stringType);
        try {
            vi.createFromString(ctxt, "value");
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Fallback path executed
        } catch (IOException e) {
            Assert.fail("Unexpected exception");
        }

        vi.configureFromStringCreator(new DummyAnnotatedWithParams(String.class, args -> "created:" + args[0]));
        try {
            Object res = vi.createFromString(ctxt, "testStr");
            Assert.assertEquals("created:testStr", res);
        } catch (IOException e) {
            Assert.fail("Unexpected error: " + e);
        }

        vi.configureFromStringCreator(new DummyAnnotatedWithParams(String.class, args -> {
            throw new IllegalArgumentException("invalid string");
        }));
        try {
            vi.createFromString(ctxt, "testStr");
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Expected
        } catch (IOException e) {
            Assert.fail("Unexpected exception");
        }
    }

    @Test
    public void testCreateFromInt_allBranches() {
        StdValueInstantiator vi = new StdValueInstantiator(null, stringType);
        try {
            vi.createFromInt(ctxt, 42);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Super fallback
        } catch (IOException e) {
            Assert.fail("Unexpected exception");
        }

        // Int creator exists
        vi.configureFromIntCreator(new DummyAnnotatedWithParams(String.class, args -> "int:" + args[0]));
        try {
            Object res = vi.createFromInt(ctxt, 42);
            Assert.assertEquals("int:42", res);
        } catch (IOException e) {
            Assert.fail("Unexpected error: " + e);
        }

        // Int creator throws
        vi.configureFromIntCreator(new DummyAnnotatedWithParams(String.class, args -> {
            throw new RuntimeException("int error");
        }));
        try {
            vi.createFromInt(ctxt, 42);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Handled
        } catch (IOException e) {
            Assert.fail("Unexpected exception");
        }

        // Long creator widening conversion
        vi.configureFromIntCreator(null);
        vi.configureFromLongCreator(new DummyAnnotatedWithParams(String.class, args -> "longWidened:" + args[0]));
        try {
            Object res = vi.createFromInt(ctxt, 42);
            Assert.assertEquals("longWidened:42", res);
        } catch (IOException e) {
            Assert.fail("Unexpected error: " + e);
        }

        // Long creator widening throws
        vi.configureFromLongCreator(new DummyAnnotatedWithParams(String.class, args -> {
            throw new RuntimeException("long widened error");
        }));
        try {
            vi.createFromInt(ctxt, 42);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Handled
        } catch (IOException e) {
            Assert.fail("Unexpected exception");
        }
    }

    @Test
    public void testCreateFromLong_allBranches() {
        StdValueInstantiator vi = new StdValueInstantiator(null, stringType);
        try {
            vi.createFromLong(ctxt, 100L);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Super fallback
        } catch (IOException e) {
            Assert.fail("Unexpected exception");
        }

        vi.configureFromLongCreator(new DummyAnnotatedWithParams(String.class, args -> "long:" + args[0]));
        try {
            Object res = vi.createFromLong(ctxt, 100L);
            Assert.assertEquals("long:100", res);
        } catch (IOException e) {
            Assert.fail("Unexpected exception");
        }

        vi.configureFromLongCreator(new DummyAnnotatedWithParams(String.class, args -> {
            throw new RuntimeException("long error");
        }));
        try {
            vi.createFromLong(ctxt, 100L);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Handled
        } catch (IOException e) {
            Assert.fail("Unexpected exception");
        }
    }

    @Test
    public void testCreateFromDouble_allBranches() {
        StdValueInstantiator vi = new StdValueInstantiator(null, stringType);
        try {
            vi.createFromDouble(ctxt, 3.14);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Super fallback
        } catch (IOException e) {
            Assert.fail("Unexpected exception");
        }

        vi.configureFromDoubleCreator(new DummyAnnotatedWithParams(String.class, args -> "double:" + args[0]));
        try {
            Object res = vi.createFromDouble(ctxt, 3.14);
            Assert.assertEquals("double:3.14", res);
        } catch (IOException e) {
            Assert.fail("Unexpected exception");
        }

        vi.configureFromDoubleCreator(new DummyAnnotatedWithParams(String.class, args -> {
            throw new RuntimeException("double error");
        }));
        try {
            vi.createFromDouble(ctxt, 3.14);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Handled
        } catch (IOException e) {
            Assert.fail("Unexpected exception");
        }
    }

    @Test
    public void testCreateFromBoolean_allBranches() {
        StdValueInstantiator vi = new StdValueInstantiator(null, stringType);
        try {
            vi.createFromBoolean(ctxt, true);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Super fallback
        } catch (IOException e) {
            Assert.fail("Unexpected exception");
        }

        vi.configureFromBooleanCreator(new DummyAnnotatedWithParams(String.class, args -> "bool:" + args[0]));
        try {
            Object res = vi.createFromBoolean(ctxt, true);
            Assert.assertEquals("bool:true", res);
        } catch (IOException e) {
            Assert.fail("Unexpected exception");
        }

        vi.configureFromBooleanCreator(new DummyAnnotatedWithParams(String.class, args -> {
            throw new RuntimeException("bool error");
        }));
        try {
            vi.createFromBoolean(ctxt, false);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // Handled
        } catch (IOException e) {
            Assert.fail("Unexpected exception");
        }
    }

    @Test
    public void testExceptionWrappingMethods() {
        StdValueInstantiator vi = new StdValueInstantiator(null, stringType);
        SubStdValueInstantiator sub = new SubStdValueInstantiator(vi);

        // 1. wrapException
        JsonMappingException jme = new JsonMappingException(null, "jme");
        Assert.assertSame(jme, sub.testWrapException(jme));

        RuntimeException wrapperWithJme = new RuntimeException("wrapper", jme);
        Assert.assertSame(jme, sub.testWrapException(wrapperWithJme));

        RuntimeException plain = new RuntimeException("plain error");
        JsonMappingException wrappedPlain = sub.testWrapException(plain);
        Assert.assertTrue(wrappedPlain.getMessage().contains("plain error"));

        // 2. unwrapAndWrapException
        Assert.assertSame(jme, sub.testUnwrapAndWrapException(ctxt, jme));
        Assert.assertSame(jme, sub.testUnwrapAndWrapException(ctxt, wrapperWithJme));
        JsonMappingException unwrapWrapPlain = sub.testUnwrapAndWrapException(ctxt, plain);
        Assert.assertNotNull(unwrapWrapPlain);

        // 3. wrapAsJsonMappingException
        Assert.assertSame(jme, sub.testWrapAsJsonMappingException(ctxt, jme));
        JsonMappingException mapped = sub.testWrapAsJsonMappingException(ctxt, plain);
        Assert.assertNotNull(mapped);

        // 4. rewrapCtorProblem
        ExceptionInInitializerError eiieWithCause = new ExceptionInInitializerError(plain);
        JsonMappingException rewrappedEiie = sub.testRewrapCtorProblem(ctxt, eiieWithCause);
        Assert.assertTrue(rewrappedEiie.getMessage().contains("plain error") || rewrappedEiie.getCause() == plain);

        ExceptionInInitializerError eiieNoCause = new ExceptionInInitializerError();
        JsonMappingException rewrappedEiieNoCause = sub.testRewrapCtorProblem(ctxt, eiieNoCause);
        Assert.assertNotNull(rewrappedEiieNoCause);

        InvocationTargetException iteWithCause = new InvocationTargetException(plain);
        JsonMappingException rewrappedIte = sub.testRewrapCtorProblem(ctxt, iteWithCause);
        Assert.assertNotNull(rewrappedIte);

        InvocationTargetException iteNoCause = new InvocationTargetException(null);
        JsonMappingException rewrappedIteNoCause = sub.testRewrapCtorProblem(ctxt, iteNoCause);
        Assert.assertNotNull(rewrappedIteNoCause);
    }
}
