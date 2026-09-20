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

public class Flat3Map_get_229621781515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97259;
     Object term97351;
     Object term97873;
     Object term97874;

    public Flat3Map_get_229621781515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97259 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term97259, term97259.getClass(), "delegateMap", null);
        setIntField(term97259, term97259.getClass(), "size", 2);
        setIntField(term97259, term97259.getClass(), "hash2", 0);
        setField(term97259, term97259.getClass(), "key2", null);
        term97351 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term97461 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term97351, term97351.getClass(), "delegateMap", null);
        setIntField(term97351, term97351.getClass(), "size", 2);
        setIntField(term97351, term97351.getClass(), "hash2", 0);
        setField(term97351, term97351.getClass(), "value2", null);
        setIntField(term97351, term97351.getClass(), "hash1", 0);
        setIntField(term97461, term97461.getClass(), "size", 0);
        setField(term97351, term97351.getClass(), "value1", term97461);
        setField(term97351, term97351.getClass(), "key2", null);
        term97873 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term97873, term97873.getClass(), "size", 2);
        setIntField(term97873, term97873.getClass(), "hash1", 0);
        setIntField(term97873, term97873.getClass(), "hash2", 0);
        setIntField(term97873, term97873.getClass(), "hash3", 0);
        setField(term97873, term97873.getClass(), "key1", null);
        setField(term97873, term97873.getClass(), "key2", null);
        setField(term97873, term97873.getClass(), "key3", null);
        setField(term97873, term97873.getClass(), "value1", null);
        setField(term97873, term97873.getClass(), "value2", null);
        setField(term97873, term97873.getClass(), "value3", null);
        setField(term97873, term97873.getClass(), "delegateMap", null);
        term97874 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term97875 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term97874, term97874.getClass(), "size", 2);
        setIntField(term97874, term97874.getClass(), "hash1", 0);
        setIntField(term97874, term97874.getClass(), "hash2", 0);
        setIntField(term97874, term97874.getClass(), "hash3", 0);
        setField(term97874, term97874.getClass(), "key1", null);
        setField(term97874, term97874.getClass(), "key2", null);
        setField(term97874, term97874.getClass(), "key3", null);
        setFloatField(term97875, term97875.getClass(), "loadFactor", 0.0F);
        setIntField(term97875, term97875.getClass(), "size", 0);
        setField(term97875, term97875.getClass(), "data", null);
        setIntField(term97875, term97875.getClass(), "threshold", 0);
        setIntField(term97875, term97875.getClass(), "modCount", 0);
        setField(term97875, term97875.getClass(), "entrySet", null);
        setField(term97875, term97875.getClass(), "keySet", null);
        setField(term97875, term97875.getClass(), "values", null);
        setField(term97875, term97875.getClass(), "keySet", null);
        setField(term97875, term97875.getClass(), "values", null);
        setField(term97874, term97874.getClass(), "value1", term97875);
        setField(term97874, term97874.getClass(), "value2", null);
        setField(term97874, term97874.getClass(), "value3", null);
        setField(term97874, term97874.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term97351;
        Object retValue = callMethod(klass, "get", argTypes, term97259, args);
        assertTrue(recursiveEquals(term97259, term97873));
        assertTrue(recursiveEquals(term97351, term97874));
        assertTrue(recursiveEquals(retValue, null));
    }

};
