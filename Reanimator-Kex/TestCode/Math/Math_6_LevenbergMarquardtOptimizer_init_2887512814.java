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
import java.lang.Double;
import java.lang.Object;

public class LevenbergMarquardtOptimizer_init_2887512814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11;
     Object term13;
     Object term15;
     Object term1908;

    public LevenbergMarquardtOptimizer_init_2887512814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11 = new Double(0.40176586625454525);
        term13 = new Double(0.2641345529914265);
        term15 = new Double(0.36923381893433327);
        term1908 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Object term1909 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term1910 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback"));
        Object term1911 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term1912 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback"));
        setIntField(term1908, term1908.getClass(), "solvedCols", 0);
        setField(term1908, term1908.getClass(), "diagR", null);
        setField(term1908, term1908.getClass(), "jacNorm", null);
        setField(term1908, term1908.getClass(), "beta", null);
        setField(term1908, term1908.getClass(), "permutation", null);
        setIntField(term1908, term1908.getClass(), "rank", 0);
        setDoubleField(term1908, term1908.getClass(), "lmPar", 0.0);
        setField(term1908, term1908.getClass(), "lmDir", null);
        setDoubleField(term1908, term1908.getClass(), "initialStepBoundFactor", 100.0);
        setDoubleField(term1908, term1908.getClass(), "costRelativeTolerance", 0.40176586625454525);
        setDoubleField(term1908, term1908.getClass(), "parRelativeTolerance", 0.2641345529914265);
        setDoubleField(term1908, term1908.getClass(), "orthoTolerance", 0.36923381893433327);
        setDoubleField(term1908, term1908.getClass(), "qrRankingThreshold", 2.2250738585072014E-308);
        setField(term1908, term1908.getClass(), "weightedResidual", null);
        setField(term1908, term1908.getClass(), "weightedJacobian", null);
        setField(term1908, term1908.getClass(), "weightMatrixSqrt", null);
        setDoubleField(term1908, term1908.getClass(), "cost", 0.0);
        setField(term1908, term1908.getClass(), "jacobian", null);
        setField(term1908, term1908.getClass(), "target", null);
        setField(term1908, term1908.getClass(), "weightMatrix", null);
        setField(term1908, term1908.getClass(), "model", null);
        setField(term1908, term1908.getClass(), "start", null);
        setField(term1908, term1908.getClass(), "lowerBound", null);
        setField(term1908, term1908.getClass(), "upperBound", null);
        setIntField(term1909, term1909.getClass(), "maximalCount", 0);
        setIntField(term1909, term1909.getClass(), "count", 0);
        setField(term1909, term1909.getClass(), "maxCountCallback", term1910);
        setField(term1908, term1908.getClass(), "evaluations", term1909);
        setIntField(term1911, term1911.getClass(), "maximalCount", 0);
        setIntField(term1911, term1911.getClass(), "count", 0);
        setField(term1911, term1911.getClass(), "maxCountCallback", term1912);
        setField(term1908, term1908.getClass(), "iterations", term1911);
        setField(term1908, term1908.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term11;
        args[1] = term13;
        args[2] = term15;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1908));
        assertTrue(recursiveEquals(term11, 0.40176586625454525));
        assertTrue(recursiveEquals(term13, 0.2641345529914265));
        assertTrue(recursiveEquals(term15, 0.36923381893433327));
    }

};


