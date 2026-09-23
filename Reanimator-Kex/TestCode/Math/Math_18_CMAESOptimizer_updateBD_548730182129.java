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

public class CMAESOptimizer_updateBD_548730182129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70940;
     Object term71010;

    public CMAESOptimizer_updateBD_548730182129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70940 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setDoubleField(term70940, term70940.getClass(), "ccov1", 5.7420895251658179E18);
        setDoubleField(term70940, term70940.getClass(), "ccovmu", -3.4587645138184438E18);
        term71010 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setIntField(term71010, term71010.getClass(), "lambda", 0);
        setBooleanField(term71010, term71010.getClass(), "isActiveCMA", false);
        setIntField(term71010, term71010.getClass(), "checkFeasableCount", 0);
        setField(term71010, term71010.getClass(), "boundaries", null);
        setField(term71010, term71010.getClass(), "inputSigma", null);
        setIntField(term71010, term71010.getClass(), "dimension", 0);
        setIntField(term71010, term71010.getClass(), "diagonalOnly", 0);
        setBooleanField(term71010, term71010.getClass(), "isMinimize", false);
        setBooleanField(term71010, term71010.getClass(), "generateStatistics", false);
        setIntField(term71010, term71010.getClass(), "maxIterations", 0);
        setDoubleField(term71010, term71010.getClass(), "stopFitness", 0.0);
        setDoubleField(term71010, term71010.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term71010, term71010.getClass(), "stopTolX", 0.0);
        setDoubleField(term71010, term71010.getClass(), "stopTolFun", 0.0);
        setDoubleField(term71010, term71010.getClass(), "stopTolHistFun", 0.0);
        setIntField(term71010, term71010.getClass(), "mu", 0);
        setDoubleField(term71010, term71010.getClass(), "logMu2", 0.0);
        setField(term71010, term71010.getClass(), "weights", null);
        setDoubleField(term71010, term71010.getClass(), "mueff", 0.0);
        setDoubleField(term71010, term71010.getClass(), "sigma", 0.0);
        setDoubleField(term71010, term71010.getClass(), "cc", 0.0);
        setDoubleField(term71010, term71010.getClass(), "cs", 0.0);
        setDoubleField(term71010, term71010.getClass(), "damps", 0.0);
        setDoubleField(term71010, term71010.getClass(), "ccov1", 5.7420895251658179E18);
        setDoubleField(term71010, term71010.getClass(), "ccovmu", -3.4587645138184438E18);
        setDoubleField(term71010, term71010.getClass(), "chiN", 0.0);
        setDoubleField(term71010, term71010.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term71010, term71010.getClass(), "ccovmuSep", 0.0);
        setField(term71010, term71010.getClass(), "xmean", null);
        setField(term71010, term71010.getClass(), "pc", null);
        setField(term71010, term71010.getClass(), "ps", null);
        setDoubleField(term71010, term71010.getClass(), "normps", 0.0);
        setField(term71010, term71010.getClass(), "B", null);
        setField(term71010, term71010.getClass(), "D", null);
        setField(term71010, term71010.getClass(), "BD", null);
        setField(term71010, term71010.getClass(), "diagD", null);
        setField(term71010, term71010.getClass(), "C", null);
        setField(term71010, term71010.getClass(), "diagC", null);
        setIntField(term71010, term71010.getClass(), "iterations", 0);
        setField(term71010, term71010.getClass(), "fitnessHistory", null);
        setIntField(term71010, term71010.getClass(), "historySize", 0);
        setField(term71010, term71010.getClass(), "random", null);
        setField(term71010, term71010.getClass(), "statisticsSigmaHistory", null);
        setField(term71010, term71010.getClass(), "statisticsMeanHistory", null);
        setField(term71010, term71010.getClass(), "statisticsFitnessHistory", null);
        setField(term71010, term71010.getClass(), "statisticsDHistory", null);
        setField(term71010, term71010.getClass(), "lowerBound", null);
        setField(term71010, term71010.getClass(), "upperBound", null);
        setField(term71010, term71010.getClass(), "evaluations", null);
        setField(term71010, term71010.getClass(), "checker", null);
        setField(term71010, term71010.getClass(), "goal", null);
        setField(term71010, term71010.getClass(), "start", null);
        setField(term71010, term71010.getClass(), "function", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 2.2434717257378077E77;
        callMethod(klass, "updateBD", argTypes, term70940, args);
        assertTrue(recursiveEquals(term70940, term71010));
    }

};


