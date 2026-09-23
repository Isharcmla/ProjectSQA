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

public class OpenMapRealVector_getEntries_207927837473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465;
     Object term17267;
     Object term17160;

    public OpenMapRealVector_getEntries_207927837473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term465 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term466 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term467 = (int[]) newIntArray(32);
        double[] term500 = (double[]) newDoubleArray(32);
        byte[] term533 = (byte[]) newByteArray(32);
        setField(term466, term466.getClass(), "keys", term467);
        setField(term466, term466.getClass(), "values", term500);
        setField(term466, term466.getClass(), "states", term533);
        setDoubleField(term466, term466.getClass(), "missingEntries", 0.0);
        setIntField(term466, term466.getClass(), "size", 0);
        setIntField(term466, term466.getClass(), "mask", 31);
        setIntField(term466, term466.getClass(), "count", 0);
        setField(term465, term465.getClass(), "entries", term466);
        setIntField(term465, term465.getClass(), "virtualSize", -1339778481);
        setDoubleField(term465, term465.getClass(), "epsilon", 1.0E-12);
        term17267 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term17268 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term17269 = (int[]) newIntArray(32);
        double[] term17270 = (double[]) newDoubleArray(32);
        byte[] term17271 = (byte[]) newByteArray(32);
        setField(term17268, term17268.getClass(), "keys", term17269);
        setField(term17268, term17268.getClass(), "values", term17270);
        setField(term17268, term17268.getClass(), "states", term17271);
        setDoubleField(term17268, term17268.getClass(), "missingEntries", 0.0);
        setIntField(term17268, term17268.getClass(), "size", 0);
        setIntField(term17268, term17268.getClass(), "mask", 31);
        setIntField(term17268, term17268.getClass(), "count", 0);
        setField(term17267, term17267.getClass(), "entries", term17268);
        setIntField(term17267, term17267.getClass(), "virtualSize", -1339778481);
        setDoubleField(term17267, term17267.getClass(), "epsilon", 1.0E-12);
        term17160 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term17161 = (int[]) newIntArray(32);
        double[] term17194 = (double[]) newDoubleArray(32);
        byte[] term17227 = (byte[]) newByteArray(32);
        setField(term17160, term17160.getClass(), "keys", term17161);
        setField(term17160, term17160.getClass(), "values", term17194);
        setField(term17160, term17160.getClass(), "states", term17227);
        setDoubleField(term17160, term17160.getClass(), "missingEntries", 0.0);
        setIntField(term17160, term17160.getClass(), "size", 0);
        setIntField(term17160, term17160.getClass(), "mask", 31);
        setIntField(term17160, term17160.getClass(), "count", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getEntries", argTypes, term465, args);
        assertTrue(recursiveEquals(term465, term17267));
        assertTrue(recursiveEquals(retValue, term17160));
    }

};


