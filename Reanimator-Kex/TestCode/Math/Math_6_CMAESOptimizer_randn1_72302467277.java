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
import java.lang.Integer;

public class CMAESOptimizer_randn1_72302467277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7191;
     Object term7220;
     Object term7222;

    public CMAESOptimizer_randn1_72302467277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7191 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setIntField(term7191, term7191.getClass(), "lambda", 0);
        setBooleanField(term7191, term7191.getClass(), "isActiveCMA", false);
        setIntField(term7191, term7191.getClass(), "checkFeasableCount", 0);
        setField(term7191, term7191.getClass(), "inputSigma", null);
        setIntField(term7191, term7191.getClass(), "dimension", 0);
        setIntField(term7191, term7191.getClass(), "diagonalOnly", 0);
        setBooleanField(term7191, term7191.getClass(), "isMinimize", false);
        setBooleanField(term7191, term7191.getClass(), "generateStatistics", false);
        setIntField(term7191, term7191.getClass(), "maxIterations", 0);
        setDoubleField(term7191, term7191.getClass(), "stopFitness", 0.0);
        setDoubleField(term7191, term7191.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term7191, term7191.getClass(), "stopTolX", 0.0);
        setDoubleField(term7191, term7191.getClass(), "stopTolFun", 0.0);
        setDoubleField(term7191, term7191.getClass(), "stopTolHistFun", 0.0);
        setIntField(term7191, term7191.getClass(), "mu", 0);
        setDoubleField(term7191, term7191.getClass(), "logMu2", 0.0);
        setField(term7191, term7191.getClass(), "weights", null);
        setDoubleField(term7191, term7191.getClass(), "mueff", 0.0);
        setDoubleField(term7191, term7191.getClass(), "sigma", 0.0);
        setDoubleField(term7191, term7191.getClass(), "cc", 0.0);
        setDoubleField(term7191, term7191.getClass(), "cs", 0.0);
        setDoubleField(term7191, term7191.getClass(), "damps", 0.0);
        setDoubleField(term7191, term7191.getClass(), "ccov1", 0.0);
        setDoubleField(term7191, term7191.getClass(), "ccovmu", 0.0);
        setDoubleField(term7191, term7191.getClass(), "chiN", 0.0);
        setDoubleField(term7191, term7191.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term7191, term7191.getClass(), "ccovmuSep", 0.0);
        setField(term7191, term7191.getClass(), "xmean", null);
        setField(term7191, term7191.getClass(), "pc", null);
        setField(term7191, term7191.getClass(), "ps", null);
        setDoubleField(term7191, term7191.getClass(), "normps", 0.0);
        setField(term7191, term7191.getClass(), "B", null);
        setField(term7191, term7191.getClass(), "D", null);
        setField(term7191, term7191.getClass(), "BD", null);
        setField(term7191, term7191.getClass(), "diagD", null);
        setField(term7191, term7191.getClass(), "C", null);
        setField(term7191, term7191.getClass(), "diagC", null);
        setIntField(term7191, term7191.getClass(), "iterations", 0);
        setField(term7191, term7191.getClass(), "fitnessHistory", null);
        setIntField(term7191, term7191.getClass(), "historySize", 0);
        setField(term7191, term7191.getClass(), "random", null);
        setField(term7191, term7191.getClass(), "statisticsSigmaHistory", null);
        setField(term7191, term7191.getClass(), "statisticsMeanHistory", null);
        setField(term7191, term7191.getClass(), "statisticsFitnessHistory", null);
        setField(term7191, term7191.getClass(), "statisticsDHistory", null);
        setField(term7191, term7191.getClass(), "function", null);
        setField(term7191, term7191.getClass(), "goal", null);
        setField(term7191, term7191.getClass(), "start", null);
        setField(term7191, term7191.getClass(), "lowerBound", null);
        setField(term7191, term7191.getClass(), "upperBound", null);
        setField(term7191, term7191.getClass(), "evaluations", null);
        setField(term7191, term7191.getClass(), "iterations", null);
        setField(term7191, term7191.getClass(), "checker", null);
        term7220 = new Integer(0);
        term7222 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term7220;
        args[1] = term7222;
        callMethod(klass, "randn1", argTypes, term7191, args);
    }

};


