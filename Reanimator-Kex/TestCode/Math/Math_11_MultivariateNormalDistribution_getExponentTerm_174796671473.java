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

public class MultivariateNormalDistribution_getExponentTerm_174796671473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3525548;
     Object term3410792;

    public MultivariateNormalDistribution_getExponentTerm_174796671473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3525548 = newInstance(Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        double[] term3411009 = (double[]) newDoubleArray(524);
        setField(term3525548, term3525548.getClass(), "means", term3411009);
        term3410792 = (double[]) newDoubleArray(107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3410792;
        try {
            callMethod(klass, "getExponentTerm", argTypes, term3525548, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


