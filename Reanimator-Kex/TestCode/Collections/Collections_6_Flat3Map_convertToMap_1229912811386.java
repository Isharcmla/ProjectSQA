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

public class Flat3Map_convertToMap_1229912811386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66699;
     Object term67522;

    public Flat3Map_convertToMap_1229912811386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66699 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term66809 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term66903 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object term67013 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term67079 = newInstance(Class.forName("java.util.regex.Pattern$StartS"));
        Object term67117 = newInstance(Class.forName("java.lang.Object"));
        setField(term66699, term66699.getClass(), "delegateMap", term66809);
        setIntField(term66699, term66699.getClass(), "size", 3);
        setField(term66699, term66699.getClass(), "key3", null);
        setField(term66699, term66699.getClass(), "value3", term66903);
        setField(term66699, term66699.getClass(), "key2", null);
        setField(term66699, term66699.getClass(), "value2", term67013);
        setField(term66699, term66699.getClass(), "key1", term67079);
        setField(term66699, term66699.getClass(), "value1", term67117);
        term67522 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term67523 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term67524 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term67525 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term67526 = newInstance(Class.forName("java.lang.Object"));
        Object term67527 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term67528 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term67529 = newInstance(Class.forName("java.util.regex.Pattern$StartS"));
        Object term67530 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term67522, term67522.getClass(), "size", 0);
        setIntField(term67522, term67522.getClass(), "hash1", 0);
        setIntField(term67522, term67522.getClass(), "hash2", 0);
        setIntField(term67522, term67522.getClass(), "hash3", 0);
        setField(term67522, term67522.getClass(), "key1", null);
        setField(term67522, term67522.getClass(), "key2", null);
        setField(term67522, term67522.getClass(), "key3", null);
        setField(term67522, term67522.getClass(), "value1", null);
        setField(term67522, term67522.getClass(), "value2", null);
        setField(term67522, term67522.getClass(), "value3", null);
        setFloatField(term67523, term67523.getClass(), "loadFactor", 0.75F);
        setIntField(term67523, term67523.getClass(), "size", 2);
        setField(term67525, term67525.getClass(), "next", null);
        setField(term67525, term67525.getClass(), "key", term67526);
        setFloatField(term67527, term67527.getClass(), "loadFactor", 0.0F);
        setIntField(term67527, term67527.getClass(), "size", 0);
        setField(term67527, term67527.getClass(), "data", null);
        setIntField(term67527, term67527.getClass(), "threshold", 0);
        setIntField(term67527, term67527.getClass(), "modCount", 0);
        setField(term67527, term67527.getClass(), "entrySet", null);
        setField(term67527, term67527.getClass(), "keySet", null);
        setField(term67527, term67527.getClass(), "values", null);
        setField(term67527, term67527.getClass(), "keySet", null);
        setField(term67527, term67527.getClass(), "values", null);
        setField(term67525, term67525.getClass(), "value", term67527);
        setElement(term67524, 5, term67525);
        setField(term67528, term67528.getClass(), "next", null);
        setIntField(term67529, term67529.getClass(), "minLength", 0);
        setField(term67529, term67529.getClass(), "next", null);
        setField(term67528, term67528.getClass(), "key", term67529);
        setField(term67528, term67528.getClass(), "value", term67530);
        setElement(term67524, 11, term67528);
        setField(term67523, term67523.getClass(), "data", term67524);
        setIntField(term67523, term67523.getClass(), "threshold", 12);
        setIntField(term67523, term67523.getClass(), "modCount", 2);
        setField(term67523, term67523.getClass(), "entrySet", null);
        setField(term67523, term67523.getClass(), "keySet", null);
        setField(term67523, term67523.getClass(), "values", null);
        setField(term67523, term67523.getClass(), "keySet", null);
        setField(term67523, term67523.getClass(), "values", null);
        setField(term67522, term67522.getClass(), "delegateMap", term67523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term66699, args);
        assertTrue(recursiveEquals(term66699, term67522));
    }

};


