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

public class MultiValueMap_values_179741354186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15880;
     Object term16112;
     Object term16107;

    public MultiValueMap_values_179741354186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term15932 = new ArrayList();
        term15880 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term15880, term15880.getClass(), "valuesView", term15932);
        ArrayList term16113 = new ArrayList();
        term16112 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term16112, term16112.getClass(), "collectionFactory", null);
        setField(term16112, term16112.getClass(), "valuesView", term16113);
        setField(term16112, term16112.getClass(), "map", null);
        term16107 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, term15880, args);
        assertTrue(recursiveEquals(term15880, term16112));
        assertTrue(recursiveEquals(retValue, term16107));
    }

};


