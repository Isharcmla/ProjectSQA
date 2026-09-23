package org.apache.commons.math.analysis.solvers;

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
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.analysis.solvers.EqualityUtils.*;

public class BrentSolver_solve_144219186573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20733;
     Object term20847;
     Object term20876;
     Object term20877;

    public BrentSolver_solve_144219186573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20733 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term20733, term20733.getClass(), "iterationCount", 0);
        setBooleanField(term20733, term20733.getClass(), "resultComputed", false);
        setDoubleField(term20733, term20733.getClass(), "functionValueAccuracy", 256.0);
        term20847 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
        term20876 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setDoubleField(term20876, term20876.getClass(), "functionValueAccuracy", 256.0);
        setDoubleField(term20876, term20876.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term20876, term20876.getClass(), "resultComputed", true);
        setDoubleField(term20876, term20876.getClass(), "result", 3.5683637054803334E29);
        setDoubleField(term20876, term20876.getClass(), "functionValue", 0.0);
        setField(term20876, term20876.getClass(), "f", null);
        setDoubleField(term20876, term20876.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term20876, term20876.getClass(), "relativeAccuracy", 0.0);
        setIntField(term20876, term20876.getClass(), "maximalIterationCount", 0);
        setDoubleField(term20876, term20876.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term20876, term20876.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term20876, term20876.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term20876, term20876.getClass(), "iterationCount", 0);
        term20877 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term20847;
        args[1] = 3.577145268753282E-259;
        args[2] = 1.4325768789907328E58;
        args[3] = 3.5683637054803334E29;
        Object retValue = callMethod(klass, "solve", argTypes, term20733, args);
        assertTrue(recursiveEquals(term20733, term20876));
        assertTrue(recursiveEquals(term20847, 3.577145268753282E-259));
        assertTrue(recursiveEquals(retValue, 3.5683637054803334E29));
    }

};


