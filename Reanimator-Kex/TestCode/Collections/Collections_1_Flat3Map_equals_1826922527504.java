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

public class Flat3Map_equals_1826922527504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95007;
     Object term95147;
     Object term95535;
     Object term95538;

    public Flat3Map_equals_1826922527504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term95055 = new HashMap();
        term95007 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term95007, term95007.getClass(), "delegateMap", null);
        setIntField(term95007, term95007.getClass(), "size", 3);
        setField(term95007, term95007.getClass(), "key3", null);
        setField(term95007, term95007.getClass(), "value3", null);
        setField(term95007, term95007.getClass(), "key2", null);
        setField(term95007, term95007.getClass(), "value2", null);
        setField(term95007, term95007.getClass(), "key1", term95055);
        term95147 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term95147, term95147.getClass(), "delegateMap", null);
        setIntField(term95147, term95147.getClass(), "size", 3);
        setField(term95147, term95147.getClass(), "key3", null);
        setField(term95147, term95147.getClass(), "value3", null);
        setIntField(term95147, term95147.getClass(), "hash3", 0);
        HashMap term95536 = new HashMap();
        term95535 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term95535, term95535.getClass(), "size", 3);
        setIntField(term95535, term95535.getClass(), "hash1", 0);
        setIntField(term95535, term95535.getClass(), "hash2", 0);
        setIntField(term95535, term95535.getClass(), "hash3", 0);
        setField(term95535, term95535.getClass(), "key1", term95536);
        setField(term95535, term95535.getClass(), "key2", null);
        setField(term95535, term95535.getClass(), "key3", null);
        setField(term95535, term95535.getClass(), "value1", null);
        setField(term95535, term95535.getClass(), "value2", null);
        setField(term95535, term95535.getClass(), "value3", null);
        setField(term95535, term95535.getClass(), "delegateMap", null);
        term95538 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term95538, term95538.getClass(), "size", 3);
        setIntField(term95538, term95538.getClass(), "hash1", 0);
        setIntField(term95538, term95538.getClass(), "hash2", 0);
        setIntField(term95538, term95538.getClass(), "hash3", 0);
        setField(term95538, term95538.getClass(), "key1", null);
        setField(term95538, term95538.getClass(), "key2", null);
        setField(term95538, term95538.getClass(), "key3", null);
        setField(term95538, term95538.getClass(), "value1", null);
        setField(term95538, term95538.getClass(), "value2", null);
        setField(term95538, term95538.getClass(), "value3", null);
        setField(term95538, term95538.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term95147;
        Object retValue = callMethod(klass, "equals", argTypes, term95007, args);
        assertTrue(recursiveEquals(term95007, term95535));
        assertTrue(recursiveEquals(term95147, term95538));
        assertTrue(recursiveEquals(retValue, false));
    }

};
