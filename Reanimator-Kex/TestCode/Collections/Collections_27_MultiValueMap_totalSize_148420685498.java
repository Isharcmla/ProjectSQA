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
import java.util.ArrayList;

public class MultiValueMap_totalSize_148420685498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18672;
     Object term19098;

    public MultiValueMap_totalSize_148420685498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18828 = new ArrayList();
        term18672 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term18776 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term18776, term18776.getClass(), "valuesView", term18828);
        setField(term18672, term18672.getClass(), "map", term18776);
        ArrayList term19100 = new ArrayList();
        term19098 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term19099 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term19098, term19098.getClass(), "collectionFactory", null);
        setField(term19098, term19098.getClass(), "valuesView", null);
        setField(term19099, term19099.getClass(), "collectionFactory", null);
        setField(term19099, term19099.getClass(), "valuesView", term19100);
        setField(term19099, term19099.getClass(), "map", null);
        setField(term19098, term19098.getClass(), "map", term19099);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "totalSize", argTypes, term18672, args);
        assertTrue(recursiveEquals(term18672, term19098));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


