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

public class Invocation_getMethodName_145051951149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6451;

    public Invocation_getMethodName_145051951149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6451 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term6453 = newInstance(Class.forName("java.lang.Object"));
        Object[] term6454 = (Object[]) newArray("java.lang.Object", 2);
        Object term6455 = newInstance(Class.forName("java.lang.Object"));
        Object term6456 = newInstance(Class.forName("java.lang.Object"));
        Object[] term6457 = (Object[]) newArray("java.lang.Object", 1);
        Object term6458 = newInstance(Class.forName("java.lang.Object"));
        Object term6459 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term6451, term6451.getClass(), "sequenceNumber", 1622346318);
        setField(term6451, term6451.getClass(), "mock", term6453);
        setField(term6451, term6451.getClass(), "method", null);
        setElement(term6454, 0, term6455);
        setElement(term6454, 1, term6456);
        setField(term6451, term6451.getClass(), "arguments", term6454);
        setElement(term6457, 0, term6458);
        setField(term6451, term6451.getClass(), "rawArguments", term6457);
        setField(term6459, term6459.getClass(), "where", "-> at jdk.internal.reflect.GeneratedConstructorAccessor10.newInstance(Unknown Source)");
        setField(term6451, term6451.getClass(), "location", term6459);
        setBooleanField(term6451, term6451.getClass(), "verified", true);
        setBooleanField(term6451, term6451.getClass(), "verifiedInOrder", true);
        setField(term6451, term6451.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getMethodName", argTypes, term6451, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


