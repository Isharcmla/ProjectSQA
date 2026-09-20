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

public class Flat3Map_equals_1826922527738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148582;
     Object term148770;
     Object term149272;
     Object term149277;

    public Flat3Map_equals_1826922527738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term148794 = new HashMap();
        HashMap term148678 = new HashMap();
        term148582 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term148582, term148582.getClass(), "delegateMap", null);
        setIntField(term148582, term148582.getClass(), "size", 2);
        setField(term148582, term148582.getClass(), "key2", term148794);
        setField(term148582, term148582.getClass(), "value2", null);
        setField(term148582, term148582.getClass(), "key1", term148678);
        term148770 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term148770, term148770.getClass(), "delegateMap", null);
        setIntField(term148770, term148770.getClass(), "size", 2);
        setIntField(term148770, term148770.getClass(), "hash2", 0);
        setField(term148770, term148770.getClass(), "key2", term148794);
        setField(term148770, term148770.getClass(), "value2", null);
        HashMap term149273 = new HashMap();
        HashMap term149275 = new HashMap();
        term149272 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term149272, term149272.getClass(), "size", 2);
        setIntField(term149272, term149272.getClass(), "hash1", 0);
        setIntField(term149272, term149272.getClass(), "hash2", 0);
        setIntField(term149272, term149272.getClass(), "hash3", 0);
        setField(term149272, term149272.getClass(), "key1", term149273);
        setField(term149272, term149272.getClass(), "key2", term149275);
        setField(term149272, term149272.getClass(), "key3", null);
        setField(term149272, term149272.getClass(), "value1", null);
        setField(term149272, term149272.getClass(), "value2", null);
        setField(term149272, term149272.getClass(), "value3", null);
        setField(term149272, term149272.getClass(), "delegateMap", null);
        HashMap term149278 = new HashMap();
        term149277 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term149277, term149277.getClass(), "size", 2);
        setIntField(term149277, term149277.getClass(), "hash1", 0);
        setIntField(term149277, term149277.getClass(), "hash2", 0);
        setIntField(term149277, term149277.getClass(), "hash3", 0);
        setField(term149277, term149277.getClass(), "key1", null);
        setField(term149277, term149277.getClass(), "key2", term149278);
        setField(term149277, term149277.getClass(), "key3", null);
        setField(term149277, term149277.getClass(), "value1", null);
        setField(term149277, term149277.getClass(), "value2", null);
        setField(term149277, term149277.getClass(), "value3", null);
        setField(term149277, term149277.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term148770;
        Object retValue = callMethod(klass, "equals", argTypes, term148582, args);
        assertTrue(recursiveEquals(term148582, term149272));
        assertTrue(recursiveEquals(term148770, term149277));
        assertTrue(recursiveEquals(retValue, true));
    }

};
