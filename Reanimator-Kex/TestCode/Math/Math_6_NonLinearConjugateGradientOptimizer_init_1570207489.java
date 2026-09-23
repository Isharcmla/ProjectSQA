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

public class NonLinearConjugateGradientOptimizer_init_1570207489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum13;
     Object term6790;
     Object enum15;

    public NonLinearConjugateGradientOptimizer_init_1570207489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6803 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula");
        Field term6802 = ((Class) term6803).getDeclaredField((String) "FLETCHER_REEVES");
        ((Field) term6802).setAccessible(true);
        enum13 = ((Field) term6802).get((Object) null);
        Class<? extends Object> term7355 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula");
        Field term7354 = ((Class) term7355).getDeclaredField((String) "FLETCHER_REEVES");
        ((Field) term7354).setAccessible(true);
        Object enum14 = ((Field) term7354).get((Object) null);
        term6790 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        Object term6794 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$IdentityPreconditioner"));
        Object term6795 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term6796 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback"));
        Object term6797 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term6798 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback"));
        setField(term6790, term6790.getClass(), "updateFormula", enum14);
        setField(term6790, term6790.getClass(), "preconditioner", term6794);
        setField(term6790, term6790.getClass(), "solver", null);
        setDoubleField(term6790, term6790.getClass(), "initialStep", 1.0);
        setField(term6790, term6790.getClass(), "gradient", null);
        setField(term6790, term6790.getClass(), "function", null);
        setField(term6790, term6790.getClass(), "goal", null);
        setField(term6790, term6790.getClass(), "start", null);
        setField(term6790, term6790.getClass(), "lowerBound", null);
        setField(term6790, term6790.getClass(), "upperBound", null);
        setIntField(term6795, term6795.getClass(), "maximalCount", 0);
        setIntField(term6795, term6795.getClass(), "count", 0);
        setField(term6795, term6795.getClass(), "maxCountCallback", term6796);
        setField(term6790, term6790.getClass(), "evaluations", term6795);
        setIntField(term6797, term6797.getClass(), "maximalCount", 0);
        setIntField(term6797, term6797.getClass(), "count", 0);
        setField(term6797, term6797.getClass(), "maxCountCallback", term6798);
        setField(term6790, term6790.getClass(), "iterations", term6797);
        setField(term6790, term6790.getClass(), "checker", null);
        Class<? extends Object> term7907 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula");
        Field term7906 = ((Class) term7907).getDeclaredField((String) "FLETCHER_REEVES");
        ((Field) term7906).setAccessible(true);
        enum15 = ((Field) term7906).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula");
        argTypes[1] = Class.forName("org.apache.commons.math3.optim.ConvergenceChecker");
        argTypes[2] = Class.forName("org.apache.commons.math3.analysis.solvers.UnivariateSolver");
        Object[] args = new Object[3];
        args[0] = enum13;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term6790));
        assertTrue(recursiveEquals(enum13, null));
    }

};


