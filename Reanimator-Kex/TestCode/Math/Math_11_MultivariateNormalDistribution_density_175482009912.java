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
import org.apache.commons.math3.exception.DimensionMismatchException;
import static org.apache.commons.math3.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MultivariateNormalDistribution_density_175482009912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125;
     Object term129;

    public MultivariateNormalDistribution_density_175482009912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125 = newInstance(Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        double[] term126 = (double[]) newDoubleArray(0);
        setField(term125, term125.getClass(), "means", term126);
        setField(term125, term125.getClass(), "covarianceMatrix", null);
        setField(term125, term125.getClass(), "covarianceMatrixInverse", null);
        setDoubleField(term125, term125.getClass(), "covarianceMatrixDeterminant", 0.8454723071922143);
        setField(term125, term125.getClass(), "samplingMatrix", null);
        setField(term125, term125.getClass(), "random", null);
        setIntField(term125, term125.getClass(), "dimension", 1484323161);
        term129 = (double[]) newDoubleArray(2);
        setDoubleElement(term129, 0, 0.8566567697571895);
        setDoubleElement(term129, 1, 0.9203805380592256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term129;
        try {
            callMethod(klass, "density", argTypes, term125, args);
            assertTrue(false);
        }
        catch (DimensionMismatchException e) {
        }

    }

};


