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

public class BrentOptimizer_optimize_64344648345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35754;

    public BrentOptimizer_optimize_64344648345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37295 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term37294 = ((Class) term37295).getDeclaredField((String) "MAXIMIZE");
        ((Field) term37294).setAccessible(true);
        Object enum54 = ((Field) term37294).get((Object) null);
        term35754 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term35754, term35754.getClass(), "resultComputed", false);
        setField(term35754, term35754.getClass(), "goal", enum54);
        setDoubleField(term35754, term35754.getClass(), "relativeAccuracy", 4.6116860195011297E18);
        setDoubleField(term35754, term35754.getClass(), "absoluteAccuracy", 1.125899906842624E15);
        setIntField(term35754, term35754.getClass(), "evaluations", 2147483646);
        setIntField(term35754, term35754.getClass(), "maxEvaluations", 2147483647);
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
        args[2] = 6.953355807835E-310;
        args[3] = 6.953355807835E-310;
        args[4] = 0.0;
        try {
            callMethod(klass, "optimize", argTypes, term35754, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


