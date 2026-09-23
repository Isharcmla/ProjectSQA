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

public class CMAESOptimizer_getStatisticsMeanHistory_165049264441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term848;

    public CMAESOptimizer_getStatisticsMeanHistory_165049264441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term848 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setIntField(term848, term848.getClass(), "lambda", 0);
        setBooleanField(term848, term848.getClass(), "isActiveCMA", false);
        setIntField(term848, term848.getClass(), "checkFeasableCount", 0);
        setField(term848, term848.getClass(), "inputSigma", null);
        setIntField(term848, term848.getClass(), "dimension", 0);
        setIntField(term848, term848.getClass(), "diagonalOnly", 0);
        setBooleanField(term848, term848.getClass(), "isMinimize", false);
        setBooleanField(term848, term848.getClass(), "generateStatistics", false);
        setIntField(term848, term848.getClass(), "maxIterations", 0);
        setDoubleField(term848, term848.getClass(), "stopFitness", 0.0);
        setDoubleField(term848, term848.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term848, term848.getClass(), "stopTolX", 0.0);
        setDoubleField(term848, term848.getClass(), "stopTolFun", 0.0);
        setDoubleField(term848, term848.getClass(), "stopTolHistFun", 0.0);
        setIntField(term848, term848.getClass(), "mu", 0);
        setDoubleField(term848, term848.getClass(), "logMu2", 0.0);
        setField(term848, term848.getClass(), "weights", null);
        setDoubleField(term848, term848.getClass(), "mueff", 0.0);
        setDoubleField(term848, term848.getClass(), "sigma", 0.0);
        setDoubleField(term848, term848.getClass(), "cc", 0.0);
        setDoubleField(term848, term848.getClass(), "cs", 0.0);
        setDoubleField(term848, term848.getClass(), "damps", 0.0);
        setDoubleField(term848, term848.getClass(), "ccov1", 0.0);
        setDoubleField(term848, term848.getClass(), "ccovmu", 0.0);
        setDoubleField(term848, term848.getClass(), "chiN", 0.0);
        setDoubleField(term848, term848.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term848, term848.getClass(), "ccovmuSep", 0.0);
        setField(term848, term848.getClass(), "xmean", null);
        setField(term848, term848.getClass(), "pc", null);
        setField(term848, term848.getClass(), "ps", null);
        setDoubleField(term848, term848.getClass(), "normps", 0.0);
        setField(term848, term848.getClass(), "B", null);
        setField(term848, term848.getClass(), "D", null);
        setField(term848, term848.getClass(), "BD", null);
        setField(term848, term848.getClass(), "diagD", null);
        setField(term848, term848.getClass(), "C", null);
        setField(term848, term848.getClass(), "diagC", null);
        setIntField(term848, term848.getClass(), "iterations", 0);
        setField(term848, term848.getClass(), "fitnessHistory", null);
        setIntField(term848, term848.getClass(), "historySize", 0);
        setField(term848, term848.getClass(), "random", null);
        setField(term848, term848.getClass(), "statisticsSigmaHistory", null);
        setField(term848, term848.getClass(), "statisticsMeanHistory", null);
        setField(term848, term848.getClass(), "statisticsFitnessHistory", null);
        setField(term848, term848.getClass(), "statisticsDHistory", null);
        setField(term848, term848.getClass(), "function", null);
        setField(term848, term848.getClass(), "goal", null);
        setField(term848, term848.getClass(), "start", null);
        setField(term848, term848.getClass(), "lowerBound", null);
        setField(term848, term848.getClass(), "upperBound", null);
        setField(term848, term848.getClass(), "evaluations", null);
        setField(term848, term848.getClass(), "iterations", null);
        setField(term848, term848.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatisticsMeanHistory", argTypes, term848, args);
    }

};


