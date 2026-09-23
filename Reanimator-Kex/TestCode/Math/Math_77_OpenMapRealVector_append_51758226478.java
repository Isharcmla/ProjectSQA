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

public class OpenMapRealVector_append_51758226478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1482;
     Object term1589;
     Object term26018;
     Object term26023;
     Object term20035;

    public OpenMapRealVector_append_51758226478() {
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
        term26018 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term26019 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term26020 = (int[]) newIntArray(32);
        double[] term26021 = (double[]) newDoubleArray(32);
        byte[] term26022 = (byte[]) newByteArray(32);
        setField(term26019, term26019.getClass(), "keys", term26020);
        setField(term26019, term26019.getClass(), "values", term26021);
        setField(term26019, term26019.getClass(), "states", term26022);
        setDoubleField(term26019, term26019.getClass(), "missingEntries", 0.0);
        setIntField(term26019, term26019.getClass(), "size", 0);
        setIntField(term26019, term26019.getClass(), "mask", 31);
        setIntField(term26019, term26019.getClass(), "count", 0);
        setField(term26018, term26018.getClass(), "entries", term26019);
        setIntField(term26018, term26018.getClass(), "virtualSize", 1585847225);
        setDoubleField(term26018, term26018.getClass(), "epsilon", 1.0E-12);
        term26023 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term26024 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term26025 = (int[]) newIntArray(32);
        double[] term26026 = (double[]) newDoubleArray(32);
        byte[] term26027 = (byte[]) newByteArray(32);
        setField(term26024, term26024.getClass(), "keys", term26025);
        setField(term26024, term26024.getClass(), "values", term26026);
        setField(term26024, term26024.getClass(), "states", term26027);
        setDoubleField(term26024, term26024.getClass(), "missingEntries", 0.0);
        setIntField(term26024, term26024.getClass(), "size", 0);
        setIntField(term26024, term26024.getClass(), "mask", 31);
        setIntField(term26024, term26024.getClass(), "count", 0);
        setField(term26023, term26023.getClass(), "entries", term26024);
        setIntField(term26023, term26023.getClass(), "virtualSize", 597278769);
        setDoubleField(term26023, term26023.getClass(), "epsilon", 1.0E-12);
        term20035 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term20036 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term20037 = (int[]) newIntArray(32);
        double[] term20070 = (double[]) newDoubleArray(32);
        byte[] term20103 = (byte[]) newByteArray(32);
        setField(term20036, term20036.getClass(), "keys", term20037);
        setField(term20036, term20036.getClass(), "values", term20070);
        setField(term20036, term20036.getClass(), "states", term20103);
        setDoubleField(term20036, term20036.getClass(), "missingEntries", 0.0);
        setIntField(term20036, term20036.getClass(), "size", 0);
        setIntField(term20036, term20036.getClass(), "mask", 31);
        setIntField(term20036, term20036.getClass(), "count", 0);
        setField(term20035, term20035.getClass(), "entries", term20036);
        setIntField(term20035, term20035.getClass(), "virtualSize", -2111841302);
        setDoubleField(term20035, term20035.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term1589;
        Object retValue = callMethod(klass, "append", argTypes, term1482, args);
        assertTrue(recursiveEquals(term1482, term26018));
        assertTrue(recursiveEquals(term1589, term26023));
        assertTrue(recursiveEquals(retValue, term20035));
    }

};


