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

public class SimplexOptimizer_parseOptimizationData_93696086597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52398;
     Object term51149;
     Object term54011;
     Object term54016;

    public SimplexOptimizer_parseOptimizationData_93696086597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52398 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] term51152 = (double[]) newDoubleArray(489);
        setDoubleElement(term51152, 0, 3.0);
        setDoubleElement(term51152, 1, 3.0);
        setDoubleElement(term51152, 2, 3.0);
        setDoubleElement(term51152, 3, 2.0);
        setDoubleElement(term51152, 4, 2.0);
        setField(term52398, term52398.getClass(), "start", term51152);
        setField(term52398, term52398.getClass(), "lowerBound", null);
        setField(term52398, term52398.getClass(), "upperBound", null);
        setField(term52398, term52398.getClass(), "function", null);
        Class<? extends Object> term54511 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term54510 = ((Class) term54511).getDeclaredField((String) "MAXIMIZE");
        ((Field) term54510).setAccessible(true);
        Object enum29 = ((Field) term54510).get((Object) null);
        term51149 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term52534 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        setField(term52534, term52534.getClass(), "function", null);
        setElement(term51149, 0, term52534);
        setElement(term51149, 1, term52534);
        setElement(term51149, 2, term52534);
        setElement(term51149, 3, enum29);
        Class<? extends Object> term54822 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term54821 = ((Class) term54822).getDeclaredField((String) "MAXIMIZE");
        ((Field) term54821).setAccessible(true);
        Object enum30 = ((Field) term54821).get((Object) null);
        term54011 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] term54015 = (double[]) newDoubleArray(489);
        setField(term54011, term54011.getClass(), "simplex", null);
        setField(term54011, term54011.getClass(), "function", null);
        setField(term54011, term54011.getClass(), "goal", enum30);
        setDoubleElement(term54015, 0, 3.0);
        setDoubleElement(term54015, 1, 3.0);
        setDoubleElement(term54015, 2, 3.0);
        setDoubleElement(term54015, 3, 2.0);
        setDoubleElement(term54015, 4, 2.0);
        setField(term54011, term54011.getClass(), "start", term54015);
        setField(term54011, term54011.getClass(), "lowerBound", null);
        setField(term54011, term54011.getClass(), "upperBound", null);
        setField(term54011, term54011.getClass(), "evaluations", null);
        setField(term54011, term54011.getClass(), "iterations", null);
        setField(term54011, term54011.getClass(), "checker", null);
        Class<? extends Object> term55622 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term55621 = ((Class) term55622).getDeclaredField((String) "MAXIMIZE");
        ((Field) term55621).setAccessible(true);
        Object enum31 = ((Field) term55621).get((Object) null);
        term54016 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term54017 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        setField(term54017, term54017.getClass(), "function", null);
        setElement(term54016, 0, term54017);
        setElement(term54016, 1, term54017);
        setElement(term54016, 2, term54017);
        setElement(term54016, 3, enum31);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term51149;
        callMethod(klass, "parseOptimizationData", argTypes, term52398, args);
        assertTrue(recursiveEquals(term52398, term54011));
        assertTrue(recursiveEquals(term51149, term54016));
    }

};


