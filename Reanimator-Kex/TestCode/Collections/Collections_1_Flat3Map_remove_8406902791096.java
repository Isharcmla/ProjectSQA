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

public class Flat3Map_remove_8406902791096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216896;
     Object term217144;
     Object term217597;
     Object term217598;

    public Flat3Map_remove_8406902791096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216896 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term217144 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term217199 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term216896, term216896.getClass(), "delegateMap", null);
        setIntField(term216896, term216896.getClass(), "size", 3);
        setIntField(term216896, term216896.getClass(), "hash3", 0);
        setField(term216896, term216896.getClass(), "key3", null);
        setIntField(term216896, term216896.getClass(), "hash2", 0);
        setField(term216896, term216896.getClass(), "key2", null);
        setIntField(term216896, term216896.getClass(), "hash1", 0);
        setField(term217144, term217144.getClass(), "delegateMap", null);
        setIntField(term217144, term217144.getClass(), "size", 3);
        setIntField(term217144, term217144.getClass(), "hash3", 0);
        setIntField(term217199, term217199.getClass(), "size", 0);
        setField(term217144, term217144.getClass(), "value3", term217199);
        setIntField(term217144, term217144.getClass(), "hash2", 0);
        setField(term217144, term217144.getClass(), "value2", null);
        setIntField(term217144, term217144.getClass(), "hash1", 0);
        setField(term217144, term217144.getClass(), "value1", null);
        setField(term216896, term216896.getClass(), "key1", term217144);
        term217597 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term217597, term217597.getClass(), "size", 2);
        setIntField(term217597, term217597.getClass(), "hash1", 0);
        setIntField(term217597, term217597.getClass(), "hash2", 0);
        setIntField(term217597, term217597.getClass(), "hash3", 0);
        setField(term217597, term217597.getClass(), "key1", null);
        setField(term217597, term217597.getClass(), "key2", null);
        setField(term217597, term217597.getClass(), "key3", null);
        setField(term217597, term217597.getClass(), "value1", null);
        setField(term217597, term217597.getClass(), "value2", null);
        setField(term217597, term217597.getClass(), "value3", null);
        setField(term217597, term217597.getClass(), "delegateMap", null);
        term217598 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term217599 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term217598, term217598.getClass(), "size", 3);
        setIntField(term217598, term217598.getClass(), "hash1", 0);
        setIntField(term217598, term217598.getClass(), "hash2", 0);
        setIntField(term217598, term217598.getClass(), "hash3", 0);
        setField(term217598, term217598.getClass(), "key1", null);
        setField(term217598, term217598.getClass(), "key2", null);
        setField(term217598, term217598.getClass(), "key3", null);
        setField(term217598, term217598.getClass(), "value1", null);
        setField(term217598, term217598.getClass(), "value2", null);
        setFloatField(term217599, term217599.getClass(), "loadFactor", 0.0F);
        setIntField(term217599, term217599.getClass(), "size", 0);
        setField(term217599, term217599.getClass(), "data", null);
        setIntField(term217599, term217599.getClass(), "threshold", 0);
        setIntField(term217599, term217599.getClass(), "modCount", 0);
        setField(term217599, term217599.getClass(), "entrySet", null);
        setField(term217599, term217599.getClass(), "keySet", null);
        setField(term217599, term217599.getClass(), "values", null);
        setField(term217599, term217599.getClass(), "keySet", null);
        setField(term217599, term217599.getClass(), "values", null);
        setField(term217598, term217598.getClass(), "value3", term217599);
        setField(term217598, term217598.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term217144;
        Object retValue = callMethod(klass, "remove", argTypes, term216896, args);
        assertTrue(recursiveEquals(term216896, term217597));
        assertTrue(recursiveEquals(term217144, term217598));
        assertTrue(recursiveEquals(retValue, null));
    }

};
