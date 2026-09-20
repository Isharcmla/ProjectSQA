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

public class Flat3Map_containsValue_2053071372214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36694;
     Object term36896;
     Object term37373;
     Object term37375;

    public Flat3Map_containsValue_2053071372214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36694 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term36804 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term36694, term36694.getClass(), "delegateMap", null);
        setIntField(term36694, term36694.getClass(), "size", 3);
        setField(term36694, term36694.getClass(), "value3", term36804);
        term36896 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term37006 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term36896, term36896.getClass(), "delegateMap", term37006);
        term37373 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term37374 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term37373, term37373.getClass(), "size", 3);
        setIntField(term37373, term37373.getClass(), "hash1", 0);
        setIntField(term37373, term37373.getClass(), "hash2", 0);
        setIntField(term37373, term37373.getClass(), "hash3", 0);
        setField(term37373, term37373.getClass(), "key1", null);
        setField(term37373, term37373.getClass(), "key2", null);
        setField(term37373, term37373.getClass(), "key3", null);
        setField(term37373, term37373.getClass(), "value1", null);
        setField(term37373, term37373.getClass(), "value2", null);
        setFloatField(term37374, term37374.getClass(), "loadFactor", 0.0F);
        setIntField(term37374, term37374.getClass(), "size", 0);
        setField(term37374, term37374.getClass(), "data", null);
        setIntField(term37374, term37374.getClass(), "threshold", 0);
        setIntField(term37374, term37374.getClass(), "modCount", 0);
        setField(term37374, term37374.getClass(), "entrySet", null);
        setField(term37374, term37374.getClass(), "keySet", null);
        setField(term37374, term37374.getClass(), "values", null);
        setField(term37374, term37374.getClass(), "keySet", null);
        setField(term37374, term37374.getClass(), "values", null);
        setField(term37373, term37373.getClass(), "value3", term37374);
        setField(term37373, term37373.getClass(), "delegateMap", null);
        term37375 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term37376 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term37375, term37375.getClass(), "size", 0);
        setIntField(term37375, term37375.getClass(), "hash1", 0);
        setIntField(term37375, term37375.getClass(), "hash2", 0);
        setIntField(term37375, term37375.getClass(), "hash3", 0);
        setField(term37375, term37375.getClass(), "key1", null);
        setField(term37375, term37375.getClass(), "key2", null);
        setField(term37375, term37375.getClass(), "key3", null);
        setField(term37375, term37375.getClass(), "value1", null);
        setField(term37375, term37375.getClass(), "value2", null);
        setField(term37375, term37375.getClass(), "value3", null);
        setFloatField(term37376, term37376.getClass(), "loadFactor", 0.0F);
        setIntField(term37376, term37376.getClass(), "size", 0);
        setField(term37376, term37376.getClass(), "data", null);
        setIntField(term37376, term37376.getClass(), "threshold", 0);
        setIntField(term37376, term37376.getClass(), "modCount", 0);
        setField(term37376, term37376.getClass(), "entrySet", null);
        setField(term37376, term37376.getClass(), "keySet", null);
        setField(term37376, term37376.getClass(), "values", null);
        setField(term37376, term37376.getClass(), "keySet", null);
        setField(term37376, term37376.getClass(), "values", null);
        setField(term37375, term37375.getClass(), "delegateMap", term37376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term36896;
        callMethod(klass, "containsValue", argTypes, term36694, args);
        assertTrue(recursiveEquals(term36694, term37373));
        assertTrue(recursiveEquals(term36896, term37375));
    }

};
