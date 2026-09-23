package org.jfree.data.category;

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
import static org.jfree.data.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DefaultIntervalCategoryDataset_init_52373840132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term25;

    public DefaultIntervalCategoryDataset_init_52373840132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = (Object[]) newArray("[D", 5);
        double[] term2 = (double[]) newDoubleArray(4);
        double[] term7 = (double[]) newDoubleArray(3);
        double[] term11 = (double[]) newDoubleArray(4);
        double[] term16 = (double[]) newDoubleArray(1);
        double[] term18 = (double[]) newDoubleArray(6);
        setDoubleElement(term2, 0, 0.13238746331190498);
        setDoubleElement(term2, 1, 0.3455959125047594);
        setDoubleElement(term2, 2, 0.5523635872663106);
        setDoubleElement(term2, 3, 0.544608645520025);
        setElement(term1, 0, term2);
        setDoubleElement(term7, 0, 0.28570734989730284);
        setDoubleElement(term7, 1, 0.40176586625454525);
        setDoubleElement(term7, 2, 0.2641345529914265);
        setElement(term1, 1, term7);
        setDoubleElement(term11, 0, 0.36923381893433327);
        setDoubleElement(term11, 1, 0.6076495596892013);
        setDoubleElement(term11, 2, 0.37773193782763337);
        setDoubleElement(term11, 3, 0.8474802076607362);
        setElement(term1, 2, term11);
        setDoubleElement(term16, 0, 0.5183269973490326);
        setElement(term1, 3, term16);
        setDoubleElement(term18, 0, 0.7655020693602768);
        setDoubleElement(term18, 1, 0.1374549299694151);
        setDoubleElement(term18, 2, 0.7031006357544823);
        setDoubleElement(term18, 3, 0.9527281779865117);
        setDoubleElement(term18, 4, 0.9828442029246764);
        setDoubleElement(term18, 5, 0.2779719046761513);
        setElement(term1, 4, term18);
        term25 = (Object[]) newArray("[D", 2);
        double[] term26 = (double[]) newDoubleArray(6);
        double[] term33 = (double[]) newDoubleArray(7);
        setDoubleElement(term26, 0, 0.6436713023569729);
        setDoubleElement(term26, 1, 0.7332741045694002);
        setDoubleElement(term26, 2, 0.4569171842750229);
        setDoubleElement(term26, 3, 0.8598297828918529);
        setDoubleElement(term26, 4, 0.43692187681405226);
        setDoubleElement(term26, 5, 0.7633268466829064);
        setElement(term25, 0, term26);
        setDoubleElement(term33, 0, 0.13481025392611334);
        setDoubleElement(term33, 1, 0.3800088629986428);
        setDoubleElement(term33, 2, 0.5840714198152577);
        setDoubleElement(term33, 3, 0.7559240768573477);
        setDoubleElement(term33, 4, 0.10667076642995188);
        setDoubleElement(term33, 5, 0.11493000848982304);
        setDoubleElement(term33, 6, 0.37161417339133307);
        setElement(term25, 1, term33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        argTypes[1] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term25;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


