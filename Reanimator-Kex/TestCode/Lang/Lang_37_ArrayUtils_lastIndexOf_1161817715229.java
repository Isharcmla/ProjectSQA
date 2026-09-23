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

public class ArrayUtils_lastIndexOf_1161817715229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term585;
     Object term593;
     Object term12725;

    public ArrayUtils_lastIndexOf_1161817715229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term585 = (int[]) newIntArray(7);
        setIntElement(term585, 0, -1968847291);
        setIntElement(term585, 1, 579005622);
        setIntElement(term585, 2, -14890619);
        setIntElement(term585, 3, 1632125673);
        setIntElement(term585, 4, 454281060);
        setIntElement(term585, 5, -1786399638);
        setIntElement(term585, 6, 2055867847);
        term593 = new Integer(-1048298087);
        term12725 = (int[]) newIntArray(7);
        setIntElement(term12725, 0, -1968847291);
        setIntElement(term12725, 1, 579005622);
        setIntElement(term12725, 2, -14890619);
        setIntElement(term12725, 3, 1632125673);
        setIntElement(term12725, 4, 454281060);
        setIntElement(term12725, 5, -1786399638);
        setIntElement(term12725, 6, 2055867847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term585;
        args[1] = term593;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term585, term12725));
        assertTrue(recursiveEquals(term593, -1048298087));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


