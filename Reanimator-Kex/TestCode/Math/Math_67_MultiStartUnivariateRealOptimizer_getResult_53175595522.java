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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MultiStartUnivariateRealOptimizer_getResult_53175595522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29;

    public MultiStartUnivariateRealOptimizer_getResult_53175595522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term35 = (double[]) newDoubleArray(3);
        double[] term39 = (double[]) newDoubleArray(4);
        setField(term29, term29.getClass(), "optimizer", null);
        setIntField(term29, term29.getClass(), "maxIterations", -1955890973);
        setIntField(term29, term29.getClass(), "maxEvaluations", -2038273078);
        setIntField(term29, term29.getClass(), "totalIterations", 1227103734);
        setIntField(term29, term29.getClass(), "totalEvaluations", -1339778481);
        setIntField(term29, term29.getClass(), "starts", 1725571209);
        setField(term29, term29.getClass(), "generator", null);
        setDoubleElement(term35, 0, 0.37773193782763337);
        setDoubleElement(term35, 1, 0.8474802076607362);
        setDoubleElement(term35, 2, 0.5183269973490326);
        setField(term29, term29.getClass(), "optima", term35);
        setDoubleElement(term39, 0, 0.7655020693602768);
        setDoubleElement(term39, 1, 0.1374549299694151);
        setDoubleElement(term39, 2, 0.7031006357544823);
        setDoubleElement(term39, 3, 0.9527281779865117);
        setField(term29, term29.getClass(), "optimaValues", term39);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getResult", argTypes, term29, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


