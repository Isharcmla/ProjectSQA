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

public class OpenMapRealVector_getLInfDistance_181838589081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5347;
     Object term5454;
     Object term67276;
     Object term67281;

    public OpenMapRealVector_getLInfDistance_181838589081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5347 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term5348 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term5349 = (int[]) newIntArray(32);
        double[] term5382 = (double[]) newDoubleArray(32);
        byte[] term5415 = (byte[]) newByteArray(32);
        setField(term5348, term5348.getClass(), "keys", term5349);
        setField(term5348, term5348.getClass(), "values", term5382);
        setField(term5348, term5348.getClass(), "states", term5415);
        setDoubleField(term5348, term5348.getClass(), "missingEntries", 0.0);
        setIntField(term5348, term5348.getClass(), "size", 0);
        setIntField(term5348, term5348.getClass(), "mask", 31);
        setIntField(term5348, term5348.getClass(), "count", 0);
        setField(term5347, term5347.getClass(), "entries", term5348);
        setIntField(term5347, term5347.getClass(), "virtualSize", -1530420153);
        setDoubleField(term5347, term5347.getClass(), "epsilon", 1.0E-12);
        term5454 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term5455 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term5456 = (int[]) newIntArray(32);
        double[] term5489 = (double[]) newDoubleArray(32);
        byte[] term5522 = (byte[]) newByteArray(32);
        setField(term5455, term5455.getClass(), "keys", term5456);
        setField(term5455, term5455.getClass(), "values", term5489);
        setField(term5455, term5455.getClass(), "states", term5522);
        setDoubleField(term5455, term5455.getClass(), "missingEntries", 0.0);
        setIntField(term5455, term5455.getClass(), "size", 0);
        setIntField(term5455, term5455.getClass(), "mask", 31);
        setIntField(term5455, term5455.getClass(), "count", 0);
        setField(term5454, term5454.getClass(), "entries", term5455);
        setIntField(term5454, term5454.getClass(), "virtualSize", -469968304);
        setDoubleField(term5454, term5454.getClass(), "epsilon", 1.0E-12);
        term67276 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term67277 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term67278 = (int[]) newIntArray(32);
        double[] term67279 = (double[]) newDoubleArray(32);
        byte[] term67280 = (byte[]) newByteArray(32);
        setField(term67277, term67277.getClass(), "keys", term67278);
        setField(term67277, term67277.getClass(), "values", term67279);
        setField(term67277, term67277.getClass(), "states", term67280);
        setDoubleField(term67277, term67277.getClass(), "missingEntries", 0.0);
        setIntField(term67277, term67277.getClass(), "size", 0);
        setIntField(term67277, term67277.getClass(), "mask", 31);
        setIntField(term67277, term67277.getClass(), "count", 0);
        setField(term67276, term67276.getClass(), "entries", term67277);
        setIntField(term67276, term67276.getClass(), "virtualSize", -1530420153);
        setDoubleField(term67276, term67276.getClass(), "epsilon", 1.0E-12);
        term67281 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term67282 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term67283 = (int[]) newIntArray(32);
        double[] term67284 = (double[]) newDoubleArray(32);
        byte[] term67285 = (byte[]) newByteArray(32);
        setField(term67282, term67282.getClass(), "keys", term67283);
        setField(term67282, term67282.getClass(), "values", term67284);
        setField(term67282, term67282.getClass(), "states", term67285);
        setDoubleField(term67282, term67282.getClass(), "missingEntries", 0.0);
        setIntField(term67282, term67282.getClass(), "size", 0);
        setIntField(term67282, term67282.getClass(), "mask", 31);
        setIntField(term67282, term67282.getClass(), "count", 0);
        setField(term67281, term67281.getClass(), "entries", term67282);
        setIntField(term67281, term67281.getClass(), "virtualSize", -469968304);
        setDoubleField(term67281, term67281.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term5454;
        Object retValue = callMethod(klass, "getLInfDistance", argTypes, term5347, args);
        assertTrue(recursiveEquals(term5347, term67276));
        assertTrue(recursiveEquals(term5454, term67281));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


