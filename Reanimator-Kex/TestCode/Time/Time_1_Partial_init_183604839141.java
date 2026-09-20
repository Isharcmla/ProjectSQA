package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;
import java.lang.Object;

public class Partial_init_183604839141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216;
     Object term217;
     Object term15352;
     Object term15355;
     Object term15356;

    public Partial_init_183604839141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 2);
        term217 = (int[]) newIntArray(6);
        setIntElement(term217, 0, -1456670397);
        setIntElement(term217, 1, 1622346318);
        setIntElement(term217, 2, 1048535127);
        setIntElement(term217, 3, -655067527);
        setIntElement(term217, 4, -6029667);
        setIntElement(term217, 5, -2068769794);
        term15352 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term15353 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 2);
        int[] term15354 = (int[]) newIntArray(6);
        setField(term15352, term15352.getClass(), "iChronology", null);
        setField(term15352, term15352.getClass(), "iTypes", term15353);
        setIntElement(term15354, 0, -1456670397);
        setIntElement(term15354, 1, 1622346318);
        setIntElement(term15354, 2, 1048535127);
        setIntElement(term15354, 3, -655067527);
        setIntElement(term15354, 4, -6029667);
        setIntElement(term15354, 5, -2068769794);
        setField(term15352, term15352.getClass(), "iValues", term15354);
        setField(term15352, term15352.getClass(), "iFormatter", null);
        term15355 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 2);
        term15356 = (int[]) newIntArray(6);
        setIntElement(term15356, 0, -1456670397);
        setIntElement(term15356, 1, 1622346318);
        setIntElement(term15356, 2, 1048535127);
        setIntElement(term15356, 3, -655067527);
        setIntElement(term15356, 4, -6029667);
        setIntElement(term15356, 5, -2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.Chronology");
        argTypes[1] = Array.newInstance(Class.forName("org.joda.time.DateTimeFieldType"), 0).getClass();
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term216;
        args[2] = term217;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term15352));
        assertTrue(recursiveEquals(term216, term15355));
        assertTrue(recursiveEquals(term217, term15356));
    }

};
