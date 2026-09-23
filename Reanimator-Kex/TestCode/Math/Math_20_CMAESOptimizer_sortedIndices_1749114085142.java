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

public class CMAESOptimizer_sortedIndices_1749114085142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89257;
     Object term89101;
     Object term89928;
     Object term89929;
     Object term89895;

    public CMAESOptimizer_sortedIndices_1749114085142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89257 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        term89101 = (double[]) newDoubleArray(1);
        term89928 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setIntField(term89928, term89928.getClass(), "lambda", 0);
        setBooleanField(term89928, term89928.getClass(), "isActiveCMA", false);
        setIntField(term89928, term89928.getClass(), "checkFeasableCount", 0);
        setField(term89928, term89928.getClass(), "boundaries", null);
        setField(term89928, term89928.getClass(), "inputSigma", null);
        setIntField(term89928, term89928.getClass(), "dimension", 0);
        setIntField(term89928, term89928.getClass(), "diagonalOnly", 0);
        setBooleanField(term89928, term89928.getClass(), "isMinimize", false);
        setBooleanField(term89928, term89928.getClass(), "generateStatistics", false);
        setIntField(term89928, term89928.getClass(), "maxIterations", 0);
        setDoubleField(term89928, term89928.getClass(), "stopFitness", 0.0);
        setDoubleField(term89928, term89928.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term89928, term89928.getClass(), "stopTolX", 0.0);
        setDoubleField(term89928, term89928.getClass(), "stopTolFun", 0.0);
        setDoubleField(term89928, term89928.getClass(), "stopTolHistFun", 0.0);
        setIntField(term89928, term89928.getClass(), "mu", 0);
        setDoubleField(term89928, term89928.getClass(), "logMu2", 0.0);
        setField(term89928, term89928.getClass(), "weights", null);
        setDoubleField(term89928, term89928.getClass(), "mueff", 0.0);
        setDoubleField(term89928, term89928.getClass(), "sigma", 0.0);
        setDoubleField(term89928, term89928.getClass(), "cc", 0.0);
        setDoubleField(term89928, term89928.getClass(), "cs", 0.0);
        setDoubleField(term89928, term89928.getClass(), "damps", 0.0);
        setDoubleField(term89928, term89928.getClass(), "ccov1", 0.0);
        setDoubleField(term89928, term89928.getClass(), "ccovmu", 0.0);
        setDoubleField(term89928, term89928.getClass(), "chiN", 0.0);
        setDoubleField(term89928, term89928.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term89928, term89928.getClass(), "ccovmuSep", 0.0);
        setField(term89928, term89928.getClass(), "xmean", null);
        setField(term89928, term89928.getClass(), "pc", null);
        setField(term89928, term89928.getClass(), "ps", null);
        setDoubleField(term89928, term89928.getClass(), "normps", 0.0);
        setField(term89928, term89928.getClass(), "B", null);
        setField(term89928, term89928.getClass(), "D", null);
        setField(term89928, term89928.getClass(), "BD", null);
        setField(term89928, term89928.getClass(), "diagD", null);
        setField(term89928, term89928.getClass(), "C", null);
        setField(term89928, term89928.getClass(), "diagC", null);
        setIntField(term89928, term89928.getClass(), "iterations", 0);
        setField(term89928, term89928.getClass(), "fitnessHistory", null);
        setIntField(term89928, term89928.getClass(), "historySize", 0);
        setField(term89928, term89928.getClass(), "random", null);
        setField(term89928, term89928.getClass(), "statisticsSigmaHistory", null);
        setField(term89928, term89928.getClass(), "statisticsMeanHistory", null);
        setField(term89928, term89928.getClass(), "statisticsFitnessHistory", null);
        setField(term89928, term89928.getClass(), "statisticsDHistory", null);
        setField(term89928, term89928.getClass(), "lowerBound", null);
        setField(term89928, term89928.getClass(), "upperBound", null);
        setField(term89928, term89928.getClass(), "evaluations", null);
        setField(term89928, term89928.getClass(), "checker", null);
        setField(term89928, term89928.getClass(), "goal", null);
        setField(term89928, term89928.getClass(), "start", null);
        setField(term89928, term89928.getClass(), "function", null);
        term89929 = (double[]) newDoubleArray(1);
        term89895 = (int[]) newIntArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term89101;
        Object retValue = callMethod(klass, "sortedIndices", argTypes, term89257, args);
        assertTrue(recursiveEquals(term89257, term89928));
        assertTrue(recursiveEquals(term89101, term89929));
        assertTrue(recursiveEquals(retValue, term89895));
    }

};


