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

public class BrentSolver_solve_74974203825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5142;
     Object term5171;

    public BrentSolver_solve_74974203825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5142 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setIntField(term5142, term5142.getClass(), "maximalIterationCount", 1);
        setDoubleField(term5142, term5142.getClass(), "functionValueAccuracy", -9.1513144428084593E18);
        setDoubleField(term5142, term5142.getClass(), "relativeAccuracy", -4.6039699888841687E18);
        setDoubleField(term5142, term5142.getClass(), "absoluteAccuracy", 1.031952329080838E15);
        term5171 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setDoubleField(term5171, term5171.getClass(), "absoluteAccuracy", 1.031952329080838E15);
        setDoubleField(term5171, term5171.getClass(), "relativeAccuracy", -4.6039699888841687E18);
        setDoubleField(term5171, term5171.getClass(), "functionValueAccuracy", -9.1513144428084593E18);
        setIntField(term5171, term5171.getClass(), "maximalIterationCount", 1);
        setDoubleField(term5171, term5171.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term5171, term5171.getClass(), "defaultRelativeAccuracy", 0.0);
        setDoubleField(term5171, term5171.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setIntField(term5171, term5171.getClass(), "defaultMaximalIterationCount", 0);
        setBooleanField(term5171, term5171.getClass(), "resultComputed", true);
        setDoubleField(term5171, term5171.getClass(), "result", -2.7813423231340017E-308);
        setIntField(term5171, term5171.getClass(), "iterationCount", 0);
        setField(term5171, term5171.getClass(), "f", null);
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
        args[2] = -2.7813423231340017E-308;
        args[3] = 0.0;
        args[4] = -0.0;
        args[5] = 2.2250738585072024E-308;
        Object retValue = callMethod(klass, "solve", argTypes, term5142, args);
        assertTrue(recursiveEquals(term5142, term5171));
        assertTrue(recursiveEquals(retValue, -2.7813423231340017E-308));
    }

};


