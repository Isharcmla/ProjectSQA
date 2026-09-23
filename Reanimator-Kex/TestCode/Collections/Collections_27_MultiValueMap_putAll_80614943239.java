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

public class MultiValueMap_putAll_80614943239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term633;
     Object term5382;

    public MultiValueMap_putAll_80614943239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term633 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term633, term633.getClass(), "collectionFactory", null);
        setField(term633, term633.getClass(), "valuesView", null);
        setField(term633, term633.getClass(), "map", null);
        term5382 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term5382, term5382.getClass(), "collectionFactory", null);
        setField(term5382, term5382.getClass(), "valuesView", null);
        setField(term5382, term5382.getClass(), "map", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.util.Collection");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "putAll", argTypes, term633, args);
        assertTrue(recursiveEquals(term633, term5382));
        assertTrue(recursiveEquals(retValue, false));
    }

};


