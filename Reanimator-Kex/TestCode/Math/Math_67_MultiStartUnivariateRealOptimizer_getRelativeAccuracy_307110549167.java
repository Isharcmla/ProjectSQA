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

public class MultiStartUnivariateRealOptimizer_getRelativeAccuracy_307110549167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36055;
     Object term45050;

    public MultiStartUnivariateRealOptimizer_getRelativeAccuracy_307110549167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36055 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term36201 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term36331 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(term36201, term36201.getClass(), "optimizer", term36331);
        setField(term36055, term36055.getClass(), "optimizer", term36201);
        term45050 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term45051 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term45052 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term45052, term45052.getClass(), "resultComputed", false);
        setDoubleField(term45052, term45052.getClass(), "result", 0.0);
        setDoubleField(term45052, term45052.getClass(), "functionValue", 0.0);
        setIntField(term45052, term45052.getClass(), "maxEvaluations", 0);
        setIntField(term45052, term45052.getClass(), "evaluations", 0);
        setDoubleField(term45052, term45052.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term45052, term45052.getClass(), "relativeAccuracy", 0.0);
        setIntField(term45052, term45052.getClass(), "maximalIterationCount", 0);
        setDoubleField(term45052, term45052.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term45052, term45052.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term45052, term45052.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term45052, term45052.getClass(), "iterationCount", 0);
        setField(term45051, term45051.getClass(), "optimizer", term45052);
        setIntField(term45051, term45051.getClass(), "maxIterations", 0);
        setIntField(term45051, term45051.getClass(), "maxEvaluations", 0);
        setIntField(term45051, term45051.getClass(), "totalIterations", 0);
        setIntField(term45051, term45051.getClass(), "totalEvaluations", 0);
        setIntField(term45051, term45051.getClass(), "starts", 0);
        setField(term45051, term45051.getClass(), "generator", null);
        setField(term45051, term45051.getClass(), "optima", null);
        setField(term45051, term45051.getClass(), "optimaValues", null);
        setField(term45050, term45050.getClass(), "optimizer", term45051);
        setIntField(term45050, term45050.getClass(), "maxIterations", 0);
        setIntField(term45050, term45050.getClass(), "maxEvaluations", 0);
        setIntField(term45050, term45050.getClass(), "totalIterations", 0);
        setIntField(term45050, term45050.getClass(), "totalEvaluations", 0);
        setIntField(term45050, term45050.getClass(), "starts", 0);
        setField(term45050, term45050.getClass(), "generator", null);
        setField(term45050, term45050.getClass(), "optima", null);
        setField(term45050, term45050.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativeAccuracy", argTypes, term36055, args);
        assertTrue(recursiveEquals(term36055, term45050));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


