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

public class MultiStartUnivariateRealOptimizer_setAbsoluteAccuracy_1949076160179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41093;
     Object term48425;

    public MultiStartUnivariateRealOptimizer_setAbsoluteAccuracy_1949076160179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41093 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term41239 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term41385 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term41515 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(term41385, term41385.getClass(), "optimizer", term41515);
        setField(term41239, term41239.getClass(), "optimizer", term41385);
        setField(term41093, term41093.getClass(), "optimizer", term41239);
        term48425 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term48426 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term48427 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term48428 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term48428, term48428.getClass(), "resultComputed", false);
        setDoubleField(term48428, term48428.getClass(), "result", 0.0);
        setDoubleField(term48428, term48428.getClass(), "functionValue", 0.0);
        setIntField(term48428, term48428.getClass(), "maxEvaluations", 0);
        setIntField(term48428, term48428.getClass(), "evaluations", 0);
        setDoubleField(term48428, term48428.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term48428, term48428.getClass(), "relativeAccuracy", 0.0);
        setIntField(term48428, term48428.getClass(), "maximalIterationCount", 0);
        setDoubleField(term48428, term48428.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term48428, term48428.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term48428, term48428.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term48428, term48428.getClass(), "iterationCount", 0);
        setField(term48427, term48427.getClass(), "optimizer", term48428);
        setIntField(term48427, term48427.getClass(), "maxIterations", 0);
        setIntField(term48427, term48427.getClass(), "maxEvaluations", 0);
        setIntField(term48427, term48427.getClass(), "totalIterations", 0);
        setIntField(term48427, term48427.getClass(), "totalEvaluations", 0);
        setIntField(term48427, term48427.getClass(), "starts", 0);
        setField(term48427, term48427.getClass(), "generator", null);
        setField(term48427, term48427.getClass(), "optima", null);
        setField(term48427, term48427.getClass(), "optimaValues", null);
        setField(term48426, term48426.getClass(), "optimizer", term48427);
        setIntField(term48426, term48426.getClass(), "maxIterations", 0);
        setIntField(term48426, term48426.getClass(), "maxEvaluations", 0);
        setIntField(term48426, term48426.getClass(), "totalIterations", 0);
        setIntField(term48426, term48426.getClass(), "totalEvaluations", 0);
        setIntField(term48426, term48426.getClass(), "starts", 0);
        setField(term48426, term48426.getClass(), "generator", null);
        setField(term48426, term48426.getClass(), "optima", null);
        setField(term48426, term48426.getClass(), "optimaValues", null);
        setField(term48425, term48425.getClass(), "optimizer", term48426);
        setIntField(term48425, term48425.getClass(), "maxIterations", 0);
        setIntField(term48425, term48425.getClass(), "maxEvaluations", 0);
        setIntField(term48425, term48425.getClass(), "totalIterations", 0);
        setIntField(term48425, term48425.getClass(), "totalEvaluations", 0);
        setIntField(term48425, term48425.getClass(), "starts", 0);
        setField(term48425, term48425.getClass(), "generator", null);
        setField(term48425, term48425.getClass(), "optima", null);
        setField(term48425, term48425.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        callMethod(klass, "setAbsoluteAccuracy", argTypes, term41093, args);
        assertTrue(recursiveEquals(term41093, term48425));
    }

};


