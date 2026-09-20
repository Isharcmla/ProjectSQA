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

public class Flat3Map_containsKey_760925101123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227496;
     Object term227666;
     Object term229574;
     Object term229577;

    public Flat3Map_containsKey_760925101123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227496 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term227606 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term227370 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 492);
        setField(term227606, term227606.getClass(), "data", term227370);
        setField(term227496, term227496.getClass(), "delegateMap", term227606);
        term227666 = newInstance(Class.forName("java.io.ObjectInputStream$1"));
        term229574 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term229575 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term229576 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 492);
        setIntField(term229574, term229574.getClass(), "size", 0);
        setIntField(term229574, term229574.getClass(), "hash1", 0);
        setIntField(term229574, term229574.getClass(), "hash2", 0);
        setIntField(term229574, term229574.getClass(), "hash3", 0);
        setField(term229574, term229574.getClass(), "key1", null);
        setField(term229574, term229574.getClass(), "key2", null);
        setField(term229574, term229574.getClass(), "key3", null);
        setField(term229574, term229574.getClass(), "value1", null);
        setField(term229574, term229574.getClass(), "value2", null);
        setField(term229574, term229574.getClass(), "value3", null);
        setFloatField(term229575, term229575.getClass(), "loadFactor", 0.0F);
        setIntField(term229575, term229575.getClass(), "size", 0);
        setField(term229575, term229575.getClass(), "data", term229576);
        setIntField(term229575, term229575.getClass(), "threshold", 0);
        setIntField(term229575, term229575.getClass(), "modCount", 0);
        setField(term229575, term229575.getClass(), "entrySet", null);
        setField(term229575, term229575.getClass(), "keySet", null);
        setField(term229575, term229575.getClass(), "values", null);
        setField(term229575, term229575.getClass(), "keySet", null);
        setField(term229575, term229575.getClass(), "values", null);
        setField(term229574, term229574.getClass(), "delegateMap", term229575);
        term229577 = newInstance(Class.forName("java.io.ObjectInputStream$1"));
        setField(term229577, term229577.getClass(), "val$subcl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term227666;
        callMethod(klass, "containsKey", argTypes, term227496, args);
        assertTrue(recursiveEquals(term227496, term229574));
        assertTrue(recursiveEquals(term227666, term229577));
    }

};
