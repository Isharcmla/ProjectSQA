package org.apache.commons.math.optimization;

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
import static org.apache.commons.math.optimization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.optimization.EqualityUtils.*;
import java.lang.Object;

public class MultiStartUnivariateRealOptimizer_getRelativeAccuracy_307110549109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21311;
     Object term22258;

    public MultiStartUnivariateRealOptimizer_getRelativeAccuracy_307110549109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21311 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term21441 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(term21311, term21311.getClass(), "optimizer", term21441);
        term22258 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term22259 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term22259, term22259.getClass(), "resultComputed", false);
        setDoubleField(term22259, term22259.getClass(), "result", 0.0);
        setDoubleField(term22259, term22259.getClass(), "functionValue", 0.0);
        setIntField(term22259, term22259.getClass(), "maxEvaluations", 0);
        setIntField(term22259, term22259.getClass(), "evaluations", 0);
        setDoubleField(term22259, term22259.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term22259, term22259.getClass(), "relativeAccuracy", 0.0);
        setIntField(term22259, term22259.getClass(), "maximalIterationCount", 0);
        setDoubleField(term22259, term22259.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term22259, term22259.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term22259, term22259.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term22259, term22259.getClass(), "iterationCount", 0);
        setField(term22258, term22258.getClass(), "optimizer", term22259);
        setIntField(term22258, term22258.getClass(), "maxIterations", 0);
        setIntField(term22258, term22258.getClass(), "maxEvaluations", 0);
        setIntField(term22258, term22258.getClass(), "totalIterations", 0);
        setIntField(term22258, term22258.getClass(), "totalEvaluations", 0);
        setIntField(term22258, term22258.getClass(), "starts", 0);
        setField(term22258, term22258.getClass(), "generator", null);
        setField(term22258, term22258.getClass(), "optima", null);
        setField(term22258, term22258.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativeAccuracy", argTypes, term21311, args);
        assertTrue(recursiveEquals(term21311, term22258));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


