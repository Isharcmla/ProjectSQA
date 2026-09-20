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

public class Flat3Map_put_1944740725830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167991;
     Object term168491;
     Object term168496;

    public Flat3Map_put_1944740725830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167991 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term167991, term167991.getClass(), "delegateMap", null);
        setIntField(term167991, term167991.getClass(), "size", 3);
        term168491 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term168492 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term168493 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term168494 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term168495 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term168491, term168491.getClass(), "size", 0);
        setIntField(term168491, term168491.getClass(), "hash1", 0);
        setIntField(term168491, term168491.getClass(), "hash2", 0);
        setIntField(term168491, term168491.getClass(), "hash3", 0);
        setField(term168491, term168491.getClass(), "key1", null);
        setField(term168491, term168491.getClass(), "key2", null);
        setField(term168491, term168491.getClass(), "key3", null);
        setField(term168491, term168491.getClass(), "value1", null);
        setField(term168491, term168491.getClass(), "value2", null);
        setField(term168491, term168491.getClass(), "value3", null);
        setFloatField(term168492, term168492.getClass(), "loadFactor", 0.75F);
        setIntField(term168492, term168492.getClass(), "size", 2);
        setField(term168495, term168495.getClass(), "next", null);
        setField(term168495, term168495.getClass(), "key", null);
        setField(term168495, term168495.getClass(), "value", null);
        setField(term168494, term168494.getClass(), "next", term168495);
        setField(term168494, term168494.getClass(), "key", term168491);
        setField(term168494, term168494.getClass(), "value", null);
        setElement(term168493, 0, term168494);
        setField(term168492, term168492.getClass(), "data", term168493);
        setIntField(term168492, term168492.getClass(), "threshold", 12);
        setIntField(term168492, term168492.getClass(), "modCount", 2);
        setField(term168492, term168492.getClass(), "entrySet", null);
        setField(term168492, term168492.getClass(), "keySet", null);
        setField(term168492, term168492.getClass(), "values", null);
        setField(term168492, term168492.getClass(), "keySet", null);
        setField(term168492, term168492.getClass(), "values", null);
        setField(term168491, term168491.getClass(), "delegateMap", term168492);
        term168496 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term168497 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term168498 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term168499 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term168500 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term168496, term168496.getClass(), "size", 0);
        setIntField(term168496, term168496.getClass(), "hash1", 0);
        setIntField(term168496, term168496.getClass(), "hash2", 0);
        setIntField(term168496, term168496.getClass(), "hash3", 0);
        setField(term168496, term168496.getClass(), "key1", null);
        setField(term168496, term168496.getClass(), "key2", null);
        setField(term168496, term168496.getClass(), "key3", null);
        setField(term168496, term168496.getClass(), "value1", null);
        setField(term168496, term168496.getClass(), "value2", null);
        setField(term168496, term168496.getClass(), "value3", null);
        setFloatField(term168497, term168497.getClass(), "loadFactor", 0.75F);
        setIntField(term168497, term168497.getClass(), "size", 2);
        setField(term168500, term168500.getClass(), "next", null);
        setField(term168500, term168500.getClass(), "key", null);
        setField(term168500, term168500.getClass(), "value", null);
        setField(term168499, term168499.getClass(), "next", term168500);
        setField(term168499, term168499.getClass(), "key", term168496);
        setField(term168499, term168499.getClass(), "value", null);
        setElement(term168498, 0, term168499);
        setField(term168497, term168497.getClass(), "data", term168498);
        setIntField(term168497, term168497.getClass(), "threshold", 12);
        setIntField(term168497, term168497.getClass(), "modCount", 2);
        setField(term168497, term168497.getClass(), "entrySet", null);
        setField(term168497, term168497.getClass(), "keySet", null);
        setField(term168497, term168497.getClass(), "values", null);
        setField(term168497, term168497.getClass(), "keySet", null);
        setField(term168497, term168497.getClass(), "values", null);
        setField(term168496, term168496.getClass(), "delegateMap", term168497);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term167991;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term167991, args);
        assertTrue(recursiveEquals(term167991, term168491));
        assertTrue(recursiveEquals(term167991, term168496));
        assertTrue(recursiveEquals(retValue, null));
    }

};
