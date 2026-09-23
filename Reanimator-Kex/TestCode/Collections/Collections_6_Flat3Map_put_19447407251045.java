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

public class Flat3Map_put_19447407251045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300101;
     Object term300471;
     Object term300477;

    public Flat3Map_put_19447407251045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term300101 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term300156 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term300101, term300101.getClass(), "delegateMap", null);
        setIntField(term300101, term300101.getClass(), "size", 3);
        setIntField(term300101, term300101.getClass(), "hash3", -1);
        setField(term300101, term300101.getClass(), "value3", null);
        setIntField(term300101, term300101.getClass(), "hash2", -1);
        setIntField(term300156, term300156.getClass(), "size", 0);
        setField(term300101, term300101.getClass(), "value2", term300156);
        setIntField(term300101, term300101.getClass(), "hash1", 0);
        setField(term300101, term300101.getClass(), "value1", null);
        term300471 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term300472 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term300473 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term300474 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term300475 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term300476 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term300471, term300471.getClass(), "size", 0);
        setIntField(term300471, term300471.getClass(), "hash1", 0);
        setIntField(term300471, term300471.getClass(), "hash2", 0);
        setIntField(term300471, term300471.getClass(), "hash3", 0);
        setField(term300471, term300471.getClass(), "key1", null);
        setField(term300471, term300471.getClass(), "key2", null);
        setField(term300471, term300471.getClass(), "key3", null);
        setField(term300471, term300471.getClass(), "value1", null);
        setField(term300471, term300471.getClass(), "value2", null);
        setField(term300471, term300471.getClass(), "value3", null);
        setFloatField(term300472, term300472.getClass(), "loadFactor", 0.75F);
        setIntField(term300472, term300472.getClass(), "size", 2);
        setField(term300474, term300474.getClass(), "next", null);
        setField(term300474, term300474.getClass(), "key", term300471);
        setField(term300474, term300474.getClass(), "value", null);
        setElement(term300473, 0, term300474);
        setField(term300475, term300475.getClass(), "next", null);
        setField(term300475, term300475.getClass(), "key", term300476);
        setField(term300475, term300475.getClass(), "value", null);
        setElement(term300473, 6, term300475);
        setField(term300472, term300472.getClass(), "data", term300473);
        setIntField(term300472, term300472.getClass(), "threshold", 12);
        setIntField(term300472, term300472.getClass(), "modCount", 2);
        setField(term300472, term300472.getClass(), "entrySet", null);
        setField(term300472, term300472.getClass(), "keySet", null);
        setField(term300472, term300472.getClass(), "values", null);
        setField(term300472, term300472.getClass(), "keySet", null);
        setField(term300472, term300472.getClass(), "values", null);
        setField(term300471, term300471.getClass(), "delegateMap", term300472);
        term300477 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term300478 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term300479 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term300480 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term300481 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term300482 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term300477, term300477.getClass(), "size", 0);
        setIntField(term300477, term300477.getClass(), "hash1", 0);
        setIntField(term300477, term300477.getClass(), "hash2", 0);
        setIntField(term300477, term300477.getClass(), "hash3", 0);
        setField(term300477, term300477.getClass(), "key1", null);
        setField(term300477, term300477.getClass(), "key2", null);
        setField(term300477, term300477.getClass(), "key3", null);
        setField(term300477, term300477.getClass(), "value1", null);
        setField(term300477, term300477.getClass(), "value2", null);
        setField(term300477, term300477.getClass(), "value3", null);
        setFloatField(term300478, term300478.getClass(), "loadFactor", 0.75F);
        setIntField(term300478, term300478.getClass(), "size", 2);
        setField(term300480, term300480.getClass(), "next", null);
        setField(term300480, term300480.getClass(), "key", term300477);
        setField(term300480, term300480.getClass(), "value", null);
        setElement(term300479, 0, term300480);
        setField(term300481, term300481.getClass(), "next", null);
        setField(term300481, term300481.getClass(), "key", term300482);
        setField(term300481, term300481.getClass(), "value", null);
        setElement(term300479, 6, term300481);
        setField(term300478, term300478.getClass(), "data", term300479);
        setIntField(term300478, term300478.getClass(), "threshold", 12);
        setIntField(term300478, term300478.getClass(), "modCount", 2);
        setField(term300478, term300478.getClass(), "entrySet", null);
        setField(term300478, term300478.getClass(), "keySet", null);
        setField(term300478, term300478.getClass(), "values", null);
        setField(term300478, term300478.getClass(), "keySet", null);
        setField(term300478, term300478.getClass(), "values", null);
        setField(term300477, term300477.getClass(), "delegateMap", term300478);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term300101;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term300101, args);
        assertTrue(recursiveEquals(term300101, term300471));
        assertTrue(recursiveEquals(term300101, term300477));
        assertTrue(recursiveEquals(retValue, null));
    }

};


