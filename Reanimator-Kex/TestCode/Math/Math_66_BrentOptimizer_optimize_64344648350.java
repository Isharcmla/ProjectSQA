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
import java.lang.String;
import java.lang.Object;

public class BrentOptimizer_optimize_64344648350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41083;

    public BrentOptimizer_optimize_64344648350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41219 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term41218 = ((Class) term41219).getDeclaredField((String) "MINIMIZE");
        ((Field) term41218).setAccessible(true);
        Object enum63 = ((Field) term41218).get((Object) null);
        term41083 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term41083, term41083.getClass(), "resultComputed", false);
        setField(term41083, term41083.getClass(), "goal", enum63);
        setDoubleField(term41083, term41083.getClass(), "relativeAccuracy", 4.503599627370497E15);
        setDoubleField(term41083, term41083.getClass(), "absoluteAccuracy", 4.503599627370497E15);
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
        args[2] = 0.0;
        args[3] = 0.0;
        args[4] = 0.0;
        callMethod(klass, "optimize", argTypes, term41083, args);
    }

};


