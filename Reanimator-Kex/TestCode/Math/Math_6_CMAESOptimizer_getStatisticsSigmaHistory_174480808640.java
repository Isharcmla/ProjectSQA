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

public class CMAESOptimizer_getStatisticsSigmaHistory_174480808640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term819;

    public CMAESOptimizer_getStatisticsSigmaHistory_174480808640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term819 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setIntField(term819, term819.getClass(), "lambda", 0);
        setBooleanField(term819, term819.getClass(), "isActiveCMA", false);
        setIntField(term819, term819.getClass(), "checkFeasableCount", 0);
        setField(term819, term819.getClass(), "inputSigma", null);
        setIntField(term819, term819.getClass(), "dimension", 0);
        setIntField(term819, term819.getClass(), "diagonalOnly", 0);
        setBooleanField(term819, term819.getClass(), "isMinimize", false);
        setBooleanField(term819, term819.getClass(), "generateStatistics", false);
        setIntField(term819, term819.getClass(), "maxIterations", 0);
        setDoubleField(term819, term819.getClass(), "stopFitness", 0.0);
        setDoubleField(term819, term819.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term819, term819.getClass(), "stopTolX", 0.0);
        setDoubleField(term819, term819.getClass(), "stopTolFun", 0.0);
        setDoubleField(term819, term819.getClass(), "stopTolHistFun", 0.0);
        setIntField(term819, term819.getClass(), "mu", 0);
        setDoubleField(term819, term819.getClass(), "logMu2", 0.0);
        setField(term819, term819.getClass(), "weights", null);
        setDoubleField(term819, term819.getClass(), "mueff", 0.0);
        setDoubleField(term819, term819.getClass(), "sigma", 0.0);
        setDoubleField(term819, term819.getClass(), "cc", 0.0);
        setDoubleField(term819, term819.getClass(), "cs", 0.0);
        setDoubleField(term819, term819.getClass(), "damps", 0.0);
        setDoubleField(term819, term819.getClass(), "ccov1", 0.0);
        setDoubleField(term819, term819.getClass(), "ccovmu", 0.0);
        setDoubleField(term819, term819.getClass(), "chiN", 0.0);
        setDoubleField(term819, term819.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term819, term819.getClass(), "ccovmuSep", 0.0);
        setField(term819, term819.getClass(), "xmean", null);
        setField(term819, term819.getClass(), "pc", null);
        setField(term819, term819.getClass(), "ps", null);
        setDoubleField(term819, term819.getClass(), "normps", 0.0);
        setField(term819, term819.getClass(), "B", null);
        setField(term819, term819.getClass(), "D", null);
        setField(term819, term819.getClass(), "BD", null);
        setField(term819, term819.getClass(), "diagD", null);
        setField(term819, term819.getClass(), "C", null);
        setField(term819, term819.getClass(), "diagC", null);
        setIntField(term819, term819.getClass(), "iterations", 0);
        setField(term819, term819.getClass(), "fitnessHistory", null);
        setIntField(term819, term819.getClass(), "historySize", 0);
        setField(term819, term819.getClass(), "random", null);
        setField(term819, term819.getClass(), "statisticsSigmaHistory", null);
        setField(term819, term819.getClass(), "statisticsMeanHistory", null);
        setField(term819, term819.getClass(), "statisticsFitnessHistory", null);
        setField(term819, term819.getClass(), "statisticsDHistory", null);
        setField(term819, term819.getClass(), "function", null);
        setField(term819, term819.getClass(), "goal", null);
        setField(term819, term819.getClass(), "start", null);
        setField(term819, term819.getClass(), "lowerBound", null);
        setField(term819, term819.getClass(), "upperBound", null);
        setField(term819, term819.getClass(), "evaluations", null);
        setField(term819, term819.getClass(), "iterations", null);
        setField(term819, term819.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatisticsSigmaHistory", argTypes, term819, args);
    }

};


