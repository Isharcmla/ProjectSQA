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

public class LevenbergMarquardtOptimizer_determineLMParameter_2031541769115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116812;
     Object term114664;
     Object term121060;
     Object term121063;
     Object term121064;

    public LevenbergMarquardtOptimizer_determineLMParameter_2031541769115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116812 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term115646 = (int[]) newIntArray(489);
        term114664 = (double[]) newDoubleArray(489);
        setIntField(term116812, term116812.getClass(), "rank", 0);
        setIntField(term116812, term116812.getClass(), "cols", 0);
        setIntField(term116812, term116812.getClass(), "solvedCols", 1);
        setField(term116812, term116812.getClass(), "permutation", term115646);
        setField(term116812, term116812.getClass(), "lmDir", term114664);
        term121060 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term121061 = (int[]) newIntArray(489);
        double[] term121062 = (double[]) newDoubleArray(489);
        setIntField(term121060, term121060.getClass(), "solvedCols", 1);
        setField(term121060, term121060.getClass(), "diagR", null);
        setField(term121060, term121060.getClass(), "jacNorm", null);
        setField(term121060, term121060.getClass(), "beta", null);
        setField(term121060, term121060.getClass(), "permutation", term121061);
        setIntField(term121060, term121060.getClass(), "rank", 0);
        setDoubleField(term121060, term121060.getClass(), "lmPar", 0.0);
        setField(term121060, term121060.getClass(), "lmDir", term121062);
        setDoubleField(term121060, term121060.getClass(), "initialStepBoundFactor", 0.0);
        setDoubleField(term121060, term121060.getClass(), "costRelativeTolerance", 0.0);
        setDoubleField(term121060, term121060.getClass(), "parRelativeTolerance", 0.0);
        setDoubleField(term121060, term121060.getClass(), "orthoTolerance", 0.0);
        setField(term121060, term121060.getClass(), "checker", null);
        setField(term121060, term121060.getClass(), "jacobian", null);
        setIntField(term121060, term121060.getClass(), "cols", 0);
        setIntField(term121060, term121060.getClass(), "rows", 0);
        setField(term121060, term121060.getClass(), "targetValues", null);
        setField(term121060, term121060.getClass(), "residualsWeights", null);
        setField(term121060, term121060.getClass(), "point", null);
        setField(term121060, term121060.getClass(), "objective", null);
        setField(term121060, term121060.getClass(), "residuals", null);
        setDoubleField(term121060, term121060.getClass(), "cost", 0.0);
        setIntField(term121060, term121060.getClass(), "maxIterations", 0);
        setIntField(term121060, term121060.getClass(), "iterations", 0);
        setIntField(term121060, term121060.getClass(), "maxEvaluations", 0);
        setIntField(term121060, term121060.getClass(), "objectiveEvaluations", 0);
        setIntField(term121060, term121060.getClass(), "jacobianEvaluations", 0);
        setField(term121060, term121060.getClass(), "function", null);
        setField(term121060, term121060.getClass(), "jF", null);
        term121063 = (double[]) newDoubleArray(489);
        term121064 = (double[]) newDoubleArray(489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = Array.newInstance(double.class, 0).getClass();
        argTypes[4] = Array.newInstance(double.class, 0).getClass();
        argTypes[5] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = 0.0;
        args[2] = term114664;
        args[3] = term114664;
        args[4] = null;
        args[5] = null;
        callMethod(klass, "determineLMParameter", argTypes, term116812, args);
        assertTrue(recursiveEquals(term116812, term121060));
        assertTrue(recursiveEquals(term114664, term121063));
        assertTrue(recursiveEquals(term114664, term121064));
    }

};


