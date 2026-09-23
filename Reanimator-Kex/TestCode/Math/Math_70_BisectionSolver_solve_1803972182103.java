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

public class BisectionSolver_solve_1803972182103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35354;

    public BisectionSolver_solve_1803972182103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35354 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        setField(term35354, term35354.getClass(), "f", null);
        setIntField(term35354, term35354.getClass(), "iterationCount", 0);
        setBooleanField(term35354, term35354.getClass(), "resultComputed", false);
        setIntField(term35354, term35354.getClass(), "maximalIterationCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = -7.107401324232868E-192;
        args[1] = -4.921321194160346E-260;
        try {
            callMethod(klass, "solve", argTypes, term35354, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


