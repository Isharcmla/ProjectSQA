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

public class CMAESOptimizer_sortedIndices_1749114085128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70795;
     Object term70653;
     Object term70974;
     Object term70975;
     Object term70943;

    public CMAESOptimizer_sortedIndices_1749114085128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70795 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        term70653 = (double[]) newDoubleArray(0);
        term70974 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setIntField(term70974, term70974.getClass(), "lambda", 0);
        setBooleanField(term70974, term70974.getClass(), "isActiveCMA", false);
        setIntField(term70974, term70974.getClass(), "checkFeasableCount", 0);
        setField(term70974, term70974.getClass(), "boundaries", null);
        setField(term70974, term70974.getClass(), "inputSigma", null);
        setIntField(term70974, term70974.getClass(), "dimension", 0);
        setIntField(term70974, term70974.getClass(), "diagonalOnly", 0);
        setBooleanField(term70974, term70974.getClass(), "isMinimize", false);
        setBooleanField(term70974, term70974.getClass(), "generateStatistics", false);
        setIntField(term70974, term70974.getClass(), "maxIterations", 0);
        setDoubleField(term70974, term70974.getClass(), "stopFitness", 0.0);
        setDoubleField(term70974, term70974.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term70974, term70974.getClass(), "stopTolX", 0.0);
        setDoubleField(term70974, term70974.getClass(), "stopTolFun", 0.0);
        setDoubleField(term70974, term70974.getClass(), "stopTolHistFun", 0.0);
        setIntField(term70974, term70974.getClass(), "mu", 0);
        setDoubleField(term70974, term70974.getClass(), "logMu2", 0.0);
        setField(term70974, term70974.getClass(), "weights", null);
        setDoubleField(term70974, term70974.getClass(), "mueff", 0.0);
        setDoubleField(term70974, term70974.getClass(), "sigma", 0.0);
        setDoubleField(term70974, term70974.getClass(), "cc", 0.0);
        setDoubleField(term70974, term70974.getClass(), "cs", 0.0);
        setDoubleField(term70974, term70974.getClass(), "damps", 0.0);
        setDoubleField(term70974, term70974.getClass(), "ccov1", 0.0);
        setDoubleField(term70974, term70974.getClass(), "ccovmu", 0.0);
        setDoubleField(term70974, term70974.getClass(), "chiN", 0.0);
        setDoubleField(term70974, term70974.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term70974, term70974.getClass(), "ccovmuSep", 0.0);
        setField(term70974, term70974.getClass(), "xmean", null);
        setField(term70974, term70974.getClass(), "pc", null);
        setField(term70974, term70974.getClass(), "ps", null);
        setDoubleField(term70974, term70974.getClass(), "normps", 0.0);
        setField(term70974, term70974.getClass(), "B", null);
        setField(term70974, term70974.getClass(), "D", null);
        setField(term70974, term70974.getClass(), "BD", null);
        setField(term70974, term70974.getClass(), "diagD", null);
        setField(term70974, term70974.getClass(), "C", null);
        setField(term70974, term70974.getClass(), "diagC", null);
        setIntField(term70974, term70974.getClass(), "iterations", 0);
        setField(term70974, term70974.getClass(), "fitnessHistory", null);
        setIntField(term70974, term70974.getClass(), "historySize", 0);
        setField(term70974, term70974.getClass(), "random", null);
        setField(term70974, term70974.getClass(), "statisticsSigmaHistory", null);
        setField(term70974, term70974.getClass(), "statisticsMeanHistory", null);
        setField(term70974, term70974.getClass(), "statisticsFitnessHistory", null);
        setField(term70974, term70974.getClass(), "statisticsDHistory", null);
        setField(term70974, term70974.getClass(), "lowerBound", null);
        setField(term70974, term70974.getClass(), "upperBound", null);
        setField(term70974, term70974.getClass(), "evaluations", null);
        setField(term70974, term70974.getClass(), "checker", null);
        setField(term70974, term70974.getClass(), "goal", null);
        setField(term70974, term70974.getClass(), "start", null);
        setField(term70974, term70974.getClass(), "function", null);
        term70975 = (double[]) newDoubleArray(0);
        term70943 = (int[]) newIntArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term70653;
        Object retValue = callMethod(klass, "sortedIndices", argTypes, term70795, args);
        assertTrue(recursiveEquals(term70795, term70974));
        assertTrue(recursiveEquals(term70653, term70975));
        assertTrue(recursiveEquals(retValue, term70943));
    }

};


