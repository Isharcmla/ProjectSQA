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

public class SimplexOptimizer_parseOptimizationData_93696086595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50799;
     Object term50516;
     Object term51140;
     Object term51141;

    public SimplexOptimizer_parseOptimizationData_93696086595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50799 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term50799, term50799.getClass(), "start", null);
        term50516 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term50927 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.ModelFunction"));
        Object term51063 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        setElement(term50516, 0, term50927);
        setElement(term50516, 1, term50927);
        setElement(term50516, 2, term51063);
        setElement(term50516, 3, term50927);
        setElement(term50516, 4, term50927);
        setElement(term50516, 5, term50927);
        term51140 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term51140, term51140.getClass(), "simplex", null);
        setField(term51140, term51140.getClass(), "function", null);
        setField(term51140, term51140.getClass(), "goal", null);
        setField(term51140, term51140.getClass(), "start", null);
        setField(term51140, term51140.getClass(), "lowerBound", null);
        setField(term51140, term51140.getClass(), "upperBound", null);
        setField(term51140, term51140.getClass(), "evaluations", null);
        setField(term51140, term51140.getClass(), "iterations", null);
        setField(term51140, term51140.getClass(), "checker", null);
        term51141 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term51142 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.ModelFunction"));
        Object term51143 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        setField(term51142, term51142.getClass(), "model", null);
        setElement(term51141, 0, term51142);
        setElement(term51141, 1, term51142);
        setField(term51143, term51143.getClass(), "function", null);
        setElement(term51141, 2, term51143);
        setElement(term51141, 3, term51142);
        setElement(term51141, 4, term51142);
        setElement(term51141, 5, term51142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term50516;
        callMethod(klass, "parseOptimizationData", argTypes, term50799, args);
        assertTrue(recursiveEquals(term50799, term51140));
        assertTrue(recursiveEquals(term50516, term51141));
    }

};


