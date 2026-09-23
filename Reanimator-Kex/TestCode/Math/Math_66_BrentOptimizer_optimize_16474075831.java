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

public class BrentOptimizer_optimize_16474075831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25441;
     Object term25687;
     Object enum38;

    public BrentOptimizer_optimize_16474075831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26730 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term26729 = ((Class) term26730).getDeclaredField((String) "MAXIMIZE");
        ((Field) term26729).setAccessible(true);
        enum38 = ((Field) term26729).get((Object) null);
        term25441 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term25441, term25441.getClass(), "resultComputed", false);
        setField(term25441, term25441.getClass(), "goal", enum38);
        setDoubleField(term25441, term25441.getClass(), "relativeAccuracy", 4.503599627374592E15);
        setDoubleField(term25441, term25441.getClass(), "absoluteAccuracy", 4.644337115725824E15);
        setIntField(term25441, term25441.getClass(), "evaluations", 2147483646);
        setIntField(term25441, term25441.getClass(), "maxEvaluations", 2147483647);
        term25687 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$7"));
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
        args[0] = term25687;
        args[1] = enum38;
        args[2] = -3.000518798857202;
        args[3] = -3.3381879706483005E-308;
        try {
            callMethod(klass, "optimize", argTypes, term25441, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


