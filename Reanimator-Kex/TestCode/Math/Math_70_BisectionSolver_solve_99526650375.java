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

public class BisectionSolver_solve_99526650375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25289;
     Object term25389;

    public BisectionSolver_solve_99526650375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25289 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        setIntField(term25289, term25289.getClass(), "iterationCount", 0);
        setBooleanField(term25289, term25289.getClass(), "resultComputed", false);
        setIntField(term25289, term25289.getClass(), "maximalIterationCount", 1);
        term25389 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState$1"));
        Object term25537 = newInstance(Class.forName("org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator"));
        setField(term25389, term25389.getClass(), "val$interpolator", term25537);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term25389;
        args[1] = -279040.0498915208;
        args[2] = -2.347742361862742E-301;
        try {
            callMethod(klass, "solve", argTypes, term25289, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


