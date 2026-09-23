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

public class BisectionSolver_solve_998619143133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46154;

    public BisectionSolver_solve_998619143133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46154 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term46268 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$14"));
        setField(term46154, term46154.getClass(), "f", term46268);
        setIntField(term46154, term46154.getClass(), "iterationCount", 0);
        setBooleanField(term46154, term46154.getClass(), "resultComputed", false);
        setIntField(term46154, term46154.getClass(), "maximalIterationCount", 1);
        setDoubleField(term46154, term46154.getClass(), "absoluteAccuracy", -2.8858940113845012E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = 2.522460937500072;
        args[1] = 2.6337890625000018;
        args[2] = 0.0;
        try {
            callMethod(klass, "solve", argTypes, term46154, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


