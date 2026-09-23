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

public class MultiStartUnivariateRealOptimizer_setRelativeAccuracy_1722907733131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28633;
     Object term30003;

    public MultiStartUnivariateRealOptimizer_setRelativeAccuracy_1722907733131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28633 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term28779 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term28909 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(term28779, term28779.getClass(), "optimizer", term28909);
        setField(term28633, term28633.getClass(), "optimizer", term28779);
        term30003 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term30004 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term30005 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term30005, term30005.getClass(), "resultComputed", false);
        setDoubleField(term30005, term30005.getClass(), "result", 0.0);
        setDoubleField(term30005, term30005.getClass(), "functionValue", 0.0);
        setIntField(term30005, term30005.getClass(), "maxEvaluations", 0);
        setIntField(term30005, term30005.getClass(), "evaluations", 0);
        setDoubleField(term30005, term30005.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term30005, term30005.getClass(), "relativeAccuracy", 0.0);
        setIntField(term30005, term30005.getClass(), "maximalIterationCount", 0);
        setDoubleField(term30005, term30005.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term30005, term30005.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term30005, term30005.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term30005, term30005.getClass(), "iterationCount", 0);
        setField(term30004, term30004.getClass(), "optimizer", term30005);
        setIntField(term30004, term30004.getClass(), "maxIterations", 0);
        setIntField(term30004, term30004.getClass(), "maxEvaluations", 0);
        setIntField(term30004, term30004.getClass(), "totalIterations", 0);
        setIntField(term30004, term30004.getClass(), "totalEvaluations", 0);
        setIntField(term30004, term30004.getClass(), "starts", 0);
        setField(term30004, term30004.getClass(), "generator", null);
        setField(term30004, term30004.getClass(), "optima", null);
        setField(term30004, term30004.getClass(), "optimaValues", null);
        setField(term30003, term30003.getClass(), "optimizer", term30004);
        setIntField(term30003, term30003.getClass(), "maxIterations", 0);
        setIntField(term30003, term30003.getClass(), "maxEvaluations", 0);
        setIntField(term30003, term30003.getClass(), "totalIterations", 0);
        setIntField(term30003, term30003.getClass(), "totalEvaluations", 0);
        setIntField(term30003, term30003.getClass(), "starts", 0);
        setField(term30003, term30003.getClass(), "generator", null);
        setField(term30003, term30003.getClass(), "optima", null);
        setField(term30003, term30003.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        callMethod(klass, "setRelativeAccuracy", argTypes, term28633, args);
        assertTrue(recursiveEquals(term28633, term30003));
    }

};


