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

public class NonLinearConjugateGradientOptimizer_optimize_201200747727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28968;
     Object term28698;

    public NonLinearConjugateGradientOptimizer_optimize_201200747727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28968 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        setField(term28968, term28968.getClass(), "start", null);
        term28698 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term29096 = newInstance(Class.forName("org.apache.commons.math3.optim.linear.LinearObjectiveFunction"));
        setElement(term28698, 0, term29096);
        setElement(term28698, 1, term29096);
        setElement(term28698, 2, term29096);
        setElement(term28698, 3, term29096);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term28698;
        try {
            callMethod(klass, "optimize", argTypes, term28968, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


