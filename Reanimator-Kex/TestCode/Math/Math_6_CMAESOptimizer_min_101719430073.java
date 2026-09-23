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

public class CMAESOptimizer_min_101719430073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6799;

    public CMAESOptimizer_min_101719430073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6799 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setIntField(term6799, term6799.getClass(), "lambda", 0);
        setBooleanField(term6799, term6799.getClass(), "isActiveCMA", false);
        setIntField(term6799, term6799.getClass(), "checkFeasableCount", 0);
        setField(term6799, term6799.getClass(), "inputSigma", null);
        setIntField(term6799, term6799.getClass(), "dimension", 0);
        setIntField(term6799, term6799.getClass(), "diagonalOnly", 0);
        setBooleanField(term6799, term6799.getClass(), "isMinimize", false);
        setBooleanField(term6799, term6799.getClass(), "generateStatistics", false);
        setIntField(term6799, term6799.getClass(), "maxIterations", 0);
        setDoubleField(term6799, term6799.getClass(), "stopFitness", 0.0);
        setDoubleField(term6799, term6799.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term6799, term6799.getClass(), "stopTolX", 0.0);
        setDoubleField(term6799, term6799.getClass(), "stopTolFun", 0.0);
        setDoubleField(term6799, term6799.getClass(), "stopTolHistFun", 0.0);
        setIntField(term6799, term6799.getClass(), "mu", 0);
        setDoubleField(term6799, term6799.getClass(), "logMu2", 0.0);
        setField(term6799, term6799.getClass(), "weights", null);
        setDoubleField(term6799, term6799.getClass(), "mueff", 0.0);
        setDoubleField(term6799, term6799.getClass(), "sigma", 0.0);
        setDoubleField(term6799, term6799.getClass(), "cc", 0.0);
        setDoubleField(term6799, term6799.getClass(), "cs", 0.0);
        setDoubleField(term6799, term6799.getClass(), "damps", 0.0);
        setDoubleField(term6799, term6799.getClass(), "ccov1", 0.0);
        setDoubleField(term6799, term6799.getClass(), "ccovmu", 0.0);
        setDoubleField(term6799, term6799.getClass(), "chiN", 0.0);
        setDoubleField(term6799, term6799.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term6799, term6799.getClass(), "ccovmuSep", 0.0);
        setField(term6799, term6799.getClass(), "xmean", null);
        setField(term6799, term6799.getClass(), "pc", null);
        setField(term6799, term6799.getClass(), "ps", null);
        setDoubleField(term6799, term6799.getClass(), "normps", 0.0);
        setField(term6799, term6799.getClass(), "B", null);
        setField(term6799, term6799.getClass(), "D", null);
        setField(term6799, term6799.getClass(), "BD", null);
        setField(term6799, term6799.getClass(), "diagD", null);
        setField(term6799, term6799.getClass(), "C", null);
        setField(term6799, term6799.getClass(), "diagC", null);
        setIntField(term6799, term6799.getClass(), "iterations", 0);
        setField(term6799, term6799.getClass(), "fitnessHistory", null);
        setIntField(term6799, term6799.getClass(), "historySize", 0);
        setField(term6799, term6799.getClass(), "random", null);
        setField(term6799, term6799.getClass(), "statisticsSigmaHistory", null);
        setField(term6799, term6799.getClass(), "statisticsMeanHistory", null);
        setField(term6799, term6799.getClass(), "statisticsFitnessHistory", null);
        setField(term6799, term6799.getClass(), "statisticsDHistory", null);
        setField(term6799, term6799.getClass(), "function", null);
        setField(term6799, term6799.getClass(), "goal", null);
        setField(term6799, term6799.getClass(), "start", null);
        setField(term6799, term6799.getClass(), "lowerBound", null);
        setField(term6799, term6799.getClass(), "upperBound", null);
        setField(term6799, term6799.getClass(), "evaluations", null);
        setField(term6799, term6799.getClass(), "iterations", null);
        setField(term6799, term6799.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "min", argTypes, term6799, args);
    }

};


