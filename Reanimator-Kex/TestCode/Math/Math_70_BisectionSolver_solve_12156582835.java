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

public class BisectionSolver_solve_12156582835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9885;
     Object term10658;

    public BisectionSolver_solve_12156582835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9885 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term9999 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$20"));
        setField(term9885, term9885.getClass(), "f", term9999);
        setIntField(term9885, term9885.getClass(), "iterationCount", 0);
        setBooleanField(term9885, term9885.getClass(), "resultComputed", false);
        setIntField(term9885, term9885.getClass(), "maximalIterationCount", 1);
        setDoubleField(term9885, term9885.getClass(), "absoluteAccuracy", 6.9493447672012513E18);
        term10658 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term10659 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$20"));
        setDoubleField(term10658, term10658.getClass(), "functionValueAccuracy", 0.0);
        setDoubleField(term10658, term10658.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term10658, term10658.getClass(), "resultComputed", true);
        setDoubleField(term10658, term10658.getClass(), "result", -384.3965314630207);
        setDoubleField(term10658, term10658.getClass(), "functionValue", 0.0);
        setField(term10658, term10658.getClass(), "f", term10659);
        setDoubleField(term10658, term10658.getClass(), "absoluteAccuracy", 6.9493447672012513E18);
        setDoubleField(term10658, term10658.getClass(), "relativeAccuracy", 0.0);
        setIntField(term10658, term10658.getClass(), "maximalIterationCount", 1);
        setDoubleField(term10658, term10658.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term10658, term10658.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term10658, term10658.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term10658, term10658.getClass(), "iterationCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = -513.0429694657241;
        args[2] = 1.542782545089466;
        args[3] = 0.0;
        Object retValue = callMethod(klass, "solve", argTypes, term9885, args);
        assertTrue(recursiveEquals(term9885, term10658));
        assertTrue(recursiveEquals(retValue, -384.3965314630207));
    }

};


