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

public class Flat3Map_convertToMap_12299128111122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227126;
     Object term229539;

    public Flat3Map_convertToMap_12299128111122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227126 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term227236 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term227366 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setField(term227126, term227126.getClass(), "delegateMap", term227236);
        setIntField(term227126, term227126.getClass(), "size", 2);
        setField(term227126, term227126.getClass(), "key2", null);
        setField(term227126, term227126.getClass(), "value2", null);
        setField(term227126, term227126.getClass(), "key1", null);
        setField(term227126, term227126.getClass(), "value1", term227366);
        term229539 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term229540 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term229541 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term229542 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term229543 = newInstance(Class.forName("java.lang.Object"));
        Object term229544 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term229539, term229539.getClass(), "size", 0);
        setIntField(term229539, term229539.getClass(), "hash1", 0);
        setIntField(term229539, term229539.getClass(), "hash2", 0);
        setIntField(term229539, term229539.getClass(), "hash3", 0);
        setField(term229539, term229539.getClass(), "key1", null);
        setField(term229539, term229539.getClass(), "key2", null);
        setField(term229539, term229539.getClass(), "key3", null);
        setField(term229539, term229539.getClass(), "value1", null);
        setField(term229539, term229539.getClass(), "value2", null);
        setField(term229539, term229539.getClass(), "value3", null);
        setFloatField(term229540, term229540.getClass(), "loadFactor", 0.75F);
        setIntField(term229540, term229540.getClass(), "size", 1);
        setField(term229542, term229542.getClass(), "next", null);
        setField(term229542, term229542.getClass(), "key", term229543);
        setField(term229544, term229544.getClass(), "next", null);
        setField(term229544, term229544.getClass(), "key", null);
        setField(term229544, term229544.getClass(), "value", null);
        setField(term229542, term229542.getClass(), "value", term229544);
        setElement(term229541, 0, term229542);
        setField(term229540, term229540.getClass(), "data", term229541);
        setIntField(term229540, term229540.getClass(), "threshold", 12);
        setIntField(term229540, term229540.getClass(), "modCount", 1);
        setField(term229540, term229540.getClass(), "entrySet", null);
        setField(term229540, term229540.getClass(), "keySet", null);
        setField(term229540, term229540.getClass(), "values", null);
        setField(term229540, term229540.getClass(), "keySet", null);
        setField(term229540, term229540.getClass(), "values", null);
        setField(term229539, term229539.getClass(), "delegateMap", term229540);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term227126, args);
        assertTrue(recursiveEquals(term227126, term229539));
    }

};
