package org.apache.commons.collections4.keyvalue;

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
import static org.apache.commons.collections4.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.keyvalue.EqualityUtils.*;
import java.lang.Object;

public class MultiKey_init_116267155653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4562;
     Object term10383;
     Object term10388;

    public MultiKey_init_116267155653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4718 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        setField(term4718, term4718.getClass(), "keys", null);
        term4562 = (Object[]) newArray("java.lang.Object", 4);
        Object[] term4563 = (Object[]) newArray("java.lang.Object", 0);
        Object term4756 = newInstance(Class.forName("java.lang.Object"));
        Object[] term4565 = (Object[]) newArray("java.lang.Object", 0);
        setElement(term4562, 0, term4563);
        setElement(term4562, 1, term4756);
        setElement(term4562, 2, term4565);
        setElement(term4562, 3, term4756);
        term10383 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term10384 = (Object[]) newArray("java.lang.Object", 4);
        Object[] term10385 = (Object[]) newArray("java.lang.Object", 0);
        Object term10386 = newInstance(Class.forName("java.lang.Object"));
        Object[] term10387 = (Object[]) newArray("java.lang.Object", 0);
        setElement(term10384, 0, term10385);
        setElement(term10384, 1, term10386);
        setElement(term10384, 2, term10387);
        setElement(term10384, 3, term10386);
        setField(term10383, term10383.getClass(), "keys", term10384);
        term10388 = (Object[]) newArray("java.lang.Object", 4);
        Object[] term10389 = (Object[]) newArray("java.lang.Object", 0);
        Object term10390 = newInstance(Class.forName("java.lang.Object"));
        Object[] term10391 = (Object[]) newArray("java.lang.Object", 0);
        setElement(term10388, 0, term10389);
        setElement(term10388, 1, term10390);
        setElement(term10388, 2, term10391);
        setElement(term10388, 3, term10390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4562;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term10383));
        assertTrue(recursiveEquals(term4562, term10388));
    }

};


