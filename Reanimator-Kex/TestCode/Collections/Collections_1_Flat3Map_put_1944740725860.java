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

public class Flat3Map_put_1944740725860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173350;
     Object term173801;
     Object term173803;

    public Flat3Map_put_1944740725860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173350 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term173405 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term173350, term173350.getClass(), "delegateMap", null);
        setIntField(term173350, term173350.getClass(), "size", 2);
        setIntField(term173350, term173350.getClass(), "hash2", 0);
        setField(term173350, term173350.getClass(), "value2", term173405);
        term173801 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term173802 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term173801, term173801.getClass(), "size", 3);
        setIntField(term173801, term173801.getClass(), "hash1", 0);
        setIntField(term173801, term173801.getClass(), "hash2", 0);
        setIntField(term173801, term173801.getClass(), "hash3", 0);
        setField(term173801, term173801.getClass(), "key1", null);
        setField(term173801, term173801.getClass(), "key2", null);
        setField(term173801, term173801.getClass(), "key3", term173801);
        setField(term173801, term173801.getClass(), "value1", null);
        setFloatField(term173802, term173802.getClass(), "loadFactor", 0.0F);
        setIntField(term173802, term173802.getClass(), "size", 0);
        setField(term173802, term173802.getClass(), "data", null);
        setIntField(term173802, term173802.getClass(), "threshold", 0);
        setIntField(term173802, term173802.getClass(), "modCount", 0);
        setField(term173802, term173802.getClass(), "entrySet", null);
        setField(term173802, term173802.getClass(), "keySet", null);
        setField(term173802, term173802.getClass(), "values", null);
        setField(term173802, term173802.getClass(), "keySet", null);
        setField(term173802, term173802.getClass(), "values", null);
        setField(term173801, term173801.getClass(), "value2", term173802);
        setField(term173801, term173801.getClass(), "value3", null);
        setField(term173801, term173801.getClass(), "delegateMap", null);
        term173803 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term173804 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term173803, term173803.getClass(), "size", 3);
        setIntField(term173803, term173803.getClass(), "hash1", 0);
        setIntField(term173803, term173803.getClass(), "hash2", 0);
        setIntField(term173803, term173803.getClass(), "hash3", 0);
        setField(term173803, term173803.getClass(), "key1", null);
        setField(term173803, term173803.getClass(), "key2", null);
        setField(term173803, term173803.getClass(), "key3", term173803);
        setField(term173803, term173803.getClass(), "value1", null);
        setFloatField(term173804, term173804.getClass(), "loadFactor", 0.0F);
        setIntField(term173804, term173804.getClass(), "size", 0);
        setField(term173804, term173804.getClass(), "data", null);
        setIntField(term173804, term173804.getClass(), "threshold", 0);
        setIntField(term173804, term173804.getClass(), "modCount", 0);
        setField(term173804, term173804.getClass(), "entrySet", null);
        setField(term173804, term173804.getClass(), "keySet", null);
        setField(term173804, term173804.getClass(), "values", null);
        setField(term173804, term173804.getClass(), "keySet", null);
        setField(term173804, term173804.getClass(), "values", null);
        setField(term173803, term173803.getClass(), "value2", term173804);
        setField(term173803, term173803.getClass(), "value3", null);
        setField(term173803, term173803.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term173350;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term173350, args);
        assertTrue(recursiveEquals(term173350, term173801));
        assertTrue(recursiveEquals(term173350, term173803));
        assertTrue(recursiveEquals(retValue, null));
    }

};
