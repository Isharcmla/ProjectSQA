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

public class BrentSolver_solve_17359431005 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56;
     Object term69;
     Object term71;

    public BrentSolver_solve_17359431005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setDoubleField(term56, term56.getClass(), "functionValueAccuracy", 1.0E-15);
        setDoubleField(term56, term56.getClass(), "defaultFunctionValueAccuracy", 1.0E-15);
        setBooleanField(term56, term56.getClass(), "resultComputed", false);
        setDoubleField(term56, term56.getClass(), "result", 0.7031006357544823);
        setDoubleField(term56, term56.getClass(), "functionValue", 0.9527281779865117);
        setField(term56, term56.getClass(), "f", null);
        setDoubleField(term56, term56.getClass(), "absoluteAccuracy", 1.0E-6);
        setDoubleField(term56, term56.getClass(), "relativeAccuracy", 1.0E-14);
        setIntField(term56, term56.getClass(), "maximalIterationCount", 100);
        setDoubleField(term56, term56.getClass(), "defaultAbsoluteAccuracy", 1.0E-6);
        setDoubleField(term56, term56.getClass(), "defaultRelativeAccuracy", 1.0E-14);
        setIntField(term56, term56.getClass(), "defaultMaximalIterationCount", 100);
        setIntField(term56, term56.getClass(), "iterationCount", 391863371);
        term69 = new Double(0.9828442029246764);
        term71 = new Double(0.2779719046761513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term69;
        args[2] = term71;
        callMethod(klass, "solve", argTypes, term56, args);
    }

};


