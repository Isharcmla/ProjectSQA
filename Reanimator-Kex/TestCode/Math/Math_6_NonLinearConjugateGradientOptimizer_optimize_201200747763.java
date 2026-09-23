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

public class NonLinearConjugateGradientOptimizer_optimize_201200747763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53713;
     Object term53396;

    public NonLinearConjugateGradientOptimizer_optimize_201200747763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53713 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        setField(term53713, term53713.getClass(), "start", null);
        term53396 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term53805 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleBounds"));
        Object term53957 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunctionGradient"));
        Object term54071 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        setElement(term53396, 0, term53805);
        setElement(term53396, 1, term53957);
        setElement(term53396, 2, term54071);
        setElement(term53396, 3, term54071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term53396;
        try {
            callMethod(klass, "optimize", argTypes, term53713, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


