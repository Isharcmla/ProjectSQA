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

public class BrentOptimizer_optimize_64344648325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20786;

    public BrentOptimizer_optimize_64344648325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20922 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term20921 = ((Class) term20922).getDeclaredField((String) "MAXIMIZE");
        ((Field) term20921).setAccessible(true);
        Object enum31 = ((Field) term20921).get((Object) null);
        term20786 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term20786, term20786.getClass(), "resultComputed", false);
        setField(term20786, term20786.getClass(), "goal", enum31);
        setDoubleField(term20786, term20786.getClass(), "relativeAccuracy", 1.8014398509482496E16);
        setDoubleField(term20786, term20786.getClass(), "absoluteAccuracy", 1.125899906842624E15);
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
        args[2] = -1.73855115153785E-310;
        args[3] = -1.73855115153785E-310;
        args[4] = 0.0;
        callMethod(klass, "optimize", argTypes, term20786, args);
    }

};


