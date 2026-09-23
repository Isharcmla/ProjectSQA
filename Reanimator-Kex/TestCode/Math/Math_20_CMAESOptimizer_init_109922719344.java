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

public class CMAESOptimizer_init_109922719344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16;
     Object term18;
     Object term23;
     Object term25;
     Object term27;
     Object term29;
     Object term31;
     Object term33;
     Object term25186;
     Object term25199;

    public CMAESOptimizer_init_109922719344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16 = new Integer(1484323161);
        term18 = (double[]) newDoubleArray(4);
        setDoubleElement(term18, 0, 0.40176586625454525);
        setDoubleElement(term18, 1, 0.2641345529914265);
        setDoubleElement(term18, 2, 0.36923381893433327);
        setDoubleElement(term18, 3, 0.6076495596892013);
        term23 = new Integer(391863371);
        term25 = new Double(0.37773193782763337);
        term27 = new Boolean(false);
        term29 = new Integer(-1922583790);
        term31 = new Integer(-616727354);
        term33 = new Boolean(false);
        ArrayList term25188 = new ArrayList();
        ArrayList term25190 = new ArrayList();
        ArrayList term25192 = new ArrayList();
        ArrayList term25194 = new ArrayList();
        term25186 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[] term25187 = (double[]) newDoubleArray(4);
        Object term25196 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term25197 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        Object term25198 = newInstance(Class.forName("org.apache.commons.math3.optimization.SimpleValueChecker"));
        setIntField(term25186, term25186.getClass(), "lambda", 1484323161);
        setBooleanField(term25186, term25186.getClass(), "isActiveCMA", false);
        setIntField(term25186, term25186.getClass(), "checkFeasableCount", -616727354);
        setField(term25186, term25186.getClass(), "boundaries", null);
        setDoubleElement(term25187, 0, 0.40176586625454525);
        setDoubleElement(term25187, 1, 0.2641345529914265);
        setDoubleElement(term25187, 2, 0.36923381893433327);
        setDoubleElement(term25187, 3, 0.6076495596892013);
        setField(term25186, term25186.getClass(), "inputSigma", term25187);
        setIntField(term25186, term25186.getClass(), "dimension", 0);
        setIntField(term25186, term25186.getClass(), "diagonalOnly", -1922583790);
        setBooleanField(term25186, term25186.getClass(), "isMinimize", true);
        setBooleanField(term25186, term25186.getClass(), "generateStatistics", false);
        setIntField(term25186, term25186.getClass(), "maxIterations", 391863371);
        setDoubleField(term25186, term25186.getClass(), "stopFitness", 0.37773193782763337);
        setDoubleField(term25186, term25186.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term25186, term25186.getClass(), "stopTolX", 0.0);
        setDoubleField(term25186, term25186.getClass(), "stopTolFun", 0.0);
        setDoubleField(term25186, term25186.getClass(), "stopTolHistFun", 0.0);
        setIntField(term25186, term25186.getClass(), "mu", 0);
        setDoubleField(term25186, term25186.getClass(), "logMu2", 0.0);
        setField(term25186, term25186.getClass(), "weights", null);
        setDoubleField(term25186, term25186.getClass(), "mueff", 0.0);
        setDoubleField(term25186, term25186.getClass(), "sigma", 0.0);
        setDoubleField(term25186, term25186.getClass(), "cc", 0.0);
        setDoubleField(term25186, term25186.getClass(), "cs", 0.0);
        setDoubleField(term25186, term25186.getClass(), "damps", 0.0);
        setDoubleField(term25186, term25186.getClass(), "ccov1", 0.0);
        setDoubleField(term25186, term25186.getClass(), "ccovmu", 0.0);
        setDoubleField(term25186, term25186.getClass(), "chiN", 0.0);
        setDoubleField(term25186, term25186.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term25186, term25186.getClass(), "ccovmuSep", 0.0);
        setField(term25186, term25186.getClass(), "xmean", null);
        setField(term25186, term25186.getClass(), "pc", null);
        setField(term25186, term25186.getClass(), "ps", null);
        setDoubleField(term25186, term25186.getClass(), "normps", 0.0);
        setField(term25186, term25186.getClass(), "B", null);
        setField(term25186, term25186.getClass(), "D", null);
        setField(term25186, term25186.getClass(), "BD", null);
        setField(term25186, term25186.getClass(), "diagD", null);
        setField(term25186, term25186.getClass(), "C", null);
        setField(term25186, term25186.getClass(), "diagC", null);
        setIntField(term25186, term25186.getClass(), "iterations", 0);
        setField(term25186, term25186.getClass(), "fitnessHistory", null);
        setIntField(term25186, term25186.getClass(), "historySize", 0);
        setField(term25186, term25186.getClass(), "random", null);
        setField(term25186, term25186.getClass(), "statisticsSigmaHistory", term25188);
        setField(term25186, term25186.getClass(), "statisticsMeanHistory", term25190);
        setField(term25186, term25186.getClass(), "statisticsFitnessHistory", term25192);
        setField(term25186, term25186.getClass(), "statisticsDHistory", term25194);
        setField(term25186, term25186.getClass(), "lowerBound", null);
        setField(term25186, term25186.getClass(), "upperBound", null);
        setIntField(term25196, term25196.getClass(), "maximalCount", 0);
        setIntField(term25196, term25196.getClass(), "count", 0);
        setField(term25196, term25196.getClass(), "maxCountCallback", term25197);
        setField(term25186, term25186.getClass(), "evaluations", term25196);
        setDoubleField(term25198, term25198.getClass(), "relativeThreshold", 1.1102230246251565E-14);
        setDoubleField(term25198, term25198.getClass(), "absoluteThreshold", 2.2250738585072014E-306);
        setField(term25186, term25186.getClass(), "checker", term25198);
        setField(term25186, term25186.getClass(), "goal", null);
        setField(term25186, term25186.getClass(), "start", null);
        setField(term25186, term25186.getClass(), "function", null);
        term25199 = (double[]) newDoubleArray(4);
        setDoubleElement(term25199, 0, 0.40176586625454525);
        setDoubleElement(term25199, 1, 0.2641345529914265);
        setDoubleElement(term25199, 2, 0.36923381893433327);
        setDoubleElement(term25199, 3, 0.6076495596892013);
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
        args[0] = term16;
        args[1] = term18;
        args[2] = term23;
        args[3] = term25;
        args[4] = term27;
        args[5] = term29;
        args[6] = term31;
        args[7] = null;
        args[8] = term33;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term25186));
        assertTrue(recursiveEquals(term16, 1484323161));
        assertTrue(recursiveEquals(term18, term25199));
        assertTrue(recursiveEquals(term23, 391863371));
        assertTrue(recursiveEquals(term25, 0.37773193782763337));
        assertTrue(recursiveEquals(term27, false));
        assertTrue(recursiveEquals(term29, -1922583790));
        assertTrue(recursiveEquals(term31, -616727354));
        assertTrue(recursiveEquals(term33, false));
    }

};


