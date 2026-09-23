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

public class Flat3Map_equals_1826922527408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70339;
     Object term70541;
     Object term71349;
     Object term71351;

    public Flat3Map_equals_1826922527408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70339 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term70449 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term70339, term70339.getClass(), "delegateMap", null);
        setIntField(term70339, term70339.getClass(), "size", 3);
        setField(term70339, term70339.getClass(), "key3", null);
        setField(term70339, term70339.getClass(), "value3", term70449);
        term70541 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term70651 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term70541, term70541.getClass(), "delegateMap", null);
        setIntField(term70541, term70541.getClass(), "size", 3);
        setField(term70541, term70541.getClass(), "key3", null);
        setField(term70541, term70541.getClass(), "value3", term70651);
        term71349 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term71350 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term71349, term71349.getClass(), "size", 3);
        setIntField(term71349, term71349.getClass(), "hash1", 0);
        setIntField(term71349, term71349.getClass(), "hash2", 0);
        setIntField(term71349, term71349.getClass(), "hash3", 0);
        setField(term71349, term71349.getClass(), "key1", null);
        setField(term71349, term71349.getClass(), "key2", null);
        setField(term71349, term71349.getClass(), "key3", null);
        setField(term71349, term71349.getClass(), "value1", null);
        setField(term71349, term71349.getClass(), "value2", null);
        setFloatField(term71350, term71350.getClass(), "loadFactor", 0.0F);
        setIntField(term71350, term71350.getClass(), "size", 0);
        setField(term71350, term71350.getClass(), "data", null);
        setIntField(term71350, term71350.getClass(), "threshold", 0);
        setIntField(term71350, term71350.getClass(), "modCount", 0);
        setField(term71350, term71350.getClass(), "entrySet", null);
        setField(term71350, term71350.getClass(), "keySet", null);
        setField(term71350, term71350.getClass(), "values", null);
        setField(term71350, term71350.getClass(), "keySet", null);
        setField(term71350, term71350.getClass(), "values", null);
        setField(term71349, term71349.getClass(), "value3", term71350);
        setField(term71349, term71349.getClass(), "delegateMap", null);
        term71351 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term71352 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term71351, term71351.getClass(), "size", 3);
        setIntField(term71351, term71351.getClass(), "hash1", 0);
        setIntField(term71351, term71351.getClass(), "hash2", 0);
        setIntField(term71351, term71351.getClass(), "hash3", 0);
        setField(term71351, term71351.getClass(), "key1", null);
        setField(term71351, term71351.getClass(), "key2", null);
        setField(term71351, term71351.getClass(), "key3", null);
        setField(term71351, term71351.getClass(), "value1", null);
        setField(term71351, term71351.getClass(), "value2", null);
        setFloatField(term71352, term71352.getClass(), "loadFactor", 0.0F);
        setIntField(term71352, term71352.getClass(), "size", 0);
        setField(term71352, term71352.getClass(), "data", null);
        setIntField(term71352, term71352.getClass(), "threshold", 0);
        setIntField(term71352, term71352.getClass(), "modCount", 0);
        setField(term71352, term71352.getClass(), "entrySet", null);
        setField(term71352, term71352.getClass(), "keySet", null);
        setField(term71352, term71352.getClass(), "values", null);
        setField(term71352, term71352.getClass(), "keySet", null);
        setField(term71352, term71352.getClass(), "values", null);
        setField(term71351, term71351.getClass(), "value3", term71352);
        setField(term71351, term71351.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term70541;
        Object retValue = callMethod(klass, "equals", argTypes, term70339, args);
        assertTrue(recursiveEquals(term70339, term71349));
        assertTrue(recursiveEquals(term70541, term71351));
        assertTrue(recursiveEquals(retValue, false));
    }

};


