package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

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
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CMAESOptimizer_initializeCMA_18937485248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1051;

    public CMAESOptimizer_initializeCMA_18937485248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1051 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setIntField(term1051, term1051.getClass(), "lambda", 0);
        setBooleanField(term1051, term1051.getClass(), "isActiveCMA", false);
        setIntField(term1051, term1051.getClass(), "checkFeasableCount", 0);
        setField(term1051, term1051.getClass(), "inputSigma", null);
        setIntField(term1051, term1051.getClass(), "dimension", 0);
        setIntField(term1051, term1051.getClass(), "diagonalOnly", 0);
        setBooleanField(term1051, term1051.getClass(), "isMinimize", false);
        setBooleanField(term1051, term1051.getClass(), "generateStatistics", false);
        setIntField(term1051, term1051.getClass(), "maxIterations", 0);
        setDoubleField(term1051, term1051.getClass(), "stopFitness", 0.0);
        setDoubleField(term1051, term1051.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term1051, term1051.getClass(), "stopTolX", 0.0);
        setDoubleField(term1051, term1051.getClass(), "stopTolFun", 0.0);
        setDoubleField(term1051, term1051.getClass(), "stopTolHistFun", 0.0);
        setIntField(term1051, term1051.getClass(), "mu", 0);
        setDoubleField(term1051, term1051.getClass(), "logMu2", 0.0);
        setField(term1051, term1051.getClass(), "weights", null);
        setDoubleField(term1051, term1051.getClass(), "mueff", 0.0);
        setDoubleField(term1051, term1051.getClass(), "sigma", 0.0);
        setDoubleField(term1051, term1051.getClass(), "cc", 0.0);
        setDoubleField(term1051, term1051.getClass(), "cs", 0.0);
        setDoubleField(term1051, term1051.getClass(), "damps", 0.0);
        setDoubleField(term1051, term1051.getClass(), "ccov1", 0.0);
        setDoubleField(term1051, term1051.getClass(), "ccovmu", 0.0);
        setDoubleField(term1051, term1051.getClass(), "chiN", 0.0);
        setDoubleField(term1051, term1051.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term1051, term1051.getClass(), "ccovmuSep", 0.0);
        setField(term1051, term1051.getClass(), "xmean", null);
        setField(term1051, term1051.getClass(), "pc", null);
        setField(term1051, term1051.getClass(), "ps", null);
        setDoubleField(term1051, term1051.getClass(), "normps", 0.0);
        setField(term1051, term1051.getClass(), "B", null);
        setField(term1051, term1051.getClass(), "D", null);
        setField(term1051, term1051.getClass(), "BD", null);
        setField(term1051, term1051.getClass(), "diagD", null);
        setField(term1051, term1051.getClass(), "C", null);
        setField(term1051, term1051.getClass(), "diagC", null);
        setIntField(term1051, term1051.getClass(), "iterations", 0);
        setField(term1051, term1051.getClass(), "fitnessHistory", null);
        setIntField(term1051, term1051.getClass(), "historySize", 0);
        setField(term1051, term1051.getClass(), "random", null);
        setField(term1051, term1051.getClass(), "statisticsSigmaHistory", null);
        setField(term1051, term1051.getClass(), "statisticsMeanHistory", null);
        setField(term1051, term1051.getClass(), "statisticsFitnessHistory", null);
        setField(term1051, term1051.getClass(), "statisticsDHistory", null);
        setField(term1051, term1051.getClass(), "function", null);
        setField(term1051, term1051.getClass(), "goal", null);
        setField(term1051, term1051.getClass(), "start", null);
        setField(term1051, term1051.getClass(), "lowerBound", null);
        setField(term1051, term1051.getClass(), "upperBound", null);
        setField(term1051, term1051.getClass(), "evaluations", null);
        setField(term1051, term1051.getClass(), "iterations", null);
        setField(term1051, term1051.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "initializeCMA", argTypes, term1051, args);
    }

};


