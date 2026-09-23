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
import java.lang.Object;

public class BisectionSolver_solve_99861914349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15262;
     Object term15411;

    public BisectionSolver_solve_99861914349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15262 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term15374 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$2"));
        setField(term15262, term15262.getClass(), "f", term15374);
        setIntField(term15262, term15262.getClass(), "iterationCount", 0);
        setBooleanField(term15262, term15262.getClass(), "resultComputed", false);
        setIntField(term15262, term15262.getClass(), "maximalIterationCount", 4);
        setDoubleField(term15262, term15262.getClass(), "absoluteAccuracy", 4.6161975917624719E18);
        term15411 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term15412 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$2"));
        setDoubleField(term15411, term15411.getClass(), "functionValueAccuracy", 0.0);
        setDoubleField(term15411, term15411.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term15411, term15411.getClass(), "resultComputed", true);
        setDoubleField(term15411, term15411.getClass(), "result", -3.9843749704241547);
        setDoubleField(term15411, term15411.getClass(), "functionValue", 0.0);
        setField(term15411, term15411.getClass(), "f", term15412);
        setDoubleField(term15411, term15411.getClass(), "absoluteAccuracy", 4.6161975917624719E18);
        setDoubleField(term15411, term15411.getClass(), "relativeAccuracy", 0.0);
        setIntField(term15411, term15411.getClass(), "maximalIterationCount", 4);
        setDoubleField(term15411, term15411.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term15411, term15411.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term15411, term15411.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term15411, term15411.getClass(), "iterationCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = -16.005621195772676;
        args[1] = 0.022707104692019114;
        args[2] = 0.0;
        Object retValue = callMethod(klass, "solve", argTypes, term15262, args);
        assertTrue(recursiveEquals(term15262, term15411));
        assertTrue(recursiveEquals(retValue, -3.9843749704241547));
    }

};


