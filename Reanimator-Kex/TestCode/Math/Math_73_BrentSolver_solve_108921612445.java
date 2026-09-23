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

public class BrentSolver_solve_108921612445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12433;

    public BrentSolver_solve_108921612445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12433 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term12433, term12433.getClass(), "maximalIterationCount", 1);
        setDoubleField(term12433, term12433.getClass(), "functionValueAccuracy", -9.0792568487621427E18);
        setDoubleField(term12433, term12433.getClass(), "relativeAccuracy", -8.1790789188137042E18);
        setDoubleField(term12433, term12433.getClass(), "absoluteAccuracy", -3.371685745252035E15);
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
        args[1] = -2.7661491804831984E155;
        args[2] = -2.5E-323;
        args[3] = -1.4165681239081017E86;
        args[4] = -2.848094549499197E-306;
        args[5] = -1.3432426068195912E88;
        args[6] = 5.696189120218351E-306;
        try {
            callMethod(klass, "solve", argTypes, term12433, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


