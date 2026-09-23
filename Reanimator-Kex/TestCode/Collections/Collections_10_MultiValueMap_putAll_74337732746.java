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
import java.util.HashMap;

public class MultiValueMap_putAll_74337732746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6622;
     Object term6670;
     Object term7147;
     Object term7148;

    public MultiValueMap_putAll_74337732746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6622 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        term6670 = new HashMap();
        term7147 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term7147, term7147.getClass(), "collectionFactory", null);
        setField(term7147, term7147.getClass(), "valuesView", null);
        setField(term7147, term7147.getClass(), "map", null);
        term7148 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term6670;
        callMethod(klass, "putAll", argTypes, term6622, args);
        assertTrue(recursiveEquals(term6622, term7147));
        assertTrue(recursiveEquals(term6670, term7148));
    }

};


