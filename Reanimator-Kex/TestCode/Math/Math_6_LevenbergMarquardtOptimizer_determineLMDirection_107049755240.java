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

public class LevenbergMarquardtOptimizer_determineLMDirection_107049755240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15307;
     Object term15607;

    public LevenbergMarquardtOptimizer_determineLMDirection_107049755240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15307 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] term15111 = (double[]) newDoubleArray(0);
        setIntField(term15307, term15307.getClass(), "solvedCols", 0);
        setField(term15307, term15307.getClass(), "lmDir", term15111);
        term15607 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] term15608 = (double[]) newDoubleArray(0);
        setIntField(term15607, term15607.getClass(), "solvedCols", 0);
        setField(term15607, term15607.getClass(), "diagR", null);
        setField(term15607, term15607.getClass(), "jacNorm", null);
        setField(term15607, term15607.getClass(), "beta", null);
        setField(term15607, term15607.getClass(), "permutation", null);
        setIntField(term15607, term15607.getClass(), "rank", 0);
        setDoubleField(term15607, term15607.getClass(), "lmPar", 0.0);
        setField(term15607, term15607.getClass(), "lmDir", term15608);
        setDoubleField(term15607, term15607.getClass(), "initialStepBoundFactor", 0.0);
        setDoubleField(term15607, term15607.getClass(), "costRelativeTolerance", 0.0);
        setDoubleField(term15607, term15607.getClass(), "parRelativeTolerance", 0.0);
        setDoubleField(term15607, term15607.getClass(), "orthoTolerance", 0.0);
        setDoubleField(term15607, term15607.getClass(), "qrRankingThreshold", 0.0);
        setField(term15607, term15607.getClass(), "weightedResidual", null);
        setField(term15607, term15607.getClass(), "weightedJacobian", null);
        setField(term15607, term15607.getClass(), "weightMatrixSqrt", null);
        setDoubleField(term15607, term15607.getClass(), "cost", 0.0);
        setField(term15607, term15607.getClass(), "jacobian", null);
        setField(term15607, term15607.getClass(), "target", null);
        setField(term15607, term15607.getClass(), "weightMatrix", null);
        setField(term15607, term15607.getClass(), "model", null);
        setField(term15607, term15607.getClass(), "start", null);
        setField(term15607, term15607.getClass(), "lowerBound", null);
        setField(term15607, term15607.getClass(), "upperBound", null);
        setField(term15607, term15607.getClass(), "evaluations", null);
        setField(term15607, term15607.getClass(), "iterations", null);
        setField(term15607, term15607.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "determineLMDirection", argTypes, term15307, args);
        assertTrue(recursiveEquals(term15307, term15607));
    }

};


