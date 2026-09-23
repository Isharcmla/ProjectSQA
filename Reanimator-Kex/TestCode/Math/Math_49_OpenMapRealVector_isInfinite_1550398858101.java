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

public class OpenMapRealVector_isInfinite_1550398858101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7429;
     Object term81058;

    public OpenMapRealVector_isInfinite_1550398858101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7429 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term7430 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term7431 = (int[]) newIntArray(32);
        double[] term7464 = (double[]) newDoubleArray(32);
        byte[] term7497 = (byte[]) newByteArray(32);
        setField(term7430, term7430.getClass(), "keys", term7431);
        setField(term7430, term7430.getClass(), "values", term7464);
        setField(term7430, term7430.getClass(), "states", term7497);
        setDoubleField(term7430, term7430.getClass(), "missingEntries", 0.0);
        setIntField(term7430, term7430.getClass(), "size", 0);
        setIntField(term7430, term7430.getClass(), "mask", 31);
        setIntField(term7430, term7430.getClass(), "count", 0);
        setField(term7429, term7429.getClass(), "entries", term7430);
        setIntField(term7429, term7429.getClass(), "virtualSize", -1016503459);
        setDoubleField(term7429, term7429.getClass(), "epsilon", 1.0E-12);
        term81058 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term81059 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term81060 = (int[]) newIntArray(32);
        double[] term81061 = (double[]) newDoubleArray(32);
        byte[] term81062 = (byte[]) newByteArray(32);
        setField(term81059, term81059.getClass(), "keys", term81060);
        setField(term81059, term81059.getClass(), "values", term81061);
        setField(term81059, term81059.getClass(), "states", term81062);
        setDoubleField(term81059, term81059.getClass(), "missingEntries", 0.0);
        setIntField(term81059, term81059.getClass(), "size", 0);
        setIntField(term81059, term81059.getClass(), "mask", 31);
        setIntField(term81059, term81059.getClass(), "count", 0);
        setField(term81058, term81058.getClass(), "entries", term81059);
        setIntField(term81058, term81058.getClass(), "virtualSize", -1016503459);
        setDoubleField(term81058, term81058.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isInfinite", argTypes, term7429, args);
        assertTrue(recursiveEquals(term7429, term81058));
        assertTrue(recursiveEquals(retValue, false));
    }

};


