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
import java.lang.Object;
import java.util.ArrayList;

public class CMAESOptimizer_init_1099227193127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69250;

    public CMAESOptimizer_init_1099227193127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term69127 = new ArrayList();
        ArrayList term69179 = new ArrayList();
        Object term68869 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Object term68957 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term69075 = newInstance(Class.forName("org.apache.commons.math3.optimization.SimplePointChecker"));
        setField(term68869, term68869.getClass(), "evaluations", term68957);
        setField(term68869, term68869.getClass(), "checker", term69075);
        setIntField(term68869, term68869.getClass(), "diagonalOnly", 0);
        setBooleanField(term68869, term68869.getClass(), "isMinimize", false);
        setBooleanField(term68869, term68869.getClass(), "generateStatistics", false);
        setField(term68869, term68869.getClass(), "statisticsSigmaHistory", null);
        setField(term68869, term68869.getClass(), "statisticsMeanHistory", term69127);
        setField(term68869, term68869.getClass(), "statisticsFitnessHistory", null);
        setField(term68869, term68869.getClass(), "statisticsDHistory", term69179);
        setIntField(term68869, term68869.getClass(), "lambda", 0);
        ArrayList term69251 = new ArrayList();
        ArrayList term69253 = new ArrayList();
        ArrayList term69255 = new ArrayList();
        ArrayList term69257 = new ArrayList();
        term69250 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Object term69259 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term69260 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        Object term69261 = newInstance(Class.forName("org.apache.commons.math3.optimization.SimpleValueChecker"));
        setIntField(term69250, term69250.getClass(), "lambda", 0);
        setBooleanField(term69250, term69250.getClass(), "isActiveCMA", false);
        setIntField(term69250, term69250.getClass(), "checkFeasableCount", 0);
        setField(term69250, term69250.getClass(), "boundaries", null);
        setField(term69250, term69250.getClass(), "inputSigma", null);
        setIntField(term69250, term69250.getClass(), "dimension", 0);
        setIntField(term69250, term69250.getClass(), "diagonalOnly", 0);
        setBooleanField(term69250, term69250.getClass(), "isMinimize", true);
        setBooleanField(term69250, term69250.getClass(), "generateStatistics", false);
        setIntField(term69250, term69250.getClass(), "maxIterations", 0);
        setDoubleField(term69250, term69250.getClass(), "stopFitness", 0.0);
        setDoubleField(term69250, term69250.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term69250, term69250.getClass(), "stopTolX", 0.0);
        setDoubleField(term69250, term69250.getClass(), "stopTolFun", 0.0);
        setDoubleField(term69250, term69250.getClass(), "stopTolHistFun", 0.0);
        setIntField(term69250, term69250.getClass(), "mu", 0);
        setDoubleField(term69250, term69250.getClass(), "logMu2", 0.0);
        setField(term69250, term69250.getClass(), "weights", null);
        setDoubleField(term69250, term69250.getClass(), "mueff", 0.0);
        setDoubleField(term69250, term69250.getClass(), "sigma", 0.0);
        setDoubleField(term69250, term69250.getClass(), "cc", 0.0);
        setDoubleField(term69250, term69250.getClass(), "cs", 0.0);
        setDoubleField(term69250, term69250.getClass(), "damps", 0.0);
        setDoubleField(term69250, term69250.getClass(), "ccov1", 0.0);
        setDoubleField(term69250, term69250.getClass(), "ccovmu", 0.0);
        setDoubleField(term69250, term69250.getClass(), "chiN", 0.0);
        setDoubleField(term69250, term69250.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term69250, term69250.getClass(), "ccovmuSep", 0.0);
        setField(term69250, term69250.getClass(), "xmean", null);
        setField(term69250, term69250.getClass(), "pc", null);
        setField(term69250, term69250.getClass(), "ps", null);
        setDoubleField(term69250, term69250.getClass(), "normps", 0.0);
        setField(term69250, term69250.getClass(), "B", null);
        setField(term69250, term69250.getClass(), "D", null);
        setField(term69250, term69250.getClass(), "BD", null);
        setField(term69250, term69250.getClass(), "diagD", null);
        setField(term69250, term69250.getClass(), "C", null);
        setField(term69250, term69250.getClass(), "diagC", null);
        setIntField(term69250, term69250.getClass(), "iterations", 0);
        setField(term69250, term69250.getClass(), "fitnessHistory", null);
        setIntField(term69250, term69250.getClass(), "historySize", 0);
        setField(term69250, term69250.getClass(), "random", null);
        setField(term69250, term69250.getClass(), "statisticsSigmaHistory", term69251);
        setField(term69250, term69250.getClass(), "statisticsMeanHistory", term69253);
        setField(term69250, term69250.getClass(), "statisticsFitnessHistory", term69255);
        setField(term69250, term69250.getClass(), "statisticsDHistory", term69257);
        setField(term69250, term69250.getClass(), "lowerBound", null);
        setField(term69250, term69250.getClass(), "upperBound", null);
        setIntField(term69259, term69259.getClass(), "maximalCount", 0);
        setIntField(term69259, term69259.getClass(), "count", 0);
        setField(term69259, term69259.getClass(), "maxCountCallback", term69260);
        setField(term69250, term69250.getClass(), "evaluations", term69259);
        setDoubleField(term69261, term69261.getClass(), "relativeThreshold", 1.1102230246251565E-14);
        setDoubleField(term69261, term69261.getClass(), "absoluteThreshold", 2.2250738585072014E-306);
        setField(term69250, term69250.getClass(), "checker", term69261);
        setField(term69250, term69250.getClass(), "goal", null);
        setField(term69250, term69250.getClass(), "start", null);
        setField(term69250, term69250.getClass(), "function", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = double.class;
        argTypes[4] = boolean.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = Class.forName("org.apache.commons.math3.random.RandomGenerator");
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = 0;
        args[1] = null;
        args[2] = 0;
        args[3] = 0.0;
        args[4] = false;
        args[5] = 0;
        args[6] = 0;
        args[7] = null;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term69250));
    }

};


