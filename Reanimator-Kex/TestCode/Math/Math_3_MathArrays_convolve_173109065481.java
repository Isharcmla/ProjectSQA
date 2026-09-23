package org.apache.commons.math3.util;

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
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.util.EqualityUtils.*;

public class MathArrays_convolve_173109065481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2376;
     Object term2382;
     Object term20287;
     Object term20288;
     Object term20281;

    public MathArrays_convolve_173109065481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2376 = (double[]) newDoubleArray(5);
        setDoubleElement(term2376, 0, 0.5652495059647745);
        setDoubleElement(term2376, 1, 0.021410850431387685);
        setDoubleElement(term2376, 2, 0.8397628091272534);
        setDoubleElement(term2376, 3, 0.01784667720947175);
        setDoubleElement(term2376, 4, 0.4395312828193261);
        term2382 = (double[]) newDoubleArray(1);
        setDoubleElement(term2382, 0, 0.5715204226647931);
        term20287 = (double[]) newDoubleArray(5);
        setDoubleElement(term20287, 0, 0.5652495059647745);
        setDoubleElement(term20287, 1, 0.021410850431387685);
        setDoubleElement(term20287, 2, 0.8397628091272534);
        setDoubleElement(term20287, 3, 0.01784667720947175);
        setDoubleElement(term20287, 4, 0.4395312828193261);
        term20288 = (double[]) newDoubleArray(1);
        setDoubleElement(term20288, 0, 0.5715204226647931);
        term20281 = (double[]) newDoubleArray(5);
        setDoubleElement(term20281, 0, 0.3230516365600534);
        setDoubleElement(term20281, 1, 0.012236738288159356);
        setDoubleElement(term20281, 2, 0.47994159561058186);
        setDoubleElement(term20281, 3, 0.010199740501919425);
        setDoubleElement(term20281, 4, 0.25120110453129996);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2376;
        args[1] = term2382;
        Object retValue = callMethod(klass, "convolve", argTypes, null, args);
        assertTrue(recursiveEquals(term2376, term20287));
        assertTrue(recursiveEquals(term2382, term20288));
        assertTrue(recursiveEquals(retValue, term20281));
    }

};


