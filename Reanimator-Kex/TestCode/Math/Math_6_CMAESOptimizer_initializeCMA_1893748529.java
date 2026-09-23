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

public class CMAESOptimizer_initializeCMA_1893748529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307;
     Object term343;

    public CMAESOptimizer_initializeCMA_1893748529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term307 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] term311 = (double[]) newDoubleArray(6);
        setIntField(term307, term307.getClass(), "lambda", 454281060);
        setBooleanField(term307, term307.getClass(), "isActiveCMA", false);
        setIntField(term307, term307.getClass(), "checkFeasableCount", -1786399638);
        setDoubleElement(term311, 0, 0.6047138318674447);
        setDoubleElement(term311, 1, 0.5597136413549945);
        setDoubleElement(term311, 2, 0.28292420012823627);
        setDoubleElement(term311, 3, 0.5407563152320285);
        setDoubleElement(term311, 4, 0.9485929668765458);
        setDoubleElement(term311, 5, 0.5179319342588155);
        setField(term307, term307.getClass(), "inputSigma", term311);
        setIntField(term307, term307.getClass(), "dimension", 2055867847);
        setIntField(term307, term307.getClass(), "diagonalOnly", -1048298087);
        setBooleanField(term307, term307.getClass(), "isMinimize", false);
        setBooleanField(term307, term307.getClass(), "generateStatistics", true);
        setIntField(term307, term307.getClass(), "maxIterations", 292681826);
        setDoubleField(term307, term307.getClass(), "stopFitness", 0.25025774487844066);
        setDoubleField(term307, term307.getClass(), "stopTolUpX", 0.1858089882752998);
        setDoubleField(term307, term307.getClass(), "stopTolX", 0.2440697646709713);
        setDoubleField(term307, term307.getClass(), "stopTolFun", 0.7977455176064363);
        setDoubleField(term307, term307.getClass(), "stopTolHistFun", 0.5329919447422633);
        setIntField(term307, term307.getClass(), "mu", 458147407);
        setDoubleField(term307, term307.getClass(), "logMu2", 0.7046974927834232);
        setField(term307, term307.getClass(), "weights", null);
        setDoubleField(term307, term307.getClass(), "mueff", 0.6896952303224777);
        setDoubleField(term307, term307.getClass(), "sigma", 0.6693176553622628);
        setDoubleField(term307, term307.getClass(), "cc", 0.2962868255626906);
        setDoubleField(term307, term307.getClass(), "cs", 0.25474180574060834);
        setDoubleField(term307, term307.getClass(), "damps", 0.9957585718901875);
        setDoubleField(term307, term307.getClass(), "ccov1", 0.16755811343784477);
        setDoubleField(term307, term307.getClass(), "ccovmu", 0.9090793968999221);
        setDoubleField(term307, term307.getClass(), "chiN", 0.25997329921466494);
        setDoubleField(term307, term307.getClass(), "ccov1Sep", 0.7814864708383836);
        setDoubleField(term307, term307.getClass(), "ccovmuSep", 0.5657654165545906);
        setField(term307, term307.getClass(), "xmean", null);
        setField(term307, term307.getClass(), "pc", null);
        setField(term307, term307.getClass(), "ps", null);
        setDoubleField(term307, term307.getClass(), "normps", 0.6382060245198228);
        setField(term307, term307.getClass(), "B", null);
        setField(term307, term307.getClass(), "D", null);
        setField(term307, term307.getClass(), "BD", null);
        setField(term307, term307.getClass(), "diagD", null);
        setField(term307, term307.getClass(), "C", null);
        setField(term307, term307.getClass(), "diagC", null);
        setIntField(term307, term307.getClass(), "iterations", 0);
        setField(term307, term307.getClass(), "fitnessHistory", null);
        setIntField(term307, term307.getClass(), "historySize", 0);
        setField(term307, term307.getClass(), "random", null);
        setField(term307, term307.getClass(), "statisticsSigmaHistory", null);
        setField(term307, term307.getClass(), "statisticsMeanHistory", null);
        setField(term307, term307.getClass(), "statisticsFitnessHistory", null);
        setField(term307, term307.getClass(), "statisticsDHistory", null);
        setField(term307, term307.getClass(), "function", null);
        setField(term307, term307.getClass(), "goal", null);
        setField(term307, term307.getClass(), "start", null);
        setField(term307, term307.getClass(), "lowerBound", null);
        setField(term307, term307.getClass(), "upperBound", null);
        setField(term307, term307.getClass(), "evaluations", null);
        setField(term307, term307.getClass(), "iterations", null);
        setField(term307, term307.getClass(), "checker", null);
        term343 = (double[]) newDoubleArray(5);
        setDoubleElement(term343, 0, 0.1849998667663698);
        setDoubleElement(term343, 1, 0.36312400202399575);
        setDoubleElement(term343, 2, 0.5485690030548175);
        setDoubleElement(term343, 3, 0.9765248027281291);
        setDoubleElement(term343, 4, 0.9184034277897645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term343;
        callMethod(klass, "initializeCMA", argTypes, term307, args);
    }

};


