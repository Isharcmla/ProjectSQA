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
import java.lang.NullPointerException;
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BisectionSolver_solve_99526650357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18249;
     Object term18349;

    public BisectionSolver_solve_99526650357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18249 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        setIntField(term18249, term18249.getClass(), "iterationCount", 0);
        setBooleanField(term18249, term18249.getClass(), "resultComputed", false);
        setIntField(term18249, term18249.getClass(), "maximalIterationCount", 1);
        term18349 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term18349;
        args[1] = -1.7608744643866333E159;
        args[2] = -2.077849230998521E-149;
        try {
            callMethod(klass, "solve", argTypes, term18249, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


