package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

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
import static org.apache.commons.math3.optim.nonlinear.vector.jacobian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optim.nonlinear.vector.jacobian.EqualityUtils.*;
import java.lang.Object;

public class GaussNewtonOptimizer_init_18068799694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118;

    public GaussNewtonOptimizer_init_18068799694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Object term119 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term120 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback"));
        Object term121 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term122 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback"));
        setBooleanField(term118, term118.getClass(), "useLU", true);
        setField(term118, term118.getClass(), "weightMatrixSqrt", null);
        setDoubleField(term118, term118.getClass(), "cost", 0.0);
        setField(term118, term118.getClass(), "jacobian", null);
        setField(term118, term118.getClass(), "target", null);
        setField(term118, term118.getClass(), "weightMatrix", null);
        setField(term118, term118.getClass(), "model", null);
        setField(term118, term118.getClass(), "start", null);
        setField(term118, term118.getClass(), "lowerBound", null);
        setField(term118, term118.getClass(), "upperBound", null);
        setIntField(term119, term119.getClass(), "maximalCount", 0);
        setIntField(term119, term119.getClass(), "count", 0);
        setField(term119, term119.getClass(), "maxCountCallback", term120);
        setField(term118, term118.getClass(), "evaluations", term119);
        setIntField(term121, term121.getClass(), "maximalCount", 0);
        setIntField(term121, term121.getClass(), "count", 0);
        setField(term121, term121.getClass(), "maxCountCallback", term122);
        setField(term118, term118.getClass(), "iterations", term121);
        setField(term118, term118.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.optim.ConvergenceChecker");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term118));
    }

};


