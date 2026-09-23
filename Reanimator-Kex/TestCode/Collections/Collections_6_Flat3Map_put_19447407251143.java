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

public class Flat3Map_put_19447407251143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346375;
     Object term346743;
     Object term347246;
     Object term347256;

    public Flat3Map_put_19447407251143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term346375 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term346467 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term346559 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term346651 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term346375, term346375.getClass(), "delegateMap", null);
        setIntField(term346375, term346375.getClass(), "size", 3);
        setIntField(term346375, term346375.getClass(), "hash3", 0);
        setField(term346467, term346467.getClass(), "delegateMap", null);
        setIntField(term346467, term346467.getClass(), "size", 3);
        setField(term346467, term346467.getClass(), "key3", term346559);
        setField(term346467, term346467.getClass(), "key2", null);
        setField(term346467, term346467.getClass(), "value2", null);
        setIntField(term346467, term346467.getClass(), "hash3", -1);
        setIntField(term346467, term346467.getClass(), "hash2", -1);
        setIntField(term346467, term346467.getClass(), "hash1", -1);
        setField(term346375, term346375.getClass(), "key3", term346467);
        setIntField(term346375, term346375.getClass(), "hash2", -1);
        setIntField(term346375, term346375.getClass(), "hash1", 0);
        setField(term346375, term346375.getClass(), "key1", term346651);
        term346743 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term346835 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term346743, term346743.getClass(), "delegateMap", null);
        setIntField(term346743, term346743.getClass(), "size", 3);
        setIntField(term346743, term346743.getClass(), "hash3", 0);
        setField(term346743, term346743.getClass(), "value3", null);
        setIntField(term346743, term346743.getClass(), "hash2", 0);
        setField(term346743, term346743.getClass(), "value2", null);
        setIntField(term346743, term346743.getClass(), "hash1", 0);
        setField(term346743, term346743.getClass(), "value1", null);
        setField(term346743, term346743.getClass(), "key3", null);
        setField(term346835, term346835.getClass(), "delegateMap", null);
        setIntField(term346835, term346835.getClass(), "size", 2);
        setIntField(term346835, term346835.getClass(), "hash2", 0);
        setField(term346835, term346835.getClass(), "value2", null);
        setIntField(term346835, term346835.getClass(), "hash1", 0);
        setField(term346835, term346835.getClass(), "value1", null);
        setField(term346743, term346743.getClass(), "key2", term346835);
        term347246 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term347247 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term347248 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term347249 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term347250 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term347251 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term347252 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term347253 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term347254 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term347255 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term347246, term347246.getClass(), "size", 0);
        setIntField(term347246, term347246.getClass(), "hash1", 0);
        setIntField(term347246, term347246.getClass(), "hash2", 0);
        setIntField(term347246, term347246.getClass(), "hash3", 0);
        setField(term347246, term347246.getClass(), "key1", null);
        setField(term347246, term347246.getClass(), "key2", null);
        setField(term347246, term347246.getClass(), "key3", null);
        setField(term347246, term347246.getClass(), "value1", null);
        setField(term347246, term347246.getClass(), "value2", null);
        setField(term347246, term347246.getClass(), "value3", null);
        setFloatField(term347247, term347247.getClass(), "loadFactor", 0.75F);
        setIntField(term347247, term347247.getClass(), "size", 4);
        setField(term347250, term347250.getClass(), "next", null);
        setField(term347250, term347250.getClass(), "key", null);
        setField(term347250, term347250.getClass(), "value", null);
        setField(term347249, term347249.getClass(), "next", term347250);
        setIntField(term347251, term347251.getClass(), "size", 3);
        setIntField(term347251, term347251.getClass(), "hash1", 0);
        setIntField(term347251, term347251.getClass(), "hash2", 0);
        setIntField(term347251, term347251.getClass(), "hash3", 0);
        setField(term347251, term347251.getClass(), "key1", null);
        setField(term347251, term347251.getClass(), "key2", null);
        setField(term347251, term347251.getClass(), "key3", null);
        setField(term347251, term347251.getClass(), "value1", null);
        setField(term347251, term347251.getClass(), "value2", null);
        setField(term347251, term347251.getClass(), "value3", null);
        setField(term347251, term347251.getClass(), "delegateMap", null);
        setField(term347249, term347249.getClass(), "key", term347251);
        setField(term347249, term347249.getClass(), "value", null);
        setElement(term347248, 0, term347249);
        setField(term347252, term347252.getClass(), "next", null);
        setIntField(term347253, term347253.getClass(), "size", 3);
        setIntField(term347253, term347253.getClass(), "hash1", -1);
        setIntField(term347253, term347253.getClass(), "hash2", -1);
        setIntField(term347253, term347253.getClass(), "hash3", -1);
        setField(term347253, term347253.getClass(), "key1", null);
        setField(term347253, term347253.getClass(), "key2", null);
        setField(term347253, term347253.getClass(), "key3", null);
        setField(term347253, term347253.getClass(), "value1", null);
        setField(term347253, term347253.getClass(), "value2", null);
        setField(term347253, term347253.getClass(), "value3", null);
        setField(term347253, term347253.getClass(), "delegateMap", null);
        setField(term347252, term347252.getClass(), "key", term347253);
        setField(term347252, term347252.getClass(), "value", null);
        setElement(term347248, 5, term347252);
        setField(term347254, term347254.getClass(), "next", null);
        setField(term347254, term347254.getClass(), "key", term347255);
        setField(term347254, term347254.getClass(), "value", null);
        setElement(term347248, 6, term347254);
        setField(term347247, term347247.getClass(), "data", term347248);
        setIntField(term347247, term347247.getClass(), "threshold", 12);
        setIntField(term347247, term347247.getClass(), "modCount", 4);
        setField(term347247, term347247.getClass(), "entrySet", null);
        setField(term347247, term347247.getClass(), "keySet", null);
        setField(term347247, term347247.getClass(), "values", null);
        setField(term347247, term347247.getClass(), "keySet", null);
        setField(term347247, term347247.getClass(), "values", null);
        setField(term347246, term347246.getClass(), "delegateMap", term347247);
        term347256 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term347256, term347256.getClass(), "size", 3);
        setIntField(term347256, term347256.getClass(), "hash1", 0);
        setIntField(term347256, term347256.getClass(), "hash2", 0);
        setIntField(term347256, term347256.getClass(), "hash3", 0);
        setField(term347256, term347256.getClass(), "key1", null);
        setField(term347256, term347256.getClass(), "key2", null);
        setField(term347256, term347256.getClass(), "key3", null);
        setField(term347256, term347256.getClass(), "value1", null);
        setField(term347256, term347256.getClass(), "value2", null);
        setField(term347256, term347256.getClass(), "value3", null);
        setField(term347256, term347256.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term346743;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term346375, args);
        assertTrue(recursiveEquals(term346375, term347246));
        assertTrue(recursiveEquals(term346743, term347256));
        assertTrue(recursiveEquals(retValue, null));
    }

};


