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

public class OpenMapRealVector_init_108838333365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term114;
     Object term13622;
     Object term13627;

    public OpenMapRealVector_init_108838333365() {
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
        term13622 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term13623 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term13624 = (int[]) newIntArray(32);
        double[] term13625 = (double[]) newDoubleArray(32);
        byte[] term13626 = (byte[]) newByteArray(32);
        setField(term13623, term13623.getClass(), "keys", term13624);
        setField(term13623, term13623.getClass(), "values", term13625);
        setField(term13623, term13623.getClass(), "states", term13626);
        setDoubleField(term13623, term13623.getClass(), "missingEntries", 0.0);
        setIntField(term13623, term13623.getClass(), "size", 0);
        setIntField(term13623, term13623.getClass(), "mask", 31);
        setIntField(term13623, term13623.getClass(), "count", 0);
        setField(term13622, term13622.getClass(), "entries", term13623);
        setIntField(term13622, term13622.getClass(), "virtualSize", 1876186532);
        setDoubleField(term13622, term13622.getClass(), "epsilon", 1.0E-12);
        term13627 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term13628 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term13629 = (int[]) newIntArray(32);
        double[] term13630 = (double[]) newDoubleArray(32);
        byte[] term13631 = (byte[]) newByteArray(32);
        setField(term13628, term13628.getClass(), "keys", term13629);
        setField(term13628, term13628.getClass(), "values", term13630);
        setField(term13628, term13628.getClass(), "states", term13631);
        setDoubleField(term13628, term13628.getClass(), "missingEntries", 0.0);
        setIntField(term13628, term13628.getClass(), "size", 0);
        setIntField(term13628, term13628.getClass(), "mask", 31);
        setIntField(term13628, term13628.getClass(), "count", 0);
        setField(term13627, term13627.getClass(), "entries", term13628);
        setIntField(term13627, term13627.getClass(), "virtualSize", 1484323161);
        setDoubleField(term13627, term13627.getClass(), "epsilon", 1.0E-12);
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
        assertTrue(recursiveEquals(instance, term13622));
        assertTrue(recursiveEquals(term7, term13627));
        assertTrue(recursiveEquals(term114, 391863371));
    }

};


