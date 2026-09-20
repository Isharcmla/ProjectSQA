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
     Object term246;
     Object term7913;
     Object term7896;

    public Flat3Map_keySet_88438301638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term251 = newInstance(Class.forName("java.lang.Object"));
        Object term252 = newInstance(Class.forName("java.lang.Object"));
        Object term253 = newInstance(Class.forName("java.lang.Object"));
        Object term254 = newInstance(Class.forName("java.lang.Object"));
        Object term255 = newInstance(Class.forName("java.lang.Object"));
        Object term256 = newInstance(Class.forName("java.lang.Object"));
        Object term257 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term246, term246.getClass(), "size", 798043553);
        setIntField(term246, term246.getClass(), "hash1", 533197381);
        setIntField(term246, term246.getClass(), "hash2", 1048271679);
        setIntField(term246, term246.getClass(), "hash3", -1529797673);
        setField(term246, term246.getClass(), "key1", term251);
        setField(term246, term246.getClass(), "key2", term252);
        setField(term246, term246.getClass(), "key3", term253);
        setField(term246, term246.getClass(), "value1", term254);
        setField(term246, term246.getClass(), "value2", term255);
        setField(term246, term246.getClass(), "value3", term256);
        setFloatField(term257, term257.getClass(), "loadFactor", 0.0F);
        setIntField(term257, term257.getClass(), "size", 0);
        setField(term257, term257.getClass(), "data", null);
        setIntField(term257, term257.getClass(), "threshold", 0);
        setIntField(term257, term257.getClass(), "modCount", 0);
        setField(term257, term257.getClass(), "entrySet", null);
        setField(term257, term257.getClass(), "keySet", null);
        setField(term257, term257.getClass(), "values", null);
        setField(term257, term257.getClass(), "keySet", null);
        setField(term257, term257.getClass(), "values", null);
        setField(term246, term246.getClass(), "delegateMap", term257);
        term7913 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term7914 = newInstance(Class.forName("java.lang.Object"));
        Object term7915 = newInstance(Class.forName("java.lang.Object"));
        Object term7916 = newInstance(Class.forName("java.lang.Object"));
        Object term7917 = newInstance(Class.forName("java.lang.Object"));
        Object term7918 = newInstance(Class.forName("java.lang.Object"));
        Object term7919 = newInstance(Class.forName("java.lang.Object"));
        Object term7920 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term7921 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$KeySet"));
        setIntField(term7913, term7913.getClass(), "size", 798043553);
        setIntField(term7913, term7913.getClass(), "hash1", 533197381);
        setIntField(term7913, term7913.getClass(), "hash2", 1048271679);
        setIntField(term7913, term7913.getClass(), "hash3", -1529797673);
        setField(term7913, term7913.getClass(), "key1", term7914);
        setField(term7913, term7913.getClass(), "key2", term7915);
        setField(term7913, term7913.getClass(), "key3", term7916);
        setField(term7913, term7913.getClass(), "value1", term7917);
        setField(term7913, term7913.getClass(), "value2", term7918);
        setField(term7913, term7913.getClass(), "value3", term7919);
        setFloatField(term7920, term7920.getClass(), "loadFactor", 0.0F);
        setIntField(term7920, term7920.getClass(), "size", 0);
        setField(term7920, term7920.getClass(), "data", null);
        setIntField(term7920, term7920.getClass(), "threshold", 0);
        setIntField(term7920, term7920.getClass(), "modCount", 0);
        setField(term7920, term7920.getClass(), "entrySet", null);
        setField(term7921, term7921.getClass(), "parent", term7920);
        setField(term7920, term7920.getClass(), "keySet", term7921);
        setField(term7920, term7920.getClass(), "values", null);
        setField(term7920, term7920.getClass(), "keySet", null);
        setField(term7920, term7920.getClass(), "values", null);
        setField(term7913, term7913.getClass(), "delegateMap", term7920);
        term7896 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$KeySet"));
        Object term7897 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setFloatField(term7897, term7897.getClass(), "loadFactor", 0.0F);
        setIntField(term7897, term7897.getClass(), "size", 0);
        setField(term7897, term7897.getClass(), "data", null);
        setIntField(term7897, term7897.getClass(), "threshold", 0);
        setIntField(term7897, term7897.getClass(), "modCount", 0);
        setField(term7897, term7897.getClass(), "entrySet", null);
        setField(term7897, term7897.getClass(), "keySet", term7896);
        setField(term7897, term7897.getClass(), "values", null);
        setField(term7897, term7897.getClass(), "keySet", null);
        setField(term7897, term7897.getClass(), "values", null);
        setField(term7896, term7896.getClass(), "parent", term7897);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "keySet", argTypes, term246, args);
        assertTrue(recursiveEquals(term246, term7913));
        assertTrue(recursiveEquals(retValue, term7896));
    }

};
