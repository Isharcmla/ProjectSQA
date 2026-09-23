package org.apache.commons.collections4.map;

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
import static org.apache.commons.collections4.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.map.EqualityUtils.*;
import java.lang.Object;

public class MultiValueMap_multiValueMap_72169032883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14409;
     Object term14549;
     Object term14810;
     Object term14811;
     Object term14805;

    public MultiValueMap_multiValueMap_72169032883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14409 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        term14549 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap$ReflectionFactory"));
        term14810 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term14810, term14810.getClass(), "collectionFactory", null);
        setField(term14810, term14810.getClass(), "valuesView", null);
        setField(term14810, term14810.getClass(), "map", null);
        term14811 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap$ReflectionFactory"));
        setField(term14811, term14811.getClass(), "clazz", null);
        term14805 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term14806 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap$ReflectionFactory"));
        Object term14807 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term14806, term14806.getClass(), "clazz", null);
        setField(term14805, term14805.getClass(), "collectionFactory", term14806);
        setField(term14805, term14805.getClass(), "valuesView", null);
        setField(term14807, term14807.getClass(), "collectionFactory", null);
        setField(term14807, term14807.getClass(), "valuesView", null);
        setField(term14807, term14807.getClass(), "map", null);
        setField(term14805, term14805.getClass(), "map", term14807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Factory");
        Object[] args = new Object[2];
        args[0] = term14409;
        args[1] = term14549;
        Object retValue = callMethod(klass, "multiValueMap", argTypes, null, args);
        assertTrue(recursiveEquals(term14409, term14810));
        assertTrue(recursiveEquals(term14549, term14811));
        assertTrue(recursiveEquals(retValue, term14805));
    }

};


