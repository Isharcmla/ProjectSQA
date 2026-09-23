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
     Object term212;

    public InvocationMatcher_init_13207293651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term214 = newInstance(Class.forName("java.lang.Object"));
        Object[] term215 = (Object[]) newArray("java.lang.Object", 4);
        Object term216 = newInstance(Class.forName("java.lang.Object"));
        Object term217 = newInstance(Class.forName("java.lang.Object"));
        Object term218 = newInstance(Class.forName("java.lang.Object"));
        Object term219 = newInstance(Class.forName("java.lang.Object"));
        Object[] term220 = (Object[]) newArray("java.lang.Object", 5);
        Object term221 = newInstance(Class.forName("java.lang.Object"));
        Object term222 = newInstance(Class.forName("java.lang.Object"));
        Object term223 = newInstance(Class.forName("java.lang.Object"));
        Object term224 = newInstance(Class.forName("java.lang.Object"));
        Object term225 = newInstance(Class.forName("java.lang.Object"));
        Object term226 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term325 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term212, term212.getClass(), "sequenceNumber", 1162663216);
        setField(term212, term212.getClass(), "mock", term214);
        setField(term212, term212.getClass(), "method", null);
        setElement(term215, 0, term216);
        setElement(term215, 1, term217);
        setElement(term215, 2, term218);
        setElement(term215, 3, term219);
        setField(term212, term212.getClass(), "arguments", term215);
        setElement(term220, 0, term221);
        setElement(term220, 1, term222);
        setElement(term220, 2, term223);
        setElement(term220, 3, term224);
        setElement(term220, 4, term225);
        setField(term212, term212.getClass(), "rawArguments", term220);
        setField(term226, term226.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term212, term212.getClass(), "location", term226);
        setBooleanField(term212, term212.getClass(), "verified", false);
        setBooleanField(term212, term212.getClass(), "verifiedInOrder", false);
        setField(term212, term212.getClass(), "realMethod", null);
        setField(term325, term325.getClass(), "stubbedAt", null);
        setField(term212, term212.getClass(), "stubInfo", term325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.invocation.Invocation");
        Object[] args = new Object[1];
        args[0] = term212;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


