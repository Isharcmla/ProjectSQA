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

public class CMAESOptimizer_min_16520714375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47230;

    public CMAESOptimizer_min_16520714375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47230 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setIntField(term47230, term47230.getClass(), "lambda", 0);
        setBooleanField(term47230, term47230.getClass(), "isActiveCMA", false);
        setIntField(term47230, term47230.getClass(), "checkFeasableCount", 0);
        setField(term47230, term47230.getClass(), "boundaries", null);
        setField(term47230, term47230.getClass(), "inputSigma", null);
        setIntField(term47230, term47230.getClass(), "dimension", 0);
        setIntField(term47230, term47230.getClass(), "diagonalOnly", 0);
        setBooleanField(term47230, term47230.getClass(), "isMinimize", false);
        setBooleanField(term47230, term47230.getClass(), "generateStatistics", false);
        setIntField(term47230, term47230.getClass(), "maxIterations", 0);
        setDoubleField(term47230, term47230.getClass(), "stopFitness", 0.0);
        setDoubleField(term47230, term47230.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term47230, term47230.getClass(), "stopTolX", 0.0);
        setDoubleField(term47230, term47230.getClass(), "stopTolFun", 0.0);
        setDoubleField(term47230, term47230.getClass(), "stopTolHistFun", 0.0);
        setIntField(term47230, term47230.getClass(), "mu", 0);
        setDoubleField(term47230, term47230.getClass(), "logMu2", 0.0);
        setField(term47230, term47230.getClass(), "weights", null);
        setDoubleField(term47230, term47230.getClass(), "mueff", 0.0);
        setDoubleField(term47230, term47230.getClass(), "sigma", 0.0);
        setDoubleField(term47230, term47230.getClass(), "cc", 0.0);
        setDoubleField(term47230, term47230.getClass(), "cs", 0.0);
        setDoubleField(term47230, term47230.getClass(), "damps", 0.0);
        setDoubleField(term47230, term47230.getClass(), "ccov1", 0.0);
        setDoubleField(term47230, term47230.getClass(), "ccovmu", 0.0);
        setDoubleField(term47230, term47230.getClass(), "chiN", 0.0);
        setDoubleField(term47230, term47230.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term47230, term47230.getClass(), "ccovmuSep", 0.0);
        setField(term47230, term47230.getClass(), "xmean", null);
        setField(term47230, term47230.getClass(), "pc", null);
        setField(term47230, term47230.getClass(), "ps", null);
        setDoubleField(term47230, term47230.getClass(), "normps", 0.0);
        setField(term47230, term47230.getClass(), "B", null);
        setField(term47230, term47230.getClass(), "D", null);
        setField(term47230, term47230.getClass(), "BD", null);
        setField(term47230, term47230.getClass(), "diagD", null);
        setField(term47230, term47230.getClass(), "C", null);
        setField(term47230, term47230.getClass(), "diagC", null);
        setIntField(term47230, term47230.getClass(), "iterations", 0);
        setField(term47230, term47230.getClass(), "fitnessHistory", null);
        setIntField(term47230, term47230.getClass(), "historySize", 0);
        setField(term47230, term47230.getClass(), "random", null);
        setField(term47230, term47230.getClass(), "statisticsSigmaHistory", null);
        setField(term47230, term47230.getClass(), "statisticsMeanHistory", null);
        setField(term47230, term47230.getClass(), "statisticsFitnessHistory", null);
        setField(term47230, term47230.getClass(), "statisticsDHistory", null);
        setField(term47230, term47230.getClass(), "lowerBound", null);
        setField(term47230, term47230.getClass(), "upperBound", null);
        setField(term47230, term47230.getClass(), "evaluations", null);
        setField(term47230, term47230.getClass(), "checker", null);
        setField(term47230, term47230.getClass(), "goal", null);
        setField(term47230, term47230.getClass(), "start", null);
        setField(term47230, term47230.getClass(), "function", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "min", argTypes, term47230, args);
    }

};


