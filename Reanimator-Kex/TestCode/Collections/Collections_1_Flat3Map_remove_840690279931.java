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

public class Flat3Map_remove_840690279931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187097;
     Object term187278;
     Object term187280;

    public Flat3Map_remove_840690279931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187097 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term187152 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term187097, term187097.getClass(), "delegateMap", null);
        setIntField(term187097, term187097.getClass(), "size", 3);
        setIntField(term187097, term187097.getClass(), "hash3", 0);
        setIntField(term187152, term187152.getClass(), "size", 0);
        setField(term187097, term187097.getClass(), "value3", term187152);
        setIntField(term187097, term187097.getClass(), "hash2", -1);
        setField(term187097, term187097.getClass(), "value2", null);
        setIntField(term187097, term187097.getClass(), "hash1", 0);
        setField(term187097, term187097.getClass(), "value1", null);
        setField(term187097, term187097.getClass(), "key3", null);
        term187278 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term187279 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term187278, term187278.getClass(), "size", 3);
        setIntField(term187278, term187278.getClass(), "hash1", 0);
        setIntField(term187278, term187278.getClass(), "hash2", -1);
        setIntField(term187278, term187278.getClass(), "hash3", 0);
        setField(term187278, term187278.getClass(), "key1", null);
        setField(term187278, term187278.getClass(), "key2", null);
        setField(term187278, term187278.getClass(), "key3", null);
        setField(term187278, term187278.getClass(), "value1", null);
        setField(term187278, term187278.getClass(), "value2", null);
        setFloatField(term187279, term187279.getClass(), "loadFactor", 0.0F);
        setIntField(term187279, term187279.getClass(), "size", 0);
        setField(term187279, term187279.getClass(), "data", null);
        setIntField(term187279, term187279.getClass(), "threshold", 0);
        setIntField(term187279, term187279.getClass(), "modCount", 0);
        setField(term187279, term187279.getClass(), "entrySet", null);
        setField(term187279, term187279.getClass(), "keySet", null);
        setField(term187279, term187279.getClass(), "values", null);
        setField(term187279, term187279.getClass(), "keySet", null);
        setField(term187279, term187279.getClass(), "values", null);
        setField(term187278, term187278.getClass(), "value3", term187279);
        setField(term187278, term187278.getClass(), "delegateMap", null);
        term187280 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term187281 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term187280, term187280.getClass(), "size", 3);
        setIntField(term187280, term187280.getClass(), "hash1", 0);
        setIntField(term187280, term187280.getClass(), "hash2", -1);
        setIntField(term187280, term187280.getClass(), "hash3", 0);
        setField(term187280, term187280.getClass(), "key1", null);
        setField(term187280, term187280.getClass(), "key2", null);
        setField(term187280, term187280.getClass(), "key3", null);
        setField(term187280, term187280.getClass(), "value1", null);
        setField(term187280, term187280.getClass(), "value2", null);
        setFloatField(term187281, term187281.getClass(), "loadFactor", 0.0F);
        setIntField(term187281, term187281.getClass(), "size", 0);
        setField(term187281, term187281.getClass(), "data", null);
        setIntField(term187281, term187281.getClass(), "threshold", 0);
        setIntField(term187281, term187281.getClass(), "modCount", 0);
        setField(term187281, term187281.getClass(), "entrySet", null);
        setField(term187281, term187281.getClass(), "keySet", null);
        setField(term187281, term187281.getClass(), "values", null);
        setField(term187281, term187281.getClass(), "keySet", null);
        setField(term187281, term187281.getClass(), "values", null);
        setField(term187280, term187280.getClass(), "value3", term187281);
        setField(term187280, term187280.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term187097;
        Object retValue = callMethod(klass, "remove", argTypes, term187097, args);
        assertTrue(recursiveEquals(term187097, term187278));
        assertTrue(recursiveEquals(term187097, term187280));
        assertTrue(recursiveEquals(retValue, null));
    }

};
