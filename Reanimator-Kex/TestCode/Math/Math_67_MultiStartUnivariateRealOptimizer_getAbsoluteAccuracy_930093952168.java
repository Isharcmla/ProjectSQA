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

public class MultiStartUnivariateRealOptimizer_getAbsoluteAccuracy_930093952168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36493;
     Object term45145;

    public MultiStartUnivariateRealOptimizer_getAbsoluteAccuracy_930093952168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36493 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term36639 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term36785 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term36915 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(term36785, term36785.getClass(), "optimizer", term36915);
        setField(term36639, term36639.getClass(), "optimizer", term36785);
        setField(term36493, term36493.getClass(), "optimizer", term36639);
        term45145 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term45146 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term45147 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term45148 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term45148, term45148.getClass(), "resultComputed", false);
        setDoubleField(term45148, term45148.getClass(), "result", 0.0);
        setDoubleField(term45148, term45148.getClass(), "functionValue", 0.0);
        setIntField(term45148, term45148.getClass(), "maxEvaluations", 0);
        setIntField(term45148, term45148.getClass(), "evaluations", 0);
        setDoubleField(term45148, term45148.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term45148, term45148.getClass(), "relativeAccuracy", 0.0);
        setIntField(term45148, term45148.getClass(), "maximalIterationCount", 0);
        setDoubleField(term45148, term45148.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term45148, term45148.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term45148, term45148.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term45148, term45148.getClass(), "iterationCount", 0);
        setField(term45147, term45147.getClass(), "optimizer", term45148);
        setIntField(term45147, term45147.getClass(), "maxIterations", 0);
        setIntField(term45147, term45147.getClass(), "maxEvaluations", 0);
        setIntField(term45147, term45147.getClass(), "totalIterations", 0);
        setIntField(term45147, term45147.getClass(), "totalEvaluations", 0);
        setIntField(term45147, term45147.getClass(), "starts", 0);
        setField(term45147, term45147.getClass(), "generator", null);
        setField(term45147, term45147.getClass(), "optima", null);
        setField(term45147, term45147.getClass(), "optimaValues", null);
        setField(term45146, term45146.getClass(), "optimizer", term45147);
        setIntField(term45146, term45146.getClass(), "maxIterations", 0);
        setIntField(term45146, term45146.getClass(), "maxEvaluations", 0);
        setIntField(term45146, term45146.getClass(), "totalIterations", 0);
        setIntField(term45146, term45146.getClass(), "totalEvaluations", 0);
        setIntField(term45146, term45146.getClass(), "starts", 0);
        setField(term45146, term45146.getClass(), "generator", null);
        setField(term45146, term45146.getClass(), "optima", null);
        setField(term45146, term45146.getClass(), "optimaValues", null);
        setField(term45145, term45145.getClass(), "optimizer", term45146);
        setIntField(term45145, term45145.getClass(), "maxIterations", 0);
        setIntField(term45145, term45145.getClass(), "maxEvaluations", 0);
        setIntField(term45145, term45145.getClass(), "totalIterations", 0);
        setIntField(term45145, term45145.getClass(), "totalEvaluations", 0);
        setIntField(term45145, term45145.getClass(), "starts", 0);
        setField(term45145, term45145.getClass(), "generator", null);
        setField(term45145, term45145.getClass(), "optima", null);
        setField(term45145, term45145.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAbsoluteAccuracy", argTypes, term36493, args);
        assertTrue(recursiveEquals(term36493, term45145));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


