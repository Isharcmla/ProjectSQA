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

public class BrentSolver_solve_7497420389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2294;
     Object term2321;

    public BrentSolver_solve_7497420389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2294 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setIntField(term2294, term2294.getClass(), "maximalIterationCount", 1);
        term2321 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setDoubleField(term2321, term2321.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term2321, term2321.getClass(), "relativeAccuracy", 0.0);
        setDoubleField(term2321, term2321.getClass(), "functionValueAccuracy", 0.0);
        setIntField(term2321, term2321.getClass(), "maximalIterationCount", 1);
        setDoubleField(term2321, term2321.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term2321, term2321.getClass(), "defaultRelativeAccuracy", 0.0);
        setDoubleField(term2321, term2321.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setIntField(term2321, term2321.getClass(), "defaultMaximalIterationCount", 0);
        setBooleanField(term2321, term2321.getClass(), "resultComputed", true);
        setDoubleField(term2321, term2321.getClass(), "result", Double.NaN);
        setIntField(term2321, term2321.getClass(), "iterationCount", 0);
        setField(term2321, term2321.getClass(), "f", null);
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
        args[3] = 0.0;
        args[4] = 0.0;
        args[5] = 0.0;
        Object retValue = callMethod(klass, "solve", argTypes, term2294, args);
        assertTrue(recursiveEquals(term2294, term2321));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


