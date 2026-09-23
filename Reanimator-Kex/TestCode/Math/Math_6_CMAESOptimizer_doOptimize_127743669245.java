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

public class CMAESOptimizer_doOptimize_127743669245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term964;

    public CMAESOptimizer_doOptimize_127743669245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term964 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setIntField(term964, term964.getClass(), "lambda", 0);
        setBooleanField(term964, term964.getClass(), "isActiveCMA", false);
        setIntField(term964, term964.getClass(), "checkFeasableCount", 0);
        setField(term964, term964.getClass(), "inputSigma", null);
        setIntField(term964, term964.getClass(), "dimension", 0);
        setIntField(term964, term964.getClass(), "diagonalOnly", 0);
        setBooleanField(term964, term964.getClass(), "isMinimize", false);
        setBooleanField(term964, term964.getClass(), "generateStatistics", false);
        setIntField(term964, term964.getClass(), "maxIterations", 0);
        setDoubleField(term964, term964.getClass(), "stopFitness", 0.0);
        setDoubleField(term964, term964.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term964, term964.getClass(), "stopTolX", 0.0);
        setDoubleField(term964, term964.getClass(), "stopTolFun", 0.0);
        setDoubleField(term964, term964.getClass(), "stopTolHistFun", 0.0);
        setIntField(term964, term964.getClass(), "mu", 0);
        setDoubleField(term964, term964.getClass(), "logMu2", 0.0);
        setField(term964, term964.getClass(), "weights", null);
        setDoubleField(term964, term964.getClass(), "mueff", 0.0);
        setDoubleField(term964, term964.getClass(), "sigma", 0.0);
        setDoubleField(term964, term964.getClass(), "cc", 0.0);
        setDoubleField(term964, term964.getClass(), "cs", 0.0);
        setDoubleField(term964, term964.getClass(), "damps", 0.0);
        setDoubleField(term964, term964.getClass(), "ccov1", 0.0);
        setDoubleField(term964, term964.getClass(), "ccovmu", 0.0);
        setDoubleField(term964, term964.getClass(), "chiN", 0.0);
        setDoubleField(term964, term964.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term964, term964.getClass(), "ccovmuSep", 0.0);
        setField(term964, term964.getClass(), "xmean", null);
        setField(term964, term964.getClass(), "pc", null);
        setField(term964, term964.getClass(), "ps", null);
        setDoubleField(term964, term964.getClass(), "normps", 0.0);
        setField(term964, term964.getClass(), "B", null);
        setField(term964, term964.getClass(), "D", null);
        setField(term964, term964.getClass(), "BD", null);
        setField(term964, term964.getClass(), "diagD", null);
        setField(term964, term964.getClass(), "C", null);
        setField(term964, term964.getClass(), "diagC", null);
        setIntField(term964, term964.getClass(), "iterations", 0);
        setField(term964, term964.getClass(), "fitnessHistory", null);
        setIntField(term964, term964.getClass(), "historySize", 0);
        setField(term964, term964.getClass(), "random", null);
        setField(term964, term964.getClass(), "statisticsSigmaHistory", null);
        setField(term964, term964.getClass(), "statisticsMeanHistory", null);
        setField(term964, term964.getClass(), "statisticsFitnessHistory", null);
        setField(term964, term964.getClass(), "statisticsDHistory", null);
        setField(term964, term964.getClass(), "function", null);
        setField(term964, term964.getClass(), "goal", null);
        setField(term964, term964.getClass(), "start", null);
        setField(term964, term964.getClass(), "lowerBound", null);
        setField(term964, term964.getClass(), "upperBound", null);
        setField(term964, term964.getClass(), "evaluations", null);
        setField(term964, term964.getClass(), "iterations", null);
        setField(term964, term964.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doOptimize", argTypes, term964, args);
    }

};


