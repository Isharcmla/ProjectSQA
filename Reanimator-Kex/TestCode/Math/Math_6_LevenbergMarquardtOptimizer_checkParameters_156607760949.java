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

public class LevenbergMarquardtOptimizer_checkParameters_156607760949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22274;
     Object term22289;

    public LevenbergMarquardtOptimizer_checkParameters_156607760949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22274 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(term22274, term22274.getClass(), "lowerBound", null);
        term22289 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setIntField(term22289, term22289.getClass(), "solvedCols", 0);
        setField(term22289, term22289.getClass(), "diagR", null);
        setField(term22289, term22289.getClass(), "jacNorm", null);
        setField(term22289, term22289.getClass(), "beta", null);
        setField(term22289, term22289.getClass(), "permutation", null);
        setIntField(term22289, term22289.getClass(), "rank", 0);
        setDoubleField(term22289, term22289.getClass(), "lmPar", 0.0);
        setField(term22289, term22289.getClass(), "lmDir", null);
        setDoubleField(term22289, term22289.getClass(), "initialStepBoundFactor", 0.0);
        setDoubleField(term22289, term22289.getClass(), "costRelativeTolerance", 0.0);
        setDoubleField(term22289, term22289.getClass(), "parRelativeTolerance", 0.0);
        setDoubleField(term22289, term22289.getClass(), "orthoTolerance", 0.0);
        setDoubleField(term22289, term22289.getClass(), "qrRankingThreshold", 0.0);
        setField(term22289, term22289.getClass(), "weightedResidual", null);
        setField(term22289, term22289.getClass(), "weightedJacobian", null);
        setField(term22289, term22289.getClass(), "weightMatrixSqrt", null);
        setDoubleField(term22289, term22289.getClass(), "cost", 0.0);
        setField(term22289, term22289.getClass(), "jacobian", null);
        setField(term22289, term22289.getClass(), "target", null);
        setField(term22289, term22289.getClass(), "weightMatrix", null);
        setField(term22289, term22289.getClass(), "model", null);
        setField(term22289, term22289.getClass(), "start", null);
        setField(term22289, term22289.getClass(), "lowerBound", null);
        setField(term22289, term22289.getClass(), "upperBound", null);
        setField(term22289, term22289.getClass(), "evaluations", null);
        setField(term22289, term22289.getClass(), "iterations", null);
        setField(term22289, term22289.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkParameters", argTypes, term22274, args);
        assertTrue(recursiveEquals(term22274, term22289));
    }

};


