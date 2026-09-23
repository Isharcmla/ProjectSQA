package org.apache.commons.math3.optimization.general;

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
import java.lang.NullPointerException;
import static org.apache.commons.math3.optimization.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class AbstractLeastSquaresOptimizer_optimize_122503935034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;
     Object term47;
     Object term49;
     Object term56;

    public AbstractLeastSquaresOptimizer_optimize_122503935034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45 = new Integer(568599855);
        term47 = (double[]) newDoubleArray(1);
        setDoubleElement(term47, 0, 0.4569171842750229);
        term49 = (double[]) newDoubleArray(6);
        setDoubleElement(term49, 0, 0.8598297828918529);
        setDoubleElement(term49, 1, 0.43692187681405226);
        setDoubleElement(term49, 2, 0.7633268466829064);
        setDoubleElement(term49, 3, 0.13481025392611334);
        setDoubleElement(term49, 4, 0.3800088629986428);
        setDoubleElement(term49, 5, 0.5840714198152577);
        term56 = (double[]) newDoubleArray(2);
        setDoubleElement(term56, 0, 0.7559240768573477);
        setDoubleElement(term56, 1, 0.10667076642995188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction");
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = Array.newInstance(double.class, 0).getClass();
        argTypes[4] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[5];
        args[0] = term45;
        args[1] = null;
        args[2] = term47;
        args[3] = term49;
        args[4] = term56;
        try {
            callMethod(klass, "optimize", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


