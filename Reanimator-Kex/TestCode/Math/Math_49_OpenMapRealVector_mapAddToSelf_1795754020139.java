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
import java.lang.Double;

public class OpenMapRealVector_mapAddToSelf_1795754020139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8040;
     Object term8147;
     Object term142347;
     Object term142239;

    public OpenMapRealVector_mapAddToSelf_1795754020139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8040 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term8041 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term8042 = (int[]) newIntArray(32);
        double[] term8075 = (double[]) newDoubleArray(32);
        byte[] term8108 = (byte[]) newByteArray(32);
        setField(term8041, term8041.getClass(), "keys", term8042);
        setField(term8041, term8041.getClass(), "values", term8075);
        setField(term8041, term8041.getClass(), "states", term8108);
        setDoubleField(term8041, term8041.getClass(), "missingEntries", 0.0);
        setIntField(term8041, term8041.getClass(), "size", 0);
        setIntField(term8041, term8041.getClass(), "mask", 31);
        setIntField(term8041, term8041.getClass(), "count", 0);
        setField(term8040, term8040.getClass(), "entries", term8041);
        setIntField(term8040, term8040.getClass(), "virtualSize", -14890619);
        setDoubleField(term8040, term8040.getClass(), "epsilon", 1.0E-12);
        term8147 = new Double(0.3202192021706908);
        term142347 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term142348 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term142349 = (int[]) newIntArray(32);
        double[] term142350 = (double[]) newDoubleArray(32);
        byte[] term142351 = (byte[]) newByteArray(32);
        setField(term142348, term142348.getClass(), "keys", term142349);
        setField(term142348, term142348.getClass(), "values", term142350);
        setField(term142348, term142348.getClass(), "states", term142351);
        setDoubleField(term142348, term142348.getClass(), "missingEntries", 0.0);
        setIntField(term142348, term142348.getClass(), "size", 0);
        setIntField(term142348, term142348.getClass(), "mask", 31);
        setIntField(term142348, term142348.getClass(), "count", 0);
        setField(term142347, term142347.getClass(), "entries", term142348);
        setIntField(term142347, term142347.getClass(), "virtualSize", -14890619);
        setDoubleField(term142347, term142347.getClass(), "epsilon", 1.0E-12);
        term142239 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term142240 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term142241 = (int[]) newIntArray(32);
        double[] term142274 = (double[]) newDoubleArray(32);
        byte[] term142307 = (byte[]) newByteArray(32);
        setField(term142240, term142240.getClass(), "keys", term142241);
        setField(term142240, term142240.getClass(), "values", term142274);
        setField(term142240, term142240.getClass(), "states", term142307);
        setDoubleField(term142240, term142240.getClass(), "missingEntries", 0.0);
        setIntField(term142240, term142240.getClass(), "size", 0);
        setIntField(term142240, term142240.getClass(), "mask", 31);
        setIntField(term142240, term142240.getClass(), "count", 0);
        setField(term142239, term142239.getClass(), "entries", term142240);
        setIntField(term142239, term142239.getClass(), "virtualSize", -14890619);
        setDoubleField(term142239, term142239.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term8147;
        Object retValue = callMethod(klass, "mapAddToSelf", argTypes, term8040, args);
        assertTrue(recursiveEquals(term8040, term142347));
        assertTrue(recursiveEquals(term8147, 0.3202192021706908));
        assertTrue(recursiveEquals(retValue, term142239));
    }

};


