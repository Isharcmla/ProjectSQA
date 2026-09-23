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

public class CMAESOptimizer_updateCovariance_130250242176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89704;
     Object term89808;
     Object term89847;
     Object term89848;

    public CMAESOptimizer_updateCovariance_130250242176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89704 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setDoubleField(term89704, term89704.getClass(), "ccov1", 1.3651536370466816E16);
        setDoubleField(term89704, term89704.getClass(), "ccovmu", -9.2194313871808266E18);
        setIntField(term89704, term89704.getClass(), "mu", 0);
        term89808 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        term89847 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setIntField(term89847, term89847.getClass(), "lambda", 0);
        setBooleanField(term89847, term89847.getClass(), "isActiveCMA", false);
        setIntField(term89847, term89847.getClass(), "checkFeasableCount", 0);
        setField(term89847, term89847.getClass(), "boundaries", null);
        setField(term89847, term89847.getClass(), "inputSigma", null);
        setIntField(term89847, term89847.getClass(), "dimension", 0);
        setIntField(term89847, term89847.getClass(), "diagonalOnly", 0);
        setBooleanField(term89847, term89847.getClass(), "isMinimize", false);
        setBooleanField(term89847, term89847.getClass(), "generateStatistics", false);
        setIntField(term89847, term89847.getClass(), "maxIterations", 0);
        setDoubleField(term89847, term89847.getClass(), "stopFitness", 0.0);
        setDoubleField(term89847, term89847.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term89847, term89847.getClass(), "stopTolX", 0.0);
        setDoubleField(term89847, term89847.getClass(), "stopTolFun", 0.0);
        setDoubleField(term89847, term89847.getClass(), "stopTolHistFun", 0.0);
        setIntField(term89847, term89847.getClass(), "mu", 0);
        setDoubleField(term89847, term89847.getClass(), "logMu2", 0.0);
        setField(term89847, term89847.getClass(), "weights", null);
        setDoubleField(term89847, term89847.getClass(), "mueff", 0.0);
        setDoubleField(term89847, term89847.getClass(), "sigma", 0.0);
        setDoubleField(term89847, term89847.getClass(), "cc", 0.0);
        setDoubleField(term89847, term89847.getClass(), "cs", 0.0);
        setDoubleField(term89847, term89847.getClass(), "damps", 0.0);
        setDoubleField(term89847, term89847.getClass(), "ccov1", 1.3651536370466816E16);
        setDoubleField(term89847, term89847.getClass(), "ccovmu", -9.2194313871808266E18);
        setDoubleField(term89847, term89847.getClass(), "chiN", 0.0);
        setDoubleField(term89847, term89847.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term89847, term89847.getClass(), "ccovmuSep", 0.0);
        setField(term89847, term89847.getClass(), "xmean", null);
        setField(term89847, term89847.getClass(), "pc", null);
        setField(term89847, term89847.getClass(), "ps", null);
        setDoubleField(term89847, term89847.getClass(), "normps", 0.0);
        setField(term89847, term89847.getClass(), "B", null);
        setField(term89847, term89847.getClass(), "D", null);
        setField(term89847, term89847.getClass(), "BD", null);
        setField(term89847, term89847.getClass(), "diagD", null);
        setField(term89847, term89847.getClass(), "C", null);
        setField(term89847, term89847.getClass(), "diagC", null);
        setIntField(term89847, term89847.getClass(), "iterations", 0);
        setField(term89847, term89847.getClass(), "fitnessHistory", null);
        setIntField(term89847, term89847.getClass(), "historySize", 0);
        setField(term89847, term89847.getClass(), "random", null);
        setField(term89847, term89847.getClass(), "statisticsSigmaHistory", null);
        setField(term89847, term89847.getClass(), "statisticsMeanHistory", null);
        setField(term89847, term89847.getClass(), "statisticsFitnessHistory", null);
        setField(term89847, term89847.getClass(), "statisticsDHistory", null);
        setField(term89847, term89847.getClass(), "lowerBound", null);
        setField(term89847, term89847.getClass(), "upperBound", null);
        setField(term89847, term89847.getClass(), "evaluations", null);
        setField(term89847, term89847.getClass(), "checker", null);
        setField(term89847, term89847.getClass(), "goal", null);
        setField(term89847, term89847.getClass(), "start", null);
        setField(term89847, term89847.getClass(), "function", null);
        term89848 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setIntField(term89848, term89848.getClass(), "rows", 0);
        setIntField(term89848, term89848.getClass(), "columns", 0);
        setField(term89848, term89848.getClass(), "entries", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[2] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[3] = Array.newInstance(int.class, 0).getClass();
        argTypes[4] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Object[] args = new Object[5];
        args[0] = false;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term89808;
        callMethod(klass, "updateCovariance", argTypes, term89704, args);
        assertTrue(recursiveEquals(term89704, term89847));
        assertTrue(recursiveEquals(term89808, term89848));
    }

};


