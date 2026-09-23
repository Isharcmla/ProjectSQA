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
import java.lang.Integer;

public class MultiStartUnivariateRealOptimizer_setMaxEvaluations_72144888434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317;
     Object term333;
     Object term3302;

    public MultiStartUnivariateRealOptimizer_setMaxEvaluations_72144888434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term317 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term323 = (double[]) newDoubleArray(5);
        double[] term329 = (double[]) newDoubleArray(3);
        setField(term317, term317.getClass(), "optimizer", null);
        setIntField(term317, term317.getClass(), "maxIterations", -93135961);
        setIntField(term317, term317.getClass(), "maxEvaluations", -112921587);
        setIntField(term317, term317.getClass(), "totalIterations", 933028652);
        setIntField(term317, term317.getClass(), "totalEvaluations", 287287233);
        setIntField(term317, term317.getClass(), "starts", 962840079);
        setField(term317, term317.getClass(), "generator", null);
        setDoubleElement(term323, 0, 0.07417792024383196);
        setDoubleElement(term323, 1, 0.686293604788188);
        setDoubleElement(term323, 2, 0.12764449157430724);
        setDoubleElement(term323, 3, 0.39446728256884744);
        setDoubleElement(term323, 4, 0.7865909711092062);
        setField(term317, term317.getClass(), "optima", term323);
        setDoubleElement(term329, 0, 0.06587158449170749);
        setDoubleElement(term329, 1, 0.0865998004187658);
        setDoubleElement(term329, 2, 0.9628647861255637);
        setField(term317, term317.getClass(), "optimaValues", term329);
        term333 = new Integer(1540719661);
        term3302 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term3303 = (double[]) newDoubleArray(5);
        double[] term3304 = (double[]) newDoubleArray(3);
        setField(term3302, term3302.getClass(), "optimizer", null);
        setIntField(term3302, term3302.getClass(), "maxIterations", -93135961);
        setIntField(term3302, term3302.getClass(), "maxEvaluations", 1540719661);
        setIntField(term3302, term3302.getClass(), "totalIterations", 933028652);
        setIntField(term3302, term3302.getClass(), "totalEvaluations", 287287233);
        setIntField(term3302, term3302.getClass(), "starts", 962840079);
        setField(term3302, term3302.getClass(), "generator", null);
        setDoubleElement(term3303, 0, 0.07417792024383196);
        setDoubleElement(term3303, 1, 0.686293604788188);
        setDoubleElement(term3303, 2, 0.12764449157430724);
        setDoubleElement(term3303, 3, 0.39446728256884744);
        setDoubleElement(term3303, 4, 0.7865909711092062);
        setField(term3302, term3302.getClass(), "optima", term3303);
        setDoubleElement(term3304, 0, 0.06587158449170749);
        setDoubleElement(term3304, 1, 0.0865998004187658);
        setDoubleElement(term3304, 2, 0.9628647861255637);
        setField(term3302, term3302.getClass(), "optimaValues", term3304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term333;
        callMethod(klass, "setMaxEvaluations", argTypes, term317, args);
        assertTrue(recursiveEquals(term317, term3302));
        assertTrue(recursiveEquals(term333, 1540719661));
    }

};


