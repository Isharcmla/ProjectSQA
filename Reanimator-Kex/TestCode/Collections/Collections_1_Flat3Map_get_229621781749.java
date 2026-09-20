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

public class Flat3Map_get_229621781749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151427;
     Object term151519;
     Object term151803;
     Object term151804;

    public Flat3Map_get_229621781749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151427 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term151427, term151427.getClass(), "delegateMap", null);
        setIntField(term151427, term151427.getClass(), "size", 2);
        setIntField(term151427, term151427.getClass(), "hash2", 0);
        setField(term151427, term151427.getClass(), "key2", term151427);
        setIntField(term151427, term151427.getClass(), "hash1", 0);
        setField(term151427, term151427.getClass(), "key1", term151427);
        term151519 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term151629 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term151519, term151519.getClass(), "delegateMap", null);
        setIntField(term151519, term151519.getClass(), "size", 2);
        setIntField(term151519, term151519.getClass(), "hash2", 0);
        setField(term151519, term151519.getClass(), "value2", null);
        setIntField(term151519, term151519.getClass(), "hash1", 0);
        setField(term151519, term151519.getClass(), "value1", null);
        setIntField(term151629, term151629.getClass(), "size", 0);
        setField(term151519, term151519.getClass(), "key2", term151629);
        term151803 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term151803, term151803.getClass(), "size", 2);
        setIntField(term151803, term151803.getClass(), "hash1", 0);
        setIntField(term151803, term151803.getClass(), "hash2", 0);
        setIntField(term151803, term151803.getClass(), "hash3", 0);
        setField(term151803, term151803.getClass(), "key1", term151803);
        setField(term151803, term151803.getClass(), "key2", term151803);
        setField(term151803, term151803.getClass(), "key3", null);
        setField(term151803, term151803.getClass(), "value1", null);
        setField(term151803, term151803.getClass(), "value2", null);
        setField(term151803, term151803.getClass(), "value3", null);
        setField(term151803, term151803.getClass(), "delegateMap", null);
        term151804 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term151805 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term151804, term151804.getClass(), "size", 2);
        setIntField(term151804, term151804.getClass(), "hash1", 0);
        setIntField(term151804, term151804.getClass(), "hash2", 0);
        setIntField(term151804, term151804.getClass(), "hash3", 0);
        setField(term151804, term151804.getClass(), "key1", null);
        setFloatField(term151805, term151805.getClass(), "loadFactor", 0.0F);
        setIntField(term151805, term151805.getClass(), "size", 0);
        setField(term151805, term151805.getClass(), "data", null);
        setIntField(term151805, term151805.getClass(), "threshold", 0);
        setIntField(term151805, term151805.getClass(), "modCount", 0);
        setField(term151805, term151805.getClass(), "entrySet", null);
        setField(term151805, term151805.getClass(), "keySet", null);
        setField(term151805, term151805.getClass(), "values", null);
        setField(term151805, term151805.getClass(), "keySet", null);
        setField(term151805, term151805.getClass(), "values", null);
        setField(term151804, term151804.getClass(), "key2", term151805);
        setField(term151804, term151804.getClass(), "key3", null);
        setField(term151804, term151804.getClass(), "value1", null);
        setField(term151804, term151804.getClass(), "value2", null);
        setField(term151804, term151804.getClass(), "value3", null);
        setField(term151804, term151804.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term151519;
        Object retValue = callMethod(klass, "get", argTypes, term151427, args);
        assertTrue(recursiveEquals(term151427, term151803));
        assertTrue(recursiveEquals(term151519, term151804));
        assertTrue(recursiveEquals(retValue, null));
    }

};
