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
     Object term10005;
     Object term10008;
     Object term10009;

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
        term10005 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term10006 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 2);
        int[] term10007 = (int[]) newIntArray(6);
        setField(term10005, term10005.getClass(), "iChronology", null);
        setField(term10005, term10005.getClass(), "iTypes", term10006);
        setIntElement(term10007, 0, -1456670397);
        setIntElement(term10007, 1, 1622346318);
        setIntElement(term10007, 2, 1048535127);
        setIntElement(term10007, 3, -655067527);
        setIntElement(term10007, 4, -6029667);
        setIntElement(term10007, 5, -2068769794);
        setField(term10005, term10005.getClass(), "iValues", term10007);
        setField(term10005, term10005.getClass(), "iFormatter", null);
        term10008 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 2);
        term10009 = (int[]) newIntArray(6);
        setIntElement(term10009, 0, -1456670397);
        setIntElement(term10009, 1, 1622346318);
        setIntElement(term10009, 2, 1048535127);
        setIntElement(term10009, 3, -655067527);
        setIntElement(term10009, 4, -6029667);
        setIntElement(term10009, 5, -2068769794);
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
        assertTrue(recursiveEquals(instance, term10005));
        assertTrue(recursiveEquals(term216, term10008));
        assertTrue(recursiveEquals(term217, term10009));
    }

};


