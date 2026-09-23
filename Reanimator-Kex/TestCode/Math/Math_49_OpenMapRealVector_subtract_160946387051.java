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

public class OpenMapRealVector_subtract_160946387051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9711;
     Object term9818;

    public OpenMapRealVector_subtract_160946387051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9711 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term9712 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term9713 = (int[]) newIntArray(32);
        double[] term9746 = (double[]) newDoubleArray(32);
        byte[] term9779 = (byte[]) newByteArray(32);
        setField(term9712, term9712.getClass(), "keys", term9713);
        setField(term9712, term9712.getClass(), "values", term9746);
        setField(term9712, term9712.getClass(), "states", term9779);
        setDoubleField(term9712, term9712.getClass(), "missingEntries", 0.0);
        setIntField(term9712, term9712.getClass(), "size", 0);
        setIntField(term9712, term9712.getClass(), "mask", 31);
        setIntField(term9712, term9712.getClass(), "count", 0);
        setField(term9711, term9711.getClass(), "entries", term9712);
        setIntField(term9711, term9711.getClass(), "virtualSize", 1596070772);
        setDoubleField(term9711, term9711.getClass(), "epsilon", 1.0E-12);
        term9818 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term9819 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term9820 = (int[]) newIntArray(32);
        double[] term9853 = (double[]) newDoubleArray(32);
        byte[] term9886 = (byte[]) newByteArray(32);
        setField(term9819, term9819.getClass(), "keys", term9820);
        setField(term9819, term9819.getClass(), "values", term9853);
        setField(term9819, term9819.getClass(), "states", term9886);
        setDoubleField(term9819, term9819.getClass(), "missingEntries", 0.0);
        setIntField(term9819, term9819.getClass(), "size", 0);
        setIntField(term9819, term9819.getClass(), "mask", 31);
        setIntField(term9819, term9819.getClass(), "count", 0);
        setField(term9818, term9818.getClass(), "entries", term9819);
        setIntField(term9818, term9818.getClass(), "virtualSize", 97029295);
        setDoubleField(term9818, term9818.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term9818;
        callMethod(klass, "subtract", argTypes, term9711, args);
    }

};


