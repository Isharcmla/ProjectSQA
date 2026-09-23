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
import org.apache.commons.math.ConvergenceException;
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UnivariateRealSolverUtils_bracket_153984447890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113572;

    public UnivariateRealSolverUtils_bracket_153984447890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113572 = newInstance(Class.forName("org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm"));
        double[] term111412 = (double[]) newDoubleArray(140);
        double[] term111553 = (double[]) newDoubleArray(139);
        setField(term113572, term113572.getClass(), "a", term111412);
        setField(term113572, term113572.getClass(), "c", term111553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term113572;
        args[1] = -1.0;
        args[2] = -1.0000038146972656;
        args[3] = 7.458340731200207E-155;
        try {
            callMethod(klass, "bracket", argTypes, null, args);
            assertTrue(false);
        }
        catch (ConvergenceException e) {
        }

    }

};


