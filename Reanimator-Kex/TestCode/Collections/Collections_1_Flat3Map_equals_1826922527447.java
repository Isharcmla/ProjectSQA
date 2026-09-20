package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.map.EqualityUtils.*;
import java.lang.Object;

public class Flat3Map_equals_1826922527447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82039;
     Object term82171;
     Object term83051;
     Object term83053;

    public Flat3Map_equals_1826922527447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82039 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term82133 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term82039, term82039.getClass(), "delegateMap", term82133);
        term82171 = newInstance(Class.forName("java.lang.Object"));
        term83051 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term83052 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setIntField(term83051, term83051.getClass(), "size", 0);
        setIntField(term83051, term83051.getClass(), "hash1", 0);
        setIntField(term83051, term83051.getClass(), "hash2", 0);
        setIntField(term83051, term83051.getClass(), "hash3", 0);
        setField(term83051, term83051.getClass(), "key1", null);
        setField(term83051, term83051.getClass(), "key2", null);
        setField(term83051, term83051.getClass(), "key3", null);
        setField(term83051, term83051.getClass(), "value1", null);
        setField(term83051, term83051.getClass(), "value2", null);
        setField(term83051, term83051.getClass(), "value3", null);
        setField(term83052, term83052.getClass(), "header", null);
        setFloatField(term83052, term83052.getClass(), "loadFactor", 0.0F);
        setIntField(term83052, term83052.getClass(), "size", 0);
        setField(term83052, term83052.getClass(), "data", null);
        setIntField(term83052, term83052.getClass(), "threshold", 0);
        setIntField(term83052, term83052.getClass(), "modCount", 0);
        setField(term83052, term83052.getClass(), "entrySet", null);
        setField(term83052, term83052.getClass(), "keySet", null);
        setField(term83052, term83052.getClass(), "values", null);
        setField(term83052, term83052.getClass(), "keySet", null);
        setField(term83052, term83052.getClass(), "values", null);
        setField(term83051, term83051.getClass(), "delegateMap", term83052);
        term83053 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term82171;
        Object retValue = callMethod(klass, "equals", argTypes, term82039, args);
        assertTrue(recursiveEquals(term82039, term83051));
        assertTrue(recursiveEquals(term82171, term83053));
        assertTrue(recursiveEquals(retValue, false));
    }

};
