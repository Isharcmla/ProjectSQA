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

public class OpenMapRealVector_append_6132433766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1482;
     Object term1589;
     Object term23092;
     Object term23097;
     Object term17456;

    public OpenMapRealVector_append_6132433766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1482 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term1483 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term1484 = (int[]) newIntArray(32);
        double[] term1517 = (double[]) newDoubleArray(32);
        byte[] term1550 = (byte[]) newByteArray(32);
        setField(term1483, term1483.getClass(), "keys", term1484);
        setField(term1483, term1483.getClass(), "values", term1517);
        setField(term1483, term1483.getClass(), "states", term1550);
        setDoubleField(term1483, term1483.getClass(), "missingEntries", 0.0);
        setIntField(term1483, term1483.getClass(), "size", 0);
        setIntField(term1483, term1483.getClass(), "mask", 31);
        setIntField(term1483, term1483.getClass(), "count", 0);
        setField(term1482, term1482.getClass(), "entries", term1483);
        setIntField(term1482, term1482.getClass(), "virtualSize", 1585847225);
        setDoubleField(term1482, term1482.getClass(), "epsilon", 1.0E-12);
        term1589 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term1590 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term1591 = (int[]) newIntArray(32);
        double[] term1624 = (double[]) newDoubleArray(32);
        byte[] term1657 = (byte[]) newByteArray(32);
        setField(term1590, term1590.getClass(), "keys", term1591);
        setField(term1590, term1590.getClass(), "values", term1624);
        setField(term1590, term1590.getClass(), "states", term1657);
        setDoubleField(term1590, term1590.getClass(), "missingEntries", 0.0);
        setIntField(term1590, term1590.getClass(), "size", 0);
        setIntField(term1590, term1590.getClass(), "mask", 31);
        setIntField(term1590, term1590.getClass(), "count", 0);
        setField(term1589, term1589.getClass(), "entries", term1590);
        setIntField(term1589, term1589.getClass(), "virtualSize", 597278769);
        setDoubleField(term1589, term1589.getClass(), "epsilon", 1.0E-12);
        term23092 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term23093 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term23094 = (int[]) newIntArray(32);
        double[] term23095 = (double[]) newDoubleArray(32);
        byte[] term23096 = (byte[]) newByteArray(32);
        setField(term23093, term23093.getClass(), "keys", term23094);
        setField(term23093, term23093.getClass(), "values", term23095);
        setField(term23093, term23093.getClass(), "states", term23096);
        setDoubleField(term23093, term23093.getClass(), "missingEntries", 0.0);
        setIntField(term23093, term23093.getClass(), "size", 0);
        setIntField(term23093, term23093.getClass(), "mask", 31);
        setIntField(term23093, term23093.getClass(), "count", 0);
        setField(term23092, term23092.getClass(), "entries", term23093);
        setIntField(term23092, term23092.getClass(), "virtualSize", 1585847225);
        setDoubleField(term23092, term23092.getClass(), "epsilon", 1.0E-12);
        term23097 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term23098 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term23099 = (int[]) newIntArray(32);
        double[] term23100 = (double[]) newDoubleArray(32);
        byte[] term23101 = (byte[]) newByteArray(32);
        setField(term23098, term23098.getClass(), "keys", term23099);
        setField(term23098, term23098.getClass(), "values", term23100);
        setField(term23098, term23098.getClass(), "states", term23101);
        setDoubleField(term23098, term23098.getClass(), "missingEntries", 0.0);
        setIntField(term23098, term23098.getClass(), "size", 0);
        setIntField(term23098, term23098.getClass(), "mask", 31);
        setIntField(term23098, term23098.getClass(), "count", 0);
        setField(term23097, term23097.getClass(), "entries", term23098);
        setIntField(term23097, term23097.getClass(), "virtualSize", 597278769);
        setDoubleField(term23097, term23097.getClass(), "epsilon", 1.0E-12);
        term17456 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term17457 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term17458 = (int[]) newIntArray(32);
        double[] term17491 = (double[]) newDoubleArray(32);
        byte[] term17524 = (byte[]) newByteArray(32);
        setField(term17457, term17457.getClass(), "keys", term17458);
        setField(term17457, term17457.getClass(), "values", term17491);
        setField(term17457, term17457.getClass(), "states", term17524);
        setDoubleField(term17457, term17457.getClass(), "missingEntries", 0.0);
        setIntField(term17457, term17457.getClass(), "size", 0);
        setIntField(term17457, term17457.getClass(), "mask", 31);
        setIntField(term17457, term17457.getClass(), "count", 0);
        setField(term17456, term17456.getClass(), "entries", term17457);
        setIntField(term17456, term17456.getClass(), "virtualSize", -2111841302);
        setDoubleField(term17456, term17456.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term1589;
        Object retValue = callMethod(klass, "append", argTypes, term1482, args);
        assertTrue(recursiveEquals(term1482, term23092));
        assertTrue(recursiveEquals(term1589, term23097));
        assertTrue(recursiveEquals(retValue, term17456));
    }

};


