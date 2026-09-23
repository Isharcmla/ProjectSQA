package org.apache.commons.math3.optim.nonlinear.scalar.gradient;

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
import static org.apache.commons.math3.optim.nonlinear.scalar.gradient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NonLinearConjugateGradientOptimizer_optimize_201200747749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42283;
     Object term42032;

    public NonLinearConjugateGradientOptimizer_optimize_201200747749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42283 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        term42032 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term42427 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian"));
        Object term42519 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleBounds"));
        setElement(term42032, 0, term42427);
        setElement(term42032, 1, term42519);
        setElement(term42032, 2, term42427);
        setElement(term42032, 3, term42427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term42032;
        try {
            callMethod(klass, "optimize", argTypes, term42283, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


