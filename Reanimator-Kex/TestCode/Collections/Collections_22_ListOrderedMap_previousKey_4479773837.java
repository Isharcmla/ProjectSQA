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

public class ListOrderedMap_previousKey_4479773837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5052;
     Object term5063;
     Object term11618;
     Object term11622;

    public ListOrderedMap_previousKey_4479773837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5053 = new ArrayList();
        HashMap term5057 = new HashMap();
        term5052 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term5052, term5052.getClass(), "insertOrder", term5053);
        setField(term5052, term5052.getClass(), "map", term5057);
        term5063 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term11619 = new ArrayList();
        HashMap term11621 = new HashMap();
        term11618 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term11618, term11618.getClass(), "insertOrder", term11619);
        setField(term11618, term11618.getClass(), "map", term11621);
        term11622 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5063;
        Object retValue = callMethod(klass, "previousKey", argTypes, term5052, args);
        assertTrue(recursiveEquals(term5052, term11618));
        assertTrue(recursiveEquals(term5063, term11622));
        assertTrue(recursiveEquals(retValue, null));
    }

};


