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

public class BisectionSolver_solve_99861914338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10808;

    public BisectionSolver_solve_99861914338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10808 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term10920 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$2"));
        setField(term10808, term10808.getClass(), "f", term10920);
        setIntField(term10808, term10808.getClass(), "iterationCount", 0);
        setBooleanField(term10808, term10808.getClass(), "resultComputed", false);
        setIntField(term10808, term10808.getClass(), "maximalIterationCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = -1.2247744609475444E-296;
        args[1] = -9.56679247036427E-299;
        args[2] = 0.0;
        try {
            callMethod(klass, "solve", argTypes, term10808, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


