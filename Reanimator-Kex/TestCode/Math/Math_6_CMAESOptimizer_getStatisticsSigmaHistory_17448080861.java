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

public class CMAESOptimizer_getStatisticsSigmaHistory_17448080861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;

    public CMAESOptimizer_getStatisticsSigmaHistory_17448080861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] term17 = (double[]) newDoubleArray(5);
        setIntField(term13, term13.getClass(), "lambda", 391863371);
        setBooleanField(term13, term13.getClass(), "isActiveCMA", false);
        setIntField(term13, term13.getClass(), "checkFeasableCount", -1922583790);
        setDoubleElement(term17, 0, 0.3455959125047594);
        setDoubleElement(term17, 1, 0.5523635872663106);
        setDoubleElement(term17, 2, 0.544608645520025);
        setDoubleElement(term17, 3, 0.28570734989730284);
        setDoubleElement(term17, 4, 0.40176586625454525);
        setField(term13, term13.getClass(), "inputSigma", term17);
        setIntField(term13, term13.getClass(), "dimension", -616727354);
        setIntField(term13, term13.getClass(), "diagonalOnly", -1955890973);
        setBooleanField(term13, term13.getClass(), "isMinimize", false);
        setBooleanField(term13, term13.getClass(), "generateStatistics", true);
        setIntField(term13, term13.getClass(), "maxIterations", -2038273078);
        setDoubleField(term13, term13.getClass(), "stopFitness", 0.2641345529914265);
        setDoubleField(term13, term13.getClass(), "stopTolUpX", 0.36923381893433327);
        setDoubleField(term13, term13.getClass(), "stopTolX", 0.6076495596892013);
        setDoubleField(term13, term13.getClass(), "stopTolFun", 0.37773193782763337);
        setDoubleField(term13, term13.getClass(), "stopTolHistFun", 0.8474802076607362);
        setIntField(term13, term13.getClass(), "mu", 1227103734);
        setDoubleField(term13, term13.getClass(), "logMu2", 0.5183269973490326);
        setField(term13, term13.getClass(), "weights", null);
        setDoubleField(term13, term13.getClass(), "mueff", 0.7655020693602768);
        setDoubleField(term13, term13.getClass(), "sigma", 0.1374549299694151);
        setDoubleField(term13, term13.getClass(), "cc", 0.7031006357544823);
        setDoubleField(term13, term13.getClass(), "cs", 0.9527281779865117);
        setDoubleField(term13, term13.getClass(), "damps", 0.9828442029246764);
        setDoubleField(term13, term13.getClass(), "ccov1", 0.2779719046761513);
        setDoubleField(term13, term13.getClass(), "ccovmu", 0.6436713023569729);
        setDoubleField(term13, term13.getClass(), "chiN", 0.7332741045694002);
        setDoubleField(term13, term13.getClass(), "ccov1Sep", 0.4569171842750229);
        setDoubleField(term13, term13.getClass(), "ccovmuSep", 0.8598297828918529);
        setField(term13, term13.getClass(), "xmean", null);
        setField(term13, term13.getClass(), "pc", null);
        setField(term13, term13.getClass(), "ps", null);
        setDoubleField(term13, term13.getClass(), "normps", 0.43692187681405226);
        setField(term13, term13.getClass(), "B", null);
        setField(term13, term13.getClass(), "D", null);
        setField(term13, term13.getClass(), "BD", null);
        setField(term13, term13.getClass(), "diagD", null);
        setField(term13, term13.getClass(), "C", null);
        setField(term13, term13.getClass(), "diagC", null);
        setIntField(term13, term13.getClass(), "iterations", 0);
        setField(term13, term13.getClass(), "fitnessHistory", null);
        setIntField(term13, term13.getClass(), "historySize", 0);
        setField(term13, term13.getClass(), "random", null);
        setField(term13, term13.getClass(), "statisticsSigmaHistory", null);
        setField(term13, term13.getClass(), "statisticsMeanHistory", null);
        setField(term13, term13.getClass(), "statisticsFitnessHistory", null);
        setField(term13, term13.getClass(), "statisticsDHistory", null);
        setField(term13, term13.getClass(), "function", null);
        setField(term13, term13.getClass(), "goal", null);
        setField(term13, term13.getClass(), "start", null);
        setField(term13, term13.getClass(), "lowerBound", null);
        setField(term13, term13.getClass(), "upperBound", null);
        setField(term13, term13.getClass(), "evaluations", null);
        setField(term13, term13.getClass(), "iterations", null);
        setField(term13, term13.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatisticsSigmaHistory", argTypes, term13, args);
    }

};


