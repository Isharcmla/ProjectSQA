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

public class BrentSolver_solve_108921612441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11663;
     Object term11693;

    public BrentSolver_solve_108921612441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11663 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term11663, term11663.getClass(), "maximalIterationCount", 1);
        setDoubleField(term11663, term11663.getClass(), "functionValueAccuracy", -8.9126236625662116E18);
        setDoubleField(term11663, term11663.getClass(), "relativeAccuracy", -2.15827810340569088E18);
        setDoubleField(term11663, term11663.getClass(), "absoluteAccuracy", 1.75921860313154E14);
        term11693 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setDoubleField(term11693, term11693.getClass(), "functionValueAccuracy", -8.9126236625662116E18);
        setDoubleField(term11693, term11693.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term11693, term11693.getClass(), "resultComputed", true);
        setDoubleField(term11693, term11693.getClass(), "result", -3.561856512563481E-307);
        setDoubleField(term11693, term11693.getClass(), "functionValue", 0.0);
        setField(term11693, term11693.getClass(), "f", null);
        setDoubleField(term11693, term11693.getClass(), "absoluteAccuracy", 1.75921860313154E14);
        setDoubleField(term11693, term11693.getClass(), "relativeAccuracy", -2.15827810340569088E18);
        setIntField(term11693, term11693.getClass(), "maximalIterationCount", 1);
        setDoubleField(term11693, term11693.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term11693, term11693.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term11693, term11693.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term11693, term11693.getClass(), "iterationCount", 0);
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
        args[1] = -1.8026574934402576E-307;
        args[2] = 0.0;
        args[3] = -1.8026574932071183E-307;
        args[4] = -8.627182933488237E68;
        args[5] = -3.561856512563481E-307;
        args[6] = 1.0598939654755964E-168;
        Object retValue = callMethod(klass, "solve", argTypes, term11663, args);
        assertTrue(recursiveEquals(term11663, term11693));
        assertTrue(recursiveEquals(retValue, -3.561856512563481E-307));
    }

};


