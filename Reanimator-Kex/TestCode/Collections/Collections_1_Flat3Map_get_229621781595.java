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

public class Flat3Map_get_229621781595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114072;
     Object term114294;
     Object term114494;
     Object term114497;

    public Flat3Map_get_229621781595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114072 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term114164 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term114202 = newInstance(Class.forName("java.lang.Object"));
        setField(term114072, term114072.getClass(), "delegateMap", null);
        setIntField(term114072, term114072.getClass(), "size", 2);
        setIntField(term114072, term114072.getClass(), "hash2", 0);
        setField(term114072, term114072.getClass(), "key2", null);
        setIntField(term114072, term114072.getClass(), "hash1", 0);
        setField(term114164, term114164.getClass(), "delegateMap", null);
        setIntField(term114164, term114164.getClass(), "size", 2);
        setField(term114164, term114164.getClass(), "key2", term114202);
        setField(term114072, term114072.getClass(), "key1", term114164);
        term114294 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term114404 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term114294, term114294.getClass(), "delegateMap", null);
        setIntField(term114294, term114294.getClass(), "size", 2);
        setIntField(term114294, term114294.getClass(), "hash2", 0);
        setIntField(term114404, term114404.getClass(), "size", 0);
        setField(term114294, term114294.getClass(), "value2", term114404);
        setIntField(term114294, term114294.getClass(), "hash1", 0);
        setField(term114294, term114294.getClass(), "value1", null);
        setField(term114294, term114294.getClass(), "key2", null);
        term114494 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term114495 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term114496 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term114494, term114494.getClass(), "size", 2);
        setIntField(term114494, term114494.getClass(), "hash1", 0);
        setIntField(term114494, term114494.getClass(), "hash2", 0);
        setIntField(term114494, term114494.getClass(), "hash3", 0);
        setIntField(term114495, term114495.getClass(), "size", 2);
        setIntField(term114495, term114495.getClass(), "hash1", 0);
        setIntField(term114495, term114495.getClass(), "hash2", 0);
        setIntField(term114495, term114495.getClass(), "hash3", 0);
        setField(term114495, term114495.getClass(), "key1", null);
        setField(term114495, term114495.getClass(), "key2", term114496);
        setField(term114495, term114495.getClass(), "key3", null);
        setField(term114495, term114495.getClass(), "value1", null);
        setField(term114495, term114495.getClass(), "value2", null);
        setField(term114495, term114495.getClass(), "value3", null);
        setField(term114495, term114495.getClass(), "delegateMap", null);
        setField(term114494, term114494.getClass(), "key1", term114495);
        setField(term114494, term114494.getClass(), "key2", null);
        setField(term114494, term114494.getClass(), "key3", null);
        setField(term114494, term114494.getClass(), "value1", null);
        setField(term114494, term114494.getClass(), "value2", null);
        setField(term114494, term114494.getClass(), "value3", null);
        setField(term114494, term114494.getClass(), "delegateMap", null);
        term114497 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term114498 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term114497, term114497.getClass(), "size", 2);
        setIntField(term114497, term114497.getClass(), "hash1", 0);
        setIntField(term114497, term114497.getClass(), "hash2", 0);
        setIntField(term114497, term114497.getClass(), "hash3", 0);
        setField(term114497, term114497.getClass(), "key1", null);
        setField(term114497, term114497.getClass(), "key2", null);
        setField(term114497, term114497.getClass(), "key3", null);
        setField(term114497, term114497.getClass(), "value1", null);
        setFloatField(term114498, term114498.getClass(), "loadFactor", 0.0F);
        setIntField(term114498, term114498.getClass(), "size", 0);
        setField(term114498, term114498.getClass(), "data", null);
        setIntField(term114498, term114498.getClass(), "threshold", 0);
        setIntField(term114498, term114498.getClass(), "modCount", 0);
        setField(term114498, term114498.getClass(), "entrySet", null);
        setField(term114498, term114498.getClass(), "keySet", null);
        setField(term114498, term114498.getClass(), "values", null);
        setField(term114498, term114498.getClass(), "keySet", null);
        setField(term114498, term114498.getClass(), "values", null);
        setField(term114497, term114497.getClass(), "value2", term114498);
        setField(term114497, term114497.getClass(), "value3", null);
        setField(term114497, term114497.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term114294;
        Object retValue = callMethod(klass, "get", argTypes, term114072, args);
        assertTrue(recursiveEquals(term114072, term114494));
        assertTrue(recursiveEquals(term114294, term114497));
        assertTrue(recursiveEquals(retValue, null));
    }

};
