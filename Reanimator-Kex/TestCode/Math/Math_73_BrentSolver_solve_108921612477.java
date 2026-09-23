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

public class BrentSolver_solve_108921612477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21584;
     Object term21698;

    public BrentSolver_solve_108921612477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21584 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term21584, term21584.getClass(), "maximalIterationCount", 1);
        setDoubleField(term21584, term21584.getClass(), "functionValueAccuracy", -8.8135444707619543E18);
        setDoubleField(term21584, term21584.getClass(), "relativeAccuracy", -2.445943020068012E18);
        setDoubleField(term21584, term21584.getClass(), "absoluteAccuracy", -4.503599627370497E15);
        term21698 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$21"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        argTypes[5] = double.class;
        argTypes[6] = double.class;
        Object[] args = new Object[7];
        args[0] = term21698;
        args[1] = -9.128910450472698E307;
        args[2] = -0.0;
        args[3] = -7.860502181825873E165;
        args[4] = -0.0;
        args[5] = -3.19602835964349E165;
        args[6] = 0.0;
        try {
            callMethod(klass, "solve", argTypes, term21584, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


