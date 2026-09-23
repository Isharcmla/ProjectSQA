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

public class MultiStartUnivariateRealOptimizer_getRelativeAccuracy_307110549182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42713;
     Object term49427;

    public MultiStartUnivariateRealOptimizer_getRelativeAccuracy_307110549182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42713 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term42859 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term43005 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term43135 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(term43005, term43005.getClass(), "optimizer", term43135);
        setField(term42859, term42859.getClass(), "optimizer", term43005);
        setField(term42713, term42713.getClass(), "optimizer", term42859);
        term49427 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term49428 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term49429 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term49430 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term49430, term49430.getClass(), "resultComputed", false);
        setDoubleField(term49430, term49430.getClass(), "result", 0.0);
        setDoubleField(term49430, term49430.getClass(), "functionValue", 0.0);
        setIntField(term49430, term49430.getClass(), "maxEvaluations", 0);
        setIntField(term49430, term49430.getClass(), "evaluations", 0);
        setDoubleField(term49430, term49430.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term49430, term49430.getClass(), "relativeAccuracy", 0.0);
        setIntField(term49430, term49430.getClass(), "maximalIterationCount", 0);
        setDoubleField(term49430, term49430.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term49430, term49430.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term49430, term49430.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term49430, term49430.getClass(), "iterationCount", 0);
        setField(term49429, term49429.getClass(), "optimizer", term49430);
        setIntField(term49429, term49429.getClass(), "maxIterations", 0);
        setIntField(term49429, term49429.getClass(), "maxEvaluations", 0);
        setIntField(term49429, term49429.getClass(), "totalIterations", 0);
        setIntField(term49429, term49429.getClass(), "totalEvaluations", 0);
        setIntField(term49429, term49429.getClass(), "starts", 0);
        setField(term49429, term49429.getClass(), "generator", null);
        setField(term49429, term49429.getClass(), "optima", null);
        setField(term49429, term49429.getClass(), "optimaValues", null);
        setField(term49428, term49428.getClass(), "optimizer", term49429);
        setIntField(term49428, term49428.getClass(), "maxIterations", 0);
        setIntField(term49428, term49428.getClass(), "maxEvaluations", 0);
        setIntField(term49428, term49428.getClass(), "totalIterations", 0);
        setIntField(term49428, term49428.getClass(), "totalEvaluations", 0);
        setIntField(term49428, term49428.getClass(), "starts", 0);
        setField(term49428, term49428.getClass(), "generator", null);
        setField(term49428, term49428.getClass(), "optima", null);
        setField(term49428, term49428.getClass(), "optimaValues", null);
        setField(term49427, term49427.getClass(), "optimizer", term49428);
        setIntField(term49427, term49427.getClass(), "maxIterations", 0);
        setIntField(term49427, term49427.getClass(), "maxEvaluations", 0);
        setIntField(term49427, term49427.getClass(), "totalIterations", 0);
        setIntField(term49427, term49427.getClass(), "totalEvaluations", 0);
        setIntField(term49427, term49427.getClass(), "starts", 0);
        setField(term49427, term49427.getClass(), "generator", null);
        setField(term49427, term49427.getClass(), "optima", null);
        setField(term49427, term49427.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativeAccuracy", argTypes, term42713, args);
        assertTrue(recursiveEquals(term42713, term49427));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


