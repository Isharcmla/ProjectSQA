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
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.analysis.solvers.EqualityUtils.*;
import java.lang.Double;

public class BrentSolver_solve_108921612485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24892;
     Object term25006;
     Object term25035;
     Object term25036;

    public BrentSolver_solve_108921612485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24892 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term24892, term24892.getClass(), "maximalIterationCount", 2);
        setDoubleField(term24892, term24892.getClass(), "functionValueAccuracy", 9.2188684372274053E18);
        setDoubleField(term24892, term24892.getClass(), "relativeAccuracy", -5.1378310946732769E18);
        setDoubleField(term24892, term24892.getClass(), "absoluteAccuracy", 8.6307264733904896E18);
        term25006 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
        term25035 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setDoubleField(term25035, term25035.getClass(), "functionValueAccuracy", 9.2188684372274053E18);
        setDoubleField(term25035, term25035.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term25035, term25035.getClass(), "resultComputed", true);
        setDoubleField(term25035, term25035.getClass(), "result", 2.427388479369161E-305);
        setDoubleField(term25035, term25035.getClass(), "functionValue", 0.0);
        setField(term25035, term25035.getClass(), "f", null);
        setDoubleField(term25035, term25035.getClass(), "absoluteAccuracy", 8.6307264733904896E18);
        setDoubleField(term25035, term25035.getClass(), "relativeAccuracy", -5.1378310946732769E18);
        setIntField(term25035, term25035.getClass(), "maximalIterationCount", 2);
        setDoubleField(term25035, term25035.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term25035, term25035.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term25035, term25035.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term25035, term25035.getClass(), "iterationCount", 0);
        term25036 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
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
        args[0] = term25006;
        args[1] = -3.615745073131031E-307;
        args[2] = 0.0;
        args[3] = 2.427388479369161E-305;
        args[4] = 0.0;
        args[5] = Double.NaN;
        args[6] = 1.7800590868057868E-307;
        Object retValue = callMethod(klass, "solve", argTypes, term24892, args);
        assertTrue(recursiveEquals(term24892, term25035));
        assertTrue(recursiveEquals(term25006, term25036));
        assertTrue(recursiveEquals(retValue, 2.427388479369161E-305));
    }

};


