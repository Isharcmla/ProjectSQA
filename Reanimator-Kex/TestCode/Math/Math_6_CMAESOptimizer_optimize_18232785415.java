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
import java.lang.Object;

public class CMAESOptimizer_optimize_18232785415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165;
     Object term196;

    public CMAESOptimizer_optimize_18232785415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] term169 = (double[]) newDoubleArray(1);
        setIntField(term165, term165.getClass(), "lambda", 865208305);
        setBooleanField(term165, term165.getClass(), "isActiveCMA", false);
        setIntField(term165, term165.getClass(), "checkFeasableCount", -1275173084);
        setDoubleElement(term169, 0, 0.146431486357265);
        setField(term165, term165.getClass(), "inputSigma", term169);
        setIntField(term165, term165.getClass(), "dimension", -244121226);
        setIntField(term165, term165.getClass(), "diagonalOnly", -203030934);
        setBooleanField(term165, term165.getClass(), "isMinimize", false);
        setBooleanField(term165, term165.getClass(), "generateStatistics", true);
        setIntField(term165, term165.getClass(), "maxIterations", -1179120542);
        setDoubleField(term165, term165.getClass(), "stopFitness", 0.24259014218848696);
        setDoubleField(term165, term165.getClass(), "stopTolUpX", 0.1544348383112728);
        setDoubleField(term165, term165.getClass(), "stopTolX", 0.5187846213101265);
        setDoubleField(term165, term165.getClass(), "stopTolFun", 0.045893173090043815);
        setDoubleField(term165, term165.getClass(), "stopTolHistFun", 0.3626177854778667);
        setIntField(term165, term165.getClass(), "mu", -73683645);
        setDoubleField(term165, term165.getClass(), "logMu2", 0.3163771663728089);
        setField(term165, term165.getClass(), "weights", null);
        setDoubleField(term165, term165.getClass(), "mueff", 0.8819646072665548);
        setDoubleField(term165, term165.getClass(), "sigma", 0.5412182593116958);
        setDoubleField(term165, term165.getClass(), "cc", 0.16988691727397487);
        setDoubleField(term165, term165.getClass(), "cs", 0.39286935532362843);
        setDoubleField(term165, term165.getClass(), "damps", 0.11577948268926874);
        setDoubleField(term165, term165.getClass(), "ccov1", 0.5617009352394552);
        setDoubleField(term165, term165.getClass(), "ccovmu", 0.09067063848644474);
        setDoubleField(term165, term165.getClass(), "chiN", 0.268304014379393);
        setDoubleField(term165, term165.getClass(), "ccov1Sep", 0.7171972879282721);
        setDoubleField(term165, term165.getClass(), "ccovmuSep", 0.9006361024877096);
        setField(term165, term165.getClass(), "xmean", null);
        setField(term165, term165.getClass(), "pc", null);
        setField(term165, term165.getClass(), "ps", null);
        setDoubleField(term165, term165.getClass(), "normps", 0.5644914462415626);
        setField(term165, term165.getClass(), "B", null);
        setField(term165, term165.getClass(), "D", null);
        setField(term165, term165.getClass(), "BD", null);
        setField(term165, term165.getClass(), "diagD", null);
        setField(term165, term165.getClass(), "C", null);
        setField(term165, term165.getClass(), "diagC", null);
        setIntField(term165, term165.getClass(), "iterations", 0);
        setField(term165, term165.getClass(), "fitnessHistory", null);
        setIntField(term165, term165.getClass(), "historySize", 0);
        setField(term165, term165.getClass(), "random", null);
        setField(term165, term165.getClass(), "statisticsSigmaHistory", null);
        setField(term165, term165.getClass(), "statisticsMeanHistory", null);
        setField(term165, term165.getClass(), "statisticsFitnessHistory", null);
        setField(term165, term165.getClass(), "statisticsDHistory", null);
        setField(term165, term165.getClass(), "function", null);
        setField(term165, term165.getClass(), "goal", null);
        setField(term165, term165.getClass(), "start", null);
        setField(term165, term165.getClass(), "lowerBound", null);
        setField(term165, term165.getClass(), "upperBound", null);
        setField(term165, term165.getClass(), "evaluations", null);
        setField(term165, term165.getClass(), "iterations", null);
        setField(term165, term165.getClass(), "checker", null);
        term196 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term196;
        callMethod(klass, "optimize", argTypes, term165, args);
    }

};


