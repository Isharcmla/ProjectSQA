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

public class MultiStartUnivariateRealOptimizer_resetMaximalIterationCount_189597210991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17192;
     Object term17390;

    public MultiStartUnivariateRealOptimizer_resetMaximalIterationCount_189597210991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17192 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term17322 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(term17192, term17192.getClass(), "optimizer", term17322);
        term17390 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term17391 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term17391, term17391.getClass(), "resultComputed", false);
        setDoubleField(term17391, term17391.getClass(), "result", 0.0);
        setDoubleField(term17391, term17391.getClass(), "functionValue", 0.0);
        setIntField(term17391, term17391.getClass(), "maxEvaluations", 0);
        setIntField(term17391, term17391.getClass(), "evaluations", 0);
        setDoubleField(term17391, term17391.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term17391, term17391.getClass(), "relativeAccuracy", 0.0);
        setIntField(term17391, term17391.getClass(), "maximalIterationCount", 0);
        setDoubleField(term17391, term17391.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term17391, term17391.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term17391, term17391.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term17391, term17391.getClass(), "iterationCount", 0);
        setField(term17390, term17390.getClass(), "optimizer", term17391);
        setIntField(term17390, term17390.getClass(), "maxIterations", 0);
        setIntField(term17390, term17390.getClass(), "maxEvaluations", 0);
        setIntField(term17390, term17390.getClass(), "totalIterations", 0);
        setIntField(term17390, term17390.getClass(), "totalEvaluations", 0);
        setIntField(term17390, term17390.getClass(), "starts", 0);
        setField(term17390, term17390.getClass(), "generator", null);
        setField(term17390, term17390.getClass(), "optima", null);
        setField(term17390, term17390.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetMaximalIterationCount", argTypes, term17192, args);
        assertTrue(recursiveEquals(term17192, term17390));
    }

};


