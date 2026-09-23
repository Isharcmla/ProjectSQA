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

public class CMAESOptimizer_max_62569395170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6418;

    public CMAESOptimizer_max_62569395170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6418 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setIntField(term6418, term6418.getClass(), "lambda", 0);
        setBooleanField(term6418, term6418.getClass(), "isActiveCMA", false);
        setIntField(term6418, term6418.getClass(), "checkFeasableCount", 0);
        setField(term6418, term6418.getClass(), "inputSigma", null);
        setIntField(term6418, term6418.getClass(), "dimension", 0);
        setIntField(term6418, term6418.getClass(), "diagonalOnly", 0);
        setBooleanField(term6418, term6418.getClass(), "isMinimize", false);
        setBooleanField(term6418, term6418.getClass(), "generateStatistics", false);
        setIntField(term6418, term6418.getClass(), "maxIterations", 0);
        setDoubleField(term6418, term6418.getClass(), "stopFitness", 0.0);
        setDoubleField(term6418, term6418.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term6418, term6418.getClass(), "stopTolX", 0.0);
        setDoubleField(term6418, term6418.getClass(), "stopTolFun", 0.0);
        setDoubleField(term6418, term6418.getClass(), "stopTolHistFun", 0.0);
        setIntField(term6418, term6418.getClass(), "mu", 0);
        setDoubleField(term6418, term6418.getClass(), "logMu2", 0.0);
        setField(term6418, term6418.getClass(), "weights", null);
        setDoubleField(term6418, term6418.getClass(), "mueff", 0.0);
        setDoubleField(term6418, term6418.getClass(), "sigma", 0.0);
        setDoubleField(term6418, term6418.getClass(), "cc", 0.0);
        setDoubleField(term6418, term6418.getClass(), "cs", 0.0);
        setDoubleField(term6418, term6418.getClass(), "damps", 0.0);
        setDoubleField(term6418, term6418.getClass(), "ccov1", 0.0);
        setDoubleField(term6418, term6418.getClass(), "ccovmu", 0.0);
        setDoubleField(term6418, term6418.getClass(), "chiN", 0.0);
        setDoubleField(term6418, term6418.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term6418, term6418.getClass(), "ccovmuSep", 0.0);
        setField(term6418, term6418.getClass(), "xmean", null);
        setField(term6418, term6418.getClass(), "pc", null);
        setField(term6418, term6418.getClass(), "ps", null);
        setDoubleField(term6418, term6418.getClass(), "normps", 0.0);
        setField(term6418, term6418.getClass(), "B", null);
        setField(term6418, term6418.getClass(), "D", null);
        setField(term6418, term6418.getClass(), "BD", null);
        setField(term6418, term6418.getClass(), "diagD", null);
        setField(term6418, term6418.getClass(), "C", null);
        setField(term6418, term6418.getClass(), "diagC", null);
        setIntField(term6418, term6418.getClass(), "iterations", 0);
        setField(term6418, term6418.getClass(), "fitnessHistory", null);
        setIntField(term6418, term6418.getClass(), "historySize", 0);
        setField(term6418, term6418.getClass(), "random", null);
        setField(term6418, term6418.getClass(), "statisticsSigmaHistory", null);
        setField(term6418, term6418.getClass(), "statisticsMeanHistory", null);
        setField(term6418, term6418.getClass(), "statisticsFitnessHistory", null);
        setField(term6418, term6418.getClass(), "statisticsDHistory", null);
        setField(term6418, term6418.getClass(), "function", null);
        setField(term6418, term6418.getClass(), "goal", null);
        setField(term6418, term6418.getClass(), "start", null);
        setField(term6418, term6418.getClass(), "lowerBound", null);
        setField(term6418, term6418.getClass(), "upperBound", null);
        setField(term6418, term6418.getClass(), "evaluations", null);
        setField(term6418, term6418.getClass(), "iterations", null);
        setField(term6418, term6418.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "max", argTypes, term6418, args);
    }

};


