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

public class MultiValueMap_values_211868067350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7439;
     Object term7716;
     Object term7711;

    public MultiValueMap_values_211868067350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7491 = new ArrayList();
        term7439 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term7439, term7439.getClass(), "valuesView", term7491);
        ArrayList term7717 = new ArrayList();
        term7716 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term7716, term7716.getClass(), "collectionFactory", null);
        setField(term7716, term7716.getClass(), "valuesView", term7717);
        setField(term7716, term7716.getClass(), "map", null);
        term7711 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, term7439, args);
        assertTrue(recursiveEquals(term7439, term7716));
        assertTrue(recursiveEquals(retValue, term7711));
    }

};


