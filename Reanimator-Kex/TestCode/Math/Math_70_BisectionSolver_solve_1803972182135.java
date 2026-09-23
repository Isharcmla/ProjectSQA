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

public class BisectionSolver_solve_1803972182135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47060;

    public BisectionSolver_solve_1803972182135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47060 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term47172 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$5"));
        setField(term47060, term47060.getClass(), "f", term47172);
        setIntField(term47060, term47060.getClass(), "iterationCount", 0);
        setBooleanField(term47060, term47060.getClass(), "resultComputed", false);
        setIntField(term47060, term47060.getClass(), "maximalIterationCount", 2);
        setDoubleField(term47060, term47060.getClass(), "absoluteAccuracy", -6.0528378991859466E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = 1.0361308E-317;
        args[1] = Double.NaN;
        try {
            callMethod(klass, "solve", argTypes, term47060, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


