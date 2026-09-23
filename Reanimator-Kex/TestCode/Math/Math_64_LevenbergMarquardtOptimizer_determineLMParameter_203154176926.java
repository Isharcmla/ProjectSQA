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

public class LevenbergMarquardtOptimizer_determineLMParameter_203154176926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9534;
     Object term9719;

    public LevenbergMarquardtOptimizer_determineLMParameter_203154176926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9534 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setIntField(term9534, term9534.getClass(), "rank", 0);
        term9719 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setIntField(term9719, term9719.getClass(), "solvedCols", 0);
        setField(term9719, term9719.getClass(), "diagR", null);
        setField(term9719, term9719.getClass(), "jacNorm", null);
        setField(term9719, term9719.getClass(), "beta", null);
        setField(term9719, term9719.getClass(), "permutation", null);
        setIntField(term9719, term9719.getClass(), "rank", 0);
        setDoubleField(term9719, term9719.getClass(), "lmPar", 0.0);
        setField(term9719, term9719.getClass(), "lmDir", null);
        setDoubleField(term9719, term9719.getClass(), "initialStepBoundFactor", 0.0);
        setDoubleField(term9719, term9719.getClass(), "costRelativeTolerance", 0.0);
        setDoubleField(term9719, term9719.getClass(), "parRelativeTolerance", 0.0);
        setDoubleField(term9719, term9719.getClass(), "orthoTolerance", 0.0);
        setDoubleField(term9719, term9719.getClass(), "qrRankingThreshold", 0.0);
        setField(term9719, term9719.getClass(), "checker", null);
        setField(term9719, term9719.getClass(), "jacobian", null);
        setIntField(term9719, term9719.getClass(), "cols", 0);
        setIntField(term9719, term9719.getClass(), "rows", 0);
        setField(term9719, term9719.getClass(), "targetValues", null);
        setField(term9719, term9719.getClass(), "residualsWeights", null);
        setField(term9719, term9719.getClass(), "point", null);
        setField(term9719, term9719.getClass(), "objective", null);
        setField(term9719, term9719.getClass(), "residuals", null);
        setDoubleField(term9719, term9719.getClass(), "cost", 0.0);
        setIntField(term9719, term9719.getClass(), "maxIterations", 0);
        setIntField(term9719, term9719.getClass(), "iterations", 0);
        setIntField(term9719, term9719.getClass(), "maxEvaluations", 0);
        setIntField(term9719, term9719.getClass(), "objectiveEvaluations", 0);
        setIntField(term9719, term9719.getClass(), "jacobianEvaluations", 0);
        setField(term9719, term9719.getClass(), "function", null);
        setField(term9719, term9719.getClass(), "jF", null);
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
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        callMethod(klass, "determineLMParameter", argTypes, term9534, args);
        assertTrue(recursiveEquals(term9534, term9719));
    }

};


