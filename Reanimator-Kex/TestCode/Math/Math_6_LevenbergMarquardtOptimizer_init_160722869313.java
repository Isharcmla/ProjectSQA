package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

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
import static org.apache.commons.math3.optim.nonlinear.vector.jacobian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optim.nonlinear.vector.jacobian.EqualityUtils.*;
import java.lang.Double;
import java.lang.Object;

public class LevenbergMarquardtOptimizer_init_160722869313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term5;
     Object term7;
     Object term9;
     Object term1869;

    public LevenbergMarquardtOptimizer_init_160722869313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Double(0.13238746331190498);
        term3 = new Double(0.3455959125047594);
        term5 = new Double(0.5523635872663106);
        term7 = new Double(0.544608645520025);
        term9 = new Double(0.28570734989730284);
        term1869 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Object term1870 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term1871 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback"));
        Object term1872 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term1873 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback"));
        setIntField(term1869, term1869.getClass(), "solvedCols", 0);
        setField(term1869, term1869.getClass(), "diagR", null);
        setField(term1869, term1869.getClass(), "jacNorm", null);
        setField(term1869, term1869.getClass(), "beta", null);
        setField(term1869, term1869.getClass(), "permutation", null);
        setIntField(term1869, term1869.getClass(), "rank", 0);
        setDoubleField(term1869, term1869.getClass(), "lmPar", 0.0);
        setField(term1869, term1869.getClass(), "lmDir", null);
        setDoubleField(term1869, term1869.getClass(), "initialStepBoundFactor", 0.13238746331190498);
        setDoubleField(term1869, term1869.getClass(), "costRelativeTolerance", 0.3455959125047594);
        setDoubleField(term1869, term1869.getClass(), "parRelativeTolerance", 0.5523635872663106);
        setDoubleField(term1869, term1869.getClass(), "orthoTolerance", 0.544608645520025);
        setDoubleField(term1869, term1869.getClass(), "qrRankingThreshold", 0.28570734989730284);
        setField(term1869, term1869.getClass(), "weightedResidual", null);
        setField(term1869, term1869.getClass(), "weightedJacobian", null);
        setField(term1869, term1869.getClass(), "weightMatrixSqrt", null);
        setDoubleField(term1869, term1869.getClass(), "cost", 0.0);
        setField(term1869, term1869.getClass(), "jacobian", null);
        setField(term1869, term1869.getClass(), "target", null);
        setField(term1869, term1869.getClass(), "weightMatrix", null);
        setField(term1869, term1869.getClass(), "model", null);
        setField(term1869, term1869.getClass(), "start", null);
        setField(term1869, term1869.getClass(), "lowerBound", null);
        setField(term1869, term1869.getClass(), "upperBound", null);
        setIntField(term1870, term1870.getClass(), "maximalCount", 0);
        setIntField(term1870, term1870.getClass(), "count", 0);
        setField(term1870, term1870.getClass(), "maxCountCallback", term1871);
        setField(term1869, term1869.getClass(), "evaluations", term1870);
        setIntField(term1872, term1872.getClass(), "maximalCount", 0);
        setIntField(term1872, term1872.getClass(), "count", 0);
        setField(term1872, term1872.getClass(), "maxCountCallback", term1873);
        setField(term1869, term1869.getClass(), "iterations", term1872);
        setField(term1869, term1869.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("org.apache.commons.math3.optim.ConvergenceChecker");
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        argTypes[5] = double.class;
        Object[] args = new Object[6];
        args[0] = term1;
        args[1] = null;
        args[2] = term3;
        args[3] = term5;
        args[4] = term7;
        args[5] = term9;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1869));
        assertTrue(recursiveEquals(term1, null));
        assertTrue(recursiveEquals(term3, 0.3455959125047594));
        assertTrue(recursiveEquals(term5, 0.5523635872663106));
        assertTrue(recursiveEquals(term7, 0.544608645520025));
        assertTrue(recursiveEquals(term9, 0.28570734989730284));
    }

};


