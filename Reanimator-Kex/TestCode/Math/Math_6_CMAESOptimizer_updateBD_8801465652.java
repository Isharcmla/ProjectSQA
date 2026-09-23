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
import java.lang.Double;

public class CMAESOptimizer_updateBD_8801465652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1171;
     Object term1200;

    public CMAESOptimizer_updateBD_8801465652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1171 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setIntField(term1171, term1171.getClass(), "lambda", 0);
        setBooleanField(term1171, term1171.getClass(), "isActiveCMA", false);
        setIntField(term1171, term1171.getClass(), "checkFeasableCount", 0);
        setField(term1171, term1171.getClass(), "inputSigma", null);
        setIntField(term1171, term1171.getClass(), "dimension", 0);
        setIntField(term1171, term1171.getClass(), "diagonalOnly", 0);
        setBooleanField(term1171, term1171.getClass(), "isMinimize", false);
        setBooleanField(term1171, term1171.getClass(), "generateStatistics", false);
        setIntField(term1171, term1171.getClass(), "maxIterations", 0);
        setDoubleField(term1171, term1171.getClass(), "stopFitness", 0.0);
        setDoubleField(term1171, term1171.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term1171, term1171.getClass(), "stopTolX", 0.0);
        setDoubleField(term1171, term1171.getClass(), "stopTolFun", 0.0);
        setDoubleField(term1171, term1171.getClass(), "stopTolHistFun", 0.0);
        setIntField(term1171, term1171.getClass(), "mu", 0);
        setDoubleField(term1171, term1171.getClass(), "logMu2", 0.0);
        setField(term1171, term1171.getClass(), "weights", null);
        setDoubleField(term1171, term1171.getClass(), "mueff", 0.0);
        setDoubleField(term1171, term1171.getClass(), "sigma", 0.0);
        setDoubleField(term1171, term1171.getClass(), "cc", 0.0);
        setDoubleField(term1171, term1171.getClass(), "cs", 0.0);
        setDoubleField(term1171, term1171.getClass(), "damps", 0.0);
        setDoubleField(term1171, term1171.getClass(), "ccov1", 0.0);
        setDoubleField(term1171, term1171.getClass(), "ccovmu", 0.0);
        setDoubleField(term1171, term1171.getClass(), "chiN", 0.0);
        setDoubleField(term1171, term1171.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term1171, term1171.getClass(), "ccovmuSep", 0.0);
        setField(term1171, term1171.getClass(), "xmean", null);
        setField(term1171, term1171.getClass(), "pc", null);
        setField(term1171, term1171.getClass(), "ps", null);
        setDoubleField(term1171, term1171.getClass(), "normps", 0.0);
        setField(term1171, term1171.getClass(), "B", null);
        setField(term1171, term1171.getClass(), "D", null);
        setField(term1171, term1171.getClass(), "BD", null);
        setField(term1171, term1171.getClass(), "diagD", null);
        setField(term1171, term1171.getClass(), "C", null);
        setField(term1171, term1171.getClass(), "diagC", null);
        setIntField(term1171, term1171.getClass(), "iterations", 0);
        setField(term1171, term1171.getClass(), "fitnessHistory", null);
        setIntField(term1171, term1171.getClass(), "historySize", 0);
        setField(term1171, term1171.getClass(), "random", null);
        setField(term1171, term1171.getClass(), "statisticsSigmaHistory", null);
        setField(term1171, term1171.getClass(), "statisticsMeanHistory", null);
        setField(term1171, term1171.getClass(), "statisticsFitnessHistory", null);
        setField(term1171, term1171.getClass(), "statisticsDHistory", null);
        setField(term1171, term1171.getClass(), "function", null);
        setField(term1171, term1171.getClass(), "goal", null);
        setField(term1171, term1171.getClass(), "start", null);
        setField(term1171, term1171.getClass(), "lowerBound", null);
        setField(term1171, term1171.getClass(), "upperBound", null);
        setField(term1171, term1171.getClass(), "evaluations", null);
        setField(term1171, term1171.getClass(), "iterations", null);
        setField(term1171, term1171.getClass(), "checker", null);
        term1200 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term1200;
        callMethod(klass, "updateBD", argTypes, term1171, args);
    }

};


