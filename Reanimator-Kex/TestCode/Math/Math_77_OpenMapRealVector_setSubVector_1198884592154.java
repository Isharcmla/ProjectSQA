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
import org.apache.commons.math.linear.MatrixIndexException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class OpenMapRealVector_setSubVector_1198884592154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9493;
     Object term9600;
     Object term9602;

    public OpenMapRealVector_setSubVector_1198884592154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9493 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term9494 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term9495 = (int[]) newIntArray(32);
        double[] term9528 = (double[]) newDoubleArray(32);
        byte[] term9561 = (byte[]) newByteArray(32);
        setField(term9494, term9494.getClass(), "keys", term9495);
        setField(term9494, term9494.getClass(), "values", term9528);
        setField(term9494, term9494.getClass(), "states", term9561);
        setDoubleField(term9494, term9494.getClass(), "missingEntries", 0.0);
        setIntField(term9494, term9494.getClass(), "size", 0);
        setIntField(term9494, term9494.getClass(), "mask", 31);
        setIntField(term9494, term9494.getClass(), "count", 0);
        setField(term9493, term9493.getClass(), "entries", term9494);
        setIntField(term9493, term9493.getClass(), "virtualSize", 493620644);
        setDoubleField(term9493, term9493.getClass(), "epsilon", 1.0E-12);
        term9600 = new Integer(1328271830);
        term9602 = (double[]) newDoubleArray(5);
        setDoubleElement(term9602, 0, 0.9374115574082594);
        setDoubleElement(term9602, 1, 0.8454723071922143);
        setDoubleElement(term9602, 2, 0.8566567697571895);
        setDoubleElement(term9602, 3, 0.9203805380592256);
        setDoubleElement(term9602, 4, 0.5804948995371725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term9600;
        args[1] = term9602;
        try {
            callMethod(klass, "setSubVector", argTypes, term9493, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


