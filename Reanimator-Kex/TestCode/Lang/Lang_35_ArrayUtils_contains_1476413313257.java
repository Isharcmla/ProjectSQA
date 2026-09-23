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
import java.lang.Double;

public class ArrayUtils_contains_1476413313257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term938;
     Object term945;
     Object term13626;

    public ArrayUtils_contains_1476413313257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term938 = (double[]) newDoubleArray(6);
        setDoubleElement(term938, 0, 0.3227335400819148);
        setDoubleElement(term938, 1, 0.43337207054070237);
        setDoubleElement(term938, 2, 0.13246999699526574);
        setDoubleElement(term938, 3, 0.9126850255993704);
        setDoubleElement(term938, 4, 0.11179067076100713);
        setDoubleElement(term938, 5, 0.5306473989087822);
        term945 = new Double(0.022483645678509023);
        term13626 = (double[]) newDoubleArray(6);
        setDoubleElement(term13626, 0, 0.3227335400819148);
        setDoubleElement(term13626, 1, 0.43337207054070237);
        setDoubleElement(term13626, 2, 0.13246999699526574);
        setDoubleElement(term13626, 3, 0.9126850255993704);
        setDoubleElement(term13626, 4, 0.11179067076100713);
        setDoubleElement(term13626, 5, 0.5306473989087822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term938;
        args[1] = term945;
        Object retValue = callMethod(klass, "contains", argTypes, null, args);
        assertTrue(recursiveEquals(term938, term13626));
        assertTrue(recursiveEquals(term945, 0.022483645678509023));
        assertTrue(recursiveEquals(retValue, false));
    }

};


