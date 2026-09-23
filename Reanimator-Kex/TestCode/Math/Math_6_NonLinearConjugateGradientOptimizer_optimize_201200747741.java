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

public class NonLinearConjugateGradientOptimizer_optimize_201200747741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37563;
     Object term37224;

    public NonLinearConjugateGradientOptimizer_optimize_201200747741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37563 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        setField(term37563, term37563.getClass(), "start", null);
        term37224 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term37645 = newInstance(Class.forName("org.apache.commons.math3.optim.MaxIter"));
        Object term37865 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$BracketingStep"));
        setElement(term37224, 0, term37645);
        setElement(term37224, 1, term37865);
        setElement(term37224, 2, term37645);
        setElement(term37224, 3, term37645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term37224;
        try {
            callMethod(klass, "optimize", argTypes, term37563, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


