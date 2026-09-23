package org.apache.commons.math3.optimization.direct;

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
import static org.apache.commons.math3.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optimization.direct.EqualityUtils.*;

public class CMAESOptimizer_updateBD_548730182121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66378;
     Object term67216;

    public CMAESOptimizer_updateBD_548730182121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66378 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setDoubleField(term66378, term66378.getClass(), "ccov1", 5.7420895251658179E18);
        setDoubleField(term66378, term66378.getClass(), "ccovmu", -3.4587645138184438E18);
        term67216 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setIntField(term67216, term67216.getClass(), "lambda", 0);
        setBooleanField(term67216, term67216.getClass(), "isActiveCMA", false);
        setIntField(term67216, term67216.getClass(), "checkFeasableCount", 0);
        setField(term67216, term67216.getClass(), "boundaries", null);
        setField(term67216, term67216.getClass(), "inputSigma", null);
        setIntField(term67216, term67216.getClass(), "dimension", 0);
        setIntField(term67216, term67216.getClass(), "diagonalOnly", 0);
        setBooleanField(term67216, term67216.getClass(), "isMinimize", false);
        setBooleanField(term67216, term67216.getClass(), "generateStatistics", false);
        setIntField(term67216, term67216.getClass(), "maxIterations", 0);
        setDoubleField(term67216, term67216.getClass(), "stopFitness", 0.0);
        setDoubleField(term67216, term67216.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term67216, term67216.getClass(), "stopTolX", 0.0);
        setDoubleField(term67216, term67216.getClass(), "stopTolFun", 0.0);
        setDoubleField(term67216, term67216.getClass(), "stopTolHistFun", 0.0);
        setIntField(term67216, term67216.getClass(), "mu", 0);
        setDoubleField(term67216, term67216.getClass(), "logMu2", 0.0);
        setField(term67216, term67216.getClass(), "weights", null);
        setDoubleField(term67216, term67216.getClass(), "mueff", 0.0);
        setDoubleField(term67216, term67216.getClass(), "sigma", 0.0);
        setDoubleField(term67216, term67216.getClass(), "cc", 0.0);
        setDoubleField(term67216, term67216.getClass(), "cs", 0.0);
        setDoubleField(term67216, term67216.getClass(), "damps", 0.0);
        setDoubleField(term67216, term67216.getClass(), "ccov1", 5.7420895251658179E18);
        setDoubleField(term67216, term67216.getClass(), "ccovmu", -3.4587645138184438E18);
        setDoubleField(term67216, term67216.getClass(), "chiN", 0.0);
        setDoubleField(term67216, term67216.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term67216, term67216.getClass(), "ccovmuSep", 0.0);
        setField(term67216, term67216.getClass(), "xmean", null);
        setField(term67216, term67216.getClass(), "pc", null);
        setField(term67216, term67216.getClass(), "ps", null);
        setDoubleField(term67216, term67216.getClass(), "normps", 0.0);
        setField(term67216, term67216.getClass(), "B", null);
        setField(term67216, term67216.getClass(), "D", null);
        setField(term67216, term67216.getClass(), "BD", null);
        setField(term67216, term67216.getClass(), "diagD", null);
        setField(term67216, term67216.getClass(), "C", null);
        setField(term67216, term67216.getClass(), "diagC", null);
        setIntField(term67216, term67216.getClass(), "iterations", 0);
        setField(term67216, term67216.getClass(), "fitnessHistory", null);
        setIntField(term67216, term67216.getClass(), "historySize", 0);
        setField(term67216, term67216.getClass(), "random", null);
        setField(term67216, term67216.getClass(), "statisticsSigmaHistory", null);
        setField(term67216, term67216.getClass(), "statisticsMeanHistory", null);
        setField(term67216, term67216.getClass(), "statisticsFitnessHistory", null);
        setField(term67216, term67216.getClass(), "statisticsDHistory", null);
        setField(term67216, term67216.getClass(), "lowerBound", null);
        setField(term67216, term67216.getClass(), "upperBound", null);
        setField(term67216, term67216.getClass(), "evaluations", null);
        setField(term67216, term67216.getClass(), "checker", null);
        setField(term67216, term67216.getClass(), "goal", null);
        setField(term67216, term67216.getClass(), "start", null);
        setField(term67216, term67216.getClass(), "function", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 2.2434717257378077E77;
        callMethod(klass, "updateBD", argTypes, term66378, args);
        assertTrue(recursiveEquals(term66378, term67216));
    }

};


