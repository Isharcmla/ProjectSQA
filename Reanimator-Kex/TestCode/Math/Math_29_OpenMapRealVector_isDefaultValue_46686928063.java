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
import java.lang.Double;

public class OpenMapRealVector_isDefaultValue_46686928063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term668;
     Object term775;
     Object term15056;

    public OpenMapRealVector_isDefaultValue_46686928063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term668 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term669 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term670 = (int[]) newIntArray(32);
        double[] term703 = (double[]) newDoubleArray(32);
        byte[] term736 = (byte[]) newByteArray(32);
        setField(term669, term669.getClass(), "keys", term670);
        setField(term669, term669.getClass(), "values", term703);
        setField(term669, term669.getClass(), "states", term736);
        setDoubleField(term669, term669.getClass(), "missingEntries", 0.0);
        setIntField(term669, term669.getClass(), "size", 0);
        setIntField(term669, term669.getClass(), "mask", 31);
        setIntField(term669, term669.getClass(), "count", 0);
        setField(term668, term668.getClass(), "entries", term669);
        setIntField(term668, term668.getClass(), "virtualSize", 1725571209);
        setDoubleField(term668, term668.getClass(), "epsilon", 1.0E-12);
        term775 = new Double(0.1374549299694151);
        term15056 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term15057 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term15058 = (int[]) newIntArray(32);
        double[] term15059 = (double[]) newDoubleArray(32);
        byte[] term15060 = (byte[]) newByteArray(32);
        setField(term15057, term15057.getClass(), "keys", term15058);
        setField(term15057, term15057.getClass(), "values", term15059);
        setField(term15057, term15057.getClass(), "states", term15060);
        setDoubleField(term15057, term15057.getClass(), "missingEntries", 0.0);
        setIntField(term15057, term15057.getClass(), "size", 0);
        setIntField(term15057, term15057.getClass(), "mask", 31);
        setIntField(term15057, term15057.getClass(), "count", 0);
        setField(term15056, term15056.getClass(), "entries", term15057);
        setIntField(term15056, term15056.getClass(), "virtualSize", 1725571209);
        setDoubleField(term15056, term15056.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term775;
        Object retValue = callMethod(klass, "isDefaultValue", argTypes, term668, args);
        assertTrue(recursiveEquals(term668, term15056));
        assertTrue(recursiveEquals(term775, 0.1374549299694151));
        assertTrue(recursiveEquals(retValue, false));
    }

};


