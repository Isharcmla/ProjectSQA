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
import java.lang.Double;

public class BrentSolver_solve_5651385503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18;
     Object term31;
     Object term33;
     Object term35;

    public BrentSolver_solve_5651385503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setDoubleField(term18, term18.getClass(), "functionValueAccuracy", 1.0E-15);
        setDoubleField(term18, term18.getClass(), "defaultFunctionValueAccuracy", 1.0E-15);
        setBooleanField(term18, term18.getClass(), "resultComputed", false);
        setDoubleField(term18, term18.getClass(), "result", 0.28570734989730284);
        setDoubleField(term18, term18.getClass(), "functionValue", 0.40176586625454525);
        setField(term18, term18.getClass(), "f", null);
        setDoubleField(term18, term18.getClass(), "absoluteAccuracy", 1.0E-6);
        setDoubleField(term18, term18.getClass(), "relativeAccuracy", 1.0E-14);
        setIntField(term18, term18.getClass(), "maximalIterationCount", 100);
        setDoubleField(term18, term18.getClass(), "defaultAbsoluteAccuracy", 1.0E-6);
        setDoubleField(term18, term18.getClass(), "defaultRelativeAccuracy", 1.0E-14);
        setIntField(term18, term18.getClass(), "defaultMaximalIterationCount", 100);
        setIntField(term18, term18.getClass(), "iterationCount", 1162663216);
        term31 = new Double(0.2641345529914265);
        term33 = new Double(0.36923381893433327);
        term35 = new Double(0.6076495596892013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term31;
        args[1] = term33;
        args[2] = term35;
        callMethod(klass, "solve", argTypes, term18, args);
    }

};


