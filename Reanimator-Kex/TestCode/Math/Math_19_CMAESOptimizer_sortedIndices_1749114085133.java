package org.apache.commons.math3.optimization.direct;

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
import static org.apache.commons.math3.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optimization.direct.EqualityUtils.*;

public class CMAESOptimizer_sortedIndices_1749114085133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71675;
     Object term71533;
     Object term71709;
     Object term71710;
     Object term71678;

    public CMAESOptimizer_sortedIndices_1749114085133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71675 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        term71533 = (double[]) newDoubleArray(0);
        term71709 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setIntField(term71709, term71709.getClass(), "lambda", 0);
        setBooleanField(term71709, term71709.getClass(), "isActiveCMA", false);
        setIntField(term71709, term71709.getClass(), "checkFeasableCount", 0);
        setField(term71709, term71709.getClass(), "boundaries", null);
        setField(term71709, term71709.getClass(), "inputSigma", null);
        setIntField(term71709, term71709.getClass(), "dimension", 0);
        setIntField(term71709, term71709.getClass(), "diagonalOnly", 0);
        setBooleanField(term71709, term71709.getClass(), "isMinimize", false);
        setBooleanField(term71709, term71709.getClass(), "generateStatistics", false);
        setIntField(term71709, term71709.getClass(), "maxIterations", 0);
        setDoubleField(term71709, term71709.getClass(), "stopFitness", 0.0);
        setDoubleField(term71709, term71709.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term71709, term71709.getClass(), "stopTolX", 0.0);
        setDoubleField(term71709, term71709.getClass(), "stopTolFun", 0.0);
        setDoubleField(term71709, term71709.getClass(), "stopTolHistFun", 0.0);
        setIntField(term71709, term71709.getClass(), "mu", 0);
        setDoubleField(term71709, term71709.getClass(), "logMu2", 0.0);
        setField(term71709, term71709.getClass(), "weights", null);
        setDoubleField(term71709, term71709.getClass(), "mueff", 0.0);
        setDoubleField(term71709, term71709.getClass(), "sigma", 0.0);
        setDoubleField(term71709, term71709.getClass(), "cc", 0.0);
        setDoubleField(term71709, term71709.getClass(), "cs", 0.0);
        setDoubleField(term71709, term71709.getClass(), "damps", 0.0);
        setDoubleField(term71709, term71709.getClass(), "ccov1", 0.0);
        setDoubleField(term71709, term71709.getClass(), "ccovmu", 0.0);
        setDoubleField(term71709, term71709.getClass(), "chiN", 0.0);
        setDoubleField(term71709, term71709.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term71709, term71709.getClass(), "ccovmuSep", 0.0);
        setField(term71709, term71709.getClass(), "xmean", null);
        setField(term71709, term71709.getClass(), "pc", null);
        setField(term71709, term71709.getClass(), "ps", null);
        setDoubleField(term71709, term71709.getClass(), "normps", 0.0);
        setField(term71709, term71709.getClass(), "B", null);
        setField(term71709, term71709.getClass(), "D", null);
        setField(term71709, term71709.getClass(), "BD", null);
        setField(term71709, term71709.getClass(), "diagD", null);
        setField(term71709, term71709.getClass(), "C", null);
        setField(term71709, term71709.getClass(), "diagC", null);
        setIntField(term71709, term71709.getClass(), "iterations", 0);
        setField(term71709, term71709.getClass(), "fitnessHistory", null);
        setIntField(term71709, term71709.getClass(), "historySize", 0);
        setField(term71709, term71709.getClass(), "random", null);
        setField(term71709, term71709.getClass(), "statisticsSigmaHistory", null);
        setField(term71709, term71709.getClass(), "statisticsMeanHistory", null);
        setField(term71709, term71709.getClass(), "statisticsFitnessHistory", null);
        setField(term71709, term71709.getClass(), "statisticsDHistory", null);
        setField(term71709, term71709.getClass(), "lowerBound", null);
        setField(term71709, term71709.getClass(), "upperBound", null);
        setField(term71709, term71709.getClass(), "evaluations", null);
        setField(term71709, term71709.getClass(), "checker", null);
        setField(term71709, term71709.getClass(), "goal", null);
        setField(term71709, term71709.getClass(), "start", null);
        setField(term71709, term71709.getClass(), "function", null);
        term71710 = (double[]) newDoubleArray(0);
        term71678 = (int[]) newIntArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term71533;
        Object retValue = callMethod(klass, "sortedIndices", argTypes, term71675, args);
        assertTrue(recursiveEquals(term71675, term71709));
        assertTrue(recursiveEquals(term71533, term71710));
        assertTrue(recursiveEquals(retValue, term71678));
    }

};


