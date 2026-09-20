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

public class Flat3Map_equals_1826922527166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28256;
     Object term28348;
     Object term28707;
     Object term28708;

    public Flat3Map_equals_1826922527166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28256 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term28256, term28256.getClass(), "delegateMap", null);
        setIntField(term28256, term28256.getClass(), "size", 0);
        term28348 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term28458 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term28348, term28348.getClass(), "delegateMap", term28458);
        term28707 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term28707, term28707.getClass(), "size", 0);
        setIntField(term28707, term28707.getClass(), "hash1", 0);
        setIntField(term28707, term28707.getClass(), "hash2", 0);
        setIntField(term28707, term28707.getClass(), "hash3", 0);
        setField(term28707, term28707.getClass(), "key1", null);
        setField(term28707, term28707.getClass(), "key2", null);
        setField(term28707, term28707.getClass(), "key3", null);
        setField(term28707, term28707.getClass(), "value1", null);
        setField(term28707, term28707.getClass(), "value2", null);
        setField(term28707, term28707.getClass(), "value3", null);
        setField(term28707, term28707.getClass(), "delegateMap", null);
        term28708 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term28709 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term28708, term28708.getClass(), "size", 0);
        setIntField(term28708, term28708.getClass(), "hash1", 0);
        setIntField(term28708, term28708.getClass(), "hash2", 0);
        setIntField(term28708, term28708.getClass(), "hash3", 0);
        setField(term28708, term28708.getClass(), "key1", null);
        setField(term28708, term28708.getClass(), "key2", null);
        setField(term28708, term28708.getClass(), "key3", null);
        setField(term28708, term28708.getClass(), "value1", null);
        setField(term28708, term28708.getClass(), "value2", null);
        setField(term28708, term28708.getClass(), "value3", null);
        setFloatField(term28709, term28709.getClass(), "loadFactor", 0.0F);
        setIntField(term28709, term28709.getClass(), "size", 0);
        setField(term28709, term28709.getClass(), "data", null);
        setIntField(term28709, term28709.getClass(), "threshold", 0);
        setIntField(term28709, term28709.getClass(), "modCount", 0);
        setField(term28709, term28709.getClass(), "entrySet", null);
        setField(term28709, term28709.getClass(), "keySet", null);
        setField(term28709, term28709.getClass(), "values", null);
        setField(term28709, term28709.getClass(), "keySet", null);
        setField(term28709, term28709.getClass(), "values", null);
        setField(term28708, term28708.getClass(), "delegateMap", term28709);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term28348;
        Object retValue = callMethod(klass, "equals", argTypes, term28256, args);
        assertTrue(recursiveEquals(term28256, term28707));
        assertTrue(recursiveEquals(term28348, term28708));
        assertTrue(recursiveEquals(retValue, true));
    }

};
