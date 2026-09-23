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
import java.lang.OutOfMemoryError;
import static org.apache.commons.math3.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MultivariateNormalDistribution_getStandardDeviations_11403659913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134;

    public MultivariateNormalDistribution_getStandardDeviations_11403659913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134 = newInstance(Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        double[] term135 = (double[]) newDoubleArray(8);
        setDoubleElement(term135, 0, 0.5804948995371725);
        setDoubleElement(term135, 1, 0.20737514139742264);
        setDoubleElement(term135, 2, 0.7919370314903882);
        setDoubleElement(term135, 3, 0.2109867221632754);
        setDoubleElement(term135, 4, 0.3227335400819148);
        setDoubleElement(term135, 5, 0.43337207054070237);
        setDoubleElement(term135, 6, 0.13246999699526574);
        setDoubleElement(term135, 7, 0.9126850255993704);
        setField(term134, term134.getClass(), "means", term135);
        setField(term134, term134.getClass(), "covarianceMatrix", null);
        setField(term134, term134.getClass(), "covarianceMatrixInverse", null);
        setDoubleField(term134, term134.getClass(), "covarianceMatrixDeterminant", 0.11179067076100713);
        setField(term134, term134.getClass(), "samplingMatrix", null);
        setField(term134, term134.getClass(), "random", null);
        setIntField(term134, term134.getClass(), "dimension", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getStandardDeviations", argTypes, term134, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


