package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Object;

public class ArrayUtils_toArray_778505440180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33;
     Object term10657;

    public ArrayUtils_toArray_778505440180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33 = (Object[]) newArray("java.lang.Object", 10);
        Object term34 = newInstance(Class.forName("java.lang.Object"));
        Object term35 = newInstance(Class.forName("java.lang.Object"));
        Object term36 = newInstance(Class.forName("java.lang.Object"));
        Object term37 = newInstance(Class.forName("java.lang.Object"));
        Object term38 = newInstance(Class.forName("java.lang.Object"));
        Object term39 = newInstance(Class.forName("java.lang.Object"));
        Object term40 = newInstance(Class.forName("java.lang.Object"));
        Object term41 = newInstance(Class.forName("java.lang.Object"));
        Object term42 = newInstance(Class.forName("java.lang.Object"));
        Object term43 = newInstance(Class.forName("java.lang.Object"));
        setElement(term33, 0, term34);
        setElement(term33, 1, term35);
        setElement(term33, 2, term36);
        setElement(term33, 3, term37);
        setElement(term33, 4, term38);
        setElement(term33, 5, term39);
        setElement(term33, 6, term40);
        setElement(term33, 7, term41);
        setElement(term33, 8, term42);
        setElement(term33, 9, term43);
        term10657 = (Object[]) newArray("java.lang.Object", 10);
        Object term10658 = newInstance(Class.forName("java.lang.Object"));
        Object term10659 = newInstance(Class.forName("java.lang.Object"));
        Object term10660 = newInstance(Class.forName("java.lang.Object"));
        Object term10661 = newInstance(Class.forName("java.lang.Object"));
        Object term10662 = newInstance(Class.forName("java.lang.Object"));
        Object term10663 = newInstance(Class.forName("java.lang.Object"));
        Object term10664 = newInstance(Class.forName("java.lang.Object"));
        Object term10665 = newInstance(Class.forName("java.lang.Object"));
        Object term10666 = newInstance(Class.forName("java.lang.Object"));
        Object term10667 = newInstance(Class.forName("java.lang.Object"));
        setElement(term10657, 0, term10658);
        setElement(term10657, 1, term10659);
        setElement(term10657, 2, term10660);
        setElement(term10657, 3, term10661);
        setElement(term10657, 4, term10662);
        setElement(term10657, 5, term10663);
        setElement(term10657, 6, term10664);
        setElement(term10657, 7, term10665);
        setElement(term10657, 8, term10666);
        setElement(term10657, 9, term10667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term33;
        callMethod(klass, "toArray", argTypes, null, args);
        assertTrue(recursiveEquals(term33, term10657));
    }

};


