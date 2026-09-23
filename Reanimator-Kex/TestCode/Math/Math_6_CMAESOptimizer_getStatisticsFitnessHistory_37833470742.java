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

public class CMAESOptimizer_getStatisticsFitnessHistory_37833470742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term877;

    public CMAESOptimizer_getStatisticsFitnessHistory_37833470742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term877 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setIntField(term877, term877.getClass(), "lambda", 0);
        setBooleanField(term877, term877.getClass(), "isActiveCMA", false);
        setIntField(term877, term877.getClass(), "checkFeasableCount", 0);
        setField(term877, term877.getClass(), "inputSigma", null);
        setIntField(term877, term877.getClass(), "dimension", 0);
        setIntField(term877, term877.getClass(), "diagonalOnly", 0);
        setBooleanField(term877, term877.getClass(), "isMinimize", false);
        setBooleanField(term877, term877.getClass(), "generateStatistics", false);
        setIntField(term877, term877.getClass(), "maxIterations", 0);
        setDoubleField(term877, term877.getClass(), "stopFitness", 0.0);
        setDoubleField(term877, term877.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term877, term877.getClass(), "stopTolX", 0.0);
        setDoubleField(term877, term877.getClass(), "stopTolFun", 0.0);
        setDoubleField(term877, term877.getClass(), "stopTolHistFun", 0.0);
        setIntField(term877, term877.getClass(), "mu", 0);
        setDoubleField(term877, term877.getClass(), "logMu2", 0.0);
        setField(term877, term877.getClass(), "weights", null);
        setDoubleField(term877, term877.getClass(), "mueff", 0.0);
        setDoubleField(term877, term877.getClass(), "sigma", 0.0);
        setDoubleField(term877, term877.getClass(), "cc", 0.0);
        setDoubleField(term877, term877.getClass(), "cs", 0.0);
        setDoubleField(term877, term877.getClass(), "damps", 0.0);
        setDoubleField(term877, term877.getClass(), "ccov1", 0.0);
        setDoubleField(term877, term877.getClass(), "ccovmu", 0.0);
        setDoubleField(term877, term877.getClass(), "chiN", 0.0);
        setDoubleField(term877, term877.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term877, term877.getClass(), "ccovmuSep", 0.0);
        setField(term877, term877.getClass(), "xmean", null);
        setField(term877, term877.getClass(), "pc", null);
        setField(term877, term877.getClass(), "ps", null);
        setDoubleField(term877, term877.getClass(), "normps", 0.0);
        setField(term877, term877.getClass(), "B", null);
        setField(term877, term877.getClass(), "D", null);
        setField(term877, term877.getClass(), "BD", null);
        setField(term877, term877.getClass(), "diagD", null);
        setField(term877, term877.getClass(), "C", null);
        setField(term877, term877.getClass(), "diagC", null);
        setIntField(term877, term877.getClass(), "iterations", 0);
        setField(term877, term877.getClass(), "fitnessHistory", null);
        setIntField(term877, term877.getClass(), "historySize", 0);
        setField(term877, term877.getClass(), "random", null);
        setField(term877, term877.getClass(), "statisticsSigmaHistory", null);
        setField(term877, term877.getClass(), "statisticsMeanHistory", null);
        setField(term877, term877.getClass(), "statisticsFitnessHistory", null);
        setField(term877, term877.getClass(), "statisticsDHistory", null);
        setField(term877, term877.getClass(), "function", null);
        setField(term877, term877.getClass(), "goal", null);
        setField(term877, term877.getClass(), "start", null);
        setField(term877, term877.getClass(), "lowerBound", null);
        setField(term877, term877.getClass(), "upperBound", null);
        setField(term877, term877.getClass(), "evaluations", null);
        setField(term877, term877.getClass(), "iterations", null);
        setField(term877, term877.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatisticsFitnessHistory", argTypes, term877, args);
    }

};


