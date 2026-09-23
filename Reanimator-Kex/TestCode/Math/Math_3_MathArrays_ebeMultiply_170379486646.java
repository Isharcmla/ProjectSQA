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
import org.apache.commons.math3.exception.DimensionMismatchException;
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MathArrays_ebeMultiply_170379486646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57;
     Object term60;

    public MathArrays_ebeMultiply_170379486646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57 = (double[]) newDoubleArray(2);
        setDoubleElement(term57, 0, 0.3800088629986428);
        setDoubleElement(term57, 1, 0.5840714198152577);
        term60 = (double[]) newDoubleArray(6);
        setDoubleElement(term60, 0, 0.7559240768573477);
        setDoubleElement(term60, 1, 0.10667076642995188);
        setDoubleElement(term60, 2, 0.11493000848982304);
        setDoubleElement(term60, 3, 0.37161417339133307);
        setDoubleElement(term60, 4, 0.6805867182029153);
        setDoubleElement(term60, 5, 0.2852810965221698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term57;
        args[1] = term60;
        try {
            callMethod(klass, "ebeMultiply", argTypes, null, args);
            assertTrue(false);
        }
        catch (DimensionMismatchException e) {
        }

    }

};


