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

public class BisectionSolver_solve_998619143125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42923;

    public BisectionSolver_solve_998619143125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42923 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term43037 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$19"));
        setField(term42923, term42923.getClass(), "f", term43037);
        setIntField(term42923, term42923.getClass(), "iterationCount", 0);
        setBooleanField(term42923, term42923.getClass(), "resultComputed", false);
        setIntField(term42923, term42923.getClass(), "maximalIterationCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = -1.378657615011702E58;
        args[1] = -1.6382331368275564E-250;
        args[2] = 0.0;
        try {
            callMethod(klass, "solve", argTypes, term42923, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


