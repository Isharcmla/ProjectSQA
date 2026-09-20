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

public class Flat3Map_convertToMap_1229912811303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54003;
     Object term54577;

    public Flat3Map_convertToMap_1229912811303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54003 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term54113 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term54205 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term54335 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term54429 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setField(term54003, term54003.getClass(), "delegateMap", term54113);
        setIntField(term54003, term54003.getClass(), "size", 2);
        setField(term54205, term54205.getClass(), "delegateMap", null);
        setIntField(term54205, term54205.getClass(), "size", 0);
        setField(term54003, term54003.getClass(), "key2", term54205);
        setField(term54003, term54003.getClass(), "value2", term54335);
        setField(term54003, term54003.getClass(), "key1", null);
        setField(term54003, term54003.getClass(), "value1", term54429);
        term54577 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term54578 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term54579 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term54580 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term54581 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term54582 = newInstance(Class.forName("java.lang.Object"));
        Object term54583 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setIntField(term54577, term54577.getClass(), "size", 0);
        setIntField(term54577, term54577.getClass(), "hash1", 0);
        setIntField(term54577, term54577.getClass(), "hash2", 0);
        setIntField(term54577, term54577.getClass(), "hash3", 0);
        setField(term54577, term54577.getClass(), "key1", null);
        setField(term54577, term54577.getClass(), "key2", null);
        setField(term54577, term54577.getClass(), "key3", null);
        setField(term54577, term54577.getClass(), "value1", null);
        setField(term54577, term54577.getClass(), "value2", null);
        setField(term54577, term54577.getClass(), "value3", null);
        setFloatField(term54578, term54578.getClass(), "loadFactor", 0.75F);
        setIntField(term54578, term54578.getClass(), "size", 2);
        setField(term54581, term54581.getClass(), "next", null);
        setField(term54581, term54581.getClass(), "key", null);
        setField(term54581, term54581.getClass(), "value", null);
        setField(term54580, term54580.getClass(), "next", term54581);
        setField(term54580, term54580.getClass(), "key", term54582);
        setFloatField(term54583, term54583.getClass(), "loadFactor", 0.0F);
        setIntField(term54583, term54583.getClass(), "size", 0);
        setField(term54583, term54583.getClass(), "data", null);
        setIntField(term54583, term54583.getClass(), "threshold", 0);
        setIntField(term54583, term54583.getClass(), "modCount", 0);
        setField(term54583, term54583.getClass(), "entrySet", null);
        setField(term54583, term54583.getClass(), "keySet", null);
        setField(term54583, term54583.getClass(), "values", null);
        setField(term54583, term54583.getClass(), "keySet", null);
        setField(term54583, term54583.getClass(), "values", null);
        setField(term54580, term54580.getClass(), "value", term54583);
        setElement(term54579, 0, term54580);
        setField(term54578, term54578.getClass(), "data", term54579);
        setIntField(term54578, term54578.getClass(), "threshold", 12);
        setIntField(term54578, term54578.getClass(), "modCount", 2);
        setField(term54578, term54578.getClass(), "entrySet", null);
        setField(term54578, term54578.getClass(), "keySet", null);
        setField(term54578, term54578.getClass(), "values", null);
        setField(term54578, term54578.getClass(), "keySet", null);
        setField(term54578, term54578.getClass(), "values", null);
        setField(term54577, term54577.getClass(), "delegateMap", term54578);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term54003, args);
        assertTrue(recursiveEquals(term54003, term54577));
    }

};
