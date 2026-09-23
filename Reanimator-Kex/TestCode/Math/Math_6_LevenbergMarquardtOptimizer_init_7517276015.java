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

public class LevenbergMarquardtOptimizer_init_7517276015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17;
     Object term19;
     Object term21;
     Object term23;
     Object term25;
     Object term1947;

    public LevenbergMarquardtOptimizer_init_7517276015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17 = new Double(0.6076495596892013);
        term19 = new Double(0.37773193782763337);
        term21 = new Double(0.8474802076607362);
        term23 = new Double(0.5183269973490326);
        term25 = new Double(0.7655020693602768);
        term1947 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Object term1948 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term1949 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback"));
        Object term1950 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term1951 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback"));
        setIntField(term1947, term1947.getClass(), "solvedCols", 0);
        setField(term1947, term1947.getClass(), "diagR", null);
        setField(term1947, term1947.getClass(), "jacNorm", null);
        setField(term1947, term1947.getClass(), "beta", null);
        setField(term1947, term1947.getClass(), "permutation", null);
        setIntField(term1947, term1947.getClass(), "rank", 0);
        setDoubleField(term1947, term1947.getClass(), "lmPar", 0.0);
        setField(term1947, term1947.getClass(), "lmDir", null);
        setDoubleField(term1947, term1947.getClass(), "initialStepBoundFactor", 0.6076495596892013);
        setDoubleField(term1947, term1947.getClass(), "costRelativeTolerance", 0.37773193782763337);
        setDoubleField(term1947, term1947.getClass(), "parRelativeTolerance", 0.8474802076607362);
        setDoubleField(term1947, term1947.getClass(), "orthoTolerance", 0.5183269973490326);
        setDoubleField(term1947, term1947.getClass(), "qrRankingThreshold", 0.7655020693602768);
        setField(term1947, term1947.getClass(), "weightedResidual", null);
        setField(term1947, term1947.getClass(), "weightedJacobian", null);
        setField(term1947, term1947.getClass(), "weightMatrixSqrt", null);
        setDoubleField(term1947, term1947.getClass(), "cost", 0.0);
        setField(term1947, term1947.getClass(), "jacobian", null);
        setField(term1947, term1947.getClass(), "target", null);
        setField(term1947, term1947.getClass(), "weightMatrix", null);
        setField(term1947, term1947.getClass(), "model", null);
        setField(term1947, term1947.getClass(), "start", null);
        setField(term1947, term1947.getClass(), "lowerBound", null);
        setField(term1947, term1947.getClass(), "upperBound", null);
        setIntField(term1948, term1948.getClass(), "maximalCount", 0);
        setIntField(term1948, term1948.getClass(), "count", 0);
        setField(term1948, term1948.getClass(), "maxCountCallback", term1949);
        setField(term1947, term1947.getClass(), "evaluations", term1948);
        setIntField(term1950, term1950.getClass(), "maximalCount", 0);
        setIntField(term1950, term1950.getClass(), "count", 0);
        setField(term1950, term1950.getClass(), "maxCountCallback", term1951);
        setField(term1947, term1947.getClass(), "iterations", term1950);
        setField(term1947, term1947.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        Object[] args = new Object[5];
        args[0] = term17;
        args[1] = term19;
        args[2] = term21;
        args[3] = term23;
        args[4] = term25;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1947));
        assertTrue(recursiveEquals(term17, 0.6076495596892013));
        assertTrue(recursiveEquals(term19, 0.37773193782763337));
        assertTrue(recursiveEquals(term21, 0.8474802076607362));
        assertTrue(recursiveEquals(term23, 0.5183269973490326));
        assertTrue(recursiveEquals(term25, 0.7655020693602768));
    }

};


