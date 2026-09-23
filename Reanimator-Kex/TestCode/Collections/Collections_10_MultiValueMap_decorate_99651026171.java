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

public class MultiValueMap_decorate_99651026171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11587;
     Object term11705;
     Object term12090;
     Object term12091;
     Object term12086;

    public MultiValueMap_decorate_99651026171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11587 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        term11705 = newInstance(Class.forName("org.apache.commons.collections.functors.ExceptionFactory"));
        term12090 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term12090, term12090.getClass(), "collectionFactory", null);
        setField(term12090, term12090.getClass(), "valuesView", null);
        setField(term12090, term12090.getClass(), "map", null);
        term12091 = newInstance(Class.forName("org.apache.commons.collections.functors.ExceptionFactory"));
        term12086 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term12087 = newInstance(Class.forName("org.apache.commons.collections.functors.ExceptionFactory"));
        Object term12088 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term12086, term12086.getClass(), "collectionFactory", term12087);
        setField(term12086, term12086.getClass(), "valuesView", null);
        setField(term12088, term12088.getClass(), "collectionFactory", null);
        setField(term12088, term12088.getClass(), "valuesView", null);
        setField(term12088, term12088.getClass(), "map", null);
        setField(term12086, term12086.getClass(), "map", term12088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("org.apache.commons.collections.Factory");
        Object[] args = new Object[2];
        args[0] = term11587;
        args[1] = term11705;
        Object retValue = callMethod(klass, "decorate", argTypes, null, args);
        assertTrue(recursiveEquals(term11587, term12090));
        assertTrue(recursiveEquals(term11705, term12091));
        assertTrue(recursiveEquals(retValue, term12086));
    }

};


