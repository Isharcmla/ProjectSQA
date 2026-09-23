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

public class BisectionSolver_solve_99861914377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26010;

    public BisectionSolver_solve_99861914377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26010 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term26122 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$2"));
        setField(term26010, term26010.getClass(), "f", term26122);
        setIntField(term26010, term26010.getClass(), "iterationCount", 0);
        setBooleanField(term26010, term26010.getClass(), "resultComputed", false);
        setIntField(term26010, term26010.getClass(), "maximalIterationCount", 2);
        setDoubleField(term26010, term26010.getClass(), "absoluteAccuracy", -9.0522352149932278E18);
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
        args[1] = -8.900295434028806E-308;
        args[2] = 0.0;
        try {
            callMethod(klass, "solve", argTypes, term26010, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


