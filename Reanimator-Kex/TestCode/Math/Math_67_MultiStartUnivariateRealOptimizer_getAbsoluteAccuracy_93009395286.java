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

public class MultiStartUnivariateRealOptimizer_getAbsoluteAccuracy_93009395286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16015;
     Object term16714;

    public MultiStartUnivariateRealOptimizer_getAbsoluteAccuracy_93009395286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16015 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term16145 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(term16015, term16015.getClass(), "optimizer", term16145);
        term16714 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term16715 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term16715, term16715.getClass(), "resultComputed", false);
        setDoubleField(term16715, term16715.getClass(), "result", 0.0);
        setDoubleField(term16715, term16715.getClass(), "functionValue", 0.0);
        setIntField(term16715, term16715.getClass(), "maxEvaluations", 0);
        setIntField(term16715, term16715.getClass(), "evaluations", 0);
        setDoubleField(term16715, term16715.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term16715, term16715.getClass(), "relativeAccuracy", 0.0);
        setIntField(term16715, term16715.getClass(), "maximalIterationCount", 0);
        setDoubleField(term16715, term16715.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term16715, term16715.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term16715, term16715.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term16715, term16715.getClass(), "iterationCount", 0);
        setField(term16714, term16714.getClass(), "optimizer", term16715);
        setIntField(term16714, term16714.getClass(), "maxIterations", 0);
        setIntField(term16714, term16714.getClass(), "maxEvaluations", 0);
        setIntField(term16714, term16714.getClass(), "totalIterations", 0);
        setIntField(term16714, term16714.getClass(), "totalEvaluations", 0);
        setIntField(term16714, term16714.getClass(), "starts", 0);
        setField(term16714, term16714.getClass(), "generator", null);
        setField(term16714, term16714.getClass(), "optima", null);
        setField(term16714, term16714.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAbsoluteAccuracy", argTypes, term16015, args);
        assertTrue(recursiveEquals(term16015, term16714));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


