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

public class Flat3Map_remove_8406902791030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205997;
     Object term206291;
     Object term206867;
     Object term206870;

    public Flat3Map_remove_8406902791030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205997 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term206089 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term206346 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term205997, term205997.getClass(), "delegateMap", null);
        setIntField(term205997, term205997.getClass(), "size", 3);
        setIntField(term205997, term205997.getClass(), "hash3", 0);
        setField(term205997, term205997.getClass(), "key3", null);
        setIntField(term205997, term205997.getClass(), "hash2", 0);
        setField(term205997, term205997.getClass(), "key2", null);
        setIntField(term205997, term205997.getClass(), "hash1", 0);
        setIntField(term206346, term206346.getClass(), "size", 0);
        setField(term206089, term206089.getClass(), "delegateMap", term206346);
        setField(term205997, term205997.getClass(), "key1", term206089);
        term206291 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term206291, term206291.getClass(), "delegateMap", null);
        setIntField(term206291, term206291.getClass(), "size", 3);
        setIntField(term206291, term206291.getClass(), "hash3", 0);
        setField(term206291, term206291.getClass(), "value3", term206346);
        setIntField(term206291, term206291.getClass(), "hash2", 0);
        setField(term206291, term206291.getClass(), "value2", null);
        setIntField(term206291, term206291.getClass(), "hash1", 0);
        setField(term206291, term206291.getClass(), "value1", null);
        term206867 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term206868 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term206869 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term206867, term206867.getClass(), "size", 3);
        setIntField(term206867, term206867.getClass(), "hash1", 0);
        setIntField(term206867, term206867.getClass(), "hash2", 0);
        setIntField(term206867, term206867.getClass(), "hash3", 0);
        setIntField(term206868, term206868.getClass(), "size", 0);
        setIntField(term206868, term206868.getClass(), "hash1", 0);
        setIntField(term206868, term206868.getClass(), "hash2", 0);
        setIntField(term206868, term206868.getClass(), "hash3", 0);
        setField(term206868, term206868.getClass(), "key1", null);
        setField(term206868, term206868.getClass(), "key2", null);
        setField(term206868, term206868.getClass(), "key3", null);
        setField(term206868, term206868.getClass(), "value1", null);
        setField(term206868, term206868.getClass(), "value2", null);
        setField(term206868, term206868.getClass(), "value3", null);
        setFloatField(term206869, term206869.getClass(), "loadFactor", 0.0F);
        setIntField(term206869, term206869.getClass(), "size", 0);
        setField(term206869, term206869.getClass(), "data", null);
        setIntField(term206869, term206869.getClass(), "threshold", 0);
        setIntField(term206869, term206869.getClass(), "modCount", 0);
        setField(term206869, term206869.getClass(), "entrySet", null);
        setField(term206869, term206869.getClass(), "keySet", null);
        setField(term206869, term206869.getClass(), "values", null);
        setField(term206869, term206869.getClass(), "keySet", null);
        setField(term206869, term206869.getClass(), "values", null);
        setField(term206868, term206868.getClass(), "delegateMap", term206869);
        setField(term206867, term206867.getClass(), "key1", term206868);
        setField(term206867, term206867.getClass(), "key2", null);
        setField(term206867, term206867.getClass(), "key3", null);
        setField(term206867, term206867.getClass(), "value1", null);
        setField(term206867, term206867.getClass(), "value2", null);
        setField(term206867, term206867.getClass(), "value3", null);
        setField(term206867, term206867.getClass(), "delegateMap", null);
        term206870 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term206871 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term206870, term206870.getClass(), "size", 3);
        setIntField(term206870, term206870.getClass(), "hash1", 0);
        setIntField(term206870, term206870.getClass(), "hash2", 0);
        setIntField(term206870, term206870.getClass(), "hash3", 0);
        setField(term206870, term206870.getClass(), "key1", null);
        setField(term206870, term206870.getClass(), "key2", null);
        setField(term206870, term206870.getClass(), "key3", null);
        setField(term206870, term206870.getClass(), "value1", null);
        setField(term206870, term206870.getClass(), "value2", null);
        setFloatField(term206871, term206871.getClass(), "loadFactor", 0.0F);
        setIntField(term206871, term206871.getClass(), "size", 0);
        setField(term206871, term206871.getClass(), "data", null);
        setIntField(term206871, term206871.getClass(), "threshold", 0);
        setIntField(term206871, term206871.getClass(), "modCount", 0);
        setField(term206871, term206871.getClass(), "entrySet", null);
        setField(term206871, term206871.getClass(), "keySet", null);
        setField(term206871, term206871.getClass(), "values", null);
        setField(term206871, term206871.getClass(), "keySet", null);
        setField(term206871, term206871.getClass(), "values", null);
        setField(term206870, term206870.getClass(), "value3", term206871);
        setField(term206870, term206870.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term206291;
        Object retValue = callMethod(klass, "remove", argTypes, term205997, args);
        assertTrue(recursiveEquals(term205997, term206867));
        assertTrue(recursiveEquals(term206291, term206870));
        assertTrue(recursiveEquals(retValue, null));
    }

};
