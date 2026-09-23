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

public class CMAESOptimizer_updateCovariance_33046528451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1140;
     Object term1169;

    public CMAESOptimizer_updateCovariance_33046528451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1140 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setIntField(term1140, term1140.getClass(), "lambda", 0);
        setBooleanField(term1140, term1140.getClass(), "isActiveCMA", false);
        setIntField(term1140, term1140.getClass(), "checkFeasableCount", 0);
        setField(term1140, term1140.getClass(), "inputSigma", null);
        setIntField(term1140, term1140.getClass(), "dimension", 0);
        setIntField(term1140, term1140.getClass(), "diagonalOnly", 0);
        setBooleanField(term1140, term1140.getClass(), "isMinimize", false);
        setBooleanField(term1140, term1140.getClass(), "generateStatistics", false);
        setIntField(term1140, term1140.getClass(), "maxIterations", 0);
        setDoubleField(term1140, term1140.getClass(), "stopFitness", 0.0);
        setDoubleField(term1140, term1140.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term1140, term1140.getClass(), "stopTolX", 0.0);
        setDoubleField(term1140, term1140.getClass(), "stopTolFun", 0.0);
        setDoubleField(term1140, term1140.getClass(), "stopTolHistFun", 0.0);
        setIntField(term1140, term1140.getClass(), "mu", 0);
        setDoubleField(term1140, term1140.getClass(), "logMu2", 0.0);
        setField(term1140, term1140.getClass(), "weights", null);
        setDoubleField(term1140, term1140.getClass(), "mueff", 0.0);
        setDoubleField(term1140, term1140.getClass(), "sigma", 0.0);
        setDoubleField(term1140, term1140.getClass(), "cc", 0.0);
        setDoubleField(term1140, term1140.getClass(), "cs", 0.0);
        setDoubleField(term1140, term1140.getClass(), "damps", 0.0);
        setDoubleField(term1140, term1140.getClass(), "ccov1", 0.0);
        setDoubleField(term1140, term1140.getClass(), "ccovmu", 0.0);
        setDoubleField(term1140, term1140.getClass(), "chiN", 0.0);
        setDoubleField(term1140, term1140.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term1140, term1140.getClass(), "ccovmuSep", 0.0);
        setField(term1140, term1140.getClass(), "xmean", null);
        setField(term1140, term1140.getClass(), "pc", null);
        setField(term1140, term1140.getClass(), "ps", null);
        setDoubleField(term1140, term1140.getClass(), "normps", 0.0);
        setField(term1140, term1140.getClass(), "B", null);
        setField(term1140, term1140.getClass(), "D", null);
        setField(term1140, term1140.getClass(), "BD", null);
        setField(term1140, term1140.getClass(), "diagD", null);
        setField(term1140, term1140.getClass(), "C", null);
        setField(term1140, term1140.getClass(), "diagC", null);
        setIntField(term1140, term1140.getClass(), "iterations", 0);
        setField(term1140, term1140.getClass(), "fitnessHistory", null);
        setIntField(term1140, term1140.getClass(), "historySize", 0);
        setField(term1140, term1140.getClass(), "random", null);
        setField(term1140, term1140.getClass(), "statisticsSigmaHistory", null);
        setField(term1140, term1140.getClass(), "statisticsMeanHistory", null);
        setField(term1140, term1140.getClass(), "statisticsFitnessHistory", null);
        setField(term1140, term1140.getClass(), "statisticsDHistory", null);
        setField(term1140, term1140.getClass(), "function", null);
        setField(term1140, term1140.getClass(), "goal", null);
        setField(term1140, term1140.getClass(), "start", null);
        setField(term1140, term1140.getClass(), "lowerBound", null);
        setField(term1140, term1140.getClass(), "upperBound", null);
        setField(term1140, term1140.getClass(), "evaluations", null);
        setField(term1140, term1140.getClass(), "iterations", null);
        setField(term1140, term1140.getClass(), "checker", null);
        term1169 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[2] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[3] = Array.newInstance(int.class, 0).getClass();
        argTypes[4] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Object[] args = new Object[5];
        args[0] = term1169;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        callMethod(klass, "updateCovariance", argTypes, term1140, args);
    }

};


