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
import java.lang.Double;

public class OpenMapRealMatrix_init_108008163717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term4487;
     Object term4492;

    public OpenMapRealMatrix_init_108008163717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term8 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term9 = (int[]) newIntArray(32);
        double[] term42 = (double[]) newDoubleArray(32);
        byte[] term75 = (byte[]) newByteArray(32);
        setIntField(term5, term5.getClass(), "rows", 1484323161);
        setIntField(term5, term5.getClass(), "columns", 391863371);
        setField(term8, term8.getClass(), "keys", term9);
        setField(term8, term8.getClass(), "values", term42);
        setField(term8, term8.getClass(), "states", term75);
        setDoubleField(term8, term8.getClass(), "missingEntries", Double.NaN);
        setIntField(term8, term8.getClass(), "size", -1922583790);
        setIntField(term8, term8.getClass(), "mask", 31);
        setIntField(term8, term8.getClass(), "count", -616727354);
        setField(term5, term5.getClass(), "entries", term8);
        term4487 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term4488 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term4489 = (int[]) newIntArray(32);
        double[] term4490 = (double[]) newDoubleArray(32);
        byte[] term4491 = (byte[]) newByteArray(32);
        setIntField(term4487, term4487.getClass(), "rows", 1484323161);
        setIntField(term4487, term4487.getClass(), "columns", 391863371);
        setField(term4488, term4488.getClass(), "keys", term4489);
        setField(term4488, term4488.getClass(), "values", term4490);
        setField(term4488, term4488.getClass(), "states", term4491);
        setDoubleField(term4488, term4488.getClass(), "missingEntries", Double.NaN);
        setIntField(term4488, term4488.getClass(), "size", -1922583790);
        setIntField(term4488, term4488.getClass(), "mask", 31);
        setIntField(term4488, term4488.getClass(), "count", -616727354);
        setField(term4487, term4487.getClass(), "entries", term4488);
        term4492 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term4493 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term4494 = (int[]) newIntArray(32);
        double[] term4495 = (double[]) newDoubleArray(32);
        byte[] term4496 = (byte[]) newByteArray(32);
        setIntField(term4492, term4492.getClass(), "rows", 1484323161);
        setIntField(term4492, term4492.getClass(), "columns", 391863371);
        setField(term4493, term4493.getClass(), "keys", term4494);
        setField(term4493, term4493.getClass(), "values", term4495);
        setField(term4493, term4493.getClass(), "states", term4496);
        setDoubleField(term4493, term4493.getClass(), "missingEntries", Double.NaN);
        setIntField(term4493, term4493.getClass(), "size", -1922583790);
        setIntField(term4493, term4493.getClass(), "mask", 31);
        setIntField(term4493, term4493.getClass(), "count", -616727354);
        setField(term4492, term4492.getClass(), "entries", term4493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Object[] args = new Object[1];
        args[0] = term5;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4487));
        assertTrue(recursiveEquals(term5, term4492));
    }

};


