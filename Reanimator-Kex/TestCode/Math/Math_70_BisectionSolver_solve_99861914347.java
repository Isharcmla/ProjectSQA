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

public class BisectionSolver_solve_99861914347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14921;
     Object term15070;

    public BisectionSolver_solve_99861914347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14921 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term15033 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$2"));
        setField(term14921, term14921.getClass(), "f", term15033);
        setIntField(term14921, term14921.getClass(), "iterationCount", 0);
        setBooleanField(term14921, term14921.getClass(), "resultComputed", false);
        setIntField(term14921, term14921.getClass(), "maximalIterationCount", 1);
        setDoubleField(term14921, term14921.getClass(), "absoluteAccuracy", 4.8368659997959127E18);
        term15070 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term15071 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$2"));
        setDoubleField(term15070, term15070.getClass(), "functionValueAccuracy", 0.0);
        setDoubleField(term15070, term15070.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term15070, term15070.getClass(), "resultComputed", true);
        setDoubleField(term15070, term15070.getClass(), "result", 0.0);
        setDoubleField(term15070, term15070.getClass(), "functionValue", 0.0);
        setField(term15070, term15070.getClass(), "f", term15071);
        setDoubleField(term15070, term15070.getClass(), "absoluteAccuracy", 4.8368659997959127E18);
        setDoubleField(term15070, term15070.getClass(), "relativeAccuracy", 0.0);
        setIntField(term15070, term15070.getClass(), "maximalIterationCount", 1);
        setDoubleField(term15070, term15070.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term15070, term15070.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term15070, term15070.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term15070, term15070.getClass(), "iterationCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = 0.0;
        args[1] = 4.9E-324;
        args[2] = 0.0;
        Object retValue = callMethod(klass, "solve", argTypes, term14921, args);
        assertTrue(recursiveEquals(term14921, term15070));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


