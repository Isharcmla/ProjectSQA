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

public class Flat3Map_put_19447407251170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360300;
     Object term360598;
     Object term362062;
     Object term362071;

    public Flat3Map_put_19447407251170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term360300 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term360392 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term360506 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyIterator"));
        setField(term360300, term360300.getClass(), "delegateMap", null);
        setIntField(term360300, term360300.getClass(), "size", 3);
        setIntField(term360300, term360300.getClass(), "hash3", 0);
        setField(term360300, term360300.getClass(), "key3", null);
        setIntField(term360300, term360300.getClass(), "hash2", 0);
        setField(term360300, term360300.getClass(), "key2", null);
        setIntField(term360300, term360300.getClass(), "hash1", 0);
        setField(term360392, term360392.getClass(), "delegateMap", null);
        setIntField(term360392, term360392.getClass(), "size", 3);
        setField(term360392, term360392.getClass(), "key3", term360506);
        setField(term360392, term360392.getClass(), "key2", null);
        setField(term360392, term360392.getClass(), "value2", null);
        setIntField(term360392, term360392.getClass(), "hash3", -1);
        setIntField(term360392, term360392.getClass(), "hash2", -1);
        setIntField(term360392, term360392.getClass(), "hash1", 0);
        setField(term360300, term360300.getClass(), "key1", term360392);
        term360598 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term360708 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term360748 = newInstance(Class.forName("java.util.CollSer"));
        setField(term360598, term360598.getClass(), "delegateMap", null);
        setIntField(term360598, term360598.getClass(), "size", 3);
        setIntField(term360598, term360598.getClass(), "hash3", 0);
        setField(term360598, term360598.getClass(), "value3", null);
        setIntField(term360598, term360598.getClass(), "hash2", 0);
        setIntField(term360708, term360708.getClass(), "size", 0);
        setField(term360598, term360598.getClass(), "value2", term360708);
        setIntField(term360598, term360598.getClass(), "hash1", 0);
        setField(term360598, term360598.getClass(), "value1", null);
        setField(term360598, term360598.getClass(), "key3", null);
        setField(term360598, term360598.getClass(), "key2", term360748);
        term362062 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term362063 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term362064 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term362065 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term362066 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term362067 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term362068 = newInstance(Class.forName("java.lang.Object"));
        Object term362069 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term362070 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term362062, term362062.getClass(), "size", 0);
        setIntField(term362062, term362062.getClass(), "hash1", 0);
        setIntField(term362062, term362062.getClass(), "hash2", 0);
        setIntField(term362062, term362062.getClass(), "hash3", 0);
        setField(term362062, term362062.getClass(), "key1", null);
        setField(term362062, term362062.getClass(), "key2", null);
        setField(term362062, term362062.getClass(), "key3", null);
        setField(term362062, term362062.getClass(), "value1", null);
        setField(term362062, term362062.getClass(), "value2", null);
        setField(term362062, term362062.getClass(), "value3", null);
        setFloatField(term362063, term362063.getClass(), "loadFactor", 0.75F);
        setIntField(term362063, term362063.getClass(), "size", 3);
        setField(term362065, term362065.getClass(), "next", null);
        setIntField(term362066, term362066.getClass(), "size", 3);
        setIntField(term362066, term362066.getClass(), "hash1", 0);
        setIntField(term362066, term362066.getClass(), "hash2", 0);
        setIntField(term362066, term362066.getClass(), "hash3", 0);
        setField(term362066, term362066.getClass(), "key1", null);
        setField(term362066, term362066.getClass(), "key2", null);
        setField(term362066, term362066.getClass(), "key3", null);
        setField(term362066, term362066.getClass(), "value1", null);
        setField(term362066, term362066.getClass(), "value2", null);
        setField(term362066, term362066.getClass(), "value3", null);
        setField(term362066, term362066.getClass(), "delegateMap", null);
        setField(term362065, term362065.getClass(), "key", term362066);
        setField(term362065, term362065.getClass(), "value", null);
        setElement(term362064, 0, term362065);
        setField(term362067, term362067.getClass(), "next", null);
        setField(term362067, term362067.getClass(), "key", term362068);
        setField(term362067, term362067.getClass(), "value", null);
        setElement(term362064, 6, term362067);
        setField(term362069, term362069.getClass(), "next", null);
        setIntField(term362070, term362070.getClass(), "size", 3);
        setIntField(term362070, term362070.getClass(), "hash1", 0);
        setIntField(term362070, term362070.getClass(), "hash2", -1);
        setIntField(term362070, term362070.getClass(), "hash3", -1);
        setField(term362070, term362070.getClass(), "key1", null);
        setField(term362070, term362070.getClass(), "key2", null);
        setField(term362070, term362070.getClass(), "key3", null);
        setField(term362070, term362070.getClass(), "value1", null);
        setField(term362070, term362070.getClass(), "value2", null);
        setField(term362070, term362070.getClass(), "value3", null);
        setField(term362070, term362070.getClass(), "delegateMap", null);
        setField(term362069, term362069.getClass(), "key", term362070);
        setField(term362069, term362069.getClass(), "value", null);
        setElement(term362064, 13, term362069);
        setField(term362063, term362063.getClass(), "data", term362064);
        setIntField(term362063, term362063.getClass(), "threshold", 12);
        setIntField(term362063, term362063.getClass(), "modCount", 3);
        setField(term362063, term362063.getClass(), "entrySet", null);
        setField(term362063, term362063.getClass(), "keySet", null);
        setField(term362063, term362063.getClass(), "values", null);
        setField(term362063, term362063.getClass(), "keySet", null);
        setField(term362063, term362063.getClass(), "values", null);
        setField(term362062, term362062.getClass(), "delegateMap", term362063);
        term362071 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term362071, term362071.getClass(), "size", 3);
        setIntField(term362071, term362071.getClass(), "hash1", 0);
        setIntField(term362071, term362071.getClass(), "hash2", 0);
        setIntField(term362071, term362071.getClass(), "hash3", 0);
        setField(term362071, term362071.getClass(), "key1", null);
        setField(term362071, term362071.getClass(), "key2", null);
        setField(term362071, term362071.getClass(), "key3", null);
        setField(term362071, term362071.getClass(), "value1", null);
        setField(term362071, term362071.getClass(), "value2", null);
        setField(term362071, term362071.getClass(), "value3", null);
        setField(term362071, term362071.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term360598;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term360300, args);
        assertTrue(recursiveEquals(term360300, term362062));
        assertTrue(recursiveEquals(term360598, term362071));
        assertTrue(recursiveEquals(retValue, null));
    }

};


