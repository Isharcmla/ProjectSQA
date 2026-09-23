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

public class FastMath_quadMult_14541592421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156;
     Object term159;
     Object term163;

    public FastMath_quadMult_14541592421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156 = (double[]) newDoubleArray(2);
        setDoubleElement(term156, 0, 0.6355029654528058);
        setDoubleElement(term156, 1, 0.0022646783892913414);
        term159 = (double[]) newDoubleArray(3);
        setDoubleElement(term159, 0, 0.36226058076369927);
        setDoubleElement(term159, 1, 0.03699061125289671);
        setDoubleElement(term159, 2, 0.6047137830113202);
        term163 = (double[]) newDoubleArray(1);
        setDoubleElement(term163, 0, 0.6767213143579776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.FastMath");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term156;
        args[1] = term159;
        args[2] = term163;
        callMethod(klass, "quadMult", argTypes, null, args);
    }

};


