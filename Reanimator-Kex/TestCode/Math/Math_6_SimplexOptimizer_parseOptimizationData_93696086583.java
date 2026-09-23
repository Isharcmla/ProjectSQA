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

public class SimplexOptimizer_parseOptimizationData_93696086583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42840;
     Object term42120;
     Object term44095;
     Object term44097;

    public SimplexOptimizer_parseOptimizationData_93696086583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42840 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] term42122 = (double[]) newDoubleArray(489);
        setDoubleElement(term42122, 0, 2.0);
        setDoubleElement(term42122, 1, 2.0);
        setDoubleElement(term42122, 2, 2.0);
        setDoubleElement(term42122, 3, 2.0);
        setDoubleElement(term42122, 4, 2.0);
        setField(term42840, term42840.getClass(), "start", term42122);
        term42120 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term42976 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        setElement(term42120, 0, term42976);
        setElement(term42120, 1, term42976);
        setElement(term42120, 2, term42976);
        setElement(term42120, 3, term42976);
        term44095 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] term44096 = (double[]) newDoubleArray(489);
        setField(term44095, term44095.getClass(), "simplex", null);
        setField(term44095, term44095.getClass(), "function", null);
        setField(term44095, term44095.getClass(), "goal", null);
        setDoubleElement(term44096, 0, 2.0);
        setDoubleElement(term44096, 1, 2.0);
        setDoubleElement(term44096, 2, 2.0);
        setDoubleElement(term44096, 3, 2.0);
        setDoubleElement(term44096, 4, 2.0);
        setField(term44095, term44095.getClass(), "start", term44096);
        setField(term44095, term44095.getClass(), "lowerBound", null);
        setField(term44095, term44095.getClass(), "upperBound", null);
        setField(term44095, term44095.getClass(), "evaluations", null);
        setField(term44095, term44095.getClass(), "iterations", null);
        setField(term44095, term44095.getClass(), "checker", null);
        term44097 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term44098 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        setField(term44098, term44098.getClass(), "function", null);
        setElement(term44097, 0, term44098);
        setElement(term44097, 1, term44098);
        setElement(term44097, 2, term44098);
        setElement(term44097, 3, term44098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term42120;
        callMethod(klass, "parseOptimizationData", argTypes, term42840, args);
        assertTrue(recursiveEquals(term42840, term44095));
        assertTrue(recursiveEquals(term42120, term44097));
    }

};


