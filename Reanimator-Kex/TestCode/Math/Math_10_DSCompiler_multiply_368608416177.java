package org.apache.commons.math3.analysis.differentiation;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math3.analysis.differentiation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DSCompiler_multiply_368608416177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term587755;
     Object term587530;

    public DSCompiler_multiply_368608416177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term587755 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term587536 = (Object[]) newArray("[[I", 1);
        Object[] term587537 = (Object[]) newArray("[I", 9);
        int[] term587538 = (int[]) newIntArray(18);
        setIntElement(term587538, 0, 8);
        setIntElement(term587538, 1, 8);
        setIntElement(term587538, 2, 8);
        setIntElement(term587538, 3, 8);
        setIntElement(term587538, 5, 8);
        setIntElement(term587538, 6, 8);
        setIntElement(term587538, 7, 8);
        setIntElement(term587538, 8, 8);
        setIntElement(term587538, 9, 8);
        setIntElement(term587538, 10, 8);
        setIntElement(term587538, 11, 8);
        setIntElement(term587538, 12, 8);
        setIntElement(term587538, 13, 8);
        setIntElement(term587538, 14, 8);
        setIntElement(term587538, 15, 8);
        setIntElement(term587538, 17, 8);
        setElement(term587537, 0, term587538);
        setElement(term587537, 1, term587538);
        setElement(term587537, 2, term587538);
        setElement(term587537, 3, term587538);
        setElement(term587537, 5, term587538);
        setElement(term587537, 6, term587538);
        setElement(term587537, 7, term587538);
        setElement(term587537, 8, term587538);
        setElement(term587536, 0, term587537);
        setField(term587755, term587755.getClass(), "multIndirection", term587536);
        term587530 = (double[]) newDoubleArray(2);
        setDoubleElement(term587530, 0, 8.0);
        setDoubleElement(term587530, 1, 8.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = int.class;
        argTypes[4] = Array.newInstance(double.class, 0).getClass();
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term587530;
        args[1] = 0;
        args[2] = null;
        args[3] = 0;
        args[4] = null;
        args[5] = 0;
        try {
            callMethod(klass, "multiply", argTypes, term587755, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


