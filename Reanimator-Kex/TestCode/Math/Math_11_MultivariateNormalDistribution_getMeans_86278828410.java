package org.apache.commons.math3.distribution;

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
import static org.apache.commons.math3.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.distribution.EqualityUtils.*;

public class MultivariateNormalDistribution_getMeans_86278828410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109;
     Object term2582;
     Object term2571;

    public MultivariateNormalDistribution_getMeans_86278828410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109 = newInstance(Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        double[] term110 = (double[]) newDoubleArray(3);
        setDoubleElement(term110, 0, 0.2192450926212024);
        setDoubleElement(term110, 1, 0.7591353014991907);
        setDoubleElement(term110, 2, 0.791695029600875);
        setField(term109, term109.getClass(), "means", term110);
        setField(term109, term109.getClass(), "covarianceMatrix", null);
        setField(term109, term109.getClass(), "covarianceMatrixInverse", null);
        setDoubleField(term109, term109.getClass(), "covarianceMatrixDeterminant", 0.6862221294683138);
        setField(term109, term109.getClass(), "samplingMatrix", null);
        setField(term109, term109.getClass(), "random", null);
        setIntField(term109, term109.getClass(), "dimension", 568599855);
        term2582 = newInstance(Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        double[] term2583 = (double[]) newDoubleArray(3);
        setDoubleElement(term2583, 0, 0.2192450926212024);
        setDoubleElement(term2583, 1, 0.7591353014991907);
        setDoubleElement(term2583, 2, 0.791695029600875);
        setField(term2582, term2582.getClass(), "means", term2583);
        setField(term2582, term2582.getClass(), "covarianceMatrix", null);
        setField(term2582, term2582.getClass(), "covarianceMatrixInverse", null);
        setDoubleField(term2582, term2582.getClass(), "covarianceMatrixDeterminant", 0.6862221294683138);
        setField(term2582, term2582.getClass(), "samplingMatrix", null);
        setField(term2582, term2582.getClass(), "random", null);
        setIntField(term2582, term2582.getClass(), "dimension", 568599855);
        term2571 = (double[]) newDoubleArray(3);
        setDoubleElement(term2571, 0, 0.2192450926212024);
        setDoubleElement(term2571, 1, 0.7591353014991907);
        setDoubleElement(term2571, 2, 0.791695029600875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMeans", argTypes, term109, args);
        assertTrue(recursiveEquals(term109, term2582));
        assertTrue(recursiveEquals(retValue, term2571));
    }

};


