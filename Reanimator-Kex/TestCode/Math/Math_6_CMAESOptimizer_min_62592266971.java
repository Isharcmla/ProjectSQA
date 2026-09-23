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

public class CMAESOptimizer_min_62592266971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6695;

    public CMAESOptimizer_min_62592266971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6695 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setIntField(term6695, term6695.getClass(), "lambda", 0);
        setBooleanField(term6695, term6695.getClass(), "isActiveCMA", false);
        setIntField(term6695, term6695.getClass(), "checkFeasableCount", 0);
        setField(term6695, term6695.getClass(), "inputSigma", null);
        setIntField(term6695, term6695.getClass(), "dimension", 0);
        setIntField(term6695, term6695.getClass(), "diagonalOnly", 0);
        setBooleanField(term6695, term6695.getClass(), "isMinimize", false);
        setBooleanField(term6695, term6695.getClass(), "generateStatistics", false);
        setIntField(term6695, term6695.getClass(), "maxIterations", 0);
        setDoubleField(term6695, term6695.getClass(), "stopFitness", 0.0);
        setDoubleField(term6695, term6695.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term6695, term6695.getClass(), "stopTolX", 0.0);
        setDoubleField(term6695, term6695.getClass(), "stopTolFun", 0.0);
        setDoubleField(term6695, term6695.getClass(), "stopTolHistFun", 0.0);
        setIntField(term6695, term6695.getClass(), "mu", 0);
        setDoubleField(term6695, term6695.getClass(), "logMu2", 0.0);
        setField(term6695, term6695.getClass(), "weights", null);
        setDoubleField(term6695, term6695.getClass(), "mueff", 0.0);
        setDoubleField(term6695, term6695.getClass(), "sigma", 0.0);
        setDoubleField(term6695, term6695.getClass(), "cc", 0.0);
        setDoubleField(term6695, term6695.getClass(), "cs", 0.0);
        setDoubleField(term6695, term6695.getClass(), "damps", 0.0);
        setDoubleField(term6695, term6695.getClass(), "ccov1", 0.0);
        setDoubleField(term6695, term6695.getClass(), "ccovmu", 0.0);
        setDoubleField(term6695, term6695.getClass(), "chiN", 0.0);
        setDoubleField(term6695, term6695.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term6695, term6695.getClass(), "ccovmuSep", 0.0);
        setField(term6695, term6695.getClass(), "xmean", null);
        setField(term6695, term6695.getClass(), "pc", null);
        setField(term6695, term6695.getClass(), "ps", null);
        setDoubleField(term6695, term6695.getClass(), "normps", 0.0);
        setField(term6695, term6695.getClass(), "B", null);
        setField(term6695, term6695.getClass(), "D", null);
        setField(term6695, term6695.getClass(), "BD", null);
        setField(term6695, term6695.getClass(), "diagD", null);
        setField(term6695, term6695.getClass(), "C", null);
        setField(term6695, term6695.getClass(), "diagC", null);
        setIntField(term6695, term6695.getClass(), "iterations", 0);
        setField(term6695, term6695.getClass(), "fitnessHistory", null);
        setIntField(term6695, term6695.getClass(), "historySize", 0);
        setField(term6695, term6695.getClass(), "random", null);
        setField(term6695, term6695.getClass(), "statisticsSigmaHistory", null);
        setField(term6695, term6695.getClass(), "statisticsMeanHistory", null);
        setField(term6695, term6695.getClass(), "statisticsFitnessHistory", null);
        setField(term6695, term6695.getClass(), "statisticsDHistory", null);
        setField(term6695, term6695.getClass(), "function", null);
        setField(term6695, term6695.getClass(), "goal", null);
        setField(term6695, term6695.getClass(), "start", null);
        setField(term6695, term6695.getClass(), "lowerBound", null);
        setField(term6695, term6695.getClass(), "upperBound", null);
        setField(term6695, term6695.getClass(), "evaluations", null);
        setField(term6695, term6695.getClass(), "iterations", null);
        setField(term6695, term6695.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "min", argTypes, term6695, args);
    }

};


