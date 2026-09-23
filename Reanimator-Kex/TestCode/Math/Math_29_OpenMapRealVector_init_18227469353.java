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
import java.lang.Integer;

public class OpenMapRealVector_init_18227469353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term114;
     Object term11145;
     Object term11150;

    public OpenMapRealVector_init_18227469353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term8 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
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
        term11145 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term11146 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term11147 = (int[]) newIntArray(32);
        double[] term11148 = (double[]) newDoubleArray(32);
        byte[] term11149 = (byte[]) newByteArray(32);
        setField(term11146, term11146.getClass(), "keys", term11147);
        setField(term11146, term11146.getClass(), "values", term11148);
        setField(term11146, term11146.getClass(), "states", term11149);
        setDoubleField(term11146, term11146.getClass(), "missingEntries", 0.0);
        setIntField(term11146, term11146.getClass(), "size", 0);
        setIntField(term11146, term11146.getClass(), "mask", 31);
        setIntField(term11146, term11146.getClass(), "count", 0);
        setField(term11145, term11145.getClass(), "entries", term11146);
        setIntField(term11145, term11145.getClass(), "virtualSize", 1876186532);
        setDoubleField(term11145, term11145.getClass(), "epsilon", 1.0E-12);
        term11150 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term11151 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term11152 = (int[]) newIntArray(32);
        double[] term11153 = (double[]) newDoubleArray(32);
        byte[] term11154 = (byte[]) newByteArray(32);
        setField(term11151, term11151.getClass(), "keys", term11152);
        setField(term11151, term11151.getClass(), "values", term11153);
        setField(term11151, term11151.getClass(), "states", term11154);
        setDoubleField(term11151, term11151.getClass(), "missingEntries", 0.0);
        setIntField(term11151, term11151.getClass(), "size", 0);
        setIntField(term11151, term11151.getClass(), "mask", 31);
        setIntField(term11151, term11151.getClass(), "count", 0);
        setField(term11150, term11150.getClass(), "entries", term11151);
        setIntField(term11150, term11150.getClass(), "virtualSize", 1484323161);
        setDoubleField(term11150, term11150.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term7;
        args[1] = term114;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11145));
        assertTrue(recursiveEquals(term7, term11150));
        assertTrue(recursiveEquals(term114, 391863371));
    }

};


