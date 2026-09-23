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

public class CMAESOptimizer_checkParameters_16318342828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275;

    public CMAESOptimizer_checkParameters_16318342828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] term279 = (double[]) newDoubleArray(1);
        setIntField(term275, term275.getClass(), "lambda", -817164822);
        setBooleanField(term275, term275.getClass(), "isActiveCMA", true);
        setIntField(term275, term275.getClass(), "checkFeasableCount", -1016503459);
        setDoubleElement(term279, 0, 0.6584165706677267);
        setField(term275, term275.getClass(), "inputSigma", term279);
        setIntField(term275, term275.getClass(), "dimension", -1968847291);
        setIntField(term275, term275.getClass(), "diagonalOnly", 579005622);
        setBooleanField(term275, term275.getClass(), "isMinimize", true);
        setBooleanField(term275, term275.getClass(), "generateStatistics", false);
        setIntField(term275, term275.getClass(), "maxIterations", -14890619);
        setDoubleField(term275, term275.getClass(), "stopFitness", 0.44268490778872205);
        setDoubleField(term275, term275.getClass(), "stopTolUpX", 0.7507333108648018);
        setDoubleField(term275, term275.getClass(), "stopTolX", 0.007493740494434409);
        setDoubleField(term275, term275.getClass(), "stopTolFun", 0.29172553321356776);
        setDoubleField(term275, term275.getClass(), "stopTolHistFun", 0.9276995636844321);
        setIntField(term275, term275.getClass(), "mu", 1632125673);
        setDoubleField(term275, term275.getClass(), "logMu2", 0.7636130748477434);
        setField(term275, term275.getClass(), "weights", null);
        setDoubleField(term275, term275.getClass(), "mueff", 0.07901636960861558);
        setDoubleField(term275, term275.getClass(), "sigma", 0.18717846301066243);
        setDoubleField(term275, term275.getClass(), "cc", 0.5335953039331021);
        setDoubleField(term275, term275.getClass(), "cs", 0.5725602309856443);
        setDoubleField(term275, term275.getClass(), "damps", 0.5310967137636303);
        setDoubleField(term275, term275.getClass(), "ccov1", 0.6054109236809134);
        setDoubleField(term275, term275.getClass(), "ccovmu", 0.9165240441138934);
        setDoubleField(term275, term275.getClass(), "chiN", 0.22227423914231126);
        setDoubleField(term275, term275.getClass(), "ccov1Sep", 0.06480976831423468);
        setDoubleField(term275, term275.getClass(), "ccovmuSep", 0.8490790645379176);
        setField(term275, term275.getClass(), "xmean", null);
        setField(term275, term275.getClass(), "pc", null);
        setField(term275, term275.getClass(), "ps", null);
        setDoubleField(term275, term275.getClass(), "normps", 0.23129126164078717);
        setField(term275, term275.getClass(), "B", null);
        setField(term275, term275.getClass(), "D", null);
        setField(term275, term275.getClass(), "BD", null);
        setField(term275, term275.getClass(), "diagD", null);
        setField(term275, term275.getClass(), "C", null);
        setField(term275, term275.getClass(), "diagC", null);
        setIntField(term275, term275.getClass(), "iterations", 0);
        setField(term275, term275.getClass(), "fitnessHistory", null);
        setIntField(term275, term275.getClass(), "historySize", 0);
        setField(term275, term275.getClass(), "random", null);
        setField(term275, term275.getClass(), "statisticsSigmaHistory", null);
        setField(term275, term275.getClass(), "statisticsMeanHistory", null);
        setField(term275, term275.getClass(), "statisticsFitnessHistory", null);
        setField(term275, term275.getClass(), "statisticsDHistory", null);
        setField(term275, term275.getClass(), "function", null);
        setField(term275, term275.getClass(), "goal", null);
        setField(term275, term275.getClass(), "start", null);
        setField(term275, term275.getClass(), "lowerBound", null);
        setField(term275, term275.getClass(), "upperBound", null);
        setField(term275, term275.getClass(), "evaluations", null);
        setField(term275, term275.getClass(), "iterations", null);
        setField(term275, term275.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkParameters", argTypes, term275, args);
    }

};


