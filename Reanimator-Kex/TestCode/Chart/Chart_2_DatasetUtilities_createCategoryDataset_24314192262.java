package org.jfree.data.general;

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
import static org.jfree.data.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DatasetUtilities_createCategoryDataset_24314192262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144;
     Object term145;
     Object term146;

    public DatasetUtilities_createCategoryDataset_24314192262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144 = (Object[]) newArray("java.lang.Comparable", 1);
        term145 = (Object[]) newArray("java.lang.Comparable", 6);
        term146 = (Object[]) newArray("[D", 5);
        double[] term147 = (double[]) newDoubleArray(5);
        double[] term153 = (double[]) newDoubleArray(2);
        double[] term156 = (double[]) newDoubleArray(3);
        double[] term160 = (double[]) newDoubleArray(1);
        double[] term162 = (double[]) newDoubleArray(0);
        setDoubleElement(term147, 0, 0.4569171842750229);
        setDoubleElement(term147, 1, 0.8598297828918529);
        setDoubleElement(term147, 2, 0.43692187681405226);
        setDoubleElement(term147, 3, 0.7633268466829064);
        setDoubleElement(term147, 4, 0.13481025392611334);
        setElement(term146, 0, term147);
        setDoubleElement(term153, 0, 0.3800088629986428);
        setDoubleElement(term153, 1, 0.5840714198152577);
        setElement(term146, 1, term153);
        setDoubleElement(term156, 0, 0.7559240768573477);
        setDoubleElement(term156, 1, 0.10667076642995188);
        setDoubleElement(term156, 2, 0.11493000848982304);
        setElement(term146, 2, term156);
        setDoubleElement(term160, 0, 0.37161417339133307);
        setElement(term146, 3, term160);
        setElement(term146, 4, term162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Comparable"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Comparable"), 0).getClass();
        argTypes[2] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term144;
        args[1] = term145;
        args[2] = term146;
        try {
            callMethod(klass, "createCategoryDataset", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


