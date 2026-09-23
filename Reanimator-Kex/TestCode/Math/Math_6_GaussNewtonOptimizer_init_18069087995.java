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
import java.lang.Boolean;
import java.lang.Object;

public class GaussNewtonOptimizer_init_18069087995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term146;

    public GaussNewtonOptimizer_init_18069087995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Boolean(false);
        term146 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Object term147 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term148 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback"));
        Object term149 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term150 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback"));
        setBooleanField(term146, term146.getClass(), "useLU", false);
        setField(term146, term146.getClass(), "weightMatrixSqrt", null);
        setDoubleField(term146, term146.getClass(), "cost", 0.0);
        setField(term146, term146.getClass(), "jacobian", null);
        setField(term146, term146.getClass(), "target", null);
        setField(term146, term146.getClass(), "weightMatrix", null);
        setField(term146, term146.getClass(), "model", null);
        setField(term146, term146.getClass(), "start", null);
        setField(term146, term146.getClass(), "lowerBound", null);
        setField(term146, term146.getClass(), "upperBound", null);
        setIntField(term147, term147.getClass(), "maximalCount", 0);
        setIntField(term147, term147.getClass(), "count", 0);
        setField(term147, term147.getClass(), "maxCountCallback", term148);
        setField(term146, term146.getClass(), "evaluations", term147);
        setIntField(term149, term149.getClass(), "maximalCount", 0);
        setIntField(term149, term149.getClass(), "count", 0);
        setField(term149, term149.getClass(), "maxCountCallback", term150);
        setField(term146, term146.getClass(), "iterations", term149);
        setField(term146, term146.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.apache.commons.math3.optim.ConvergenceChecker");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term146));
        assertTrue(recursiveEquals(term1, null));
    }

};


