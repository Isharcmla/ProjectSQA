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

public class OpenMapRealVector_append_86603579367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1888;

    public OpenMapRealVector_append_86603579367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1888 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term1889 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term1890 = (int[]) newIntArray(32);
        double[] term1923 = (double[]) newDoubleArray(32);
        byte[] term1956 = (byte[]) newByteArray(32);
        setField(term1889, term1889.getClass(), "keys", term1890);
        setField(term1889, term1889.getClass(), "values", term1923);
        setField(term1889, term1889.getClass(), "states", term1956);
        setDoubleField(term1889, term1889.getClass(), "missingEntries", 0.0);
        setIntField(term1889, term1889.getClass(), "size", 0);
        setIntField(term1889, term1889.getClass(), "mask", 31);
        setIntField(term1889, term1889.getClass(), "count", 0);
        setField(term1888, term1888.getClass(), "entries", term1889);
        setIntField(term1888, term1888.getClass(), "virtualSize", -1685132342);
        setDoubleField(term1888, term1888.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "append", argTypes, term1888, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


