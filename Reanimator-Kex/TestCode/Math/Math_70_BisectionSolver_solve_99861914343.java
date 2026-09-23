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
import java.lang.Double;

public class BisectionSolver_solve_99861914343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13471;

    public BisectionSolver_solve_99861914343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13471 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term13583 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$2"));
        setField(term13471, term13471.getClass(), "f", term13583);
        setIntField(term13471, term13471.getClass(), "iterationCount", 0);
        setBooleanField(term13471, term13471.getClass(), "resultComputed", false);
        setIntField(term13471, term13471.getClass(), "maximalIterationCount", 4);
        setDoubleField(term13471, term13471.getClass(), "absoluteAccuracy", -8.8241187531466214E17);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = Double.NaN;
        args[1] = 2.225073858507207E-308;
        args[2] = 0.0;
        try {
            callMethod(klass, "solve", argTypes, term13471, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


