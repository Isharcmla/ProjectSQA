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

public class CMAESOptimizer_randn_198815560437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term648;
     Object term684;

    public CMAESOptimizer_randn_198815560437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term648 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] term652 = (double[]) newDoubleArray(6);
        setIntField(term648, term648.getClass(), "lambda", -1476117762);
        setBooleanField(term648, term648.getClass(), "isActiveCMA", true);
        setIntField(term648, term648.getClass(), "checkFeasableCount", -341962980);
        setDoubleElement(term652, 0, 0.16734523112870836);
        setDoubleElement(term652, 1, 0.9711083796772954);
        setDoubleElement(term652, 2, 0.329228491476264);
        setDoubleElement(term652, 3, 0.8664463700873805);
        setDoubleElement(term652, 4, 0.4228841212022646);
        setDoubleElement(term652, 5, 0.9898207968242465);
        setField(term648, term648.getClass(), "inputSigma", term652);
        setIntField(term648, term648.getClass(), "dimension", 1532716628);
        setIntField(term648, term648.getClass(), "diagonalOnly", -1801760683);
        setBooleanField(term648, term648.getClass(), "isMinimize", true);
        setBooleanField(term648, term648.getClass(), "generateStatistics", false);
        setIntField(term648, term648.getClass(), "maxIterations", 1141317871);
        setDoubleField(term648, term648.getClass(), "stopFitness", 0.025396748287270232);
        setDoubleField(term648, term648.getClass(), "stopTolUpX", 0.22437750947699786);
        setDoubleField(term648, term648.getClass(), "stopTolX", 0.3142783864669928);
        setDoubleField(term648, term648.getClass(), "stopTolFun", 0.28838369056651414);
        setDoubleField(term648, term648.getClass(), "stopTolHistFun", 0.3505219043338702);
        setIntField(term648, term648.getClass(), "mu", 890669485);
        setDoubleField(term648, term648.getClass(), "logMu2", 0.9926072201505048);
        setField(term648, term648.getClass(), "weights", null);
        setDoubleField(term648, term648.getClass(), "mueff", 0.5862272565267508);
        setDoubleField(term648, term648.getClass(), "sigma", 0.20309716492940588);
        setDoubleField(term648, term648.getClass(), "cc", 0.2353269756778571);
        setDoubleField(term648, term648.getClass(), "cs", 0.6816920131943206);
        setDoubleField(term648, term648.getClass(), "damps", 0.2570702043750863);
        setDoubleField(term648, term648.getClass(), "ccov1", 0.1475601354637306);
        setDoubleField(term648, term648.getClass(), "ccovmu", 0.3597510664032918);
        setDoubleField(term648, term648.getClass(), "chiN", 0.007955296043747784);
        setDoubleField(term648, term648.getClass(), "ccov1Sep", 0.9306289418004117);
        setDoubleField(term648, term648.getClass(), "ccovmuSep", 0.6094033208961637);
        setField(term648, term648.getClass(), "xmean", null);
        setField(term648, term648.getClass(), "pc", null);
        setField(term648, term648.getClass(), "ps", null);
        setDoubleField(term648, term648.getClass(), "normps", 0.8841587807231336);
        setField(term648, term648.getClass(), "B", null);
        setField(term648, term648.getClass(), "D", null);
        setField(term648, term648.getClass(), "BD", null);
        setField(term648, term648.getClass(), "diagD", null);
        setField(term648, term648.getClass(), "C", null);
        setField(term648, term648.getClass(), "diagC", null);
        setIntField(term648, term648.getClass(), "iterations", 0);
        setField(term648, term648.getClass(), "fitnessHistory", null);
        setIntField(term648, term648.getClass(), "historySize", 0);
        setField(term648, term648.getClass(), "random", null);
        setField(term648, term648.getClass(), "statisticsSigmaHistory", null);
        setField(term648, term648.getClass(), "statisticsMeanHistory", null);
        setField(term648, term648.getClass(), "statisticsFitnessHistory", null);
        setField(term648, term648.getClass(), "statisticsDHistory", null);
        setField(term648, term648.getClass(), "function", null);
        setField(term648, term648.getClass(), "goal", null);
        setField(term648, term648.getClass(), "start", null);
        setField(term648, term648.getClass(), "lowerBound", null);
        setField(term648, term648.getClass(), "upperBound", null);
        setField(term648, term648.getClass(), "evaluations", null);
        setField(term648, term648.getClass(), "iterations", null);
        setField(term648, term648.getClass(), "checker", null);
        term684 = new Integer(691577392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term684;
        callMethod(klass, "randn", argTypes, term648, args);
    }

};


