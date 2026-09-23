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
import java.lang.Object;

public class OpenMapRealVector_subtract_160946387052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9914;
     Object term10021;

    public OpenMapRealVector_subtract_160946387052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9914 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term9915 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term9916 = (int[]) newIntArray(32);
        double[] term9949 = (double[]) newDoubleArray(32);
        byte[] term9982 = (byte[]) newByteArray(32);
        setField(term9915, term9915.getClass(), "keys", term9916);
        setField(term9915, term9915.getClass(), "values", term9949);
        setField(term9915, term9915.getClass(), "states", term9982);
        setDoubleField(term9915, term9915.getClass(), "missingEntries", 0.0);
        setIntField(term9915, term9915.getClass(), "size", 0);
        setIntField(term9915, term9915.getClass(), "mask", 31);
        setIntField(term9915, term9915.getClass(), "count", 0);
        setField(term9914, term9914.getClass(), "entries", term9915);
        setIntField(term9914, term9914.getClass(), "virtualSize", 97029295);
        setDoubleField(term9914, term9914.getClass(), "epsilon", 1.0E-12);
        term10021 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term10022 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term10023 = (int[]) newIntArray(32);
        double[] term10056 = (double[]) newDoubleArray(32);
        byte[] term10089 = (byte[]) newByteArray(32);
        setField(term10022, term10022.getClass(), "keys", term10023);
        setField(term10022, term10022.getClass(), "values", term10056);
        setField(term10022, term10022.getClass(), "states", term10089);
        setDoubleField(term10022, term10022.getClass(), "missingEntries", 0.0);
        setIntField(term10022, term10022.getClass(), "size", 0);
        setIntField(term10022, term10022.getClass(), "mask", 31);
        setIntField(term10022, term10022.getClass(), "count", 0);
        setField(term10021, term10021.getClass(), "entries", term10022);
        setIntField(term10021, term10021.getClass(), "virtualSize", -1371869594);
        setDoubleField(term10021, term10021.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term10021;
        callMethod(klass, "subtract", argTypes, term9914, args);
    }

};


