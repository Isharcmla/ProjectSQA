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

public class BisectionSolver_solve_9986191432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term14;
     Object term16;
     Object term18;

    public BisectionSolver_solve_9986191432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        setDoubleField(term1, term1.getClass(), "functionValueAccuracy", 1.0E-15);
        setDoubleField(term1, term1.getClass(), "defaultFunctionValueAccuracy", 1.0E-15);
        setBooleanField(term1, term1.getClass(), "resultComputed", false);
        setDoubleField(term1, term1.getClass(), "result", 0.13238746331190498);
        setDoubleField(term1, term1.getClass(), "functionValue", 0.3455959125047594);
        setField(term1, term1.getClass(), "f", null);
        setDoubleField(term1, term1.getClass(), "absoluteAccuracy", 1.0E-6);
        setDoubleField(term1, term1.getClass(), "relativeAccuracy", 1.0E-14);
        setIntField(term1, term1.getClass(), "maximalIterationCount", 100);
        setDoubleField(term1, term1.getClass(), "defaultAbsoluteAccuracy", 1.0E-6);
        setDoubleField(term1, term1.getClass(), "defaultRelativeAccuracy", 1.0E-14);
        setIntField(term1, term1.getClass(), "defaultMaximalIterationCount", 100);
        setIntField(term1, term1.getClass(), "iterationCount", 568599855);
        term14 = new Double(0.5523635872663106);
        term16 = new Double(0.544608645520025);
        term18 = new Double(0.28570734989730284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term14;
        args[1] = term16;
        args[2] = term18;
        callMethod(klass, "solve", argTypes, term1, args);
    }

};


