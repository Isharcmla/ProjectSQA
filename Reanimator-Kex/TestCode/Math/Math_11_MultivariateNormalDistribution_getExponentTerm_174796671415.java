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

public class MultivariateNormalDistribution_getExponentTerm_174796671415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170;
     Object term176;

    public MultivariateNormalDistribution_getExponentTerm_174796671415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170 = newInstance(Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        double[] term171 = (double[]) newDoubleArray(2);
        setDoubleElement(term171, 0, 0.0022646783892913414);
        setDoubleElement(term171, 1, 0.36226058076369927);
        setField(term170, term170.getClass(), "means", term171);
        setField(term170, term170.getClass(), "covarianceMatrix", null);
        setField(term170, term170.getClass(), "covarianceMatrixInverse", null);
        setDoubleField(term170, term170.getClass(), "covarianceMatrixDeterminant", 0.03699061125289671);
        setField(term170, term170.getClass(), "samplingMatrix", null);
        setField(term170, term170.getClass(), "random", null);
        setIntField(term170, term170.getClass(), "dimension", -616727354);
        term176 = (double[]) newDoubleArray(1);
        setDoubleElement(term176, 0, 0.6047137830113202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term176;
        try {
            callMethod(klass, "getExponentTerm", argTypes, term170, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


