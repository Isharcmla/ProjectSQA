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

public class CMAESOptimizer_updateEvolutionPaths_7572562049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1080;

    public CMAESOptimizer_updateEvolutionPaths_7572562049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1080 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setIntField(term1080, term1080.getClass(), "lambda", 0);
        setBooleanField(term1080, term1080.getClass(), "isActiveCMA", false);
        setIntField(term1080, term1080.getClass(), "checkFeasableCount", 0);
        setField(term1080, term1080.getClass(), "inputSigma", null);
        setIntField(term1080, term1080.getClass(), "dimension", 0);
        setIntField(term1080, term1080.getClass(), "diagonalOnly", 0);
        setBooleanField(term1080, term1080.getClass(), "isMinimize", false);
        setBooleanField(term1080, term1080.getClass(), "generateStatistics", false);
        setIntField(term1080, term1080.getClass(), "maxIterations", 0);
        setDoubleField(term1080, term1080.getClass(), "stopFitness", 0.0);
        setDoubleField(term1080, term1080.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term1080, term1080.getClass(), "stopTolX", 0.0);
        setDoubleField(term1080, term1080.getClass(), "stopTolFun", 0.0);
        setDoubleField(term1080, term1080.getClass(), "stopTolHistFun", 0.0);
        setIntField(term1080, term1080.getClass(), "mu", 0);
        setDoubleField(term1080, term1080.getClass(), "logMu2", 0.0);
        setField(term1080, term1080.getClass(), "weights", null);
        setDoubleField(term1080, term1080.getClass(), "mueff", 0.0);
        setDoubleField(term1080, term1080.getClass(), "sigma", 0.0);
        setDoubleField(term1080, term1080.getClass(), "cc", 0.0);
        setDoubleField(term1080, term1080.getClass(), "cs", 0.0);
        setDoubleField(term1080, term1080.getClass(), "damps", 0.0);
        setDoubleField(term1080, term1080.getClass(), "ccov1", 0.0);
        setDoubleField(term1080, term1080.getClass(), "ccovmu", 0.0);
        setDoubleField(term1080, term1080.getClass(), "chiN", 0.0);
        setDoubleField(term1080, term1080.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term1080, term1080.getClass(), "ccovmuSep", 0.0);
        setField(term1080, term1080.getClass(), "xmean", null);
        setField(term1080, term1080.getClass(), "pc", null);
        setField(term1080, term1080.getClass(), "ps", null);
        setDoubleField(term1080, term1080.getClass(), "normps", 0.0);
        setField(term1080, term1080.getClass(), "B", null);
        setField(term1080, term1080.getClass(), "D", null);
        setField(term1080, term1080.getClass(), "BD", null);
        setField(term1080, term1080.getClass(), "diagD", null);
        setField(term1080, term1080.getClass(), "C", null);
        setField(term1080, term1080.getClass(), "diagC", null);
        setIntField(term1080, term1080.getClass(), "iterations", 0);
        setField(term1080, term1080.getClass(), "fitnessHistory", null);
        setIntField(term1080, term1080.getClass(), "historySize", 0);
        setField(term1080, term1080.getClass(), "random", null);
        setField(term1080, term1080.getClass(), "statisticsSigmaHistory", null);
        setField(term1080, term1080.getClass(), "statisticsMeanHistory", null);
        setField(term1080, term1080.getClass(), "statisticsFitnessHistory", null);
        setField(term1080, term1080.getClass(), "statisticsDHistory", null);
        setField(term1080, term1080.getClass(), "function", null);
        setField(term1080, term1080.getClass(), "goal", null);
        setField(term1080, term1080.getClass(), "start", null);
        setField(term1080, term1080.getClass(), "lowerBound", null);
        setField(term1080, term1080.getClass(), "upperBound", null);
        setField(term1080, term1080.getClass(), "evaluations", null);
        setField(term1080, term1080.getClass(), "iterations", null);
        setField(term1080, term1080.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[1] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "updateEvolutionPaths", argTypes, term1080, args);
    }

};


