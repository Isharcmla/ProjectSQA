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

public class CMAESOptimizer_sortedIndices_208513768554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1213;

    public CMAESOptimizer_sortedIndices_208513768554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1213 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setIntField(term1213, term1213.getClass(), "lambda", 0);
        setBooleanField(term1213, term1213.getClass(), "isActiveCMA", false);
        setIntField(term1213, term1213.getClass(), "checkFeasableCount", 0);
        setField(term1213, term1213.getClass(), "inputSigma", null);
        setIntField(term1213, term1213.getClass(), "dimension", 0);
        setIntField(term1213, term1213.getClass(), "diagonalOnly", 0);
        setBooleanField(term1213, term1213.getClass(), "isMinimize", false);
        setBooleanField(term1213, term1213.getClass(), "generateStatistics", false);
        setIntField(term1213, term1213.getClass(), "maxIterations", 0);
        setDoubleField(term1213, term1213.getClass(), "stopFitness", 0.0);
        setDoubleField(term1213, term1213.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term1213, term1213.getClass(), "stopTolX", 0.0);
        setDoubleField(term1213, term1213.getClass(), "stopTolFun", 0.0);
        setDoubleField(term1213, term1213.getClass(), "stopTolHistFun", 0.0);
        setIntField(term1213, term1213.getClass(), "mu", 0);
        setDoubleField(term1213, term1213.getClass(), "logMu2", 0.0);
        setField(term1213, term1213.getClass(), "weights", null);
        setDoubleField(term1213, term1213.getClass(), "mueff", 0.0);
        setDoubleField(term1213, term1213.getClass(), "sigma", 0.0);
        setDoubleField(term1213, term1213.getClass(), "cc", 0.0);
        setDoubleField(term1213, term1213.getClass(), "cs", 0.0);
        setDoubleField(term1213, term1213.getClass(), "damps", 0.0);
        setDoubleField(term1213, term1213.getClass(), "ccov1", 0.0);
        setDoubleField(term1213, term1213.getClass(), "ccovmu", 0.0);
        setDoubleField(term1213, term1213.getClass(), "chiN", 0.0);
        setDoubleField(term1213, term1213.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term1213, term1213.getClass(), "ccovmuSep", 0.0);
        setField(term1213, term1213.getClass(), "xmean", null);
        setField(term1213, term1213.getClass(), "pc", null);
        setField(term1213, term1213.getClass(), "ps", null);
        setDoubleField(term1213, term1213.getClass(), "normps", 0.0);
        setField(term1213, term1213.getClass(), "B", null);
        setField(term1213, term1213.getClass(), "D", null);
        setField(term1213, term1213.getClass(), "BD", null);
        setField(term1213, term1213.getClass(), "diagD", null);
        setField(term1213, term1213.getClass(), "C", null);
        setField(term1213, term1213.getClass(), "diagC", null);
        setIntField(term1213, term1213.getClass(), "iterations", 0);
        setField(term1213, term1213.getClass(), "fitnessHistory", null);
        setIntField(term1213, term1213.getClass(), "historySize", 0);
        setField(term1213, term1213.getClass(), "random", null);
        setField(term1213, term1213.getClass(), "statisticsSigmaHistory", null);
        setField(term1213, term1213.getClass(), "statisticsMeanHistory", null);
        setField(term1213, term1213.getClass(), "statisticsFitnessHistory", null);
        setField(term1213, term1213.getClass(), "statisticsDHistory", null);
        setField(term1213, term1213.getClass(), "function", null);
        setField(term1213, term1213.getClass(), "goal", null);
        setField(term1213, term1213.getClass(), "start", null);
        setField(term1213, term1213.getClass(), "lowerBound", null);
        setField(term1213, term1213.getClass(), "upperBound", null);
        setField(term1213, term1213.getClass(), "evaluations", null);
        setField(term1213, term1213.getClass(), "iterations", null);
        setField(term1213, term1213.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "sortedIndices", argTypes, term1213, args);
    }

};


