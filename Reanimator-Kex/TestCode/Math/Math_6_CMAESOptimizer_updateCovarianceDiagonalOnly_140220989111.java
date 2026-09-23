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
import java.lang.Boolean;

public class CMAESOptimizer_updateCovarianceDiagonalOnly_140220989111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400;
     Object term432;

    public CMAESOptimizer_updateCovarianceDiagonalOnly_140220989111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term400 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] term404 = (double[]) newDoubleArray(2);
        setIntField(term400, term400.getClass(), "lambda", -2095575670);
        setBooleanField(term400, term400.getClass(), "isActiveCMA", true);
        setIntField(term400, term400.getClass(), "checkFeasableCount", 1225272962);
        setDoubleElement(term404, 0, 0.1163034938203874);
        setDoubleElement(term404, 1, 0.1187814206908886);
        setField(term400, term400.getClass(), "inputSigma", term404);
        setIntField(term400, term400.getClass(), "dimension", 1324040357);
        setIntField(term400, term400.getClass(), "diagonalOnly", -1588772968);
        setBooleanField(term400, term400.getClass(), "isMinimize", true);
        setBooleanField(term400, term400.getClass(), "generateStatistics", false);
        setIntField(term400, term400.getClass(), "maxIterations", -93135961);
        setDoubleField(term400, term400.getClass(), "stopFitness", 0.04662501176438627);
        setDoubleField(term400, term400.getClass(), "stopTolUpX", 0.17512426723256447);
        setDoubleField(term400, term400.getClass(), "stopTolX", 0.9379214810416256);
        setDoubleField(term400, term400.getClass(), "stopTolFun", 0.10807577760679721);
        setDoubleField(term400, term400.getClass(), "stopTolHistFun", 0.7808234535616719);
        setIntField(term400, term400.getClass(), "mu", -112921587);
        setDoubleField(term400, term400.getClass(), "logMu2", 0.9772425797816359);
        setField(term400, term400.getClass(), "weights", null);
        setDoubleField(term400, term400.getClass(), "mueff", 0.32009327814110977);
        setDoubleField(term400, term400.getClass(), "sigma", 0.9013029318694921);
        setDoubleField(term400, term400.getClass(), "cc", 0.1755673139619638);
        setDoubleField(term400, term400.getClass(), "cs", 0.9136597256674437);
        setDoubleField(term400, term400.getClass(), "damps", 0.3741779691002205);
        setDoubleField(term400, term400.getClass(), "ccov1", 0.5652495059647745);
        setDoubleField(term400, term400.getClass(), "ccovmu", 0.021410850431387685);
        setDoubleField(term400, term400.getClass(), "chiN", 0.8397628091272534);
        setDoubleField(term400, term400.getClass(), "ccov1Sep", 0.01784667720947175);
        setDoubleField(term400, term400.getClass(), "ccovmuSep", 0.4395312828193261);
        setField(term400, term400.getClass(), "xmean", null);
        setField(term400, term400.getClass(), "pc", null);
        setField(term400, term400.getClass(), "ps", null);
        setDoubleField(term400, term400.getClass(), "normps", 0.5715204226647931);
        setField(term400, term400.getClass(), "B", null);
        setField(term400, term400.getClass(), "D", null);
        setField(term400, term400.getClass(), "BD", null);
        setField(term400, term400.getClass(), "diagD", null);
        setField(term400, term400.getClass(), "C", null);
        setField(term400, term400.getClass(), "diagC", null);
        setIntField(term400, term400.getClass(), "iterations", 0);
        setField(term400, term400.getClass(), "fitnessHistory", null);
        setIntField(term400, term400.getClass(), "historySize", 0);
        setField(term400, term400.getClass(), "random", null);
        setField(term400, term400.getClass(), "statisticsSigmaHistory", null);
        setField(term400, term400.getClass(), "statisticsMeanHistory", null);
        setField(term400, term400.getClass(), "statisticsFitnessHistory", null);
        setField(term400, term400.getClass(), "statisticsDHistory", null);
        setField(term400, term400.getClass(), "function", null);
        setField(term400, term400.getClass(), "goal", null);
        setField(term400, term400.getClass(), "start", null);
        setField(term400, term400.getClass(), "lowerBound", null);
        setField(term400, term400.getClass(), "upperBound", null);
        setField(term400, term400.getClass(), "evaluations", null);
        setField(term400, term400.getClass(), "iterations", null);
        setField(term400, term400.getClass(), "checker", null);
        term432 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Object[] args = new Object[2];
        args[0] = term432;
        args[1] = null;
        callMethod(klass, "updateCovarianceDiagonalOnly", argTypes, term400, args);
    }

};


