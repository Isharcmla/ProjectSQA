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

public class OpenMapRealVector_getL1Distance_16241945295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5787;
     Object term5894;
     Object term60593;
     Object term60598;

    public OpenMapRealVector_getL1Distance_16241945295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5787 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term5788 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term5789 = (int[]) newIntArray(32);
        double[] term5822 = (double[]) newDoubleArray(32);
        byte[] term5855 = (byte[]) newByteArray(32);
        setField(term5788, term5788.getClass(), "keys", term5789);
        setField(term5788, term5788.getClass(), "values", term5822);
        setField(term5788, term5788.getClass(), "states", term5855);
        setDoubleField(term5788, term5788.getClass(), "missingEntries", 0.0);
        setIntField(term5788, term5788.getClass(), "size", 0);
        setIntField(term5788, term5788.getClass(), "mask", 31);
        setIntField(term5788, term5788.getClass(), "count", 0);
        setField(term5787, term5787.getClass(), "entries", term5788);
        setIntField(term5787, term5787.getClass(), "virtualSize", -1145578966);
        setDoubleField(term5787, term5787.getClass(), "epsilon", 1.0E-12);
        term5894 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term5895 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term5896 = (int[]) newIntArray(32);
        double[] term5929 = (double[]) newDoubleArray(32);
        byte[] term5962 = (byte[]) newByteArray(32);
        setField(term5895, term5895.getClass(), "keys", term5896);
        setField(term5895, term5895.getClass(), "values", term5929);
        setField(term5895, term5895.getClass(), "states", term5962);
        setDoubleField(term5895, term5895.getClass(), "missingEntries", 0.0);
        setIntField(term5895, term5895.getClass(), "size", 0);
        setIntField(term5895, term5895.getClass(), "mask", 31);
        setIntField(term5895, term5895.getClass(), "count", 0);
        setField(term5894, term5894.getClass(), "entries", term5895);
        setIntField(term5894, term5894.getClass(), "virtualSize", 679763016);
        setDoubleField(term5894, term5894.getClass(), "epsilon", 1.0E-12);
        term60593 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term60594 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term60595 = (int[]) newIntArray(32);
        double[] term60596 = (double[]) newDoubleArray(32);
        byte[] term60597 = (byte[]) newByteArray(32);
        setField(term60594, term60594.getClass(), "keys", term60595);
        setField(term60594, term60594.getClass(), "values", term60596);
        setField(term60594, term60594.getClass(), "states", term60597);
        setDoubleField(term60594, term60594.getClass(), "missingEntries", 0.0);
        setIntField(term60594, term60594.getClass(), "size", 0);
        setIntField(term60594, term60594.getClass(), "mask", 31);
        setIntField(term60594, term60594.getClass(), "count", 0);
        setField(term60593, term60593.getClass(), "entries", term60594);
        setIntField(term60593, term60593.getClass(), "virtualSize", -1145578966);
        setDoubleField(term60593, term60593.getClass(), "epsilon", 1.0E-12);
        term60598 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term60599 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term60600 = (int[]) newIntArray(32);
        double[] term60601 = (double[]) newDoubleArray(32);
        byte[] term60602 = (byte[]) newByteArray(32);
        setField(term60599, term60599.getClass(), "keys", term60600);
        setField(term60599, term60599.getClass(), "values", term60601);
        setField(term60599, term60599.getClass(), "states", term60602);
        setDoubleField(term60599, term60599.getClass(), "missingEntries", 0.0);
        setIntField(term60599, term60599.getClass(), "size", 0);
        setIntField(term60599, term60599.getClass(), "mask", 31);
        setIntField(term60599, term60599.getClass(), "count", 0);
        setField(term60598, term60598.getClass(), "entries", term60599);
        setIntField(term60598, term60598.getClass(), "virtualSize", 679763016);
        setDoubleField(term60598, term60598.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term5894;
        Object retValue = callMethod(klass, "getL1Distance", argTypes, term5787, args);
        assertTrue(recursiveEquals(term5787, term60593));
        assertTrue(recursiveEquals(term5894, term60598));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


