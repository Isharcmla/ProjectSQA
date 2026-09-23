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

public class MultiStartUnivariateRealOptimizer_setAbsoluteAccuracy_194907616094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17548;
     Object term17998;

    public MultiStartUnivariateRealOptimizer_setAbsoluteAccuracy_194907616094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17548 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term17678 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setField(term17548, term17548.getClass(), "optimizer", term17678);
        term17998 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term17999 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term17999, term17999.getClass(), "resultComputed", false);
        setDoubleField(term17999, term17999.getClass(), "result", 0.0);
        setDoubleField(term17999, term17999.getClass(), "functionValue", 0.0);
        setIntField(term17999, term17999.getClass(), "maxEvaluations", 0);
        setIntField(term17999, term17999.getClass(), "evaluations", 0);
        setDoubleField(term17999, term17999.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term17999, term17999.getClass(), "relativeAccuracy", 0.0);
        setIntField(term17999, term17999.getClass(), "maximalIterationCount", 0);
        setDoubleField(term17999, term17999.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term17999, term17999.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term17999, term17999.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term17999, term17999.getClass(), "iterationCount", 0);
        setField(term17998, term17998.getClass(), "optimizer", term17999);
        setIntField(term17998, term17998.getClass(), "maxIterations", 0);
        setIntField(term17998, term17998.getClass(), "maxEvaluations", 0);
        setIntField(term17998, term17998.getClass(), "totalIterations", 0);
        setIntField(term17998, term17998.getClass(), "totalEvaluations", 0);
        setIntField(term17998, term17998.getClass(), "starts", 0);
        setField(term17998, term17998.getClass(), "generator", null);
        setField(term17998, term17998.getClass(), "optima", null);
        setField(term17998, term17998.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        callMethod(klass, "setAbsoluteAccuracy", argTypes, term17548, args);
        assertTrue(recursiveEquals(term17548, term17998));
    }

};


