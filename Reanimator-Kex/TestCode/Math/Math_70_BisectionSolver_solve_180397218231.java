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

public class BisectionSolver_solve_180397218231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9279;
     Object term9428;

    public BisectionSolver_solve_180397218231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9279 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term9391 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$8"));
        setField(term9279, term9279.getClass(), "f", term9391);
        setIntField(term9279, term9279.getClass(), "iterationCount", 0);
        setBooleanField(term9279, term9279.getClass(), "resultComputed", false);
        setIntField(term9279, term9279.getClass(), "maximalIterationCount", 1);
        setDoubleField(term9279, term9279.getClass(), "absoluteAccuracy", 6.9493447672012513E18);
        term9428 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term9429 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$8"));
        setDoubleField(term9428, term9428.getClass(), "functionValueAccuracy", 0.0);
        setDoubleField(term9428, term9428.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term9428, term9428.getClass(), "resultComputed", true);
        setDoubleField(term9428, term9428.getClass(), "result", -384.3965314630207);
        setDoubleField(term9428, term9428.getClass(), "functionValue", 0.0);
        setField(term9428, term9428.getClass(), "f", term9429);
        setDoubleField(term9428, term9428.getClass(), "absoluteAccuracy", 6.9493447672012513E18);
        setDoubleField(term9428, term9428.getClass(), "relativeAccuracy", 0.0);
        setIntField(term9428, term9428.getClass(), "maximalIterationCount", 1);
        setDoubleField(term9428, term9428.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term9428, term9428.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term9428, term9428.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term9428, term9428.getClass(), "iterationCount", 0);
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
        Object retValue = callMethod(klass, "solve", argTypes, term9279, args);
        assertTrue(recursiveEquals(term9279, term9428));
        assertTrue(recursiveEquals(retValue, -384.3965314630207));
    }

};


