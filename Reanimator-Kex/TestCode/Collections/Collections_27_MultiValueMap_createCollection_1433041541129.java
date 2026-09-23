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

public class MultiValueMap_createCollection_1433041541129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21985;
     Object term36733;

    public MultiValueMap_createCollection_1433041541129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21985 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term22103 = newInstance(Class.forName("org.apache.commons.collections4.functors.ConstantFactory"));
        setField(term21985, term21985.getClass(), "collectionFactory", term22103);
        term36733 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term36734 = newInstance(Class.forName("org.apache.commons.collections4.functors.ConstantFactory"));
        setField(term36734, term36734.getClass(), "iConstant", null);
        setField(term36733, term36733.getClass(), "collectionFactory", term36734);
        setField(term36733, term36733.getClass(), "valuesView", null);
        setField(term36733, term36733.getClass(), "map", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "createCollection", argTypes, term21985, args);
        assertTrue(recursiveEquals(term21985, term36733));
        assertTrue(recursiveEquals(retValue, null));
    }

};


