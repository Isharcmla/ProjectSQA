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

public class CMAESOptimizer_getStatisticsFitnessHistory_3783347073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91;

    public CMAESOptimizer_getStatisticsFitnessHistory_3783347073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] term95 = (double[]) newDoubleArray(3);
        setIntField(term91, term91.getClass(), "lambda", 597278769);
        setBooleanField(term91, term91.getClass(), "isActiveCMA", false);
        setIntField(term91, term91.getClass(), "checkFeasableCount", -1685132342);
        setDoubleElement(term95, 0, 0.25937345430928016);
        setDoubleElement(term95, 1, 0.5873228247510078);
        setDoubleElement(term95, 2, 0.8823181080774973);
        setField(term91, term91.getClass(), "inputSigma", term95);
        setIntField(term91, term91.getClass(), "dimension", -1456670397);
        setIntField(term91, term91.getClass(), "diagonalOnly", 1622346318);
        setBooleanField(term91, term91.getClass(), "isMinimize", true);
        setBooleanField(term91, term91.getClass(), "generateStatistics", false);
        setIntField(term91, term91.getClass(), "maxIterations", 1048535127);
        setDoubleField(term91, term91.getClass(), "stopFitness", 0.2192450926212024);
        setDoubleField(term91, term91.getClass(), "stopTolUpX", 0.7591353014991907);
        setDoubleField(term91, term91.getClass(), "stopTolX", 0.791695029600875);
        setDoubleField(term91, term91.getClass(), "stopTolFun", 0.6862221294683138);
        setDoubleField(term91, term91.getClass(), "stopTolHistFun", 0.15917839663695388);
        setIntField(term91, term91.getClass(), "mu", -655067527);
        setDoubleField(term91, term91.getClass(), "logMu2", 0.9374115574082594);
        setField(term91, term91.getClass(), "weights", null);
        setDoubleField(term91, term91.getClass(), "mueff", 0.8454723071922143);
        setDoubleField(term91, term91.getClass(), "sigma", 0.8566567697571895);
        setDoubleField(term91, term91.getClass(), "cc", 0.9203805380592256);
        setDoubleField(term91, term91.getClass(), "cs", 0.5804948995371725);
        setDoubleField(term91, term91.getClass(), "damps", 0.20737514139742264);
        setDoubleField(term91, term91.getClass(), "ccov1", 0.7919370314903882);
        setDoubleField(term91, term91.getClass(), "ccovmu", 0.2109867221632754);
        setDoubleField(term91, term91.getClass(), "chiN", 0.3227335400819148);
        setDoubleField(term91, term91.getClass(), "ccov1Sep", 0.43337207054070237);
        setDoubleField(term91, term91.getClass(), "ccovmuSep", 0.13246999699526574);
        setField(term91, term91.getClass(), "xmean", null);
        setField(term91, term91.getClass(), "pc", null);
        setField(term91, term91.getClass(), "ps", null);
        setDoubleField(term91, term91.getClass(), "normps", 0.9126850255993704);
        setField(term91, term91.getClass(), "B", null);
        setField(term91, term91.getClass(), "D", null);
        setField(term91, term91.getClass(), "BD", null);
        setField(term91, term91.getClass(), "diagD", null);
        setField(term91, term91.getClass(), "C", null);
        setField(term91, term91.getClass(), "diagC", null);
        setIntField(term91, term91.getClass(), "iterations", 0);
        setField(term91, term91.getClass(), "fitnessHistory", null);
        setIntField(term91, term91.getClass(), "historySize", 0);
        setField(term91, term91.getClass(), "random", null);
        setField(term91, term91.getClass(), "statisticsSigmaHistory", null);
        setField(term91, term91.getClass(), "statisticsMeanHistory", null);
        setField(term91, term91.getClass(), "statisticsFitnessHistory", null);
        setField(term91, term91.getClass(), "statisticsDHistory", null);
        setField(term91, term91.getClass(), "function", null);
        setField(term91, term91.getClass(), "goal", null);
        setField(term91, term91.getClass(), "start", null);
        setField(term91, term91.getClass(), "lowerBound", null);
        setField(term91, term91.getClass(), "upperBound", null);
        setField(term91, term91.getClass(), "evaluations", null);
        setField(term91, term91.getClass(), "iterations", null);
        setField(term91, term91.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatisticsFitnessHistory", argTypes, term91, args);
    }

};


