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

public class CMAESOptimizer_sortedIndices_208513768515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term516;
     Object term554;

    public CMAESOptimizer_sortedIndices_208513768515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term516 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] term520 = (double[]) newDoubleArray(8);
        setIntField(term516, term516.getClass(), "lambda", -481533957);
        setBooleanField(term516, term516.getClass(), "isActiveCMA", true);
        setIntField(term516, term516.getClass(), "checkFeasableCount", 1240914516);
        setDoubleElement(term520, 0, 0.7039847711405768);
        setDoubleElement(term520, 1, 0.7157998497507287);
        setDoubleElement(term520, 2, 0.8399796378537906);
        setDoubleElement(term520, 3, 0.009446329384675933);
        setDoubleElement(term520, 4, 0.20131600000037786);
        setDoubleElement(term520, 5, 0.332320568233212);
        setDoubleElement(term520, 6, 0.18561351983828822);
        setDoubleElement(term520, 7, 0.9678135126533798);
        setField(term516, term516.getClass(), "inputSigma", term520);
        setIntField(term516, term516.getClass(), "dimension", -1465035361);
        setIntField(term516, term516.getClass(), "diagonalOnly", 1090617576);
        setBooleanField(term516, term516.getClass(), "isMinimize", false);
        setBooleanField(term516, term516.getClass(), "generateStatistics", true);
        setIntField(term516, term516.getClass(), "maxIterations", -1547384488);
        setDoubleField(term516, term516.getClass(), "stopFitness", 0.3275035827937727);
        setDoubleField(term516, term516.getClass(), "stopTolUpX", 0.13747524521333288);
        setDoubleField(term516, term516.getClass(), "stopTolX", 0.7149120009558162);
        setDoubleField(term516, term516.getClass(), "stopTolFun", 0.0013046823258857643);
        setDoubleField(term516, term516.getClass(), "stopTolHistFun", 0.5404409545293147);
        setIntField(term516, term516.getClass(), "mu", 1442160736);
        setDoubleField(term516, term516.getClass(), "logMu2", 0.9172358414700745);
        setField(term516, term516.getClass(), "weights", null);
        setDoubleField(term516, term516.getClass(), "mueff", 0.3804251745476508);
        setDoubleField(term516, term516.getClass(), "sigma", 0.6704848280926606);
        setDoubleField(term516, term516.getClass(), "cc", 0.6213122016266206);
        setDoubleField(term516, term516.getClass(), "cs", 0.540850203722707);
        setDoubleField(term516, term516.getClass(), "damps", 6.134294677928587E-4);
        setDoubleField(term516, term516.getClass(), "ccov1", 0.41934015614685227);
        setDoubleField(term516, term516.getClass(), "ccovmu", 0.07298304401683597);
        setDoubleField(term516, term516.getClass(), "chiN", 0.6101411757610665);
        setDoubleField(term516, term516.getClass(), "ccov1Sep", 0.07932996853888874);
        setDoubleField(term516, term516.getClass(), "ccovmuSep", 0.4335752168808029);
        setField(term516, term516.getClass(), "xmean", null);
        setField(term516, term516.getClass(), "pc", null);
        setField(term516, term516.getClass(), "ps", null);
        setDoubleField(term516, term516.getClass(), "normps", 0.9196949182738653);
        setField(term516, term516.getClass(), "B", null);
        setField(term516, term516.getClass(), "D", null);
        setField(term516, term516.getClass(), "BD", null);
        setField(term516, term516.getClass(), "diagD", null);
        setField(term516, term516.getClass(), "C", null);
        setField(term516, term516.getClass(), "diagC", null);
        setIntField(term516, term516.getClass(), "iterations", 0);
        setField(term516, term516.getClass(), "fitnessHistory", null);
        setIntField(term516, term516.getClass(), "historySize", 0);
        setField(term516, term516.getClass(), "random", null);
        setField(term516, term516.getClass(), "statisticsSigmaHistory", null);
        setField(term516, term516.getClass(), "statisticsMeanHistory", null);
        setField(term516, term516.getClass(), "statisticsFitnessHistory", null);
        setField(term516, term516.getClass(), "statisticsDHistory", null);
        setField(term516, term516.getClass(), "function", null);
        setField(term516, term516.getClass(), "goal", null);
        setField(term516, term516.getClass(), "start", null);
        setField(term516, term516.getClass(), "lowerBound", null);
        setField(term516, term516.getClass(), "upperBound", null);
        setField(term516, term516.getClass(), "evaluations", null);
        setField(term516, term516.getClass(), "iterations", null);
        setField(term516, term516.getClass(), "checker", null);
        term554 = (double[]) newDoubleArray(6);
        setDoubleElement(term554, 0, 0.5820770579753712);
        setDoubleElement(term554, 1, 0.8935041663395363);
        setDoubleElement(term554, 2, 0.2542403704113868);
        setDoubleElement(term554, 3, 0.4614378239284842);
        setDoubleElement(term554, 4, 0.10963898027157926);
        setDoubleElement(term554, 5, 0.34234234602085223);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term554;
        callMethod(klass, "sortedIndices", argTypes, term516, args);
    }

};


