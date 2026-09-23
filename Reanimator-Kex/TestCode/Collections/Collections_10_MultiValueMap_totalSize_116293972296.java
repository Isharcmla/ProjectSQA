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
import java.util.ArrayList;

public class MultiValueMap_totalSize_116293972296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18175;
     Object term18863;

    public MultiValueMap_totalSize_116293972296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18329 = new ArrayList();
        term18175 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term18277 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term18277, term18277.getClass(), "valuesView", term18329);
        setField(term18175, term18175.getClass(), "map", term18277);
        ArrayList term18865 = new ArrayList();
        term18863 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term18864 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term18863, term18863.getClass(), "collectionFactory", null);
        setField(term18863, term18863.getClass(), "valuesView", null);
        setField(term18864, term18864.getClass(), "collectionFactory", null);
        setField(term18864, term18864.getClass(), "valuesView", term18865);
        setField(term18864, term18864.getClass(), "map", null);
        setField(term18863, term18863.getClass(), "map", term18864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "totalSize", argTypes, term18175, args);
        assertTrue(recursiveEquals(term18175, term18863));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


