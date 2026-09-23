package org.mockito.internal.invocation;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import org.mockito.exceptions.misusing.NotAMockException;
import static org.mockito.internal.invocation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedList;

public class InvocationMatcher_toString_189783926424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2935;
     Object term3053;

    public InvocationMatcher_toString_189783926424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3049 = new ArrayList();
        term2935 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        Object term2936 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term2938 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2939 = (Object[]) newArray("java.lang.Object", 8);
        Object term2940 = newInstance(Class.forName("java.lang.Object"));
        Object term2941 = newInstance(Class.forName("java.lang.Object"));
        Object term2942 = newInstance(Class.forName("java.lang.Object"));
        Object term2943 = newInstance(Class.forName("java.lang.Object"));
        Object term2944 = newInstance(Class.forName("java.lang.Object"));
        Object term2945 = newInstance(Class.forName("java.lang.Object"));
        Object term2946 = newInstance(Class.forName("java.lang.Object"));
        Object term2947 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2948 = (Object[]) newArray("java.lang.Object", 0);
        Object term2949 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term3048 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term2936, term2936.getClass(), "sequenceNumber", 1585847225);
        setField(term2936, term2936.getClass(), "mock", term2938);
        setField(term2936, term2936.getClass(), "method", null);
        setElement(term2939, 0, term2940);
        setElement(term2939, 1, term2941);
        setElement(term2939, 2, term2942);
        setElement(term2939, 3, term2943);
        setElement(term2939, 4, term2944);
        setElement(term2939, 5, term2945);
        setElement(term2939, 6, term2946);
        setElement(term2939, 7, term2947);
        setField(term2936, term2936.getClass(), "arguments", term2939);
        setField(term2936, term2936.getClass(), "rawArguments", term2948);
        setField(term2949, term2949.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term2936, term2936.getClass(), "location", term2949);
        setBooleanField(term2936, term2936.getClass(), "verified", true);
        setBooleanField(term2936, term2936.getClass(), "verifiedInOrder", true);
        setField(term2936, term2936.getClass(), "realMethod", null);
        setField(term3048, term3048.getClass(), "stubbedAt", null);
        setField(term2936, term2936.getClass(), "stubInfo", term3048);
        setField(term2935, term2935.getClass(), "invocation", term2936);
        setField(term2935, term2935.getClass(), "matchers", term3049);
        LinkedList term3055 = new LinkedList();
        term3053 = newInstance(Class.forName("org.mockito.internal.reporting.PrintSettings"));
        setBooleanField(term3053, term3053.getClass(), "multiline", true);
        setField(term3053, term3053.getClass(), "withTypeInfo", term3055);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.reporting.PrintSettings");
        Object[] args = new Object[1];
        args[0] = term3053;
        try {
            callMethod(klass, "toString", argTypes, term2935, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


