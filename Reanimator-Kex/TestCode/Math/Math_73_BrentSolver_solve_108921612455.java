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
import java.lang.Double;

public class BrentSolver_solve_108921612455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15410;
     Object term15524;

    public BrentSolver_solve_108921612455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15410 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term15410, term15410.getClass(), "maximalIterationCount", 1);
        setDoubleField(term15410, term15410.getClass(), "functionValueAccuracy", 8.2686100153638584E18);
        setDoubleField(term15410, term15410.getClass(), "relativeAccuracy", -3.9765729167288566E18);
        setDoubleField(term15410, term15410.getClass(), "absoluteAccuracy", 4.50359962738688E15);
        term15524 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        argTypes[5] = double.class;
        argTypes[6] = double.class;
        Object[] args = new Object[7];
        args[0] = term15524;
        args[1] = 1.1664607680046029E-306;
        args[2] = Double.NaN;
        args[3] = 1.4333991677903203E-306;
        args[4] = Double.NaN;
        args[5] = Double.NaN;
        args[6] = Double.NaN;
        try {
            callMethod(klass, "solve", argTypes, term15410, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


