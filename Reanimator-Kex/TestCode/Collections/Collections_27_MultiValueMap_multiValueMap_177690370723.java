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
import java.util.LinkedHashMap;
import java.lang.Object;

public class MultiValueMap_multiValueMap_177690370723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26;
     Object term1398;
     Object term1388;

    public MultiValueMap_multiValueMap_177690370723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26 = new LinkedHashMap();
        term1398 = new LinkedHashMap();
        LinkedHashMap term1390 = new LinkedHashMap();
        term1388 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term1389 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap$ReflectionFactory"));
        setField(term1389, term1389.getClass(), "clazz", null);
        setField(term1388, term1388.getClass(), "collectionFactory", term1389);
        setField(term1388, term1388.getClass(), "valuesView", null);
        setField(term1388, term1388.getClass(), "map", term1390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("java.lang.Class");
        Object[] args = new Object[2];
        args[0] = term26;
        args[1] = null;
        Object retValue = callMethod(klass, "multiValueMap", argTypes, null, args);
        assertTrue(recursiveEquals(term26, null));
        assertTrue(recursiveEquals(retValue, term1388));
    }

};


