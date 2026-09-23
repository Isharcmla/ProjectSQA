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
import java.lang.Long;
import java.lang.Integer;

public class ArrayUtils_lastIndexOf_1164648821227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term562;
     Object term565;
     Object term567;
     Object term12667;

    public ArrayUtils_lastIndexOf_1164648821227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term562 = (long[]) newLongArray(2);
        setLongElement(term562, 0, 1233889271256172047L);
        setLongElement(term562, 1, 6617340557564669657L);
        term565 = new Long(1439298019805881866L);
        term567 = new Integer(767834723);
        term12667 = (long[]) newLongArray(2);
        setLongElement(term12667, 0, 1233889271256172047L);
        setLongElement(term12667, 1, 6617340557564669657L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = long.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term562;
        args[1] = term565;
        args[2] = term567;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term562, term12667));
        assertTrue(recursiveEquals(term565, 1439298019805881866L));
        assertTrue(recursiveEquals(term567, 767834723));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


