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

public class BrentSolver_solve_173594310051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14191;
     Object term14305;
     Object term14332;
     Object term14333;

    public BrentSolver_solve_173594310051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14191 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term14191, term14191.getClass(), "iterationCount", 0);
        setBooleanField(term14191, term14191.getClass(), "resultComputed", false);
        setDoubleField(term14191, term14191.getClass(), "functionValueAccuracy", 9.1832105068765512E18);
        term14305 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$24"));
        term14332 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setDoubleField(term14332, term14332.getClass(), "functionValueAccuracy", 9.1832105068765512E18);
        setDoubleField(term14332, term14332.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term14332, term14332.getClass(), "resultComputed", true);
        setDoubleField(term14332, term14332.getClass(), "result", 1.169152341649342E-302);
        setDoubleField(term14332, term14332.getClass(), "functionValue", 0.0);
        setField(term14332, term14332.getClass(), "f", null);
        setDoubleField(term14332, term14332.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term14332, term14332.getClass(), "relativeAccuracy", 0.0);
        setIntField(term14332, term14332.getClass(), "maximalIterationCount", 0);
        setDoubleField(term14332, term14332.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term14332, term14332.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term14332, term14332.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term14332, term14332.getClass(), "iterationCount", 0);
        term14333 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$24"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term14305;
        args[1] = 1.169152341649342E-302;
        args[2] = 6.92552164223633E7;
        Object retValue = callMethod(klass, "solve", argTypes, term14191, args);
        assertTrue(recursiveEquals(term14191, term14332));
        assertTrue(recursiveEquals(term14305, 1.169152341649342E-302));
        assertTrue(recursiveEquals(retValue, 1.169152341649342E-302));
    }

};


