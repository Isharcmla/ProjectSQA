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

public class SimplexOptimizer_parseOptimizationData_936960865121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74532;
     Object term74208;
     Object term84034;
     Object term84036;

    public SimplexOptimizer_parseOptimizationData_936960865121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74532 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term74532, term74532.getClass(), "start", null);
        setField(term74532, term74532.getClass(), "function", null);
        term74208 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term74668 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        Object term74832 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex"));
        Object term74996 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex"));
        setField(term74668, term74668.getClass(), "function", null);
        setElement(term74208, 0, term74668);
        setElement(term74208, 1, term74832);
        setElement(term74208, 2, term74996);
        setElement(term74208, 3, term74996);
        setElement(term74208, 4, term74996);
        setElement(term74208, 5, term74996);
        term84034 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        Object term84035 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex"));
        setDoubleField(term84035, term84035.getClass(), "khi", 0.0);
        setDoubleField(term84035, term84035.getClass(), "gamma", 0.0);
        setField(term84035, term84035.getClass(), "simplex", null);
        setField(term84035, term84035.getClass(), "startConfiguration", null);
        setIntField(term84035, term84035.getClass(), "dimension", 0);
        setField(term84034, term84034.getClass(), "simplex", term84035);
        setField(term84034, term84034.getClass(), "function", null);
        setField(term84034, term84034.getClass(), "goal", null);
        setField(term84034, term84034.getClass(), "start", null);
        setField(term84034, term84034.getClass(), "lowerBound", null);
        setField(term84034, term84034.getClass(), "upperBound", null);
        setField(term84034, term84034.getClass(), "evaluations", null);
        setField(term84034, term84034.getClass(), "iterations", null);
        setField(term84034, term84034.getClass(), "checker", null);
        term84036 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term84037 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        Object term84038 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex"));
        Object term84039 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex"));
        setField(term84037, term84037.getClass(), "function", null);
        setElement(term84036, 0, term84037);
        setDoubleField(term84038, term84038.getClass(), "khi", 0.0);
        setDoubleField(term84038, term84038.getClass(), "gamma", 0.0);
        setField(term84038, term84038.getClass(), "simplex", null);
        setField(term84038, term84038.getClass(), "startConfiguration", null);
        setIntField(term84038, term84038.getClass(), "dimension", 0);
        setElement(term84036, 1, term84038);
        setDoubleField(term84039, term84039.getClass(), "khi", 0.0);
        setDoubleField(term84039, term84039.getClass(), "gamma", 0.0);
        setField(term84039, term84039.getClass(), "simplex", null);
        setField(term84039, term84039.getClass(), "startConfiguration", null);
        setIntField(term84039, term84039.getClass(), "dimension", 0);
        setElement(term84036, 2, term84039);
        setElement(term84036, 3, term84039);
        setElement(term84036, 4, term84039);
        setElement(term84036, 5, term84039);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term74208;
        callMethod(klass, "parseOptimizationData", argTypes, term74532, args);
        assertTrue(recursiveEquals(term74532, term84034));
        assertTrue(recursiveEquals(term74208, term84036));
    }

};


