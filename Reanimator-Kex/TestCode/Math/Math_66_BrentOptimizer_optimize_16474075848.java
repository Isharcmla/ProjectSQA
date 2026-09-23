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

public class BrentOptimizer_optimize_16474075848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38043;
     Object term38289;
     Object enum58;
     Object term39291;
     Object term39295;
     Object enum60;

    public BrentOptimizer_optimize_16474075848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39300 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term39299 = ((Class) term39300).getDeclaredField((String) "MAXIMIZE");
        ((Field) term39299).setAccessible(true);
        enum58 = ((Field) term39299).get((Object) null);
        term38043 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term38043, term38043.getClass(), "resultComputed", false);
        setField(term38043, term38043.getClass(), "goal", enum58);
        setDoubleField(term38043, term38043.getClass(), "relativeAccuracy", 4.503599627403264E15);
        setDoubleField(term38043, term38043.getClass(), "absoluteAccuracy", 4.644337115725824E15);
        setIntField(term38043, term38043.getClass(), "evaluations", 2147483646);
        setIntField(term38043, term38043.getClass(), "maxEvaluations", 2147483647);
        setIntField(term38043, term38043.getClass(), "maximalIterationCount", 1);
        term38289 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$7"));
        Class<? extends Object> term39556 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term39555 = ((Class) term39556).getDeclaredField((String) "MAXIMIZE");
        ((Field) term39555).setAccessible(true);
        Object enum59 = ((Field) term39555).get((Object) null);
        term39291 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term39291, term39291.getClass(), "resultComputed", true);
        setDoubleField(term39291, term39291.getClass(), "result", -6.472135954999583);
        setDoubleField(term39291, term39291.getClass(), "functionValue", -0.1878283229006907);
        setIntField(term39291, term39291.getClass(), "maxEvaluations", 2147483647);
        setIntField(term39291, term39291.getClass(), "evaluations", 2147483647);
        setField(term39291, term39291.getClass(), "goal", enum59);
        setDoubleField(term39291, term39291.getClass(), "min", 0.0);
        setDoubleField(term39291, term39291.getClass(), "max", 0.0);
        setDoubleField(term39291, term39291.getClass(), "startValue", 0.0);
        setField(term39291, term39291.getClass(), "function", null);
        setDoubleField(term39291, term39291.getClass(), "absoluteAccuracy", 4.644337115725824E15);
        setDoubleField(term39291, term39291.getClass(), "relativeAccuracy", 4.503599627403264E15);
        setIntField(term39291, term39291.getClass(), "maximalIterationCount", 1);
        setDoubleField(term39291, term39291.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term39291, term39291.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term39291, term39291.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term39291, term39291.getClass(), "iterationCount", 0);
        term39295 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$7"));
        Class<? extends Object> term39812 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term39811 = ((Class) term39812).getDeclaredField((String) "MAXIMIZE");
        ((Field) term39811).setAccessible(true);
        enum60 = ((Field) term39811).get((Object) null);
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
        args[0] = term38289;
        args[1] = enum58;
        args[2] = -8.000000000000002;
        args[3] = -4.000000000000007;
        Object retValue = callMethod(klass, "optimize", argTypes, term38043, args);
        assertTrue(recursiveEquals(term38043, term39291));
        assertTrue(recursiveEquals(term38289, term39295));
        assertTrue(recursiveEquals(enum58, enum60));
        assertTrue(recursiveEquals(retValue, -6.472135954999583));
    }

};


