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

public class SimplexOptimizer_parseOptimizationData_936960865129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98839;
     Object term98428;
     Object term99886;
     Object term99891;

    public SimplexOptimizer_parseOptimizationData_936960865129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98839 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] term98456 = (double[]) newDoubleArray(50);
        setField(term98839, term98839.getClass(), "start", term98456);
        setField(term98839, term98839.getClass(), "lowerBound", null);
        setField(term98839, term98839.getClass(), "upperBound", null);
        setField(term98839, term98839.getClass(), "function", null);
        setField(term98839, term98839.getClass(), "goal", null);
        Class<? extends Object> term99949 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term99948 = ((Class) term99949).getDeclaredField((String) "MINIMIZE");
        ((Field) term99948).setAccessible(true);
        Object enum47 = ((Field) term99948).get((Object) null);
        term98428 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term98975 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        Object term99111 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        Object term99403 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        setField(term98975, term98975.getClass(), "function", null);
        setElement(term98428, 0, term98975);
        setField(term99111, term99111.getClass(), "function", null);
        setElement(term98428, 1, term99111);
        setElement(term98428, 2, enum47);
        setElement(term98428, 3, term99403);
        Class<? extends Object> term100260 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term100259 = ((Class) term100260).getDeclaredField((String) "MINIMIZE");
        ((Field) term100259).setAccessible(true);
        Object enum48 = ((Field) term100259).get((Object) null);
        term99886 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] term99890 = (double[]) newDoubleArray(50);
        setField(term99886, term99886.getClass(), "simplex", null);
        setField(term99886, term99886.getClass(), "function", null);
        setField(term99886, term99886.getClass(), "goal", enum48);
        setField(term99886, term99886.getClass(), "start", term99890);
        setField(term99886, term99886.getClass(), "lowerBound", null);
        setField(term99886, term99886.getClass(), "upperBound", null);
        setField(term99886, term99886.getClass(), "evaluations", null);
        setField(term99886, term99886.getClass(), "iterations", null);
        setField(term99886, term99886.getClass(), "checker", null);
        Class<? extends Object> term100621 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term100620 = ((Class) term100621).getDeclaredField((String) "MINIMIZE");
        ((Field) term100620).setAccessible(true);
        Object enum49 = ((Field) term100620).get((Object) null);
        term99891 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term99892 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        Object term99893 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        Object term99897 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction"));
        setField(term99892, term99892.getClass(), "function", null);
        setElement(term99891, 0, term99892);
        setField(term99893, term99893.getClass(), "function", null);
        setElement(term99891, 1, term99893);
        setElement(term99891, 2, enum49);
        setField(term99897, term99897.getClass(), "function", null);
        setElement(term99891, 3, term99897);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term98428;
        callMethod(klass, "parseOptimizationData", argTypes, term98839, args);
        assertTrue(recursiveEquals(term98839, term99886));
        assertTrue(recursiveEquals(term98428, term99891));
    }

};


