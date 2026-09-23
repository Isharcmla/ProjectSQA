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

public class SimplexOptimizer_init_12750576286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1485;

    public SimplexOptimizer_init_12750576286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1485 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        Object term1486 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term1487 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback"));
        Object term1488 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term1489 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback"));
        setField(term1485, term1485.getClass(), "simplex", null);
        setField(term1485, term1485.getClass(), "function", null);
        setField(term1485, term1485.getClass(), "goal", null);
        setField(term1485, term1485.getClass(), "start", null);
        setField(term1485, term1485.getClass(), "lowerBound", null);
        setField(term1485, term1485.getClass(), "upperBound", null);
        setIntField(term1486, term1486.getClass(), "maximalCount", 0);
        setIntField(term1486, term1486.getClass(), "count", 0);
        setField(term1486, term1486.getClass(), "maxCountCallback", term1487);
        setField(term1485, term1485.getClass(), "evaluations", term1486);
        setIntField(term1488, term1488.getClass(), "maximalCount", 0);
        setIntField(term1488, term1488.getClass(), "count", 0);
        setField(term1488, term1488.getClass(), "maxCountCallback", term1489);
        setField(term1485, term1485.getClass(), "iterations", term1488);
        setField(term1485, term1485.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.optim.ConvergenceChecker");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1485));
    }

};


