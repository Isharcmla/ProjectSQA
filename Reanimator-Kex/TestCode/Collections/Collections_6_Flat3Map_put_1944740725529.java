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

public class Flat3Map_put_1944740725529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102040;
     Object term102914;

    public Flat3Map_put_1944740725529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102040 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term102132 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term102224 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term102316 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term102040, term102040.getClass(), "delegateMap", null);
        setIntField(term102040, term102040.getClass(), "size", 3);
        setField(term102040, term102040.getClass(), "key3", term102132);
        setField(term102040, term102040.getClass(), "key2", term102224);
        setField(term102040, term102040.getClass(), "key1", term102316);
        term102914 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term102915 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term102916 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term102917 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term102918 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term102919 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term102920 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term102914, term102914.getClass(), "size", 0);
        setIntField(term102914, term102914.getClass(), "hash1", 0);
        setIntField(term102914, term102914.getClass(), "hash2", 0);
        setIntField(term102914, term102914.getClass(), "hash3", 0);
        setField(term102914, term102914.getClass(), "key1", null);
        setField(term102914, term102914.getClass(), "key2", null);
        setField(term102914, term102914.getClass(), "key3", null);
        setField(term102914, term102914.getClass(), "value1", null);
        setField(term102914, term102914.getClass(), "value2", null);
        setField(term102914, term102914.getClass(), "value3", null);
        setFloatField(term102915, term102915.getClass(), "loadFactor", 0.75F);
        setIntField(term102915, term102915.getClass(), "size", 2);
        setField(term102917, term102917.getClass(), "next", null);
        setIntField(term102918, term102918.getClass(), "size", 0);
        setIntField(term102918, term102918.getClass(), "hash1", 0);
        setIntField(term102918, term102918.getClass(), "hash2", 0);
        setIntField(term102918, term102918.getClass(), "hash3", 0);
        setField(term102918, term102918.getClass(), "key1", null);
        setField(term102918, term102918.getClass(), "key2", null);
        setField(term102918, term102918.getClass(), "key3", null);
        setField(term102918, term102918.getClass(), "value1", null);
        setField(term102918, term102918.getClass(), "value2", null);
        setField(term102918, term102918.getClass(), "value3", null);
        setField(term102918, term102918.getClass(), "delegateMap", null);
        setField(term102917, term102917.getClass(), "key", term102918);
        setField(term102917, term102917.getClass(), "value", null);
        setElement(term102916, 0, term102917);
        setField(term102919, term102919.getClass(), "next", null);
        setField(term102919, term102919.getClass(), "key", term102920);
        setField(term102919, term102919.getClass(), "value", null);
        setElement(term102916, 5, term102919);
        setField(term102915, term102915.getClass(), "data", term102916);
        setIntField(term102915, term102915.getClass(), "threshold", 12);
        setIntField(term102915, term102915.getClass(), "modCount", 2);
        setField(term102915, term102915.getClass(), "entrySet", null);
        setField(term102915, term102915.getClass(), "keySet", null);
        setField(term102915, term102915.getClass(), "values", null);
        setField(term102915, term102915.getClass(), "keySet", null);
        setField(term102915, term102915.getClass(), "values", null);
        setField(term102914, term102914.getClass(), "delegateMap", term102915);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term102040, args);
        assertTrue(recursiveEquals(term102040, term102914));
        assertTrue(recursiveEquals(retValue, null));
    }

};


