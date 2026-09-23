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
import java.lang.Object;

public class NonLinearConjugateGradientOptimizer_parseOptimizationData_214273587461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53155;
     Object term52857;
     Object term53392;
     Object term53393;

    public NonLinearConjugateGradientOptimizer_parseOptimizationData_214273587461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53155 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        setField(term53155, term53155.getClass(), "start", null);
        term52857 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term53299 = newInstance(Class.forName("org.apache.commons.math3.optim.univariate.UnivariateObjectiveFunction"));
        setElement(term52857, 0, term53299);
        setElement(term52857, 1, term53299);
        setElement(term52857, 2, term53299);
        setElement(term52857, 3, term53299);
        setElement(term52857, 4, term53299);
        setElement(term52857, 5, term53299);
        term53392 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        setField(term53392, term53392.getClass(), "updateFormula", null);
        setField(term53392, term53392.getClass(), "preconditioner", null);
        setField(term53392, term53392.getClass(), "solver", null);
        setDoubleField(term53392, term53392.getClass(), "initialStep", 0.0);
        setField(term53392, term53392.getClass(), "gradient", null);
        setField(term53392, term53392.getClass(), "function", null);
        setField(term53392, term53392.getClass(), "goal", null);
        setField(term53392, term53392.getClass(), "start", null);
        setField(term53392, term53392.getClass(), "lowerBound", null);
        setField(term53392, term53392.getClass(), "upperBound", null);
        setField(term53392, term53392.getClass(), "evaluations", null);
        setField(term53392, term53392.getClass(), "iterations", null);
        setField(term53392, term53392.getClass(), "checker", null);
        term53393 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term53394 = newInstance(Class.forName("org.apache.commons.math3.optim.univariate.UnivariateObjectiveFunction"));
        setField(term53394, term53394.getClass(), "function", null);
        setElement(term53393, 0, term53394);
        setElement(term53393, 1, term53394);
        setElement(term53393, 2, term53394);
        setElement(term53393, 3, term53394);
        setElement(term53393, 4, term53394);
        setElement(term53393, 5, term53394);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term52857;
        callMethod(klass, "parseOptimizationData", argTypes, term53155, args);
        assertTrue(recursiveEquals(term53155, term53392));
        assertTrue(recursiveEquals(term52857, term53393));
    }

};


