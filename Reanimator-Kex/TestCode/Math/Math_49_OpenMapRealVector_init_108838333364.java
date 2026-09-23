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
import java.lang.Integer;

public class OpenMapRealVector_init_108838333364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term114;
     Object term13472;
     Object term13477;

    public OpenMapRealVector_init_108838333364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term8 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term9 = (int[]) newIntArray(32);
        double[] term42 = (double[]) newDoubleArray(32);
        byte[] term75 = (byte[]) newByteArray(32);
        setField(term8, term8.getClass(), "keys", term9);
        setField(term8, term8.getClass(), "values", term42);
        setField(term8, term8.getClass(), "states", term75);
        setDoubleField(term8, term8.getClass(), "missingEntries", 0.0);
        setIntField(term8, term8.getClass(), "size", 0);
        setIntField(term8, term8.getClass(), "mask", 31);
        setIntField(term8, term8.getClass(), "count", 0);
        setField(term7, term7.getClass(), "entries", term8);
        setIntField(term7, term7.getClass(), "virtualSize", 1484323161);
        setDoubleField(term7, term7.getClass(), "epsilon", 1.0E-12);
        term114 = new Integer(391863371);
        term13472 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term13473 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term13474 = (int[]) newIntArray(32);
        double[] term13475 = (double[]) newDoubleArray(32);
        byte[] term13476 = (byte[]) newByteArray(32);
        setField(term13473, term13473.getClass(), "keys", term13474);
        setField(term13473, term13473.getClass(), "values", term13475);
        setField(term13473, term13473.getClass(), "states", term13476);
        setDoubleField(term13473, term13473.getClass(), "missingEntries", 0.0);
        setIntField(term13473, term13473.getClass(), "size", 0);
        setIntField(term13473, term13473.getClass(), "mask", 31);
        setIntField(term13473, term13473.getClass(), "count", 0);
        setField(term13472, term13472.getClass(), "entries", term13473);
        setIntField(term13472, term13472.getClass(), "virtualSize", 1876186532);
        setDoubleField(term13472, term13472.getClass(), "epsilon", 1.0E-12);
        term13477 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term13478 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term13479 = (int[]) newIntArray(32);
        double[] term13480 = (double[]) newDoubleArray(32);
        byte[] term13481 = (byte[]) newByteArray(32);
        setField(term13478, term13478.getClass(), "keys", term13479);
        setField(term13478, term13478.getClass(), "values", term13480);
        setField(term13478, term13478.getClass(), "states", term13481);
        setDoubleField(term13478, term13478.getClass(), "missingEntries", 0.0);
        setIntField(term13478, term13478.getClass(), "size", 0);
        setIntField(term13478, term13478.getClass(), "mask", 31);
        setIntField(term13478, term13478.getClass(), "count", 0);
        setField(term13477, term13477.getClass(), "entries", term13478);
        setIntField(term13477, term13477.getClass(), "virtualSize", 1484323161);
        setDoubleField(term13477, term13477.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term7;
        args[1] = term114;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term13472));
        assertTrue(recursiveEquals(term7, term13477));
        assertTrue(recursiveEquals(term114, 391863371));
    }

};


