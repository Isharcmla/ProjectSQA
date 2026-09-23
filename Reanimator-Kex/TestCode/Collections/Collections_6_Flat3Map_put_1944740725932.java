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

public class Flat3Map_put_1944740725932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250400;
     Object term250530;
     Object term251342;
     Object term251351;

    public Flat3Map_put_1944740725932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250400 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term250438 = newInstance(Class.forName("java.lang.Object"));
        setField(term250400, term250400.getClass(), "delegateMap", null);
        setIntField(term250400, term250400.getClass(), "size", 3);
        setIntField(term250400, term250400.getClass(), "hash3", 0);
        setField(term250400, term250400.getClass(), "key3", term250438);
        setField(term250400, term250400.getClass(), "key2", null);
        setField(term250400, term250400.getClass(), "value2", term250438);
        term250530 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term250640 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term250530, term250530.getClass(), "delegateMap", null);
        setIntField(term250530, term250530.getClass(), "size", 3);
        setIntField(term250530, term250530.getClass(), "hash3", 0);
        setField(term250530, term250530.getClass(), "value3", null);
        setIntField(term250530, term250530.getClass(), "hash2", 0);
        setIntField(term250640, term250640.getClass(), "size", 0);
        setField(term250530, term250530.getClass(), "value2", term250640);
        setIntField(term250530, term250530.getClass(), "hash1", 0);
        setField(term250530, term250530.getClass(), "value1", null);
        setField(term250530, term250530.getClass(), "key3", null);
        term251342 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term251343 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term251344 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term251345 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term251346 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term251347 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term251348 = newInstance(Class.forName("java.lang.Object"));
        Object term251349 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term251350 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term251342, term251342.getClass(), "size", 0);
        setIntField(term251342, term251342.getClass(), "hash1", 0);
        setIntField(term251342, term251342.getClass(), "hash2", 0);
        setIntField(term251342, term251342.getClass(), "hash3", 0);
        setField(term251342, term251342.getClass(), "key1", null);
        setField(term251342, term251342.getClass(), "key2", null);
        setField(term251342, term251342.getClass(), "key3", null);
        setField(term251342, term251342.getClass(), "value1", null);
        setField(term251342, term251342.getClass(), "value2", null);
        setField(term251342, term251342.getClass(), "value3", null);
        setFloatField(term251343, term251343.getClass(), "loadFactor", 0.75F);
        setIntField(term251343, term251343.getClass(), "size", 5);
        setField(term251345, term251345.getClass(), "next", null);
        setIntField(term251346, term251346.getClass(), "size", 3);
        setIntField(term251346, term251346.getClass(), "hash1", 0);
        setIntField(term251346, term251346.getClass(), "hash2", 0);
        setIntField(term251346, term251346.getClass(), "hash3", 0);
        setField(term251346, term251346.getClass(), "key1", null);
        setField(term251346, term251346.getClass(), "key2", null);
        setField(term251346, term251346.getClass(), "key3", null);
        setField(term251346, term251346.getClass(), "value1", null);
        setField(term251346, term251346.getClass(), "value2", null);
        setField(term251346, term251346.getClass(), "value3", null);
        setField(term251346, term251346.getClass(), "delegateMap", null);
        setField(term251345, term251345.getClass(), "key", term251346);
        setField(term251345, term251345.getClass(), "value", null);
        setElement(term251344, 0, term251345);
        setField(term251347, term251347.getClass(), "next", null);
        setField(term251347, term251347.getClass(), "key", term251348);
        setField(term251347, term251347.getClass(), "value", null);
        setElement(term251344, 4, term251347);
        setField(term251349, term251349.getClass(), "next", null);
        setField(term251349, term251349.getClass(), "key", term251350);
        setField(term251349, term251349.getClass(), "value", null);
        setElement(term251344, 6, term251349);
        setField(term251343, term251343.getClass(), "data", term251344);
        setIntField(term251343, term251343.getClass(), "threshold", 12);
        setIntField(term251343, term251343.getClass(), "modCount", 3);
        setField(term251343, term251343.getClass(), "entrySet", null);
        setField(term251343, term251343.getClass(), "keySet", null);
        setField(term251343, term251343.getClass(), "values", null);
        setField(term251343, term251343.getClass(), "keySet", null);
        setField(term251343, term251343.getClass(), "values", null);
        setField(term251342, term251342.getClass(), "delegateMap", term251343);
        term251351 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term251351, term251351.getClass(), "size", 3);
        setIntField(term251351, term251351.getClass(), "hash1", 0);
        setIntField(term251351, term251351.getClass(), "hash2", 0);
        setIntField(term251351, term251351.getClass(), "hash3", 0);
        setField(term251351, term251351.getClass(), "key1", null);
        setField(term251351, term251351.getClass(), "key2", null);
        setField(term251351, term251351.getClass(), "key3", null);
        setField(term251351, term251351.getClass(), "value1", null);
        setField(term251351, term251351.getClass(), "value2", null);
        setField(term251351, term251351.getClass(), "value3", null);
        setField(term251351, term251351.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term250530;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term250400, args);
        assertTrue(recursiveEquals(term250400, term251342));
        assertTrue(recursiveEquals(term250530, term251351));
        assertTrue(recursiveEquals(retValue, null));
    }

};


