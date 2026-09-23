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

public class OpenMapRealVector_getEntries_19611520862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465;
     Object term15254;
     Object term14833;

    public OpenMapRealVector_getEntries_19611520862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term465 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term466 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
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
        term15254 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term15255 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term15256 = (int[]) newIntArray(32);
        double[] term15257 = (double[]) newDoubleArray(32);
        byte[] term15258 = (byte[]) newByteArray(32);
        setField(term15255, term15255.getClass(), "keys", term15256);
        setField(term15255, term15255.getClass(), "values", term15257);
        setField(term15255, term15255.getClass(), "states", term15258);
        setDoubleField(term15255, term15255.getClass(), "missingEntries", 0.0);
        setIntField(term15255, term15255.getClass(), "size", 0);
        setIntField(term15255, term15255.getClass(), "mask", 31);
        setIntField(term15255, term15255.getClass(), "count", 0);
        setField(term15254, term15254.getClass(), "entries", term15255);
        setIntField(term15254, term15254.getClass(), "virtualSize", -1339778481);
        setDoubleField(term15254, term15254.getClass(), "epsilon", 1.0E-12);
        term14833 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term14834 = (int[]) newIntArray(32);
        double[] term14867 = (double[]) newDoubleArray(32);
        byte[] term14900 = (byte[]) newByteArray(32);
        setField(term14833, term14833.getClass(), "keys", term14834);
        setField(term14833, term14833.getClass(), "values", term14867);
        setField(term14833, term14833.getClass(), "states", term14900);
        setDoubleField(term14833, term14833.getClass(), "missingEntries", 0.0);
        setIntField(term14833, term14833.getClass(), "size", 0);
        setIntField(term14833, term14833.getClass(), "mask", 31);
        setIntField(term14833, term14833.getClass(), "count", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getEntries", argTypes, term465, args);
        assertTrue(recursiveEquals(term465, term15254));
        assertTrue(recursiveEquals(retValue, term14833));
    }

};


