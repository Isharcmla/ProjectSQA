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
import java.lang.Integer;

public class CMAESOptimizer_randn1_72302467238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term692;
     Object term727;
     Object term729;

    public CMAESOptimizer_randn1_72302467238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term692 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] term696 = (double[]) newDoubleArray(5);
        setIntField(term692, term692.getClass(), "lambda", -893623680);
        setBooleanField(term692, term692.getClass(), "isActiveCMA", true);
        setIntField(term692, term692.getClass(), "checkFeasableCount", -1963434938);
        setDoubleElement(term696, 0, 0.5041105894588648);
        setDoubleElement(term696, 1, 0.5447228125601069);
        setDoubleElement(term696, 2, 0.881005463515806);
        setDoubleElement(term696, 3, 0.24535082601257097);
        setDoubleElement(term696, 4, 0.8251257683961645);
        setField(term692, term692.getClass(), "inputSigma", term696);
        setIntField(term692, term692.getClass(), "dimension", 906181092);
        setIntField(term692, term692.getClass(), "diagonalOnly", 1045657203);
        setBooleanField(term692, term692.getClass(), "isMinimize", false);
        setBooleanField(term692, term692.getClass(), "generateStatistics", false);
        setIntField(term692, term692.getClass(), "maxIterations", 1386130016);
        setDoubleField(term692, term692.getClass(), "stopFitness", 0.9368808881355091);
        setDoubleField(term692, term692.getClass(), "stopTolUpX", 0.6198040082983302);
        setDoubleField(term692, term692.getClass(), "stopTolX", 0.8222160691812529);
        setDoubleField(term692, term692.getClass(), "stopTolFun", 0.6481625751444708);
        setDoubleField(term692, term692.getClass(), "stopTolHistFun", 0.62046987338639);
        setIntField(term692, term692.getClass(), "mu", 1072005683);
        setDoubleField(term692, term692.getClass(), "logMu2", 0.16681991355621673);
        setField(term692, term692.getClass(), "weights", null);
        setDoubleField(term692, term692.getClass(), "mueff", 0.24168508149332457);
        setDoubleField(term692, term692.getClass(), "sigma", 0.9765582392968284);
        setDoubleField(term692, term692.getClass(), "cc", 0.33340230026214834);
        setDoubleField(term692, term692.getClass(), "cs", 0.7912735654922212);
        setDoubleField(term692, term692.getClass(), "damps", 0.7177162541558186);
        setDoubleField(term692, term692.getClass(), "ccov1", 0.4751993224281752);
        setDoubleField(term692, term692.getClass(), "ccovmu", 0.246784352391756);
        setDoubleField(term692, term692.getClass(), "chiN", 0.6746769370801629);
        setDoubleField(term692, term692.getClass(), "ccov1Sep", 0.09436531082165778);
        setDoubleField(term692, term692.getClass(), "ccovmuSep", 0.1882701721081318);
        setField(term692, term692.getClass(), "xmean", null);
        setField(term692, term692.getClass(), "pc", null);
        setField(term692, term692.getClass(), "ps", null);
        setDoubleField(term692, term692.getClass(), "normps", 0.20230843747579808);
        setField(term692, term692.getClass(), "B", null);
        setField(term692, term692.getClass(), "D", null);
        setField(term692, term692.getClass(), "BD", null);
        setField(term692, term692.getClass(), "diagD", null);
        setField(term692, term692.getClass(), "C", null);
        setField(term692, term692.getClass(), "diagC", null);
        setIntField(term692, term692.getClass(), "iterations", 0);
        setField(term692, term692.getClass(), "fitnessHistory", null);
        setIntField(term692, term692.getClass(), "historySize", 0);
        setField(term692, term692.getClass(), "random", null);
        setField(term692, term692.getClass(), "statisticsSigmaHistory", null);
        setField(term692, term692.getClass(), "statisticsMeanHistory", null);
        setField(term692, term692.getClass(), "statisticsFitnessHistory", null);
        setField(term692, term692.getClass(), "statisticsDHistory", null);
        setField(term692, term692.getClass(), "function", null);
        setField(term692, term692.getClass(), "goal", null);
        setField(term692, term692.getClass(), "start", null);
        setField(term692, term692.getClass(), "lowerBound", null);
        setField(term692, term692.getClass(), "upperBound", null);
        setField(term692, term692.getClass(), "evaluations", null);
        setField(term692, term692.getClass(), "iterations", null);
        setField(term692, term692.getClass(), "checker", null);
        term727 = new Integer(1861318859);
        term729 = new Integer(1474524152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term727;
        args[1] = term729;
        callMethod(klass, "randn1", argTypes, term692, args);
    }

};


