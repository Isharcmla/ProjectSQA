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

public class Flat3Map_put_1944740725451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82187;
     Object term82515;
     Object term82522;

    public Flat3Map_put_1944740725451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82187 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term82222 = newInstance(Class.forName("java.lang.Runtime$VersionPattern"));
        setField(term82187, term82187.getClass(), "delegateMap", null);
        setIntField(term82187, term82187.getClass(), "size", 3);
        setIntField(term82187, term82187.getClass(), "hash3", -1);
        setField(term82187, term82187.getClass(), "value3", null);
        setIntField(term82187, term82187.getClass(), "hash2", -1);
        setField(term82187, term82187.getClass(), "value2", null);
        setIntField(term82187, term82187.getClass(), "hash1", 0);
        setField(term82187, term82187.getClass(), "value1", term82222);
        term82515 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term82516 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term82517 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term82518 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term82519 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term82520 = newInstance(Class.forName("java.lang.Object"));
        Object term82521 = newInstance(Class.forName("java.lang.Runtime$VersionPattern"));
        setIntField(term82515, term82515.getClass(), "size", 0);
        setIntField(term82515, term82515.getClass(), "hash1", 0);
        setIntField(term82515, term82515.getClass(), "hash2", 0);
        setIntField(term82515, term82515.getClass(), "hash3", 0);
        setField(term82515, term82515.getClass(), "key1", null);
        setField(term82515, term82515.getClass(), "key2", null);
        setField(term82515, term82515.getClass(), "key3", null);
        setField(term82515, term82515.getClass(), "value1", null);
        setField(term82515, term82515.getClass(), "value2", null);
        setField(term82515, term82515.getClass(), "value3", null);
        setFloatField(term82516, term82516.getClass(), "loadFactor", 0.75F);
        setIntField(term82516, term82516.getClass(), "size", 2);
        setField(term82518, term82518.getClass(), "next", null);
        setField(term82518, term82518.getClass(), "key", term82515);
        setField(term82518, term82518.getClass(), "value", null);
        setElement(term82517, 2, term82518);
        setField(term82519, term82519.getClass(), "next", null);
        setField(term82519, term82519.getClass(), "key", term82520);
        setField(term82519, term82519.getClass(), "value", term82521);
        setElement(term82517, 5, term82519);
        setField(term82516, term82516.getClass(), "data", term82517);
        setIntField(term82516, term82516.getClass(), "threshold", 12);
        setIntField(term82516, term82516.getClass(), "modCount", 2);
        setField(term82516, term82516.getClass(), "entrySet", null);
        setField(term82516, term82516.getClass(), "keySet", null);
        setField(term82516, term82516.getClass(), "values", null);
        setField(term82516, term82516.getClass(), "keySet", null);
        setField(term82516, term82516.getClass(), "values", null);
        setField(term82515, term82515.getClass(), "delegateMap", term82516);
        term82522 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term82523 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term82524 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term82525 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term82526 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term82527 = newInstance(Class.forName("java.lang.Object"));
        Object term82528 = newInstance(Class.forName("java.lang.Runtime$VersionPattern"));
        setIntField(term82522, term82522.getClass(), "size", 0);
        setIntField(term82522, term82522.getClass(), "hash1", 0);
        setIntField(term82522, term82522.getClass(), "hash2", 0);
        setIntField(term82522, term82522.getClass(), "hash3", 0);
        setField(term82522, term82522.getClass(), "key1", null);
        setField(term82522, term82522.getClass(), "key2", null);
        setField(term82522, term82522.getClass(), "key3", null);
        setField(term82522, term82522.getClass(), "value1", null);
        setField(term82522, term82522.getClass(), "value2", null);
        setField(term82522, term82522.getClass(), "value3", null);
        setFloatField(term82523, term82523.getClass(), "loadFactor", 0.75F);
        setIntField(term82523, term82523.getClass(), "size", 2);
        setField(term82525, term82525.getClass(), "next", null);
        setField(term82525, term82525.getClass(), "key", term82522);
        setField(term82525, term82525.getClass(), "value", null);
        setElement(term82524, 2, term82525);
        setField(term82526, term82526.getClass(), "next", null);
        setField(term82526, term82526.getClass(), "key", term82527);
        setField(term82526, term82526.getClass(), "value", term82528);
        setElement(term82524, 5, term82526);
        setField(term82523, term82523.getClass(), "data", term82524);
        setIntField(term82523, term82523.getClass(), "threshold", 12);
        setIntField(term82523, term82523.getClass(), "modCount", 2);
        setField(term82523, term82523.getClass(), "entrySet", null);
        setField(term82523, term82523.getClass(), "keySet", null);
        setField(term82523, term82523.getClass(), "values", null);
        setField(term82523, term82523.getClass(), "keySet", null);
        setField(term82523, term82523.getClass(), "values", null);
        setField(term82522, term82522.getClass(), "delegateMap", term82523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term82187;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term82187, args);
        assertTrue(recursiveEquals(term82187, term82515));
        assertTrue(recursiveEquals(term82187, term82522));
        assertTrue(recursiveEquals(retValue, null));
    }

};


