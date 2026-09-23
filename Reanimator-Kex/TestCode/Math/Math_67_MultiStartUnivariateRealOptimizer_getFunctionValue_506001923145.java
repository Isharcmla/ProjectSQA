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

public class MultiStartUnivariateRealOptimizer_getFunctionValue_506001923145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33814;
     Object term34476;

    public MultiStartUnivariateRealOptimizer_getFunctionValue_506001923145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33814 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term33944 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term33944, term33944.getClass(), "resultComputed", true);
        setField(term33814, term33814.getClass(), "optimizer", term33944);
        term34476 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term34477 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term34477, term34477.getClass(), "resultComputed", true);
        setDoubleField(term34477, term34477.getClass(), "result", 0.0);
        setDoubleField(term34477, term34477.getClass(), "functionValue", 0.0);
        setIntField(term34477, term34477.getClass(), "maxEvaluations", 0);
        setIntField(term34477, term34477.getClass(), "evaluations", 0);
        setDoubleField(term34477, term34477.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term34477, term34477.getClass(), "relativeAccuracy", 0.0);
        setIntField(term34477, term34477.getClass(), "maximalIterationCount", 0);
        setDoubleField(term34477, term34477.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term34477, term34477.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term34477, term34477.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term34477, term34477.getClass(), "iterationCount", 0);
        setField(term34476, term34476.getClass(), "optimizer", term34477);
        setIntField(term34476, term34476.getClass(), "maxIterations", 0);
        setIntField(term34476, term34476.getClass(), "maxEvaluations", 0);
        setIntField(term34476, term34476.getClass(), "totalIterations", 0);
        setIntField(term34476, term34476.getClass(), "totalEvaluations", 0);
        setIntField(term34476, term34476.getClass(), "starts", 0);
        setField(term34476, term34476.getClass(), "generator", null);
        setField(term34476, term34476.getClass(), "optima", null);
        setField(term34476, term34476.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFunctionValue", argTypes, term33814, args);
        assertTrue(recursiveEquals(term33814, term34476));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


