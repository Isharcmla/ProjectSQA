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
import java.lang.Integer;

public class ArrayUtils_subarray_115005125190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128;
     Object term135;
     Object term137;
     Object term11138;
     Object term11122;

    public ArrayUtils_subarray_115005125190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128 = (int[]) newIntArray(6);
        setIntElement(term128, 0, -2038273078);
        setIntElement(term128, 1, 1227103734);
        setIntElement(term128, 2, -1339778481);
        setIntElement(term128, 3, 1725571209);
        setIntElement(term128, 4, -522618178);
        setIntElement(term128, 5, 1134449235);
        term135 = new Integer(-883034806);
        term137 = new Integer(1585847225);
        term11138 = (int[]) newIntArray(6);
        setIntElement(term11138, 0, -2038273078);
        setIntElement(term11138, 1, 1227103734);
        setIntElement(term11138, 2, -1339778481);
        setIntElement(term11138, 3, 1725571209);
        setIntElement(term11138, 4, -522618178);
        setIntElement(term11138, 5, 1134449235);
        term11122 = (int[]) newIntArray(6);
        setIntElement(term11122, 0, -2038273078);
        setIntElement(term11122, 1, 1227103734);
        setIntElement(term11122, 2, -1339778481);
        setIntElement(term11122, 3, 1725571209);
        setIntElement(term11122, 4, -522618178);
        setIntElement(term11122, 5, 1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term128;
        args[1] = term135;
        args[2] = term137;
        Object retValue = callMethod(klass, "subarray", argTypes, null, args);
        assertTrue(recursiveEquals(term128, term11138));
        assertTrue(recursiveEquals(term135, -883034806));
        assertTrue(recursiveEquals(term137, 1585847225));
        assertTrue(recursiveEquals(retValue, term11122));
    }

};


