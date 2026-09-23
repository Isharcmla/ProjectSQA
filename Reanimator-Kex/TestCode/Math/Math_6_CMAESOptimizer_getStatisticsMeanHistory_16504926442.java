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

public class CMAESOptimizer_getStatisticsMeanHistory_16504926442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53;

    public CMAESOptimizer_getStatisticsMeanHistory_16504926442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] term57 = (double[]) newDoubleArray(4);
        setIntField(term53, term53.getClass(), "lambda", -1339778481);
        setBooleanField(term53, term53.getClass(), "isActiveCMA", true);
        setIntField(term53, term53.getClass(), "checkFeasableCount", 1725571209);
        setDoubleElement(term57, 0, 0.7633268466829064);
        setDoubleElement(term57, 1, 0.13481025392611334);
        setDoubleElement(term57, 2, 0.3800088629986428);
        setDoubleElement(term57, 3, 0.5840714198152577);
        setField(term53, term53.getClass(), "inputSigma", term57);
        setIntField(term53, term53.getClass(), "dimension", -522618178);
        setIntField(term53, term53.getClass(), "diagonalOnly", 1134449235);
        setBooleanField(term53, term53.getClass(), "isMinimize", true);
        setBooleanField(term53, term53.getClass(), "generateStatistics", true);
        setIntField(term53, term53.getClass(), "maxIterations", -883034806);
        setDoubleField(term53, term53.getClass(), "stopFitness", 0.7559240768573477);
        setDoubleField(term53, term53.getClass(), "stopTolUpX", 0.10667076642995188);
        setDoubleField(term53, term53.getClass(), "stopTolX", 0.11493000848982304);
        setDoubleField(term53, term53.getClass(), "stopTolFun", 0.37161417339133307);
        setDoubleField(term53, term53.getClass(), "stopTolHistFun", 0.6805867182029153);
        setIntField(term53, term53.getClass(), "mu", 1585847225);
        setDoubleField(term53, term53.getClass(), "logMu2", 0.2852810965221698);
        setField(term53, term53.getClass(), "weights", null);
        setDoubleField(term53, term53.getClass(), "mueff", 0.6300849762307866);
        setDoubleField(term53, term53.getClass(), "sigma", 0.9737083944266686);
        setDoubleField(term53, term53.getClass(), "cc", 0.0668892744806211);
        setDoubleField(term53, term53.getClass(), "cs", 0.3587267442738795);
        setDoubleField(term53, term53.getClass(), "damps", 0.07802449704920456);
        setDoubleField(term53, term53.getClass(), "ccov1", 0.5279279537140873);
        setDoubleField(term53, term53.getClass(), "ccovmu", 0.3202192021706908);
        setDoubleField(term53, term53.getClass(), "chiN", 0.22651340641904605);
        setDoubleField(term53, term53.getClass(), "ccov1Sep", 0.8878841294187743);
        setDoubleField(term53, term53.getClass(), "ccovmuSep", 0.6588948704887806);
        setField(term53, term53.getClass(), "xmean", null);
        setField(term53, term53.getClass(), "pc", null);
        setField(term53, term53.getClass(), "ps", null);
        setDoubleField(term53, term53.getClass(), "normps", 0.6397214730945112);
        setField(term53, term53.getClass(), "B", null);
        setField(term53, term53.getClass(), "D", null);
        setField(term53, term53.getClass(), "BD", null);
        setField(term53, term53.getClass(), "diagD", null);
        setField(term53, term53.getClass(), "C", null);
        setField(term53, term53.getClass(), "diagC", null);
        setIntField(term53, term53.getClass(), "iterations", 0);
        setField(term53, term53.getClass(), "fitnessHistory", null);
        setIntField(term53, term53.getClass(), "historySize", 0);
        setField(term53, term53.getClass(), "random", null);
        setField(term53, term53.getClass(), "statisticsSigmaHistory", null);
        setField(term53, term53.getClass(), "statisticsMeanHistory", null);
        setField(term53, term53.getClass(), "statisticsFitnessHistory", null);
        setField(term53, term53.getClass(), "statisticsDHistory", null);
        setField(term53, term53.getClass(), "function", null);
        setField(term53, term53.getClass(), "goal", null);
        setField(term53, term53.getClass(), "start", null);
        setField(term53, term53.getClass(), "lowerBound", null);
        setField(term53, term53.getClass(), "upperBound", null);
        setField(term53, term53.getClass(), "evaluations", null);
        setField(term53, term53.getClass(), "iterations", null);
        setField(term53, term53.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatisticsMeanHistory", argTypes, term53, args);
    }

};


