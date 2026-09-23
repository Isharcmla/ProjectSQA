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

public class MultiStartUnivariateRealOptimizer_getEvaluations_197128436227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151;
     Object term1948;

    public MultiStartUnivariateRealOptimizer_getEvaluations_197128436227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term157 = (double[]) newDoubleArray(5);
        double[] term163 = (double[]) newDoubleArray(2);
        setField(term151, term151.getClass(), "optimizer", null);
        setIntField(term151, term151.getClass(), "maxIterations", -1179120542);
        setIntField(term151, term151.getClass(), "maxEvaluations", -73683645);
        setIntField(term151, term151.getClass(), "totalIterations", -226514366);
        setIntField(term151, term151.getClass(), "totalEvaluations", 1193880199);
        setIntField(term151, term151.getClass(), "starts", -1087774327);
        setField(term151, term151.getClass(), "generator", null);
        setDoubleElement(term157, 0, 0.6862221294683138);
        setDoubleElement(term157, 1, 0.15917839663695388);
        setDoubleElement(term157, 2, 0.9374115574082594);
        setDoubleElement(term157, 3, 0.8454723071922143);
        setDoubleElement(term157, 4, 0.8566567697571895);
        setField(term151, term151.getClass(), "optima", term157);
        setDoubleElement(term163, 0, 0.9203805380592256);
        setDoubleElement(term163, 1, 0.5804948995371725);
        setField(term151, term151.getClass(), "optimaValues", term163);
        term1948 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term1949 = (double[]) newDoubleArray(5);
        double[] term1950 = (double[]) newDoubleArray(2);
        setField(term1948, term1948.getClass(), "optimizer", null);
        setIntField(term1948, term1948.getClass(), "maxIterations", -1179120542);
        setIntField(term1948, term1948.getClass(), "maxEvaluations", -73683645);
        setIntField(term1948, term1948.getClass(), "totalIterations", -226514366);
        setIntField(term1948, term1948.getClass(), "totalEvaluations", 1193880199);
        setIntField(term1948, term1948.getClass(), "starts", -1087774327);
        setField(term1948, term1948.getClass(), "generator", null);
        setDoubleElement(term1949, 0, 0.6862221294683138);
        setDoubleElement(term1949, 1, 0.15917839663695388);
        setDoubleElement(term1949, 2, 0.9374115574082594);
        setDoubleElement(term1949, 3, 0.8454723071922143);
        setDoubleElement(term1949, 4, 0.8566567697571895);
        setField(term1948, term1948.getClass(), "optima", term1949);
        setDoubleElement(term1950, 0, 0.9203805380592256);
        setDoubleElement(term1950, 1, 0.5804948995371725);
        setField(term1948, term1948.getClass(), "optimaValues", term1950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getEvaluations", argTypes, term151, args);
        assertTrue(recursiveEquals(term151, term1948));
        assertTrue(recursiveEquals(retValue, 1193880199));
    }

};


