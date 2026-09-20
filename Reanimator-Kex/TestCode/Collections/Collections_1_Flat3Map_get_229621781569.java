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

public class Flat3Map_get_229621781569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109052;
     Object term109182;
     Object term109359;
     Object term109361;

    public Flat3Map_get_229621781569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109052 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term109090 = newInstance(Class.forName("java.lang.Object"));
        setField(term109052, term109052.getClass(), "delegateMap", null);
        setIntField(term109052, term109052.getClass(), "size", 2);
        setIntField(term109052, term109052.getClass(), "hash2", 0);
        setField(term109052, term109052.getClass(), "key2", term109090);
        setField(term109052, term109052.getClass(), "key1", term109090);
        term109182 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term109292 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term109182, term109182.getClass(), "delegateMap", null);
        setIntField(term109182, term109182.getClass(), "size", 2);
        setIntField(term109182, term109182.getClass(), "hash2", 0);
        setField(term109182, term109182.getClass(), "value2", null);
        setIntField(term109182, term109182.getClass(), "hash1", 0);
        setIntField(term109292, term109292.getClass(), "size", 0);
        setField(term109182, term109182.getClass(), "value1", term109292);
        setField(term109182, term109182.getClass(), "key2", null);
        term109359 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term109360 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term109359, term109359.getClass(), "size", 2);
        setIntField(term109359, term109359.getClass(), "hash1", 0);
        setIntField(term109359, term109359.getClass(), "hash2", 0);
        setIntField(term109359, term109359.getClass(), "hash3", 0);
        setField(term109359, term109359.getClass(), "key1", term109360);
        setField(term109359, term109359.getClass(), "key2", term109360);
        setField(term109359, term109359.getClass(), "key3", null);
        setField(term109359, term109359.getClass(), "value1", null);
        setField(term109359, term109359.getClass(), "value2", null);
        setField(term109359, term109359.getClass(), "value3", null);
        setField(term109359, term109359.getClass(), "delegateMap", null);
        term109361 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term109362 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term109361, term109361.getClass(), "size", 2);
        setIntField(term109361, term109361.getClass(), "hash1", 0);
        setIntField(term109361, term109361.getClass(), "hash2", 0);
        setIntField(term109361, term109361.getClass(), "hash3", 0);
        setField(term109361, term109361.getClass(), "key1", null);
        setField(term109361, term109361.getClass(), "key2", null);
        setField(term109361, term109361.getClass(), "key3", null);
        setFloatField(term109362, term109362.getClass(), "loadFactor", 0.0F);
        setIntField(term109362, term109362.getClass(), "size", 0);
        setField(term109362, term109362.getClass(), "data", null);
        setIntField(term109362, term109362.getClass(), "threshold", 0);
        setIntField(term109362, term109362.getClass(), "modCount", 0);
        setField(term109362, term109362.getClass(), "entrySet", null);
        setField(term109362, term109362.getClass(), "keySet", null);
        setField(term109362, term109362.getClass(), "values", null);
        setField(term109362, term109362.getClass(), "keySet", null);
        setField(term109362, term109362.getClass(), "values", null);
        setField(term109361, term109361.getClass(), "value1", term109362);
        setField(term109361, term109361.getClass(), "value2", null);
        setField(term109361, term109361.getClass(), "value3", null);
        setField(term109361, term109361.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term109182;
        Object retValue = callMethod(klass, "get", argTypes, term109052, args);
        assertTrue(recursiveEquals(term109052, term109359));
        assertTrue(recursiveEquals(term109182, term109361));
        assertTrue(recursiveEquals(retValue, null));
    }

};
