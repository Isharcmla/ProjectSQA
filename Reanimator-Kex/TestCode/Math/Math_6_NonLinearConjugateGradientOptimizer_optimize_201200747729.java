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
import java.lang.String;

public class NonLinearConjugateGradientOptimizer_optimize_201200747729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29642;
     Object term29393;

    public NonLinearConjugateGradientOptimizer_optimize_201200747729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29642 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        Class<? extends Object> term31158 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term31157 = ((Class) term31158).getDeclaredField((String) "MAXIMIZE");
        ((Field) term31157).setAccessible(true);
        Object enum38 = ((Field) term31157).get((Object) null);
        term29393 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term29852 = newInstance(Class.forName("org.apache.commons.math3.optim.InitialGuess"));
        setElement(term29393, 0, enum38);
        setElement(term29393, 1, term29852);
        setElement(term29393, 2, enum38);
        setElement(term29393, 3, enum38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term29393;
        try {
            callMethod(klass, "optimize", argTypes, term29642, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


