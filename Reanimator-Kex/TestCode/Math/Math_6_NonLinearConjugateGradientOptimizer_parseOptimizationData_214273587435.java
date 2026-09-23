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

public class NonLinearConjugateGradientOptimizer_parseOptimizationData_214273587435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34942;
     Object term34676;

    public NonLinearConjugateGradientOptimizer_parseOptimizationData_214273587435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34942 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        term34676 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term35066 = newInstance(Class.forName("org.apache.commons.math3.optim.linear.NonNegativeConstraint"));
        Object term35158 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleBounds"));
        Object term35276 = newInstance(Class.forName("org.apache.commons.math3.optim.univariate.SearchInterval"));
        setElement(term34676, 0, term35066);
        setElement(term34676, 1, term35158);
        setElement(term34676, 2, term35276);
        setElement(term34676, 3, term35276);
        setElement(term34676, 4, term35276);
        setElement(term34676, 5, term35276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term34676;
        try {
            callMethod(klass, "parseOptimizationData", argTypes, term34942, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


