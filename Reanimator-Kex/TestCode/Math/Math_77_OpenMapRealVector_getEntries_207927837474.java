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

public class OpenMapRealVector_getEntries_207927837474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465;
     Object term17762;
     Object term17655;

    public OpenMapRealVector_getEntries_207927837474() {
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
        term17762 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term17763 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term17764 = (int[]) newIntArray(32);
        double[] term17765 = (double[]) newDoubleArray(32);
        byte[] term17766 = (byte[]) newByteArray(32);
        setField(term17763, term17763.getClass(), "keys", term17764);
        setField(term17763, term17763.getClass(), "values", term17765);
        setField(term17763, term17763.getClass(), "states", term17766);
        setDoubleField(term17763, term17763.getClass(), "missingEntries", 0.0);
        setIntField(term17763, term17763.getClass(), "size", 0);
        setIntField(term17763, term17763.getClass(), "mask", 31);
        setIntField(term17763, term17763.getClass(), "count", 0);
        setField(term17762, term17762.getClass(), "entries", term17763);
        setIntField(term17762, term17762.getClass(), "virtualSize", -1339778481);
        setDoubleField(term17762, term17762.getClass(), "epsilon", 1.0E-12);
        term17655 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term17656 = (int[]) newIntArray(32);
        double[] term17689 = (double[]) newDoubleArray(32);
        byte[] term17722 = (byte[]) newByteArray(32);
        setField(term17655, term17655.getClass(), "keys", term17656);
        setField(term17655, term17655.getClass(), "values", term17689);
        setField(term17655, term17655.getClass(), "states", term17722);
        setDoubleField(term17655, term17655.getClass(), "missingEntries", 0.0);
        setIntField(term17655, term17655.getClass(), "size", 0);
        setIntField(term17655, term17655.getClass(), "mask", 31);
        setIntField(term17655, term17655.getClass(), "count", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getEntries", argTypes, term465, args);
        assertTrue(recursiveEquals(term465, term17762));
        assertTrue(recursiveEquals(retValue, term17655));
    }

};


