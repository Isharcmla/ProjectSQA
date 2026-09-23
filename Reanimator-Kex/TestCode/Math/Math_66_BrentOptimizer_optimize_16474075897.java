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

public class BrentOptimizer_optimize_16474075897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76314;
     Object term76562;
     Object enum116;
     Object term77290;
     Object term77294;
     Object enum118;

    public BrentOptimizer_optimize_16474075897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term77299 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term77298 = ((Class) term77299).getDeclaredField((String) "MAXIMIZE");
        ((Field) term77298).setAccessible(true);
        Object enum115 = ((Field) term77298).get((Object) null);
        term76314 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term76314, term76314.getClass(), "resultComputed", false);
        setField(term76314, term76314.getClass(), "goal", enum115);
        setDoubleField(term76314, term76314.getClass(), "relativeAccuracy", 5.7646075230342349E17);
        setDoubleField(term76314, term76314.getClass(), "absoluteAccuracy", 2.8823037615223603E17);
        setIntField(term76314, term76314.getClass(), "evaluations", 2147483646);
        setIntField(term76314, term76314.getClass(), "maxEvaluations", 2147483647);
        setIntField(term76314, term76314.getClass(), "maximalIterationCount", 1);
        term76562 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$26"));
        Class<? extends Object> term77555 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term77554 = ((Class) term77555).getDeclaredField((String) "MINIMIZE");
        ((Field) term77554).setAccessible(true);
        enum116 = ((Field) term77554).get((Object) null);
        Class<? extends Object> term77811 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term77810 = ((Class) term77811).getDeclaredField((String) "MAXIMIZE");
        ((Field) term77810).setAccessible(true);
        Object enum117 = ((Field) term77810).get((Object) null);
        term77290 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term77290, term77290.getClass(), "resultComputed", true);
        setDoubleField(term77290, term77290.getClass(), "result", Double.NaN);
        setDoubleField(term77290, term77290.getClass(), "functionValue", Double.NaN);
        setIntField(term77290, term77290.getClass(), "maxEvaluations", 2147483647);
        setIntField(term77290, term77290.getClass(), "evaluations", 2147483647);
        setField(term77290, term77290.getClass(), "goal", enum117);
        setDoubleField(term77290, term77290.getClass(), "min", 0.0);
        setDoubleField(term77290, term77290.getClass(), "max", 0.0);
        setDoubleField(term77290, term77290.getClass(), "startValue", 0.0);
        setField(term77290, term77290.getClass(), "function", null);
        setDoubleField(term77290, term77290.getClass(), "absoluteAccuracy", 2.8823037615223603E17);
        setDoubleField(term77290, term77290.getClass(), "relativeAccuracy", 5.7646075230342349E17);
        setIntField(term77290, term77290.getClass(), "maximalIterationCount", 1);
        setDoubleField(term77290, term77290.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term77290, term77290.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term77290, term77290.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term77290, term77290.getClass(), "iterationCount", 0);
        term77294 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$26"));
        Class<? extends Object> term78067 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term78066 = ((Class) term78067).getDeclaredField((String) "MINIMIZE");
        ((Field) term78066).setAccessible(true);
        enum118 = ((Field) term78066).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = Class.forName("org.apache.commons.math.optimization.GoalType");
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term76562;
        args[1] = enum116;
        args[2] = Double.NaN;
        args[3] = -1.823590256E-315;
        Object retValue = callMethod(klass, "optimize", argTypes, term76314, args);
        assertTrue(recursiveEquals(term76314, term77290));
        assertTrue(recursiveEquals(term76562, term77294));
        assertTrue(recursiveEquals(enum116, enum118));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


