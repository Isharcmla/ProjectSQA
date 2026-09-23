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

public class BisectionSolver_solve_99526650369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22577;
     Object term22691;

    public BisectionSolver_solve_99526650369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22577 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        setIntField(term22577, term22577.getClass(), "iterationCount", 0);
        setBooleanField(term22577, term22577.getClass(), "resultComputed", false);
        setIntField(term22577, term22577.getClass(), "maximalIterationCount", 1);
        term22691 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$12"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term22691;
        args[1] = 1.122998470756432E-37;
        args[2] = 1.8545707165666992E271;
        try {
            callMethod(klass, "solve", argTypes, term22577, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


