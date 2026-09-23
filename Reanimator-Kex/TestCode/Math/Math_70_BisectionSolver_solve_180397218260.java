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

public class BisectionSolver_solve_180397218260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18812;

    public BisectionSolver_solve_180397218260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18812 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term18924 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$8"));
        setField(term18812, term18812.getClass(), "f", term18924);
        setIntField(term18812, term18812.getClass(), "iterationCount", 0);
        setBooleanField(term18812, term18812.getClass(), "resultComputed", false);
        setIntField(term18812, term18812.getClass(), "maximalIterationCount", 2);
        setDoubleField(term18812, term18812.getClass(), "absoluteAccuracy", 9.3808637414991334E17);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = -1.0043362776618689E59;
        args[1] = 1.7890094335445865E59;
        try {
            callMethod(klass, "solve", argTypes, term18812, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


