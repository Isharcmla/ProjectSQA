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
import java.lang.NullPointerException;
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class BrentSolver_solve_108921612427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6683;

    public BrentSolver_solve_108921612427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6683 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term6683, term6683.getClass(), "maximalIterationCount", 1);
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
        args[0] = null;
        args[1] = Double.NaN;
        args[2] = 0.0;
        args[3] = Double.NaN;
        args[4] = -6.203004362368589E-266;
        args[5] = 0.0;
        args[6] = -6.203004362368589E-266;
        try {
            callMethod(klass, "solve", argTypes, term6683, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


