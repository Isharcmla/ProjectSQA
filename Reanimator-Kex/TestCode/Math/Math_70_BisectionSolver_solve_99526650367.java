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

public class BisectionSolver_solve_99526650367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22269;
     Object term22383;
     Object term22418;
     Object term22419;

    public BisectionSolver_solve_99526650367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22269 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        setIntField(term22269, term22269.getClass(), "iterationCount", 0);
        setBooleanField(term22269, term22269.getClass(), "resultComputed", false);
        setIntField(term22269, term22269.getClass(), "maximalIterationCount", 2);
        setDoubleField(term22269, term22269.getClass(), "absoluteAccuracy", 3.6074537800668196E18);
        term22383 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$27"));
        term22418 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        setDoubleField(term22418, term22418.getClass(), "functionValueAccuracy", 0.0);
        setDoubleField(term22418, term22418.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term22418, term22418.getClass(), "resultComputed", true);
        setDoubleField(term22418, term22418.getClass(), "result", 1.687500190011761);
        setDoubleField(term22418, term22418.getClass(), "functionValue", 0.0);
        setField(term22418, term22418.getClass(), "f", null);
        setDoubleField(term22418, term22418.getClass(), "absoluteAccuracy", 3.6074537800668196E18);
        setDoubleField(term22418, term22418.getClass(), "relativeAccuracy", 0.0);
        setIntField(term22418, term22418.getClass(), "maximalIterationCount", 2);
        setDoubleField(term22418, term22418.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term22418, term22418.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term22418, term22418.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term22418, term22418.getClass(), "iterationCount", 0);
        term22419 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$27"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term22383;
        args[1] = 1.5;
        args[2] = 1.7500002533490147;
        Object retValue = callMethod(klass, "solve", argTypes, term22269, args);
        assertTrue(recursiveEquals(term22269, term22418));
        assertTrue(recursiveEquals(term22383, 1.5));
        assertTrue(recursiveEquals(retValue, 1.687500190011761));
    }

};


