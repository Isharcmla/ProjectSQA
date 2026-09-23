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

public class BisectionSolver_solve_998619143137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47980;

    public BisectionSolver_solve_998619143137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47980 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term48094 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$19"));
        setField(term47980, term47980.getClass(), "f", term48094);
        setIntField(term47980, term47980.getClass(), "iterationCount", 0);
        setBooleanField(term47980, term47980.getClass(), "resultComputed", false);
        setIntField(term47980, term47980.getClass(), "maximalIterationCount", 2);
        setDoubleField(term47980, term47980.getClass(), "absoluteAccuracy", -4.6145972503398318E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = Double.NEGATIVE_INFINITY;
        args[1] = Double.POSITIVE_INFINITY;
        args[2] = 0.0;
        try {
            callMethod(klass, "solve", argTypes, term47980, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


