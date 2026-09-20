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

public class Flat3Map_get_22962178125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26;
     Object term42;

    public Flat3Map_get_22962178125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term31 = newInstance(Class.forName("java.lang.Object"));
        Object term32 = newInstance(Class.forName("java.lang.Object"));
        Object term33 = newInstance(Class.forName("java.lang.Object"));
        Object term34 = newInstance(Class.forName("java.lang.Object"));
        Object term35 = newInstance(Class.forName("java.lang.Object"));
        Object term36 = newInstance(Class.forName("java.lang.Object"));
        Object term37 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term26, term26.getClass(), "size", 1134449235);
        setIntField(term26, term26.getClass(), "hash1", -883034806);
        setIntField(term26, term26.getClass(), "hash2", 1585847225);
        setIntField(term26, term26.getClass(), "hash3", 597278769);
        setField(term26, term26.getClass(), "key1", term31);
        setField(term26, term26.getClass(), "key2", term32);
        setField(term26, term26.getClass(), "key3", term33);
        setField(term26, term26.getClass(), "value1", term34);
        setField(term26, term26.getClass(), "value2", term35);
        setField(term26, term26.getClass(), "value3", term36);
        setFloatField(term37, term37.getClass(), "loadFactor", 0.0F);
        setIntField(term37, term37.getClass(), "size", 0);
        setField(term37, term37.getClass(), "data", null);
        setIntField(term37, term37.getClass(), "threshold", 0);
        setIntField(term37, term37.getClass(), "modCount", 0);
        setField(term37, term37.getClass(), "entrySet", null);
        setField(term37, term37.getClass(), "keySet", null);
        setField(term37, term37.getClass(), "values", null);
        setField(term37, term37.getClass(), "keySet", null);
        setField(term37, term37.getClass(), "values", null);
        setField(term26, term26.getClass(), "delegateMap", term37);
        term42 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term42;
        try {
            callMethod(klass, "get", argTypes, term26, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
