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

public class BrentOptimizer_optimize_16474075826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20084;
     Object term20330;

    public BrentOptimizer_optimize_16474075826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21896 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term21895 = ((Class) term21896).getDeclaredField((String) "MAXIMIZE");
        ((Field) term21895).setAccessible(true);
        Object enum32 = ((Field) term21895).get((Object) null);
        term20084 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term20084, term20084.getClass(), "resultComputed", false);
        setField(term20084, term20084.getClass(), "goal", enum32);
        setDoubleField(term20084, term20084.getClass(), "relativeAccuracy", 7.2075186223972352E16);
        setDoubleField(term20084, term20084.getClass(), "absoluteAccuracy", 4.503599627370497E15);
        setIntField(term20084, term20084.getClass(), "evaluations", 2147483646);
        setIntField(term20084, term20084.getClass(), "maxEvaluations", 2147483647);
        term20330 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$7"));
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
        args[0] = term20330;
        args[1] = null;
        args[2] = -6.000000058241377;
        args[3] = -5.678650548727272E-270;
        try {
            callMethod(klass, "optimize", argTypes, term20084, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


