package org.apache.commons.math.optimization.general;

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
import static org.apache.commons.math.optimization.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.optimization.general.EqualityUtils.*;

public class LevenbergMarquardtOptimizer_qTy_4162845778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34521;
     Object term40882;

    public LevenbergMarquardtOptimizer_qTy_4162845778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34521 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term33369 = (int[]) newIntArray(489);
        double[] term33861 = (double[]) newDoubleArray(489);
        setIntField(term34521, term34521.getClass(), "cols", 1);
        setField(term34521, term34521.getClass(), "permutation", term33369);
        setIntField(term34521, term34521.getClass(), "rows", 0);
        setField(term34521, term34521.getClass(), "beta", term33861);
        term40882 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] term40883 = (double[]) newDoubleArray(489);
        int[] term40884 = (int[]) newIntArray(489);
        setIntField(term40882, term40882.getClass(), "solvedCols", 0);
        setField(term40882, term40882.getClass(), "diagR", null);
        setField(term40882, term40882.getClass(), "jacNorm", null);
        setField(term40882, term40882.getClass(), "beta", term40883);
        setField(term40882, term40882.getClass(), "permutation", term40884);
        setIntField(term40882, term40882.getClass(), "rank", 0);
        setDoubleField(term40882, term40882.getClass(), "lmPar", 0.0);
        setField(term40882, term40882.getClass(), "lmDir", null);
        setDoubleField(term40882, term40882.getClass(), "initialStepBoundFactor", 0.0);
        setDoubleField(term40882, term40882.getClass(), "costRelativeTolerance", 0.0);
        setDoubleField(term40882, term40882.getClass(), "parRelativeTolerance", 0.0);
        setDoubleField(term40882, term40882.getClass(), "orthoTolerance", 0.0);
        setField(term40882, term40882.getClass(), "checker", null);
        setField(term40882, term40882.getClass(), "jacobian", null);
        setIntField(term40882, term40882.getClass(), "cols", 1);
        setIntField(term40882, term40882.getClass(), "rows", 0);
        setField(term40882, term40882.getClass(), "targetValues", null);
        setField(term40882, term40882.getClass(), "residualsWeights", null);
        setField(term40882, term40882.getClass(), "point", null);
        setField(term40882, term40882.getClass(), "objective", null);
        setField(term40882, term40882.getClass(), "residuals", null);
        setDoubleField(term40882, term40882.getClass(), "cost", 0.0);
        setIntField(term40882, term40882.getClass(), "maxIterations", 0);
        setIntField(term40882, term40882.getClass(), "iterations", 0);
        setIntField(term40882, term40882.getClass(), "maxEvaluations", 0);
        setIntField(term40882, term40882.getClass(), "objectiveEvaluations", 0);
        setIntField(term40882, term40882.getClass(), "jacobianEvaluations", 0);
        setField(term40882, term40882.getClass(), "function", null);
        setField(term40882, term40882.getClass(), "jF", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "qTy", argTypes, term34521, args);
        assertTrue(recursiveEquals(term34521, term40882));
    }

};


