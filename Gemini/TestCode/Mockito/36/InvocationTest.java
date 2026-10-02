package org.mockito.internal.invocation;

import org.hamcrest.Matcher;
import org.junit.Test;
import org.mockito.internal.invocation.realmethod.RealMethod;
import org.mockito.internal.reporting.PrintSettings;
import org.mockito.invocation.InvocationOnMock;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import static org.junit.Assert.*;

public class InvocationTest {

    private static class DummyMockitoMethod implements MockitoMethod {
        private String name = "dummyMethod";
        private Class<?> returnType = String.class;
        private Class<?>[] parameterTypes = new Class<?>[0];
        private Class<?>[] exceptionTypes = new Class<?>[0];
        private boolean isVarArgs = false;
        private Method javaMethod;

        public DummyMockitoMethod() {
            try {
                this.javaMethod = Object.class.getMethod("toString");
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }

        public DummyMockitoMethod(String name, Class<?> returnType, Class<?>[] parameterTypes, Class<?>[] exceptionTypes, boolean isVarArgs) {
            this();
            this.name = name;
            this.returnType = returnType;
            this.parameterTypes = parameterTypes;
            this.exceptionTypes = exceptionTypes;
            this.isVarArgs = isVarArgs;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public Class<?> getReturnType() {
            return returnType;
        }

        @Override
        public Class<?>[] getParameterTypes() {
            return parameterTypes;
        }

        @Override
        public Class<?>[] getExceptionTypes() {
            return exceptionTypes;
        }

        @Override
        public boolean isVarArgs() {
            return isVarArgs;
        }

        @Override
        public Method getJavaMethod() {
            return javaMethod;
        }

        public void setJavaMethod(Method javaMethod) {
            this.javaMethod = javaMethod;
        }
    }

    private static class DummyRealMethod implements RealMethod {
        private final Object result;
        private final Throwable exception;

        public DummyRealMethod(Object result) {
            this.result = result;
            this.exception = null;
        }

        public DummyRealMethod(Throwable exception) {
            this.result = null;
            this.exception = exception;
        }

        @Override
        public Object invoke(Object target, Object[] arguments) throws Throwable {
            if (exception != null) {
                throw exception;
            }
            return result;
        }
    }

    @Test
    public void testConstructor_nonVarArgsNullArgs_createsEmptyArgs() {
        DummyMockitoMethod method = new DummyMockitoMethod("test", void.class, new Class<?>[0], new Class<?>[0], false);
        Invocation invocation = new Invocation("mock", method, null, 1, new DummyRealMethod(null));

        assertNotNull(invocation.getArguments());
        assertEquals(0, invocation.getArguments().length);
        assertEquals(0, invocation.getArgumentsCount());
        assertNull(invocation.getRawArguments());
    }

    @Test
    public void testConstructor_varArgsWithObjectArray_expandsArguments() {
        DummyMockitoMethod method = new DummyMockitoMethod("test", void.class, new Class<?>[]{String.class, Object[].class}, new Class<?>[0], true);
        Object[] rawArgs = new Object[]{"prefix", new Object[]{"val1", "val2"}};
        Invocation invocation = new Invocation("mock", method, rawArgs, 1, new DummyRealMethod(null));

        Object[] args = invocation.getArguments();
        assertEquals(3, args.length);
        assertEquals("prefix", args[0]);
        assertEquals("val1", args[1]);
        assertEquals("val2", args[2]);
        assertSame(rawArgs, invocation.getRawArguments());
    }

    @Test
    public void testConstructor_varArgsWithPrimitiveArray_expandsArguments() {
        DummyMockitoMethod method = new DummyMockitoMethod("test", void.class, new Class<?>[]{String.class, int[].class}, new Class<?>[0], true);
        Object[] rawArgs = new Object[]{"prefix", new int[]{10, 20}};
        Invocation invocation = new Invocation("mock", method, rawArgs, 1, new DummyRealMethod(null));

        Object[] args = invocation.getArguments();
        assertEquals(3, args.length);
        assertEquals("prefix", args[0]);
        assertEquals(10, args[1]);
        assertEquals(20, args[2]);
    }

    @Test
    public void testConstructor_varArgsWithNullArray_expandsToSingleNull() {
        DummyMockitoMethod method = new DummyMockitoMethod("test", void.class, new Class<?>[]{String.class, Object[].class}, new Class<?>[0], true);
        Object[] rawArgs = new Object[]{"prefix", null};
        Invocation invocation = new Invocation("mock", method, rawArgs, 1, new DummyRealMethod(null));

        Object[] args = invocation.getArguments();
        assertEquals(2, args.length);
        assertEquals("prefix", args[0]);
        assertNull(args[1]);
    }

    @Test
    public void testConstructor_varArgsWithNonArrayLastArgument_doesNotExpand() {
        DummyMockitoMethod method = new DummyMockitoMethod("test", void.class, new Class<?>[]{String.class, Object.class}, new Class<?>[0], true);
        Object[] rawArgs = new Object[]{"prefix", "nonArray"};
        Invocation invocation = new Invocation("mock", method, rawArgs, 1, new DummyRealMethod(null));

        Object[] args = invocation.getArguments();
        assertEquals(2, args.length);
        assertEquals("prefix", args[0]);
        assertEquals("nonArray", args[1]);
    }

    @Test
    public void testGettersAndLocation_validValues_returnsCorrectData() {
        DummyMockitoMethod method = new DummyMockitoMethod("getName", String.class, new Class<?>[0], new Class<?>[0], false);
        DummyRealMethod realMethod = new DummyRealMethod("result");
        String mockObj = "mockObject";
        Invocation invocation = new Invocation(mockObj, method, new Object[]{"arg1"}, 42, realMethod);

        assertSame(mockObj, invocation.getMock());
        assertSame(method, invocation.getMethod());
        assertEquals("getName", invocation.getMethodName());
        assertEquals(Integer.valueOf(42), invocation.getSequenceNumber());
        assertNotNull(invocation.getLocation());
        assertEquals(1, invocation.getArgumentsCount());
    }

    @Test
    public void testVerificationFlags_markVerifiedAndInOrder_flagsUpdateCorrectly() {
        DummyMockitoMethod method = new DummyMockitoMethod();
        Invocation invocation = new Invocation("mock", method, new Object[0], 1, new DummyRealMethod(null));

        assertFalse(invocation.isVerified());
        assertFalse(invocation.isVerifiedInOrder());

        invocation.markVerified();
        assertTrue(invocation.isVerified());
        assertFalse(invocation.isVerifiedInOrder());

        invocation.markVerifiedInOrder();
        assertTrue(invocation.isVerified());
        assertTrue(invocation.isVerifiedInOrder());
    }

    @Test
    public void testEquals_variousScenarios_returnsExpectedResults() {
        DummyMockitoMethod method1 = new DummyMockitoMethod("test", String.class, new Class<?>[0], new Class<?>[0], false);
        DummyMockitoMethod method2 = new DummyMockitoMethod("other", String.class, new Class<?>[0], new Class<?>[0], false);

        Invocation inv1 = new Invocation("mock1", method1, new Object[]{"a"}, 1, new DummyRealMethod(null));
        Invocation inv1Duplicate = new Invocation("mock1", method1, new Object[]{"a"}, 2, new DummyRealMethod(null));
        Invocation invDiffMock = new Invocation("mock2", method1, new Object[]{"a"}, 1, new DummyRealMethod(null));
        Invocation invDiffMethod = new Invocation("mock1", method2, new Object[]{"a"}, 1, new DummyRealMethod(null));
        Invocation invDiffArgs = new Invocation("mock1", method1, new Object[]{"b"}, 1, new DummyRealMethod(null));

        assertEquals(inv1, inv1);
        assertEquals(inv1, inv1Duplicate);
        assertNotEquals(inv1, null);
        assertNotEquals(inv1, "SomeString");
        assertNotEquals(inv1, invDiffMock);
        assertNotEquals(inv1, invDiffMethod);
        assertNotEquals(inv1, invDiffArgs);
    }

    @Test(expected = RuntimeException.class)
    public void testHashCode_always_throwsRuntimeException() {
        Invocation invocation = new Invocation("mock", new DummyMockitoMethod(), new Object[0], 1, new DummyRealMethod(null));
        invocation.hashCode();
    }

    @Test
    public void testToString_variousPrintSettingsAndLengths_formatsCorrectly() {
        DummyMockitoMethod method = new DummyMockitoMethod("simpleMethod", String.class, new Class<?>[0], new Class<?>[0], false);
        Invocation invocation = new Invocation("mock", method, new Object[]{"arg1", new int[]{1, 2}, null}, 1, new DummyRealMethod(null));

        String str = invocation.toString();
        assertNotNull(str);
        assertTrue(str.contains("simpleMethod"));

        PrintSettings multilineSettings = new PrintSettings();
        multilineSettings.setMultiline(true);
        String multilineStr = invocation.toString(multilineSettings);
        assertNotNull(multilineStr);

        DummyMockitoMethod longMethod = new DummyMockitoMethod("veryLongMethodNameToTriggerLengthThresholdExceedingFortyFiveChars", void.class, new Class<?>[0], new Class<?>[0], false);
        Invocation longInvocation = new Invocation("mock", longMethod, new Object[]{"arg1", "arg2", "arg3"}, 1, new DummyRealMethod(null));
        String longStr = longInvocation.toString();
        assertNotNull(longStr);
    }

    @Test
    public void testArgumentsToMatchers_arrayAndNonArrayArguments_convertsProperly() {
        DummyMockitoMethod method = new DummyMockitoMethod();
        Invocation invocation = new Invocation("mock", method, new Object[]{"str", new Object[]{"arr"}, null}, 1, new DummyRealMethod(null));

        List<Matcher> matchers = invocation.argumentsToMatchers();
        assertEquals(3, matchers.size());
    }

    @Test
    public void testIsToString_differentMethods_detectsToStringCorrectly() throws Exception {
        DummyMockitoMethod toStringMethod = new DummyMockitoMethod("toString", String.class, new Class<?>[0], new Class<?>[0], false);
        toStringMethod.setJavaMethod(Object.class.getMethod("toString"));
        Invocation toStringInvocation = new Invocation("mock", toStringMethod, new Object[0], 1, new DummyRealMethod(null));

        assertTrue(Invocation.isToString(toStringInvocation));

        DummyMockitoMethod notToStringMethod = new DummyMockitoMethod("hashCode", int.class, new Class<?>[0], new Class<?>[0], false);
        notToStringMethod.setJavaMethod(Object.class.getMethod("hashCode"));
        Invocation notToStringInvocation = new Invocation("mock", notToStringMethod, new Object[0], 1, new DummyRealMethod(null));

        assertFalse(Invocation.isToString(notToStringInvocation));
    }

    @Test
    public void testIsValidException_checkedAndUnchecked_evaluatesCorrectly() {
        DummyMockitoMethod method = new DummyMockitoMethod("test", void.class, new Class<?>[0], new Class<?>[]{IOException.class}, false);
        Invocation invocation = new Invocation("mock", method, new Object[0], 1, new DummyRealMethod(null));

        assertTrue(invocation.isValidException(new IOException("checked")));
        assertTrue(invocation.isValidException(new java.io.FileNotFoundException("subclass")));
        assertFalse(invocation.isValidException(new SQLExceptionStub()));
    }

    private static class SQLExceptionStub extends Exception {}

    @Test
    public void testIsValidReturnType_primitiveAndReferenceTypes_evaluatesCorrectly() {
        DummyMockitoMethod intMethod = new DummyMockitoMethod("getInt", int.class, new Class<?>[0], new Class<?>[0], false);
        Invocation intInvocation = new Invocation("mock", intMethod, new Object[0], 1, new DummyRealMethod(null));

        assertTrue(intInvocation.isValidReturnType(Integer.class));
        assertTrue(intInvocation.isValidReturnType(int.class));
        assertFalse(intInvocation.isValidReturnType(String.class));
        assertFalse(intInvocation.isValidReturnType(Long.class));

        DummyMockitoMethod strMethod = new DummyMockitoMethod("getCharSequence", CharSequence.class, new Class<?>[0], new Class<?>[0], false);
        Invocation strInvocation = new Invocation("mock", strMethod, new Object[0], 1, new DummyRealMethod(null));

        assertTrue(strInvocation.isValidReturnType(String.class));
        assertTrue(strInvocation.isValidReturnType(CharSequence.class));
        assertFalse(strInvocation.isValidReturnType(Integer.class));
    }

    @Test
    public void testIsVoidAndReturnsPrimitive_typeChecks_evaluatesCorrectly() {
        DummyMockitoMethod voidMethod = new DummyMockitoMethod("voidMethod", void.class, new Class<?>[0], new Class<?>[0], false);
        Invocation voidInvocation = new Invocation("mock", voidMethod, new Object[0], 1, new DummyRealMethod(null));

        assertTrue(voidInvocation.isVoid());
        assertTrue(voidInvocation.returnsPrimitive());
        assertEquals("void", voidInvocation.printMethodReturnType());

        DummyMockitoMethod objMethod = new DummyMockitoMethod("objMethod", String.class, new Class<?>[0], new Class<?>[0], false);
        Invocation objInvocation = new Invocation("mock", objMethod, new Object[0], 1, new DummyRealMethod(null));

        assertFalse(objInvocation.isVoid());
        assertFalse(objInvocation.returnsPrimitive());
        assertEquals("String", objInvocation.printMethodReturnType());
    }

    @Test
    public void testCallRealMethod_normalInvocation_returnsResult() throws Throwable {
        DummyRealMethod realMethod = new DummyRealMethod("expectedReturn");
        Invocation invocation = new Invocation("mock", new DummyMockitoMethod(), new Object[]{"a"}, 1, realMethod);

        Object result = invocation.callRealMethod();
        assertEquals("expectedReturn", result);
    }

    @Test(expected = IOException.class)
    public void testCallRealMethod_exceptionThrown_propagatesException() throws Throwable {
        DummyRealMethod realMethod = new DummyRealMethod(new IOException("fail"));
        Invocation invocation = new Invocation("mock", new DummyMockitoMethod(), new Object[0], 1, realMethod);

        invocation.callRealMethod();
    }
}
