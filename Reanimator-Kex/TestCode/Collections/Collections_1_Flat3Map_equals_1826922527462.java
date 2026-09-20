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

public class Flat3Map_equals_1826922527462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85919;
     Object term86121;
     Object term86653;
     Object term86654;

    public Flat3Map_equals_1826922527462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85919 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term86029 = newInstance(Class.forName("org.apache.commons.collections.map.StaticBucketMap$1"));
        setField(term85919, term85919.getClass(), "delegateMap", null);
        setIntField(term85919, term85919.getClass(), "size", 1);
        setField(term85919, term85919.getClass(), "key1", term86029);
        term86121 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term86121, term86121.getClass(), "delegateMap", null);
        setIntField(term86121, term86121.getClass(), "size", 1);
        setIntField(term86121, term86121.getClass(), "hash1", 0);
        term86653 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term86653, term86653.getClass(), "size", 1);
        setIntField(term86653, term86653.getClass(), "hash1", 0);
        setIntField(term86653, term86653.getClass(), "hash2", 0);
        setIntField(term86653, term86653.getClass(), "hash3", 0);
        setField(term86653, term86653.getClass(), "key1", null);
        setField(term86653, term86653.getClass(), "key2", null);
        setField(term86653, term86653.getClass(), "key3", null);
        setField(term86653, term86653.getClass(), "value1", null);
        setField(term86653, term86653.getClass(), "value2", null);
        setField(term86653, term86653.getClass(), "value3", null);
        setField(term86653, term86653.getClass(), "delegateMap", null);
        term86654 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term86654, term86654.getClass(), "size", 1);
        setIntField(term86654, term86654.getClass(), "hash1", 0);
        setIntField(term86654, term86654.getClass(), "hash2", 0);
        setIntField(term86654, term86654.getClass(), "hash3", 0);
        setField(term86654, term86654.getClass(), "key1", null);
        setField(term86654, term86654.getClass(), "key2", null);
        setField(term86654, term86654.getClass(), "key3", null);
        setField(term86654, term86654.getClass(), "value1", null);
        setField(term86654, term86654.getClass(), "value2", null);
        setField(term86654, term86654.getClass(), "value3", null);
        setField(term86654, term86654.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term86121;
        Object retValue = callMethod(klass, "equals", argTypes, term85919, args);
        assertTrue(recursiveEquals(term85919, term86653));
        assertTrue(recursiveEquals(term86121, term86654));
        assertTrue(recursiveEquals(retValue, false));
    }

};
