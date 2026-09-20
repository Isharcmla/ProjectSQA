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
import java.util.HashMap;

public class Flat3Map_equals_1826922527415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76407;
     Object term76499;
     Object term76618;
     Object term76619;

    public Flat3Map_equals_1826922527415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76407 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term76407, term76407.getClass(), "delegateMap", null);
        setIntField(term76407, term76407.getClass(), "size", 3);
        setField(term76407, term76407.getClass(), "key3", null);
        setField(term76407, term76407.getClass(), "value3", null);
        HashMap term76547 = new HashMap();
        term76499 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term76499, term76499.getClass(), "delegateMap", null);
        setIntField(term76499, term76499.getClass(), "size", 3);
        setField(term76499, term76499.getClass(), "key3", null);
        setField(term76499, term76499.getClass(), "value3", term76547);
        term76618 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term76618, term76618.getClass(), "size", 3);
        setIntField(term76618, term76618.getClass(), "hash1", 0);
        setIntField(term76618, term76618.getClass(), "hash2", 0);
        setIntField(term76618, term76618.getClass(), "hash3", 0);
        setField(term76618, term76618.getClass(), "key1", null);
        setField(term76618, term76618.getClass(), "key2", null);
        setField(term76618, term76618.getClass(), "key3", null);
        setField(term76618, term76618.getClass(), "value1", null);
        setField(term76618, term76618.getClass(), "value2", null);
        setField(term76618, term76618.getClass(), "value3", null);
        setField(term76618, term76618.getClass(), "delegateMap", null);
        HashMap term76620 = new HashMap();
        term76619 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term76619, term76619.getClass(), "size", 3);
        setIntField(term76619, term76619.getClass(), "hash1", 0);
        setIntField(term76619, term76619.getClass(), "hash2", 0);
        setIntField(term76619, term76619.getClass(), "hash3", 0);
        setField(term76619, term76619.getClass(), "key1", null);
        setField(term76619, term76619.getClass(), "key2", null);
        setField(term76619, term76619.getClass(), "key3", null);
        setField(term76619, term76619.getClass(), "value1", null);
        setField(term76619, term76619.getClass(), "value2", null);
        setField(term76619, term76619.getClass(), "value3", term76620);
        setField(term76619, term76619.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term76499;
        Object retValue = callMethod(klass, "equals", argTypes, term76407, args);
        assertTrue(recursiveEquals(term76407, term76618));
        assertTrue(recursiveEquals(term76499, term76619));
        assertTrue(recursiveEquals(retValue, false));
    }

};
