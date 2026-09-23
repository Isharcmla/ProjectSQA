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

public class MultiValueMap_putAll_112741656457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8550;
     Object term8602;
     Object term9309;
     Object term9310;

    public MultiValueMap_putAll_112741656457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8550 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        term8602 = new ArrayList();
        term9309 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term9309, term9309.getClass(), "collectionFactory", null);
        setField(term9309, term9309.getClass(), "values", null);
        setField(term9309, term9309.getClass(), "map", null);
        term9310 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.util.Collection");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term8602;
        Object retValue = callMethod(klass, "putAll", argTypes, term8550, args);
        assertTrue(recursiveEquals(term8550, term9309));
        assertTrue(recursiveEquals(term8602, term9310));
        assertTrue(recursiveEquals(retValue, false));
    }

};


