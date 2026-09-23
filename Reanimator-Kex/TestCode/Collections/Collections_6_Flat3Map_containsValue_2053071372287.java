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

public class Flat3Map_containsValue_2053071372287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47333;
     Object term47492;
     Object term47494;

    public Flat3Map_containsValue_2053071372287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47333 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term47379 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term47333, term47333.getClass(), "delegateMap", null);
        setIntField(term47333, term47333.getClass(), "size", 2);
        setField(term47333, term47333.getClass(), "value2", term47379);
        term47492 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term47493 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term47492, term47492.getClass(), "size", 2);
        setIntField(term47492, term47492.getClass(), "hash1", 0);
        setIntField(term47492, term47492.getClass(), "hash2", 0);
        setIntField(term47492, term47492.getClass(), "hash3", 0);
        setField(term47492, term47492.getClass(), "key1", null);
        setField(term47492, term47492.getClass(), "key2", null);
        setField(term47492, term47492.getClass(), "key3", null);
        setField(term47492, term47492.getClass(), "value1", null);
        setIntField(term47493, term47493.getClass(), "size", 0);
        setIntField(term47493, term47493.getClass(), "hash1", 0);
        setIntField(term47493, term47493.getClass(), "hash2", 0);
        setIntField(term47493, term47493.getClass(), "hash3", 0);
        setField(term47493, term47493.getClass(), "key1", null);
        setField(term47493, term47493.getClass(), "key2", null);
        setField(term47493, term47493.getClass(), "key3", null);
        setField(term47493, term47493.getClass(), "value1", null);
        setField(term47493, term47493.getClass(), "value2", null);
        setField(term47493, term47493.getClass(), "value3", null);
        setField(term47493, term47493.getClass(), "delegateMap", null);
        setField(term47492, term47492.getClass(), "value2", term47493);
        setField(term47492, term47492.getClass(), "value3", null);
        setField(term47492, term47492.getClass(), "delegateMap", null);
        term47494 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term47495 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term47494, term47494.getClass(), "size", 2);
        setIntField(term47494, term47494.getClass(), "hash1", 0);
        setIntField(term47494, term47494.getClass(), "hash2", 0);
        setIntField(term47494, term47494.getClass(), "hash3", 0);
        setField(term47494, term47494.getClass(), "key1", null);
        setField(term47494, term47494.getClass(), "key2", null);
        setField(term47494, term47494.getClass(), "key3", null);
        setField(term47494, term47494.getClass(), "value1", null);
        setIntField(term47495, term47495.getClass(), "size", 0);
        setIntField(term47495, term47495.getClass(), "hash1", 0);
        setIntField(term47495, term47495.getClass(), "hash2", 0);
        setIntField(term47495, term47495.getClass(), "hash3", 0);
        setField(term47495, term47495.getClass(), "key1", null);
        setField(term47495, term47495.getClass(), "key2", null);
        setField(term47495, term47495.getClass(), "key3", null);
        setField(term47495, term47495.getClass(), "value1", null);
        setField(term47495, term47495.getClass(), "value2", null);
        setField(term47495, term47495.getClass(), "value3", null);
        setField(term47495, term47495.getClass(), "delegateMap", null);
        setField(term47494, term47494.getClass(), "value2", term47495);
        setField(term47494, term47494.getClass(), "value3", null);
        setField(term47494, term47494.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term47333;
        callMethod(klass, "containsValue", argTypes, term47333, args);
        assertTrue(recursiveEquals(term47333, term47492));
        assertTrue(recursiveEquals(term47333, term47494));
    }

};


