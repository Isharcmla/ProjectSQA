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

public class BisectionSolver_solve_12156582841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11962;

    public BisectionSolver_solve_12156582841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11962 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term12076 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$20"));
        setField(term11962, term11962.getClass(), "f", term12076);
        setIntField(term11962, term11962.getClass(), "iterationCount", 0);
        setBooleanField(term11962, term11962.getClass(), "resultComputed", false);
        setIntField(term11962, term11962.getClass(), "maximalIterationCount", 2);
        setDoubleField(term11962, term11962.getClass(), "absoluteAccuracy", -4.6145972503398318E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = Double.NEGATIVE_INFINITY;
        args[2] = Double.POSITIVE_INFINITY;
        args[3] = 0.0;
        try {
            callMethod(klass, "solve", argTypes, term11962, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


