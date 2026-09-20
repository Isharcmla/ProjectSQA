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

public class Flat3Map_remove_840690279964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193769;
     Object term194098;
     Object term194100;

    public Flat3Map_remove_840690279964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193769 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term193824 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term193769, term193769.getClass(), "delegateMap", null);
        setIntField(term193769, term193769.getClass(), "size", 1);
        setIntField(term193769, term193769.getClass(), "hash1", 0);
        setIntField(term193824, term193824.getClass(), "size", 0);
        setField(term193769, term193769.getClass(), "value1", term193824);
        term194098 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term194099 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term194098, term194098.getClass(), "size", 1);
        setIntField(term194098, term194098.getClass(), "hash1", 0);
        setIntField(term194098, term194098.getClass(), "hash2", 0);
        setIntField(term194098, term194098.getClass(), "hash3", 0);
        setField(term194098, term194098.getClass(), "key1", null);
        setField(term194098, term194098.getClass(), "key2", null);
        setField(term194098, term194098.getClass(), "key3", null);
        setFloatField(term194099, term194099.getClass(), "loadFactor", 0.0F);
        setIntField(term194099, term194099.getClass(), "size", 0);
        setField(term194099, term194099.getClass(), "data", null);
        setIntField(term194099, term194099.getClass(), "threshold", 0);
        setIntField(term194099, term194099.getClass(), "modCount", 0);
        setField(term194099, term194099.getClass(), "entrySet", null);
        setField(term194099, term194099.getClass(), "keySet", null);
        setField(term194099, term194099.getClass(), "values", null);
        setField(term194099, term194099.getClass(), "keySet", null);
        setField(term194099, term194099.getClass(), "values", null);
        setField(term194098, term194098.getClass(), "value1", term194099);
        setField(term194098, term194098.getClass(), "value2", null);
        setField(term194098, term194098.getClass(), "value3", null);
        setField(term194098, term194098.getClass(), "delegateMap", null);
        term194100 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term194101 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term194100, term194100.getClass(), "size", 1);
        setIntField(term194100, term194100.getClass(), "hash1", 0);
        setIntField(term194100, term194100.getClass(), "hash2", 0);
        setIntField(term194100, term194100.getClass(), "hash3", 0);
        setField(term194100, term194100.getClass(), "key1", null);
        setField(term194100, term194100.getClass(), "key2", null);
        setField(term194100, term194100.getClass(), "key3", null);
        setFloatField(term194101, term194101.getClass(), "loadFactor", 0.0F);
        setIntField(term194101, term194101.getClass(), "size", 0);
        setField(term194101, term194101.getClass(), "data", null);
        setIntField(term194101, term194101.getClass(), "threshold", 0);
        setIntField(term194101, term194101.getClass(), "modCount", 0);
        setField(term194101, term194101.getClass(), "entrySet", null);
        setField(term194101, term194101.getClass(), "keySet", null);
        setField(term194101, term194101.getClass(), "values", null);
        setField(term194101, term194101.getClass(), "keySet", null);
        setField(term194101, term194101.getClass(), "values", null);
        setField(term194100, term194100.getClass(), "value1", term194101);
        setField(term194100, term194100.getClass(), "value2", null);
        setField(term194100, term194100.getClass(), "value3", null);
        setField(term194100, term194100.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term193769;
        Object retValue = callMethod(klass, "remove", argTypes, term193769, args);
        assertTrue(recursiveEquals(term193769, term194098));
        assertTrue(recursiveEquals(term193769, term194100));
        assertTrue(recursiveEquals(retValue, null));
    }

};
