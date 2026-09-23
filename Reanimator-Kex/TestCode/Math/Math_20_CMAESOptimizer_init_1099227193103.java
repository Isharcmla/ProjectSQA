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

public class CMAESOptimizer_init_1099227193103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59728;

    public CMAESOptimizer_init_1099227193103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term59605 = new ArrayList();
        ArrayList term59657 = new ArrayList();
        Object term59347 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Object term59435 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term59553 = newInstance(Class.forName("org.apache.commons.math3.optimization.SimplePointChecker"));
        setField(term59347, term59347.getClass(), "evaluations", term59435);
        setField(term59347, term59347.getClass(), "checker", term59553);
        setIntField(term59347, term59347.getClass(), "diagonalOnly", 0);
        setBooleanField(term59347, term59347.getClass(), "isMinimize", false);
        setBooleanField(term59347, term59347.getClass(), "generateStatistics", false);
        setField(term59347, term59347.getClass(), "statisticsSigmaHistory", null);
        setField(term59347, term59347.getClass(), "statisticsMeanHistory", term59605);
        setField(term59347, term59347.getClass(), "statisticsFitnessHistory", null);
        setField(term59347, term59347.getClass(), "statisticsDHistory", term59657);
        setIntField(term59347, term59347.getClass(), "lambda", 0);
        ArrayList term59729 = new ArrayList();
        ArrayList term59731 = new ArrayList();
        ArrayList term59733 = new ArrayList();
        ArrayList term59735 = new ArrayList();
        term59728 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Object term59737 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term59738 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        Object term59739 = newInstance(Class.forName("org.apache.commons.math3.optimization.SimpleValueChecker"));
        setIntField(term59728, term59728.getClass(), "lambda", 0);
        setBooleanField(term59728, term59728.getClass(), "isActiveCMA", false);
        setIntField(term59728, term59728.getClass(), "checkFeasableCount", 0);
        setField(term59728, term59728.getClass(), "boundaries", null);
        setField(term59728, term59728.getClass(), "inputSigma", null);
        setIntField(term59728, term59728.getClass(), "dimension", 0);
        setIntField(term59728, term59728.getClass(), "diagonalOnly", 0);
        setBooleanField(term59728, term59728.getClass(), "isMinimize", true);
        setBooleanField(term59728, term59728.getClass(), "generateStatistics", false);
        setIntField(term59728, term59728.getClass(), "maxIterations", 0);
        setDoubleField(term59728, term59728.getClass(), "stopFitness", 0.0);
        setDoubleField(term59728, term59728.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term59728, term59728.getClass(), "stopTolX", 0.0);
        setDoubleField(term59728, term59728.getClass(), "stopTolFun", 0.0);
        setDoubleField(term59728, term59728.getClass(), "stopTolHistFun", 0.0);
        setIntField(term59728, term59728.getClass(), "mu", 0);
        setDoubleField(term59728, term59728.getClass(), "logMu2", 0.0);
        setField(term59728, term59728.getClass(), "weights", null);
        setDoubleField(term59728, term59728.getClass(), "mueff", 0.0);
        setDoubleField(term59728, term59728.getClass(), "sigma", 0.0);
        setDoubleField(term59728, term59728.getClass(), "cc", 0.0);
        setDoubleField(term59728, term59728.getClass(), "cs", 0.0);
        setDoubleField(term59728, term59728.getClass(), "damps", 0.0);
        setDoubleField(term59728, term59728.getClass(), "ccov1", 0.0);
        setDoubleField(term59728, term59728.getClass(), "ccovmu", 0.0);
        setDoubleField(term59728, term59728.getClass(), "chiN", 0.0);
        setDoubleField(term59728, term59728.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term59728, term59728.getClass(), "ccovmuSep", 0.0);
        setField(term59728, term59728.getClass(), "xmean", null);
        setField(term59728, term59728.getClass(), "pc", null);
        setField(term59728, term59728.getClass(), "ps", null);
        setDoubleField(term59728, term59728.getClass(), "normps", 0.0);
        setField(term59728, term59728.getClass(), "B", null);
        setField(term59728, term59728.getClass(), "D", null);
        setField(term59728, term59728.getClass(), "BD", null);
        setField(term59728, term59728.getClass(), "diagD", null);
        setField(term59728, term59728.getClass(), "C", null);
        setField(term59728, term59728.getClass(), "diagC", null);
        setIntField(term59728, term59728.getClass(), "iterations", 0);
        setField(term59728, term59728.getClass(), "fitnessHistory", null);
        setIntField(term59728, term59728.getClass(), "historySize", 0);
        setField(term59728, term59728.getClass(), "random", null);
        setField(term59728, term59728.getClass(), "statisticsSigmaHistory", term59729);
        setField(term59728, term59728.getClass(), "statisticsMeanHistory", term59731);
        setField(term59728, term59728.getClass(), "statisticsFitnessHistory", term59733);
        setField(term59728, term59728.getClass(), "statisticsDHistory", term59735);
        setField(term59728, term59728.getClass(), "lowerBound", null);
        setField(term59728, term59728.getClass(), "upperBound", null);
        setIntField(term59737, term59737.getClass(), "maximalCount", 0);
        setIntField(term59737, term59737.getClass(), "count", 0);
        setField(term59737, term59737.getClass(), "maxCountCallback", term59738);
        setField(term59728, term59728.getClass(), "evaluations", term59737);
        setDoubleField(term59739, term59739.getClass(), "relativeThreshold", 1.1102230246251565E-14);
        setDoubleField(term59739, term59739.getClass(), "absoluteThreshold", 2.2250738585072014E-306);
        setField(term59728, term59728.getClass(), "checker", term59739);
        setField(term59728, term59728.getClass(), "goal", null);
        setField(term59728, term59728.getClass(), "start", null);
        setField(term59728, term59728.getClass(), "function", null);
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
        assertTrue(recursiveEquals(instance, term59728));
    }

};


