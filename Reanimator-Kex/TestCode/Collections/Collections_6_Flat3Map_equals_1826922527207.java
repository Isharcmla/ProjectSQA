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

public class Flat3Map_equals_1826922527207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34147;
     Object term34239;
     Object term34445;
     Object term34446;

    public Flat3Map_equals_1826922527207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34147 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term34147, term34147.getClass(), "delegateMap", null);
        setIntField(term34147, term34147.getClass(), "size", 0);
        term34239 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term34349 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term34239, term34239.getClass(), "delegateMap", term34349);
        term34445 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term34445, term34445.getClass(), "size", 0);
        setIntField(term34445, term34445.getClass(), "hash1", 0);
        setIntField(term34445, term34445.getClass(), "hash2", 0);
        setIntField(term34445, term34445.getClass(), "hash3", 0);
        setField(term34445, term34445.getClass(), "key1", null);
        setField(term34445, term34445.getClass(), "key2", null);
        setField(term34445, term34445.getClass(), "key3", null);
        setField(term34445, term34445.getClass(), "value1", null);
        setField(term34445, term34445.getClass(), "value2", null);
        setField(term34445, term34445.getClass(), "value3", null);
        setField(term34445, term34445.getClass(), "delegateMap", null);
        term34446 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term34447 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term34446, term34446.getClass(), "size", 0);
        setIntField(term34446, term34446.getClass(), "hash1", 0);
        setIntField(term34446, term34446.getClass(), "hash2", 0);
        setIntField(term34446, term34446.getClass(), "hash3", 0);
        setField(term34446, term34446.getClass(), "key1", null);
        setField(term34446, term34446.getClass(), "key2", null);
        setField(term34446, term34446.getClass(), "key3", null);
        setField(term34446, term34446.getClass(), "value1", null);
        setField(term34446, term34446.getClass(), "value2", null);
        setField(term34446, term34446.getClass(), "value3", null);
        setFloatField(term34447, term34447.getClass(), "loadFactor", 0.0F);
        setIntField(term34447, term34447.getClass(), "size", 0);
        setField(term34447, term34447.getClass(), "data", null);
        setIntField(term34447, term34447.getClass(), "threshold", 0);
        setIntField(term34447, term34447.getClass(), "modCount", 0);
        setField(term34447, term34447.getClass(), "entrySet", null);
        setField(term34447, term34447.getClass(), "keySet", null);
        setField(term34447, term34447.getClass(), "values", null);
        setField(term34447, term34447.getClass(), "keySet", null);
        setField(term34447, term34447.getClass(), "values", null);
        setField(term34446, term34446.getClass(), "delegateMap", term34447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term34239;
        Object retValue = callMethod(klass, "equals", argTypes, term34147, args);
        assertTrue(recursiveEquals(term34147, term34445));
        assertTrue(recursiveEquals(term34239, term34446));
        assertTrue(recursiveEquals(retValue, true));
    }

};


