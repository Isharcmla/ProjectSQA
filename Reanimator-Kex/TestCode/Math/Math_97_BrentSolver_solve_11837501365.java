package org.apache.commons.math.analysis;

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
import static org.apache.commons.math.analysis.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.analysis.EqualityUtils.*;
import java.lang.Object;

public class BrentSolver_solve_11837501365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13408;
     Object term13586;

    public BrentSolver_solve_11837501365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13408 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        Object term13516 = newInstance(Class.forName("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] term13226 = (double[]) newDoubleArray(8);
        setField(term13516, term13516.getClass(), "coefficients", term13226);
        setField(term13408, term13408.getClass(), "f", term13516);
        term13586 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        Object term13587 = newInstance(Class.forName("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] term13588 = (double[]) newDoubleArray(8);
        setDoubleField(term13586, term13586.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term13586, term13586.getClass(), "relativeAccuracy", 0.0);
        setDoubleField(term13586, term13586.getClass(), "functionValueAccuracy", 0.0);
        setIntField(term13586, term13586.getClass(), "maximalIterationCount", 0);
        setDoubleField(term13586, term13586.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term13586, term13586.getClass(), "defaultRelativeAccuracy", 0.0);
        setDoubleField(term13586, term13586.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setIntField(term13586, term13586.getClass(), "defaultMaximalIterationCount", 0);
        setBooleanField(term13586, term13586.getClass(), "resultComputed", true);
        setDoubleField(term13586, term13586.getClass(), "result", -0.0);
        setIntField(term13586, term13586.getClass(), "iterationCount", 0);
        setField(term13587, term13587.getClass(), "coefficients", term13588);
        setField(term13586, term13586.getClass(), "f", term13587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.BrentSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = -0.0;
        args[1] = 4.9E-324;
        args[2] = -0.0;
        Object retValue = callMethod(klass, "solve", argTypes, term13408, args);
        assertTrue(recursiveEquals(term13408, term13586));
        assertTrue(recursiveEquals(retValue, -0.0));
    }

};


