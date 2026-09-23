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
import java.lang.Double;

public class BrentOptimizer_optimize_1647407588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term599;
     Object enum9;
     Object term639;
     Object term641;

    public BrentOptimizer_optimize_1647407588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3458 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term3457 = ((Class) term3458).getDeclaredField((String) "MAXIMIZE");
        ((Field) term3457).setAccessible(true);
        Object enum8 = ((Field) term3457).get((Object) null);
        term599 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term599, term599.getClass(), "resultComputed", false);
        setDoubleField(term599, term599.getClass(), "result", 0.2779719046761513);
        setDoubleField(term599, term599.getClass(), "functionValue", 0.6436713023569729);
        setIntField(term599, term599.getClass(), "maxEvaluations", 2147483647);
        setIntField(term599, term599.getClass(), "evaluations", -1955890973);
        setField(term599, term599.getClass(), "goal", enum8);
        setDoubleField(term599, term599.getClass(), "min", 0.7332741045694002);
        setDoubleField(term599, term599.getClass(), "max", 0.4569171842750229);
        setDoubleField(term599, term599.getClass(), "startValue", 0.8598297828918529);
        setField(term599, term599.getClass(), "function", null);
        setDoubleField(term599, term599.getClass(), "absoluteAccuracy", 1.0E-10);
        setDoubleField(term599, term599.getClass(), "relativeAccuracy", 1.0E-14);
        setIntField(term599, term599.getClass(), "maximalIterationCount", 100);
        setDoubleField(term599, term599.getClass(), "defaultAbsoluteAccuracy", 0.43692187681405226);
        setDoubleField(term599, term599.getClass(), "defaultRelativeAccuracy", 0.7633268466829064);
        setIntField(term599, term599.getClass(), "defaultMaximalIterationCount", -2038273078);
        setIntField(term599, term599.getClass(), "iterationCount", 1227103734);
        Class<? extends Object> term3714 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term3713 = ((Class) term3714).getDeclaredField((String) "MINIMIZE");
        ((Field) term3713).setAccessible(true);
        enum9 = ((Field) term3713).get((Object) null);
        term639 = new Double(0.13481025392611334);
        term641 = new Double(0.3800088629986428);
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
        args[0] = null;
        args[1] = enum9;
        args[2] = term639;
        args[3] = term641;
        try {
            callMethod(klass, "optimize", argTypes, term599, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


