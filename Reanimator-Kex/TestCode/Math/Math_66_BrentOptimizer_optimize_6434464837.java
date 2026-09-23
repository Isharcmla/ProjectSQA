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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Double;

public class BrentOptimizer_optimize_6434464837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309;
     Object enum6;
     Object term337;
     Object term339;
     Object term341;

    public BrentOptimizer_optimize_6434464837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2642 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term2641 = ((Class) term2642).getDeclaredField((String) "MAXIMIZE");
        ((Field) term2641).setAccessible(true);
        enum6 = ((Field) term2641).get((Object) null);
        term309 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term309, term309.getClass(), "resultComputed", false);
        setDoubleField(term309, term309.getClass(), "result", 0.36923381893433327);
        setDoubleField(term309, term309.getClass(), "functionValue", 0.6076495596892013);
        setIntField(term309, term309.getClass(), "maxEvaluations", 2147483647);
        setIntField(term309, term309.getClass(), "evaluations", 391863371);
        setField(term309, term309.getClass(), "goal", enum6);
        setDoubleField(term309, term309.getClass(), "min", 0.37773193782763337);
        setDoubleField(term309, term309.getClass(), "max", 0.8474802076607362);
        setDoubleField(term309, term309.getClass(), "startValue", 0.5183269973490326);
        setField(term309, term309.getClass(), "function", null);
        setDoubleField(term309, term309.getClass(), "absoluteAccuracy", 1.0E-10);
        setDoubleField(term309, term309.getClass(), "relativeAccuracy", 1.0E-14);
        setIntField(term309, term309.getClass(), "maximalIterationCount", 100);
        setDoubleField(term309, term309.getClass(), "defaultAbsoluteAccuracy", 0.7655020693602768);
        setDoubleField(term309, term309.getClass(), "defaultRelativeAccuracy", 0.1374549299694151);
        setIntField(term309, term309.getClass(), "defaultMaximalIterationCount", -1922583790);
        setIntField(term309, term309.getClass(), "iterationCount", -616727354);
        term337 = new Double(0.7031006357544823);
        term339 = new Double(0.9527281779865117);
        term341 = new Double(0.9828442029246764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = Class.forName("org.apache.commons.math.optimization.GoalType");
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = enum6;
        args[2] = term337;
        args[3] = term339;
        args[4] = term341;
        try {
            callMethod(klass, "optimize", argTypes, term309, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


