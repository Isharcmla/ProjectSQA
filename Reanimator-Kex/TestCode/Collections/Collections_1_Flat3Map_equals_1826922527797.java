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

public class Flat3Map_equals_1826922527797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162190;
     Object term162428;
     Object term162541;
     Object term162543;

    public Flat3Map_equals_1826922527797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162190 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term162336 = newInstance(Class.forName("java.lang.invoke.StringConcatFactory$MethodHandleStringBuilderStrategy"));
        setField(term162190, term162190.getClass(), "delegateMap", null);
        setIntField(term162190, term162190.getClass(), "size", 3);
        setField(term162190, term162190.getClass(), "key3", null);
        setField(term162190, term162190.getClass(), "value3", null);
        setField(term162190, term162190.getClass(), "key2", null);
        setField(term162190, term162190.getClass(), "value2", null);
        setField(term162190, term162190.getClass(), "key1", term162336);
        term162428 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term162428, term162428.getClass(), "delegateMap", null);
        setIntField(term162428, term162428.getClass(), "size", 3);
        setField(term162428, term162428.getClass(), "key3", null);
        setField(term162428, term162428.getClass(), "value3", null);
        setIntField(term162428, term162428.getClass(), "hash3", 0);
        term162541 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term162542 = newInstance(Class.forName("java.lang.invoke.StringConcatFactory$MethodHandleStringBuilderStrategy"));
        setIntField(term162541, term162541.getClass(), "size", 3);
        setIntField(term162541, term162541.getClass(), "hash1", 0);
        setIntField(term162541, term162541.getClass(), "hash2", 0);
        setIntField(term162541, term162541.getClass(), "hash3", 0);
        setField(term162541, term162541.getClass(), "key1", term162542);
        setField(term162541, term162541.getClass(), "key2", null);
        setField(term162541, term162541.getClass(), "key3", null);
        setField(term162541, term162541.getClass(), "value1", null);
        setField(term162541, term162541.getClass(), "value2", null);
        setField(term162541, term162541.getClass(), "value3", null);
        setField(term162541, term162541.getClass(), "delegateMap", null);
        term162543 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term162543, term162543.getClass(), "size", 3);
        setIntField(term162543, term162543.getClass(), "hash1", 0);
        setIntField(term162543, term162543.getClass(), "hash2", 0);
        setIntField(term162543, term162543.getClass(), "hash3", 0);
        setField(term162543, term162543.getClass(), "key1", null);
        setField(term162543, term162543.getClass(), "key2", null);
        setField(term162543, term162543.getClass(), "key3", null);
        setField(term162543, term162543.getClass(), "value1", null);
        setField(term162543, term162543.getClass(), "value2", null);
        setField(term162543, term162543.getClass(), "value3", null);
        setField(term162543, term162543.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term162428;
        Object retValue = callMethod(klass, "equals", argTypes, term162190, args);
        assertTrue(recursiveEquals(term162190, term162541));
        assertTrue(recursiveEquals(term162428, term162543));
        assertTrue(recursiveEquals(retValue, false));
    }

};
