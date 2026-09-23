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
import java.lang.NullPointerException;
import static org.apache.commons.math3.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MultivariateNormalDistribution_getCovariances_60735650711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;

    public MultivariateNormalDistribution_getCovariances_60735650711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119 = newInstance(Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        double[] term120 = (double[]) newDoubleArray(1);
        setDoubleElement(term120, 0, 0.15917839663695388);
        setField(term119, term119.getClass(), "means", term120);
        setField(term119, term119.getClass(), "covarianceMatrix", null);
        setField(term119, term119.getClass(), "covarianceMatrixInverse", null);
        setDoubleField(term119, term119.getClass(), "covarianceMatrixDeterminant", 0.9374115574082594);
        setField(term119, term119.getClass(), "samplingMatrix", null);
        setField(term119, term119.getClass(), "random", null);
        setIntField(term119, term119.getClass(), "dimension", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getCovariances", argTypes, term119, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


