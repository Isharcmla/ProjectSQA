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

public class BrentSolver_solve_144219186589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25722;
     Object term25836;

    public BrentSolver_solve_144219186589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25722 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term25722, term25722.getClass(), "iterationCount", 0);
        setBooleanField(term25722, term25722.getClass(), "resultComputed", false);
        setDoubleField(term25722, term25722.getClass(), "functionValueAccuracy", -4.6119666987005204E18);
        setIntField(term25722, term25722.getClass(), "maximalIterationCount", 1);
        term25836 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
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
        args[0] = term25836;
        args[1] = -658.2847943318047;
        args[2] = 2.523602658778308E-308;
        args[3] = 2.4384394826154235E-308;
        try {
            callMethod(klass, "solve", argTypes, term25722, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


