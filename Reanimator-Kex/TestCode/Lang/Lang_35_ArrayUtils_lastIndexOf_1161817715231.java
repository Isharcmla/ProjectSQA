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

public class ArrayUtils_lastIndexOf_1161817715231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term596;
     Object term604;
     Object term12771;

    public ArrayUtils_lastIndexOf_1161817715231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term596 = (int[]) newIntArray(7);
        setIntElement(term596, 0, -1968847291);
        setIntElement(term596, 1, 579005622);
        setIntElement(term596, 2, -14890619);
        setIntElement(term596, 3, 1632125673);
        setIntElement(term596, 4, 454281060);
        setIntElement(term596, 5, -1786399638);
        setIntElement(term596, 6, 2055867847);
        term604 = new Integer(-1048298087);
        term12771 = (int[]) newIntArray(7);
        setIntElement(term12771, 0, -1968847291);
        setIntElement(term12771, 1, 579005622);
        setIntElement(term12771, 2, -14890619);
        setIntElement(term12771, 3, 1632125673);
        setIntElement(term12771, 4, 454281060);
        setIntElement(term12771, 5, -1786399638);
        setIntElement(term12771, 6, 2055867847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term596;
        args[1] = term604;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term596, term12771));
        assertTrue(recursiveEquals(term604, -1048298087));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


