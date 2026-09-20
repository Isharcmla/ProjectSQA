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

public class Flat3Map_equals_1826922527739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148932;
     Object term149072;
     Object term149358;
     Object term149361;

    public Flat3Map_equals_1826922527739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term148980 = new HashMap();
        term148932 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term148932, term148932.getClass(), "delegateMap", null);
        setIntField(term148932, term148932.getClass(), "size", 2);
        setField(term148932, term148932.getClass(), "key2", null);
        setField(term148932, term148932.getClass(), "value2", null);
        setField(term148932, term148932.getClass(), "key1", term148980);
        HashMap term149120 = new HashMap();
        term149072 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term149072, term149072.getClass(), "delegateMap", null);
        setIntField(term149072, term149072.getClass(), "size", 2);
        setField(term149072, term149072.getClass(), "key2", term149120);
        setField(term149072, term149072.getClass(), "key1", null);
        setField(term149072, term149072.getClass(), "value1", null);
        HashMap term149359 = new HashMap();
        term149358 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term149358, term149358.getClass(), "size", 2);
        setIntField(term149358, term149358.getClass(), "hash1", 0);
        setIntField(term149358, term149358.getClass(), "hash2", 0);
        setIntField(term149358, term149358.getClass(), "hash3", 0);
        setField(term149358, term149358.getClass(), "key1", term149359);
        setField(term149358, term149358.getClass(), "key2", null);
        setField(term149358, term149358.getClass(), "key3", null);
        setField(term149358, term149358.getClass(), "value1", null);
        setField(term149358, term149358.getClass(), "value2", null);
        setField(term149358, term149358.getClass(), "value3", null);
        setField(term149358, term149358.getClass(), "delegateMap", null);
        HashMap term149362 = new HashMap();
        term149361 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term149361, term149361.getClass(), "size", 2);
        setIntField(term149361, term149361.getClass(), "hash1", 0);
        setIntField(term149361, term149361.getClass(), "hash2", 0);
        setIntField(term149361, term149361.getClass(), "hash3", 0);
        setField(term149361, term149361.getClass(), "key1", null);
        setField(term149361, term149361.getClass(), "key2", term149362);
        setField(term149361, term149361.getClass(), "key3", null);
        setField(term149361, term149361.getClass(), "value1", null);
        setField(term149361, term149361.getClass(), "value2", null);
        setField(term149361, term149361.getClass(), "value3", null);
        setField(term149361, term149361.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term149072;
        Object retValue = callMethod(klass, "equals", argTypes, term148932, args);
        assertTrue(recursiveEquals(term148932, term149358));
        assertTrue(recursiveEquals(term149072, term149361));
        assertTrue(recursiveEquals(retValue, true));
    }

};
