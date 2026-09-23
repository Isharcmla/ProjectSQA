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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.linear.EqualityUtils.*;

public class ArrayRealVector_init_346932405119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92;
     Object term99;
     Object term4066;
     Object term4068;
     Object term4069;

    public ArrayRealVector_init_346932405119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92 = (double[]) newDoubleArray(6);
        setDoubleElement(term92, 0, 0.8598297828918529);
        setDoubleElement(term92, 1, 0.43692187681405226);
        setDoubleElement(term92, 2, 0.7633268466829064);
        setDoubleElement(term92, 3, 0.13481025392611334);
        setDoubleElement(term92, 4, 0.3800088629986428);
        setDoubleElement(term92, 5, 0.5840714198152577);
        term99 = (double[]) newDoubleArray(7);
        setDoubleElement(term99, 0, 0.7559240768573477);
        setDoubleElement(term99, 1, 0.10667076642995188);
        setDoubleElement(term99, 2, 0.11493000848982304);
        setDoubleElement(term99, 3, 0.37161417339133307);
        setDoubleElement(term99, 4, 0.6805867182029153);
        setDoubleElement(term99, 5, 0.2852810965221698);
        setDoubleElement(term99, 6, 0.6300849762307866);
        term4066 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term4067 = (double[]) newDoubleArray(13);
        setDoubleElement(term4067, 0, 0.8598297828918529);
        setDoubleElement(term4067, 1, 0.43692187681405226);
        setDoubleElement(term4067, 2, 0.7633268466829064);
        setDoubleElement(term4067, 3, 0.13481025392611334);
        setDoubleElement(term4067, 4, 0.3800088629986428);
        setDoubleElement(term4067, 5, 0.5840714198152577);
        setDoubleElement(term4067, 6, 0.7559240768573477);
        setDoubleElement(term4067, 7, 0.10667076642995188);
        setDoubleElement(term4067, 8, 0.11493000848982304);
        setDoubleElement(term4067, 9, 0.37161417339133307);
        setDoubleElement(term4067, 10, 0.6805867182029153);
        setDoubleElement(term4067, 11, 0.2852810965221698);
        setDoubleElement(term4067, 12, 0.6300849762307866);
        setField(term4066, term4066.getClass(), "data", term4067);
        term4068 = (double[]) newDoubleArray(6);
        setDoubleElement(term4068, 0, 0.8598297828918529);
        setDoubleElement(term4068, 1, 0.43692187681405226);
        setDoubleElement(term4068, 2, 0.7633268466829064);
        setDoubleElement(term4068, 3, 0.13481025392611334);
        setDoubleElement(term4068, 4, 0.3800088629986428);
        setDoubleElement(term4068, 5, 0.5840714198152577);
        term4069 = (double[]) newDoubleArray(7);
        setDoubleElement(term4069, 0, 0.7559240768573477);
        setDoubleElement(term4069, 1, 0.10667076642995188);
        setDoubleElement(term4069, 2, 0.11493000848982304);
        setDoubleElement(term4069, 3, 0.37161417339133307);
        setDoubleElement(term4069, 4, 0.6805867182029153);
        setDoubleElement(term4069, 5, 0.2852810965221698);
        setDoubleElement(term4069, 6, 0.6300849762307866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term92;
        args[1] = term99;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4066));
        assertTrue(recursiveEquals(term92, term4068));
        assertTrue(recursiveEquals(term99, term4069));
    }

};


