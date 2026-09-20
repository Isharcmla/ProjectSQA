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

public class Flat3Map_containsKey_76092510611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117805;
     Object term117904;
     Object term117906;

    public Flat3Map_containsKey_76092510611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117805 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term117860 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term117805, term117805.getClass(), "delegateMap", null);
        setIntField(term117805, term117805.getClass(), "size", 2);
        setIntField(term117805, term117805.getClass(), "hash2", 0);
        setField(term117805, term117805.getClass(), "value2", term117860);
        term117904 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term117905 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term117904, term117904.getClass(), "size", 2);
        setIntField(term117904, term117904.getClass(), "hash1", 0);
        setIntField(term117904, term117904.getClass(), "hash2", 0);
        setIntField(term117904, term117904.getClass(), "hash3", 0);
        setField(term117904, term117904.getClass(), "key1", null);
        setField(term117904, term117904.getClass(), "key2", null);
        setField(term117904, term117904.getClass(), "key3", null);
        setField(term117904, term117904.getClass(), "value1", null);
        setFloatField(term117905, term117905.getClass(), "loadFactor", 0.0F);
        setIntField(term117905, term117905.getClass(), "size", 0);
        setField(term117905, term117905.getClass(), "data", null);
        setIntField(term117905, term117905.getClass(), "threshold", 0);
        setIntField(term117905, term117905.getClass(), "modCount", 0);
        setField(term117905, term117905.getClass(), "entrySet", null);
        setField(term117905, term117905.getClass(), "keySet", null);
        setField(term117905, term117905.getClass(), "values", null);
        setField(term117905, term117905.getClass(), "keySet", null);
        setField(term117905, term117905.getClass(), "values", null);
        setField(term117904, term117904.getClass(), "value2", term117905);
        setField(term117904, term117904.getClass(), "value3", null);
        setField(term117904, term117904.getClass(), "delegateMap", null);
        term117906 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term117907 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term117906, term117906.getClass(), "size", 2);
        setIntField(term117906, term117906.getClass(), "hash1", 0);
        setIntField(term117906, term117906.getClass(), "hash2", 0);
        setIntField(term117906, term117906.getClass(), "hash3", 0);
        setField(term117906, term117906.getClass(), "key1", null);
        setField(term117906, term117906.getClass(), "key2", null);
        setField(term117906, term117906.getClass(), "key3", null);
        setField(term117906, term117906.getClass(), "value1", null);
        setFloatField(term117907, term117907.getClass(), "loadFactor", 0.0F);
        setIntField(term117907, term117907.getClass(), "size", 0);
        setField(term117907, term117907.getClass(), "data", null);
        setIntField(term117907, term117907.getClass(), "threshold", 0);
        setIntField(term117907, term117907.getClass(), "modCount", 0);
        setField(term117907, term117907.getClass(), "entrySet", null);
        setField(term117907, term117907.getClass(), "keySet", null);
        setField(term117907, term117907.getClass(), "values", null);
        setField(term117907, term117907.getClass(), "keySet", null);
        setField(term117907, term117907.getClass(), "values", null);
        setField(term117906, term117906.getClass(), "value2", term117907);
        setField(term117906, term117906.getClass(), "value3", null);
        setField(term117906, term117906.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term117805;
        callMethod(klass, "containsKey", argTypes, term117805, args);
        assertTrue(recursiveEquals(term117805, term117904));
        assertTrue(recursiveEquals(term117805, term117906));
    }

};
