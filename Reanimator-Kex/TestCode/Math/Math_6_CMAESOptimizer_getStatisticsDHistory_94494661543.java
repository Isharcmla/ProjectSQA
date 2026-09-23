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

public class CMAESOptimizer_getStatisticsDHistory_94494661543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term906;

    public CMAESOptimizer_getStatisticsDHistory_94494661543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term906 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setIntField(term906, term906.getClass(), "lambda", 0);
        setBooleanField(term906, term906.getClass(), "isActiveCMA", false);
        setIntField(term906, term906.getClass(), "checkFeasableCount", 0);
        setField(term906, term906.getClass(), "inputSigma", null);
        setIntField(term906, term906.getClass(), "dimension", 0);
        setIntField(term906, term906.getClass(), "diagonalOnly", 0);
        setBooleanField(term906, term906.getClass(), "isMinimize", false);
        setBooleanField(term906, term906.getClass(), "generateStatistics", false);
        setIntField(term906, term906.getClass(), "maxIterations", 0);
        setDoubleField(term906, term906.getClass(), "stopFitness", 0.0);
        setDoubleField(term906, term906.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term906, term906.getClass(), "stopTolX", 0.0);
        setDoubleField(term906, term906.getClass(), "stopTolFun", 0.0);
        setDoubleField(term906, term906.getClass(), "stopTolHistFun", 0.0);
        setIntField(term906, term906.getClass(), "mu", 0);
        setDoubleField(term906, term906.getClass(), "logMu2", 0.0);
        setField(term906, term906.getClass(), "weights", null);
        setDoubleField(term906, term906.getClass(), "mueff", 0.0);
        setDoubleField(term906, term906.getClass(), "sigma", 0.0);
        setDoubleField(term906, term906.getClass(), "cc", 0.0);
        setDoubleField(term906, term906.getClass(), "cs", 0.0);
        setDoubleField(term906, term906.getClass(), "damps", 0.0);
        setDoubleField(term906, term906.getClass(), "ccov1", 0.0);
        setDoubleField(term906, term906.getClass(), "ccovmu", 0.0);
        setDoubleField(term906, term906.getClass(), "chiN", 0.0);
        setDoubleField(term906, term906.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term906, term906.getClass(), "ccovmuSep", 0.0);
        setField(term906, term906.getClass(), "xmean", null);
        setField(term906, term906.getClass(), "pc", null);
        setField(term906, term906.getClass(), "ps", null);
        setDoubleField(term906, term906.getClass(), "normps", 0.0);
        setField(term906, term906.getClass(), "B", null);
        setField(term906, term906.getClass(), "D", null);
        setField(term906, term906.getClass(), "BD", null);
        setField(term906, term906.getClass(), "diagD", null);
        setField(term906, term906.getClass(), "C", null);
        setField(term906, term906.getClass(), "diagC", null);
        setIntField(term906, term906.getClass(), "iterations", 0);
        setField(term906, term906.getClass(), "fitnessHistory", null);
        setIntField(term906, term906.getClass(), "historySize", 0);
        setField(term906, term906.getClass(), "random", null);
        setField(term906, term906.getClass(), "statisticsSigmaHistory", null);
        setField(term906, term906.getClass(), "statisticsMeanHistory", null);
        setField(term906, term906.getClass(), "statisticsFitnessHistory", null);
        setField(term906, term906.getClass(), "statisticsDHistory", null);
        setField(term906, term906.getClass(), "function", null);
        setField(term906, term906.getClass(), "goal", null);
        setField(term906, term906.getClass(), "start", null);
        setField(term906, term906.getClass(), "lowerBound", null);
        setField(term906, term906.getClass(), "upperBound", null);
        setField(term906, term906.getClass(), "evaluations", null);
        setField(term906, term906.getClass(), "iterations", null);
        setField(term906, term906.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatisticsDHistory", argTypes, term906, args);
    }

};


