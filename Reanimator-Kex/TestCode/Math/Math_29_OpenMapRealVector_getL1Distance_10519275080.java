package org.apache.commons.math3.linear;

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
import static org.apache.commons.math3.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OpenMapRealVector_getL1Distance_10519275080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5144;

    public OpenMapRealVector_getL1Distance_10519275080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5144 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term5145 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term5146 = (int[]) newIntArray(32);
        double[] term5179 = (double[]) newDoubleArray(32);
        byte[] term5212 = (byte[]) newByteArray(32);
        setField(term5145, term5145.getClass(), "keys", term5146);
        setField(term5145, term5145.getClass(), "values", term5179);
        setField(term5145, term5145.getClass(), "states", term5212);
        setDoubleField(term5145, term5145.getClass(), "missingEntries", 0.0);
        setIntField(term5145, term5145.getClass(), "size", 0);
        setIntField(term5145, term5145.getClass(), "mask", 31);
        setIntField(term5145, term5145.getClass(), "count", 0);
        setField(term5144, term5144.getClass(), "entries", term5145);
        setIntField(term5144, term5144.getClass(), "virtualSize", -1087774327);
        setDoubleField(term5144, term5144.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getL1Distance", argTypes, term5144, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


