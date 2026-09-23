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

public class OpenMapRealVector_equals_111460338658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11340;
     Object term11447;

    public OpenMapRealVector_equals_111460338658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11340 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term11341 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term11342 = (int[]) newIntArray(32);
        double[] term11375 = (double[]) newDoubleArray(32);
        byte[] term11408 = (byte[]) newByteArray(32);
        setField(term11341, term11341.getClass(), "keys", term11342);
        setField(term11341, term11341.getClass(), "values", term11375);
        setField(term11341, term11341.getClass(), "states", term11408);
        setDoubleField(term11341, term11341.getClass(), "missingEntries", 0.0);
        setIntField(term11341, term11341.getClass(), "size", 0);
        setIntField(term11341, term11341.getClass(), "mask", 31);
        setIntField(term11341, term11341.getClass(), "count", 0);
        setField(term11340, term11340.getClass(), "entries", term11341);
        setIntField(term11340, term11340.getClass(), "virtualSize", -112921587);
        setDoubleField(term11340, term11340.getClass(), "epsilon", 1.0E-12);
        term11447 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term11447;
        callMethod(klass, "equals", argTypes, term11340, args);
    }

};


