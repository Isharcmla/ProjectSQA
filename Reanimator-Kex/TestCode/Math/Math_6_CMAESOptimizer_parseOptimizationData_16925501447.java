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

public class CMAESOptimizer_parseOptimizationData_16925501447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232;
     Object term268;

    public CMAESOptimizer_parseOptimizationData_16925501447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] term236 = (double[]) newDoubleArray(6);
        setIntField(term232, term232.getClass(), "lambda", 679763016);
        setBooleanField(term232, term232.getClass(), "isActiveCMA", true);
        setIntField(term232, term232.getClass(), "checkFeasableCount", 1962444399);
        setDoubleElement(term236, 0, 0.9511861072660375);
        setDoubleElement(term236, 1, 0.05880719443135807);
        setDoubleElement(term236, 2, 0.34010089048558567);
        setDoubleElement(term236, 3, 0.19625398866403143);
        setDoubleElement(term236, 4, 0.45069204793711093);
        setDoubleElement(term236, 5, 0.9341364461850963);
        setField(term232, term232.getClass(), "inputSigma", term236);
        setIntField(term232, term232.getClass(), "dimension", 767834723);
        setIntField(term232, term232.getClass(), "diagonalOnly", -602026508);
        setBooleanField(term232, term232.getClass(), "isMinimize", true);
        setBooleanField(term232, term232.getClass(), "generateStatistics", true);
        setIntField(term232, term232.getClass(), "maxIterations", -157887805);
        setDoubleField(term232, term232.getClass(), "stopFitness", 0.9022041121474429);
        setDoubleField(term232, term232.getClass(), "stopTolUpX", 0.6512870939318848);
        setDoubleField(term232, term232.getClass(), "stopTolX", 0.8777038609128434);
        setDoubleField(term232, term232.getClass(), "stopTolFun", 0.008025683154629148);
        setDoubleField(term232, term232.getClass(), "stopTolHistFun", 0.40598298281353484);
        setIntField(term232, term232.getClass(), "mu", 1876565163);
        setDoubleField(term232, term232.getClass(), "logMu2", 0.3710067290060264);
        setField(term232, term232.getClass(), "weights", null);
        setDoubleField(term232, term232.getClass(), "mueff", 0.7818620200430967);
        setDoubleField(term232, term232.getClass(), "sigma", 0.04640022995603543);
        setDoubleField(term232, term232.getClass(), "cc", 0.9123572866833729);
        setDoubleField(term232, term232.getClass(), "cs", 0.40635376375558196);
        setDoubleField(term232, term232.getClass(), "damps", 0.4772043271031934);
        setDoubleField(term232, term232.getClass(), "ccov1", 0.2446504549754045);
        setDoubleField(term232, term232.getClass(), "ccovmu", 0.6142723998707854);
        setDoubleField(term232, term232.getClass(), "chiN", 0.4355627280318103);
        setDoubleField(term232, term232.getClass(), "ccov1Sep", 0.841460835734741);
        setDoubleField(term232, term232.getClass(), "ccovmuSep", 0.7859316615744082);
        setField(term232, term232.getClass(), "xmean", null);
        setField(term232, term232.getClass(), "pc", null);
        setField(term232, term232.getClass(), "ps", null);
        setDoubleField(term232, term232.getClass(), "normps", 0.6428742553484879);
        setField(term232, term232.getClass(), "B", null);
        setField(term232, term232.getClass(), "D", null);
        setField(term232, term232.getClass(), "BD", null);
        setField(term232, term232.getClass(), "diagD", null);
        setField(term232, term232.getClass(), "C", null);
        setField(term232, term232.getClass(), "diagC", null);
        setIntField(term232, term232.getClass(), "iterations", 0);
        setField(term232, term232.getClass(), "fitnessHistory", null);
        setIntField(term232, term232.getClass(), "historySize", 0);
        setField(term232, term232.getClass(), "random", null);
        setField(term232, term232.getClass(), "statisticsSigmaHistory", null);
        setField(term232, term232.getClass(), "statisticsMeanHistory", null);
        setField(term232, term232.getClass(), "statisticsFitnessHistory", null);
        setField(term232, term232.getClass(), "statisticsDHistory", null);
        setField(term232, term232.getClass(), "function", null);
        setField(term232, term232.getClass(), "goal", null);
        setField(term232, term232.getClass(), "start", null);
        setField(term232, term232.getClass(), "lowerBound", null);
        setField(term232, term232.getClass(), "upperBound", null);
        setField(term232, term232.getClass(), "evaluations", null);
        setField(term232, term232.getClass(), "iterations", null);
        setField(term232, term232.getClass(), "checker", null);
        term268 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term268;
        callMethod(klass, "parseOptimizationData", argTypes, term232, args);
    }

};


