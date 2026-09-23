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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OpenMapRealVector_getData_50552432390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4351;

    public OpenMapRealVector_getData_50552432390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4351 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term4352 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term4353 = (int[]) newIntArray(32);
        double[] term4386 = (double[]) newDoubleArray(32);
        byte[] term4419 = (byte[]) newByteArray(32);
        setField(term4352, term4352.getClass(), "keys", term4353);
        setField(term4352, term4352.getClass(), "values", term4386);
        setField(term4352, term4352.getClass(), "states", term4419);
        setDoubleField(term4352, term4352.getClass(), "missingEntries", 0.0);
        setIntField(term4352, term4352.getClass(), "size", 0);
        setIntField(term4352, term4352.getClass(), "mask", 31);
        setIntField(term4352, term4352.getClass(), "count", 0);
        setField(term4351, term4351.getClass(), "entries", term4352);
        setIntField(term4351, term4351.getClass(), "virtualSize", -203030934);
        setDoubleField(term4351, term4351.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getData", argTypes, term4351, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


