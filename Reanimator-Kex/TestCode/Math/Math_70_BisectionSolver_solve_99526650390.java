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
import java.lang.Object;

public class BisectionSolver_solve_99526650390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30359;
     Object term30459;

    public BisectionSolver_solve_99526650390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30359 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        setIntField(term30359, term30359.getClass(), "iterationCount", 0);
        setBooleanField(term30359, term30359.getClass(), "resultComputed", false);
        setIntField(term30359, term30359.getClass(), "maximalIterationCount", 1);
        term30459 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState$1"));
        Object term30581 = newInstance(Class.forName("org.apache.commons.math.ode.sampling.DummyStepInterpolator"));
        setField(term30459, term30459.getClass(), "val$interpolator", term30581);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term30459;
        args[1] = -328960.5205078461;
        args[2] = -2.9246518346446437E-301;
        try {
            callMethod(klass, "solve", argTypes, term30359, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


