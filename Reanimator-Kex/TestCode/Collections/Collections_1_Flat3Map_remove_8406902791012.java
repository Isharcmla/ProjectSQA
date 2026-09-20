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

public class Flat3Map_remove_8406902791012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201865;
     Object term203384;
     Object term203386;

    public Flat3Map_remove_8406902791012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201865 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term201920 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term201865, term201865.getClass(), "delegateMap", null);
        setIntField(term201865, term201865.getClass(), "size", 3);
        setIntField(term201865, term201865.getClass(), "hash3", 0);
        setIntField(term201920, term201920.getClass(), "size", 0);
        setField(term201865, term201865.getClass(), "value3", term201920);
        setIntField(term201865, term201865.getClass(), "hash2", 0);
        setField(term201865, term201865.getClass(), "value2", null);
        setIntField(term201865, term201865.getClass(), "hash1", 0);
        setField(term201865, term201865.getClass(), "value1", null);
        term203384 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term203385 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term203384, term203384.getClass(), "size", 3);
        setIntField(term203384, term203384.getClass(), "hash1", 0);
        setIntField(term203384, term203384.getClass(), "hash2", 0);
        setIntField(term203384, term203384.getClass(), "hash3", 0);
        setField(term203384, term203384.getClass(), "key1", null);
        setField(term203384, term203384.getClass(), "key2", null);
        setField(term203384, term203384.getClass(), "key3", null);
        setField(term203384, term203384.getClass(), "value1", null);
        setField(term203384, term203384.getClass(), "value2", null);
        setFloatField(term203385, term203385.getClass(), "loadFactor", 0.0F);
        setIntField(term203385, term203385.getClass(), "size", 0);
        setField(term203385, term203385.getClass(), "data", null);
        setIntField(term203385, term203385.getClass(), "threshold", 0);
        setIntField(term203385, term203385.getClass(), "modCount", 0);
        setField(term203385, term203385.getClass(), "entrySet", null);
        setField(term203385, term203385.getClass(), "keySet", null);
        setField(term203385, term203385.getClass(), "values", null);
        setField(term203385, term203385.getClass(), "keySet", null);
        setField(term203385, term203385.getClass(), "values", null);
        setField(term203384, term203384.getClass(), "value3", term203385);
        setField(term203384, term203384.getClass(), "delegateMap", null);
        term203386 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term203387 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term203386, term203386.getClass(), "size", 3);
        setIntField(term203386, term203386.getClass(), "hash1", 0);
        setIntField(term203386, term203386.getClass(), "hash2", 0);
        setIntField(term203386, term203386.getClass(), "hash3", 0);
        setField(term203386, term203386.getClass(), "key1", null);
        setField(term203386, term203386.getClass(), "key2", null);
        setField(term203386, term203386.getClass(), "key3", null);
        setField(term203386, term203386.getClass(), "value1", null);
        setField(term203386, term203386.getClass(), "value2", null);
        setFloatField(term203387, term203387.getClass(), "loadFactor", 0.0F);
        setIntField(term203387, term203387.getClass(), "size", 0);
        setField(term203387, term203387.getClass(), "data", null);
        setIntField(term203387, term203387.getClass(), "threshold", 0);
        setIntField(term203387, term203387.getClass(), "modCount", 0);
        setField(term203387, term203387.getClass(), "entrySet", null);
        setField(term203387, term203387.getClass(), "keySet", null);
        setField(term203387, term203387.getClass(), "values", null);
        setField(term203387, term203387.getClass(), "keySet", null);
        setField(term203387, term203387.getClass(), "values", null);
        setField(term203386, term203386.getClass(), "value3", term203387);
        setField(term203386, term203386.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term201865;
        Object retValue = callMethod(klass, "remove", argTypes, term201865, args);
        assertTrue(recursiveEquals(term201865, term203384));
        assertTrue(recursiveEquals(term201865, term203386));
        assertTrue(recursiveEquals(retValue, null));
    }

};
