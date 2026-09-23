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

public class BisectionSolver_solve_180397218234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9601;

    public BisectionSolver_solve_180397218234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9601 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term9713 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$8"));
        setField(term9601, term9601.getClass(), "f", term9713);
        setIntField(term9601, term9601.getClass(), "iterationCount", 0);
        setBooleanField(term9601, term9601.getClass(), "resultComputed", false);
        setIntField(term9601, term9601.getClass(), "maximalIterationCount", 2);
        setDoubleField(term9601, term9601.getClass(), "absoluteAccuracy", -4.6145972503398318E18);
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
            callMethod(klass, "solve", argTypes, term9601, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


