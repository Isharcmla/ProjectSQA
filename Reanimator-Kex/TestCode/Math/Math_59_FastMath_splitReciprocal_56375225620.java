package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FastMath_splitReciprocal_56375225620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134;
     Object term140;

    public FastMath_splitReciprocal_56375225620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134 = (double[]) newDoubleArray(5);
        setDoubleElement(term134, 0, 0.43337207054070237);
        setDoubleElement(term134, 1, 0.13246999699526574);
        setDoubleElement(term134, 2, 0.9126850255993704);
        setDoubleElement(term134, 3, 0.11179067076100713);
        setDoubleElement(term134, 4, 0.5306473989087822);
        term140 = (double[]) newDoubleArray(5);
        setDoubleElement(term140, 0, 0.022483645678509023);
        setDoubleElement(term140, 1, 0.025133051616627267);
        setDoubleElement(term140, 2, 0.016575281023182953);
        setDoubleElement(term140, 3, 0.5308350402051779);
        setDoubleElement(term140, 4, 0.7154795600170818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.FastMath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term134;
        args[1] = term140;
        callMethod(klass, "splitReciprocal", argTypes, null, args);
    }

};


