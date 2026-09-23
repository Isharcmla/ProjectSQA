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

public class MultiStartUnivariateRealOptimizer_getOptimaValues_517563868102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19178;
     Object term20171;
     Object term20163;

    public MultiStartUnivariateRealOptimizer_getOptimaValues_517563868102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19178 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term19018 = (double[]) newDoubleArray(0);
        setField(term19178, term19178.getClass(), "optimaValues", term19018);
        term20171 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term20172 = (double[]) newDoubleArray(0);
        setField(term20171, term20171.getClass(), "optimizer", null);
        setIntField(term20171, term20171.getClass(), "maxIterations", 0);
        setIntField(term20171, term20171.getClass(), "maxEvaluations", 0);
        setIntField(term20171, term20171.getClass(), "totalIterations", 0);
        setIntField(term20171, term20171.getClass(), "totalEvaluations", 0);
        setIntField(term20171, term20171.getClass(), "starts", 0);
        setField(term20171, term20171.getClass(), "generator", null);
        setField(term20171, term20171.getClass(), "optima", null);
        setField(term20171, term20171.getClass(), "optimaValues", term20172);
        term20163 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOptimaValues", argTypes, term19178, args);
        assertTrue(recursiveEquals(term19178, term20171));
        assertTrue(recursiveEquals(retValue, term20163));
    }

};


