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

public class CMAESOptimizer_doOptimize_12774366926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198;

    public CMAESOptimizer_doOptimize_12774366926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] term202 = (double[]) newDoubleArray(2);
        setIntField(term198, term198.getClass(), "lambda", -226514366);
        setBooleanField(term198, term198.getClass(), "isActiveCMA", true);
        setIntField(term198, term198.getClass(), "checkFeasableCount", 1193880199);
        setDoubleElement(term202, 0, 0.509895859167191);
        setDoubleElement(term202, 1, 0.07417792024383196);
        setField(term198, term198.getClass(), "inputSigma", term202);
        setIntField(term198, term198.getClass(), "dimension", -1087774327);
        setIntField(term198, term198.getClass(), "diagonalOnly", -1530420153);
        setBooleanField(term198, term198.getClass(), "isMinimize", false);
        setBooleanField(term198, term198.getClass(), "generateStatistics", false);
        setIntField(term198, term198.getClass(), "maxIterations", -469968304);
        setDoubleField(term198, term198.getClass(), "stopFitness", 0.686293604788188);
        setDoubleField(term198, term198.getClass(), "stopTolUpX", 0.12764449157430724);
        setDoubleField(term198, term198.getClass(), "stopTolX", 0.39446728256884744);
        setDoubleField(term198, term198.getClass(), "stopTolFun", 0.7865909711092062);
        setDoubleField(term198, term198.getClass(), "stopTolHistFun", 0.06587158449170749);
        setIntField(term198, term198.getClass(), "mu", -1145578966);
        setDoubleField(term198, term198.getClass(), "logMu2", 0.0865998004187658);
        setField(term198, term198.getClass(), "weights", null);
        setDoubleField(term198, term198.getClass(), "mueff", 0.9628647861255637);
        setDoubleField(term198, term198.getClass(), "sigma", 0.623231822150205);
        setDoubleField(term198, term198.getClass(), "cc", 0.09037487793444521);
        setDoubleField(term198, term198.getClass(), "cs", 0.6561919196821765);
        setDoubleField(term198, term198.getClass(), "damps", 0.7330178886612495);
        setDoubleField(term198, term198.getClass(), "ccov1", 0.7618164754425794);
        setDoubleField(term198, term198.getClass(), "ccovmu", 0.7385589312559342);
        setDoubleField(term198, term198.getClass(), "chiN", 0.7080134263823477);
        setDoubleField(term198, term198.getClass(), "ccov1Sep", 0.6059734092898602);
        setDoubleField(term198, term198.getClass(), "ccovmuSep", 0.3074693824288357);
        setField(term198, term198.getClass(), "xmean", null);
        setField(term198, term198.getClass(), "pc", null);
        setField(term198, term198.getClass(), "ps", null);
        setDoubleField(term198, term198.getClass(), "normps", 0.1245258965512791);
        setField(term198, term198.getClass(), "B", null);
        setField(term198, term198.getClass(), "D", null);
        setField(term198, term198.getClass(), "BD", null);
        setField(term198, term198.getClass(), "diagD", null);
        setField(term198, term198.getClass(), "C", null);
        setField(term198, term198.getClass(), "diagC", null);
        setIntField(term198, term198.getClass(), "iterations", 0);
        setField(term198, term198.getClass(), "fitnessHistory", null);
        setIntField(term198, term198.getClass(), "historySize", 0);
        setField(term198, term198.getClass(), "random", null);
        setField(term198, term198.getClass(), "statisticsSigmaHistory", null);
        setField(term198, term198.getClass(), "statisticsMeanHistory", null);
        setField(term198, term198.getClass(), "statisticsFitnessHistory", null);
        setField(term198, term198.getClass(), "statisticsDHistory", null);
        setField(term198, term198.getClass(), "function", null);
        setField(term198, term198.getClass(), "goal", null);
        setField(term198, term198.getClass(), "start", null);
        setField(term198, term198.getClass(), "lowerBound", null);
        setField(term198, term198.getClass(), "upperBound", null);
        setField(term198, term198.getClass(), "evaluations", null);
        setField(term198, term198.getClass(), "iterations", null);
        setField(term198, term198.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doOptimize", argTypes, term198, args);
    }

};


