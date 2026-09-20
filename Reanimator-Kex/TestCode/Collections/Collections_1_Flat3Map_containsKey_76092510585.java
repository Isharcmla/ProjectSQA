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

public class Flat3Map_containsKey_76092510585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112023;
     Object term112115;
     Object term112178;
     Object term112179;

    public Flat3Map_containsKey_76092510585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112023 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term112023, term112023.getClass(), "delegateMap", null);
        setIntField(term112023, term112023.getClass(), "size", 2);
        setIntField(term112023, term112023.getClass(), "hash2", 0);
        setField(term112023, term112023.getClass(), "key2", term112023);
        term112115 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term112115, term112115.getClass(), "delegateMap", null);
        setIntField(term112115, term112115.getClass(), "size", 2);
        setIntField(term112115, term112115.getClass(), "hash2", 0);
        setField(term112115, term112115.getClass(), "value2", null);
        setIntField(term112115, term112115.getClass(), "hash1", 0);
        setField(term112115, term112115.getClass(), "value1", null);
        term112178 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term112178, term112178.getClass(), "size", 2);
        setIntField(term112178, term112178.getClass(), "hash1", 0);
        setIntField(term112178, term112178.getClass(), "hash2", 0);
        setIntField(term112178, term112178.getClass(), "hash3", 0);
        setField(term112178, term112178.getClass(), "key1", null);
        setField(term112178, term112178.getClass(), "key2", term112178);
        setField(term112178, term112178.getClass(), "key3", null);
        setField(term112178, term112178.getClass(), "value1", null);
        setField(term112178, term112178.getClass(), "value2", null);
        setField(term112178, term112178.getClass(), "value3", null);
        setField(term112178, term112178.getClass(), "delegateMap", null);
        term112179 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term112179, term112179.getClass(), "size", 2);
        setIntField(term112179, term112179.getClass(), "hash1", 0);
        setIntField(term112179, term112179.getClass(), "hash2", 0);
        setIntField(term112179, term112179.getClass(), "hash3", 0);
        setField(term112179, term112179.getClass(), "key1", null);
        setField(term112179, term112179.getClass(), "key2", null);
        setField(term112179, term112179.getClass(), "key3", null);
        setField(term112179, term112179.getClass(), "value1", null);
        setField(term112179, term112179.getClass(), "value2", null);
        setField(term112179, term112179.getClass(), "value3", null);
        setField(term112179, term112179.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term112115;
        callMethod(klass, "containsKey", argTypes, term112023, args);
        assertTrue(recursiveEquals(term112023, term112178));
        assertTrue(recursiveEquals(term112115, term112179));
    }

};
