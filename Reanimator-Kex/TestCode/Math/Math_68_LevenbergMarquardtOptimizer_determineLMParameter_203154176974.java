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

public class LevenbergMarquardtOptimizer_determineLMParameter_203154176974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31449;
     Object term33366;

    public LevenbergMarquardtOptimizer_determineLMParameter_203154176974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31449 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setIntField(term31449, term31449.getClass(), "rank", -2113929216);
        setIntField(term31449, term31449.getClass(), "cols", -2113929216);
        setIntField(term31449, term31449.getClass(), "solvedCols", 0);
        term33366 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setIntField(term33366, term33366.getClass(), "solvedCols", 0);
        setField(term33366, term33366.getClass(), "diagR", null);
        setField(term33366, term33366.getClass(), "jacNorm", null);
        setField(term33366, term33366.getClass(), "beta", null);
        setField(term33366, term33366.getClass(), "permutation", null);
        setIntField(term33366, term33366.getClass(), "rank", -2113929216);
        setDoubleField(term33366, term33366.getClass(), "lmPar", 0.0);
        setField(term33366, term33366.getClass(), "lmDir", null);
        setDoubleField(term33366, term33366.getClass(), "initialStepBoundFactor", 0.0);
        setDoubleField(term33366, term33366.getClass(), "costRelativeTolerance", 0.0);
        setDoubleField(term33366, term33366.getClass(), "parRelativeTolerance", 0.0);
        setDoubleField(term33366, term33366.getClass(), "orthoTolerance", 0.0);
        setField(term33366, term33366.getClass(), "checker", null);
        setField(term33366, term33366.getClass(), "jacobian", null);
        setIntField(term33366, term33366.getClass(), "cols", -2113929216);
        setIntField(term33366, term33366.getClass(), "rows", 0);
        setField(term33366, term33366.getClass(), "targetValues", null);
        setField(term33366, term33366.getClass(), "residualsWeights", null);
        setField(term33366, term33366.getClass(), "point", null);
        setField(term33366, term33366.getClass(), "objective", null);
        setField(term33366, term33366.getClass(), "residuals", null);
        setDoubleField(term33366, term33366.getClass(), "cost", 0.0);
        setIntField(term33366, term33366.getClass(), "maxIterations", 0);
        setIntField(term33366, term33366.getClass(), "iterations", 0);
        setIntField(term33366, term33366.getClass(), "maxEvaluations", 0);
        setIntField(term33366, term33366.getClass(), "objectiveEvaluations", 0);
        setIntField(term33366, term33366.getClass(), "jacobianEvaluations", 0);
        setField(term33366, term33366.getClass(), "function", null);
        setField(term33366, term33366.getClass(), "jF", null);
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
        args[1] = 1.000001445421731;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        callMethod(klass, "determineLMParameter", argTypes, term31449, args);
        assertTrue(recursiveEquals(term31449, term33366));
    }

};


