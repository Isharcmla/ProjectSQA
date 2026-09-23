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

public class BisectionSolver_solve_995266503143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49749;
     Object term49849;

    public BisectionSolver_solve_995266503143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49749 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        setIntField(term49749, term49749.getClass(), "iterationCount", 0);
        setBooleanField(term49749, term49749.getClass(), "resultComputed", false);
        setIntField(term49749, term49749.getClass(), "maximalIterationCount", 1);
        term49849 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState$1"));
        Object term49985 = newInstance(Class.forName("org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator"));
        setField(term49849, term49849.getClass(), "val$interpolator", term49985);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term49849;
        args[1] = -328960.5205078461;
        args[2] = -2.9246518346446437E-301;
        try {
            callMethod(klass, "solve", argTypes, term49749, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


