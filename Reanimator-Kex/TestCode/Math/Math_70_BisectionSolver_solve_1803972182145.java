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

public class BisectionSolver_solve_1803972182145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52463;

    public BisectionSolver_solve_1803972182145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52463 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term52575 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$5"));
        setField(term52463, term52463.getClass(), "f", term52575);
        setIntField(term52463, term52463.getClass(), "iterationCount", 0);
        setBooleanField(term52463, term52463.getClass(), "resultComputed", false);
        setIntField(term52463, term52463.getClass(), "maximalIterationCount", 1);
        setDoubleField(term52463, term52463.getClass(), "absoluteAccuracy", 9.2211202370410906E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = -2.6376570810119706E-308;
        args[1] = Double.NaN;
        try {
            callMethod(klass, "solve", argTypes, term52463, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


