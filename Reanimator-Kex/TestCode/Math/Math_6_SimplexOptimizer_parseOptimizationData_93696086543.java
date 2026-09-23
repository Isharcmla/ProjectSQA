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

public class SimplexOptimizer_parseOptimizationData_93696086543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19017;
     Object term18845;
     Object term19181;
     Object term19182;

    public SimplexOptimizer_parseOptimizationData_93696086543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19017 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        term18845 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 1);
        Object term19161 = newInstance(Class.forName("org.apache.commons.math3.optim.univariate.UnivariateObjectiveFunction"));
        setElement(term18845, 0, term19161);
        term19181 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term19181, term19181.getClass(), "simplex", null);
        setField(term19181, term19181.getClass(), "function", null);
        setField(term19181, term19181.getClass(), "goal", null);
        setField(term19181, term19181.getClass(), "start", null);
        setField(term19181, term19181.getClass(), "lowerBound", null);
        setField(term19181, term19181.getClass(), "upperBound", null);
        setField(term19181, term19181.getClass(), "evaluations", null);
        setField(term19181, term19181.getClass(), "iterations", null);
        setField(term19181, term19181.getClass(), "checker", null);
        term19182 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 1);
        Object term19183 = newInstance(Class.forName("org.apache.commons.math3.optim.univariate.UnivariateObjectiveFunction"));
        setField(term19183, term19183.getClass(), "function", null);
        setElement(term19182, 0, term19183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term18845;
        callMethod(klass, "parseOptimizationData", argTypes, term19017, args);
        assertTrue(recursiveEquals(term19017, term19181));
        assertTrue(recursiveEquals(term18845, term19182));
    }

};


