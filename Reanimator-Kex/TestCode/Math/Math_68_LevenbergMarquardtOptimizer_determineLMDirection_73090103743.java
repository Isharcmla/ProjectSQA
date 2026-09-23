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

public class LevenbergMarquardtOptimizer_determineLMDirection_73090103743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19634;
     Object term19657;

    public LevenbergMarquardtOptimizer_determineLMDirection_73090103743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19634 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] term19462 = (double[]) newDoubleArray(0);
        setIntField(term19634, term19634.getClass(), "solvedCols", 0);
        setField(term19634, term19634.getClass(), "lmDir", term19462);
        term19657 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] term19658 = (double[]) newDoubleArray(0);
        setIntField(term19657, term19657.getClass(), "solvedCols", 0);
        setField(term19657, term19657.getClass(), "diagR", null);
        setField(term19657, term19657.getClass(), "jacNorm", null);
        setField(term19657, term19657.getClass(), "beta", null);
        setField(term19657, term19657.getClass(), "permutation", null);
        setIntField(term19657, term19657.getClass(), "rank", 0);
        setDoubleField(term19657, term19657.getClass(), "lmPar", 0.0);
        setField(term19657, term19657.getClass(), "lmDir", term19658);
        setDoubleField(term19657, term19657.getClass(), "initialStepBoundFactor", 0.0);
        setDoubleField(term19657, term19657.getClass(), "costRelativeTolerance", 0.0);
        setDoubleField(term19657, term19657.getClass(), "parRelativeTolerance", 0.0);
        setDoubleField(term19657, term19657.getClass(), "orthoTolerance", 0.0);
        setField(term19657, term19657.getClass(), "checker", null);
        setField(term19657, term19657.getClass(), "jacobian", null);
        setIntField(term19657, term19657.getClass(), "cols", 0);
        setIntField(term19657, term19657.getClass(), "rows", 0);
        setField(term19657, term19657.getClass(), "targetValues", null);
        setField(term19657, term19657.getClass(), "residualsWeights", null);
        setField(term19657, term19657.getClass(), "point", null);
        setField(term19657, term19657.getClass(), "objective", null);
        setField(term19657, term19657.getClass(), "residuals", null);
        setDoubleField(term19657, term19657.getClass(), "cost", 0.0);
        setIntField(term19657, term19657.getClass(), "maxIterations", 0);
        setIntField(term19657, term19657.getClass(), "iterations", 0);
        setIntField(term19657, term19657.getClass(), "maxEvaluations", 0);
        setIntField(term19657, term19657.getClass(), "objectiveEvaluations", 0);
        setIntField(term19657, term19657.getClass(), "jacobianEvaluations", 0);
        setField(term19657, term19657.getClass(), "function", null);
        setField(term19657, term19657.getClass(), "jF", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
        callMethod(klass, "determineLMDirection", argTypes, term19634, args);
        assertTrue(recursiveEquals(term19634, term19657));
    }

};


