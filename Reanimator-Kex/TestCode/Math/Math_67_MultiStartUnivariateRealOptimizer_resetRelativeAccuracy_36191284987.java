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

public class MultiStartUnivariateRealOptimizer_resetRelativeAccuracy_36191284987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16549;
     Object term16748;

    public MultiStartUnivariateRealOptimizer_resetRelativeAccuracy_36191284987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16549 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term16679 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(term16549, term16549.getClass(), "optimizer", term16679);
        term16748 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term16749 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term16749, term16749.getClass(), "resultComputed", false);
        setDoubleField(term16749, term16749.getClass(), "result", 0.0);
        setDoubleField(term16749, term16749.getClass(), "functionValue", 0.0);
        setIntField(term16749, term16749.getClass(), "maxEvaluations", 0);
        setIntField(term16749, term16749.getClass(), "evaluations", 0);
        setDoubleField(term16749, term16749.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term16749, term16749.getClass(), "relativeAccuracy", 0.0);
        setIntField(term16749, term16749.getClass(), "maximalIterationCount", 0);
        setDoubleField(term16749, term16749.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term16749, term16749.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term16749, term16749.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term16749, term16749.getClass(), "iterationCount", 0);
        setField(term16748, term16748.getClass(), "optimizer", term16749);
        setIntField(term16748, term16748.getClass(), "maxIterations", 0);
        setIntField(term16748, term16748.getClass(), "maxEvaluations", 0);
        setIntField(term16748, term16748.getClass(), "totalIterations", 0);
        setIntField(term16748, term16748.getClass(), "totalEvaluations", 0);
        setIntField(term16748, term16748.getClass(), "starts", 0);
        setField(term16748, term16748.getClass(), "generator", null);
        setField(term16748, term16748.getClass(), "optima", null);
        setField(term16748, term16748.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetRelativeAccuracy", argTypes, term16549, args);
        assertTrue(recursiveEquals(term16549, term16748));
    }

};


