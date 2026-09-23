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
import static org.apache.commons.math.optimization.univariate.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class BrentOptimizer_optimize_16474075842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32064;
     Object term32310;
     Object enum50;
     Object term34510;
     Object term34514;
     Object enum52;

    public BrentOptimizer_optimize_16474075842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34519 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term34518 = ((Class) term34519).getDeclaredField((String) "MAXIMIZE");
        ((Field) term34518).setAccessible(true);
        Object enum49 = ((Field) term34518).get((Object) null);
        term32064 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term32064, term32064.getClass(), "resultComputed", false);
        setField(term32064, term32064.getClass(), "goal", enum49);
        setDoubleField(term32064, term32064.getClass(), "relativeAccuracy", 4.503599627374592E15);
        setDoubleField(term32064, term32064.getClass(), "absoluteAccuracy", 6.755399441055744E15);
        setIntField(term32064, term32064.getClass(), "evaluations", 2147483646);
        setIntField(term32064, term32064.getClass(), "maxEvaluations", 2147483647);
        setIntField(term32064, term32064.getClass(), "maximalIterationCount", 1);
        term32310 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$7"));
        Class<? extends Object> term34775 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term34774 = ((Class) term34775).getDeclaredField((String) "MINIMIZE");
        ((Field) term34774).setAccessible(true);
        enum50 = ((Field) term34774).get((Object) null);
        Class<? extends Object> term35031 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term35030 = ((Class) term35031).getDeclaredField((String) "MAXIMIZE");
        ((Field) term35030).setAccessible(true);
        Object enum51 = ((Field) term35030).get((Object) null);
        term34510 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term34510, term34510.getClass(), "resultComputed", true);
        setDoubleField(term34510, term34510.getClass(), "result", 5.249705734860489E10);
        setDoubleField(term34510, term34510.getClass(), "functionValue", -0.9316677851738343);
        setIntField(term34510, term34510.getClass(), "maxEvaluations", 2147483647);
        setIntField(term34510, term34510.getClass(), "evaluations", 2147483647);
        setField(term34510, term34510.getClass(), "goal", enum51);
        setDoubleField(term34510, term34510.getClass(), "min", 0.0);
        setDoubleField(term34510, term34510.getClass(), "max", 0.0);
        setDoubleField(term34510, term34510.getClass(), "startValue", 0.0);
        setField(term34510, term34510.getClass(), "function", null);
        setDoubleField(term34510, term34510.getClass(), "absoluteAccuracy", 6.755399441055744E15);
        setDoubleField(term34510, term34510.getClass(), "relativeAccuracy", 4.503599627374592E15);
        setIntField(term34510, term34510.getClass(), "maximalIterationCount", 1);
        setDoubleField(term34510, term34510.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term34510, term34510.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term34510, term34510.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term34510, term34510.getClass(), "iterationCount", 0);
        term34514 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$7"));
        Class<? extends Object> term35287 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term35286 = ((Class) term35287).getDeclaredField((String) "MINIMIZE");
        ((Field) term35286).setAccessible(true);
        enum52 = ((Field) term35286).get((Object) null);
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
        args[0] = term32310;
        args[1] = enum50;
        args[2] = 3.2519520433173356E-260;
        args[3] = 1.3743908044800006E11;
        Object retValue = callMethod(klass, "optimize", argTypes, term32064, args);
        assertTrue(recursiveEquals(term32064, term34510));
        assertTrue(recursiveEquals(term32310, term34514));
        assertTrue(recursiveEquals(enum50, enum52));
        assertTrue(recursiveEquals(retValue, 5.249705734860489E10));
    }

};


