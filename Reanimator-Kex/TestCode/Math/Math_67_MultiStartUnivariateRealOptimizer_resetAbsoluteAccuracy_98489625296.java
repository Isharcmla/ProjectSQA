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

public class MultiStartUnivariateRealOptimizer_resetAbsoluteAccuracy_98489625296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17834;
     Object term18481;

    public MultiStartUnivariateRealOptimizer_resetAbsoluteAccuracy_98489625296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17834 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term17964 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(term17834, term17834.getClass(), "optimizer", term17964);
        term18481 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term18482 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term18482, term18482.getClass(), "resultComputed", false);
        setDoubleField(term18482, term18482.getClass(), "result", 0.0);
        setDoubleField(term18482, term18482.getClass(), "functionValue", 0.0);
        setIntField(term18482, term18482.getClass(), "maxEvaluations", 0);
        setIntField(term18482, term18482.getClass(), "evaluations", 0);
        setDoubleField(term18482, term18482.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term18482, term18482.getClass(), "relativeAccuracy", 0.0);
        setIntField(term18482, term18482.getClass(), "maximalIterationCount", 0);
        setDoubleField(term18482, term18482.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term18482, term18482.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term18482, term18482.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term18482, term18482.getClass(), "iterationCount", 0);
        setField(term18481, term18481.getClass(), "optimizer", term18482);
        setIntField(term18481, term18481.getClass(), "maxIterations", 0);
        setIntField(term18481, term18481.getClass(), "maxEvaluations", 0);
        setIntField(term18481, term18481.getClass(), "totalIterations", 0);
        setIntField(term18481, term18481.getClass(), "totalEvaluations", 0);
        setIntField(term18481, term18481.getClass(), "starts", 0);
        setField(term18481, term18481.getClass(), "generator", null);
        setField(term18481, term18481.getClass(), "optima", null);
        setField(term18481, term18481.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetAbsoluteAccuracy", argTypes, term17834, args);
        assertTrue(recursiveEquals(term17834, term18481));
    }

};


