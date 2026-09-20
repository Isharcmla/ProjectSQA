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

public class Flat3Map_remove_8406902791037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207942;
     Object term208060;
     Object term208062;

    public Flat3Map_remove_8406902791037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207942 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term207997 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term207942, term207942.getClass(), "delegateMap", null);
        setIntField(term207942, term207942.getClass(), "size", 3);
        setIntField(term207942, term207942.getClass(), "hash3", 0);
        setIntField(term207997, term207997.getClass(), "size", 0);
        setField(term207942, term207942.getClass(), "value3", term207997);
        setIntField(term207942, term207942.getClass(), "hash2", -1);
        setField(term207942, term207942.getClass(), "value2", null);
        setIntField(term207942, term207942.getClass(), "hash1", 0);
        setField(term207942, term207942.getClass(), "value1", null);
        setField(term207942, term207942.getClass(), "key3", null);
        term208060 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term208061 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term208060, term208060.getClass(), "size", 3);
        setIntField(term208060, term208060.getClass(), "hash1", 0);
        setIntField(term208060, term208060.getClass(), "hash2", -1);
        setIntField(term208060, term208060.getClass(), "hash3", 0);
        setField(term208060, term208060.getClass(), "key1", null);
        setField(term208060, term208060.getClass(), "key2", null);
        setField(term208060, term208060.getClass(), "key3", null);
        setField(term208060, term208060.getClass(), "value1", null);
        setField(term208060, term208060.getClass(), "value2", null);
        setFloatField(term208061, term208061.getClass(), "loadFactor", 0.0F);
        setIntField(term208061, term208061.getClass(), "size", 0);
        setField(term208061, term208061.getClass(), "data", null);
        setIntField(term208061, term208061.getClass(), "threshold", 0);
        setIntField(term208061, term208061.getClass(), "modCount", 0);
        setField(term208061, term208061.getClass(), "entrySet", null);
        setField(term208061, term208061.getClass(), "keySet", null);
        setField(term208061, term208061.getClass(), "values", null);
        setField(term208061, term208061.getClass(), "keySet", null);
        setField(term208061, term208061.getClass(), "values", null);
        setField(term208060, term208060.getClass(), "value3", term208061);
        setField(term208060, term208060.getClass(), "delegateMap", null);
        term208062 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term208063 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term208062, term208062.getClass(), "size", 3);
        setIntField(term208062, term208062.getClass(), "hash1", 0);
        setIntField(term208062, term208062.getClass(), "hash2", -1);
        setIntField(term208062, term208062.getClass(), "hash3", 0);
        setField(term208062, term208062.getClass(), "key1", null);
        setField(term208062, term208062.getClass(), "key2", null);
        setField(term208062, term208062.getClass(), "key3", null);
        setField(term208062, term208062.getClass(), "value1", null);
        setField(term208062, term208062.getClass(), "value2", null);
        setFloatField(term208063, term208063.getClass(), "loadFactor", 0.0F);
        setIntField(term208063, term208063.getClass(), "size", 0);
        setField(term208063, term208063.getClass(), "data", null);
        setIntField(term208063, term208063.getClass(), "threshold", 0);
        setIntField(term208063, term208063.getClass(), "modCount", 0);
        setField(term208063, term208063.getClass(), "entrySet", null);
        setField(term208063, term208063.getClass(), "keySet", null);
        setField(term208063, term208063.getClass(), "values", null);
        setField(term208063, term208063.getClass(), "keySet", null);
        setField(term208063, term208063.getClass(), "values", null);
        setField(term208062, term208062.getClass(), "value3", term208063);
        setField(term208062, term208062.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term207942;
        Object retValue = callMethod(klass, "remove", argTypes, term207942, args);
        assertTrue(recursiveEquals(term207942, term208060));
        assertTrue(recursiveEquals(term207942, term208062));
        assertTrue(recursiveEquals(retValue, null));
    }

};
