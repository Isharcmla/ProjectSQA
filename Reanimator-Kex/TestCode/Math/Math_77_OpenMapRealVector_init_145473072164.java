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
import java.lang.Integer;
import java.lang.Double;
import java.lang.Object;

public class OpenMapRealVector_init_145473072164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term5;
     Object term13097;

    public OpenMapRealVector_init_145473072164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = new Integer(1162663216);
        term5 = new Double(0.13238746331190498);
        term13097 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term13098 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term13099 = (int[]) newIntArray(32);
        double[] term13100 = (double[]) newDoubleArray(32);
        byte[] term13101 = (byte[]) newByteArray(32);
        setField(term13098, term13098.getClass(), "keys", term13099);
        setField(term13098, term13098.getClass(), "values", term13100);
        setField(term13098, term13098.getClass(), "states", term13101);
        setDoubleField(term13098, term13098.getClass(), "missingEntries", 0.0);
        setIntField(term13098, term13098.getClass(), "size", 0);
        setIntField(term13098, term13098.getClass(), "mask", 31);
        setIntField(term13098, term13098.getClass(), "count", 0);
        setField(term13097, term13097.getClass(), "entries", term13098);
        setIntField(term13097, term13097.getClass(), "virtualSize", 1162663216);
        setDoubleField(term13097, term13097.getClass(), "epsilon", 0.13238746331190498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term3;
        args[1] = term5;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term13097));
        assertTrue(recursiveEquals(term3, 1162663216));
        assertTrue(recursiveEquals(term5, 0.13238746331190498));
    }

};


