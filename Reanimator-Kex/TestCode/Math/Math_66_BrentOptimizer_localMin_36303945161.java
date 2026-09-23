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

public class BrentOptimizer_localMin_36303945161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47824;
     Object term47938;
     Object enum71;

    public BrentOptimizer_localMin_36303945161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47824 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setIntField(term47824, term47824.getClass(), "evaluations", 2147483646);
        setIntField(term47824, term47824.getClass(), "maxEvaluations", 2147483647);
        setIntField(term47824, term47824.getClass(), "maximalIterationCount", 1);
        term47938 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$17"));
        Class<? extends Object> term49036 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term49035 = ((Class) term49036).getDeclaredField((String) "MINIMIZE");
        ((Field) term49035).setAccessible(true);
        enum71 = ((Field) term49035).get((Object) null);
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
        args[1] = term47938;
        args[2] = enum71;
        args[3] = 2.688029891763504E-153;
        args[4] = 2.000244453607593;
        args[5] = -6.590501999918283E-306;
        args[6] = 2.2250738626517244E-308;
        args[7] = 2.225107810439857E-308;
        try {
            callMethod(klass, "localMin", argTypes, term47824, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


