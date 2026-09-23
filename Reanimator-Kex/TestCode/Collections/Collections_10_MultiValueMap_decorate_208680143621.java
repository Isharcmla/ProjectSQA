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
import java.util.LinkedHashMap;
import java.lang.Object;

public class MultiValueMap_decorate_208680143621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26;
     Object term1298;
     Object term1289;

    public MultiValueMap_decorate_208680143621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26 = new LinkedHashMap();
        term1298 = new LinkedHashMap();
        LinkedHashMap term1291 = new LinkedHashMap();
        term1289 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term1290 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap$ReflectionFactory"));
        setField(term1290, term1290.getClass(), "clazz", null);
        setField(term1289, term1289.getClass(), "collectionFactory", term1290);
        setField(term1289, term1289.getClass(), "valuesView", null);
        setField(term1289, term1289.getClass(), "map", term1291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("java.lang.Class");
        Object[] args = new Object[2];
        args[0] = term26;
        args[1] = null;
        Object retValue = callMethod(klass, "decorate", argTypes, null, args);
        assertTrue(recursiveEquals(term26, null));
        assertTrue(recursiveEquals(retValue, term1289));
    }

};


