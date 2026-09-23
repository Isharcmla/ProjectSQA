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

public class BrentOptimizer_optimize_64344648387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67427;

    public BrentOptimizer_optimize_64344648387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68123 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term68122 = ((Class) term68123).getDeclaredField((String) "MINIMIZE");
        ((Field) term68122).setAccessible(true);
        Object enum101 = ((Field) term68122).get((Object) null);
        term67427 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term67427, term67427.getClass(), "resultComputed", false);
        setField(term67427, term67427.getClass(), "goal", enum101);
        setDoubleField(term67427, term67427.getClass(), "relativeAccuracy", 4.644337115725824E15);
        setDoubleField(term67427, term67427.getClass(), "absoluteAccuracy", 1.125899906842624E15);
        setIntField(term67427, term67427.getClass(), "evaluations", 2147483646);
        setIntField(term67427, term67427.getClass(), "maxEvaluations", 2147483647);
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
        args[1] = null;
        args[2] = -6.968982874540844E41;
        args[3] = -1.2114454386348464E-268;
        args[4] = 0.0;
        try {
            callMethod(klass, "optimize", argTypes, term67427, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


