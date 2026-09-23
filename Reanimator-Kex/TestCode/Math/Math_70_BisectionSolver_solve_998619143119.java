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

public class BisectionSolver_solve_998619143119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41387;
     Object term41539;

    public BisectionSolver_solve_998619143119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41387 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term41501 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
        setField(term41387, term41387.getClass(), "f", term41501);
        setIntField(term41387, term41387.getClass(), "iterationCount", 0);
        setBooleanField(term41387, term41387.getClass(), "resultComputed", false);
        setIntField(term41387, term41387.getClass(), "maximalIterationCount", 1);
        setDoubleField(term41387, term41387.getClass(), "absoluteAccuracy", 8.3678288451427369E18);
        term41539 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term41540 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
        setDoubleField(term41539, term41539.getClass(), "functionValueAccuracy", 0.0);
        setDoubleField(term41539, term41539.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term41539, term41539.getClass(), "resultComputed", true);
        setDoubleField(term41539, term41539.getClass(), "result", 1.9912433159747704E-59);
        setDoubleField(term41539, term41539.getClass(), "functionValue", 0.0);
        setField(term41539, term41539.getClass(), "f", term41540);
        setDoubleField(term41539, term41539.getClass(), "absoluteAccuracy", 8.3678288451427369E18);
        setDoubleField(term41539, term41539.getClass(), "relativeAccuracy", 0.0);
        setIntField(term41539, term41539.getClass(), "maximalIterationCount", 1);
        setDoubleField(term41539, term41539.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term41539, term41539.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term41539, term41539.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term41539, term41539.getClass(), "iterationCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = -1.5931405403087702E-58;
        args[1] = 7.965459555662261E-59;
        args[2] = 0.0;
        Object retValue = callMethod(klass, "solve", argTypes, term41387, args);
        assertTrue(recursiveEquals(term41387, term41539));
        assertTrue(recursiveEquals(retValue, 1.9912433159747704E-59));
    }

};


