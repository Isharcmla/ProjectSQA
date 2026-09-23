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

public class BisectionSolver_solve_99861914351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15621;

    public BisectionSolver_solve_99861914351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15621 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term15733 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$2"));
        setField(term15621, term15621.getClass(), "f", term15733);
        setIntField(term15621, term15621.getClass(), "iterationCount", 0);
        setBooleanField(term15621, term15621.getClass(), "resultComputed", false);
        setIntField(term15621, term15621.getClass(), "maximalIterationCount", 3);
        setDoubleField(term15621, term15621.getClass(), "absoluteAccuracy", 6.9115191142635274E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = -5.1352951856674674E154;
        args[1] = 0.0;
        args[2] = 0.0;
        try {
            callMethod(klass, "solve", argTypes, term15621, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


