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

public class MultiStartUnivariateRealOptimizer_setAbsoluteAccuracy_1949076160133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29668;
     Object term30312;

    public MultiStartUnivariateRealOptimizer_setAbsoluteAccuracy_1949076160133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29668 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term29814 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term29944 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(term29814, term29814.getClass(), "optimizer", term29944);
        setField(term29668, term29668.getClass(), "optimizer", term29814);
        term30312 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term30313 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term30314 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term30314, term30314.getClass(), "resultComputed", false);
        setDoubleField(term30314, term30314.getClass(), "result", 0.0);
        setDoubleField(term30314, term30314.getClass(), "functionValue", 0.0);
        setIntField(term30314, term30314.getClass(), "maxEvaluations", 0);
        setIntField(term30314, term30314.getClass(), "evaluations", 0);
        setDoubleField(term30314, term30314.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term30314, term30314.getClass(), "relativeAccuracy", 0.0);
        setIntField(term30314, term30314.getClass(), "maximalIterationCount", 0);
        setDoubleField(term30314, term30314.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term30314, term30314.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term30314, term30314.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term30314, term30314.getClass(), "iterationCount", 0);
        setField(term30313, term30313.getClass(), "optimizer", term30314);
        setIntField(term30313, term30313.getClass(), "maxIterations", 0);
        setIntField(term30313, term30313.getClass(), "maxEvaluations", 0);
        setIntField(term30313, term30313.getClass(), "totalIterations", 0);
        setIntField(term30313, term30313.getClass(), "totalEvaluations", 0);
        setIntField(term30313, term30313.getClass(), "starts", 0);
        setField(term30313, term30313.getClass(), "generator", null);
        setField(term30313, term30313.getClass(), "optima", null);
        setField(term30313, term30313.getClass(), "optimaValues", null);
        setField(term30312, term30312.getClass(), "optimizer", term30313);
        setIntField(term30312, term30312.getClass(), "maxIterations", 0);
        setIntField(term30312, term30312.getClass(), "maxEvaluations", 0);
        setIntField(term30312, term30312.getClass(), "totalIterations", 0);
        setIntField(term30312, term30312.getClass(), "totalEvaluations", 0);
        setIntField(term30312, term30312.getClass(), "starts", 0);
        setField(term30312, term30312.getClass(), "generator", null);
        setField(term30312, term30312.getClass(), "optima", null);
        setField(term30312, term30312.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        callMethod(klass, "setAbsoluteAccuracy", argTypes, term29668, args);
        assertTrue(recursiveEquals(term29668, term30312));
    }

};


