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

public class BrentSolver_solve_144219186567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18593;
     Object term18707;

    public BrentSolver_solve_144219186567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18593 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term18593, term18593.getClass(), "iterationCount", 0);
        setBooleanField(term18593, term18593.getClass(), "resultComputed", false);
        setDoubleField(term18593, term18593.getClass(), "functionValueAccuracy", -3.8956020862934118E17);
        term18707 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term18707;
        args[1] = -1.1023112966596363E99;
        args[2] = -6.966317463938589E-77;
        args[3] = -3.071180011731283E82;
        try {
            callMethod(klass, "solve", argTypes, term18593, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


