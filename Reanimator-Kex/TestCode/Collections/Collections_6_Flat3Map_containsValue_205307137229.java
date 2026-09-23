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

public class Flat3Map_containsValue_205307137229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90;
     Object term106;

    public Flat3Map_containsValue_205307137229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term95 = newInstance(Class.forName("java.lang.Object"));
        Object term96 = newInstance(Class.forName("java.lang.Object"));
        Object term97 = newInstance(Class.forName("java.lang.Object"));
        Object term98 = newInstance(Class.forName("java.lang.Object"));
        Object term99 = newInstance(Class.forName("java.lang.Object"));
        Object term100 = newInstance(Class.forName("java.lang.Object"));
        Object term101 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term90, term90.getClass(), "size", -461771056);
        setIntField(term90, term90.getClass(), "hash1", -243422082);
        setIntField(term90, term90.getClass(), "hash2", 1384592638);
        setIntField(term90, term90.getClass(), "hash3", -1002370457);
        setField(term90, term90.getClass(), "key1", term95);
        setField(term90, term90.getClass(), "key2", term96);
        setField(term90, term90.getClass(), "key3", term97);
        setField(term90, term90.getClass(), "value1", term98);
        setField(term90, term90.getClass(), "value2", term99);
        setField(term90, term90.getClass(), "value3", term100);
        setFloatField(term101, term101.getClass(), "loadFactor", 0.0F);
        setIntField(term101, term101.getClass(), "size", 0);
        setField(term101, term101.getClass(), "data", null);
        setIntField(term101, term101.getClass(), "threshold", 0);
        setIntField(term101, term101.getClass(), "modCount", 0);
        setField(term101, term101.getClass(), "entrySet", null);
        setField(term101, term101.getClass(), "keySet", null);
        setField(term101, term101.getClass(), "values", null);
        setField(term101, term101.getClass(), "keySet", null);
        setField(term101, term101.getClass(), "values", null);
        setField(term90, term90.getClass(), "delegateMap", term101);
        term106 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term106;
        try {
            callMethod(klass, "containsValue", argTypes, term90, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


