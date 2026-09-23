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

public class BisectionSolver_solve_12156582895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31712;

    public BisectionSolver_solve_12156582895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31712 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term31824 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$8"));
        setField(term31712, term31712.getClass(), "f", term31824);
        setIntField(term31712, term31712.getClass(), "iterationCount", 0);
        setBooleanField(term31712, term31712.getClass(), "resultComputed", false);
        setIntField(term31712, term31712.getClass(), "maximalIterationCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = -1.378657615011702E58;
        args[2] = -1.6382331368275564E-250;
        args[3] = 0.0;
        try {
            callMethod(klass, "solve", argTypes, term31712, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


