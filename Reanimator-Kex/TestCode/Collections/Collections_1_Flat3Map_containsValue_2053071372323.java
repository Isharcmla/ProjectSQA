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

public class Flat3Map_containsValue_2053071372323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58275;
     Object term58358;
     Object term58360;

    public Flat3Map_containsValue_2053071372323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58275 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term58321 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term58275, term58275.getClass(), "delegateMap", null);
        setIntField(term58275, term58275.getClass(), "size", 2);
        setField(term58275, term58275.getClass(), "value2", term58321);
        term58358 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term58359 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term58358, term58358.getClass(), "size", 2);
        setIntField(term58358, term58358.getClass(), "hash1", 0);
        setIntField(term58358, term58358.getClass(), "hash2", 0);
        setIntField(term58358, term58358.getClass(), "hash3", 0);
        setField(term58358, term58358.getClass(), "key1", null);
        setField(term58358, term58358.getClass(), "key2", null);
        setField(term58358, term58358.getClass(), "key3", null);
        setField(term58358, term58358.getClass(), "value1", null);
        setIntField(term58359, term58359.getClass(), "size", 0);
        setIntField(term58359, term58359.getClass(), "hash1", 0);
        setIntField(term58359, term58359.getClass(), "hash2", 0);
        setIntField(term58359, term58359.getClass(), "hash3", 0);
        setField(term58359, term58359.getClass(), "key1", null);
        setField(term58359, term58359.getClass(), "key2", null);
        setField(term58359, term58359.getClass(), "key3", null);
        setField(term58359, term58359.getClass(), "value1", null);
        setField(term58359, term58359.getClass(), "value2", null);
        setField(term58359, term58359.getClass(), "value3", null);
        setField(term58359, term58359.getClass(), "delegateMap", null);
        setField(term58358, term58358.getClass(), "value2", term58359);
        setField(term58358, term58358.getClass(), "value3", null);
        setField(term58358, term58358.getClass(), "delegateMap", null);
        term58360 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term58361 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term58360, term58360.getClass(), "size", 2);
        setIntField(term58360, term58360.getClass(), "hash1", 0);
        setIntField(term58360, term58360.getClass(), "hash2", 0);
        setIntField(term58360, term58360.getClass(), "hash3", 0);
        setField(term58360, term58360.getClass(), "key1", null);
        setField(term58360, term58360.getClass(), "key2", null);
        setField(term58360, term58360.getClass(), "key3", null);
        setField(term58360, term58360.getClass(), "value1", null);
        setIntField(term58361, term58361.getClass(), "size", 0);
        setIntField(term58361, term58361.getClass(), "hash1", 0);
        setIntField(term58361, term58361.getClass(), "hash2", 0);
        setIntField(term58361, term58361.getClass(), "hash3", 0);
        setField(term58361, term58361.getClass(), "key1", null);
        setField(term58361, term58361.getClass(), "key2", null);
        setField(term58361, term58361.getClass(), "key3", null);
        setField(term58361, term58361.getClass(), "value1", null);
        setField(term58361, term58361.getClass(), "value2", null);
        setField(term58361, term58361.getClass(), "value3", null);
        setField(term58361, term58361.getClass(), "delegateMap", null);
        setField(term58360, term58360.getClass(), "value2", term58361);
        setField(term58360, term58360.getClass(), "value3", null);
        setField(term58360, term58360.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term58275;
        callMethod(klass, "containsValue", argTypes, term58275, args);
        assertTrue(recursiveEquals(term58275, term58358));
        assertTrue(recursiveEquals(term58275, term58360));
    }

};
