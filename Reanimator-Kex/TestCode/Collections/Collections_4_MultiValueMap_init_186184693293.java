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
import java.util.HashMap;

public class MultiValueMap_init_186184693293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18903;
     Object term19041;
     Object term19298;
     Object term19301;
     Object term19302;

    public MultiValueMap_init_186184693293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term18801 = new HashMap();
        Object term18753 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term18753, term18753.getClass(), "map", term18801);
        term18903 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        term19041 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap$ReflectionFactory"));
        term19298 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term19299 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap$ReflectionFactory"));
        Object term19300 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term19299, term19299.getClass(), "clazz", null);
        setField(term19298, term19298.getClass(), "collectionFactory", term19299);
        setField(term19298, term19298.getClass(), "values", null);
        setField(term19300, term19300.getClass(), "collectionFactory", null);
        setField(term19300, term19300.getClass(), "values", null);
        setField(term19300, term19300.getClass(), "map", null);
        setField(term19298, term19298.getClass(), "map", term19300);
        term19301 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term19301, term19301.getClass(), "collectionFactory", null);
        setField(term19301, term19301.getClass(), "values", null);
        setField(term19301, term19301.getClass(), "map", null);
        term19302 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap$ReflectionFactory"));
        setField(term19302, term19302.getClass(), "clazz", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("org.apache.commons.collections.Factory");
        Object[] args = new Object[2];
        args[0] = term18903;
        args[1] = term19041;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term19298));
        assertTrue(recursiveEquals(term18903, term19301));
        assertTrue(recursiveEquals(term19041, term19302));
    }

};


