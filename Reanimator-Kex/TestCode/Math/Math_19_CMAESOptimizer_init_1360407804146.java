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

public class CMAESOptimizer_init_1360407804146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76661;

    public CMAESOptimizer_init_1360407804146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term74347 = new ArrayList();
        ArrayList term74399 = new ArrayList();
        ArrayList term74451 = new ArrayList();
        Object term74047 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Object term74135 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term74295 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.SimpleUnivariateValueChecker"));
        setField(term74047, term74047.getClass(), "evaluations", term74135);
        setField(term74047, term74047.getClass(), "checker", term74295);
        setIntField(term74047, term74047.getClass(), "diagonalOnly", 0);
        setBooleanField(term74047, term74047.getClass(), "isMinimize", false);
        setBooleanField(term74047, term74047.getClass(), "generateStatistics", false);
        setField(term74047, term74047.getClass(), "statisticsSigmaHistory", term74347);
        setField(term74047, term74047.getClass(), "statisticsMeanHistory", term74399);
        setField(term74047, term74047.getClass(), "statisticsFitnessHistory", null);
        setField(term74047, term74047.getClass(), "statisticsDHistory", term74451);
        setIntField(term74047, term74047.getClass(), "lambda", 0);
        ArrayList term76662 = new ArrayList();
        ArrayList term76664 = new ArrayList();
        ArrayList term76666 = new ArrayList();
        ArrayList term76668 = new ArrayList();
        term76661 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Object term76670 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term76671 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        setIntField(term76661, term76661.getClass(), "lambda", 0);
        setBooleanField(term76661, term76661.getClass(), "isActiveCMA", false);
        setIntField(term76661, term76661.getClass(), "checkFeasableCount", 0);
        setField(term76661, term76661.getClass(), "boundaries", null);
        setField(term76661, term76661.getClass(), "inputSigma", null);
        setIntField(term76661, term76661.getClass(), "dimension", 0);
        setIntField(term76661, term76661.getClass(), "diagonalOnly", 0);
        setBooleanField(term76661, term76661.getClass(), "isMinimize", true);
        setBooleanField(term76661, term76661.getClass(), "generateStatistics", false);
        setIntField(term76661, term76661.getClass(), "maxIterations", 0);
        setDoubleField(term76661, term76661.getClass(), "stopFitness", 0.0);
        setDoubleField(term76661, term76661.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term76661, term76661.getClass(), "stopTolX", 0.0);
        setDoubleField(term76661, term76661.getClass(), "stopTolFun", 0.0);
        setDoubleField(term76661, term76661.getClass(), "stopTolHistFun", 0.0);
        setIntField(term76661, term76661.getClass(), "mu", 0);
        setDoubleField(term76661, term76661.getClass(), "logMu2", 0.0);
        setField(term76661, term76661.getClass(), "weights", null);
        setDoubleField(term76661, term76661.getClass(), "mueff", 0.0);
        setDoubleField(term76661, term76661.getClass(), "sigma", 0.0);
        setDoubleField(term76661, term76661.getClass(), "cc", 0.0);
        setDoubleField(term76661, term76661.getClass(), "cs", 0.0);
        setDoubleField(term76661, term76661.getClass(), "damps", 0.0);
        setDoubleField(term76661, term76661.getClass(), "ccov1", 0.0);
        setDoubleField(term76661, term76661.getClass(), "ccovmu", 0.0);
        setDoubleField(term76661, term76661.getClass(), "chiN", 0.0);
        setDoubleField(term76661, term76661.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term76661, term76661.getClass(), "ccovmuSep", 0.0);
        setField(term76661, term76661.getClass(), "xmean", null);
        setField(term76661, term76661.getClass(), "pc", null);
        setField(term76661, term76661.getClass(), "ps", null);
        setDoubleField(term76661, term76661.getClass(), "normps", 0.0);
        setField(term76661, term76661.getClass(), "B", null);
        setField(term76661, term76661.getClass(), "D", null);
        setField(term76661, term76661.getClass(), "BD", null);
        setField(term76661, term76661.getClass(), "diagD", null);
        setField(term76661, term76661.getClass(), "C", null);
        setField(term76661, term76661.getClass(), "diagC", null);
        setIntField(term76661, term76661.getClass(), "iterations", 0);
        setField(term76661, term76661.getClass(), "fitnessHistory", null);
        setIntField(term76661, term76661.getClass(), "historySize", 0);
        setField(term76661, term76661.getClass(), "random", null);
        setField(term76661, term76661.getClass(), "statisticsSigmaHistory", term76662);
        setField(term76661, term76661.getClass(), "statisticsMeanHistory", term76664);
        setField(term76661, term76661.getClass(), "statisticsFitnessHistory", term76666);
        setField(term76661, term76661.getClass(), "statisticsDHistory", term76668);
        setField(term76661, term76661.getClass(), "lowerBound", null);
        setField(term76661, term76661.getClass(), "upperBound", null);
        setIntField(term76670, term76670.getClass(), "maximalCount", 0);
        setIntField(term76670, term76670.getClass(), "count", 0);
        setField(term76670, term76670.getClass(), "maxCountCallback", term76671);
        setField(term76661, term76661.getClass(), "evaluations", term76670);
        setField(term76661, term76661.getClass(), "checker", null);
        setField(term76661, term76661.getClass(), "goal", null);
        setField(term76661, term76661.getClass(), "start", null);
        setField(term76661, term76661.getClass(), "function", null);
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
        args[0] = 0;
        args[1] = null;
        args[2] = 0;
        args[3] = 0.0;
        args[4] = false;
        args[5] = 0;
        args[6] = 0;
        args[7] = null;
        args[8] = false;
        args[9] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term76661));
    }

};


