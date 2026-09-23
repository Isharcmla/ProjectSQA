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

public class ListOrderedMap_toString_207700258948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5377;
     Object term11950;

    public ListOrderedMap_toString_207700258948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5378 = new ArrayList();
        HashMap term5382 = new HashMap();
        term5377 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term5377, term5377.getClass(), "insertOrder", term5378);
        setField(term5377, term5377.getClass(), "map", term5382);
        ArrayList term11951 = new ArrayList();
        HashMap term11953 = new HashMap();
        term11950 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term11950, term11950.getClass(), "insertOrder", term11951);
        setField(term11950, term11950.getClass(), "map", term11953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term5377, args);
        assertTrue(recursiveEquals(term5377, term11950));
        assertTrue(recursiveEquals(retValue, "{}"));
    }

};


