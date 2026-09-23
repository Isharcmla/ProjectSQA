package org.apache.commons.math.geometry.euclidean.threed;

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
import org.apache.commons.math.geometry.euclidean.threed.NotARotationMatrixException;
import static org.apache.commons.math.geometry.euclidean.threed.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class Rotation_init_171508521823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17;
     Object term41;

    public Rotation_init_171508521823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17 = (Object[]) newArray("[D", 5);
        double[] term18 = (double[]) newDoubleArray(4);
        double[] term23 = (double[]) newDoubleArray(3);
        double[] term27 = (double[]) newDoubleArray(4);
        double[] term32 = (double[]) newDoubleArray(1);
        double[] term34 = (double[]) newDoubleArray(6);
        setDoubleElement(term18, 0, 0.6076495596892013);
        setDoubleElement(term18, 1, 0.37773193782763337);
        setDoubleElement(term18, 2, 0.8474802076607362);
        setDoubleElement(term18, 3, 0.5183269973490326);
        setElement(term17, 0, term18);
        setDoubleElement(term23, 0, 0.7655020693602768);
        setDoubleElement(term23, 1, 0.1374549299694151);
        setDoubleElement(term23, 2, 0.7031006357544823);
        setElement(term17, 1, term23);
        setDoubleElement(term27, 0, 0.9527281779865117);
        setDoubleElement(term27, 1, 0.9828442029246764);
        setDoubleElement(term27, 2, 0.2779719046761513);
        setDoubleElement(term27, 3, 0.6436713023569729);
        setElement(term17, 2, term27);
        setDoubleElement(term32, 0, 0.7332741045694002);
        setElement(term17, 3, term32);
        setDoubleElement(term34, 0, 0.4569171842750229);
        setDoubleElement(term34, 1, 0.8598297828918529);
        setDoubleElement(term34, 2, 0.43692187681405226);
        setDoubleElement(term34, 3, 0.7633268466829064);
        setDoubleElement(term34, 4, 0.13481025392611334);
        setDoubleElement(term34, 5, 0.3800088629986428);
        setElement(term17, 4, term34);
        term41 = new Double(0.5840714198152577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term17;
        args[1] = term41;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NotARotationMatrixException e) {
        }

    }

};


