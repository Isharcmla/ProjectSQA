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

public class BrentSolver_solve_108921612461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16028;
     Object term16142;
     Object term16173;
     Object term16174;

    public BrentSolver_solve_108921612461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16028 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setIntField(term16028, term16028.getClass(), "maximalIterationCount", 4);
        setDoubleField(term16028, term16028.getClass(), "functionValueAccuracy", -8.6086103448387154E18);
        setDoubleField(term16028, term16028.getClass(), "relativeAccuracy", 3.28652323848682E14);
        setDoubleField(term16028, term16028.getClass(), "absoluteAccuracy", 3.3554432E7);
        term16142 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
        term16173 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setDoubleField(term16173, term16173.getClass(), "functionValueAccuracy", -8.6086103448387154E18);
        setDoubleField(term16173, term16173.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term16173, term16173.getClass(), "resultComputed", true);
        setDoubleField(term16173, term16173.getClass(), "result", -0.0);
        setDoubleField(term16173, term16173.getClass(), "functionValue", 0.0);
        setField(term16173, term16173.getClass(), "f", null);
        setDoubleField(term16173, term16173.getClass(), "absoluteAccuracy", 3.3554432E7);
        setDoubleField(term16173, term16173.getClass(), "relativeAccuracy", 3.28652323848682E14);
        setIntField(term16173, term16173.getClass(), "maximalIterationCount", 4);
        setDoubleField(term16173, term16173.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term16173, term16173.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term16173, term16173.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term16173, term16173.getClass(), "iterationCount", 0);
        term16174 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        argTypes[5] = double.class;
        argTypes[6] = double.class;
        Object[] args = new Object[7];
        args[0] = term16142;
        args[1] = -0.0;
        args[2] = 0.0;
        args[3] = -0.0;
        args[4] = -1.41919812378311E-309;
        args[5] = 1.112536962409786E-308;
        args[6] = -1.115389111617601E-308;
        Object retValue = callMethod(klass, "solve", argTypes, term16028, args);
        assertTrue(recursiveEquals(term16028, term16173));
        assertTrue(recursiveEquals(term16142, term16174));
        assertTrue(recursiveEquals(retValue, -0.0));
    }

};


