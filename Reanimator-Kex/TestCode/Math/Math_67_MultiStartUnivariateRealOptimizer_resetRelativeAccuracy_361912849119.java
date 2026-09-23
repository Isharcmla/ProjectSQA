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

public class MultiStartUnivariateRealOptimizer_resetRelativeAccuracy_361912849119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24608;
     Object term25975;

    public MultiStartUnivariateRealOptimizer_resetRelativeAccuracy_361912849119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24608 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term24754 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term24884 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(term24754, term24754.getClass(), "optimizer", term24884);
        setField(term24608, term24608.getClass(), "optimizer", term24754);
        term25975 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term25976 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term25977 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term25977, term25977.getClass(), "resultComputed", false);
        setDoubleField(term25977, term25977.getClass(), "result", 0.0);
        setDoubleField(term25977, term25977.getClass(), "functionValue", 0.0);
        setIntField(term25977, term25977.getClass(), "maxEvaluations", 0);
        setIntField(term25977, term25977.getClass(), "evaluations", 0);
        setDoubleField(term25977, term25977.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term25977, term25977.getClass(), "relativeAccuracy", 0.0);
        setIntField(term25977, term25977.getClass(), "maximalIterationCount", 0);
        setDoubleField(term25977, term25977.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term25977, term25977.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term25977, term25977.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term25977, term25977.getClass(), "iterationCount", 0);
        setField(term25976, term25976.getClass(), "optimizer", term25977);
        setIntField(term25976, term25976.getClass(), "maxIterations", 0);
        setIntField(term25976, term25976.getClass(), "maxEvaluations", 0);
        setIntField(term25976, term25976.getClass(), "totalIterations", 0);
        setIntField(term25976, term25976.getClass(), "totalEvaluations", 0);
        setIntField(term25976, term25976.getClass(), "starts", 0);
        setField(term25976, term25976.getClass(), "generator", null);
        setField(term25976, term25976.getClass(), "optima", null);
        setField(term25976, term25976.getClass(), "optimaValues", null);
        setField(term25975, term25975.getClass(), "optimizer", term25976);
        setIntField(term25975, term25975.getClass(), "maxIterations", 0);
        setIntField(term25975, term25975.getClass(), "maxEvaluations", 0);
        setIntField(term25975, term25975.getClass(), "totalIterations", 0);
        setIntField(term25975, term25975.getClass(), "totalEvaluations", 0);
        setIntField(term25975, term25975.getClass(), "starts", 0);
        setField(term25975, term25975.getClass(), "generator", null);
        setField(term25975, term25975.getClass(), "optima", null);
        setField(term25975, term25975.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetRelativeAccuracy", argTypes, term24608, args);
        assertTrue(recursiveEquals(term24608, term25975));
    }

};


