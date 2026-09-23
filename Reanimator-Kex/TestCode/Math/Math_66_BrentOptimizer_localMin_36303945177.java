package org.apache.commons.math.optimization.univariate;

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
import static org.apache.commons.math.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.optimization.univariate.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;
import java.lang.Double;

public class BrentOptimizer_localMin_36303945177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59472;
     Object term59586;
     Object enum86;
     Object term60029;
     Object term60030;
     Object enum87;

    public BrentOptimizer_localMin_36303945177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59472 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setIntField(term59472, term59472.getClass(), "evaluations", 2147483646);
        setIntField(term59472, term59472.getClass(), "maxEvaluations", 2147483647);
        setIntField(term59472, term59472.getClass(), "maximalIterationCount", 1);
        term59586 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$17"));
        Class<? extends Object> term60035 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term60034 = ((Class) term60035).getDeclaredField((String) "MAXIMIZE");
        ((Field) term60034).setAccessible(true);
        enum86 = ((Field) term60034).get((Object) null);
        term60029 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term60029, term60029.getClass(), "resultComputed", true);
        setDoubleField(term60029, term60029.getClass(), "result", Double.NaN);
        setDoubleField(term60029, term60029.getClass(), "functionValue", Double.NaN);
        setIntField(term60029, term60029.getClass(), "maxEvaluations", 2147483647);
        setIntField(term60029, term60029.getClass(), "evaluations", 2147483647);
        setField(term60029, term60029.getClass(), "goal", null);
        setDoubleField(term60029, term60029.getClass(), "min", 0.0);
        setDoubleField(term60029, term60029.getClass(), "max", 0.0);
        setDoubleField(term60029, term60029.getClass(), "startValue", 0.0);
        setField(term60029, term60029.getClass(), "function", null);
        setDoubleField(term60029, term60029.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term60029, term60029.getClass(), "relativeAccuracy", 0.0);
        setIntField(term60029, term60029.getClass(), "maximalIterationCount", 1);
        setDoubleField(term60029, term60029.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term60029, term60029.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term60029, term60029.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term60029, term60029.getClass(), "iterationCount", 0);
        term60030 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$17"));
        Class<? extends Object> term60291 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term60290 = ((Class) term60291).getDeclaredField((String) "MAXIMIZE");
        ((Field) term60290).setAccessible(true);
        enum87 = ((Field) term60290).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[2] = Class.forName("org.apache.commons.math.optimization.GoalType");
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        argTypes[5] = double.class;
        argTypes[6] = double.class;
        argTypes[7] = double.class;
        Object[] args = new Object[8];
        args[0] = false;
        args[1] = term59586;
        args[2] = enum86;
        args[3] = 9.912614594483362E173;
        args[4] = Double.NaN;
        args[5] = 1.7969052678103683E41;
        args[6] = 2.056276737369206E-289;
        args[7] = 1.2882297539194267E-231;
        Object retValue = callMethod(klass, "localMin", argTypes, term59472, args);
        assertTrue(recursiveEquals(term59472, term60029));
        assertTrue(recursiveEquals(term59586, Double.NaN));
        assertTrue(recursiveEquals(enum86, false));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


