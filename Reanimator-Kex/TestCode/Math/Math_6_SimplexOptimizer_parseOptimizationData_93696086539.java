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

public class SimplexOptimizer_parseOptimizationData_93696086539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17130;
     Object term16951;
     Object term17594;
     Object term17595;

    public SimplexOptimizer_parseOptimizationData_93696086539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17130 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        term16951 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 2);
        Object term17282 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunctionGradient"));
        setElement(term16951, 0, term17282);
        setElement(term16951, 1, term17282);
        term17594 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term17594, term17594.getClass(), "simplex", null);
        setField(term17594, term17594.getClass(), "function", null);
        setField(term17594, term17594.getClass(), "goal", null);
        setField(term17594, term17594.getClass(), "start", null);
        setField(term17594, term17594.getClass(), "lowerBound", null);
        setField(term17594, term17594.getClass(), "upperBound", null);
        setField(term17594, term17594.getClass(), "evaluations", null);
        setField(term17594, term17594.getClass(), "iterations", null);
        setField(term17594, term17594.getClass(), "checker", null);
        term17595 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 2);
        Object term17596 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunctionGradient"));
        setField(term17596, term17596.getClass(), "gradient", null);
        setElement(term17595, 0, term17596);
        setElement(term17595, 1, term17596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term16951;
        callMethod(klass, "parseOptimizationData", argTypes, term17130, args);
        assertTrue(recursiveEquals(term17130, term17594));
        assertTrue(recursiveEquals(term16951, term17595));
    }

};


