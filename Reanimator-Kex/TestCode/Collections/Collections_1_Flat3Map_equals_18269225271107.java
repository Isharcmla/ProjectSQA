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
import java.util.HashMap;

public class Flat3Map_equals_18269225271107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220088;
     Object term220228;
     Object term220338;
     Object term220341;

    public Flat3Map_equals_18269225271107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term220252 = new HashMap();
        term220088 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term220088, term220088.getClass(), "delegateMap", null);
        setIntField(term220088, term220088.getClass(), "size", 3);
        setField(term220088, term220088.getClass(), "key3", null);
        setField(term220088, term220088.getClass(), "value3", null);
        setField(term220088, term220088.getClass(), "key2", term220252);
        term220228 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term220228, term220228.getClass(), "delegateMap", null);
        setIntField(term220228, term220228.getClass(), "size", 3);
        setField(term220228, term220228.getClass(), "key3", null);
        setField(term220228, term220228.getClass(), "value3", null);
        setIntField(term220228, term220228.getClass(), "hash3", 0);
        setIntField(term220228, term220228.getClass(), "hash2", 0);
        setField(term220228, term220228.getClass(), "key2", term220252);
        HashMap term220339 = new HashMap();
        term220338 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term220338, term220338.getClass(), "size", 3);
        setIntField(term220338, term220338.getClass(), "hash1", 0);
        setIntField(term220338, term220338.getClass(), "hash2", 0);
        setIntField(term220338, term220338.getClass(), "hash3", 0);
        setField(term220338, term220338.getClass(), "key1", null);
        setField(term220338, term220338.getClass(), "key2", term220339);
        setField(term220338, term220338.getClass(), "key3", null);
        setField(term220338, term220338.getClass(), "value1", null);
        setField(term220338, term220338.getClass(), "value2", null);
        setField(term220338, term220338.getClass(), "value3", null);
        setField(term220338, term220338.getClass(), "delegateMap", null);
        HashMap term220342 = new HashMap();
        term220341 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term220341, term220341.getClass(), "size", 3);
        setIntField(term220341, term220341.getClass(), "hash1", 0);
        setIntField(term220341, term220341.getClass(), "hash2", 0);
        setIntField(term220341, term220341.getClass(), "hash3", 0);
        setField(term220341, term220341.getClass(), "key1", null);
        setField(term220341, term220341.getClass(), "key2", term220342);
        setField(term220341, term220341.getClass(), "key3", null);
        setField(term220341, term220341.getClass(), "value1", null);
        setField(term220341, term220341.getClass(), "value2", null);
        setField(term220341, term220341.getClass(), "value3", null);
        setField(term220341, term220341.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term220228;
        Object retValue = callMethod(klass, "equals", argTypes, term220088, args);
        assertTrue(recursiveEquals(term220088, term220338));
        assertTrue(recursiveEquals(term220228, term220341));
        assertTrue(recursiveEquals(retValue, true));
    }

};
