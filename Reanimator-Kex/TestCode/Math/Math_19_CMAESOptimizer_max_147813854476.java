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

public class CMAESOptimizer_max_147813854476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47278;

    public CMAESOptimizer_max_147813854476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47278 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setIntField(term47278, term47278.getClass(), "lambda", 0);
        setBooleanField(term47278, term47278.getClass(), "isActiveCMA", false);
        setIntField(term47278, term47278.getClass(), "checkFeasableCount", 0);
        setField(term47278, term47278.getClass(), "boundaries", null);
        setField(term47278, term47278.getClass(), "inputSigma", null);
        setIntField(term47278, term47278.getClass(), "dimension", 0);
        setIntField(term47278, term47278.getClass(), "diagonalOnly", 0);
        setBooleanField(term47278, term47278.getClass(), "isMinimize", false);
        setBooleanField(term47278, term47278.getClass(), "generateStatistics", false);
        setIntField(term47278, term47278.getClass(), "maxIterations", 0);
        setDoubleField(term47278, term47278.getClass(), "stopFitness", 0.0);
        setDoubleField(term47278, term47278.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term47278, term47278.getClass(), "stopTolX", 0.0);
        setDoubleField(term47278, term47278.getClass(), "stopTolFun", 0.0);
        setDoubleField(term47278, term47278.getClass(), "stopTolHistFun", 0.0);
        setIntField(term47278, term47278.getClass(), "mu", 0);
        setDoubleField(term47278, term47278.getClass(), "logMu2", 0.0);
        setField(term47278, term47278.getClass(), "weights", null);
        setDoubleField(term47278, term47278.getClass(), "mueff", 0.0);
        setDoubleField(term47278, term47278.getClass(), "sigma", 0.0);
        setDoubleField(term47278, term47278.getClass(), "cc", 0.0);
        setDoubleField(term47278, term47278.getClass(), "cs", 0.0);
        setDoubleField(term47278, term47278.getClass(), "damps", 0.0);
        setDoubleField(term47278, term47278.getClass(), "ccov1", 0.0);
        setDoubleField(term47278, term47278.getClass(), "ccovmu", 0.0);
        setDoubleField(term47278, term47278.getClass(), "chiN", 0.0);
        setDoubleField(term47278, term47278.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term47278, term47278.getClass(), "ccovmuSep", 0.0);
        setField(term47278, term47278.getClass(), "xmean", null);
        setField(term47278, term47278.getClass(), "pc", null);
        setField(term47278, term47278.getClass(), "ps", null);
        setDoubleField(term47278, term47278.getClass(), "normps", 0.0);
        setField(term47278, term47278.getClass(), "B", null);
        setField(term47278, term47278.getClass(), "D", null);
        setField(term47278, term47278.getClass(), "BD", null);
        setField(term47278, term47278.getClass(), "diagD", null);
        setField(term47278, term47278.getClass(), "C", null);
        setField(term47278, term47278.getClass(), "diagC", null);
        setIntField(term47278, term47278.getClass(), "iterations", 0);
        setField(term47278, term47278.getClass(), "fitnessHistory", null);
        setIntField(term47278, term47278.getClass(), "historySize", 0);
        setField(term47278, term47278.getClass(), "random", null);
        setField(term47278, term47278.getClass(), "statisticsSigmaHistory", null);
        setField(term47278, term47278.getClass(), "statisticsMeanHistory", null);
        setField(term47278, term47278.getClass(), "statisticsFitnessHistory", null);
        setField(term47278, term47278.getClass(), "statisticsDHistory", null);
        setField(term47278, term47278.getClass(), "lowerBound", null);
        setField(term47278, term47278.getClass(), "upperBound", null);
        setField(term47278, term47278.getClass(), "evaluations", null);
        setField(term47278, term47278.getClass(), "checker", null);
        setField(term47278, term47278.getClass(), "goal", null);
        setField(term47278, term47278.getClass(), "start", null);
        setField(term47278, term47278.getClass(), "function", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "max", argTypes, term47278, args);
    }

};


