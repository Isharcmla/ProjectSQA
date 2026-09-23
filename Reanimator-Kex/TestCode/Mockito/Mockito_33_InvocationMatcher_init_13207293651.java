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
import static org.mockito.internal.invocation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class InvocationMatcher_init_13207293651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211;

    public InvocationMatcher_init_13207293651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term213 = newInstance(Class.forName("java.lang.Object"));
        Object[] term214 = (Object[]) newArray("java.lang.Object", 4);
        Object term215 = newInstance(Class.forName("java.lang.Object"));
        Object term216 = newInstance(Class.forName("java.lang.Object"));
        Object term217 = newInstance(Class.forName("java.lang.Object"));
        Object term218 = newInstance(Class.forName("java.lang.Object"));
        Object[] term219 = (Object[]) newArray("java.lang.Object", 5);
        Object term220 = newInstance(Class.forName("java.lang.Object"));
        Object term221 = newInstance(Class.forName("java.lang.Object"));
        Object term222 = newInstance(Class.forName("java.lang.Object"));
        Object term223 = newInstance(Class.forName("java.lang.Object"));
        Object term224 = newInstance(Class.forName("java.lang.Object"));
        Object term225 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term323 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term211, term211.getClass(), "sequenceNumber", 1162663216);
        setField(term211, term211.getClass(), "mock", term213);
        setField(term211, term211.getClass(), "method", null);
        setElement(term214, 0, term215);
        setElement(term214, 1, term216);
        setElement(term214, 2, term217);
        setElement(term214, 3, term218);
        setField(term211, term211.getClass(), "arguments", term214);
        setElement(term219, 0, term220);
        setElement(term219, 1, term221);
        setElement(term219, 2, term222);
        setElement(term219, 3, term223);
        setElement(term219, 4, term224);
        setField(term211, term211.getClass(), "rawArguments", term219);
        setField(term225, term225.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term211, term211.getClass(), "location", term225);
        setBooleanField(term211, term211.getClass(), "verified", false);
        setField(term211, term211.getClass(), "realMethod", null);
        setField(term323, term323.getClass(), "stubbedAt", null);
        setField(term211, term211.getClass(), "stubInfo", term323);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.invocation.Invocation");
        Object[] args = new Object[1];
        args[0] = term211;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


