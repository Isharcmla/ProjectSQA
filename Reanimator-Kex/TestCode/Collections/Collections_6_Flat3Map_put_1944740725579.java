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

public class Flat3Map_put_1944740725579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118511;
     Object term118805;
     Object term119910;
     Object term119918;

    public Flat3Map_put_1944740725579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118511 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term118603 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term118713 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term118511, term118511.getClass(), "delegateMap", null);
        setIntField(term118511, term118511.getClass(), "size", 3);
        setIntField(term118511, term118511.getClass(), "hash3", 0);
        setField(term118603, term118603.getClass(), "delegateMap", null);
        setIntField(term118603, term118603.getClass(), "size", 3);
        setField(term118603, term118603.getClass(), "key3", term118713);
        setField(term118603, term118603.getClass(), "key2", null);
        setField(term118603, term118603.getClass(), "value2", null);
        setField(term118511, term118511.getClass(), "key3", term118603);
        term118805 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term118897 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term118805, term118805.getClass(), "delegateMap", null);
        setIntField(term118805, term118805.getClass(), "size", 3);
        setIntField(term118805, term118805.getClass(), "hash3", 0);
        setField(term118805, term118805.getClass(), "value3", null);
        setIntField(term118805, term118805.getClass(), "hash2", 0);
        setField(term118805, term118805.getClass(), "value2", null);
        setIntField(term118805, term118805.getClass(), "hash1", 0);
        setField(term118805, term118805.getClass(), "value1", null);
        setField(term118805, term118805.getClass(), "key3", null);
        setField(term118897, term118897.getClass(), "delegateMap", null);
        setIntField(term118897, term118897.getClass(), "size", 2);
        setField(term118805, term118805.getClass(), "key2", term118897);
        term119910 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term119911 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term119912 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term119913 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term119914 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term119915 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term119916 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term119917 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term119910, term119910.getClass(), "size", 0);
        setIntField(term119910, term119910.getClass(), "hash1", 0);
        setIntField(term119910, term119910.getClass(), "hash2", 0);
        setIntField(term119910, term119910.getClass(), "hash3", 0);
        setField(term119910, term119910.getClass(), "key1", null);
        setField(term119910, term119910.getClass(), "key2", null);
        setField(term119910, term119910.getClass(), "key3", null);
        setField(term119910, term119910.getClass(), "value1", null);
        setField(term119910, term119910.getClass(), "value2", null);
        setField(term119910, term119910.getClass(), "value3", null);
        setFloatField(term119911, term119911.getClass(), "loadFactor", 0.75F);
        setIntField(term119911, term119911.getClass(), "size", 3);
        setField(term119914, term119914.getClass(), "next", null);
        setField(term119914, term119914.getClass(), "key", null);
        setField(term119914, term119914.getClass(), "value", null);
        setField(term119913, term119913.getClass(), "next", term119914);
        setIntField(term119915, term119915.getClass(), "size", 3);
        setIntField(term119915, term119915.getClass(), "hash1", 0);
        setIntField(term119915, term119915.getClass(), "hash2", 0);
        setIntField(term119915, term119915.getClass(), "hash3", 0);
        setField(term119915, term119915.getClass(), "key1", null);
        setField(term119915, term119915.getClass(), "key2", null);
        setField(term119915, term119915.getClass(), "key3", null);
        setField(term119915, term119915.getClass(), "value1", null);
        setField(term119915, term119915.getClass(), "value2", null);
        setField(term119915, term119915.getClass(), "value3", null);
        setField(term119915, term119915.getClass(), "delegateMap", null);
        setField(term119913, term119913.getClass(), "key", term119915);
        setField(term119913, term119913.getClass(), "value", null);
        setElement(term119912, 0, term119913);
        setField(term119916, term119916.getClass(), "next", null);
        setField(term119916, term119916.getClass(), "key", term119917);
        setField(term119916, term119916.getClass(), "value", null);
        setElement(term119912, 5, term119916);
        setField(term119911, term119911.getClass(), "data", term119912);
        setIntField(term119911, term119911.getClass(), "threshold", 12);
        setIntField(term119911, term119911.getClass(), "modCount", 3);
        setField(term119911, term119911.getClass(), "entrySet", null);
        setField(term119911, term119911.getClass(), "keySet", null);
        setField(term119911, term119911.getClass(), "values", null);
        setField(term119911, term119911.getClass(), "keySet", null);
        setField(term119911, term119911.getClass(), "values", null);
        setField(term119910, term119910.getClass(), "delegateMap", term119911);
        term119918 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term119918, term119918.getClass(), "size", 3);
        setIntField(term119918, term119918.getClass(), "hash1", 0);
        setIntField(term119918, term119918.getClass(), "hash2", 0);
        setIntField(term119918, term119918.getClass(), "hash3", 0);
        setField(term119918, term119918.getClass(), "key1", null);
        setField(term119918, term119918.getClass(), "key2", null);
        setField(term119918, term119918.getClass(), "key3", null);
        setField(term119918, term119918.getClass(), "value1", null);
        setField(term119918, term119918.getClass(), "value2", null);
        setField(term119918, term119918.getClass(), "value3", null);
        setField(term119918, term119918.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term118805;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term118511, args);
        assertTrue(recursiveEquals(term118511, term119910));
        assertTrue(recursiveEquals(term118805, term119918));
        assertTrue(recursiveEquals(retValue, null));
    }

};


