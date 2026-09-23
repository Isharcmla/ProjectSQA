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

public class MultiValueMap_putAll_112741656432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489;
     Object term4462;

    public MultiValueMap_putAll_112741656432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term489 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term489, term489.getClass(), "collectionFactory", null);
        setField(term489, term489.getClass(), "values", null);
        setField(term489, term489.getClass(), "map", null);
        term4462 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term4462, term4462.getClass(), "collectionFactory", null);
        setField(term4462, term4462.getClass(), "values", null);
        setField(term4462, term4462.getClass(), "map", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.util.Collection");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "putAll", argTypes, term489, args);
        assertTrue(recursiveEquals(term489, term4462));
        assertTrue(recursiveEquals(retValue, false));
    }

};


