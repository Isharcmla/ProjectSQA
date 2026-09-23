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

public class BrentOptimizer_optimize_64344648337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29225;
     Object term29473;

    public BrentOptimizer_optimize_64344648337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30725 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term30724 = ((Class) term30725).getDeclaredField((String) "MAXIMIZE");
        ((Field) term30724).setAccessible(true);
        Object enum42 = ((Field) term30724).get((Object) null);
        term29225 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term29225, term29225.getClass(), "resultComputed", false);
        setField(term29225, term29225.getClass(), "goal", enum42);
        setDoubleField(term29225, term29225.getClass(), "relativeAccuracy", 2.8935627605855437E17);
        setDoubleField(term29225, term29225.getClass(), "absoluteAccuracy", 1.15293030069986918E18);
        setIntField(term29225, term29225.getClass(), "evaluations", 2147483646);
        setIntField(term29225, term29225.getClass(), "maxEvaluations", 2147483647);
        term29473 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$32"));
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
        args[0] = term29473;
        args[1] = null;
        args[2] = 1.1705098431278034E-187;
        args[3] = 2.3410196862556073E-187;
        args[4] = 0.0;
        try {
            callMethod(klass, "optimize", argTypes, term29225, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


