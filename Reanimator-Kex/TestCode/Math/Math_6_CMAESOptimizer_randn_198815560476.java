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

public class CMAESOptimizer_randn_198815560476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7160;
     Object term7189;

    public CMAESOptimizer_randn_198815560476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7160 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setIntField(term7160, term7160.getClass(), "lambda", 0);
        setBooleanField(term7160, term7160.getClass(), "isActiveCMA", false);
        setIntField(term7160, term7160.getClass(), "checkFeasableCount", 0);
        setField(term7160, term7160.getClass(), "inputSigma", null);
        setIntField(term7160, term7160.getClass(), "dimension", 0);
        setIntField(term7160, term7160.getClass(), "diagonalOnly", 0);
        setBooleanField(term7160, term7160.getClass(), "isMinimize", false);
        setBooleanField(term7160, term7160.getClass(), "generateStatistics", false);
        setIntField(term7160, term7160.getClass(), "maxIterations", 0);
        setDoubleField(term7160, term7160.getClass(), "stopFitness", 0.0);
        setDoubleField(term7160, term7160.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term7160, term7160.getClass(), "stopTolX", 0.0);
        setDoubleField(term7160, term7160.getClass(), "stopTolFun", 0.0);
        setDoubleField(term7160, term7160.getClass(), "stopTolHistFun", 0.0);
        setIntField(term7160, term7160.getClass(), "mu", 0);
        setDoubleField(term7160, term7160.getClass(), "logMu2", 0.0);
        setField(term7160, term7160.getClass(), "weights", null);
        setDoubleField(term7160, term7160.getClass(), "mueff", 0.0);
        setDoubleField(term7160, term7160.getClass(), "sigma", 0.0);
        setDoubleField(term7160, term7160.getClass(), "cc", 0.0);
        setDoubleField(term7160, term7160.getClass(), "cs", 0.0);
        setDoubleField(term7160, term7160.getClass(), "damps", 0.0);
        setDoubleField(term7160, term7160.getClass(), "ccov1", 0.0);
        setDoubleField(term7160, term7160.getClass(), "ccovmu", 0.0);
        setDoubleField(term7160, term7160.getClass(), "chiN", 0.0);
        setDoubleField(term7160, term7160.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term7160, term7160.getClass(), "ccovmuSep", 0.0);
        setField(term7160, term7160.getClass(), "xmean", null);
        setField(term7160, term7160.getClass(), "pc", null);
        setField(term7160, term7160.getClass(), "ps", null);
        setDoubleField(term7160, term7160.getClass(), "normps", 0.0);
        setField(term7160, term7160.getClass(), "B", null);
        setField(term7160, term7160.getClass(), "D", null);
        setField(term7160, term7160.getClass(), "BD", null);
        setField(term7160, term7160.getClass(), "diagD", null);
        setField(term7160, term7160.getClass(), "C", null);
        setField(term7160, term7160.getClass(), "diagC", null);
        setIntField(term7160, term7160.getClass(), "iterations", 0);
        setField(term7160, term7160.getClass(), "fitnessHistory", null);
        setIntField(term7160, term7160.getClass(), "historySize", 0);
        setField(term7160, term7160.getClass(), "random", null);
        setField(term7160, term7160.getClass(), "statisticsSigmaHistory", null);
        setField(term7160, term7160.getClass(), "statisticsMeanHistory", null);
        setField(term7160, term7160.getClass(), "statisticsFitnessHistory", null);
        setField(term7160, term7160.getClass(), "statisticsDHistory", null);
        setField(term7160, term7160.getClass(), "function", null);
        setField(term7160, term7160.getClass(), "goal", null);
        setField(term7160, term7160.getClass(), "start", null);
        setField(term7160, term7160.getClass(), "lowerBound", null);
        setField(term7160, term7160.getClass(), "upperBound", null);
        setField(term7160, term7160.getClass(), "evaluations", null);
        setField(term7160, term7160.getClass(), "iterations", null);
        setField(term7160, term7160.getClass(), "checker", null);
        term7189 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7189;
        callMethod(klass, "randn", argTypes, term7160, args);
    }

};


