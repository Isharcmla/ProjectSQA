package org.apache.commons.math3.optimization.direct;

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
import static org.apache.commons.math3.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CMAESOptimizer_min_147790982677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47314;

    public CMAESOptimizer_min_147790982677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47314 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setIntField(term47314, term47314.getClass(), "lambda", 0);
        setBooleanField(term47314, term47314.getClass(), "isActiveCMA", false);
        setIntField(term47314, term47314.getClass(), "checkFeasableCount", 0);
        setField(term47314, term47314.getClass(), "boundaries", null);
        setField(term47314, term47314.getClass(), "inputSigma", null);
        setIntField(term47314, term47314.getClass(), "dimension", 0);
        setIntField(term47314, term47314.getClass(), "diagonalOnly", 0);
        setBooleanField(term47314, term47314.getClass(), "isMinimize", false);
        setBooleanField(term47314, term47314.getClass(), "generateStatistics", false);
        setIntField(term47314, term47314.getClass(), "maxIterations", 0);
        setDoubleField(term47314, term47314.getClass(), "stopFitness", 0.0);
        setDoubleField(term47314, term47314.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term47314, term47314.getClass(), "stopTolX", 0.0);
        setDoubleField(term47314, term47314.getClass(), "stopTolFun", 0.0);
        setDoubleField(term47314, term47314.getClass(), "stopTolHistFun", 0.0);
        setIntField(term47314, term47314.getClass(), "mu", 0);
        setDoubleField(term47314, term47314.getClass(), "logMu2", 0.0);
        setField(term47314, term47314.getClass(), "weights", null);
        setDoubleField(term47314, term47314.getClass(), "mueff", 0.0);
        setDoubleField(term47314, term47314.getClass(), "sigma", 0.0);
        setDoubleField(term47314, term47314.getClass(), "cc", 0.0);
        setDoubleField(term47314, term47314.getClass(), "cs", 0.0);
        setDoubleField(term47314, term47314.getClass(), "damps", 0.0);
        setDoubleField(term47314, term47314.getClass(), "ccov1", 0.0);
        setDoubleField(term47314, term47314.getClass(), "ccovmu", 0.0);
        setDoubleField(term47314, term47314.getClass(), "chiN", 0.0);
        setDoubleField(term47314, term47314.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term47314, term47314.getClass(), "ccovmuSep", 0.0);
        setField(term47314, term47314.getClass(), "xmean", null);
        setField(term47314, term47314.getClass(), "pc", null);
        setField(term47314, term47314.getClass(), "ps", null);
        setDoubleField(term47314, term47314.getClass(), "normps", 0.0);
        setField(term47314, term47314.getClass(), "B", null);
        setField(term47314, term47314.getClass(), "D", null);
        setField(term47314, term47314.getClass(), "BD", null);
        setField(term47314, term47314.getClass(), "diagD", null);
        setField(term47314, term47314.getClass(), "C", null);
        setField(term47314, term47314.getClass(), "diagC", null);
        setIntField(term47314, term47314.getClass(), "iterations", 0);
        setField(term47314, term47314.getClass(), "fitnessHistory", null);
        setIntField(term47314, term47314.getClass(), "historySize", 0);
        setField(term47314, term47314.getClass(), "random", null);
        setField(term47314, term47314.getClass(), "statisticsSigmaHistory", null);
        setField(term47314, term47314.getClass(), "statisticsMeanHistory", null);
        setField(term47314, term47314.getClass(), "statisticsFitnessHistory", null);
        setField(term47314, term47314.getClass(), "statisticsDHistory", null);
        setField(term47314, term47314.getClass(), "lowerBound", null);
        setField(term47314, term47314.getClass(), "upperBound", null);
        setField(term47314, term47314.getClass(), "evaluations", null);
        setField(term47314, term47314.getClass(), "checker", null);
        setField(term47314, term47314.getClass(), "goal", null);
        setField(term47314, term47314.getClass(), "start", null);
        setField(term47314, term47314.getClass(), "function", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "min", argTypes, term47314, args);
    }

};


