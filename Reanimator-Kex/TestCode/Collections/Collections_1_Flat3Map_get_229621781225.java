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

public class Flat3Map_get_229621781225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39435;
     Object term39533;
     Object term39535;

    public Flat3Map_get_229621781225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39435 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term39490 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term39435, term39435.getClass(), "delegateMap", null);
        setIntField(term39435, term39435.getClass(), "size", 2);
        setIntField(term39435, term39435.getClass(), "hash2", 0);
        setField(term39435, term39435.getClass(), "value2", term39490);
        term39533 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term39534 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term39533, term39533.getClass(), "size", 2);
        setIntField(term39533, term39533.getClass(), "hash1", 0);
        setIntField(term39533, term39533.getClass(), "hash2", 0);
        setIntField(term39533, term39533.getClass(), "hash3", 0);
        setField(term39533, term39533.getClass(), "key1", null);
        setField(term39533, term39533.getClass(), "key2", null);
        setField(term39533, term39533.getClass(), "key3", null);
        setField(term39533, term39533.getClass(), "value1", null);
        setFloatField(term39534, term39534.getClass(), "loadFactor", 0.0F);
        setIntField(term39534, term39534.getClass(), "size", 0);
        setField(term39534, term39534.getClass(), "data", null);
        setIntField(term39534, term39534.getClass(), "threshold", 0);
        setIntField(term39534, term39534.getClass(), "modCount", 0);
        setField(term39534, term39534.getClass(), "entrySet", null);
        setField(term39534, term39534.getClass(), "keySet", null);
        setField(term39534, term39534.getClass(), "values", null);
        setField(term39534, term39534.getClass(), "keySet", null);
        setField(term39534, term39534.getClass(), "values", null);
        setField(term39533, term39533.getClass(), "value2", term39534);
        setField(term39533, term39533.getClass(), "value3", null);
        setField(term39533, term39533.getClass(), "delegateMap", null);
        term39535 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term39536 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term39535, term39535.getClass(), "size", 2);
        setIntField(term39535, term39535.getClass(), "hash1", 0);
        setIntField(term39535, term39535.getClass(), "hash2", 0);
        setIntField(term39535, term39535.getClass(), "hash3", 0);
        setField(term39535, term39535.getClass(), "key1", null);
        setField(term39535, term39535.getClass(), "key2", null);
        setField(term39535, term39535.getClass(), "key3", null);
        setField(term39535, term39535.getClass(), "value1", null);
        setFloatField(term39536, term39536.getClass(), "loadFactor", 0.0F);
        setIntField(term39536, term39536.getClass(), "size", 0);
        setField(term39536, term39536.getClass(), "data", null);
        setIntField(term39536, term39536.getClass(), "threshold", 0);
        setIntField(term39536, term39536.getClass(), "modCount", 0);
        setField(term39536, term39536.getClass(), "entrySet", null);
        setField(term39536, term39536.getClass(), "keySet", null);
        setField(term39536, term39536.getClass(), "values", null);
        setField(term39536, term39536.getClass(), "keySet", null);
        setField(term39536, term39536.getClass(), "values", null);
        setField(term39535, term39535.getClass(), "value2", term39536);
        setField(term39535, term39535.getClass(), "value3", null);
        setField(term39535, term39535.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term39435;
        Object retValue = callMethod(klass, "get", argTypes, term39435, args);
        assertTrue(recursiveEquals(term39435, term39533));
        assertTrue(recursiveEquals(term39435, term39535));
        assertTrue(recursiveEquals(retValue, null));
    }

};
