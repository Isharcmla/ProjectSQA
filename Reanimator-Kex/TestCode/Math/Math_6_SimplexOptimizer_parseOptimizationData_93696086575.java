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

public class SimplexOptimizer_parseOptimizationData_93696086575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37974;
     Object term37686;
     Object term38603;
     Object term38607;

    public SimplexOptimizer_parseOptimizationData_93696086575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37974 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term37974, term37974.getClass(), "start", null);
        Class<? extends Object> term38613 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term38612 = ((Class) term38613).getDeclaredField((String) "MAXIMIZE");
        ((Field) term38612).setAccessible(true);
        Object enum22 = ((Field) term38612).get((Object) null);
        term37686 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term38088 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.Target"));
        setElement(term37686, 0, term38088);
        setElement(term37686, 1, term38088);
        setElement(term37686, 2, term38088);
        setElement(term37686, 3, enum22);
        setElement(term37686, 4, term38088);
        setElement(term37686, 5, term38088);
        Class<? extends Object> term38924 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term38923 = ((Class) term38924).getDeclaredField((String) "MAXIMIZE");
        ((Field) term38923).setAccessible(true);
        Object enum23 = ((Field) term38923).get((Object) null);
        term38603 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term38603, term38603.getClass(), "simplex", null);
        setField(term38603, term38603.getClass(), "function", null);
        setField(term38603, term38603.getClass(), "goal", enum23);
        setField(term38603, term38603.getClass(), "start", null);
        setField(term38603, term38603.getClass(), "lowerBound", null);
        setField(term38603, term38603.getClass(), "upperBound", null);
        setField(term38603, term38603.getClass(), "evaluations", null);
        setField(term38603, term38603.getClass(), "iterations", null);
        setField(term38603, term38603.getClass(), "checker", null);
        Class<? extends Object> term39235 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term39234 = ((Class) term39235).getDeclaredField((String) "MAXIMIZE");
        ((Field) term39234).setAccessible(true);
        Object enum24 = ((Field) term39234).get((Object) null);
        term38607 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term38608 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.Target"));
        setField(term38608, term38608.getClass(), "target", null);
        setElement(term38607, 0, term38608);
        setElement(term38607, 1, term38608);
        setElement(term38607, 2, term38608);
        setElement(term38607, 3, enum24);
        setElement(term38607, 4, term38608);
        setElement(term38607, 5, term38608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term37686;
        callMethod(klass, "parseOptimizationData", argTypes, term37974, args);
        assertTrue(recursiveEquals(term37974, term38603));
        assertTrue(recursiveEquals(term37686, term38607));
    }

};


