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

public class Flat3Map_get_229621781459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85072;
     Object term85294;
     Object term85784;
     Object term85787;

    public Flat3Map_get_229621781459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85072 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term85164 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term85202 = newInstance(Class.forName("java.lang.Object"));
        setField(term85072, term85072.getClass(), "delegateMap", null);
        setIntField(term85072, term85072.getClass(), "size", 2);
        setIntField(term85072, term85072.getClass(), "hash2", 0);
        setField(term85164, term85164.getClass(), "delegateMap", null);
        setIntField(term85164, term85164.getClass(), "size", 2);
        setField(term85164, term85164.getClass(), "key2", term85202);
        setField(term85164, term85164.getClass(), "key1", null);
        setField(term85164, term85164.getClass(), "value1", null);
        setField(term85072, term85072.getClass(), "key2", term85164);
        setIntField(term85072, term85072.getClass(), "hash1", 0);
        setField(term85072, term85072.getClass(), "key1", term85164);
        term85294 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term85404 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term85294, term85294.getClass(), "delegateMap", null);
        setIntField(term85294, term85294.getClass(), "size", 2);
        setIntField(term85294, term85294.getClass(), "hash2", 0);
        setIntField(term85404, term85404.getClass(), "size", 0);
        setField(term85294, term85294.getClass(), "value2", term85404);
        setIntField(term85294, term85294.getClass(), "hash1", 0);
        setField(term85294, term85294.getClass(), "value1", null);
        setField(term85294, term85294.getClass(), "key2", null);
        term85784 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term85785 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term85786 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term85784, term85784.getClass(), "size", 2);
        setIntField(term85784, term85784.getClass(), "hash1", 0);
        setIntField(term85784, term85784.getClass(), "hash2", 0);
        setIntField(term85784, term85784.getClass(), "hash3", 0);
        setIntField(term85785, term85785.getClass(), "size", 2);
        setIntField(term85785, term85785.getClass(), "hash1", 0);
        setIntField(term85785, term85785.getClass(), "hash2", 0);
        setIntField(term85785, term85785.getClass(), "hash3", 0);
        setField(term85785, term85785.getClass(), "key1", null);
        setField(term85785, term85785.getClass(), "key2", term85786);
        setField(term85785, term85785.getClass(), "key3", null);
        setField(term85785, term85785.getClass(), "value1", null);
        setField(term85785, term85785.getClass(), "value2", null);
        setField(term85785, term85785.getClass(), "value3", null);
        setField(term85785, term85785.getClass(), "delegateMap", null);
        setField(term85784, term85784.getClass(), "key1", term85785);
        setField(term85784, term85784.getClass(), "key2", term85785);
        setField(term85784, term85784.getClass(), "key3", null);
        setField(term85784, term85784.getClass(), "value1", null);
        setField(term85784, term85784.getClass(), "value2", null);
        setField(term85784, term85784.getClass(), "value3", null);
        setField(term85784, term85784.getClass(), "delegateMap", null);
        term85787 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term85788 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term85787, term85787.getClass(), "size", 2);
        setIntField(term85787, term85787.getClass(), "hash1", 0);
        setIntField(term85787, term85787.getClass(), "hash2", 0);
        setIntField(term85787, term85787.getClass(), "hash3", 0);
        setField(term85787, term85787.getClass(), "key1", null);
        setField(term85787, term85787.getClass(), "key2", null);
        setField(term85787, term85787.getClass(), "key3", null);
        setField(term85787, term85787.getClass(), "value1", null);
        setFloatField(term85788, term85788.getClass(), "loadFactor", 0.0F);
        setIntField(term85788, term85788.getClass(), "size", 0);
        setField(term85788, term85788.getClass(), "data", null);
        setIntField(term85788, term85788.getClass(), "threshold", 0);
        setIntField(term85788, term85788.getClass(), "modCount", 0);
        setField(term85788, term85788.getClass(), "entrySet", null);
        setField(term85788, term85788.getClass(), "keySet", null);
        setField(term85788, term85788.getClass(), "values", null);
        setField(term85788, term85788.getClass(), "keySet", null);
        setField(term85788, term85788.getClass(), "values", null);
        setField(term85787, term85787.getClass(), "value2", term85788);
        setField(term85787, term85787.getClass(), "value3", null);
        setField(term85787, term85787.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term85294;
        Object retValue = callMethod(klass, "get", argTypes, term85072, args);
        assertTrue(recursiveEquals(term85072, term85784));
        assertTrue(recursiveEquals(term85294, term85787));
        assertTrue(recursiveEquals(retValue, null));
    }

};
