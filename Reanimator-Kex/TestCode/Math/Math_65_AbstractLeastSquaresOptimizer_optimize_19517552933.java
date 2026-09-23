package org.apache.commons.math.optimization.general;

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
import static org.apache.commons.math.optimization.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AbstractLeastSquaresOptimizer_optimize_19517552933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term11;
     Object term16;

    public AbstractLeastSquaresOptimizer_optimize_19517552933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = (double[]) newDoubleArray(5);
        setDoubleElement(term5, 0, 0.13238746331190498);
        setDoubleElement(term5, 1, 0.3455959125047594);
        setDoubleElement(term5, 2, 0.5523635872663106);
        setDoubleElement(term5, 3, 0.544608645520025);
        setDoubleElement(term5, 4, 0.28570734989730284);
        term11 = (double[]) newDoubleArray(4);
        setDoubleElement(term11, 0, 0.40176586625454525);
        setDoubleElement(term11, 1, 0.2641345529914265);
        setDoubleElement(term11, 2, 0.36923381893433327);
        setDoubleElement(term11, 3, 0.6076495596892013);
        term16 = (double[]) newDoubleArray(3);
        setDoubleElement(term16, 0, 0.37773193782763337);
        setDoubleElement(term16, 1, 0.8474802076607362);
        setDoubleElement(term16, 2, 0.5183269973490326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction");
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term5;
        args[2] = term11;
        args[3] = term16;
        try {
            callMethod(klass, "optimize", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


