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

public class OpenMapRealVector_append_51758226477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1482;
     Object term1589;
     Object term25496;
     Object term25501;
     Object term19489;

    public OpenMapRealVector_append_51758226477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1482 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term1483 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
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
        term1589 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term1590 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
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
        term25496 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term25497 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term25498 = (int[]) newIntArray(32);
        double[] term25499 = (double[]) newDoubleArray(32);
        byte[] term25500 = (byte[]) newByteArray(32);
        setField(term25497, term25497.getClass(), "keys", term25498);
        setField(term25497, term25497.getClass(), "values", term25499);
        setField(term25497, term25497.getClass(), "states", term25500);
        setDoubleField(term25497, term25497.getClass(), "missingEntries", 0.0);
        setIntField(term25497, term25497.getClass(), "size", 0);
        setIntField(term25497, term25497.getClass(), "mask", 31);
        setIntField(term25497, term25497.getClass(), "count", 0);
        setField(term25496, term25496.getClass(), "entries", term25497);
        setIntField(term25496, term25496.getClass(), "virtualSize", 1585847225);
        setDoubleField(term25496, term25496.getClass(), "epsilon", 1.0E-12);
        term25501 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term25502 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term25503 = (int[]) newIntArray(32);
        double[] term25504 = (double[]) newDoubleArray(32);
        byte[] term25505 = (byte[]) newByteArray(32);
        setField(term25502, term25502.getClass(), "keys", term25503);
        setField(term25502, term25502.getClass(), "values", term25504);
        setField(term25502, term25502.getClass(), "states", term25505);
        setDoubleField(term25502, term25502.getClass(), "missingEntries", 0.0);
        setIntField(term25502, term25502.getClass(), "size", 0);
        setIntField(term25502, term25502.getClass(), "mask", 31);
        setIntField(term25502, term25502.getClass(), "count", 0);
        setField(term25501, term25501.getClass(), "entries", term25502);
        setIntField(term25501, term25501.getClass(), "virtualSize", 597278769);
        setDoubleField(term25501, term25501.getClass(), "epsilon", 1.0E-12);
        term19489 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term19490 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term19491 = (int[]) newIntArray(32);
        double[] term19524 = (double[]) newDoubleArray(32);
        byte[] term19557 = (byte[]) newByteArray(32);
        setField(term19490, term19490.getClass(), "keys", term19491);
        setField(term19490, term19490.getClass(), "values", term19524);
        setField(term19490, term19490.getClass(), "states", term19557);
        setDoubleField(term19490, term19490.getClass(), "missingEntries", 0.0);
        setIntField(term19490, term19490.getClass(), "size", 0);
        setIntField(term19490, term19490.getClass(), "mask", 31);
        setIntField(term19490, term19490.getClass(), "count", 0);
        setField(term19489, term19489.getClass(), "entries", term19490);
        setIntField(term19489, term19489.getClass(), "virtualSize", -2111841302);
        setDoubleField(term19489, term19489.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term1589;
        Object retValue = callMethod(klass, "append", argTypes, term1482, args);
        assertTrue(recursiveEquals(term1482, term25496));
        assertTrue(recursiveEquals(term1589, term25501));
        assertTrue(recursiveEquals(retValue, term19489));
    }

};


