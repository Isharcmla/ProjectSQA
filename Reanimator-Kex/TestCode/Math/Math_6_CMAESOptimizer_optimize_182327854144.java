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

public class CMAESOptimizer_optimize_182327854144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term935;

    public CMAESOptimizer_optimize_182327854144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term935 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setIntField(term935, term935.getClass(), "lambda", 0);
        setBooleanField(term935, term935.getClass(), "isActiveCMA", false);
        setIntField(term935, term935.getClass(), "checkFeasableCount", 0);
        setField(term935, term935.getClass(), "inputSigma", null);
        setIntField(term935, term935.getClass(), "dimension", 0);
        setIntField(term935, term935.getClass(), "diagonalOnly", 0);
        setBooleanField(term935, term935.getClass(), "isMinimize", false);
        setBooleanField(term935, term935.getClass(), "generateStatistics", false);
        setIntField(term935, term935.getClass(), "maxIterations", 0);
        setDoubleField(term935, term935.getClass(), "stopFitness", 0.0);
        setDoubleField(term935, term935.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term935, term935.getClass(), "stopTolX", 0.0);
        setDoubleField(term935, term935.getClass(), "stopTolFun", 0.0);
        setDoubleField(term935, term935.getClass(), "stopTolHistFun", 0.0);
        setIntField(term935, term935.getClass(), "mu", 0);
        setDoubleField(term935, term935.getClass(), "logMu2", 0.0);
        setField(term935, term935.getClass(), "weights", null);
        setDoubleField(term935, term935.getClass(), "mueff", 0.0);
        setDoubleField(term935, term935.getClass(), "sigma", 0.0);
        setDoubleField(term935, term935.getClass(), "cc", 0.0);
        setDoubleField(term935, term935.getClass(), "cs", 0.0);
        setDoubleField(term935, term935.getClass(), "damps", 0.0);
        setDoubleField(term935, term935.getClass(), "ccov1", 0.0);
        setDoubleField(term935, term935.getClass(), "ccovmu", 0.0);
        setDoubleField(term935, term935.getClass(), "chiN", 0.0);
        setDoubleField(term935, term935.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term935, term935.getClass(), "ccovmuSep", 0.0);
        setField(term935, term935.getClass(), "xmean", null);
        setField(term935, term935.getClass(), "pc", null);
        setField(term935, term935.getClass(), "ps", null);
        setDoubleField(term935, term935.getClass(), "normps", 0.0);
        setField(term935, term935.getClass(), "B", null);
        setField(term935, term935.getClass(), "D", null);
        setField(term935, term935.getClass(), "BD", null);
        setField(term935, term935.getClass(), "diagD", null);
        setField(term935, term935.getClass(), "C", null);
        setField(term935, term935.getClass(), "diagC", null);
        setIntField(term935, term935.getClass(), "iterations", 0);
        setField(term935, term935.getClass(), "fitnessHistory", null);
        setIntField(term935, term935.getClass(), "historySize", 0);
        setField(term935, term935.getClass(), "random", null);
        setField(term935, term935.getClass(), "statisticsSigmaHistory", null);
        setField(term935, term935.getClass(), "statisticsMeanHistory", null);
        setField(term935, term935.getClass(), "statisticsFitnessHistory", null);
        setField(term935, term935.getClass(), "statisticsDHistory", null);
        setField(term935, term935.getClass(), "function", null);
        setField(term935, term935.getClass(), "goal", null);
        setField(term935, term935.getClass(), "start", null);
        setField(term935, term935.getClass(), "lowerBound", null);
        setField(term935, term935.getClass(), "upperBound", null);
        setField(term935, term935.getClass(), "evaluations", null);
        setField(term935, term935.getClass(), "iterations", null);
        setField(term935, term935.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "optimize", argTypes, term935, args);
    }

};


