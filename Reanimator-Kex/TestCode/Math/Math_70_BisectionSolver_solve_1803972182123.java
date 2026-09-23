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
import java.lang.Double;

public class BisectionSolver_solve_1803972182123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42039;

    public BisectionSolver_solve_1803972182123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42039 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term42151 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$7"));
        setField(term42039, term42039.getClass(), "f", term42151);
        setIntField(term42039, term42039.getClass(), "iterationCount", 0);
        setBooleanField(term42039, term42039.getClass(), "resultComputed", false);
        setIntField(term42039, term42039.getClass(), "maximalIterationCount", 2);
        setDoubleField(term42039, term42039.getClass(), "absoluteAccuracy", -4.6145972503398318E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = Double.NEGATIVE_INFINITY;
        args[1] = Double.POSITIVE_INFINITY;
        try {
            callMethod(klass, "solve", argTypes, term42039, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


