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

public class NonLinearConjugateGradientOptimizer_optimize_201200747751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43827;
     Object term43541;

    public NonLinearConjugateGradientOptimizer_optimize_201200747751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43827 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        setField(term43827, term43827.getClass(), "start", null);
        Class<? extends Object> term44714 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term44713 = ((Class) term44714).getDeclaredField((String) "MAXIMIZE");
        ((Field) term44713).setAccessible(true);
        Object enum44 = ((Field) term44713).get((Object) null);
        term43541 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term43941 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.Target"));
        setElement(term43541, 0, term43941);
        setElement(term43541, 1, enum44);
        setElement(term43541, 2, term43941);
        setElement(term43541, 3, term43941);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term43541;
        try {
            callMethod(klass, "optimize", argTypes, term43827, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


