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

public class Flat3Map_put_19447407251017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288095;
     Object term288371;
     Object term288652;
     Object term288653;

    public Flat3Map_put_19447407251017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288095 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term288187 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term288279 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term288095, term288095.getClass(), "delegateMap", null);
        setIntField(term288095, term288095.getClass(), "size", 3);
        setIntField(term288095, term288095.getClass(), "hash3", 0);
        setField(term288187, term288187.getClass(), "delegateMap", null);
        setIntField(term288187, term288187.getClass(), "size", 3);
        setField(term288187, term288187.getClass(), "key3", term288279);
        setField(term288187, term288187.getClass(), "key2", null);
        setField(term288187, term288187.getClass(), "value2", null);
        setField(term288095, term288095.getClass(), "key3", term288187);
        term288371 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term288443 = newInstance(Class.forName("java.util.stream.DoublePipeline$5"));
        setField(term288371, term288371.getClass(), "delegateMap", null);
        setIntField(term288371, term288371.getClass(), "size", 3);
        setIntField(term288371, term288371.getClass(), "hash3", 0);
        setField(term288371, term288371.getClass(), "value3", null);
        setIntField(term288371, term288371.getClass(), "hash2", 0);
        setField(term288371, term288371.getClass(), "value2", null);
        setIntField(term288371, term288371.getClass(), "hash1", 0);
        setField(term288371, term288371.getClass(), "value1", null);
        setField(term288371, term288371.getClass(), "key3", null);
        setField(term288371, term288371.getClass(), "key2", null);
        setField(term288371, term288371.getClass(), "key1", term288443);
        term288652 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term288652, term288652.getClass(), "size", 0);
        setIntField(term288652, term288652.getClass(), "hash1", 0);
        setIntField(term288652, term288652.getClass(), "hash2", 0);
        setIntField(term288652, term288652.getClass(), "hash3", 0);
        setField(term288652, term288652.getClass(), "key1", null);
        setField(term288652, term288652.getClass(), "key2", null);
        setField(term288652, term288652.getClass(), "key3", null);
        setField(term288652, term288652.getClass(), "value1", null);
        setField(term288652, term288652.getClass(), "value2", null);
        setField(term288652, term288652.getClass(), "value3", null);
        setField(term288652, term288652.getClass(), "delegateMap", 0);
        term288653 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term288653, term288653.getClass(), "size", 3);
        setIntField(term288653, term288653.getClass(), "hash1", 0);
        setIntField(term288653, term288653.getClass(), "hash2", 0);
        setIntField(term288653, term288653.getClass(), "hash3", 0);
        setField(term288653, term288653.getClass(), "key1", null);
        setField(term288653, term288653.getClass(), "key2", null);
        setField(term288653, term288653.getClass(), "key3", null);
        setField(term288653, term288653.getClass(), "value1", null);
        setField(term288653, term288653.getClass(), "value2", null);
        setField(term288653, term288653.getClass(), "value3", null);
        setField(term288653, term288653.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term288371;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term288095, args);
        assertTrue(recursiveEquals(term288095, term288652));
        assertTrue(recursiveEquals(term288371, term288653));
        assertTrue(recursiveEquals(retValue, null));
    }

};


