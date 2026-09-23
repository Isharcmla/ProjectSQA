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

public class MultiStartUnivariateRealOptimizer_getResult_531755955185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44333;
     Object term49956;

    public MultiStartUnivariateRealOptimizer_getResult_531755955185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44333 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term44479 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term44609 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term44609, term44609.getClass(), "resultComputed", true);
        setField(term44479, term44479.getClass(), "optimizer", term44609);
        setField(term44333, term44333.getClass(), "optimizer", term44479);
        term49956 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term49957 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term49958 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term49958, term49958.getClass(), "resultComputed", true);
        setDoubleField(term49958, term49958.getClass(), "result", 0.0);
        setDoubleField(term49958, term49958.getClass(), "functionValue", 0.0);
        setIntField(term49958, term49958.getClass(), "maxEvaluations", 0);
        setIntField(term49958, term49958.getClass(), "evaluations", 0);
        setDoubleField(term49958, term49958.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term49958, term49958.getClass(), "relativeAccuracy", 0.0);
        setIntField(term49958, term49958.getClass(), "maximalIterationCount", 0);
        setDoubleField(term49958, term49958.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term49958, term49958.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term49958, term49958.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term49958, term49958.getClass(), "iterationCount", 0);
        setField(term49957, term49957.getClass(), "optimizer", term49958);
        setIntField(term49957, term49957.getClass(), "maxIterations", 0);
        setIntField(term49957, term49957.getClass(), "maxEvaluations", 0);
        setIntField(term49957, term49957.getClass(), "totalIterations", 0);
        setIntField(term49957, term49957.getClass(), "totalEvaluations", 0);
        setIntField(term49957, term49957.getClass(), "starts", 0);
        setField(term49957, term49957.getClass(), "generator", null);
        setField(term49957, term49957.getClass(), "optima", null);
        setField(term49957, term49957.getClass(), "optimaValues", null);
        setField(term49956, term49956.getClass(), "optimizer", term49957);
        setIntField(term49956, term49956.getClass(), "maxIterations", 0);
        setIntField(term49956, term49956.getClass(), "maxEvaluations", 0);
        setIntField(term49956, term49956.getClass(), "totalIterations", 0);
        setIntField(term49956, term49956.getClass(), "totalEvaluations", 0);
        setIntField(term49956, term49956.getClass(), "starts", 0);
        setField(term49956, term49956.getClass(), "generator", null);
        setField(term49956, term49956.getClass(), "optima", null);
        setField(term49956, term49956.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getResult", argTypes, term44333, args);
        assertTrue(recursiveEquals(term44333, term49956));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


