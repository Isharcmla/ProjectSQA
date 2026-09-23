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

public class MultiStartUnivariateRealOptimizer_resetMaximalIterationCount_1895972109127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27890;
     Object term28472;

    public MultiStartUnivariateRealOptimizer_resetMaximalIterationCount_1895972109127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27890 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term28036 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term28166 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(term28036, term28036.getClass(), "optimizer", term28166);
        setField(term27890, term27890.getClass(), "optimizer", term28036);
        term28472 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term28473 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term28474 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term28474, term28474.getClass(), "resultComputed", false);
        setDoubleField(term28474, term28474.getClass(), "result", 0.0);
        setDoubleField(term28474, term28474.getClass(), "functionValue", 0.0);
        setIntField(term28474, term28474.getClass(), "maxEvaluations", 0);
        setIntField(term28474, term28474.getClass(), "evaluations", 0);
        setDoubleField(term28474, term28474.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term28474, term28474.getClass(), "relativeAccuracy", 0.0);
        setIntField(term28474, term28474.getClass(), "maximalIterationCount", 0);
        setDoubleField(term28474, term28474.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term28474, term28474.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term28474, term28474.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term28474, term28474.getClass(), "iterationCount", 0);
        setField(term28473, term28473.getClass(), "optimizer", term28474);
        setIntField(term28473, term28473.getClass(), "maxIterations", 0);
        setIntField(term28473, term28473.getClass(), "maxEvaluations", 0);
        setIntField(term28473, term28473.getClass(), "totalIterations", 0);
        setIntField(term28473, term28473.getClass(), "totalEvaluations", 0);
        setIntField(term28473, term28473.getClass(), "starts", 0);
        setField(term28473, term28473.getClass(), "generator", null);
        setField(term28473, term28473.getClass(), "optima", null);
        setField(term28473, term28473.getClass(), "optimaValues", null);
        setField(term28472, term28472.getClass(), "optimizer", term28473);
        setIntField(term28472, term28472.getClass(), "maxIterations", 0);
        setIntField(term28472, term28472.getClass(), "maxEvaluations", 0);
        setIntField(term28472, term28472.getClass(), "totalIterations", 0);
        setIntField(term28472, term28472.getClass(), "totalEvaluations", 0);
        setIntField(term28472, term28472.getClass(), "starts", 0);
        setField(term28472, term28472.getClass(), "generator", null);
        setField(term28472, term28472.getClass(), "optima", null);
        setField(term28472, term28472.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetMaximalIterationCount", argTypes, term27890, args);
        assertTrue(recursiveEquals(term27890, term28472));
    }

};


