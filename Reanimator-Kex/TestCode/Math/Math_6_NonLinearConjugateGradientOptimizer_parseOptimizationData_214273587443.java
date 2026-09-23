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

public class NonLinearConjugateGradientOptimizer_parseOptimizationData_214273587443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39103;
     Object term38863;

    public NonLinearConjugateGradientOptimizer_parseOptimizationData_214273587443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39103 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        term38863 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 5);
        Object term39185 = newInstance(Class.forName("org.apache.commons.math3.optim.MaxIter"));
        setElement(term38863, 0, term39185);
        setElement(term38863, 1, term39185);
        setElement(term38863, 2, term39185);
        setElement(term38863, 3, term39185);
        setElement(term38863, 4, term39185);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term38863;
        try {
            callMethod(klass, "parseOptimizationData", argTypes, term39103, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


