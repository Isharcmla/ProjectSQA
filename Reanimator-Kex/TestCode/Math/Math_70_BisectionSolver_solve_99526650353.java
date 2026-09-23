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

public class BisectionSolver_solve_99526650353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16505;
     Object term16619;

    public BisectionSolver_solve_99526650353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16505 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        setIntField(term16505, term16505.getClass(), "iterationCount", 0);
        setBooleanField(term16505, term16505.getClass(), "resultComputed", false);
        setIntField(term16505, term16505.getClass(), "maximalIterationCount", 1);
        term16619 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$27"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term16619;
        args[1] = -1.7608744643866333E159;
        args[2] = -2.077849230998521E-149;
        try {
            callMethod(klass, "solve", argTypes, term16505, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


