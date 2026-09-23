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

public class Flat3Map_put_19447407251052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302217;
     Object term302489;
     Object term303810;
     Object term303818;

    public Flat3Map_put_19447407251052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term302217 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term302309 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term302397 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setField(term302217, term302217.getClass(), "delegateMap", null);
        setIntField(term302217, term302217.getClass(), "size", 3);
        setIntField(term302217, term302217.getClass(), "hash3", 0);
        setField(term302309, term302309.getClass(), "delegateMap", term302397);
        setField(term302217, term302217.getClass(), "key3", term302309);
        term302489 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term302599 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term302489, term302489.getClass(), "delegateMap", null);
        setIntField(term302489, term302489.getClass(), "size", 3);
        setIntField(term302489, term302489.getClass(), "hash3", 0);
        setField(term302489, term302489.getClass(), "value3", null);
        setIntField(term302489, term302489.getClass(), "hash2", 0);
        setIntField(term302599, term302599.getClass(), "size", 0);
        setField(term302489, term302489.getClass(), "value2", term302599);
        setIntField(term302489, term302489.getClass(), "hash1", 0);
        setField(term302489, term302489.getClass(), "value1", null);
        term303810 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term303811 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term303812 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term303813 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term303814 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term303815 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term303816 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term303817 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term303810, term303810.getClass(), "size", 0);
        setIntField(term303810, term303810.getClass(), "hash1", 0);
        setIntField(term303810, term303810.getClass(), "hash2", 0);
        setIntField(term303810, term303810.getClass(), "hash3", 0);
        setField(term303810, term303810.getClass(), "key1", null);
        setField(term303810, term303810.getClass(), "key2", null);
        setField(term303810, term303810.getClass(), "key3", null);
        setField(term303810, term303810.getClass(), "value1", null);
        setField(term303810, term303810.getClass(), "value2", null);
        setField(term303810, term303810.getClass(), "value3", null);
        setFloatField(term303811, term303811.getClass(), "loadFactor", 0.75F);
        setIntField(term303811, term303811.getClass(), "size", 3);
        setField(term303814, term303814.getClass(), "next", null);
        setField(term303814, term303814.getClass(), "key", null);
        setField(term303814, term303814.getClass(), "value", null);
        setField(term303813, term303813.getClass(), "next", term303814);
        setIntField(term303815, term303815.getClass(), "size", 3);
        setIntField(term303815, term303815.getClass(), "hash1", 0);
        setIntField(term303815, term303815.getClass(), "hash2", 0);
        setIntField(term303815, term303815.getClass(), "hash3", 0);
        setField(term303815, term303815.getClass(), "key1", null);
        setField(term303815, term303815.getClass(), "key2", null);
        setField(term303815, term303815.getClass(), "key3", null);
        setField(term303815, term303815.getClass(), "value1", null);
        setField(term303815, term303815.getClass(), "value2", null);
        setField(term303815, term303815.getClass(), "value3", null);
        setField(term303815, term303815.getClass(), "delegateMap", null);
        setField(term303813, term303813.getClass(), "key", term303815);
        setField(term303813, term303813.getClass(), "value", null);
        setElement(term303812, 0, term303813);
        setField(term303816, term303816.getClass(), "next", null);
        setField(term303816, term303816.getClass(), "key", term303817);
        setField(term303816, term303816.getClass(), "value", null);
        setElement(term303812, 6, term303816);
        setField(term303811, term303811.getClass(), "data", term303812);
        setIntField(term303811, term303811.getClass(), "threshold", 12);
        setIntField(term303811, term303811.getClass(), "modCount", 3);
        setField(term303811, term303811.getClass(), "entrySet", null);
        setField(term303811, term303811.getClass(), "keySet", null);
        setField(term303811, term303811.getClass(), "values", null);
        setField(term303811, term303811.getClass(), "keySet", null);
        setField(term303811, term303811.getClass(), "values", null);
        setField(term303810, term303810.getClass(), "delegateMap", term303811);
        term303818 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term303818, term303818.getClass(), "size", 3);
        setIntField(term303818, term303818.getClass(), "hash1", 0);
        setIntField(term303818, term303818.getClass(), "hash2", 0);
        setIntField(term303818, term303818.getClass(), "hash3", 0);
        setField(term303818, term303818.getClass(), "key1", null);
        setField(term303818, term303818.getClass(), "key2", null);
        setField(term303818, term303818.getClass(), "key3", null);
        setField(term303818, term303818.getClass(), "value1", null);
        setField(term303818, term303818.getClass(), "value2", null);
        setField(term303818, term303818.getClass(), "value3", null);
        setField(term303818, term303818.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term302489;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term302217, args);
        assertTrue(recursiveEquals(term302217, term303810));
        assertTrue(recursiveEquals(term302489, term303818));
        assertTrue(recursiveEquals(retValue, null));
    }

};


