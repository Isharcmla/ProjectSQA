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

public class MultiValueMap_putAll_74337732741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5754;
     Object term5802;
     Object term6320;
     Object term6321;

    public MultiValueMap_putAll_74337732741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5754 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        term5802 = new HashMap();
        term6320 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term6320, term6320.getClass(), "collectionFactory", null);
        setField(term6320, term6320.getClass(), "values", null);
        setField(term6320, term6320.getClass(), "map", null);
        term6321 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term5802;
        callMethod(klass, "putAll", argTypes, term5754, args);
        assertTrue(recursiveEquals(term5754, term6320));
        assertTrue(recursiveEquals(term5802, term6321));
    }

};


