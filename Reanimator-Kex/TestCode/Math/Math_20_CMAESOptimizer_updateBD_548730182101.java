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

public class CMAESOptimizer_updateBD_548730182101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58288;
     Object term59133;

    public CMAESOptimizer_updateBD_548730182101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58288 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setDoubleField(term58288, term58288.getClass(), "ccov1", 5.7420895251658179E18);
        setDoubleField(term58288, term58288.getClass(), "ccovmu", -3.4587645138184438E18);
        term59133 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setIntField(term59133, term59133.getClass(), "lambda", 0);
        setBooleanField(term59133, term59133.getClass(), "isActiveCMA", false);
        setIntField(term59133, term59133.getClass(), "checkFeasableCount", 0);
        setField(term59133, term59133.getClass(), "boundaries", null);
        setField(term59133, term59133.getClass(), "inputSigma", null);
        setIntField(term59133, term59133.getClass(), "dimension", 0);
        setIntField(term59133, term59133.getClass(), "diagonalOnly", 0);
        setBooleanField(term59133, term59133.getClass(), "isMinimize", false);
        setBooleanField(term59133, term59133.getClass(), "generateStatistics", false);
        setIntField(term59133, term59133.getClass(), "maxIterations", 0);
        setDoubleField(term59133, term59133.getClass(), "stopFitness", 0.0);
        setDoubleField(term59133, term59133.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term59133, term59133.getClass(), "stopTolX", 0.0);
        setDoubleField(term59133, term59133.getClass(), "stopTolFun", 0.0);
        setDoubleField(term59133, term59133.getClass(), "stopTolHistFun", 0.0);
        setIntField(term59133, term59133.getClass(), "mu", 0);
        setDoubleField(term59133, term59133.getClass(), "logMu2", 0.0);
        setField(term59133, term59133.getClass(), "weights", null);
        setDoubleField(term59133, term59133.getClass(), "mueff", 0.0);
        setDoubleField(term59133, term59133.getClass(), "sigma", 0.0);
        setDoubleField(term59133, term59133.getClass(), "cc", 0.0);
        setDoubleField(term59133, term59133.getClass(), "cs", 0.0);
        setDoubleField(term59133, term59133.getClass(), "damps", 0.0);
        setDoubleField(term59133, term59133.getClass(), "ccov1", 5.7420895251658179E18);
        setDoubleField(term59133, term59133.getClass(), "ccovmu", -3.4587645138184438E18);
        setDoubleField(term59133, term59133.getClass(), "chiN", 0.0);
        setDoubleField(term59133, term59133.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term59133, term59133.getClass(), "ccovmuSep", 0.0);
        setField(term59133, term59133.getClass(), "xmean", null);
        setField(term59133, term59133.getClass(), "pc", null);
        setField(term59133, term59133.getClass(), "ps", null);
        setDoubleField(term59133, term59133.getClass(), "normps", 0.0);
        setField(term59133, term59133.getClass(), "B", null);
        setField(term59133, term59133.getClass(), "D", null);
        setField(term59133, term59133.getClass(), "BD", null);
        setField(term59133, term59133.getClass(), "diagD", null);
        setField(term59133, term59133.getClass(), "C", null);
        setField(term59133, term59133.getClass(), "diagC", null);
        setIntField(term59133, term59133.getClass(), "iterations", 0);
        setField(term59133, term59133.getClass(), "fitnessHistory", null);
        setIntField(term59133, term59133.getClass(), "historySize", 0);
        setField(term59133, term59133.getClass(), "random", null);
        setField(term59133, term59133.getClass(), "statisticsSigmaHistory", null);
        setField(term59133, term59133.getClass(), "statisticsMeanHistory", null);
        setField(term59133, term59133.getClass(), "statisticsFitnessHistory", null);
        setField(term59133, term59133.getClass(), "statisticsDHistory", null);
        setField(term59133, term59133.getClass(), "lowerBound", null);
        setField(term59133, term59133.getClass(), "upperBound", null);
        setField(term59133, term59133.getClass(), "evaluations", null);
        setField(term59133, term59133.getClass(), "checker", null);
        setField(term59133, term59133.getClass(), "goal", null);
        setField(term59133, term59133.getClass(), "start", null);
        setField(term59133, term59133.getClass(), "function", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 2.2434717257378077E77;
        callMethod(klass, "updateBD", argTypes, term58288, args);
        assertTrue(recursiveEquals(term58288, term59133));
    }

};


