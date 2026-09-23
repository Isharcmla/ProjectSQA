package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

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
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.EqualityUtils.*;
import java.lang.Object;

public class SimplexOptimizer_parseOptimizationData_936960865118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73133;
     Object term72892;
     Object term83380;
     Object term83381;

    public SimplexOptimizer_parseOptimizationData_936960865118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73133 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term73133, term73133.getClass(), "start", null);
        term72892 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term73269 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        Object term73421 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunctionGradient"));
        setElement(term72892, 0, term73269);
        setElement(term72892, 1, term73421);
        setElement(term72892, 2, term73421);
        setElement(term72892, 3, term73421);
        term83380 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term83380, term83380.getClass(), "simplex", null);
        setField(term83380, term83380.getClass(), "function", null);
        setField(term83380, term83380.getClass(), "goal", null);
        setField(term83380, term83380.getClass(), "start", null);
        setField(term83380, term83380.getClass(), "lowerBound", null);
        setField(term83380, term83380.getClass(), "upperBound", null);
        setField(term83380, term83380.getClass(), "evaluations", null);
        setField(term83380, term83380.getClass(), "iterations", null);
        setField(term83380, term83380.getClass(), "checker", null);
        term83381 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term83382 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        Object term83383 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunctionGradient"));
        setField(term83382, term83382.getClass(), "function", null);
        setElement(term83381, 0, term83382);
        setField(term83383, term83383.getClass(), "gradient", null);
        setElement(term83381, 1, term83383);
        setElement(term83381, 2, term83383);
        setElement(term83381, 3, term83383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term72892;
        callMethod(klass, "parseOptimizationData", argTypes, term73133, args);
        assertTrue(recursiveEquals(term73133, term83380));
        assertTrue(recursiveEquals(term72892, term83381));
    }

};


