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

public class Flat3Map_put_1944740725423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75516;
     Object term75929;
     Object term75931;

    public Flat3Map_put_1944740725423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75516 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term75571 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term75516, term75516.getClass(), "delegateMap", null);
        setIntField(term75516, term75516.getClass(), "size", 1);
        setIntField(term75516, term75516.getClass(), "hash1", 0);
        setIntField(term75571, term75571.getClass(), "size", 0);
        setField(term75516, term75516.getClass(), "value1", term75571);
        term75929 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term75930 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term75929, term75929.getClass(), "size", 2);
        setIntField(term75929, term75929.getClass(), "hash1", 0);
        setIntField(term75929, term75929.getClass(), "hash2", 0);
        setIntField(term75929, term75929.getClass(), "hash3", 0);
        setField(term75929, term75929.getClass(), "key1", null);
        setField(term75929, term75929.getClass(), "key2", term75929);
        setField(term75929, term75929.getClass(), "key3", null);
        setFloatField(term75930, term75930.getClass(), "loadFactor", 0.0F);
        setIntField(term75930, term75930.getClass(), "size", 0);
        setField(term75930, term75930.getClass(), "data", null);
        setIntField(term75930, term75930.getClass(), "threshold", 0);
        setIntField(term75930, term75930.getClass(), "modCount", 0);
        setField(term75930, term75930.getClass(), "entrySet", null);
        setField(term75930, term75930.getClass(), "keySet", null);
        setField(term75930, term75930.getClass(), "values", null);
        setField(term75930, term75930.getClass(), "keySet", null);
        setField(term75930, term75930.getClass(), "values", null);
        setField(term75929, term75929.getClass(), "value1", term75930);
        setField(term75929, term75929.getClass(), "value2", null);
        setField(term75929, term75929.getClass(), "value3", null);
        setField(term75929, term75929.getClass(), "delegateMap", null);
        term75931 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term75932 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term75931, term75931.getClass(), "size", 2);
        setIntField(term75931, term75931.getClass(), "hash1", 0);
        setIntField(term75931, term75931.getClass(), "hash2", 0);
        setIntField(term75931, term75931.getClass(), "hash3", 0);
        setField(term75931, term75931.getClass(), "key1", null);
        setField(term75931, term75931.getClass(), "key2", term75931);
        setField(term75931, term75931.getClass(), "key3", null);
        setFloatField(term75932, term75932.getClass(), "loadFactor", 0.0F);
        setIntField(term75932, term75932.getClass(), "size", 0);
        setField(term75932, term75932.getClass(), "data", null);
        setIntField(term75932, term75932.getClass(), "threshold", 0);
        setIntField(term75932, term75932.getClass(), "modCount", 0);
        setField(term75932, term75932.getClass(), "entrySet", null);
        setField(term75932, term75932.getClass(), "keySet", null);
        setField(term75932, term75932.getClass(), "values", null);
        setField(term75932, term75932.getClass(), "keySet", null);
        setField(term75932, term75932.getClass(), "values", null);
        setField(term75931, term75931.getClass(), "value1", term75932);
        setField(term75931, term75931.getClass(), "value2", null);
        setField(term75931, term75931.getClass(), "value3", null);
        setField(term75931, term75931.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term75516;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term75516, args);
        assertTrue(recursiveEquals(term75516, term75929));
        assertTrue(recursiveEquals(term75516, term75931));
        assertTrue(recursiveEquals(retValue, null));
    }

};


