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

public class BrentSolver_solve_108921612447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12457;

    public BrentSolver_solve_108921612447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12457 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term12457, term12457.getClass(), "maximalIterationCount", 1);
        setDoubleField(term12457, term12457.getClass(), "functionValueAccuracy", -7.3813997892602429E18);
        setDoubleField(term12457, term12457.getClass(), "relativeAccuracy", -4.616176071726423E18);
        setDoubleField(term12457, term12457.getClass(), "absoluteAccuracy", 9.210142712949375E18);
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
        args[1] = -2.4072355187518275E-302;
        args[2] = 0.0;
        args[3] = 1.7649913517912803E-308;
        args[4] = -5.832897615645119E-303;
        args[5] = 8.989288592922092E307;
        args[6] = 3.05811822511135E-297;
        try {
            callMethod(klass, "solve", argTypes, term12457, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


