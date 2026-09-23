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

public class LevenbergMarquardtOptimizer_qrDecomposition_51598443832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10293;
     Object term12060;

    public LevenbergMarquardtOptimizer_qrDecomposition_51598443832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10293 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setIntField(term10293, term10293.getClass(), "cols", 0);
        term12060 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setIntField(term12060, term12060.getClass(), "solvedCols", 0);
        setField(term12060, term12060.getClass(), "diagR", null);
        setField(term12060, term12060.getClass(), "jacNorm", null);
        setField(term12060, term12060.getClass(), "beta", null);
        setField(term12060, term12060.getClass(), "permutation", null);
        setIntField(term12060, term12060.getClass(), "rank", 0);
        setDoubleField(term12060, term12060.getClass(), "lmPar", 0.0);
        setField(term12060, term12060.getClass(), "lmDir", null);
        setDoubleField(term12060, term12060.getClass(), "initialStepBoundFactor", 0.0);
        setDoubleField(term12060, term12060.getClass(), "costRelativeTolerance", 0.0);
        setDoubleField(term12060, term12060.getClass(), "parRelativeTolerance", 0.0);
        setDoubleField(term12060, term12060.getClass(), "orthoTolerance", 0.0);
        setDoubleField(term12060, term12060.getClass(), "qrRankingThreshold", 0.0);
        setField(term12060, term12060.getClass(), "checker", null);
        setField(term12060, term12060.getClass(), "jacobian", null);
        setIntField(term12060, term12060.getClass(), "cols", 0);
        setIntField(term12060, term12060.getClass(), "rows", 0);
        setField(term12060, term12060.getClass(), "targetValues", null);
        setField(term12060, term12060.getClass(), "residualsWeights", null);
        setField(term12060, term12060.getClass(), "point", null);
        setField(term12060, term12060.getClass(), "objective", null);
        setField(term12060, term12060.getClass(), "residuals", null);
        setDoubleField(term12060, term12060.getClass(), "cost", 0.0);
        setIntField(term12060, term12060.getClass(), "maxIterations", 0);
        setIntField(term12060, term12060.getClass(), "iterations", 0);
        setIntField(term12060, term12060.getClass(), "maxEvaluations", 0);
        setIntField(term12060, term12060.getClass(), "objectiveEvaluations", 0);
        setIntField(term12060, term12060.getClass(), "jacobianEvaluations", 0);
        setField(term12060, term12060.getClass(), "function", null);
        setField(term12060, term12060.getClass(), "jF", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "qrDecomposition", argTypes, term10293, args);
        assertTrue(recursiveEquals(term10293, term12060));
    }

};


