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

public class MultiStartUnivariateRealOptimizer_getOptima_27505533466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10642;
     Object term10953;
     Object term10945;

    public MultiStartUnivariateRealOptimizer_getOptima_27505533466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10642 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term10483 = (double[]) newDoubleArray(0);
        setField(term10642, term10642.getClass(), "optima", term10483);
        term10953 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term10954 = (double[]) newDoubleArray(0);
        setField(term10953, term10953.getClass(), "optimizer", null);
        setIntField(term10953, term10953.getClass(), "maxIterations", 0);
        setIntField(term10953, term10953.getClass(), "maxEvaluations", 0);
        setIntField(term10953, term10953.getClass(), "totalIterations", 0);
        setIntField(term10953, term10953.getClass(), "totalEvaluations", 0);
        setIntField(term10953, term10953.getClass(), "starts", 0);
        setField(term10953, term10953.getClass(), "generator", null);
        setField(term10953, term10953.getClass(), "optima", term10954);
        setField(term10953, term10953.getClass(), "optimaValues", null);
        term10945 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOptima", argTypes, term10642, args);
        assertTrue(recursiveEquals(term10642, term10953));
        assertTrue(recursiveEquals(retValue, term10945));
    }

};


