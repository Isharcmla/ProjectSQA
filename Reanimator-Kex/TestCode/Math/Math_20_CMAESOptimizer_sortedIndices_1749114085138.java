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

public class CMAESOptimizer_sortedIndices_1749114085138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86586;
     Object term86444;
     Object term86872;
     Object term86873;
     Object term86841;

    public CMAESOptimizer_sortedIndices_1749114085138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86586 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        term86444 = (double[]) newDoubleArray(0);
        term86872 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setIntField(term86872, term86872.getClass(), "lambda", 0);
        setBooleanField(term86872, term86872.getClass(), "isActiveCMA", false);
        setIntField(term86872, term86872.getClass(), "checkFeasableCount", 0);
        setField(term86872, term86872.getClass(), "boundaries", null);
        setField(term86872, term86872.getClass(), "inputSigma", null);
        setIntField(term86872, term86872.getClass(), "dimension", 0);
        setIntField(term86872, term86872.getClass(), "diagonalOnly", 0);
        setBooleanField(term86872, term86872.getClass(), "isMinimize", false);
        setBooleanField(term86872, term86872.getClass(), "generateStatistics", false);
        setIntField(term86872, term86872.getClass(), "maxIterations", 0);
        setDoubleField(term86872, term86872.getClass(), "stopFitness", 0.0);
        setDoubleField(term86872, term86872.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term86872, term86872.getClass(), "stopTolX", 0.0);
        setDoubleField(term86872, term86872.getClass(), "stopTolFun", 0.0);
        setDoubleField(term86872, term86872.getClass(), "stopTolHistFun", 0.0);
        setIntField(term86872, term86872.getClass(), "mu", 0);
        setDoubleField(term86872, term86872.getClass(), "logMu2", 0.0);
        setField(term86872, term86872.getClass(), "weights", null);
        setDoubleField(term86872, term86872.getClass(), "mueff", 0.0);
        setDoubleField(term86872, term86872.getClass(), "sigma", 0.0);
        setDoubleField(term86872, term86872.getClass(), "cc", 0.0);
        setDoubleField(term86872, term86872.getClass(), "cs", 0.0);
        setDoubleField(term86872, term86872.getClass(), "damps", 0.0);
        setDoubleField(term86872, term86872.getClass(), "ccov1", 0.0);
        setDoubleField(term86872, term86872.getClass(), "ccovmu", 0.0);
        setDoubleField(term86872, term86872.getClass(), "chiN", 0.0);
        setDoubleField(term86872, term86872.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term86872, term86872.getClass(), "ccovmuSep", 0.0);
        setField(term86872, term86872.getClass(), "xmean", null);
        setField(term86872, term86872.getClass(), "pc", null);
        setField(term86872, term86872.getClass(), "ps", null);
        setDoubleField(term86872, term86872.getClass(), "normps", 0.0);
        setField(term86872, term86872.getClass(), "B", null);
        setField(term86872, term86872.getClass(), "D", null);
        setField(term86872, term86872.getClass(), "BD", null);
        setField(term86872, term86872.getClass(), "diagD", null);
        setField(term86872, term86872.getClass(), "C", null);
        setField(term86872, term86872.getClass(), "diagC", null);
        setIntField(term86872, term86872.getClass(), "iterations", 0);
        setField(term86872, term86872.getClass(), "fitnessHistory", null);
        setIntField(term86872, term86872.getClass(), "historySize", 0);
        setField(term86872, term86872.getClass(), "random", null);
        setField(term86872, term86872.getClass(), "statisticsSigmaHistory", null);
        setField(term86872, term86872.getClass(), "statisticsMeanHistory", null);
        setField(term86872, term86872.getClass(), "statisticsFitnessHistory", null);
        setField(term86872, term86872.getClass(), "statisticsDHistory", null);
        setField(term86872, term86872.getClass(), "lowerBound", null);
        setField(term86872, term86872.getClass(), "upperBound", null);
        setField(term86872, term86872.getClass(), "evaluations", null);
        setField(term86872, term86872.getClass(), "checker", null);
        setField(term86872, term86872.getClass(), "goal", null);
        setField(term86872, term86872.getClass(), "start", null);
        setField(term86872, term86872.getClass(), "function", null);
        term86873 = (double[]) newDoubleArray(0);
        term86841 = (int[]) newIntArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term86444;
        Object retValue = callMethod(klass, "sortedIndices", argTypes, term86586, args);
        assertTrue(recursiveEquals(term86586, term86872));
        assertTrue(recursiveEquals(term86444, term86873));
        assertTrue(recursiveEquals(retValue, term86841));
    }

};


