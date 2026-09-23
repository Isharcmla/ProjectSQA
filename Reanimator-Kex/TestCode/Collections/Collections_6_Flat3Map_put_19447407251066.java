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

public class Flat3Map_put_19447407251066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309120;
     Object term309414;
     Object term310912;
     Object term310921;

    public Flat3Map_put_19447407251066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309120 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term309212 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term309322 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term309120, term309120.getClass(), "delegateMap", null);
        setIntField(term309120, term309120.getClass(), "size", 3);
        setIntField(term309120, term309120.getClass(), "hash3", -140376316);
        setField(term309120, term309120.getClass(), "key3", null);
        setIntField(term309120, term309120.getClass(), "hash2", -140376316);
        setField(term309212, term309212.getClass(), "delegateMap", null);
        setIntField(term309212, term309212.getClass(), "size", 3);
        setField(term309212, term309212.getClass(), "key3", null);
        setField(term309212, term309212.getClass(), "value3", null);
        setIntField(term309212, term309212.getClass(), "hash3", -1203634093);
        setIntField(term309212, term309212.getClass(), "hash2", -2127556088);
        setIntField(term309212, term309212.getClass(), "hash1", 23073223);
        setField(term309212, term309212.getClass(), "value2", null);
        setField(term309212, term309212.getClass(), "value1", null);
        setField(term309120, term309120.getClass(), "key2", term309212);
        setIntField(term309120, term309120.getClass(), "hash1", -140376316);
        setField(term309120, term309120.getClass(), "key1", null);
        setField(term309120, term309120.getClass(), "value3", term309322);
        setField(term309120, term309120.getClass(), "value2", null);
        setField(term309120, term309120.getClass(), "value1", null);
        term309414 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term309508 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        Object term309636 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyOrderedIterator"));
        setField(term309414, term309414.getClass(), "delegateMap", null);
        setIntField(term309414, term309414.getClass(), "size", 3);
        setIntField(term309414, term309414.getClass(), "hash3", 999555844);
        setField(term309414, term309414.getClass(), "value3", null);
        setIntField(term309414, term309414.getClass(), "hash2", 68026368);
        setField(term309414, term309414.getClass(), "value2", null);
        setIntField(term309414, term309414.getClass(), "hash1", -1207958528);
        setIntField(term309508, term309508.getClass(), "size", 0);
        setField(term309414, term309414.getClass(), "value1", term309508);
        setField(term309414, term309414.getClass(), "key3", null);
        setField(term309414, term309414.getClass(), "key2", null);
        setField(term309414, term309414.getClass(), "key1", term309636);
        term310912 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term310913 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term310914 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term310915 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term310916 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term310917 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term310918 = newInstance(Class.forName("java.lang.Object"));
        Object term310919 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term310920 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term310912, term310912.getClass(), "size", 0);
        setIntField(term310912, term310912.getClass(), "hash1", 0);
        setIntField(term310912, term310912.getClass(), "hash2", 0);
        setIntField(term310912, term310912.getClass(), "hash3", 0);
        setField(term310912, term310912.getClass(), "key1", null);
        setField(term310912, term310912.getClass(), "key2", null);
        setField(term310912, term310912.getClass(), "key3", null);
        setField(term310912, term310912.getClass(), "value1", null);
        setField(term310912, term310912.getClass(), "value2", null);
        setField(term310912, term310912.getClass(), "value3", null);
        setFloatField(term310913, term310913.getClass(), "loadFactor", 0.75F);
        setIntField(term310913, term310913.getClass(), "size", 3);
        setField(term310915, term310915.getClass(), "next", null);
        setIntField(term310916, term310916.getClass(), "size", 3);
        setIntField(term310916, term310916.getClass(), "hash1", 23073223);
        setIntField(term310916, term310916.getClass(), "hash2", -2127556088);
        setIntField(term310916, term310916.getClass(), "hash3", -1203634093);
        setField(term310916, term310916.getClass(), "key1", null);
        setField(term310916, term310916.getClass(), "key2", null);
        setField(term310916, term310916.getClass(), "key3", null);
        setField(term310916, term310916.getClass(), "value1", null);
        setField(term310916, term310916.getClass(), "value2", null);
        setField(term310916, term310916.getClass(), "value3", null);
        setField(term310916, term310916.getClass(), "delegateMap", null);
        setField(term310915, term310915.getClass(), "key", term310916);
        setField(term310915, term310915.getClass(), "value", null);
        setElement(term310914, 0, term310915);
        setField(term310917, term310917.getClass(), "next", null);
        setField(term310917, term310917.getClass(), "key", term310918);
        setField(term310917, term310917.getClass(), "value", null);
        setElement(term310914, 6, term310917);
        setField(term310919, term310919.getClass(), "next", null);
        setIntField(term310920, term310920.getClass(), "size", 3);
        setIntField(term310920, term310920.getClass(), "hash1", -1207958528);
        setIntField(term310920, term310920.getClass(), "hash2", 68026368);
        setIntField(term310920, term310920.getClass(), "hash3", 999555844);
        setField(term310920, term310920.getClass(), "key1", null);
        setField(term310920, term310920.getClass(), "key2", null);
        setField(term310920, term310920.getClass(), "key3", null);
        setField(term310920, term310920.getClass(), "value1", null);
        setField(term310920, term310920.getClass(), "value2", null);
        setField(term310920, term310920.getClass(), "value3", null);
        setField(term310920, term310920.getClass(), "delegateMap", null);
        setField(term310919, term310919.getClass(), "key", term310920);
        setField(term310919, term310919.getClass(), "value", null);
        setElement(term310914, 13, term310919);
        setField(term310913, term310913.getClass(), "data", term310914);
        setIntField(term310913, term310913.getClass(), "threshold", 12);
        setIntField(term310913, term310913.getClass(), "modCount", 3);
        setField(term310913, term310913.getClass(), "entrySet", null);
        setField(term310913, term310913.getClass(), "keySet", null);
        setField(term310913, term310913.getClass(), "values", null);
        setField(term310913, term310913.getClass(), "keySet", null);
        setField(term310913, term310913.getClass(), "values", null);
        setField(term310912, term310912.getClass(), "delegateMap", term310913);
        term310921 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term310921, term310921.getClass(), "size", 3);
        setIntField(term310921, term310921.getClass(), "hash1", -1207958528);
        setIntField(term310921, term310921.getClass(), "hash2", 68026368);
        setIntField(term310921, term310921.getClass(), "hash3", 999555844);
        setField(term310921, term310921.getClass(), "key1", null);
        setField(term310921, term310921.getClass(), "key2", null);
        setField(term310921, term310921.getClass(), "key3", null);
        setField(term310921, term310921.getClass(), "value1", null);
        setField(term310921, term310921.getClass(), "value2", null);
        setField(term310921, term310921.getClass(), "value3", null);
        setField(term310921, term310921.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term309414;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term309120, args);
        assertTrue(recursiveEquals(term309120, term310912));
        assertTrue(recursiveEquals(term309414, term310921));
        assertTrue(recursiveEquals(retValue, null));
    }

};


