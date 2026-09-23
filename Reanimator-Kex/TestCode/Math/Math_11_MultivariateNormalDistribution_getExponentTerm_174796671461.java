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

public class MultivariateNormalDistribution_getExponentTerm_174796671461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2696975;
     Object term2673335;

    public MultivariateNormalDistribution_getExponentTerm_174796671461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2696975 = newInstance(Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        double[] term2673418 = (double[]) newDoubleArray(282);
        setField(term2696975, term2696975.getClass(), "means", term2673418);
        term2673335 = (double[]) newDoubleArray(40);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2673335;
        try {
            callMethod(klass, "getExponentTerm", argTypes, term2696975, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


