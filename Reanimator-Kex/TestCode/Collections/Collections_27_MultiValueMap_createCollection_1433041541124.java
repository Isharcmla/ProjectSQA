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

public class MultiValueMap_createCollection_1433041541124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20191;
     Object term34667;

    public MultiValueMap_createCollection_1433041541124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20191 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term20371 = newInstance(Class.forName("org.apache.commons.collections4.functors.PrototypeFactory$PrototypeSerializationFactory"));
        setField(term20191, term20191.getClass(), "collectionFactory", term20371);
        term34667 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term34668 = newInstance(Class.forName("org.apache.commons.collections4.functors.PrototypeFactory$PrototypeSerializationFactory"));
        setField(term34668, term34668.getClass(), "iPrototype", null);
        setField(term34667, term34667.getClass(), "collectionFactory", term34668);
        setField(term34667, term34667.getClass(), "valuesView", null);
        setField(term34667, term34667.getClass(), "map", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "createCollection", argTypes, term20191, args);
        assertTrue(recursiveEquals(term20191, term34667));
        assertTrue(recursiveEquals(retValue, null));
    }

};


