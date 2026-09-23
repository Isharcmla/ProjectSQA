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

public class MultiValueMap_decorate_99651026168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11504;
     Object term11620;
     Object term11840;
     Object term11841;
     Object term11836;

    public MultiValueMap_decorate_99651026168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11504 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        term11620 = newInstance(Class.forName("org.apache.commons.collections.functors.ConstantFactory"));
        term11840 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term11840, term11840.getClass(), "collectionFactory", null);
        setField(term11840, term11840.getClass(), "values", null);
        setField(term11840, term11840.getClass(), "map", null);
        term11841 = newInstance(Class.forName("org.apache.commons.collections.functors.ConstantFactory"));
        setField(term11841, term11841.getClass(), "iConstant", null);
        term11836 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term11837 = newInstance(Class.forName("org.apache.commons.collections.functors.ConstantFactory"));
        Object term11838 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term11837, term11837.getClass(), "iConstant", null);
        setField(term11836, term11836.getClass(), "collectionFactory", term11837);
        setField(term11836, term11836.getClass(), "values", null);
        setField(term11838, term11838.getClass(), "collectionFactory", null);
        setField(term11838, term11838.getClass(), "values", null);
        setField(term11838, term11838.getClass(), "map", null);
        setField(term11836, term11836.getClass(), "map", term11838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("org.apache.commons.collections.Factory");
        Object[] args = new Object[2];
        args[0] = term11504;
        args[1] = term11620;
        Object retValue = callMethod(klass, "decorate", argTypes, null, args);
        assertTrue(recursiveEquals(term11504, term11840));
        assertTrue(recursiveEquals(term11620, term11841));
        assertTrue(recursiveEquals(retValue, term11836));
    }

};


