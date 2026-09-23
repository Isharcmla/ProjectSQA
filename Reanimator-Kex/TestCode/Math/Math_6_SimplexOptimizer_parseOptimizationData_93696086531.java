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

public class SimplexOptimizer_parseOptimizationData_93696086531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15675;
     Object term15514;
     Object term15683;
     Object term15684;

    public SimplexOptimizer_parseOptimizationData_93696086531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15675 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        term15514 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 0);
        term15683 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term15683, term15683.getClass(), "simplex", null);
        setField(term15683, term15683.getClass(), "function", null);
        setField(term15683, term15683.getClass(), "goal", null);
        setField(term15683, term15683.getClass(), "start", null);
        setField(term15683, term15683.getClass(), "lowerBound", null);
        setField(term15683, term15683.getClass(), "upperBound", null);
        setField(term15683, term15683.getClass(), "evaluations", null);
        setField(term15683, term15683.getClass(), "iterations", null);
        setField(term15683, term15683.getClass(), "checker", null);
        term15684 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term15514;
        callMethod(klass, "parseOptimizationData", argTypes, term15675, args);
        assertTrue(recursiveEquals(term15675, term15683));
        assertTrue(recursiveEquals(term15514, term15684));
    }

};


