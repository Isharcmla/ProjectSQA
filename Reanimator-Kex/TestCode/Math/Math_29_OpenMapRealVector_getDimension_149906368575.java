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

public class OpenMapRealVector_getDimension_149906368575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3721;
     Object term30012;

    public OpenMapRealVector_getDimension_149906368575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3721 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term3722 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term3723 = (int[]) newIntArray(32);
        double[] term3756 = (double[]) newDoubleArray(32);
        byte[] term3789 = (byte[]) newByteArray(32);
        setField(term3722, term3722.getClass(), "keys", term3723);
        setField(term3722, term3722.getClass(), "values", term3756);
        setField(term3722, term3722.getClass(), "states", term3789);
        setDoubleField(term3722, term3722.getClass(), "missingEntries", 0.0);
        setIntField(term3722, term3722.getClass(), "size", 0);
        setIntField(term3722, term3722.getClass(), "mask", 31);
        setIntField(term3722, term3722.getClass(), "count", 0);
        setField(term3721, term3721.getClass(), "entries", term3722);
        setIntField(term3721, term3721.getClass(), "virtualSize", 865208305);
        setDoubleField(term3721, term3721.getClass(), "epsilon", 1.0E-12);
        term30012 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term30013 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term30014 = (int[]) newIntArray(32);
        double[] term30015 = (double[]) newDoubleArray(32);
        byte[] term30016 = (byte[]) newByteArray(32);
        setField(term30013, term30013.getClass(), "keys", term30014);
        setField(term30013, term30013.getClass(), "values", term30015);
        setField(term30013, term30013.getClass(), "states", term30016);
        setDoubleField(term30013, term30013.getClass(), "missingEntries", 0.0);
        setIntField(term30013, term30013.getClass(), "size", 0);
        setIntField(term30013, term30013.getClass(), "mask", 31);
        setIntField(term30013, term30013.getClass(), "count", 0);
        setField(term30012, term30012.getClass(), "entries", term30013);
        setIntField(term30012, term30012.getClass(), "virtualSize", 865208305);
        setDoubleField(term30012, term30012.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDimension", argTypes, term3721, args);
        assertTrue(recursiveEquals(term3721, term30012));
        assertTrue(recursiveEquals(retValue, 865208305));
    }

};


