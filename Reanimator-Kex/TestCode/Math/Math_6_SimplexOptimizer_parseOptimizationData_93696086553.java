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

public class SimplexOptimizer_parseOptimizationData_93696086553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24379;
     Object term24166;
     Object term24704;
     Object term24706;

    public SimplexOptimizer_parseOptimizationData_93696086553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24379 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term24379, term24379.getClass(), "start", null);
        term24166 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 2);
        Object term24515 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        Object term24667 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setElement(term24166, 0, term24515);
        setElement(term24166, 1, term24667);
        term24704 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        Object term24705 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setDoubleField(term24705, term24705.getClass(), "rho", 0.0);
        setDoubleField(term24705, term24705.getClass(), "khi", 0.0);
        setDoubleField(term24705, term24705.getClass(), "gamma", 0.0);
        setDoubleField(term24705, term24705.getClass(), "sigma", 0.0);
        setField(term24705, term24705.getClass(), "simplex", null);
        setField(term24705, term24705.getClass(), "startConfiguration", null);
        setIntField(term24705, term24705.getClass(), "dimension", 0);
        setField(term24704, term24704.getClass(), "simplex", term24705);
        setField(term24704, term24704.getClass(), "function", null);
        setField(term24704, term24704.getClass(), "goal", null);
        setField(term24704, term24704.getClass(), "start", null);
        setField(term24704, term24704.getClass(), "lowerBound", null);
        setField(term24704, term24704.getClass(), "upperBound", null);
        setField(term24704, term24704.getClass(), "evaluations", null);
        setField(term24704, term24704.getClass(), "iterations", null);
        setField(term24704, term24704.getClass(), "checker", null);
        term24706 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 2);
        Object term24707 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        Object term24708 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setField(term24707, term24707.getClass(), "function", null);
        setElement(term24706, 0, term24707);
        setDoubleField(term24708, term24708.getClass(), "rho", 0.0);
        setDoubleField(term24708, term24708.getClass(), "khi", 0.0);
        setDoubleField(term24708, term24708.getClass(), "gamma", 0.0);
        setDoubleField(term24708, term24708.getClass(), "sigma", 0.0);
        setField(term24708, term24708.getClass(), "simplex", null);
        setField(term24708, term24708.getClass(), "startConfiguration", null);
        setIntField(term24708, term24708.getClass(), "dimension", 0);
        setElement(term24706, 1, term24708);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term24166;
        callMethod(klass, "parseOptimizationData", argTypes, term24379, args);
        assertTrue(recursiveEquals(term24379, term24704));
        assertTrue(recursiveEquals(term24166, term24706));
    }

};


