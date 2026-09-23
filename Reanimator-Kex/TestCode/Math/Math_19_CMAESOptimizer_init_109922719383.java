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

public class CMAESOptimizer_init_109922719383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52707;
     Object term53350;
     Object term53363;

    public CMAESOptimizer_init_109922719383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term53189 = new ArrayList();
        ArrayList term53241 = new ArrayList();
        Object term52931 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Object term53019 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term53137 = newInstance(Class.forName("org.apache.commons.math3.optimization.SimpleValueChecker"));
        setField(term52931, term52931.getClass(), "evaluations", term53019);
        setField(term52931, term52931.getClass(), "checker", term53137);
        setIntField(term52931, term52931.getClass(), "diagonalOnly", 0);
        setBooleanField(term52931, term52931.getClass(), "isMinimize", false);
        setBooleanField(term52931, term52931.getClass(), "generateStatistics", false);
        setField(term52931, term52931.getClass(), "statisticsSigmaHistory", null);
        setField(term52931, term52931.getClass(), "statisticsMeanHistory", term53189);
        setField(term52931, term52931.getClass(), "statisticsFitnessHistory", null);
        setField(term52931, term52931.getClass(), "statisticsDHistory", term53241);
        setIntField(term52931, term52931.getClass(), "lambda", 0);
        term52707 = (double[]) newDoubleArray(12);
        ArrayList term53352 = new ArrayList();
        ArrayList term53354 = new ArrayList();
        ArrayList term53356 = new ArrayList();
        ArrayList term53358 = new ArrayList();
        term53350 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[] term53351 = (double[]) newDoubleArray(12);
        Object term53360 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term53361 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        Object term53362 = newInstance(Class.forName("org.apache.commons.math3.optimization.SimpleValueChecker"));
        setIntField(term53350, term53350.getClass(), "lambda", 0);
        setBooleanField(term53350, term53350.getClass(), "isActiveCMA", false);
        setIntField(term53350, term53350.getClass(), "checkFeasableCount", 0);
        setField(term53350, term53350.getClass(), "boundaries", null);
        setField(term53350, term53350.getClass(), "inputSigma", term53351);
        setIntField(term53350, term53350.getClass(), "dimension", 0);
        setIntField(term53350, term53350.getClass(), "diagonalOnly", 0);
        setBooleanField(term53350, term53350.getClass(), "isMinimize", true);
        setBooleanField(term53350, term53350.getClass(), "generateStatistics", false);
        setIntField(term53350, term53350.getClass(), "maxIterations", 0);
        setDoubleField(term53350, term53350.getClass(), "stopFitness", 0.0);
        setDoubleField(term53350, term53350.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term53350, term53350.getClass(), "stopTolX", 0.0);
        setDoubleField(term53350, term53350.getClass(), "stopTolFun", 0.0);
        setDoubleField(term53350, term53350.getClass(), "stopTolHistFun", 0.0);
        setIntField(term53350, term53350.getClass(), "mu", 0);
        setDoubleField(term53350, term53350.getClass(), "logMu2", 0.0);
        setField(term53350, term53350.getClass(), "weights", null);
        setDoubleField(term53350, term53350.getClass(), "mueff", 0.0);
        setDoubleField(term53350, term53350.getClass(), "sigma", 0.0);
        setDoubleField(term53350, term53350.getClass(), "cc", 0.0);
        setDoubleField(term53350, term53350.getClass(), "cs", 0.0);
        setDoubleField(term53350, term53350.getClass(), "damps", 0.0);
        setDoubleField(term53350, term53350.getClass(), "ccov1", 0.0);
        setDoubleField(term53350, term53350.getClass(), "ccovmu", 0.0);
        setDoubleField(term53350, term53350.getClass(), "chiN", 0.0);
        setDoubleField(term53350, term53350.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term53350, term53350.getClass(), "ccovmuSep", 0.0);
        setField(term53350, term53350.getClass(), "xmean", null);
        setField(term53350, term53350.getClass(), "pc", null);
        setField(term53350, term53350.getClass(), "ps", null);
        setDoubleField(term53350, term53350.getClass(), "normps", 0.0);
        setField(term53350, term53350.getClass(), "B", null);
        setField(term53350, term53350.getClass(), "D", null);
        setField(term53350, term53350.getClass(), "BD", null);
        setField(term53350, term53350.getClass(), "diagD", null);
        setField(term53350, term53350.getClass(), "C", null);
        setField(term53350, term53350.getClass(), "diagC", null);
        setIntField(term53350, term53350.getClass(), "iterations", 0);
        setField(term53350, term53350.getClass(), "fitnessHistory", null);
        setIntField(term53350, term53350.getClass(), "historySize", 0);
        setField(term53350, term53350.getClass(), "random", null);
        setField(term53350, term53350.getClass(), "statisticsSigmaHistory", term53352);
        setField(term53350, term53350.getClass(), "statisticsMeanHistory", term53354);
        setField(term53350, term53350.getClass(), "statisticsFitnessHistory", term53356);
        setField(term53350, term53350.getClass(), "statisticsDHistory", term53358);
        setField(term53350, term53350.getClass(), "lowerBound", null);
        setField(term53350, term53350.getClass(), "upperBound", null);
        setIntField(term53360, term53360.getClass(), "maximalCount", 0);
        setIntField(term53360, term53360.getClass(), "count", 0);
        setField(term53360, term53360.getClass(), "maxCountCallback", term53361);
        setField(term53350, term53350.getClass(), "evaluations", term53360);
        setDoubleField(term53362, term53362.getClass(), "relativeThreshold", 1.1102230246251565E-14);
        setDoubleField(term53362, term53362.getClass(), "absoluteThreshold", 2.2250738585072014E-306);
        setField(term53350, term53350.getClass(), "checker", term53362);
        setField(term53350, term53350.getClass(), "goal", null);
        setField(term53350, term53350.getClass(), "start", null);
        setField(term53350, term53350.getClass(), "function", null);
        term53363 = (double[]) newDoubleArray(12);
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
        args[1] = term52707;
        args[2] = 0;
        args[3] = 0.0;
        args[4] = false;
        args[5] = 0;
        args[6] = 0;
        args[7] = null;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term53350));
        assertTrue(recursiveEquals(term52707, term53363));
    }

};


