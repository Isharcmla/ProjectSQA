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

public class Flat3Map_put_19447407251126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337146;
     Object term337418;
     Object term338519;
     Object term338527;

    public Flat3Map_put_19447407251126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term337146 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term337238 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term337326 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setField(term337146, term337146.getClass(), "delegateMap", null);
        setIntField(term337146, term337146.getClass(), "size", 3);
        setIntField(term337146, term337146.getClass(), "hash3", 0);
        setField(term337146, term337146.getClass(), "key3", null);
        setIntField(term337146, term337146.getClass(), "hash2", 0);
        setField(term337146, term337146.getClass(), "key2", null);
        setIntField(term337146, term337146.getClass(), "hash1", 0);
        setField(term337238, term337238.getClass(), "delegateMap", term337326);
        setField(term337146, term337146.getClass(), "key1", term337238);
        term337418 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term337528 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(term337418, term337418.getClass(), "delegateMap", null);
        setIntField(term337418, term337418.getClass(), "size", 3);
        setIntField(term337418, term337418.getClass(), "hash3", 0);
        setField(term337418, term337418.getClass(), "value3", null);
        setIntField(term337418, term337418.getClass(), "hash2", 0);
        setField(term337418, term337418.getClass(), "value2", null);
        setIntField(term337418, term337418.getClass(), "hash1", 0);
        setIntField(term337528, term337528.getClass(), "size", 0);
        setField(term337418, term337418.getClass(), "value1", term337528);
        term338519 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term338520 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term338521 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term338522 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term338523 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term338524 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term338525 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term338526 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term338519, term338519.getClass(), "size", 0);
        setIntField(term338519, term338519.getClass(), "hash1", 0);
        setIntField(term338519, term338519.getClass(), "hash2", 0);
        setIntField(term338519, term338519.getClass(), "hash3", 0);
        setField(term338519, term338519.getClass(), "key1", null);
        setField(term338519, term338519.getClass(), "key2", null);
        setField(term338519, term338519.getClass(), "key3", null);
        setField(term338519, term338519.getClass(), "value1", null);
        setField(term338519, term338519.getClass(), "value2", null);
        setField(term338519, term338519.getClass(), "value3", null);
        setFloatField(term338520, term338520.getClass(), "loadFactor", 0.75F);
        setIntField(term338520, term338520.getClass(), "size", 3);
        setField(term338523, term338523.getClass(), "next", null);
        setField(term338523, term338523.getClass(), "key", null);
        setField(term338523, term338523.getClass(), "value", null);
        setField(term338522, term338522.getClass(), "next", term338523);
        setIntField(term338524, term338524.getClass(), "size", 3);
        setIntField(term338524, term338524.getClass(), "hash1", 0);
        setIntField(term338524, term338524.getClass(), "hash2", 0);
        setIntField(term338524, term338524.getClass(), "hash3", 0);
        setField(term338524, term338524.getClass(), "key1", null);
        setField(term338524, term338524.getClass(), "key2", null);
        setField(term338524, term338524.getClass(), "key3", null);
        setField(term338524, term338524.getClass(), "value1", null);
        setField(term338524, term338524.getClass(), "value2", null);
        setField(term338524, term338524.getClass(), "value3", null);
        setField(term338524, term338524.getClass(), "delegateMap", null);
        setField(term338522, term338522.getClass(), "key", term338524);
        setField(term338522, term338522.getClass(), "value", null);
        setElement(term338521, 0, term338522);
        setField(term338525, term338525.getClass(), "next", null);
        setField(term338525, term338525.getClass(), "key", term338526);
        setField(term338525, term338525.getClass(), "value", null);
        setElement(term338521, 6, term338525);
        setField(term338520, term338520.getClass(), "data", term338521);
        setIntField(term338520, term338520.getClass(), "threshold", 12);
        setIntField(term338520, term338520.getClass(), "modCount", 3);
        setField(term338520, term338520.getClass(), "entrySet", null);
        setField(term338520, term338520.getClass(), "keySet", null);
        setField(term338520, term338520.getClass(), "values", null);
        setField(term338520, term338520.getClass(), "keySet", null);
        setField(term338520, term338520.getClass(), "values", null);
        setField(term338519, term338519.getClass(), "delegateMap", term338520);
        term338527 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term338527, term338527.getClass(), "size", 3);
        setIntField(term338527, term338527.getClass(), "hash1", 0);
        setIntField(term338527, term338527.getClass(), "hash2", 0);
        setIntField(term338527, term338527.getClass(), "hash3", 0);
        setField(term338527, term338527.getClass(), "key1", null);
        setField(term338527, term338527.getClass(), "key2", null);
        setField(term338527, term338527.getClass(), "key3", null);
        setField(term338527, term338527.getClass(), "value1", null);
        setField(term338527, term338527.getClass(), "value2", null);
        setField(term338527, term338527.getClass(), "value3", null);
        setField(term338527, term338527.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term337418;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term337146, args);
        assertTrue(recursiveEquals(term337146, term338519));
        assertTrue(recursiveEquals(term337418, term338527));
        assertTrue(recursiveEquals(retValue, null));
    }

};


