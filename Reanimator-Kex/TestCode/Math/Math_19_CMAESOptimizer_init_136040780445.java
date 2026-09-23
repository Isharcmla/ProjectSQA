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
import java.lang.Integer;
import java.lang.Double;
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Object;

public class CMAESOptimizer_init_136040780445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39;
     Object term41;
     Object term45;
     Object term47;
     Object term49;
     Object term51;
     Object term53;
     Object term55;
     Object term25284;
     Object term25296;

    public CMAESOptimizer_init_136040780445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39 = new Integer(-1955890973);
        term41 = (double[]) newDoubleArray(3);
        setDoubleElement(term41, 0, 0.8474802076607362);
        setDoubleElement(term41, 1, 0.5183269973490326);
        setDoubleElement(term41, 2, 0.7655020693602768);
        term45 = new Integer(-2038273078);
        term47 = new Double(0.1374549299694151);
        term49 = new Boolean(false);
        term51 = new Integer(1227103734);
        term53 = new Integer(-1339778481);
        term55 = new Boolean(false);
        ArrayList term25286 = new ArrayList();
        ArrayList term25288 = new ArrayList();
        ArrayList term25290 = new ArrayList();
        ArrayList term25292 = new ArrayList();
        term25284 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[] term25285 = (double[]) newDoubleArray(3);
        Object term25294 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term25295 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        setIntField(term25284, term25284.getClass(), "lambda", -1955890973);
        setBooleanField(term25284, term25284.getClass(), "isActiveCMA", false);
        setIntField(term25284, term25284.getClass(), "checkFeasableCount", -1339778481);
        setField(term25284, term25284.getClass(), "boundaries", null);
        setDoubleElement(term25285, 0, 0.8474802076607362);
        setDoubleElement(term25285, 1, 0.5183269973490326);
        setDoubleElement(term25285, 2, 0.7655020693602768);
        setField(term25284, term25284.getClass(), "inputSigma", term25285);
        setIntField(term25284, term25284.getClass(), "dimension", 0);
        setIntField(term25284, term25284.getClass(), "diagonalOnly", 1227103734);
        setBooleanField(term25284, term25284.getClass(), "isMinimize", true);
        setBooleanField(term25284, term25284.getClass(), "generateStatistics", false);
        setIntField(term25284, term25284.getClass(), "maxIterations", -2038273078);
        setDoubleField(term25284, term25284.getClass(), "stopFitness", 0.1374549299694151);
        setDoubleField(term25284, term25284.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term25284, term25284.getClass(), "stopTolX", 0.0);
        setDoubleField(term25284, term25284.getClass(), "stopTolFun", 0.0);
        setDoubleField(term25284, term25284.getClass(), "stopTolHistFun", 0.0);
        setIntField(term25284, term25284.getClass(), "mu", 0);
        setDoubleField(term25284, term25284.getClass(), "logMu2", 0.0);
        setField(term25284, term25284.getClass(), "weights", null);
        setDoubleField(term25284, term25284.getClass(), "mueff", 0.0);
        setDoubleField(term25284, term25284.getClass(), "sigma", 0.0);
        setDoubleField(term25284, term25284.getClass(), "cc", 0.0);
        setDoubleField(term25284, term25284.getClass(), "cs", 0.0);
        setDoubleField(term25284, term25284.getClass(), "damps", 0.0);
        setDoubleField(term25284, term25284.getClass(), "ccov1", 0.0);
        setDoubleField(term25284, term25284.getClass(), "ccovmu", 0.0);
        setDoubleField(term25284, term25284.getClass(), "chiN", 0.0);
        setDoubleField(term25284, term25284.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term25284, term25284.getClass(), "ccovmuSep", 0.0);
        setField(term25284, term25284.getClass(), "xmean", null);
        setField(term25284, term25284.getClass(), "pc", null);
        setField(term25284, term25284.getClass(), "ps", null);
        setDoubleField(term25284, term25284.getClass(), "normps", 0.0);
        setField(term25284, term25284.getClass(), "B", null);
        setField(term25284, term25284.getClass(), "D", null);
        setField(term25284, term25284.getClass(), "BD", null);
        setField(term25284, term25284.getClass(), "diagD", null);
        setField(term25284, term25284.getClass(), "C", null);
        setField(term25284, term25284.getClass(), "diagC", null);
        setIntField(term25284, term25284.getClass(), "iterations", 0);
        setField(term25284, term25284.getClass(), "fitnessHistory", null);
        setIntField(term25284, term25284.getClass(), "historySize", 0);
        setField(term25284, term25284.getClass(), "random", null);
        setField(term25284, term25284.getClass(), "statisticsSigmaHistory", term25286);
        setField(term25284, term25284.getClass(), "statisticsMeanHistory", term25288);
        setField(term25284, term25284.getClass(), "statisticsFitnessHistory", term25290);
        setField(term25284, term25284.getClass(), "statisticsDHistory", term25292);
        setField(term25284, term25284.getClass(), "lowerBound", null);
        setField(term25284, term25284.getClass(), "upperBound", null);
        setIntField(term25294, term25294.getClass(), "maximalCount", 0);
        setIntField(term25294, term25294.getClass(), "count", 0);
        setField(term25294, term25294.getClass(), "maxCountCallback", term25295);
        setField(term25284, term25284.getClass(), "evaluations", term25294);
        setField(term25284, term25284.getClass(), "checker", null);
        setField(term25284, term25284.getClass(), "goal", null);
        setField(term25284, term25284.getClass(), "start", null);
        setField(term25284, term25284.getClass(), "function", null);
        term25296 = (double[]) newDoubleArray(3);
        setDoubleElement(term25296, 0, 0.8474802076607362);
        setDoubleElement(term25296, 1, 0.5183269973490326);
        setDoubleElement(term25296, 2, 0.7655020693602768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = double.class;
        argTypes[4] = boolean.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = Class.forName("org.apache.commons.math3.random.RandomGenerator");
        argTypes[8] = boolean.class;
        argTypes[9] = Class.forName("org.apache.commons.math3.optimization.ConvergenceChecker");
        Object[] args = new Object[10];
        args[0] = term39;
        args[1] = term41;
        args[2] = term45;
        args[3] = term47;
        args[4] = term49;
        args[5] = term51;
        args[6] = term53;
        args[7] = null;
        args[8] = term55;
        args[9] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term25284));
        assertTrue(recursiveEquals(term39, null));
        assertTrue(recursiveEquals(term41, -1955890973));
        assertTrue(recursiveEquals(term45, term25296));
        assertTrue(recursiveEquals(term47, -2038273078));
        assertTrue(recursiveEquals(term49, 0.1374549299694151));
        assertTrue(recursiveEquals(term51, false));
        assertTrue(recursiveEquals(term53, 1227103734));
        assertTrue(recursiveEquals(term55, null));
    }

};


