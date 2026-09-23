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

public class Invocation_equalArguments_1675249799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1454;
     Object term1560;

    public Invocation_equalArguments_1675249799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1454 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term1456 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1457 = (Object[]) newArray("java.lang.Object", 0);
        Object[] term1458 = (Object[]) newArray("java.lang.Object", 2);
        Object term1459 = newInstance(Class.forName("java.lang.Object"));
        Object term1460 = newInstance(Class.forName("java.lang.Object"));
        Object term1461 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term1454, term1454.getClass(), "sequenceNumber", 1227103734);
        setField(term1454, term1454.getClass(), "mock", term1456);
        setField(term1454, term1454.getClass(), "method", null);
        setField(term1454, term1454.getClass(), "arguments", term1457);
        setElement(term1458, 0, term1459);
        setElement(term1458, 1, term1460);
        setField(term1454, term1454.getClass(), "rawArguments", term1458);
        setField(term1461, term1461.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term1454, term1454.getClass(), "location", term1461);
        setBooleanField(term1454, term1454.getClass(), "verified", false);
        setBooleanField(term1454, term1454.getClass(), "verifiedInOrder", true);
        setField(term1454, term1454.getClass(), "realMethod", null);
        term1560 = (Object[]) newArray("java.lang.Object", 8);
        Object term1561 = newInstance(Class.forName("java.lang.Object"));
        Object term1562 = newInstance(Class.forName("java.lang.Object"));
        Object term1563 = newInstance(Class.forName("java.lang.Object"));
        Object term1564 = newInstance(Class.forName("java.lang.Object"));
        Object term1565 = newInstance(Class.forName("java.lang.Object"));
        Object term1566 = newInstance(Class.forName("java.lang.Object"));
        Object term1567 = newInstance(Class.forName("java.lang.Object"));
        Object term1568 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1560, 0, term1561);
        setElement(term1560, 1, term1562);
        setElement(term1560, 2, term1563);
        setElement(term1560, 3, term1564);
        setElement(term1560, 4, term1565);
        setElement(term1560, 5, term1566);
        setElement(term1560, 6, term1567);
        setElement(term1560, 7, term1568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1560;
        callMethod(klass, "equalArguments", argTypes, term1454, args);
    }

};


