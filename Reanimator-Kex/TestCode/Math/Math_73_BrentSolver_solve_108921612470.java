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
import java.lang.Double;

public class BrentSolver_solve_108921612470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19546;
     Object term19660;

    public BrentSolver_solve_108921612470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19546 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term19546, term19546.getClass(), "maximalIterationCount", 1);
        setDoubleField(term19546, term19546.getClass(), "functionValueAccuracy", -9.061242450269438E18);
        setDoubleField(term19546, term19546.getClass(), "relativeAccuracy", -4.503599627370496E15);
        setDoubleField(term19546, term19546.getClass(), "absoluteAccuracy", 8.2641053162248602E18);
        term19660 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
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
        args[0] = term19660;
        args[1] = -2.9976022723670455E-14;
        args[2] = 0.0;
        args[3] = 1.0;
        args[4] = 0.0;
        args[5] = Double.NaN;
        args[6] = 2.983336292480094E-154;
        try {
            callMethod(klass, "solve", argTypes, term19546, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


