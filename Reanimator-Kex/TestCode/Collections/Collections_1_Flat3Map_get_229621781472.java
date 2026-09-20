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
import java.lang.NullPointerException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Flat3Map_get_229621781472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88296;

    public Flat3Map_get_229621781472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88296 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term88342 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term88386 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setField(term88296, term88296.getClass(), "delegateMap", null);
        setIntField(term88296, term88296.getClass(), "size", 2);
        setIntField(term88296, term88296.getClass(), "hash2", 0);
        setField(term88296, term88296.getClass(), "value2", null);
        setIntField(term88296, term88296.getClass(), "hash1", 0);
        setField(term88296, term88296.getClass(), "value1", null);
        setField(term88296, term88296.getClass(), "key2", null);
        setIntField(term88386, term88386.getClass(), "size", 2);
        setField(term88342, term88342.getClass(), "delegateMap", term88386);
        setField(term88296, term88296.getClass(), "key1", term88342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term88296;
        try {
            callMethod(klass, "get", argTypes, term88296, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
