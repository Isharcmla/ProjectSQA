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

public class BrentSolver_solve_108921612443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10672;
     Object term10784;

    public BrentSolver_solve_108921612443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10672 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term10672, term10672.getClass(), "maximalIterationCount", 1);
        setDoubleField(term10672, term10672.getClass(), "functionValueAccuracy", -6.90795887841583E18);
        setDoubleField(term10672, term10672.getClass(), "relativeAccuracy", -6.9642011831161979E18);
        setDoubleField(term10672, term10672.getClass(), "absoluteAccuracy", 5.7679852227549542E18);
        term10784 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$7"));
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
        args[0] = term10784;
        args[1] = -3.668669271931635E38;
        args[2] = 0.0;
        args[3] = -3.018092618891842;
        args[4] = -4.617603909390534E-289;
        args[5] = Double.NaN;
        args[6] = 3.334936154233779E-288;
        try {
            callMethod(klass, "solve", argTypes, term10672, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


