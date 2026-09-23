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

public class MultiStartUnivariateRealOptimizer_resetAbsoluteAccuracy_984896252169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37077;
     Object term45237;

    public MultiStartUnivariateRealOptimizer_resetAbsoluteAccuracy_984896252169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37077 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term37223 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term37369 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term37499 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(term37369, term37369.getClass(), "optimizer", term37499);
        setField(term37223, term37223.getClass(), "optimizer", term37369);
        setField(term37077, term37077.getClass(), "optimizer", term37223);
        term45237 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term45238 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term45239 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term45240 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term45240, term45240.getClass(), "resultComputed", false);
        setDoubleField(term45240, term45240.getClass(), "result", 0.0);
        setDoubleField(term45240, term45240.getClass(), "functionValue", 0.0);
        setIntField(term45240, term45240.getClass(), "maxEvaluations", 0);
        setIntField(term45240, term45240.getClass(), "evaluations", 0);
        setDoubleField(term45240, term45240.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term45240, term45240.getClass(), "relativeAccuracy", 0.0);
        setIntField(term45240, term45240.getClass(), "maximalIterationCount", 0);
        setDoubleField(term45240, term45240.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term45240, term45240.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term45240, term45240.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term45240, term45240.getClass(), "iterationCount", 0);
        setField(term45239, term45239.getClass(), "optimizer", term45240);
        setIntField(term45239, term45239.getClass(), "maxIterations", 0);
        setIntField(term45239, term45239.getClass(), "maxEvaluations", 0);
        setIntField(term45239, term45239.getClass(), "totalIterations", 0);
        setIntField(term45239, term45239.getClass(), "totalEvaluations", 0);
        setIntField(term45239, term45239.getClass(), "starts", 0);
        setField(term45239, term45239.getClass(), "generator", null);
        setField(term45239, term45239.getClass(), "optima", null);
        setField(term45239, term45239.getClass(), "optimaValues", null);
        setField(term45238, term45238.getClass(), "optimizer", term45239);
        setIntField(term45238, term45238.getClass(), "maxIterations", 0);
        setIntField(term45238, term45238.getClass(), "maxEvaluations", 0);
        setIntField(term45238, term45238.getClass(), "totalIterations", 0);
        setIntField(term45238, term45238.getClass(), "totalEvaluations", 0);
        setIntField(term45238, term45238.getClass(), "starts", 0);
        setField(term45238, term45238.getClass(), "generator", null);
        setField(term45238, term45238.getClass(), "optima", null);
        setField(term45238, term45238.getClass(), "optimaValues", null);
        setField(term45237, term45237.getClass(), "optimizer", term45238);
        setIntField(term45237, term45237.getClass(), "maxIterations", 0);
        setIntField(term45237, term45237.getClass(), "maxEvaluations", 0);
        setIntField(term45237, term45237.getClass(), "totalIterations", 0);
        setIntField(term45237, term45237.getClass(), "totalEvaluations", 0);
        setIntField(term45237, term45237.getClass(), "starts", 0);
        setField(term45237, term45237.getClass(), "generator", null);
        setField(term45237, term45237.getClass(), "optima", null);
        setField(term45237, term45237.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetAbsoluteAccuracy", argTypes, term37077, args);
        assertTrue(recursiveEquals(term37077, term45237));
    }

};


