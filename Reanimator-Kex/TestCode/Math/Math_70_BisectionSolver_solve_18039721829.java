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

public class BisectionSolver_solve_18039721829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20;
     Object term33;
     Object term35;

    public BisectionSolver_solve_18039721829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        setDoubleField(term20, term20.getClass(), "functionValueAccuracy", 1.0E-15);
        setDoubleField(term20, term20.getClass(), "defaultFunctionValueAccuracy", 1.0E-15);
        setBooleanField(term20, term20.getClass(), "resultComputed", false);
        setDoubleField(term20, term20.getClass(), "result", 0.40176586625454525);
        setDoubleField(term20, term20.getClass(), "functionValue", 0.2641345529914265);
        setField(term20, term20.getClass(), "f", null);
        setDoubleField(term20, term20.getClass(), "absoluteAccuracy", 1.0E-6);
        setDoubleField(term20, term20.getClass(), "relativeAccuracy", 1.0E-14);
        setIntField(term20, term20.getClass(), "maximalIterationCount", 100);
        setDoubleField(term20, term20.getClass(), "defaultAbsoluteAccuracy", 1.0E-6);
        setDoubleField(term20, term20.getClass(), "defaultRelativeAccuracy", 1.0E-14);
        setIntField(term20, term20.getClass(), "defaultMaximalIterationCount", 100);
        setIntField(term20, term20.getClass(), "iterationCount", 1162663216);
        term33 = new Double(0.36923381893433327);
        term35 = new Double(0.6076495596892013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term33;
        args[1] = term35;
        try {
            callMethod(klass, "solve", argTypes, term20, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


