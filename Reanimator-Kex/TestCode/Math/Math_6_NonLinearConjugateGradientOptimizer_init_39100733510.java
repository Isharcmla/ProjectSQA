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
import static org.apache.commons.math3.optim.nonlinear.scalar.gradient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optim.nonlinear.scalar.gradient.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class NonLinearConjugateGradientOptimizer_init_39100733510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum16;
     Object term8498;
     Object enum18;

    public NonLinearConjugateGradientOptimizer_init_39100733510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8510 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula");
        Field term8509 = ((Class) term8510).getDeclaredField((String) "FLETCHER_REEVES");
        ((Field) term8509).setAccessible(true);
        enum16 = ((Field) term8509).get((Object) null);
        Class<? extends Object> term9062 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula");
        Field term9061 = ((Class) term9062).getDeclaredField((String) "FLETCHER_REEVES");
        ((Field) term9061).setAccessible(true);
        Object enum17 = ((Field) term9061).get((Object) null);
        term8498 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        Object term8502 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term8503 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback"));
        Object term8504 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term8505 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback"));
        setField(term8498, term8498.getClass(), "updateFormula", enum17);
        setField(term8498, term8498.getClass(), "preconditioner", null);
        setField(term8498, term8498.getClass(), "solver", null);
        setDoubleField(term8498, term8498.getClass(), "initialStep", 1.0);
        setField(term8498, term8498.getClass(), "gradient", null);
        setField(term8498, term8498.getClass(), "function", null);
        setField(term8498, term8498.getClass(), "goal", null);
        setField(term8498, term8498.getClass(), "start", null);
        setField(term8498, term8498.getClass(), "lowerBound", null);
        setField(term8498, term8498.getClass(), "upperBound", null);
        setIntField(term8502, term8502.getClass(), "maximalCount", 0);
        setIntField(term8502, term8502.getClass(), "count", 0);
        setField(term8502, term8502.getClass(), "maxCountCallback", term8503);
        setField(term8498, term8498.getClass(), "evaluations", term8502);
        setIntField(term8504, term8504.getClass(), "maximalCount", 0);
        setIntField(term8504, term8504.getClass(), "count", 0);
        setField(term8504, term8504.getClass(), "maxCountCallback", term8505);
        setField(term8498, term8498.getClass(), "iterations", term8504);
        setField(term8498, term8498.getClass(), "checker", null);
        Class<? extends Object> term9614 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula");
        Field term9613 = ((Class) term9614).getDeclaredField((String) "FLETCHER_REEVES");
        ((Field) term9613).setAccessible(true);
        enum18 = ((Field) term9613).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula");
        argTypes[1] = Class.forName("org.apache.commons.math3.optim.ConvergenceChecker");
        argTypes[2] = Class.forName("org.apache.commons.math3.analysis.solvers.UnivariateSolver");
        argTypes[3] = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner");
        Object[] args = new Object[4];
        args[0] = enum16;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8498));
        assertTrue(recursiveEquals(enum16, null));
    }

};


