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
import static org.apache.commons.math3.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.linear.EqualityUtils.*;
import java.lang.Object;

public class OpenMapRealVector_copy_35147070069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2296;
     Object term25848;
     Object term25321;

    public OpenMapRealVector_copy_35147070069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2296 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term2297 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term2298 = (int[]) newIntArray(32);
        double[] term2331 = (double[]) newDoubleArray(32);
        byte[] term2364 = (byte[]) newByteArray(32);
        setField(term2297, term2297.getClass(), "keys", term2298);
        setField(term2297, term2297.getClass(), "values", term2331);
        setField(term2297, term2297.getClass(), "states", term2364);
        setDoubleField(term2297, term2297.getClass(), "missingEntries", 0.0);
        setIntField(term2297, term2297.getClass(), "size", 0);
        setIntField(term2297, term2297.getClass(), "mask", 31);
        setIntField(term2297, term2297.getClass(), "count", 0);
        setField(term2296, term2296.getClass(), "entries", term2297);
        setIntField(term2296, term2296.getClass(), "virtualSize", 1622346318);
        setDoubleField(term2296, term2296.getClass(), "epsilon", 1.0E-12);
        term25848 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term25849 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term25850 = (int[]) newIntArray(32);
        double[] term25851 = (double[]) newDoubleArray(32);
        byte[] term25852 = (byte[]) newByteArray(32);
        setField(term25849, term25849.getClass(), "keys", term25850);
        setField(term25849, term25849.getClass(), "values", term25851);
        setField(term25849, term25849.getClass(), "states", term25852);
        setDoubleField(term25849, term25849.getClass(), "missingEntries", 0.0);
        setIntField(term25849, term25849.getClass(), "size", 0);
        setIntField(term25849, term25849.getClass(), "mask", 31);
        setIntField(term25849, term25849.getClass(), "count", 0);
        setField(term25848, term25848.getClass(), "entries", term25849);
        setIntField(term25848, term25848.getClass(), "virtualSize", 1622346318);
        setDoubleField(term25848, term25848.getClass(), "epsilon", 1.0E-12);
        term25321 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term25322 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term25323 = (int[]) newIntArray(32);
        double[] term25356 = (double[]) newDoubleArray(32);
        byte[] term25389 = (byte[]) newByteArray(32);
        setField(term25322, term25322.getClass(), "keys", term25323);
        setField(term25322, term25322.getClass(), "values", term25356);
        setField(term25322, term25322.getClass(), "states", term25389);
        setDoubleField(term25322, term25322.getClass(), "missingEntries", 0.0);
        setIntField(term25322, term25322.getClass(), "size", 0);
        setIntField(term25322, term25322.getClass(), "mask", 31);
        setIntField(term25322, term25322.getClass(), "count", 0);
        setField(term25321, term25321.getClass(), "entries", term25322);
        setIntField(term25321, term25321.getClass(), "virtualSize", 1622346318);
        setDoubleField(term25321, term25321.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "copy", argTypes, term2296, args);
        assertTrue(recursiveEquals(term2296, term25848));
        assertTrue(recursiveEquals(retValue, term25321));
    }

};


