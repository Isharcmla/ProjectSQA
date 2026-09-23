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

public class SimplexOptimizer_parseOptimizationData_93696086567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33346;
     Object term33126;
     Object term33640;
     Object term33641;

    public SimplexOptimizer_parseOptimizationData_93696086567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33346 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term33346, term33346.getClass(), "start", null);
        term33126 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 2);
        Object term33470 = newInstance(Class.forName("org.apache.commons.math3.optim.linear.NonNegativeConstraint"));
        Object term33606 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        setElement(term33126, 0, term33470);
        setElement(term33126, 1, term33606);
        term33640 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term33640, term33640.getClass(), "simplex", null);
        setField(term33640, term33640.getClass(), "function", null);
        setField(term33640, term33640.getClass(), "goal", null);
        setField(term33640, term33640.getClass(), "start", null);
        setField(term33640, term33640.getClass(), "lowerBound", null);
        setField(term33640, term33640.getClass(), "upperBound", null);
        setField(term33640, term33640.getClass(), "evaluations", null);
        setField(term33640, term33640.getClass(), "iterations", null);
        setField(term33640, term33640.getClass(), "checker", null);
        term33641 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 2);
        Object term33642 = newInstance(Class.forName("org.apache.commons.math3.optim.linear.NonNegativeConstraint"));
        Object term33643 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        setBooleanField(term33642, term33642.getClass(), "isRestricted", false);
        setElement(term33641, 0, term33642);
        setField(term33643, term33643.getClass(), "function", null);
        setElement(term33641, 1, term33643);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term33126;
        callMethod(klass, "parseOptimizationData", argTypes, term33346, args);
        assertTrue(recursiveEquals(term33346, term33640));
        assertTrue(recursiveEquals(term33126, term33641));
    }

};


