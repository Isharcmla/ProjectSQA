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
     Object term24;
     Object term40;

    public Flat3Map_get_22962178125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term29 = newInstance(Class.forName("java.lang.Object"));
        Object term30 = newInstance(Class.forName("java.lang.Object"));
        Object term31 = newInstance(Class.forName("java.lang.Object"));
        Object term32 = newInstance(Class.forName("java.lang.Object"));
        Object term33 = newInstance(Class.forName("java.lang.Object"));
        Object term34 = newInstance(Class.forName("java.lang.Object"));
        Object term35 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term24, term24.getClass(), "size", 1134449235);
        setIntField(term24, term24.getClass(), "hash1", -883034806);
        setIntField(term24, term24.getClass(), "hash2", 1585847225);
        setIntField(term24, term24.getClass(), "hash3", 597278769);
        setField(term24, term24.getClass(), "key1", term29);
        setField(term24, term24.getClass(), "key2", term30);
        setField(term24, term24.getClass(), "key3", term31);
        setField(term24, term24.getClass(), "value1", term32);
        setField(term24, term24.getClass(), "value2", term33);
        setField(term24, term24.getClass(), "value3", term34);
        setFloatField(term35, term35.getClass(), "loadFactor", 0.0F);
        setIntField(term35, term35.getClass(), "size", 0);
        setField(term35, term35.getClass(), "data", null);
        setIntField(term35, term35.getClass(), "threshold", 0);
        setIntField(term35, term35.getClass(), "modCount", 0);
        setField(term35, term35.getClass(), "entrySet", null);
        setField(term35, term35.getClass(), "keySet", null);
        setField(term35, term35.getClass(), "values", null);
        setField(term35, term35.getClass(), "keySet", null);
        setField(term35, term35.getClass(), "values", null);
        setField(term24, term24.getClass(), "delegateMap", term35);
        term40 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term40;
        try {
            callMethod(klass, "get", argTypes, term24, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


