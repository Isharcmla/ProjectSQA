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

public class SimplexOptimizer_parseOptimizationData_93696086573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36095;
     Object term35805;
     Object term36743;
     Object term36747;

    public SimplexOptimizer_parseOptimizationData_93696086573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36095 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term36095, term36095.getClass(), "start", null);
        Class<? extends Object> term36753 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term36752 = ((Class) term36753).getDeclaredField((String) "MAXIMIZE");
        ((Field) term36752).setAccessible(true);
        Object enum18 = ((Field) term36752).get((Object) null);
        term35805 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term36349 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        setElement(term35805, 0, enum18);
        setElement(term35805, 1, enum18);
        setElement(term35805, 2, enum18);
        setElement(term35805, 3, term36349);
        setElement(term35805, 4, enum18);
        setElement(term35805, 5, enum18);
        Class<? extends Object> term37064 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term37063 = ((Class) term37064).getDeclaredField((String) "MAXIMIZE");
        ((Field) term37063).setAccessible(true);
        Object enum19 = ((Field) term37063).get((Object) null);
        term36743 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term36743, term36743.getClass(), "simplex", null);
        setField(term36743, term36743.getClass(), "function", null);
        setField(term36743, term36743.getClass(), "goal", enum19);
        setField(term36743, term36743.getClass(), "start", null);
        setField(term36743, term36743.getClass(), "lowerBound", null);
        setField(term36743, term36743.getClass(), "upperBound", null);
        setField(term36743, term36743.getClass(), "evaluations", null);
        setField(term36743, term36743.getClass(), "iterations", null);
        setField(term36743, term36743.getClass(), "checker", null);
        Class<? extends Object> term37375 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term37374 = ((Class) term37375).getDeclaredField((String) "MAXIMIZE");
        ((Field) term37374).setAccessible(true);
        Object enum20 = ((Field) term37374).get((Object) null);
        term36747 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term36751 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        setElement(term36747, 0, enum20);
        setElement(term36747, 1, enum20);
        setElement(term36747, 2, enum20);
        setField(term36751, term36751.getClass(), "function", null);
        setElement(term36747, 3, term36751);
        setElement(term36747, 4, enum20);
        setElement(term36747, 5, enum20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term35805;
        callMethod(klass, "parseOptimizationData", argTypes, term36095, args);
        assertTrue(recursiveEquals(term36095, term36743));
        assertTrue(recursiveEquals(term35805, term36747));
    }

};


