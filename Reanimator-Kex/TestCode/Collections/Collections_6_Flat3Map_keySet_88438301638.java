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

public class Flat3Map_keySet_88438301638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244;
     Object term7916;
     Object term7899;

    public Flat3Map_keySet_88438301638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term244 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term249 = newInstance(Class.forName("java.lang.Object"));
        Object term250 = newInstance(Class.forName("java.lang.Object"));
        Object term251 = newInstance(Class.forName("java.lang.Object"));
        Object term252 = newInstance(Class.forName("java.lang.Object"));
        Object term253 = newInstance(Class.forName("java.lang.Object"));
        Object term254 = newInstance(Class.forName("java.lang.Object"));
        Object term255 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term244, term244.getClass(), "size", 798043553);
        setIntField(term244, term244.getClass(), "hash1", 533197381);
        setIntField(term244, term244.getClass(), "hash2", 1048271679);
        setIntField(term244, term244.getClass(), "hash3", -1529797673);
        setField(term244, term244.getClass(), "key1", term249);
        setField(term244, term244.getClass(), "key2", term250);
        setField(term244, term244.getClass(), "key3", term251);
        setField(term244, term244.getClass(), "value1", term252);
        setField(term244, term244.getClass(), "value2", term253);
        setField(term244, term244.getClass(), "value3", term254);
        setFloatField(term255, term255.getClass(), "loadFactor", 0.0F);
        setIntField(term255, term255.getClass(), "size", 0);
        setField(term255, term255.getClass(), "data", null);
        setIntField(term255, term255.getClass(), "threshold", 0);
        setIntField(term255, term255.getClass(), "modCount", 0);
        setField(term255, term255.getClass(), "entrySet", null);
        setField(term255, term255.getClass(), "keySet", null);
        setField(term255, term255.getClass(), "values", null);
        setField(term255, term255.getClass(), "keySet", null);
        setField(term255, term255.getClass(), "values", null);
        setField(term244, term244.getClass(), "delegateMap", term255);
        term7916 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term7917 = newInstance(Class.forName("java.lang.Object"));
        Object term7918 = newInstance(Class.forName("java.lang.Object"));
        Object term7919 = newInstance(Class.forName("java.lang.Object"));
        Object term7920 = newInstance(Class.forName("java.lang.Object"));
        Object term7921 = newInstance(Class.forName("java.lang.Object"));
        Object term7922 = newInstance(Class.forName("java.lang.Object"));
        Object term7923 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term7924 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$KeySet"));
        setIntField(term7916, term7916.getClass(), "size", 798043553);
        setIntField(term7916, term7916.getClass(), "hash1", 533197381);
        setIntField(term7916, term7916.getClass(), "hash2", 1048271679);
        setIntField(term7916, term7916.getClass(), "hash3", -1529797673);
        setField(term7916, term7916.getClass(), "key1", term7917);
        setField(term7916, term7916.getClass(), "key2", term7918);
        setField(term7916, term7916.getClass(), "key3", term7919);
        setField(term7916, term7916.getClass(), "value1", term7920);
        setField(term7916, term7916.getClass(), "value2", term7921);
        setField(term7916, term7916.getClass(), "value3", term7922);
        setFloatField(term7923, term7923.getClass(), "loadFactor", 0.0F);
        setIntField(term7923, term7923.getClass(), "size", 0);
        setField(term7923, term7923.getClass(), "data", null);
        setIntField(term7923, term7923.getClass(), "threshold", 0);
        setIntField(term7923, term7923.getClass(), "modCount", 0);
        setField(term7923, term7923.getClass(), "entrySet", null);
        setField(term7924, term7924.getClass(), "parent", term7923);
        setField(term7923, term7923.getClass(), "keySet", term7924);
        setField(term7923, term7923.getClass(), "values", null);
        setField(term7923, term7923.getClass(), "keySet", null);
        setField(term7923, term7923.getClass(), "values", null);
        setField(term7916, term7916.getClass(), "delegateMap", term7923);
        term7899 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$KeySet"));
        Object term7900 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setFloatField(term7900, term7900.getClass(), "loadFactor", 0.0F);
        setIntField(term7900, term7900.getClass(), "size", 0);
        setField(term7900, term7900.getClass(), "data", null);
        setIntField(term7900, term7900.getClass(), "threshold", 0);
        setIntField(term7900, term7900.getClass(), "modCount", 0);
        setField(term7900, term7900.getClass(), "entrySet", null);
        setField(term7900, term7900.getClass(), "keySet", term7899);
        setField(term7900, term7900.getClass(), "values", null);
        setField(term7900, term7900.getClass(), "keySet", null);
        setField(term7900, term7900.getClass(), "values", null);
        setField(term7899, term7899.getClass(), "parent", term7900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "keySet", argTypes, term244, args);
        assertTrue(recursiveEquals(term244, term7916));
        assertTrue(recursiveEquals(retValue, term7899));
    }

};


