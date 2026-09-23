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

public class BrentSolver_solve_144219186549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13309;
     Object term13423;

    public BrentSolver_solve_144219186549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13309 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term13309, term13309.getClass(), "iterationCount", 0);
        setBooleanField(term13309, term13309.getClass(), "resultComputed", false);
        term13423 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
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
        args[0] = term13423;
        args[1] = -7.579399646157663E23;
        args[2] = -7.823692073537119E-148;
        args[3] = -1.6407471479402512E-141;
        try {
            callMethod(klass, "solve", argTypes, term13309, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


