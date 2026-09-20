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

public class Flat3Map_put_1944740725755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152852;
     Object term153371;

    public Flat3Map_put_1944740725755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152852 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term152944 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term153036 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term153128 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term152852, term152852.getClass(), "delegateMap", null);
        setIntField(term152852, term152852.getClass(), "size", 3);
        setField(term152852, term152852.getClass(), "key3", term152944);
        setField(term152852, term152852.getClass(), "key2", term153036);
        setField(term152852, term152852.getClass(), "key1", term153128);
        term153371 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term153372 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term153373 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term153374 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term153375 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term153376 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term153371, term153371.getClass(), "size", 0);
        setIntField(term153371, term153371.getClass(), "hash1", 0);
        setIntField(term153371, term153371.getClass(), "hash2", 0);
        setIntField(term153371, term153371.getClass(), "hash3", 0);
        setField(term153371, term153371.getClass(), "key1", null);
        setField(term153371, term153371.getClass(), "key2", null);
        setField(term153371, term153371.getClass(), "key3", null);
        setField(term153371, term153371.getClass(), "value1", null);
        setField(term153371, term153371.getClass(), "value2", null);
        setField(term153371, term153371.getClass(), "value3", null);
        setFloatField(term153372, term153372.getClass(), "loadFactor", 0.75F);
        setIntField(term153372, term153372.getClass(), "size", 2);
        setField(term153375, term153375.getClass(), "next", null);
        setField(term153375, term153375.getClass(), "key", null);
        setField(term153375, term153375.getClass(), "value", null);
        setField(term153374, term153374.getClass(), "next", term153375);
        setField(term153374, term153374.getClass(), "key", term153376);
        setField(term153374, term153374.getClass(), "value", null);
        setElement(term153373, 0, term153374);
        setField(term153372, term153372.getClass(), "data", term153373);
        setIntField(term153372, term153372.getClass(), "threshold", 12);
        setIntField(term153372, term153372.getClass(), "modCount", 2);
        setField(term153372, term153372.getClass(), "entrySet", null);
        setField(term153372, term153372.getClass(), "keySet", null);
        setField(term153372, term153372.getClass(), "values", null);
        setField(term153372, term153372.getClass(), "keySet", null);
        setField(term153372, term153372.getClass(), "values", null);
        setField(term153371, term153371.getClass(), "delegateMap", term153372);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term152852, args);
        assertTrue(recursiveEquals(term152852, term153371));
        assertTrue(recursiveEquals(retValue, null));
    }

};
