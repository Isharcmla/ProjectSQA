package org.apache.commons.math.linear;

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
import org.apache.commons.math.exception.DimensionMismatchException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OpenMapRealVector_getL1Distance_154404806297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6396;
     Object term6503;

    public OpenMapRealVector_getL1Distance_154404806297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6396 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term6397 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term6398 = (int[]) newIntArray(32);
        double[] term6431 = (double[]) newDoubleArray(32);
        byte[] term6464 = (byte[]) newByteArray(32);
        setField(term6397, term6397.getClass(), "keys", term6398);
        setField(term6397, term6397.getClass(), "values", term6431);
        setField(term6397, term6397.getClass(), "states", term6464);
        setDoubleField(term6397, term6397.getClass(), "missingEntries", 0.0);
        setIntField(term6397, term6397.getClass(), "size", 0);
        setIntField(term6397, term6397.getClass(), "mask", 31);
        setIntField(term6397, term6397.getClass(), "count", 0);
        setField(term6396, term6396.getClass(), "entries", term6397);
        setIntField(term6396, term6396.getClass(), "virtualSize", 767834723);
        setDoubleField(term6396, term6396.getClass(), "epsilon", 1.0E-12);
        term6503 = (double[]) newDoubleArray(7);
        setDoubleElement(term6503, 0, 0.37161417339133307);
        setDoubleElement(term6503, 1, 0.6805867182029153);
        setDoubleElement(term6503, 2, 0.2852810965221698);
        setDoubleElement(term6503, 3, 0.6300849762307866);
        setDoubleElement(term6503, 4, 0.9737083944266686);
        setDoubleElement(term6503, 5, 0.0668892744806211);
        setDoubleElement(term6503, 6, 0.3587267442738795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term6503;
        try {
            callMethod(klass, "getL1Distance", argTypes, term6396, args);
            assertTrue(false);
        }
        catch (DimensionMismatchException e) {
        }

    }

};


