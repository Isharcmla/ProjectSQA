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
import java.lang.Integer;
import java.util.LinkedHashMap;

public class ListOrderedMap_putAll_26653313040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5127;
     Object term5138;
     Object term5140;
     Object term11716;
     Object term11720;

    public ListOrderedMap_putAll_26653313040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5128 = new ArrayList();
        HashMap term5132 = new HashMap();
        term5127 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term5127, term5127.getClass(), "insertOrder", term5128);
        setField(term5127, term5127.getClass(), "map", term5132);
        term5138 = new Integer(-1371869594);
        term5140 = new LinkedHashMap();
        ArrayList term11717 = new ArrayList();
        HashMap term11719 = new HashMap();
        term11716 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term11716, term11716.getClass(), "insertOrder", term11717);
        setField(term11716, term11716.getClass(), "map", term11719);
        term11720 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.Map");
        Object[] args = new Object[2];
        args[0] = term5138;
        args[1] = term5140;
        callMethod(klass, "putAll", argTypes, term5127, args);
        assertTrue(recursiveEquals(term5127, term11716));
        assertTrue(recursiveEquals(term5138, -1371869594));
        assertTrue(recursiveEquals(term5140, term11720));
    }

};


