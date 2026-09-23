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
import java.util.ArrayList;

public class MultiValueMap_putAll_112741656452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7733;
     Object term7785;
     Object term8264;
     Object term8265;

    public MultiValueMap_putAll_112741656452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7733 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        term7785 = new ArrayList();
        term8264 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term8264, term8264.getClass(), "collectionFactory", null);
        setField(term8264, term8264.getClass(), "valuesView", null);
        setField(term8264, term8264.getClass(), "map", null);
        term8265 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.util.Collection");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term7785;
        Object retValue = callMethod(klass, "putAll", argTypes, term7733, args);
        assertTrue(recursiveEquals(term7733, term8264));
        assertTrue(recursiveEquals(term7785, term8265));
        assertTrue(recursiveEquals(retValue, false));
    }

};


