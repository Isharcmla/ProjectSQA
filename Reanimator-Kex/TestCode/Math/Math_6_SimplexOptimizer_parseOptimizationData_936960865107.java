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

public class SimplexOptimizer_parseOptimizationData_936960865107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64502;
     Object term63260;
     Object term66336;
     Object term66341;

    public SimplexOptimizer_parseOptimizationData_936960865107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64502 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] term63264 = (double[]) newDoubleArray(489);
        setDoubleElement(term63264, 0, 4.0);
        setDoubleElement(term63264, 1, 4.0);
        setDoubleElement(term63264, 2, 3.0);
        setDoubleElement(term63264, 3, 2.0);
        setDoubleElement(term63264, 4, 2.0);
        setField(term64502, term64502.getClass(), "start", term63264);
        setField(term64502, term64502.getClass(), "lowerBound", null);
        setField(term64502, term64502.getClass(), "upperBound", null);
        setField(term64502, term64502.getClass(), "function", null);
        Class<? extends Object> term66837 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term66836 = ((Class) term66837).getDeclaredField((String) "MAXIMIZE");
        ((Field) term66836).setAccessible(true);
        Object enum37 = ((Field) term66836).get((Object) null);
        term63260 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term64638 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        Object term64976 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$BracketingStep"));
        setField(term64638, term64638.getClass(), "function", null);
        setElement(term63260, 0, term64638);
        setElement(term63260, 1, term64638);
        setElement(term63260, 2, enum37);
        setElement(term63260, 3, term64976);
        Class<? extends Object> term67148 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term67147 = ((Class) term67148).getDeclaredField((String) "MAXIMIZE");
        ((Field) term67147).setAccessible(true);
        Object enum38 = ((Field) term67147).get((Object) null);
        term66336 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] term66340 = (double[]) newDoubleArray(489);
        setField(term66336, term66336.getClass(), "simplex", null);
        setField(term66336, term66336.getClass(), "function", null);
        setField(term66336, term66336.getClass(), "goal", enum38);
        setDoubleElement(term66340, 0, 4.0);
        setDoubleElement(term66340, 1, 4.0);
        setDoubleElement(term66340, 2, 3.0);
        setDoubleElement(term66340, 3, 2.0);
        setDoubleElement(term66340, 4, 2.0);
        setField(term66336, term66336.getClass(), "start", term66340);
        setField(term66336, term66336.getClass(), "lowerBound", null);
        setField(term66336, term66336.getClass(), "upperBound", null);
        setField(term66336, term66336.getClass(), "evaluations", null);
        setField(term66336, term66336.getClass(), "iterations", null);
        setField(term66336, term66336.getClass(), "checker", null);
        Class<? extends Object> term67948 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term67947 = ((Class) term67948).getDeclaredField((String) "MAXIMIZE");
        ((Field) term67947).setAccessible(true);
        Object enum39 = ((Field) term67947).get((Object) null);
        term66341 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term66342 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        Object term66346 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$BracketingStep"));
        setField(term66342, term66342.getClass(), "function", null);
        setElement(term66341, 0, term66342);
        setElement(term66341, 1, term66342);
        setElement(term66341, 2, enum39);
        setDoubleField(term66346, term66346.getClass(), "initialStep", 0.0);
        setElement(term66341, 3, term66346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term63260;
        callMethod(klass, "parseOptimizationData", argTypes, term64502, args);
        assertTrue(recursiveEquals(term64502, term66336));
        assertTrue(recursiveEquals(term63260, term66341));
    }

};


