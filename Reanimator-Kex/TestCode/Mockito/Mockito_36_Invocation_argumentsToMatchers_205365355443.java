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
import static org.mockito.internal.invocation.EqualityUtils.*;
import java.lang.Object;

public class Invocation_argumentsToMatchers_205365355443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2496;
     Object term11344;

    public Invocation_argumentsToMatchers_205365355443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2496 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term2498 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2499 = (Object[]) newArray("java.lang.Object", 4);
        Object term2500 = newInstance(Class.forName("java.lang.Object"));
        Object term2501 = newInstance(Class.forName("java.lang.Object"));
        Object term2502 = newInstance(Class.forName("java.lang.Object"));
        Object term2503 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2504 = (Object[]) newArray("java.lang.Object", 9);
        Object term2505 = newInstance(Class.forName("java.lang.Object"));
        Object term2506 = newInstance(Class.forName("java.lang.Object"));
        Object term2507 = newInstance(Class.forName("java.lang.Object"));
        Object term2508 = newInstance(Class.forName("java.lang.Object"));
        Object term2509 = newInstance(Class.forName("java.lang.Object"));
        Object term2510 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term2496, term2496.getClass(), "sequenceNumber", -883034806);
        setField(term2496, term2496.getClass(), "mock", term2498);
        setField(term2496, term2496.getClass(), "method", null);
        setElement(term2499, 0, term2500);
        setElement(term2499, 1, term2501);
        setElement(term2499, 2, term2502);
        setElement(term2499, 3, term2503);
        setField(term2496, term2496.getClass(), "arguments", term2499);
        setElement(term2504, 0, term2505);
        setElement(term2504, 1, term2506);
        setElement(term2504, 2, term2507);
        setElement(term2504, 3, term2508);
        setElement(term2504, 4, term2509);
        setElement(term2504, 5, term2507);
        setElement(term2504, 6, term2508);
        setElement(term2504, 7, term2498);
        setElement(term2504, 8, term2505);
        setField(term2496, term2496.getClass(), "rawArguments", term2504);
        setField(term2510, term2510.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term2496, term2496.getClass(), "location", term2510);
        setBooleanField(term2496, term2496.getClass(), "verified", false);
        setBooleanField(term2496, term2496.getClass(), "verifiedInOrder", false);
        setField(term2496, term2496.getClass(), "realMethod", null);
        term11344 = newInstance(Class.forName("org.mockito.internal.matchers.Equals"));
        setField(term11344, term11344.getClass(), "wanted", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "argumentsToMatchers", argTypes, term2496, args);
        assertTrue(recursiveEquals(term2496, term11344));
    }

};


