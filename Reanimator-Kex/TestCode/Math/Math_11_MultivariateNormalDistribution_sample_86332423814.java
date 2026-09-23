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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.math3.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MultivariateNormalDistribution_sample_86332423814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154;

    public MultivariateNormalDistribution_sample_86332423814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154 = newInstance(Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        double[] term155 = (double[]) newDoubleArray(6);
        setDoubleElement(term155, 0, 0.5306473989087822);
        setDoubleElement(term155, 1, 0.022483645678509023);
        setDoubleElement(term155, 2, 0.025133051616627267);
        setDoubleElement(term155, 3, 0.016575281023182953);
        setDoubleElement(term155, 4, 0.5308350402051779);
        setDoubleElement(term155, 5, 0.7154795600170818);
        setField(term154, term154.getClass(), "means", term155);
        setField(term154, term154.getClass(), "covarianceMatrix", null);
        setField(term154, term154.getClass(), "covarianceMatrixInverse", null);
        setDoubleField(term154, term154.getClass(), "covarianceMatrixDeterminant", 0.6355029654528058);
        setField(term154, term154.getClass(), "samplingMatrix", null);
        setField(term154, term154.getClass(), "random", null);
        setIntField(term154, term154.getClass(), "dimension", -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term154, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


