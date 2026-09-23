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

public class MultiStartUnivariateRealOptimizer_setRelativeAccuracy_172290773390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16906;
     Object term17356;

    public MultiStartUnivariateRealOptimizer_setRelativeAccuracy_172290773390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16906 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term17036 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(term16906, term16906.getClass(), "optimizer", term17036);
        term17356 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term17357 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term17357, term17357.getClass(), "resultComputed", false);
        setDoubleField(term17357, term17357.getClass(), "result", 0.0);
        setDoubleField(term17357, term17357.getClass(), "functionValue", 0.0);
        setIntField(term17357, term17357.getClass(), "maxEvaluations", 0);
        setIntField(term17357, term17357.getClass(), "evaluations", 0);
        setDoubleField(term17357, term17357.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term17357, term17357.getClass(), "relativeAccuracy", 0.0);
        setIntField(term17357, term17357.getClass(), "maximalIterationCount", 0);
        setDoubleField(term17357, term17357.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term17357, term17357.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term17357, term17357.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term17357, term17357.getClass(), "iterationCount", 0);
        setField(term17356, term17356.getClass(), "optimizer", term17357);
        setIntField(term17356, term17356.getClass(), "maxIterations", 0);
        setIntField(term17356, term17356.getClass(), "maxEvaluations", 0);
        setIntField(term17356, term17356.getClass(), "totalIterations", 0);
        setIntField(term17356, term17356.getClass(), "totalEvaluations", 0);
        setIntField(term17356, term17356.getClass(), "starts", 0);
        setField(term17356, term17356.getClass(), "generator", null);
        setField(term17356, term17356.getClass(), "optima", null);
        setField(term17356, term17356.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        callMethod(klass, "setRelativeAccuracy", argTypes, term16906, args);
        assertTrue(recursiveEquals(term16906, term17356));
    }

};


