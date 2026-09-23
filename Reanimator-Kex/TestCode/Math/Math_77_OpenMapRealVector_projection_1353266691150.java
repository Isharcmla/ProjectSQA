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
import java.lang.NullPointerException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OpenMapRealVector_projection_1353266691150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8664;

    public OpenMapRealVector_projection_1353266691150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8664 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term8665 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term8666 = (int[]) newIntArray(32);
        double[] term8699 = (double[]) newDoubleArray(32);
        byte[] term8732 = (byte[]) newByteArray(32);
        setField(term8665, term8665.getClass(), "keys", term8666);
        setField(term8665, term8665.getClass(), "values", term8699);
        setField(term8665, term8665.getClass(), "states", term8732);
        setDoubleField(term8665, term8665.getClass(), "missingEntries", 0.0);
        setIntField(term8665, term8665.getClass(), "size", 0);
        setIntField(term8665, term8665.getClass(), "mask", 31);
        setIntField(term8665, term8665.getClass(), "count", 0);
        setField(term8664, term8664.getClass(), "entries", term8665);
        setIntField(term8664, term8664.getClass(), "virtualSize", -1786399638);
        setDoubleField(term8664, term8664.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "projection", argTypes, term8664, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


