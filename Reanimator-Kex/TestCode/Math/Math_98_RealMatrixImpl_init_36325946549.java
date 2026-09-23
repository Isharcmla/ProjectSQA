package org.apache.commons.math.linear;

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
import java.lang.IllegalArgumentException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RealMatrixImpl_init_36325946549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;

    public RealMatrixImpl_init_36325946549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = (Object[]) newArray("[D", 5);
        double[] term6 = (double[]) newDoubleArray(4);
        double[] term11 = (double[]) newDoubleArray(3);
        double[] term15 = (double[]) newDoubleArray(4);
        double[] term20 = (double[]) newDoubleArray(1);
        double[] term22 = (double[]) newDoubleArray(6);
        setDoubleElement(term6, 0, 0.13238746331190498);
        setDoubleElement(term6, 1, 0.3455959125047594);
        setDoubleElement(term6, 2, 0.5523635872663106);
        setDoubleElement(term6, 3, 0.544608645520025);
        setElement(term5, 0, term6);
        setDoubleElement(term11, 0, 0.28570734989730284);
        setDoubleElement(term11, 1, 0.40176586625454525);
        setDoubleElement(term11, 2, 0.2641345529914265);
        setElement(term5, 1, term11);
        setDoubleElement(term15, 0, 0.36923381893433327);
        setDoubleElement(term15, 1, 0.6076495596892013);
        setDoubleElement(term15, 2, 0.37773193782763337);
        setDoubleElement(term15, 3, 0.8474802076607362);
        setElement(term5, 2, term15);
        setDoubleElement(term20, 0, 0.5183269973490326);
        setElement(term5, 3, term20);
        setDoubleElement(term22, 0, 0.7655020693602768);
        setDoubleElement(term22, 1, 0.1374549299694151);
        setDoubleElement(term22, 2, 0.7031006357544823);
        setDoubleElement(term22, 3, 0.9527281779865117);
        setDoubleElement(term22, 4, 0.9828442029246764);
        setDoubleElement(term22, 5, 0.2779719046761513);
        setElement(term5, 4, term22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


