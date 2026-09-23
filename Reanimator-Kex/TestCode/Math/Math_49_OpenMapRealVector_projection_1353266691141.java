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

public class OpenMapRealVector_projection_1353266691141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8461;

    public OpenMapRealVector_projection_1353266691141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8461 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term8462 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term8463 = (int[]) newIntArray(32);
        double[] term8496 = (double[]) newDoubleArray(32);
        byte[] term8529 = (byte[]) newByteArray(32);
        setField(term8462, term8462.getClass(), "keys", term8463);
        setField(term8462, term8462.getClass(), "values", term8496);
        setField(term8462, term8462.getClass(), "states", term8529);
        setDoubleField(term8462, term8462.getClass(), "missingEntries", 0.0);
        setIntField(term8462, term8462.getClass(), "size", 0);
        setIntField(term8462, term8462.getClass(), "mask", 31);
        setIntField(term8462, term8462.getClass(), "count", 0);
        setField(term8461, term8461.getClass(), "entries", term8462);
        setIntField(term8461, term8461.getClass(), "virtualSize", 454281060);
        setDoubleField(term8461, term8461.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "projection", argTypes, term8461, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


