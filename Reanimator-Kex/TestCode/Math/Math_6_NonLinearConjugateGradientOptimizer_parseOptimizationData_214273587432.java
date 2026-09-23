package org.apache.commons.math3.optim.nonlinear.scalar.gradient;

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
import static org.apache.commons.math3.optim.nonlinear.scalar.gradient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class NonLinearConjugateGradientOptimizer_parseOptimizationData_214273587432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32059;
     Object term31780;

    public NonLinearConjugateGradientOptimizer_parseOptimizationData_214273587432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32059 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        Class<? extends Object> term33247 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term33246 = ((Class) term33247).getDeclaredField((String) "MAXIMIZE");
        ((Field) term33246).setAccessible(true);
        Object enum41 = ((Field) term33246).get((Object) null);
        term31780 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term32269 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleBounds"));
        setElement(term31780, 0, enum41);
        setElement(term31780, 1, enum41);
        setElement(term31780, 2, enum41);
        setElement(term31780, 3, term32269);
        setElement(term31780, 4, enum41);
        setElement(term31780, 5, enum41);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term31780;
        try {
            callMethod(klass, "parseOptimizationData", argTypes, term32059, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


