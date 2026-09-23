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
import java.util.LinkedHashMap;
import java.util.ArrayList;

public class ListOrderedMap_init_140180085630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26;
     Object term5653;
     Object term5658;

    public ListOrderedMap_init_140180085630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26 = new LinkedHashMap();
        ArrayList term5654 = new ArrayList();
        LinkedHashMap term5656 = new LinkedHashMap();
        term5653 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term5653, term5653.getClass(), "insertOrder", term5654);
        setField(term5653, term5653.getClass(), "map", term5656);
        term5658 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term26;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5653));
        assertTrue(recursiveEquals(term26, term5658));
    }

};


