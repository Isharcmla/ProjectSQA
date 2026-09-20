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

public class Flat3Map_convertToMap_1229912811200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33837;
     Object term34321;

    public Flat3Map_convertToMap_1229912811200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33837 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term33929 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term34021 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term33837, term33837.getClass(), "delegateMap", null);
        setIntField(term33837, term33837.getClass(), "size", 1);
        setField(term33929, term33929.getClass(), "delegateMap", null);
        setIntField(term33929, term33929.getClass(), "size", 1);
        setField(term33837, term33837.getClass(), "key1", term33929);
        setField(term33837, term33837.getClass(), "value1", term34021);
        term34321 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term34322 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term34323 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term34324 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term34325 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term34326 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term34321, term34321.getClass(), "size", 0);
        setIntField(term34321, term34321.getClass(), "hash1", 0);
        setIntField(term34321, term34321.getClass(), "hash2", 0);
        setIntField(term34321, term34321.getClass(), "hash3", 0);
        setField(term34321, term34321.getClass(), "key1", null);
        setField(term34321, term34321.getClass(), "key2", null);
        setField(term34321, term34321.getClass(), "key3", null);
        setField(term34321, term34321.getClass(), "value1", null);
        setField(term34321, term34321.getClass(), "value2", null);
        setField(term34321, term34321.getClass(), "value3", null);
        setFloatField(term34322, term34322.getClass(), "loadFactor", 0.75F);
        setIntField(term34322, term34322.getClass(), "size", 1);
        setField(term34324, term34324.getClass(), "next", null);
        setIntField(term34325, term34325.getClass(), "size", 1);
        setIntField(term34325, term34325.getClass(), "hash1", 0);
        setIntField(term34325, term34325.getClass(), "hash2", 0);
        setIntField(term34325, term34325.getClass(), "hash3", 0);
        setField(term34325, term34325.getClass(), "key1", null);
        setField(term34325, term34325.getClass(), "key2", null);
        setField(term34325, term34325.getClass(), "key3", null);
        setField(term34325, term34325.getClass(), "value1", null);
        setField(term34325, term34325.getClass(), "value2", null);
        setField(term34325, term34325.getClass(), "value3", null);
        setField(term34325, term34325.getClass(), "delegateMap", null);
        setField(term34324, term34324.getClass(), "key", term34325);
        setIntField(term34326, term34326.getClass(), "size", 0);
        setIntField(term34326, term34326.getClass(), "hash1", 0);
        setIntField(term34326, term34326.getClass(), "hash2", 0);
        setIntField(term34326, term34326.getClass(), "hash3", 0);
        setField(term34326, term34326.getClass(), "key1", null);
        setField(term34326, term34326.getClass(), "key2", null);
        setField(term34326, term34326.getClass(), "key3", null);
        setField(term34326, term34326.getClass(), "value1", null);
        setField(term34326, term34326.getClass(), "value2", null);
        setField(term34326, term34326.getClass(), "value3", null);
        setField(term34326, term34326.getClass(), "delegateMap", null);
        setField(term34324, term34324.getClass(), "value", term34326);
        setElement(term34323, 0, term34324);
        setField(term34322, term34322.getClass(), "data", term34323);
        setIntField(term34322, term34322.getClass(), "threshold", 12);
        setIntField(term34322, term34322.getClass(), "modCount", 1);
        setField(term34322, term34322.getClass(), "entrySet", null);
        setField(term34322, term34322.getClass(), "keySet", null);
        setField(term34322, term34322.getClass(), "values", null);
        setField(term34322, term34322.getClass(), "keySet", null);
        setField(term34322, term34322.getClass(), "values", null);
        setField(term34321, term34321.getClass(), "delegateMap", term34322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term33837, args);
        assertTrue(recursiveEquals(term33837, term34321));
    }

};
