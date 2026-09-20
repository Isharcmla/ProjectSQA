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

public class Flat3Map_containsValue_2053071372663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129787;
     Object term129989;
     Object term130154;
     Object term130156;

    public Flat3Map_containsValue_2053071372663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129787 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term129897 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term129787, term129787.getClass(), "delegateMap", null);
        setIntField(term129787, term129787.getClass(), "size", 1);
        setField(term129787, term129787.getClass(), "value1", term129897);
        term129989 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term130099 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term129989, term129989.getClass(), "delegateMap", term130099);
        term130154 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term130155 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term130154, term130154.getClass(), "size", 1);
        setIntField(term130154, term130154.getClass(), "hash1", 0);
        setIntField(term130154, term130154.getClass(), "hash2", 0);
        setIntField(term130154, term130154.getClass(), "hash3", 0);
        setField(term130154, term130154.getClass(), "key1", null);
        setField(term130154, term130154.getClass(), "key2", null);
        setField(term130154, term130154.getClass(), "key3", null);
        setFloatField(term130155, term130155.getClass(), "loadFactor", 0.0F);
        setIntField(term130155, term130155.getClass(), "size", 0);
        setField(term130155, term130155.getClass(), "data", null);
        setIntField(term130155, term130155.getClass(), "threshold", 0);
        setIntField(term130155, term130155.getClass(), "modCount", 0);
        setField(term130155, term130155.getClass(), "entrySet", null);
        setField(term130155, term130155.getClass(), "keySet", null);
        setField(term130155, term130155.getClass(), "values", null);
        setField(term130155, term130155.getClass(), "keySet", null);
        setField(term130155, term130155.getClass(), "values", null);
        setField(term130154, term130154.getClass(), "value1", term130155);
        setField(term130154, term130154.getClass(), "value2", null);
        setField(term130154, term130154.getClass(), "value3", null);
        setField(term130154, term130154.getClass(), "delegateMap", null);
        term130156 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term130157 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term130156, term130156.getClass(), "size", 0);
        setIntField(term130156, term130156.getClass(), "hash1", 0);
        setIntField(term130156, term130156.getClass(), "hash2", 0);
        setIntField(term130156, term130156.getClass(), "hash3", 0);
        setField(term130156, term130156.getClass(), "key1", null);
        setField(term130156, term130156.getClass(), "key2", null);
        setField(term130156, term130156.getClass(), "key3", null);
        setField(term130156, term130156.getClass(), "value1", null);
        setField(term130156, term130156.getClass(), "value2", null);
        setField(term130156, term130156.getClass(), "value3", null);
        setFloatField(term130157, term130157.getClass(), "loadFactor", 0.0F);
        setIntField(term130157, term130157.getClass(), "size", 0);
        setField(term130157, term130157.getClass(), "data", null);
        setIntField(term130157, term130157.getClass(), "threshold", 0);
        setIntField(term130157, term130157.getClass(), "modCount", 0);
        setField(term130157, term130157.getClass(), "entrySet", null);
        setField(term130157, term130157.getClass(), "keySet", null);
        setField(term130157, term130157.getClass(), "values", null);
        setField(term130157, term130157.getClass(), "keySet", null);
        setField(term130157, term130157.getClass(), "values", null);
        setField(term130156, term130156.getClass(), "delegateMap", term130157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term129989;
        callMethod(klass, "containsValue", argTypes, term129787, args);
        assertTrue(recursiveEquals(term129787, term130154));
        assertTrue(recursiveEquals(term129989, term130156));
    }

};
