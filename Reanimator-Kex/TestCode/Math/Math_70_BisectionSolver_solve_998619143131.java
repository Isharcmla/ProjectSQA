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

public class BisectionSolver_solve_998619143131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45244;

    public BisectionSolver_solve_998619143131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45244 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term45358 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
        setField(term45244, term45244.getClass(), "f", term45358);
        setIntField(term45244, term45244.getClass(), "iterationCount", 0);
        setBooleanField(term45244, term45244.getClass(), "resultComputed", false);
        setIntField(term45244, term45244.getClass(), "maximalIterationCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = -5.1064530780277154E157;
        args[1] = -1.1191705460025088E-287;
        args[2] = 0.0;
        try {
            callMethod(klass, "solve", argTypes, term45244, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


