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
import java.lang.Object;

public class OpenMapRealVector_subtract_22783526054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10523;
     Object term10630;

    public OpenMapRealVector_subtract_22783526054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10523 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term10524 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term10525 = (int[]) newIntArray(32);
        double[] term10558 = (double[]) newDoubleArray(32);
        byte[] term10591 = (byte[]) newByteArray(32);
        setField(term10524, term10524.getClass(), "keys", term10525);
        setField(term10524, term10524.getClass(), "values", term10558);
        setField(term10524, term10524.getClass(), "states", term10591);
        setDoubleField(term10524, term10524.getClass(), "missingEntries", 0.0);
        setIntField(term10524, term10524.getClass(), "size", 0);
        setIntField(term10524, term10524.getClass(), "mask", 31);
        setIntField(term10524, term10524.getClass(), "count", 0);
        setField(term10523, term10523.getClass(), "entries", term10524);
        setIntField(term10523, term10523.getClass(), "virtualSize", 1225272962);
        setDoubleField(term10523, term10523.getClass(), "epsilon", 1.0E-12);
        term10630 = (double[]) newDoubleArray(2);
        setDoubleElement(term10630, 0, 0.7919370314903882);
        setDoubleElement(term10630, 1, 0.2109867221632754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10630;
        callMethod(klass, "subtract", argTypes, term10523, args);
    }

};


