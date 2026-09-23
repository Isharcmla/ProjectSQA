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

public class CMAESOptimizer_checkParameters_163183428247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1022;

    public CMAESOptimizer_checkParameters_163183428247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1022 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setIntField(term1022, term1022.getClass(), "lambda", 0);
        setBooleanField(term1022, term1022.getClass(), "isActiveCMA", false);
        setIntField(term1022, term1022.getClass(), "checkFeasableCount", 0);
        setField(term1022, term1022.getClass(), "inputSigma", null);
        setIntField(term1022, term1022.getClass(), "dimension", 0);
        setIntField(term1022, term1022.getClass(), "diagonalOnly", 0);
        setBooleanField(term1022, term1022.getClass(), "isMinimize", false);
        setBooleanField(term1022, term1022.getClass(), "generateStatistics", false);
        setIntField(term1022, term1022.getClass(), "maxIterations", 0);
        setDoubleField(term1022, term1022.getClass(), "stopFitness", 0.0);
        setDoubleField(term1022, term1022.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term1022, term1022.getClass(), "stopTolX", 0.0);
        setDoubleField(term1022, term1022.getClass(), "stopTolFun", 0.0);
        setDoubleField(term1022, term1022.getClass(), "stopTolHistFun", 0.0);
        setIntField(term1022, term1022.getClass(), "mu", 0);
        setDoubleField(term1022, term1022.getClass(), "logMu2", 0.0);
        setField(term1022, term1022.getClass(), "weights", null);
        setDoubleField(term1022, term1022.getClass(), "mueff", 0.0);
        setDoubleField(term1022, term1022.getClass(), "sigma", 0.0);
        setDoubleField(term1022, term1022.getClass(), "cc", 0.0);
        setDoubleField(term1022, term1022.getClass(), "cs", 0.0);
        setDoubleField(term1022, term1022.getClass(), "damps", 0.0);
        setDoubleField(term1022, term1022.getClass(), "ccov1", 0.0);
        setDoubleField(term1022, term1022.getClass(), "ccovmu", 0.0);
        setDoubleField(term1022, term1022.getClass(), "chiN", 0.0);
        setDoubleField(term1022, term1022.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term1022, term1022.getClass(), "ccovmuSep", 0.0);
        setField(term1022, term1022.getClass(), "xmean", null);
        setField(term1022, term1022.getClass(), "pc", null);
        setField(term1022, term1022.getClass(), "ps", null);
        setDoubleField(term1022, term1022.getClass(), "normps", 0.0);
        setField(term1022, term1022.getClass(), "B", null);
        setField(term1022, term1022.getClass(), "D", null);
        setField(term1022, term1022.getClass(), "BD", null);
        setField(term1022, term1022.getClass(), "diagD", null);
        setField(term1022, term1022.getClass(), "C", null);
        setField(term1022, term1022.getClass(), "diagC", null);
        setIntField(term1022, term1022.getClass(), "iterations", 0);
        setField(term1022, term1022.getClass(), "fitnessHistory", null);
        setIntField(term1022, term1022.getClass(), "historySize", 0);
        setField(term1022, term1022.getClass(), "random", null);
        setField(term1022, term1022.getClass(), "statisticsSigmaHistory", null);
        setField(term1022, term1022.getClass(), "statisticsMeanHistory", null);
        setField(term1022, term1022.getClass(), "statisticsFitnessHistory", null);
        setField(term1022, term1022.getClass(), "statisticsDHistory", null);
        setField(term1022, term1022.getClass(), "function", null);
        setField(term1022, term1022.getClass(), "goal", null);
        setField(term1022, term1022.getClass(), "start", null);
        setField(term1022, term1022.getClass(), "lowerBound", null);
        setField(term1022, term1022.getClass(), "upperBound", null);
        setField(term1022, term1022.getClass(), "evaluations", null);
        setField(term1022, term1022.getClass(), "iterations", null);
        setField(term1022, term1022.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkParameters", argTypes, term1022, args);
    }

};


