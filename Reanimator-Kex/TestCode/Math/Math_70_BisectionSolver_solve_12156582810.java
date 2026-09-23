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
import java.lang.Double;

public class BisectionSolver_solve_12156582810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37;
     Object term50;
     Object term52;
     Object term54;

    public BisectionSolver_solve_12156582810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        setDoubleField(term37, term37.getClass(), "functionValueAccuracy", 1.0E-15);
        setDoubleField(term37, term37.getClass(), "defaultFunctionValueAccuracy", 1.0E-15);
        setBooleanField(term37, term37.getClass(), "resultComputed", false);
        setDoubleField(term37, term37.getClass(), "result", 0.37773193782763337);
        setDoubleField(term37, term37.getClass(), "functionValue", 0.8474802076607362);
        setField(term37, term37.getClass(), "f", null);
        setDoubleField(term37, term37.getClass(), "absoluteAccuracy", 1.0E-6);
        setDoubleField(term37, term37.getClass(), "relativeAccuracy", 1.0E-14);
        setIntField(term37, term37.getClass(), "maximalIterationCount", 100);
        setDoubleField(term37, term37.getClass(), "defaultAbsoluteAccuracy", 1.0E-6);
        setDoubleField(term37, term37.getClass(), "defaultRelativeAccuracy", 1.0E-14);
        setIntField(term37, term37.getClass(), "defaultMaximalIterationCount", 100);
        setIntField(term37, term37.getClass(), "iterationCount", 1484323161);
        term50 = new Double(0.5183269973490326);
        term52 = new Double(0.7655020693602768);
        term54 = new Double(0.1374549299694151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term50;
        args[2] = term52;
        args[3] = term54;
        try {
            callMethod(klass, "solve", argTypes, term37, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


