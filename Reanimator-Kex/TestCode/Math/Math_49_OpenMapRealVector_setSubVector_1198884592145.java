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
import org.apache.commons.math.exception.OutOfRangeException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class OpenMapRealVector_setSubVector_1198884592145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9290;
     Object term9397;
     Object term9399;

    public OpenMapRealVector_setSubVector_1198884592145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9290 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term9291 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term9292 = (int[]) newIntArray(32);
        double[] term9325 = (double[]) newDoubleArray(32);
        byte[] term9358 = (byte[]) newByteArray(32);
        setField(term9291, term9291.getClass(), "keys", term9292);
        setField(term9291, term9291.getClass(), "values", term9325);
        setField(term9291, term9291.getClass(), "states", term9358);
        setDoubleField(term9291, term9291.getClass(), "missingEntries", 0.0);
        setIntField(term9291, term9291.getClass(), "size", 0);
        setIntField(term9291, term9291.getClass(), "mask", 31);
        setIntField(term9291, term9291.getClass(), "count", 0);
        setField(term9290, term9290.getClass(), "entries", term9291);
        setIntField(term9290, term9290.getClass(), "virtualSize", -184153539);
        setDoubleField(term9290, term9290.getClass(), "epsilon", 1.0E-12);
        term9397 = new Integer(493620644);
        term9399 = (double[]) newDoubleArray(5);
        setDoubleElement(term9399, 0, 0.9374115574082594);
        setDoubleElement(term9399, 1, 0.8454723071922143);
        setDoubleElement(term9399, 2, 0.8566567697571895);
        setDoubleElement(term9399, 3, 0.9203805380592256);
        setDoubleElement(term9399, 4, 0.5804948995371725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term9397;
        args[1] = term9399;
        try {
            callMethod(klass, "setSubVector", argTypes, term9290, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


