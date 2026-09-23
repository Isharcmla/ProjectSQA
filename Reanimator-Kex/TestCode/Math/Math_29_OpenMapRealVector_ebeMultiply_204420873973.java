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

public class OpenMapRealVector_ebeMultiply_204420873973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3311;

    public OpenMapRealVector_ebeMultiply_204420873973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3311 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term3312 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term3313 = (int[]) newIntArray(32);
        double[] term3346 = (double[]) newDoubleArray(32);
        byte[] term3379 = (byte[]) newByteArray(32);
        setField(term3312, term3312.getClass(), "keys", term3313);
        setField(term3312, term3312.getClass(), "values", term3346);
        setField(term3312, term3312.getClass(), "states", term3379);
        setDoubleField(term3312, term3312.getClass(), "missingEntries", 0.0);
        setIntField(term3312, term3312.getClass(), "size", 0);
        setIntField(term3312, term3312.getClass(), "mask", 31);
        setIntField(term3312, term3312.getClass(), "count", 0);
        setField(term3311, term3311.getClass(), "entries", term3312);
        setIntField(term3311, term3311.getClass(), "virtualSize", -117576464);
        setDoubleField(term3311, term3311.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "ebeMultiply", argTypes, term3311, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


