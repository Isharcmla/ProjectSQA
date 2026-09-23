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

public class Flat3Map_containsValue_2053071372291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47609;
     Object term47811;
     Object term48522;
     Object term48524;

    public Flat3Map_containsValue_2053071372291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47609 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term47719 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term47609, term47609.getClass(), "delegateMap", null);
        setIntField(term47609, term47609.getClass(), "size", 3);
        setField(term47609, term47609.getClass(), "value3", term47719);
        term47811 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term47921 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term47811, term47811.getClass(), "delegateMap", term47921);
        term48522 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term48523 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term48522, term48522.getClass(), "size", 3);
        setIntField(term48522, term48522.getClass(), "hash1", 0);
        setIntField(term48522, term48522.getClass(), "hash2", 0);
        setIntField(term48522, term48522.getClass(), "hash3", 0);
        setField(term48522, term48522.getClass(), "key1", null);
        setField(term48522, term48522.getClass(), "key2", null);
        setField(term48522, term48522.getClass(), "key3", null);
        setField(term48522, term48522.getClass(), "value1", null);
        setField(term48522, term48522.getClass(), "value2", null);
        setFloatField(term48523, term48523.getClass(), "loadFactor", 0.0F);
        setIntField(term48523, term48523.getClass(), "size", 0);
        setField(term48523, term48523.getClass(), "data", null);
        setIntField(term48523, term48523.getClass(), "threshold", 0);
        setIntField(term48523, term48523.getClass(), "modCount", 0);
        setField(term48523, term48523.getClass(), "entrySet", null);
        setField(term48523, term48523.getClass(), "keySet", null);
        setField(term48523, term48523.getClass(), "values", null);
        setField(term48523, term48523.getClass(), "keySet", null);
        setField(term48523, term48523.getClass(), "values", null);
        setField(term48522, term48522.getClass(), "value3", term48523);
        setField(term48522, term48522.getClass(), "delegateMap", null);
        term48524 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term48525 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term48524, term48524.getClass(), "size", 0);
        setIntField(term48524, term48524.getClass(), "hash1", 0);
        setIntField(term48524, term48524.getClass(), "hash2", 0);
        setIntField(term48524, term48524.getClass(), "hash3", 0);
        setField(term48524, term48524.getClass(), "key1", null);
        setField(term48524, term48524.getClass(), "key2", null);
        setField(term48524, term48524.getClass(), "key3", null);
        setField(term48524, term48524.getClass(), "value1", null);
        setField(term48524, term48524.getClass(), "value2", null);
        setField(term48524, term48524.getClass(), "value3", null);
        setFloatField(term48525, term48525.getClass(), "loadFactor", 0.0F);
        setIntField(term48525, term48525.getClass(), "size", 0);
        setField(term48525, term48525.getClass(), "data", null);
        setIntField(term48525, term48525.getClass(), "threshold", 0);
        setIntField(term48525, term48525.getClass(), "modCount", 0);
        setField(term48525, term48525.getClass(), "entrySet", null);
        setField(term48525, term48525.getClass(), "keySet", null);
        setField(term48525, term48525.getClass(), "values", null);
        setField(term48525, term48525.getClass(), "keySet", null);
        setField(term48525, term48525.getClass(), "values", null);
        setField(term48524, term48524.getClass(), "delegateMap", term48525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term47811;
        callMethod(klass, "containsValue", argTypes, term47609, args);
        assertTrue(recursiveEquals(term47609, term48522));
        assertTrue(recursiveEquals(term47811, term48524));
    }

};


