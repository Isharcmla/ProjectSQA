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
import java.lang.Boolean;

public class CMAESOptimizer_updateCovariance_33046528412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term436;
     Object term469;
     Object term471;

    public CMAESOptimizer_updateCovariance_33046528412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term436 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] term440 = (double[]) newDoubleArray(3);
        setIntField(term436, term436.getClass(), "lambda", 933028652);
        setBooleanField(term436, term436.getClass(), "isActiveCMA", true);
        setIntField(term436, term436.getClass(), "checkFeasableCount", 287287233);
        setDoubleElement(term440, 0, 0.6420798930164424);
        setDoubleElement(term440, 1, 0.0011409626665044303);
        setDoubleElement(term440, 2, 0.5195852993308188);
        setField(term436, term436.getClass(), "inputSigma", term440);
        setIntField(term436, term436.getClass(), "dimension", 962840079);
        setIntField(term436, term436.getClass(), "diagonalOnly", 1540719661);
        setBooleanField(term436, term436.getClass(), "isMinimize", true);
        setBooleanField(term436, term436.getClass(), "generateStatistics", true);
        setIntField(term436, term436.getClass(), "maxIterations", 1265463001);
        setDoubleField(term436, term436.getClass(), "stopFitness", 0.6533293939565151);
        setDoubleField(term436, term436.getClass(), "stopTolUpX", 0.7361083671494018);
        setDoubleField(term436, term436.getClass(), "stopTolX", 0.056643259984349825);
        setDoubleField(term436, term436.getClass(), "stopTolFun", 0.5984863932443171);
        setDoubleField(term436, term436.getClass(), "stopTolHistFun", 0.04708163975594959);
        setIntField(term436, term436.getClass(), "mu", 335112684);
        setDoubleField(term436, term436.getClass(), "logMu2", 0.8223115496053149);
        setField(term436, term436.getClass(), "weights", null);
        setDoubleField(term436, term436.getClass(), "mueff", 0.06795505641704636);
        setDoubleField(term436, term436.getClass(), "sigma", 0.198746516614277);
        setDoubleField(term436, term436.getClass(), "cc", 0.16852568658760048);
        setDoubleField(term436, term436.getClass(), "cs", 0.20341461558365515);
        setDoubleField(term436, term436.getClass(), "damps", 0.10087360265456191);
        setDoubleField(term436, term436.getClass(), "ccov1", 0.5957631946929023);
        setDoubleField(term436, term436.getClass(), "ccovmu", 0.9963416078314885);
        setDoubleField(term436, term436.getClass(), "chiN", 0.3147638130628596);
        setDoubleField(term436, term436.getClass(), "ccov1Sep", 0.24810335047389354);
        setDoubleField(term436, term436.getClass(), "ccovmuSep", 0.9113409083257852);
        setField(term436, term436.getClass(), "xmean", null);
        setField(term436, term436.getClass(), "pc", null);
        setField(term436, term436.getClass(), "ps", null);
        setDoubleField(term436, term436.getClass(), "normps", 0.7444535250398684);
        setField(term436, term436.getClass(), "B", null);
        setField(term436, term436.getClass(), "D", null);
        setField(term436, term436.getClass(), "BD", null);
        setField(term436, term436.getClass(), "diagD", null);
        setField(term436, term436.getClass(), "C", null);
        setField(term436, term436.getClass(), "diagC", null);
        setIntField(term436, term436.getClass(), "iterations", 0);
        setField(term436, term436.getClass(), "fitnessHistory", null);
        setIntField(term436, term436.getClass(), "historySize", 0);
        setField(term436, term436.getClass(), "random", null);
        setField(term436, term436.getClass(), "statisticsSigmaHistory", null);
        setField(term436, term436.getClass(), "statisticsMeanHistory", null);
        setField(term436, term436.getClass(), "statisticsFitnessHistory", null);
        setField(term436, term436.getClass(), "statisticsDHistory", null);
        setField(term436, term436.getClass(), "function", null);
        setField(term436, term436.getClass(), "goal", null);
        setField(term436, term436.getClass(), "start", null);
        setField(term436, term436.getClass(), "lowerBound", null);
        setField(term436, term436.getClass(), "upperBound", null);
        setField(term436, term436.getClass(), "evaluations", null);
        setField(term436, term436.getClass(), "iterations", null);
        setField(term436, term436.getClass(), "checker", null);
        term469 = new Boolean(false);
        term471 = (int[]) newIntArray(1);
        setIntElement(term471, 0, 1551099402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[2] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[3] = Array.newInstance(int.class, 0).getClass();
        argTypes[4] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Object[] args = new Object[5];
        args[0] = term469;
        args[1] = null;
        args[2] = null;
        args[3] = term471;
        args[4] = null;
        callMethod(klass, "updateCovariance", argTypes, term436, args);
    }

};


