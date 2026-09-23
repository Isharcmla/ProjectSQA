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

public class CMAESOptimizer_max_101742301872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6731;

    public CMAESOptimizer_max_101742301872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6731 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setIntField(term6731, term6731.getClass(), "lambda", 0);
        setBooleanField(term6731, term6731.getClass(), "isActiveCMA", false);
        setIntField(term6731, term6731.getClass(), "checkFeasableCount", 0);
        setField(term6731, term6731.getClass(), "inputSigma", null);
        setIntField(term6731, term6731.getClass(), "dimension", 0);
        setIntField(term6731, term6731.getClass(), "diagonalOnly", 0);
        setBooleanField(term6731, term6731.getClass(), "isMinimize", false);
        setBooleanField(term6731, term6731.getClass(), "generateStatistics", false);
        setIntField(term6731, term6731.getClass(), "maxIterations", 0);
        setDoubleField(term6731, term6731.getClass(), "stopFitness", 0.0);
        setDoubleField(term6731, term6731.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term6731, term6731.getClass(), "stopTolX", 0.0);
        setDoubleField(term6731, term6731.getClass(), "stopTolFun", 0.0);
        setDoubleField(term6731, term6731.getClass(), "stopTolHistFun", 0.0);
        setIntField(term6731, term6731.getClass(), "mu", 0);
        setDoubleField(term6731, term6731.getClass(), "logMu2", 0.0);
        setField(term6731, term6731.getClass(), "weights", null);
        setDoubleField(term6731, term6731.getClass(), "mueff", 0.0);
        setDoubleField(term6731, term6731.getClass(), "sigma", 0.0);
        setDoubleField(term6731, term6731.getClass(), "cc", 0.0);
        setDoubleField(term6731, term6731.getClass(), "cs", 0.0);
        setDoubleField(term6731, term6731.getClass(), "damps", 0.0);
        setDoubleField(term6731, term6731.getClass(), "ccov1", 0.0);
        setDoubleField(term6731, term6731.getClass(), "ccovmu", 0.0);
        setDoubleField(term6731, term6731.getClass(), "chiN", 0.0);
        setDoubleField(term6731, term6731.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term6731, term6731.getClass(), "ccovmuSep", 0.0);
        setField(term6731, term6731.getClass(), "xmean", null);
        setField(term6731, term6731.getClass(), "pc", null);
        setField(term6731, term6731.getClass(), "ps", null);
        setDoubleField(term6731, term6731.getClass(), "normps", 0.0);
        setField(term6731, term6731.getClass(), "B", null);
        setField(term6731, term6731.getClass(), "D", null);
        setField(term6731, term6731.getClass(), "BD", null);
        setField(term6731, term6731.getClass(), "diagD", null);
        setField(term6731, term6731.getClass(), "C", null);
        setField(term6731, term6731.getClass(), "diagC", null);
        setIntField(term6731, term6731.getClass(), "iterations", 0);
        setField(term6731, term6731.getClass(), "fitnessHistory", null);
        setIntField(term6731, term6731.getClass(), "historySize", 0);
        setField(term6731, term6731.getClass(), "random", null);
        setField(term6731, term6731.getClass(), "statisticsSigmaHistory", null);
        setField(term6731, term6731.getClass(), "statisticsMeanHistory", null);
        setField(term6731, term6731.getClass(), "statisticsFitnessHistory", null);
        setField(term6731, term6731.getClass(), "statisticsDHistory", null);
        setField(term6731, term6731.getClass(), "function", null);
        setField(term6731, term6731.getClass(), "goal", null);
        setField(term6731, term6731.getClass(), "start", null);
        setField(term6731, term6731.getClass(), "lowerBound", null);
        setField(term6731, term6731.getClass(), "upperBound", null);
        setField(term6731, term6731.getClass(), "evaluations", null);
        setField(term6731, term6731.getClass(), "iterations", null);
        setField(term6731, term6731.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "max", argTypes, term6731, args);
    }

};


