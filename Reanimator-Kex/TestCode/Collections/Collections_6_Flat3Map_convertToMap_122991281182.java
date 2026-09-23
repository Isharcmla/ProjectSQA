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

public class Flat3Map_convertToMap_122991281182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16945;
     Object term17283;

    public Flat3Map_convertToMap_122991281182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16945 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term17055 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term16945, term16945.getClass(), "delegateMap", term17055);
        setIntField(term16945, term16945.getClass(), "size", 3);
        term17283 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term17284 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term17285 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term17286 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term17287 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term17283, term17283.getClass(), "size", 0);
        setIntField(term17283, term17283.getClass(), "hash1", 0);
        setIntField(term17283, term17283.getClass(), "hash2", 0);
        setIntField(term17283, term17283.getClass(), "hash3", 0);
        setField(term17283, term17283.getClass(), "key1", null);
        setField(term17283, term17283.getClass(), "key2", null);
        setField(term17283, term17283.getClass(), "key3", null);
        setField(term17283, term17283.getClass(), "value1", null);
        setField(term17283, term17283.getClass(), "value2", null);
        setField(term17283, term17283.getClass(), "value3", null);
        setFloatField(term17284, term17284.getClass(), "loadFactor", 0.75F);
        setIntField(term17284, term17284.getClass(), "size", 1);
        setField(term17286, term17286.getClass(), "next", null);
        setField(term17286, term17286.getClass(), "key", term17287);
        setField(term17286, term17286.getClass(), "value", null);
        setElement(term17285, 5, term17286);
        setField(term17284, term17284.getClass(), "data", term17285);
        setIntField(term17284, term17284.getClass(), "threshold", 12);
        setIntField(term17284, term17284.getClass(), "modCount", 1);
        setField(term17284, term17284.getClass(), "entrySet", null);
        setField(term17284, term17284.getClass(), "keySet", null);
        setField(term17284, term17284.getClass(), "values", null);
        setField(term17284, term17284.getClass(), "keySet", null);
        setField(term17284, term17284.getClass(), "values", null);
        setField(term17283, term17283.getClass(), "delegateMap", term17284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term16945, args);
        assertTrue(recursiveEquals(term16945, term17283));
    }

};


