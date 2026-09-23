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

public class BrentOptimizer_optimize_64344648399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78556;
     Object term78802;
     Object enum122;

    public BrentOptimizer_optimize_64344648399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80168 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term80167 = ((Class) term80168).getDeclaredField((String) "MINIMIZE");
        ((Field) term80167).setAccessible(true);
        Object enum121 = ((Field) term80167).get((Object) null);
        term78556 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term78556, term78556.getClass(), "resultComputed", false);
        setField(term78556, term78556.getClass(), "goal", enum121);
        setDoubleField(term78556, term78556.getClass(), "relativeAccuracy", 4.505798650626048E15);
        setDoubleField(term78556, term78556.getClass(), "absoluteAccuracy", 4.503599627370497E15);
        setIntField(term78556, term78556.getClass(), "evaluations", 2147483646);
        setIntField(term78556, term78556.getClass(), "maxEvaluations", 2147483647);
        term78802 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$2"));
        Class<? extends Object> term80424 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term80423 = ((Class) term80424).getDeclaredField((String) "MAXIMIZE");
        ((Field) term80423).setAccessible(true);
        enum122 = ((Field) term80423).get((Object) null);
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
        args[0] = term78802;
        args[1] = enum122;
        args[2] = -8.000205993652344;
        args[3] = -2.225131152393558E-308;
        args[4] = 0.0;
        try {
            callMethod(klass, "optimize", argTypes, term78556, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


