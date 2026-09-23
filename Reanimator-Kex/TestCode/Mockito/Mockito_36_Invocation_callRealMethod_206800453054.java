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
import java.lang.NullPointerException;
import static org.mockito.internal.invocation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Invocation_callRealMethod_206800453054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7385;

    public Invocation_callRealMethod_206800453054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7385 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term7387 = newInstance(Class.forName("java.lang.Object"));
        Object[] term7388 = (Object[]) newArray("java.lang.Object", 0);
        Object[] term7389 = (Object[]) newArray("java.lang.Object", 4);
        Object term7390 = newInstance(Class.forName("java.lang.Object"));
        Object term7391 = newInstance(Class.forName("java.lang.Object"));
        Object term7392 = newInstance(Class.forName("java.lang.Object"));
        Object term7393 = newInstance(Class.forName("java.lang.Object"));
        Object term7394 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term7385, term7385.getClass(), "sequenceNumber", -117576464);
        setField(term7385, term7385.getClass(), "mock", term7387);
        setField(term7385, term7385.getClass(), "method", null);
        setField(term7385, term7385.getClass(), "arguments", term7388);
        setElement(term7389, 0, term7390);
        setElement(term7389, 1, term7391);
        setElement(term7389, 2, term7392);
        setElement(term7389, 3, term7393);
        setField(term7385, term7385.getClass(), "rawArguments", term7389);
        setField(term7394, term7394.getClass(), "where", "-> at jdk.internal.reflect.GeneratedConstructorAccessor10.newInstance(Unknown Source)");
        setField(term7385, term7385.getClass(), "location", term7394);
        setBooleanField(term7385, term7385.getClass(), "verified", true);
        setBooleanField(term7385, term7385.getClass(), "verifiedInOrder", true);
        setField(term7385, term7385.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "callRealMethod", argTypes, term7385, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


