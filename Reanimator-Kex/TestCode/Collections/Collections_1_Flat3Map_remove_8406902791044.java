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

public class Flat3Map_remove_8406902791044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208765;
     Object term209191;
     Object term209193;

    public Flat3Map_remove_8406902791044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208765 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term208820 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term208765, term208765.getClass(), "delegateMap", null);
        setIntField(term208765, term208765.getClass(), "size", 3);
        setIntField(term208765, term208765.getClass(), "hash3", 0);
        setField(term208765, term208765.getClass(), "value3", null);
        setIntField(term208765, term208765.getClass(), "hash2", 0);
        setField(term208765, term208765.getClass(), "value2", null);
        setIntField(term208765, term208765.getClass(), "hash1", 0);
        setField(term208765, term208765.getClass(), "value1", term208820);
        term209191 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term209192 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term209191, term209191.getClass(), "size", 3);
        setIntField(term209191, term209191.getClass(), "hash1", 0);
        setIntField(term209191, term209191.getClass(), "hash2", 0);
        setIntField(term209191, term209191.getClass(), "hash3", 0);
        setField(term209191, term209191.getClass(), "key1", null);
        setField(term209191, term209191.getClass(), "key2", null);
        setField(term209191, term209191.getClass(), "key3", null);
        setFloatField(term209192, term209192.getClass(), "loadFactor", 0.0F);
        setIntField(term209192, term209192.getClass(), "size", 0);
        setField(term209192, term209192.getClass(), "data", null);
        setIntField(term209192, term209192.getClass(), "threshold", 0);
        setIntField(term209192, term209192.getClass(), "modCount", 0);
        setField(term209192, term209192.getClass(), "entrySet", null);
        setField(term209192, term209192.getClass(), "keySet", null);
        setField(term209192, term209192.getClass(), "values", null);
        setField(term209192, term209192.getClass(), "keySet", null);
        setField(term209192, term209192.getClass(), "values", null);
        setField(term209191, term209191.getClass(), "value1", term209192);
        setField(term209191, term209191.getClass(), "value2", null);
        setField(term209191, term209191.getClass(), "value3", null);
        setField(term209191, term209191.getClass(), "delegateMap", null);
        term209193 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term209194 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term209193, term209193.getClass(), "size", 3);
        setIntField(term209193, term209193.getClass(), "hash1", 0);
        setIntField(term209193, term209193.getClass(), "hash2", 0);
        setIntField(term209193, term209193.getClass(), "hash3", 0);
        setField(term209193, term209193.getClass(), "key1", null);
        setField(term209193, term209193.getClass(), "key2", null);
        setField(term209193, term209193.getClass(), "key3", null);
        setFloatField(term209194, term209194.getClass(), "loadFactor", 0.0F);
        setIntField(term209194, term209194.getClass(), "size", 0);
        setField(term209194, term209194.getClass(), "data", null);
        setIntField(term209194, term209194.getClass(), "threshold", 0);
        setIntField(term209194, term209194.getClass(), "modCount", 0);
        setField(term209194, term209194.getClass(), "entrySet", null);
        setField(term209194, term209194.getClass(), "keySet", null);
        setField(term209194, term209194.getClass(), "values", null);
        setField(term209194, term209194.getClass(), "keySet", null);
        setField(term209194, term209194.getClass(), "values", null);
        setField(term209193, term209193.getClass(), "value1", term209194);
        setField(term209193, term209193.getClass(), "value2", null);
        setField(term209193, term209193.getClass(), "value3", null);
        setField(term209193, term209193.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term208765;
        Object retValue = callMethod(klass, "remove", argTypes, term208765, args);
        assertTrue(recursiveEquals(term208765, term209191));
        assertTrue(recursiveEquals(term208765, term209193));
        assertTrue(recursiveEquals(retValue, null));
    }

};
