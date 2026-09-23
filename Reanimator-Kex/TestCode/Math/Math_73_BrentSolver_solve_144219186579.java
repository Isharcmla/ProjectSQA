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

public class BrentSolver_solve_144219186579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22471;
     Object term22585;

    public BrentSolver_solve_144219186579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22471 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term22471, term22471.getClass(), "iterationCount", 0);
        setBooleanField(term22471, term22471.getClass(), "resultComputed", false);
        setDoubleField(term22471, term22471.getClass(), "functionValueAccuracy", -3.8010182939844772E18);
        setIntField(term22471, term22471.getClass(), "maximalIterationCount", 1);
        term22585 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term22585;
        args[1] = -4.294705886180156E155;
        args[2] = 1.1392691110447683E-304;
        args[3] = -64.0020755138585;
        try {
            callMethod(klass, "solve", argTypes, term22471, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


