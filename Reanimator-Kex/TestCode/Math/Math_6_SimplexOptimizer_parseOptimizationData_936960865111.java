package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

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
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class SimplexOptimizer_parseOptimizationData_936960865111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70066;
     Object term69726;
     Object term71287;
     Object term71291;

    public SimplexOptimizer_parseOptimizationData_936960865111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70066 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term70066, term70066.getClass(), "start", null);
        setField(term70066, term70066.getClass(), "goal", null);
        Class<? extends Object> term71298 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term71297 = ((Class) term71298).getDeclaredField((String) "MAXIMIZE");
        ((Field) term71297).setAccessible(true);
        Object enum42 = ((Field) term71297).get((Object) null);
        Class<? extends Object> term71609 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term71608 = ((Class) term71609).getDeclaredField((String) "MAXIMIZE");
        ((Field) term71608).setAccessible(true);
        Object enum43 = ((Field) term71608).get((Object) null);
        term69726 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term70190 = newInstance(Class.forName("org.apache.commons.math3.optim.linear.NonNegativeConstraint"));
        Object term70304 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.Target"));
        setElement(term69726, 0, term70190);
        setElement(term69726, 2, term70304);
        setElement(term69726, 3, enum42);
        setElement(term69726, 5, enum43);
        Class<? extends Object> term71920 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term71919 = ((Class) term71920).getDeclaredField((String) "MAXIMIZE");
        ((Field) term71919).setAccessible(true);
        Object enum44 = ((Field) term71919).get((Object) null);
        term71287 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term71287, term71287.getClass(), "simplex", null);
        setField(term71287, term71287.getClass(), "function", null);
        setField(term71287, term71287.getClass(), "goal", enum44);
        setField(term71287, term71287.getClass(), "start", null);
        setField(term71287, term71287.getClass(), "lowerBound", null);
        setField(term71287, term71287.getClass(), "upperBound", null);
        setField(term71287, term71287.getClass(), "evaluations", null);
        setField(term71287, term71287.getClass(), "iterations", null);
        setField(term71287, term71287.getClass(), "checker", null);
        Class<? extends Object> term72231 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term72230 = ((Class) term72231).getDeclaredField((String) "MAXIMIZE");
        ((Field) term72230).setAccessible(true);
        Object enum45 = ((Field) term72230).get((Object) null);
        term71291 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term71292 = newInstance(Class.forName("org.apache.commons.math3.optim.linear.NonNegativeConstraint"));
        Object term71293 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.Target"));
        setBooleanField(term71292, term71292.getClass(), "isRestricted", false);
        setElement(term71291, 0, term71292);
        setField(term71293, term71293.getClass(), "target", null);
        setElement(term71291, 2, term71293);
        setElement(term71291, 3, enum45);
        setElement(term71291, 5, enum45);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term69726;
        callMethod(klass, "parseOptimizationData", argTypes, term70066, args);
        assertTrue(recursiveEquals(term70066, term71287));
        assertTrue(recursiveEquals(term69726, term71291));
    }

};


