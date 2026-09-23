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
import java.lang.Object;

public class MultivariateNormalDistribution_init_17304230470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term7;

    public MultivariateNormalDistribution_init_17304230470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = (double[]) newDoubleArray(5);
        setDoubleElement(term1, 0, 0.13238746331190498);
        setDoubleElement(term1, 1, 0.3455959125047594);
        setDoubleElement(term1, 2, 0.5523635872663106);
        setDoubleElement(term1, 3, 0.544608645520025);
        setDoubleElement(term1, 4, 0.28570734989730284);
        term7 = (Object[]) newArray("[D", 4);
        double[] term8 = (double[]) newDoubleArray(3);
        double[] term12 = (double[]) newDoubleArray(4);
        double[] term17 = (double[]) newDoubleArray(1);
        double[] term19 = (double[]) newDoubleArray(6);
        setDoubleElement(term8, 0, 0.40176586625454525);
        setDoubleElement(term8, 1, 0.2641345529914265);
        setDoubleElement(term8, 2, 0.36923381893433327);
        setElement(term7, 0, term8);
        setDoubleElement(term12, 0, 0.6076495596892013);
        setDoubleElement(term12, 1, 0.37773193782763337);
        setDoubleElement(term12, 2, 0.8474802076607362);
        setDoubleElement(term12, 3, 0.5183269973490326);
        setElement(term7, 1, term12);
        setDoubleElement(term17, 0, 0.7655020693602768);
        setElement(term7, 2, term17);
        setDoubleElement(term19, 0, 0.1374549299694151);
        setDoubleElement(term19, 1, 0.7031006357544823);
        setDoubleElement(term19, 2, 0.9527281779865117);
        setDoubleElement(term19, 3, 0.9828442029246764);
        setDoubleElement(term19, 4, 0.2779719046761513);
        setDoubleElement(term19, 5, 0.6436713023569729);
        setElement(term7, 3, term19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term7;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


