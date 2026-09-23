package org.apache.commons.math.analysis;

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
import static org.apache.commons.math.analysis.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.analysis.EqualityUtils.*;
import java.lang.Double;

public class BrentSolver_solve_74974203853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10607;
     Object term10636;

    public BrentSolver_solve_74974203853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10607 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setIntField(term10607, term10607.getClass(), "maximalIterationCount", 1);
        setDoubleField(term10607, term10607.getClass(), "functionValueAccuracy", -8.6446561862027837E18);
        setDoubleField(term10607, term10607.getClass(), "relativeAccuracy", 4.6163461411607101E18);
        setDoubleField(term10607, term10607.getClass(), "absoluteAccuracy", -1.15632942398570496E18);
        term10636 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setDoubleField(term10636, term10636.getClass(), "absoluteAccuracy", -1.15632942398570496E18);
        setDoubleField(term10636, term10636.getClass(), "relativeAccuracy", 4.6163461411607101E18);
        setDoubleField(term10636, term10636.getClass(), "functionValueAccuracy", -8.6446561862027837E18);
        setIntField(term10636, term10636.getClass(), "maximalIterationCount", 1);
        setDoubleField(term10636, term10636.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term10636, term10636.getClass(), "defaultRelativeAccuracy", 0.0);
        setDoubleField(term10636, term10636.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setIntField(term10636, term10636.getClass(), "defaultMaximalIterationCount", 0);
        setBooleanField(term10636, term10636.getClass(), "resultComputed", true);
        setDoubleField(term10636, term10636.getClass(), "result", -0.8364255447397769);
        setIntField(term10636, term10636.getClass(), "iterationCount", 0);
        setField(term10636, term10636.getClass(), "f", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.BrentSolver");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        argTypes[5] = double.class;
        Object[] args = new Object[6];
        args[0] = Double.NaN;
        args[1] = 0.0;
        args[2] = -1.5019531269083561;
        args[3] = 7.294737764576472E-304;
        args[4] = -0.8364255447397769;
        args[5] = -0.0;
        Object retValue = callMethod(klass, "solve", argTypes, term10607, args);
        assertTrue(recursiveEquals(term10607, term10636));
        assertTrue(recursiveEquals(retValue, -0.8364255447397769));
    }

};


