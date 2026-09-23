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
import java.util.LinkedList;

public class InvocationMatcher_init_14255524330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term114;

    public InvocationMatcher_init_14255524330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term3 = newInstance(Class.forName("java.lang.Object"));
        Object[] term4 = (Object[]) newArray("java.lang.Object", 5);
        Object term5 = newInstance(Class.forName("java.lang.Object"));
        Object term6 = newInstance(Class.forName("java.lang.Object"));
        Object term7 = newInstance(Class.forName("java.lang.Object"));
        Object term8 = newInstance(Class.forName("java.lang.Object"));
        Object term9 = newInstance(Class.forName("java.lang.Object"));
        Object[] term10 = (Object[]) newArray("java.lang.Object", 4);
        Object term11 = newInstance(Class.forName("java.lang.Object"));
        Object term12 = newInstance(Class.forName("java.lang.Object"));
        Object term13 = newInstance(Class.forName("java.lang.Object"));
        Object term14 = newInstance(Class.forName("java.lang.Object"));
        Object term15 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term113 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term1, term1.getClass(), "sequenceNumber", 568599855);
        setField(term1, term1.getClass(), "mock", term3);
        setField(term1, term1.getClass(), "method", null);
        setElement(term4, 0, term5);
        setElement(term4, 1, term6);
        setElement(term4, 2, term7);
        setElement(term4, 3, term8);
        setElement(term4, 4, term9);
        setField(term1, term1.getClass(), "arguments", term4);
        setElement(term10, 0, term11);
        setElement(term10, 1, term12);
        setElement(term10, 2, term13);
        setElement(term10, 3, term14);
        setField(term1, term1.getClass(), "rawArguments", term10);
        setField(term15, term15.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term1, term1.getClass(), "location", term15);
        setBooleanField(term1, term1.getClass(), "verified", false);
        setField(term1, term1.getClass(), "realMethod", null);
        setField(term113, term113.getClass(), "stubbedAt", null);
        setField(term1, term1.getClass(), "stubInfo", term113);
        term114 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.mockito.internal.invocation.Invocation");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term114;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


