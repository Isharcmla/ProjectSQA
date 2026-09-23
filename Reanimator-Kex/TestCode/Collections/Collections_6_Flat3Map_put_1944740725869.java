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

public class Flat3Map_put_1944740725869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227192;
     Object term227322;
     Object term227802;

    public Flat3Map_put_1944740725869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227192 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term227230 = newInstance(Class.forName("java.lang.Object"));
        setField(term227192, term227192.getClass(), "delegateMap", null);
        setIntField(term227192, term227192.getClass(), "size", 3);
        setIntField(term227192, term227192.getClass(), "hash3", 0);
        setField(term227192, term227192.getClass(), "key3", term227230);
        setField(term227192, term227192.getClass(), "key2", null);
        setField(term227192, term227192.getClass(), "value2", null);
        setIntField(term227192, term227192.getClass(), "hash2", 0);
        setIntField(term227192, term227192.getClass(), "hash1", 0);
        setField(term227192, term227192.getClass(), "key1", term227192);
        term227322 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term227432 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term227322, term227322.getClass(), "delegateMap", null);
        setIntField(term227322, term227322.getClass(), "size", 3);
        setIntField(term227322, term227322.getClass(), "hash3", 0);
        setField(term227322, term227322.getClass(), "value3", null);
        setIntField(term227322, term227322.getClass(), "hash2", 0);
        setIntField(term227432, term227432.getClass(), "size", 0);
        setField(term227322, term227322.getClass(), "value2", term227432);
        setIntField(term227322, term227322.getClass(), "hash1", 0);
        setField(term227322, term227322.getClass(), "value1", null);
        setField(term227322, term227322.getClass(), "key3", null);
        setField(term227322, term227322.getClass(), "key2", null);
        term227802 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term227803 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object term227804 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term227802, term227802.getClass(), "size", 0);
        setIntField(term227802, term227802.getClass(), "hash1", 0);
        setIntField(term227802, term227802.getClass(), "hash2", 0);
        setIntField(term227802, term227802.getClass(), "hash3", 0);
        setField(term227802, term227802.getClass(), "key1", null);
        setField(term227802, term227802.getClass(), "key2", null);
        setField(term227802, term227802.getClass(), "key3", null);
        setField(term227802, term227802.getClass(), "value1", null);
        setField(term227802, term227802.getClass(), "value2", null);
        setField(term227802, term227802.getClass(), "value3", null);
        setFloatField(term227803, term227803.getClass(), "loadFactor", 0.75F);
        setIntField(term227803, term227803.getClass(), "size", 4);
        setIntField(term227804, term227804.getClass(), "size", 3);
        setIntField(term227804, term227804.getClass(), "hash1", 0);
        setIntField(term227804, term227804.getClass(), "hash2", 0);
        setIntField(term227804, term227804.getClass(), "hash3", 0);
        setField(term227804, term227804.getClass(), "key1", null);
        setField(term227804, term227804.getClass(), "key2", null);
        setField(term227804, term227804.getClass(), "key3", null);
        setField(term227804, term227804.getClass(), "value1", null);
        setField(term227804, term227804.getClass(), "value2", null);
        setField(term227804, term227804.getClass(), "value3", null);
        setField(term227804, term227804.getClass(), "delegateMap", null);
        setField(term227803, term227803.getClass(), "data", term227804);
        setIntField(term227803, term227803.getClass(), "threshold", 12);
        setIntField(term227803, term227803.getClass(), "modCount", -8130816);
        setField(term227803, term227803.getClass(), "entrySet", null);
        setField(term227803, term227803.getClass(), "keySet", null);
        setField(term227803, term227803.getClass(), "values", null);
        setField(term227803, term227803.getClass(), "keySet", null);
        setField(term227803, term227803.getClass(), "values", null);
        setField(term227802, term227802.getClass(), "delegateMap", term227803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term227322;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term227192, args);
        assertTrue(recursiveEquals(term227192, term227802));
        assertTrue(recursiveEquals(term227322, 0));
        assertTrue(recursiveEquals(retValue, null));
    }

};


