package org.mockito.internal.invocation;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.debugging.Location;
import org.mockito.internal.invocation.realmethod.RealMethod;
import org.mockito.internal.reporting.PrintSettings;
import org.mockito.invocation.InvocationOnMock;

public class InvocationTest {

    // ---------- Helper fake implementation of MockitoMethod ----------
    static class FakeMockitoMethod implements MockitoMethod {
        private final String name;
        private final Class<?> returnType;
        private final Class<?>[] parameterTypes;
        private final Class<?>[] exceptionTypes;
        private final boolean varArgs;

        FakeMockitoMethod(String name, Class<?> returnType, Class<?>[] parameterTypes,
                           Class<?>[] exceptionTypes, boolean varArgs) {
            this.name = name;
            this.returnType = returnType;
            this.parameterTypes = parameterTypes;
            this.exceptionTypes = exceptionTypes;
            this.varArgs = varArgs;
        }

        public String getName() {
            return name;
        }

        public Class<?> getReturnType() {
            return returnType;
        }

        public Class<?>[] getParameterTypes() {
            return parameterTypes;
        }

        public Class<?>[] getExceptionTypes() {
            return exceptionTypes;
        }

        public boolean isVarArgs() {
            return varArgs;
        }

        public Method getJavaMethod() {
            try {
                return Object.class.getMethod("toString");
            } catch (NoSuchMethodException e) {
                return null;
            }
        }

        public boolean isAbstract() {
            return false;
        }
    }

    // ---------- Helper fake implementation of RealMethod ----------
    static class FakeRealMethod implements RealMethod {
        private final Object returnValue;
        private final Throwable toThrow;
        boolean invoked = false;

        FakeRealMethod(Object returnValue) {
            this.returnValue = returnValue;
            this.toThrow = null;
        }

        FakeRealMethod(Throwable toThrow) {
            this.returnValue = null;
            this.toThrow = toThrow;
        }

        public Object invoke(Object target, Object[] arguments) throws Throwable {
            invoked = true;
            if (toThrow != null) {
                throw toThrow;
            }
            return returnValue;
        }
    }

    private Object mock;
    private FakeMockitoMethod simpleMethod;
    private FakeRealMethod realMethod;

    @Before
    public void setUp() {
        mock = new Object();
        simpleMethod = new FakeMockitoMethod("foo", String.class, new Class<?>[]{String.class}, new Class<?>[0], false);
        realMethod = new FakeRealMethod("realResult");
    }

    // ---------------- Constructor / basic getters ----------------

    @Test
    public void testConstructor_normalArgs_argumentsStored() {
        Object[] args = new Object[]{"bar"};
        Invocation invocation = new Invocation(mock, simpleMethod, args, 1, realMethod);
        assertArrayEquals(args, invocation.getArguments());
        assertArrayEquals(args, invocation.getRawArguments());
        assertEquals(1, invocation.getArgumentsCount());
    }

    @Test
    public void testConstructor_nullArgsNonVarArgs_emptyArguments() {
        Invocation invocation = new Invocation(mock, simpleMethod, null, 1, realMethod);
        assertEquals(0, invocation.getArguments().length);
        assertNull(invocation.getRawArguments());
    }

    @Test
    public void testConstructor_varArgsWithArrayLastArg_expandedArguments() {
        FakeMockitoMethod varArgsMethod = new FakeMockitoMethod("varArgsMethod", void.class,
                new Class<?>[]{int.class, Object[].class}, new Class<?>[0], true);
        Object[] args = new Object[]{1, new Object[]{"a", "b"}};
        Invocation invocation = new Invocation(mock, varArgsMethod, args, 1, realMethod);
        Object[] expanded = invocation.getArguments();
        assertEquals(3, expanded.length);
        assertEquals(1, expanded[0]);
        assertEquals("a", expanded[1]);
        assertEquals("b", expanded[2]);
    }

    @Test
    public void testConstructor_varArgsWithNullLastArg_expandedToNullElement() {
        FakeMockitoMethod varArgsMethod = new FakeMockitoMethod("varArgsMethod", void.class,
                new Class<?>[]{int.class, Object[].class}, new Class<?>[0], true);
        Object[] args = new Object[]{1, null};
        Invocation invocation = new Invocation(mock, varArgsMethod, args, 1, realMethod);
        Object[] expanded = invocation.getArguments();
        assertEquals(2, expanded.length);
        assertEquals(1, expanded[0]);
        assertNull(expanded[1]);
    }

    @Test
    public void testConstructor_varArgsWithNonArrayLastArg_argumentsUnchanged() {
        FakeMockitoMethod varArgsMethod = new FakeMockitoMethod("varArgsMethod", void.class,
                new Class<?>[]{int.class, Object.class}, new Class<?>[0], true);
        Object[] args = new Object[]{1, "singleString"};
        Invocation invocation = new Invocation(mock, varArgsMethod, args, 1, realMethod);
        Object[] result = invocation.getArguments();
        assertEquals(2, result.length);
        assertEquals(1, result[0]);
        assertEquals("singleString", result[1]);
    }

    @Test
    public void testGetMock_normalCase_returnsMock() {
        Invocation invocation = new Invocation(mock, simpleMethod, new Object[]{"x"}, 1, realMethod);
        assertSame(mock, invocation.getMock());
    }

    @Test
    public void testGetMethod_normalCase_returnsMethod() {
        Invocation invocation = new Invocation(mock, simpleMethod, new Object[]{"x"}, 1, realMethod);
        assertSame(simpleMethod, invocation.getMethod());
    }

    @Test
    public void testGetSequenceNumber_normalCase_returnsSequence() {
        Invocation invocation = new Invocation(mock, simpleMethod, new Object[]{"x"}, 42, realMethod);
        assertEquals(Integer.valueOf(42), invocation.getSequenceNumber());
    }

    @Test
    public void testIsVerified_initialState_false() {
        Invocation invocation = new Invocation(mock, simpleMethod, new Object[]{"x"}, 1, realMethod);
        assertFalse(invocation.isVerified());
    }

    @Test
    public void testMarkVerified_afterCall_verifiedTrue() {
        Invocation invocation = new Invocation(mock, simpleMethod, new Object[]{"x"}, 1, realMethod);
        invocation.markVerified();
        assertTrue(invocation.isVerified());
        assertFalse(invocation.isVerifiedInOrder());
    }

    @Test
    public void testMarkVerifiedInOrder_afterCall_bothTrue() {
        Invocation invocation = new Invocation(mock, simpleMethod, new Object[]{"x"}, 1, realMethod);
        invocation.markVerifiedInOrder();
        assertTrue(invocation.isVerified());
        assertTrue(invocation.isVerifiedInOrder());
    }

    @Test
    public void testIsVerifiedInOrder_initialState_false() {
        Invocation invocation = new Invocation(mock, simpleMethod, new Object[]{"x"}, 1, realMethod);
        assertFalse(invocation.isVerifiedInOrder());
    }

    // ---------------- equals ----------------

    @Test
    public void testEquals_sameInvocationFields_true() {
        Object[] args1 = new Object[]{"a"};
        Object[] args2 = new Object[]{"a"};
        Invocation invocation1 = new Invocation(mock, simpleMethod, args1, 1, realMethod);
        Invocation invocation2 = new Invocation(mock, simpleMethod, args2, 2, realMethod);
        assertTrue(invocation1.equals(invocation2));
    }

    @Test
    public void testEquals_null_false() {
        Invocation invocation = new Invocation(mock, simpleMethod, new Object[]{"a"}, 1, realMethod);
        assertFalse(invocation.equals(null));
    }

    @Test
    public void testEquals_differentClass_false() {
        Invocation invocation = new Invocation(mock, simpleMethod, new Object[]{"a"}, 1, realMethod);
        assertFalse(invocation.equals("notAnInvocation"));
    }

    @Test
    public void testEquals_differentMock_false() {
        Invocation invocation1 = new Invocation(mock, simpleMethod, new Object[]{"a"}, 1, realMethod);
        Invocation invocation2 = new Invocation(new Object(), simpleMethod, new Object[]{"a"}, 1, realMethod);
        assertFalse(invocation1.equals(invocation2));
    }

    @Test
    public void testEquals_differentArguments_false() {
        Invocation invocation1 = new Invocation(mock, simpleMethod, new Object[]{"a"}, 1, realMethod);
        Invocation invocation2 = new Invocation(mock, simpleMethod, new Object[]{"b"}, 1, realMethod);
        assertFalse(invocation1.equals(invocation2));
    }

    // ---------------- hashCode ----------------

    @Test(expected = RuntimeException.class)
    public void testHashCode_alwaysThrows_runtimeException() {
        Invocation invocation = new Invocation(mock, simpleMethod, new Object[]{"a"}, 1, realMethod);
        invocation.hashCode();
    }

    // ---------------- toString ----------------

    @Test
    public void testToString_normalCase_notNull() {
        Invocation invocation = new Invocation(mock, simpleMethod, new Object[]{"a"}, 1, realMethod);
        String result = invocation.toString();
        assertNotNull(result);
        assertTrue(result.contains("foo"));
    }

    @Test
    public void testToStringWithPrintSettings_normalCase_notNull() {
        Invocation invocation = new Invocation(mock, simpleMethod, new Object[]{"a"}, 1, realMethod);
        PrintSettings settings = new PrintSettings();
        String result = invocation.toString(settings);
        assertNotNull(result);
    }

    @Test
    public void testToString_manyArgsLongLine_multilineOrSingleHandled() {
        FakeMockitoMethod method = new FakeMockitoMethod("someVeryLongMethodNameForTesting", void.class,
                new Class<?>[]{String.class, String.class, String.class}, new Class<?>[0], false);
        Object[] args = new Object[]{"argumentOne", "argumentTwo", "argumentThree"};
        Invocation invocation = new Invocation(mock, method, args, 1, realMethod);
        String result = invocation.toString();
        assertNotNull(result);
    }

    // ---------------- isToString (static) ----------------

    @Test
    public void testIsToString_toStringMethod_true() {
        FakeMockitoMethod toStringMethod = new FakeMockitoMethod("toString", String.class, new Class<?>[0], new Class<?>[0], false);
        InvocationOnMock invocation = new Invocation(mock, toStringMethod, new Object[0], 1, realMethod);
        assertTrue(Invocation.isToString(invocation));
    }

    @Test
    public void testIsToString_nonToStringMethod_false() {
        FakeMockitoMethod equalsMethod = new FakeMockitoMethod("equals", boolean.class, new Class<?>[]{Object.class}, new Class<?>[0], false);
        InvocationOnMock invocation = new Invocation(mock, equalsMethod, new Object[]{new Object()}, 1, realMethod);
        assertFalse(Invocation.isToString(invocation));
    }

    // ---------------- isValidException ----------------

    @Test
    public void testIsValidException_matchingException_true() {
        FakeMockitoMethod method = new FakeMockitoMethod("foo", void.class, new Class<?>[0],
                new Class<?>[]{IllegalArgumentException.class}, false);
        Invocation invocation = new Invocation(mock, method, new Object[0], 1, realMethod);
        assertTrue(invocation.isValidException(new IllegalArgumentException("bad")));
    }

    @Test
    public void testIsValidException_nonMatchingException_false() {
        FakeMockitoMethod method = new FakeMockitoMethod("foo", void.class, new Class<?>[0],
                new Class<?>[]{IllegalArgumentException.class}, false);
        Invocation invocation = new Invocation(mock, method, new Object[0], 1, realMethod);
        assertFalse(invocation.isValidException(new NullPointerException("bad")));
    }

    @Test
    public void testIsValidException_emptyExceptionTypes_false() {
        FakeMockitoMethod method = new FakeMockitoMethod("foo", void.class, new Class<?>[0], new Class<?>[0], false);
        Invocation invocation = new Invocation(mock, method, new Object[0], 1, realMethod);
        assertFalse(invocation.isValidException(new RuntimeException("bad")));
    }

    // ---------------- isValidReturnType ----------------

    @Test
    public void testIsValidReturnType_primitiveMatchingWrapper_true() {
        FakeMockitoMethod method = new FakeMockitoMethod("foo", int.class, new Class<?>[0], new Class<?>[0], false);
        Invocation invocation = new Invocation(mock, method, new Object[0], 1, realMethod);
        assertTrue(invocation.isValidReturnType(Integer.class));
    }

    @Test
    public void testIsValidReturnType_primitiveNonMatchingWrapper_false() {
        FakeMockitoMethod method = new FakeMockitoMethod("foo", int.class, new Class<?>[0], new Class<?>[0], false);
        Invocation invocation = new Invocation(mock, method, new Object[0], 1, realMethod);
        assertFalse(invocation.isValidReturnType(String.class));
    }

    @Test
    public void testIsValidReturnType_nonPrimitiveAssignable_true() {
        FakeMockitoMethod method = new FakeMockitoMethod("foo", Object.class, new Class<?>[0], new Class<?>[0], false);
        Invocation invocation = new Invocation(mock, method, new Object[0], 1, realMethod);
        assertTrue(invocation.isValidReturnType(String.class));
    }

    @Test
    public void testIsValidReturnType_nonPrimitiveNotAssignable_false() {
        FakeMockitoMethod method = new FakeMockitoMethod("foo", String.class, new Class<?>[0], new Class<?>[0], false);
        Invocation invocation = new Invocation(mock, method, new Object[0], 1, realMethod);
        assertFalse(invocation.isValidReturnType(Object.class));
    }

    // ---------------- isVoid ----------------

    @Test
    public void testIsVoid_voidReturnType_true() {
        FakeMockitoMethod method = new FakeMockitoMethod("foo", Void.TYPE, new Class<?>[0], new Class<?>[0], false);
        Invocation invocation = new Invocation(mock, method, new Object[0], 1, realMethod);
        assertTrue(invocation.isVoid());
    }

    @Test
    public void testIsVoid_nonVoidReturnType_false() {
        FakeMockitoMethod method = new FakeMockitoMethod("foo", String.class, new Class<?>[0], new Class<?>[0], false);
        Invocation invocation = new Invocation(mock, method, new Object[0], 1, realMethod);
        assertFalse(invocation.isVoid());
    }

    // ---------------- printMethodReturnType ----------------

    @Test
    public void testPrintMethodReturnType_normalCase_simpleName() {
        FakeMockitoMethod method = new FakeMockitoMethod("foo", String.class, new Class<?>[0], new Class<?>[0], false);
        Invocation invocation = new Invocation(mock, method, new Object[0], 1, realMethod);
        assertEquals("String", invocation.printMethodReturnType());
    }

    // ---------------- getMethodName ----------------

    @Test
    public void testGetMethodName_normalCase_returnsName() {
        Invocation invocation = new Invocation(mock, simpleMethod, new Object[]{"a"}, 1, realMethod);
        assertEquals("foo", invocation.getMethodName());
    }

    // ---------------- returnsPrimitive ----------------

    @Test
    public void testReturnsPrimitive_primitiveReturnType_true() {
        FakeMockitoMethod method = new FakeMockitoMethod("foo", int.class, new Class<?>[0], new Class<?>[0], false);
        Invocation invocation = new Invocation(mock, method, new Object[0], 1, realMethod);
        assertTrue(invocation.returnsPrimitive());
    }

    @Test
    public void testReturnsPrimitive_nonPrimitiveReturnType_false() {
        Invocation invocation = new Invocation(mock, simpleMethod, new Object[]{"a"}, 1, realMethod);
        assertFalse(invocation.returnsPrimitive());
    }

    // ---------------- getLocation ----------------

    @Test
    public void testGetLocation_normalCase_notNull() {
        Invocation invocation = new Invocation(mock, simpleMethod, new Object[]{"a"}, 1, realMethod);
        Location location = invocation.getLocation();
        assertNotNull(location);
    }

    // ---------------- getArgumentsCount ----------------

    @Test
    public void testGetArgumentsCount_normalCase_correctCount() {
        Invocation invocation = new Invocation(mock, simpleMethod, new Object[]{"a", "b"}, 1, realMethod);
        assertEquals(2, invocation.getArgumentsCount());
    }

    @Test
    public void testGetArgumentsCount_emptyArgs_zero() {
        Invocation invocation = new Invocation(mock, simpleMethod, new Object[0], 1, realMethod);
        assertEquals(0, invocation.getArgumentsCount());
    }

    // ---------------- getRawArguments ----------------

    @Test
    public void testGetRawArguments_normalCase_returnsOriginal() {
        Object[] rawArgs = new Object[]{"a", "b"};
        Invocation invocation = new Invocation(mock, simpleMethod, rawArgs, 1, realMethod);
        assertArrayEquals(rawArgs, invocation.getRawArguments());
    }

    // ---------------- callRealMethod ----------------

    @Test
    public void testCallRealMethod_normalCase_returnsValue() throws Throwable {
        FakeRealMethod fakeReal = new FakeRealMethod("expectedResult");
        Invocation invocation = new Invocation(mock, simpleMethod, new Object[]{"a"}, 1, fakeReal);
        Object result = invocation.callRealMethod();
        assertEquals("expectedResult", result);
        assertTrue(fakeReal.invoked);
    }

    @Test(expected = IllegalStateException.class)
    public void testCallRealMethod_throwsException_propagates() throws Throwable {
        FakeRealMethod fakeReal = new FakeRealMethod(new IllegalStateException("boom"));
        Invocation invocation = new Invocation(mock, simpleMethod, new Object[]{"a"}, 1, fakeReal);
        invocation.callRealMethod();
    }
}
