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
import java.util.ArrayList;

public class MultiValueMap_putAll_80614943274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12591;
     Object term12643;
     Object term13088;
     Object term13089;

    public MultiValueMap_putAll_80614943274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12591 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        term12643 = new ArrayList();
        term13088 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term13088, term13088.getClass(), "collectionFactory", null);
        setField(term13088, term13088.getClass(), "valuesView", null);
        setField(term13088, term13088.getClass(), "map", null);
        term13089 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.util.Collection");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term12643;
        Object retValue = callMethod(klass, "putAll", argTypes, term12591, args);
        assertTrue(recursiveEquals(term12591, term13088));
        assertTrue(recursiveEquals(term12643, term13089));
        assertTrue(recursiveEquals(retValue, false));
    }

};


