package org.apache.commons.math.stat.inference;

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
import static org.apache.commons.math.stat.inference.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.stat.inference.EqualityUtils.*;
import java.lang.Object;

public class ChiSquareTestImpl_isPositive_27167295332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322;
     Object term327;
     Object term3667;
     Object term3670;

    public ChiSquareTestImpl_isPositive_27167295332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term322 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term323 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term324 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setDoubleField(term324, term324.getClass(), "alpha", 0.5);
        setDoubleField(term324, term324.getClass(), "beta", 2.0);
        setField(term323, term323.getClass(), "gamma", term324);
        setField(term322, term322.getClass(), "distribution", term323);
        term327 = (double[]) newDoubleArray(6);
        setDoubleElement(term327, 0, 0.7655020693602768);
        setDoubleElement(term327, 1, 0.1374549299694151);
        setDoubleElement(term327, 2, 0.7031006357544823);
        setDoubleElement(term327, 3, 0.9527281779865117);
        setDoubleElement(term327, 4, 0.9828442029246764);
        setDoubleElement(term327, 5, 0.2779719046761513);
        term3667 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term3668 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term3669 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setDoubleField(term3669, term3669.getClass(), "alpha", 0.5);
        setDoubleField(term3669, term3669.getClass(), "beta", 2.0);
        setField(term3668, term3668.getClass(), "gamma", term3669);
        setField(term3667, term3667.getClass(), "distribution", term3668);
        term3670 = (double[]) newDoubleArray(6);
        setDoubleElement(term3670, 0, 0.7655020693602768);
        setDoubleElement(term3670, 1, 0.1374549299694151);
        setDoubleElement(term3670, 2, 0.7031006357544823);
        setDoubleElement(term3670, 3, 0.9527281779865117);
        setDoubleElement(term3670, 4, 0.9828442029246764);
        setDoubleElement(term3670, 5, 0.2779719046761513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term327;
        Object retValue = callMethod(klass, "isPositive", argTypes, term322, args);
        assertTrue(recursiveEquals(term322, term3667));
        assertTrue(recursiveEquals(term327, term3670));
        assertTrue(recursiveEquals(retValue, true));
    }

};


