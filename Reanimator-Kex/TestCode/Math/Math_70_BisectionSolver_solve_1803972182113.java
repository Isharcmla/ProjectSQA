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

public class BisectionSolver_solve_1803972182113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39321;
     Object term39472;

    public BisectionSolver_solve_1803972182113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39321 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term39435 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$20"));
        setField(term39321, term39321.getClass(), "f", term39435);
        setIntField(term39321, term39321.getClass(), "iterationCount", 0);
        setBooleanField(term39321, term39321.getClass(), "resultComputed", false);
        setIntField(term39321, term39321.getClass(), "maximalIterationCount", 1);
        setDoubleField(term39321, term39321.getClass(), "absoluteAccuracy", 6.9493447672012513E18);
        term39472 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term39473 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$20"));
        setDoubleField(term39472, term39472.getClass(), "functionValueAccuracy", 0.0);
        setDoubleField(term39472, term39472.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term39472, term39472.getClass(), "resultComputed", true);
        setDoubleField(term39472, term39472.getClass(), "result", -384.3965314630207);
        setDoubleField(term39472, term39472.getClass(), "functionValue", 0.0);
        setField(term39472, term39472.getClass(), "f", term39473);
        setDoubleField(term39472, term39472.getClass(), "absoluteAccuracy", 6.9493447672012513E18);
        setDoubleField(term39472, term39472.getClass(), "relativeAccuracy", 0.0);
        setIntField(term39472, term39472.getClass(), "maximalIterationCount", 1);
        setDoubleField(term39472, term39472.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term39472, term39472.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term39472, term39472.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term39472, term39472.getClass(), "iterationCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = -513.0429694657241;
        args[1] = 1.542782545089466;
        Object retValue = callMethod(klass, "solve", argTypes, term39321, args);
        assertTrue(recursiveEquals(term39321, term39472));
        assertTrue(recursiveEquals(retValue, -384.3965314630207));
    }

};


