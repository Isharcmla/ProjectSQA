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

public class BrentSolver_solve_108921612487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25262;

    public BrentSolver_solve_108921612487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25262 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term25262, term25262.getClass(), "maximalIterationCount", 1);
        setDoubleField(term25262, term25262.getClass(), "functionValueAccuracy", -4.5211819174946365E18);
        setDoubleField(term25262, term25262.getClass(), "relativeAccuracy", -9.2183032882507203E18);
        setDoubleField(term25262, term25262.getClass(), "absoluteAccuracy", -4.6116860184273879E18);
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
        args[1] = 3.477612655926007E-308;
        args[2] = 5.090822154361255E-270;
        args[3] = 0.0;
        args[4] = 2.1894535031333366;
        args[5] = 4.432630372235836E-308;
        args[6] = -4.70949488098445E155;
        try {
            callMethod(klass, "solve", argTypes, term25262, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


