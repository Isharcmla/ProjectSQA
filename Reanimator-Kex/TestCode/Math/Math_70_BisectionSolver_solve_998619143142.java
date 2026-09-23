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
import org.apache.commons.math.MaxIterationsExceededException;
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BisectionSolver_solve_998619143142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49483;

    public BisectionSolver_solve_998619143142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49483 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term49597 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
        setField(term49483, term49483.getClass(), "f", term49597);
        setIntField(term49483, term49483.getClass(), "iterationCount", 0);
        setBooleanField(term49483, term49483.getClass(), "resultComputed", false);
        setIntField(term49483, term49483.getClass(), "maximalIterationCount", 129);
        setDoubleField(term49483, term49483.getClass(), "absoluteAccuracy", -4.5936716184414853E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = -48.000014662865425;
        args[1] = 0.1250001192674972;
        args[2] = 0.0;
        try {
            callMethod(klass, "solve", argTypes, term49483, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


