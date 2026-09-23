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
import java.lang.Boolean;

public class CMAESOptimizer_updateCovarianceDiagonalOnly_140220989150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1109;
     Object term1138;

    public CMAESOptimizer_updateCovarianceDiagonalOnly_140220989150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1109 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setIntField(term1109, term1109.getClass(), "lambda", 0);
        setBooleanField(term1109, term1109.getClass(), "isActiveCMA", false);
        setIntField(term1109, term1109.getClass(), "checkFeasableCount", 0);
        setField(term1109, term1109.getClass(), "inputSigma", null);
        setIntField(term1109, term1109.getClass(), "dimension", 0);
        setIntField(term1109, term1109.getClass(), "diagonalOnly", 0);
        setBooleanField(term1109, term1109.getClass(), "isMinimize", false);
        setBooleanField(term1109, term1109.getClass(), "generateStatistics", false);
        setIntField(term1109, term1109.getClass(), "maxIterations", 0);
        setDoubleField(term1109, term1109.getClass(), "stopFitness", 0.0);
        setDoubleField(term1109, term1109.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term1109, term1109.getClass(), "stopTolX", 0.0);
        setDoubleField(term1109, term1109.getClass(), "stopTolFun", 0.0);
        setDoubleField(term1109, term1109.getClass(), "stopTolHistFun", 0.0);
        setIntField(term1109, term1109.getClass(), "mu", 0);
        setDoubleField(term1109, term1109.getClass(), "logMu2", 0.0);
        setField(term1109, term1109.getClass(), "weights", null);
        setDoubleField(term1109, term1109.getClass(), "mueff", 0.0);
        setDoubleField(term1109, term1109.getClass(), "sigma", 0.0);
        setDoubleField(term1109, term1109.getClass(), "cc", 0.0);
        setDoubleField(term1109, term1109.getClass(), "cs", 0.0);
        setDoubleField(term1109, term1109.getClass(), "damps", 0.0);
        setDoubleField(term1109, term1109.getClass(), "ccov1", 0.0);
        setDoubleField(term1109, term1109.getClass(), "ccovmu", 0.0);
        setDoubleField(term1109, term1109.getClass(), "chiN", 0.0);
        setDoubleField(term1109, term1109.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term1109, term1109.getClass(), "ccovmuSep", 0.0);
        setField(term1109, term1109.getClass(), "xmean", null);
        setField(term1109, term1109.getClass(), "pc", null);
        setField(term1109, term1109.getClass(), "ps", null);
        setDoubleField(term1109, term1109.getClass(), "normps", 0.0);
        setField(term1109, term1109.getClass(), "B", null);
        setField(term1109, term1109.getClass(), "D", null);
        setField(term1109, term1109.getClass(), "BD", null);
        setField(term1109, term1109.getClass(), "diagD", null);
        setField(term1109, term1109.getClass(), "C", null);
        setField(term1109, term1109.getClass(), "diagC", null);
        setIntField(term1109, term1109.getClass(), "iterations", 0);
        setField(term1109, term1109.getClass(), "fitnessHistory", null);
        setIntField(term1109, term1109.getClass(), "historySize", 0);
        setField(term1109, term1109.getClass(), "random", null);
        setField(term1109, term1109.getClass(), "statisticsSigmaHistory", null);
        setField(term1109, term1109.getClass(), "statisticsMeanHistory", null);
        setField(term1109, term1109.getClass(), "statisticsFitnessHistory", null);
        setField(term1109, term1109.getClass(), "statisticsDHistory", null);
        setField(term1109, term1109.getClass(), "function", null);
        setField(term1109, term1109.getClass(), "goal", null);
        setField(term1109, term1109.getClass(), "start", null);
        setField(term1109, term1109.getClass(), "lowerBound", null);
        setField(term1109, term1109.getClass(), "upperBound", null);
        setField(term1109, term1109.getClass(), "evaluations", null);
        setField(term1109, term1109.getClass(), "iterations", null);
        setField(term1109, term1109.getClass(), "checker", null);
        term1138 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Object[] args = new Object[2];
        args[0] = term1138;
        args[1] = null;
        callMethod(klass, "updateCovarianceDiagonalOnly", argTypes, term1109, args);
    }

};


