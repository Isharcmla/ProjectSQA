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
import java.lang.Double;

public class BrentOptimizer_optimize_16474075893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72266;
     Object term72514;
     Object enum108;

    public BrentOptimizer_optimize_16474075893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term73572 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term73571 = ((Class) term73572).getDeclaredField((String) "MAXIMIZE");
        ((Field) term73571).setAccessible(true);
        enum108 = ((Field) term73571).get((Object) null);
        term72266 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term72266, term72266.getClass(), "resultComputed", false);
        setField(term72266, term72266.getClass(), "goal", enum108);
        setDoubleField(term72266, term72266.getClass(), "relativeAccuracy", 4.5035996273705E15);
        setDoubleField(term72266, term72266.getClass(), "absoluteAccuracy", 7.2057594037927952E16);
        setIntField(term72266, term72266.getClass(), "evaluations", 2147483646);
        setIntField(term72266, term72266.getClass(), "maxEvaluations", 2147483647);
        term72514 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$26"));
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
        args[0] = term72514;
        args[1] = enum108;
        args[2] = 1.668805393880417E-308;
        args[3] = Double.NaN;
        try {
            callMethod(klass, "optimize", argTypes, term72266, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


