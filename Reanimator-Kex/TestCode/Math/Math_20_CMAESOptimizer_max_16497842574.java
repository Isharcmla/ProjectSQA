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

public class CMAESOptimizer_max_16497842574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46953;

    public CMAESOptimizer_max_16497842574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46953 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setIntField(term46953, term46953.getClass(), "lambda", 0);
        setBooleanField(term46953, term46953.getClass(), "isActiveCMA", false);
        setIntField(term46953, term46953.getClass(), "checkFeasableCount", 0);
        setField(term46953, term46953.getClass(), "boundaries", null);
        setField(term46953, term46953.getClass(), "inputSigma", null);
        setIntField(term46953, term46953.getClass(), "dimension", 0);
        setIntField(term46953, term46953.getClass(), "diagonalOnly", 0);
        setBooleanField(term46953, term46953.getClass(), "isMinimize", false);
        setBooleanField(term46953, term46953.getClass(), "generateStatistics", false);
        setIntField(term46953, term46953.getClass(), "maxIterations", 0);
        setDoubleField(term46953, term46953.getClass(), "stopFitness", 0.0);
        setDoubleField(term46953, term46953.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term46953, term46953.getClass(), "stopTolX", 0.0);
        setDoubleField(term46953, term46953.getClass(), "stopTolFun", 0.0);
        setDoubleField(term46953, term46953.getClass(), "stopTolHistFun", 0.0);
        setIntField(term46953, term46953.getClass(), "mu", 0);
        setDoubleField(term46953, term46953.getClass(), "logMu2", 0.0);
        setField(term46953, term46953.getClass(), "weights", null);
        setDoubleField(term46953, term46953.getClass(), "mueff", 0.0);
        setDoubleField(term46953, term46953.getClass(), "sigma", 0.0);
        setDoubleField(term46953, term46953.getClass(), "cc", 0.0);
        setDoubleField(term46953, term46953.getClass(), "cs", 0.0);
        setDoubleField(term46953, term46953.getClass(), "damps", 0.0);
        setDoubleField(term46953, term46953.getClass(), "ccov1", 0.0);
        setDoubleField(term46953, term46953.getClass(), "ccovmu", 0.0);
        setDoubleField(term46953, term46953.getClass(), "chiN", 0.0);
        setDoubleField(term46953, term46953.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term46953, term46953.getClass(), "ccovmuSep", 0.0);
        setField(term46953, term46953.getClass(), "xmean", null);
        setField(term46953, term46953.getClass(), "pc", null);
        setField(term46953, term46953.getClass(), "ps", null);
        setDoubleField(term46953, term46953.getClass(), "normps", 0.0);
        setField(term46953, term46953.getClass(), "B", null);
        setField(term46953, term46953.getClass(), "D", null);
        setField(term46953, term46953.getClass(), "BD", null);
        setField(term46953, term46953.getClass(), "diagD", null);
        setField(term46953, term46953.getClass(), "C", null);
        setField(term46953, term46953.getClass(), "diagC", null);
        setIntField(term46953, term46953.getClass(), "iterations", 0);
        setField(term46953, term46953.getClass(), "fitnessHistory", null);
        setIntField(term46953, term46953.getClass(), "historySize", 0);
        setField(term46953, term46953.getClass(), "random", null);
        setField(term46953, term46953.getClass(), "statisticsSigmaHistory", null);
        setField(term46953, term46953.getClass(), "statisticsMeanHistory", null);
        setField(term46953, term46953.getClass(), "statisticsFitnessHistory", null);
        setField(term46953, term46953.getClass(), "statisticsDHistory", null);
        setField(term46953, term46953.getClass(), "lowerBound", null);
        setField(term46953, term46953.getClass(), "upperBound", null);
        setField(term46953, term46953.getClass(), "evaluations", null);
        setField(term46953, term46953.getClass(), "checker", null);
        setField(term46953, term46953.getClass(), "goal", null);
        setField(term46953, term46953.getClass(), "start", null);
        setField(term46953, term46953.getClass(), "function", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "max", argTypes, term46953, args);
    }

};


