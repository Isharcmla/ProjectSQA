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

public class OpenMapRealVector_setSubVector_354000800153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9288;
     Object term9395;

    public OpenMapRealVector_setSubVector_354000800153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9288 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term9289 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term9290 = (int[]) newIntArray(32);
        double[] term9323 = (double[]) newDoubleArray(32);
        byte[] term9356 = (byte[]) newByteArray(32);
        setField(term9289, term9289.getClass(), "keys", term9290);
        setField(term9289, term9289.getClass(), "values", term9323);
        setField(term9289, term9289.getClass(), "states", term9356);
        setDoubleField(term9289, term9289.getClass(), "missingEntries", 0.0);
        setIntField(term9289, term9289.getClass(), "size", 0);
        setIntField(term9289, term9289.getClass(), "mask", 31);
        setIntField(term9289, term9289.getClass(), "count", 0);
        setField(term9288, term9288.getClass(), "entries", term9289);
        setIntField(term9288, term9288.getClass(), "virtualSize", 458147407);
        setDoubleField(term9288, term9288.getClass(), "epsilon", 1.0E-12);
        term9395 = new Integer(-184153539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.apache.commons.math.linear.RealVector");
        Object[] args = new Object[2];
        args[0] = term9395;
        args[1] = null;
        try {
            callMethod(klass, "setSubVector", argTypes, term9288, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


