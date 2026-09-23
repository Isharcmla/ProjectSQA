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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.linear.EqualityUtils.*;
import java.lang.Object;

public class OpenMapRealVector_copy_78613726881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2502;
     Object term28976;
     Object term28449;

    public OpenMapRealVector_copy_78613726881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2502 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term2503 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term2504 = (int[]) newIntArray(32);
        double[] term2537 = (double[]) newDoubleArray(32);
        byte[] term2570 = (byte[]) newByteArray(32);
        setField(term2503, term2503.getClass(), "keys", term2504);
        setField(term2503, term2503.getClass(), "values", term2537);
        setField(term2503, term2503.getClass(), "states", term2570);
        setDoubleField(term2503, term2503.getClass(), "missingEntries", 0.0);
        setIntField(term2503, term2503.getClass(), "size", 0);
        setIntField(term2503, term2503.getClass(), "mask", 31);
        setIntField(term2503, term2503.getClass(), "count", 0);
        setField(term2502, term2502.getClass(), "entries", term2503);
        setIntField(term2502, term2502.getClass(), "virtualSize", 1048535127);
        setDoubleField(term2502, term2502.getClass(), "epsilon", 1.0E-12);
        term28976 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term28977 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term28978 = (int[]) newIntArray(32);
        double[] term28979 = (double[]) newDoubleArray(32);
        byte[] term28980 = (byte[]) newByteArray(32);
        setField(term28977, term28977.getClass(), "keys", term28978);
        setField(term28977, term28977.getClass(), "values", term28979);
        setField(term28977, term28977.getClass(), "states", term28980);
        setDoubleField(term28977, term28977.getClass(), "missingEntries", 0.0);
        setIntField(term28977, term28977.getClass(), "size", 0);
        setIntField(term28977, term28977.getClass(), "mask", 31);
        setIntField(term28977, term28977.getClass(), "count", 0);
        setField(term28976, term28976.getClass(), "entries", term28977);
        setIntField(term28976, term28976.getClass(), "virtualSize", 1048535127);
        setDoubleField(term28976, term28976.getClass(), "epsilon", 1.0E-12);
        term28449 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term28450 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term28451 = (int[]) newIntArray(32);
        double[] term28484 = (double[]) newDoubleArray(32);
        byte[] term28517 = (byte[]) newByteArray(32);
        setField(term28450, term28450.getClass(), "keys", term28451);
        setField(term28450, term28450.getClass(), "values", term28484);
        setField(term28450, term28450.getClass(), "states", term28517);
        setDoubleField(term28450, term28450.getClass(), "missingEntries", 0.0);
        setIntField(term28450, term28450.getClass(), "size", 0);
        setIntField(term28450, term28450.getClass(), "mask", 31);
        setIntField(term28450, term28450.getClass(), "count", 0);
        setField(term28449, term28449.getClass(), "entries", term28450);
        setIntField(term28449, term28449.getClass(), "virtualSize", 1048535127);
        setDoubleField(term28449, term28449.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "copy", argTypes, term2502, args);
        assertTrue(recursiveEquals(term2502, term28976));
        assertTrue(recursiveEquals(retValue, term28449));
    }

};


