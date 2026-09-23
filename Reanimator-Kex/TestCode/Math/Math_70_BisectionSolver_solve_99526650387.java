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

public class BisectionSolver_solve_99526650387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30057;
     Object term30171;
     Object term30206;
     Object term30207;

    public BisectionSolver_solve_99526650387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30057 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        setIntField(term30057, term30057.getClass(), "iterationCount", 0);
        setBooleanField(term30057, term30057.getClass(), "resultComputed", false);
        setIntField(term30057, term30057.getClass(), "maximalIterationCount", 1);
        setDoubleField(term30057, term30057.getClass(), "absoluteAccuracy", 4.6032461682463375E18);
        term30171 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$13"));
        term30206 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        setDoubleField(term30206, term30206.getClass(), "functionValueAccuracy", 0.0);
        setDoubleField(term30206, term30206.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term30206, term30206.getClass(), "resultComputed", true);
        setDoubleField(term30206, term30206.getClass(), "result", -0.2492679643905831);
        setDoubleField(term30206, term30206.getClass(), "functionValue", 0.0);
        setField(term30206, term30206.getClass(), "f", null);
        setDoubleField(term30206, term30206.getClass(), "absoluteAccuracy", 4.6032461682463375E18);
        setDoubleField(term30206, term30206.getClass(), "relativeAccuracy", 0.0);
        setIntField(term30206, term30206.getClass(), "maximalIterationCount", 1);
        setDoubleField(term30206, term30206.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term30206, term30206.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term30206, term30206.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term30206, term30206.getClass(), "iterationCount", 0);
        term30207 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$13"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term30171;
        args[1] = -1.0000019096805772;
        args[2] = 9.766840394149214E-4;
        Object retValue = callMethod(klass, "solve", argTypes, term30057, args);
        assertTrue(recursiveEquals(term30057, term30206));
        assertTrue(recursiveEquals(term30171, -1.0000019096805772));
        assertTrue(recursiveEquals(retValue, -0.2492679643905831));
    }

};


