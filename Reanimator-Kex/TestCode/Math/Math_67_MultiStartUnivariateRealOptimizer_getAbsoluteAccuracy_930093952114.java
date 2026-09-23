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

public class MultiStartUnivariateRealOptimizer_getAbsoluteAccuracy_930093952114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23016;
     Object term24200;

    public MultiStartUnivariateRealOptimizer_getAbsoluteAccuracy_930093952114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23016 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term23162 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term23292 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(term23162, term23162.getClass(), "optimizer", term23292);
        setField(term23016, term23016.getClass(), "optimizer", term23162);
        term24200 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term24201 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term24202 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term24202, term24202.getClass(), "resultComputed", false);
        setDoubleField(term24202, term24202.getClass(), "result", 0.0);
        setDoubleField(term24202, term24202.getClass(), "functionValue", 0.0);
        setIntField(term24202, term24202.getClass(), "maxEvaluations", 0);
        setIntField(term24202, term24202.getClass(), "evaluations", 0);
        setDoubleField(term24202, term24202.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term24202, term24202.getClass(), "relativeAccuracy", 0.0);
        setIntField(term24202, term24202.getClass(), "maximalIterationCount", 0);
        setDoubleField(term24202, term24202.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term24202, term24202.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term24202, term24202.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term24202, term24202.getClass(), "iterationCount", 0);
        setField(term24201, term24201.getClass(), "optimizer", term24202);
        setIntField(term24201, term24201.getClass(), "maxIterations", 0);
        setIntField(term24201, term24201.getClass(), "maxEvaluations", 0);
        setIntField(term24201, term24201.getClass(), "totalIterations", 0);
        setIntField(term24201, term24201.getClass(), "totalEvaluations", 0);
        setIntField(term24201, term24201.getClass(), "starts", 0);
        setField(term24201, term24201.getClass(), "generator", null);
        setField(term24201, term24201.getClass(), "optima", null);
        setField(term24201, term24201.getClass(), "optimaValues", null);
        setField(term24200, term24200.getClass(), "optimizer", term24201);
        setIntField(term24200, term24200.getClass(), "maxIterations", 0);
        setIntField(term24200, term24200.getClass(), "maxEvaluations", 0);
        setIntField(term24200, term24200.getClass(), "totalIterations", 0);
        setIntField(term24200, term24200.getClass(), "totalEvaluations", 0);
        setIntField(term24200, term24200.getClass(), "starts", 0);
        setField(term24200, term24200.getClass(), "generator", null);
        setField(term24200, term24200.getClass(), "optima", null);
        setField(term24200, term24200.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAbsoluteAccuracy", argTypes, term23016, args);
        assertTrue(recursiveEquals(term23016, term24200));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


