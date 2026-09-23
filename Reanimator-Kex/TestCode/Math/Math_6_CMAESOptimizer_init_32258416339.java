package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

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
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.EqualityUtils.*;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Object;

public class CMAESOptimizer_init_32258416339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term5;
     Object term7;
     Object term9;
     Object term11;
     Object term806;

    public CMAESOptimizer_init_32258416339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Integer(568599855);
        term3 = new Double(0.13238746331190498);
        term5 = new Boolean(false);
        term7 = new Integer(1162663216);
        term9 = new Integer(1484323161);
        term11 = new Boolean(false);
        ArrayList term807 = new ArrayList();
        ArrayList term809 = new ArrayList();
        ArrayList term811 = new ArrayList();
        ArrayList term813 = new ArrayList();
        term806 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        Object term815 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term816 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback"));
        Object term817 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term818 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback"));
        setIntField(term806, term806.getClass(), "lambda", 0);
        setBooleanField(term806, term806.getClass(), "isActiveCMA", false);
        setIntField(term806, term806.getClass(), "checkFeasableCount", 1484323161);
        setField(term806, term806.getClass(), "inputSigma", null);
        setIntField(term806, term806.getClass(), "dimension", 0);
        setIntField(term806, term806.getClass(), "diagonalOnly", 1162663216);
        setBooleanField(term806, term806.getClass(), "isMinimize", true);
        setBooleanField(term806, term806.getClass(), "generateStatistics", false);
        setIntField(term806, term806.getClass(), "maxIterations", 568599855);
        setDoubleField(term806, term806.getClass(), "stopFitness", 0.13238746331190498);
        setDoubleField(term806, term806.getClass(), "stopTolUpX", 0.0);
        setDoubleField(term806, term806.getClass(), "stopTolX", 0.0);
        setDoubleField(term806, term806.getClass(), "stopTolFun", 0.0);
        setDoubleField(term806, term806.getClass(), "stopTolHistFun", 0.0);
        setIntField(term806, term806.getClass(), "mu", 0);
        setDoubleField(term806, term806.getClass(), "logMu2", 0.0);
        setField(term806, term806.getClass(), "weights", null);
        setDoubleField(term806, term806.getClass(), "mueff", 0.0);
        setDoubleField(term806, term806.getClass(), "sigma", 0.0);
        setDoubleField(term806, term806.getClass(), "cc", 0.0);
        setDoubleField(term806, term806.getClass(), "cs", 0.0);
        setDoubleField(term806, term806.getClass(), "damps", 0.0);
        setDoubleField(term806, term806.getClass(), "ccov1", 0.0);
        setDoubleField(term806, term806.getClass(), "ccovmu", 0.0);
        setDoubleField(term806, term806.getClass(), "chiN", 0.0);
        setDoubleField(term806, term806.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term806, term806.getClass(), "ccovmuSep", 0.0);
        setField(term806, term806.getClass(), "xmean", null);
        setField(term806, term806.getClass(), "pc", null);
        setField(term806, term806.getClass(), "ps", null);
        setDoubleField(term806, term806.getClass(), "normps", 0.0);
        setField(term806, term806.getClass(), "B", null);
        setField(term806, term806.getClass(), "D", null);
        setField(term806, term806.getClass(), "BD", null);
        setField(term806, term806.getClass(), "diagD", null);
        setField(term806, term806.getClass(), "C", null);
        setField(term806, term806.getClass(), "diagC", null);
        setIntField(term806, term806.getClass(), "iterations", 0);
        setField(term806, term806.getClass(), "fitnessHistory", null);
        setIntField(term806, term806.getClass(), "historySize", 0);
        setField(term806, term806.getClass(), "random", null);
        setField(term806, term806.getClass(), "statisticsSigmaHistory", term807);
        setField(term806, term806.getClass(), "statisticsMeanHistory", term809);
        setField(term806, term806.getClass(), "statisticsFitnessHistory", term811);
        setField(term806, term806.getClass(), "statisticsDHistory", term813);
        setField(term806, term806.getClass(), "function", null);
        setField(term806, term806.getClass(), "goal", null);
        setField(term806, term806.getClass(), "start", null);
        setField(term806, term806.getClass(), "lowerBound", null);
        setField(term806, term806.getClass(), "upperBound", null);
        setIntField(term815, term815.getClass(), "maximalCount", 0);
        setIntField(term815, term815.getClass(), "count", 0);
        setField(term815, term815.getClass(), "maxCountCallback", term816);
        setField(term806, term806.getClass(), "evaluations", term815);
        setIntField(term817, term817.getClass(), "maximalCount", 0);
        setIntField(term817, term817.getClass(), "count", 0);
        setField(term817, term817.getClass(), "maxCountCallback", term818);
        setField(term806, term806.getClass(), "iterations", term817);
        setField(term806, term806.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        argTypes[2] = boolean.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("org.apache.commons.math3.random.RandomGenerator");
        argTypes[6] = boolean.class;
        argTypes[7] = Class.forName("org.apache.commons.math3.optim.ConvergenceChecker");
        Object[] args = new Object[8];
        args[0] = term1;
        args[1] = term3;
        args[2] = term5;
        args[3] = term7;
        args[4] = term9;
        args[5] = null;
        args[6] = term11;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term806));
        assertTrue(recursiveEquals(term1, null));
        assertTrue(recursiveEquals(term3, 568599855));
        assertTrue(recursiveEquals(term5, 0.13238746331190498));
        assertTrue(recursiveEquals(term7, false));
        assertTrue(recursiveEquals(term9, 1162663216));
        assertTrue(recursiveEquals(term11, null));
    }

};


