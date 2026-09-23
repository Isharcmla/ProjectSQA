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

public class CMAESOptimizer_getStatisticsDHistory_9449466154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127;

    public CMAESOptimizer_getStatisticsDHistory_9449466154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] term131 = (double[]) newDoubleArray(4);
        setIntField(term127, term127.getClass(), "lambda", -6029667);
        setBooleanField(term127, term127.getClass(), "isActiveCMA", true);
        setIntField(term127, term127.getClass(), "checkFeasableCount", -2068769794);
        setDoubleElement(term131, 0, 0.11179067076100713);
        setDoubleElement(term131, 1, 0.5306473989087822);
        setDoubleElement(term131, 2, 0.022483645678509023);
        setDoubleElement(term131, 3, 0.025133051616627267);
        setField(term127, term127.getClass(), "inputSigma", term131);
        setIntField(term127, term127.getClass(), "dimension", -117576464);
        setIntField(term127, term127.getClass(), "diagonalOnly", -1007160944);
        setBooleanField(term127, term127.getClass(), "isMinimize", false);
        setBooleanField(term127, term127.getClass(), "generateStatistics", true);
        setIntField(term127, term127.getClass(), "maxIterations", 1135664017);
        setDoubleField(term127, term127.getClass(), "stopFitness", 0.016575281023182953);
        setDoubleField(term127, term127.getClass(), "stopTolUpX", 0.5308350402051779);
        setDoubleField(term127, term127.getClass(), "stopTolX", 0.7154795600170818);
        setDoubleField(term127, term127.getClass(), "stopTolFun", 0.6355029654528058);
        setDoubleField(term127, term127.getClass(), "stopTolHistFun", 0.0022646783892913414);
        setIntField(term127, term127.getClass(), "mu", 590364439);
        setDoubleField(term127, term127.getClass(), "logMu2", 0.36226058076369927);
        setField(term127, term127.getClass(), "weights", null);
        setDoubleField(term127, term127.getClass(), "mueff", 0.03699061125289671);
        setDoubleField(term127, term127.getClass(), "sigma", 0.6047137830113202);
        setDoubleField(term127, term127.getClass(), "cc", 0.6767213143579776);
        setDoubleField(term127, term127.getClass(), "cs", 0.48862955528902696);
        setDoubleField(term127, term127.getClass(), "damps", 0.426231085465289);
        setDoubleField(term127, term127.getClass(), "ccov1", 0.0027299293098262956);
        setDoubleField(term127, term127.getClass(), "ccovmu", 0.29874017652881824);
        setDoubleField(term127, term127.getClass(), "chiN", 0.32554480512985284);
        setDoubleField(term127, term127.getClass(), "ccov1Sep", 0.8924855581421237);
        setDoubleField(term127, term127.getClass(), "ccovmuSep", 0.32237559209193944);
        setField(term127, term127.getClass(), "xmean", null);
        setField(term127, term127.getClass(), "pc", null);
        setField(term127, term127.getClass(), "ps", null);
        setDoubleField(term127, term127.getClass(), "normps", 0.53094494792755);
        setField(term127, term127.getClass(), "B", null);
        setField(term127, term127.getClass(), "D", null);
        setField(term127, term127.getClass(), "BD", null);
        setField(term127, term127.getClass(), "diagD", null);
        setField(term127, term127.getClass(), "C", null);
        setField(term127, term127.getClass(), "diagC", null);
        setIntField(term127, term127.getClass(), "iterations", 0);
        setField(term127, term127.getClass(), "fitnessHistory", null);
        setIntField(term127, term127.getClass(), "historySize", 0);
        setField(term127, term127.getClass(), "random", null);
        setField(term127, term127.getClass(), "statisticsSigmaHistory", null);
        setField(term127, term127.getClass(), "statisticsMeanHistory", null);
        setField(term127, term127.getClass(), "statisticsFitnessHistory", null);
        setField(term127, term127.getClass(), "statisticsDHistory", null);
        setField(term127, term127.getClass(), "function", null);
        setField(term127, term127.getClass(), "goal", null);
        setField(term127, term127.getClass(), "start", null);
        setField(term127, term127.getClass(), "lowerBound", null);
        setField(term127, term127.getClass(), "upperBound", null);
        setField(term127, term127.getClass(), "evaluations", null);
        setField(term127, term127.getClass(), "iterations", null);
        setField(term127, term127.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatisticsDHistory", argTypes, term127, args);
    }

};


