package org.mockito.internal.stubbing.answers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.MockitoMethod;
import org.mockito.internal.invocation.realmethod.RealMethod;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.io.IOException;
import java.lang.reflect.Method;

public class AnswersValidatorTest {

    private AnswersValidator validator;

    private interface TestTarget {
        void voidMethod();
        int intPrimitiveMethod();
        String stringMethod();
        void methodWithCheckedException() throws IOException;
    }

    private static class SimpleRealMethod implements RealMethod {
        public Object invoke(Object target, Object[] arguments) throws Throwable {
            return null;
        }
    }

    private static class SimpleMockitoMethod implements MockitoMethod {
        private final Method method;

        public SimpleMockitoMethod(Method method) {
            this.method = method;
        }

        public String getName() {
            return method.getName();
        }

        public Class<?> getReturnType() {
            return method.getReturnType();
        }

        public Class<?>[] getParameterTypes() {
            return method.getParameterTypes();
        }

        public Class<?>[] getExceptionTypes() {
            return method.getExceptionTypes();
        }

        public boolean isVarArgs() {
            return method.isVarArgs();
        }

        public Method getJavaMethod() {
            return method;
        }
    }

    private Invocation createInvocation(String methodName) throws Exception {
        Method method = TestTarget.class.getMethod(methodName);
        return new Invocation(
                new Object(),
                new SimpleMockitoMethod(method),
                new Object[0],
                1,
                new SimpleRealMethod()
        );
    }

    @Before
    public void setUp() {
        validator = new AnswersValidator();
    }

    @Test(expected = MockitoException.class)
    public void testValidate_throwsExceptionWithNullThrowable_throwsMockitoException() throws Exception {
        Invocation invocation = createInvocation("voidMethod");
        ThrowsException answer = new ThrowsException(null);
        validator.validate(answer, invocation);
    }

    @Test
    public void testValidate_throwsExceptionWithRuntimeException_success() throws Exception {
        Invocation invocation = createInvocation("voidMethod");
        ThrowsException answer = new ThrowsException(new RuntimeException("runtime error"));
        validator.validate(answer, invocation);
    }

    @Test
    public void testValidate_throwsExceptionWithError_success() throws Exception {
        Invocation invocation = createInvocation("voidMethod");
        ThrowsException answer = new ThrowsException(new Error("error"));
        validator.validate(answer, invocation);
    }

    @Test
    public void testValidate_throwsExceptionWithDeclaredCheckedException_success() throws Exception {
        Invocation invocation = createInvocation("methodWithCheckedException");
        ThrowsException answer = new ThrowsException(new IOException("io error"));
        validator.validate(answer, invocation);
    }

    @Test(expected = MockitoException.class)
    public void testValidate_throwsExceptionWithUndeclaredCheckedException_throwsMockitoException() throws Exception {
        Invocation invocation = createInvocation("voidMethod");
        ThrowsException answer = new ThrowsException(new IOException("undeclared checked exception"));
        validator.validate(answer, invocation);
    }

    @Test
    public void testValidate_doesNothingOnVoidMethod_success() throws Exception {
        Invocation invocation = createInvocation("voidMethod");
        DoesNothing answer = new DoesNothing();
        validator.validate(answer, invocation);
    }

    @Test(expected = MockitoException.class)
    public void testValidate_doesNothingOnNonVoidMethod_throwsMockitoException() throws Exception {
        Invocation invocation = createInvocation("stringMethod");
        DoesNothing answer = new DoesNothing();
        validator.validate(answer, invocation);
    }

    @Test(expected = MockitoException.class)
    public void testValidate_returnsValueOnVoidMethod_throwsMockitoException() throws Exception {
        Invocation invocation = createInvocation("voidMethod");
        Returns answer = new Returns("result");
        validator.validate(answer, invocation);
    }

    @Test(expected = MockitoException.class)
    public void testValidate_returnsNullOnPrimitiveMethod_throwsMockitoException() throws Exception {
        Invocation invocation = createInvocation("intPrimitiveMethod");
        Returns answer = new Returns(null);
        validator.validate(answer, invocation);
    }

    @Test
    public void testValidate_returnsNullOnObjectMethod_success() throws Exception {
        Invocation invocation = createInvocation("stringMethod");
        Returns answer = new Returns(null);
        validator.validate(answer, invocation);
    }

    @Test(expected = MockitoException.class)
    public void testValidate_returnsIncompatibleTypeOnObjectMethod_throwsMockitoException() throws Exception {
        Invocation invocation = createInvocation("stringMethod");
        Returns answer = new Returns(123);
        validator.validate(answer, invocation);
    }

    @Test
    public void testValidate_returnsValidTypeOnObjectMethod_success() throws Exception {
        Invocation invocation = createInvocation("stringMethod");
        Returns answer = new Returns("validString");
        validator.validate(answer, invocation);
    }

    @Test
    public void testValidate_returnsValidTypeOnPrimitiveMethod_success() throws Exception {
        Invocation invocation = createInvocation("intPrimitiveMethod");
        Returns answer = new Returns(42);
        validator.validate(answer, invocation);
    }

    @Test
    public void testValidate_customGenericAnswer_success() throws Exception {
        Invocation invocation = createInvocation("stringMethod");
        Answer<String> answer = new Answer<String>() {
            public String answer(InvocationOnMock invocation) {
                return "custom";
            }
        };
        validator.validate(answer, invocation);
        Assert.assertNotNull(answer);
    }
}
