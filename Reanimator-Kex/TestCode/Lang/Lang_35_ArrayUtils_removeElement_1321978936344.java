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

public class ArrayUtils_removeElement_1321978936344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1926;
     Object term1928;
     Object term25930;
     Object term25928;

    public ArrayUtils_removeElement_1321978936344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1926 = (int[]) newIntArray(1);
        setIntElement(term1926, 0, -1222006000);
        term1928 = new Integer(2095798786);
        term25930 = (int[]) newIntArray(1);
        setIntElement(term25930, 0, -1222006000);
        term25928 = (int[]) newIntArray(1);
        setIntElement(term25928, 0, -1222006000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1926;
        args[1] = term1928;
        Object retValue = callMethod(klass, "removeElement", argTypes, null, args);
        assertTrue(recursiveEquals(term1926, term25930));
        assertTrue(recursiveEquals(term1928, 2095798786));
        assertTrue(recursiveEquals(retValue, term25928));
    }

};


