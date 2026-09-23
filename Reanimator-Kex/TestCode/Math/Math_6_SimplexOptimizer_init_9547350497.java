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
import java.lang.Double;
import java.lang.Object;

public class SimplexOptimizer_init_9547350497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term1520;

    public SimplexOptimizer_init_9547350497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Double(0.13238746331190498);
        term3 = new Double(0.3455959125047594);
        term1520 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        Object term1521 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term1522 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback"));
        Object term1523 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term1524 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback"));
        Object term1525 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleValueChecker"));
        setField(term1520, term1520.getClass(), "simplex", null);
        setField(term1520, term1520.getClass(), "function", null);
        setField(term1520, term1520.getClass(), "goal", null);
        setField(term1520, term1520.getClass(), "start", null);
        setField(term1520, term1520.getClass(), "lowerBound", null);
        setField(term1520, term1520.getClass(), "upperBound", null);
        setIntField(term1521, term1521.getClass(), "maximalCount", 0);
        setIntField(term1521, term1521.getClass(), "count", 0);
        setField(term1521, term1521.getClass(), "maxCountCallback", term1522);
        setField(term1520, term1520.getClass(), "evaluations", term1521);
        setIntField(term1523, term1523.getClass(), "maximalCount", 0);
        setIntField(term1523, term1523.getClass(), "count", 0);
        setField(term1523, term1523.getClass(), "maxCountCallback", term1524);
        setField(term1520, term1520.getClass(), "iterations", term1523);
        setIntField(term1525, term1525.getClass(), "maxIterationCount", -1);
        setDoubleField(term1525, term1525.getClass(), "relativeThreshold", 0.13238746331190498);
        setDoubleField(term1525, term1525.getClass(), "absoluteThreshold", 0.3455959125047594);
        setField(term1520, term1520.getClass(), "checker", term1525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term3;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1520));
        assertTrue(recursiveEquals(term1, 0.13238746331190498));
        assertTrue(recursiveEquals(term3, 0.3455959125047594));
    }

};


