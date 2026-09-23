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
import org.apache.commons.math.MaxIterationsExceededException;
import static org.apache.commons.math.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class BrentOptimizer_localMin_36303945191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70558;
     Object term70672;
     Object enum106;

    public BrentOptimizer_localMin_36303945191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70558 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setIntField(term70558, term70558.getClass(), "evaluations", 2147483646);
        setIntField(term70558, term70558.getClass(), "maxEvaluations", 2147483647);
        setIntField(term70558, term70558.getClass(), "maximalIterationCount", 1);
        term70672 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
        Class<? extends Object> term71770 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term71769 = ((Class) term71770).getDeclaredField((String) "MINIMIZE");
        ((Field) term71769).setAccessible(true);
        enum106 = ((Field) term71769).get((Object) null);
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
        args[1] = term70672;
        args[2] = enum106;
        args[3] = -2.0000000001309672;
        args[4] = 0.0;
        args[5] = 3.785766996064221E-270;
        args[6] = 2.2250759805029923E-308;
        args[7] = 4.458839411774197E-308;
        try {
            callMethod(klass, "localMin", argTypes, term70558, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


