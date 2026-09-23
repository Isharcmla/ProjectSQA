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

public class BrentSolver_solve_144219186571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19812;
     Object term19926;
     Object term20556;
     Object term20557;

    public BrentSolver_solve_144219186571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19812 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term19812, term19812.getClass(), "iterationCount", 0);
        setBooleanField(term19812, term19812.getClass(), "resultComputed", false);
        setDoubleField(term19812, term19812.getClass(), "functionValueAccuracy", 4.6342043096957583E18);
        term19926 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
        term20556 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setDoubleField(term20556, term20556.getClass(), "functionValueAccuracy", 4.6342043096957583E18);
        setDoubleField(term20556, term20556.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term20556, term20556.getClass(), "resultComputed", true);
        setDoubleField(term20556, term20556.getClass(), "result", -5.306086035349274E-288);
        setDoubleField(term20556, term20556.getClass(), "functionValue", 0.0);
        setField(term20556, term20556.getClass(), "f", null);
        setDoubleField(term20556, term20556.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term20556, term20556.getClass(), "relativeAccuracy", 0.0);
        setIntField(term20556, term20556.getClass(), "maximalIterationCount", 0);
        setDoubleField(term20556, term20556.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term20556, term20556.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term20556, term20556.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term20556, term20556.getClass(), "iterationCount", 0);
        term20557 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
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
        args[0] = term19926;
        args[1] = -6.878643260468343E19;
        args[2] = -2.87773865167674E-307;
        args[3] = -5.306086035349274E-288;
        Object retValue = callMethod(klass, "solve", argTypes, term19812, args);
        assertTrue(recursiveEquals(term19812, term20556));
        assertTrue(recursiveEquals(term19926, -6.878643260468343E19));
        assertTrue(recursiveEquals(retValue, -5.306086035349274E-288));
    }

};


