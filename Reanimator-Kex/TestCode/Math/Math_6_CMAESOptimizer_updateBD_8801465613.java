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
import java.lang.Double;

public class CMAESOptimizer_updateBD_8801465613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477;
     Object term507;

    public CMAESOptimizer_updateBD_8801465613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term477 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] term481 = (double[]) newDoubleArray(0);
        setIntField(term477, term477.getClass(), "lambda", -2027534003);
        setBooleanField(term477, term477.getClass(), "isActiveCMA", false);
        setIntField(term477, term477.getClass(), "checkFeasableCount", 1063420942);
        setField(term477, term477.getClass(), "inputSigma", term481);
        setIntField(term477, term477.getClass(), "dimension", 1375330971);
        setIntField(term477, term477.getClass(), "diagonalOnly", -478195677);
        setBooleanField(term477, term477.getClass(), "isMinimize", false);
        setBooleanField(term477, term477.getClass(), "generateStatistics", true);
        setIntField(term477, term477.getClass(), "maxIterations", 972867650);
        setDoubleField(term477, term477.getClass(), "stopFitness", 0.37439559220953034);
        setDoubleField(term477, term477.getClass(), "stopTolUpX", 0.5010337159337968);
        setDoubleField(term477, term477.getClass(), "stopTolX", 0.33871772875627537);
        setDoubleField(term477, term477.getClass(), "stopTolFun", 0.9952003100858836);
        setDoubleField(term477, term477.getClass(), "stopTolHistFun", 0.22059525284415726);
        setIntField(term477, term477.getClass(), "mu", 1655935355);
        setDoubleField(term477, term477.getClass(), "logMu2", 0.281059649526194);
        setField(term477, term477.getClass(), "weights", null);
        setDoubleField(term477, term477.getClass(), "mueff", 0.049786419821445604);
        setDoubleField(term477, term477.getClass(), "sigma", 0.8814078959581401);
        setDoubleField(term477, term477.getClass(), "cc", 0.47210750955444725);
        setDoubleField(term477, term477.getClass(), "cs", 0.8381176594884352);
        setDoubleField(term477, term477.getClass(), "damps", 0.23070800524236523);
        setDoubleField(term477, term477.getClass(), "ccov1", 0.4337266793917268);
        setDoubleField(term477, term477.getClass(), "ccovmu", 0.11979392765421404);
        setDoubleField(term477, term477.getClass(), "chiN", 0.4555542221910589);
        setDoubleField(term477, term477.getClass(), "ccov1Sep", 0.9938727080758785);
        setDoubleField(term477, term477.getClass(), "ccovmuSep", 0.39416780533640805);
        setField(term477, term477.getClass(), "xmean", null);
        setField(term477, term477.getClass(), "pc", null);
        setField(term477, term477.getClass(), "ps", null);
        setDoubleField(term477, term477.getClass(), "normps", 0.5384156574050297);
        setField(term477, term477.getClass(), "B", null);
        setField(term477, term477.getClass(), "D", null);
        setField(term477, term477.getClass(), "BD", null);
        setField(term477, term477.getClass(), "diagD", null);
        setField(term477, term477.getClass(), "C", null);
        setField(term477, term477.getClass(), "diagC", null);
        setIntField(term477, term477.getClass(), "iterations", 0);
        setField(term477, term477.getClass(), "fitnessHistory", null);
        setIntField(term477, term477.getClass(), "historySize", 0);
        setField(term477, term477.getClass(), "random", null);
        setField(term477, term477.getClass(), "statisticsSigmaHistory", null);
        setField(term477, term477.getClass(), "statisticsMeanHistory", null);
        setField(term477, term477.getClass(), "statisticsFitnessHistory", null);
        setField(term477, term477.getClass(), "statisticsDHistory", null);
        setField(term477, term477.getClass(), "function", null);
        setField(term477, term477.getClass(), "goal", null);
        setField(term477, term477.getClass(), "start", null);
        setField(term477, term477.getClass(), "lowerBound", null);
        setField(term477, term477.getClass(), "upperBound", null);
        setField(term477, term477.getClass(), "evaluations", null);
        setField(term477, term477.getClass(), "iterations", null);
        setField(term477, term477.getClass(), "checker", null);
        term507 = new Double(0.28813953022653416);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term507;
        callMethod(klass, "updateBD", argTypes, term477, args);
    }

};


