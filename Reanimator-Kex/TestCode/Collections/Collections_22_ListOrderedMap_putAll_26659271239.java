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
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ListOrderedMap_putAll_26659271239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5105;
     Object term5116;
     Object term11691;
     Object term11695;

    public ListOrderedMap_putAll_26659271239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5106 = new ArrayList();
        HashMap term5110 = new HashMap();
        term5105 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term5105, term5105.getClass(), "insertOrder", term5106);
        setField(term5105, term5105.getClass(), "map", term5110);
        term5116 = new LinkedHashMap();
        ArrayList term11692 = new ArrayList();
        HashMap term11694 = new HashMap();
        term11691 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term11691, term11691.getClass(), "insertOrder", term11692);
        setField(term11691, term11691.getClass(), "map", term11694);
        term11695 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term5116;
        callMethod(klass, "putAll", argTypes, term5105, args);
        assertTrue(recursiveEquals(term5105, term11691));
        assertTrue(recursiveEquals(term5116, term11695));
    }

};


