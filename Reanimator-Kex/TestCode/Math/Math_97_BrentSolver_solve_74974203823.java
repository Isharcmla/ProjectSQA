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

public class BrentSolver_solve_74974203823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4911;
     Object term4938;

    public BrentSolver_solve_74974203823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4911 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setIntField(term4911, term4911.getClass(), "maximalIterationCount", 1);
        setDoubleField(term4911, term4911.getClass(), "functionValueAccuracy", 4.0336300680255898E17);
        term4938 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setDoubleField(term4938, term4938.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term4938, term4938.getClass(), "relativeAccuracy", 0.0);
        setDoubleField(term4938, term4938.getClass(), "functionValueAccuracy", 4.0336300680255898E17);
        setIntField(term4938, term4938.getClass(), "maximalIterationCount", 1);
        setDoubleField(term4938, term4938.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term4938, term4938.getClass(), "defaultRelativeAccuracy", 0.0);
        setDoubleField(term4938, term4938.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setIntField(term4938, term4938.getClass(), "defaultMaximalIterationCount", 0);
        setBooleanField(term4938, term4938.getClass(), "resultComputed", true);
        setDoubleField(term4938, term4938.getClass(), "result", 0.0);
        setIntField(term4938, term4938.getClass(), "iterationCount", 0);
        setField(term4938, term4938.getClass(), "f", null);
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
        args[2] = Double.NaN;
        args[3] = 8.590983168000002E9;
        args[4] = 0.0;
        args[5] = -8.824781212734398E-282;
        Object retValue = callMethod(klass, "solve", argTypes, term4911, args);
        assertTrue(recursiveEquals(term4911, term4938));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


