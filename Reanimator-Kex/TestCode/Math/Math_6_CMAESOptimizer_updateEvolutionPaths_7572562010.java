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

public class CMAESOptimizer_updateEvolutionPaths_7572562010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360;

    public CMAESOptimizer_updateEvolutionPaths_7572562010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term360 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] term364 = (double[]) newDoubleArray(5);
        setIntField(term360, term360.getClass(), "lambda", -184153539);
        setBooleanField(term360, term360.getClass(), "isActiveCMA", true);
        setIntField(term360, term360.getClass(), "checkFeasableCount", 493620644);
        setDoubleElement(term364, 0, 0.9457448635091538);
        setDoubleElement(term364, 1, 0.3238255203811462);
        setDoubleElement(term364, 2, 0.2843894095932772);
        setDoubleElement(term364, 3, 0.2382345237223229);
        setDoubleElement(term364, 4, 0.6037093070161561);
        setField(term360, term360.getClass(), "inputSigma", term364);
        setIntField(term360, term360.getClass(), "dimension", 1328271830);
        setIntField(term360, term360.getClass(), "diagonalOnly", 1596070772);
        setBooleanField(term360, term360.getClass(), "isMinimize", true);
        setBooleanField(term360, term360.getClass(), "generateStatistics", true);
        setIntField(term360, term360.getClass(), "maxIterations", 97029295);
        setDoubleField(term360, term360.getClass(), "stopFitness", 0.48050706663913145);
        setDoubleField(term360, term360.getClass(), "stopTolUpX", 0.4990217874180345);
        setDoubleField(term360, term360.getClass(), "stopTolX", 0.22767631814145395);
        setDoubleField(term360, term360.getClass(), "stopTolFun", 0.4630082575704827);
        setDoubleField(term360, term360.getClass(), "stopTolHistFun", 0.8732511635701926);
        setIntField(term360, term360.getClass(), "mu", -1371869594);
        setDoubleField(term360, term360.getClass(), "logMu2", 0.8977760608415547);
        setField(term360, term360.getClass(), "weights", null);
        setDoubleField(term360, term360.getClass(), "mueff", 0.3107086749915061);
        setDoubleField(term360, term360.getClass(), "sigma", 0.18330246984174836);
        setDoubleField(term360, term360.getClass(), "cc", 0.1941255640189572);
        setDoubleField(term360, term360.getClass(), "cs", 0.2889811903417371);
        setDoubleField(term360, term360.getClass(), "damps", 0.7856101337088763);
        setDoubleField(term360, term360.getClass(), "ccov1", 0.1782857269567425);
        setDoubleField(term360, term360.getClass(), "ccovmu", 0.17829386444171214);
        setDoubleField(term360, term360.getClass(), "chiN", 0.547995853732519);
        setDoubleField(term360, term360.getClass(), "ccov1Sep", 0.3483938514131425);
        setDoubleField(term360, term360.getClass(), "ccovmuSep", 0.0100718646868041);
        setField(term360, term360.getClass(), "xmean", null);
        setField(term360, term360.getClass(), "pc", null);
        setField(term360, term360.getClass(), "ps", null);
        setDoubleField(term360, term360.getClass(), "normps", 0.58265008665336);
        setField(term360, term360.getClass(), "B", null);
        setField(term360, term360.getClass(), "D", null);
        setField(term360, term360.getClass(), "BD", null);
        setField(term360, term360.getClass(), "diagD", null);
        setField(term360, term360.getClass(), "C", null);
        setField(term360, term360.getClass(), "diagC", null);
        setIntField(term360, term360.getClass(), "iterations", 0);
        setField(term360, term360.getClass(), "fitnessHistory", null);
        setIntField(term360, term360.getClass(), "historySize", 0);
        setField(term360, term360.getClass(), "random", null);
        setField(term360, term360.getClass(), "statisticsSigmaHistory", null);
        setField(term360, term360.getClass(), "statisticsMeanHistory", null);
        setField(term360, term360.getClass(), "statisticsFitnessHistory", null);
        setField(term360, term360.getClass(), "statisticsDHistory", null);
        setField(term360, term360.getClass(), "function", null);
        setField(term360, term360.getClass(), "goal", null);
        setField(term360, term360.getClass(), "start", null);
        setField(term360, term360.getClass(), "lowerBound", null);
        setField(term360, term360.getClass(), "upperBound", null);
        setField(term360, term360.getClass(), "evaluations", null);
        setField(term360, term360.getClass(), "iterations", null);
        setField(term360, term360.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[1] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "updateEvolutionPaths", argTypes, term360, args);
    }

};


