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

public class SimplexOptimizer_parseOptimizationData_93696086599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57188;
     Object term55937;
     Object term58514;
     Object term58516;

    public SimplexOptimizer_parseOptimizationData_93696086599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57188 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] term55940 = (double[]) newDoubleArray(489);
        setDoubleElement(term55940, 0, 3.0);
        setDoubleElement(term55940, 1, 3.0);
        setDoubleElement(term55940, 2, 3.0);
        setDoubleElement(term55940, 3, 2.0);
        setDoubleElement(term55940, 4, 2.0);
        setField(term57188, term57188.getClass(), "start", term55940);
        setField(term57188, term57188.getClass(), "lowerBound", null);
        setField(term57188, term57188.getClass(), "upperBound", null);
        setField(term57188, term57188.getClass(), "function", null);
        term55937 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term57324 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        Object term57476 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunctionGradient"));
        setField(term57324, term57324.getClass(), "function", null);
        setElement(term55937, 0, term57324);
        setElement(term55937, 1, term57324);
        setElement(term55937, 2, term57324);
        setElement(term55937, 3, term57476);
        term58514 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] term58515 = (double[]) newDoubleArray(489);
        setField(term58514, term58514.getClass(), "simplex", null);
        setField(term58514, term58514.getClass(), "function", null);
        setField(term58514, term58514.getClass(), "goal", null);
        setDoubleElement(term58515, 0, 3.0);
        setDoubleElement(term58515, 1, 3.0);
        setDoubleElement(term58515, 2, 3.0);
        setDoubleElement(term58515, 3, 2.0);
        setDoubleElement(term58515, 4, 2.0);
        setField(term58514, term58514.getClass(), "start", term58515);
        setField(term58514, term58514.getClass(), "lowerBound", null);
        setField(term58514, term58514.getClass(), "upperBound", null);
        setField(term58514, term58514.getClass(), "evaluations", null);
        setField(term58514, term58514.getClass(), "iterations", null);
        setField(term58514, term58514.getClass(), "checker", null);
        term58516 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term58517 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        Object term58518 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunctionGradient"));
        setField(term58517, term58517.getClass(), "function", null);
        setElement(term58516, 0, term58517);
        setElement(term58516, 1, term58517);
        setElement(term58516, 2, term58517);
        setField(term58518, term58518.getClass(), "gradient", null);
        setElement(term58516, 3, term58518);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term55937;
        callMethod(klass, "parseOptimizationData", argTypes, term57188, args);
        assertTrue(recursiveEquals(term57188, term58514));
        assertTrue(recursiveEquals(term55937, term58516));
    }

};


