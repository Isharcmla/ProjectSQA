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

public class OpenMapRealVector_init_7304252972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262;
     Object term16997;
     Object term17002;

    public OpenMapRealVector_init_7304252972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term263 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term264 = (int[]) newIntArray(32);
        double[] term297 = (double[]) newDoubleArray(32);
        byte[] term330 = (byte[]) newByteArray(32);
        setField(term263, term263.getClass(), "keys", term264);
        setField(term263, term263.getClass(), "values", term297);
        setField(term263, term263.getClass(), "states", term330);
        setDoubleField(term263, term263.getClass(), "missingEntries", 0.0);
        setIntField(term263, term263.getClass(), "size", 0);
        setIntField(term263, term263.getClass(), "mask", 31);
        setIntField(term263, term263.getClass(), "count", 0);
        setField(term262, term262.getClass(), "entries", term263);
        setIntField(term262, term262.getClass(), "virtualSize", 1227103734);
        setDoubleField(term262, term262.getClass(), "epsilon", 1.0E-12);
        term16997 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term16998 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term16999 = (int[]) newIntArray(32);
        double[] term17000 = (double[]) newDoubleArray(32);
        byte[] term17001 = (byte[]) newByteArray(32);
        setField(term16998, term16998.getClass(), "keys", term16999);
        setField(term16998, term16998.getClass(), "values", term17000);
        setField(term16998, term16998.getClass(), "states", term17001);
        setDoubleField(term16998, term16998.getClass(), "missingEntries", 0.0);
        setIntField(term16998, term16998.getClass(), "size", 0);
        setIntField(term16998, term16998.getClass(), "mask", 31);
        setIntField(term16998, term16998.getClass(), "count", 0);
        setField(term16997, term16997.getClass(), "entries", term16998);
        setIntField(term16997, term16997.getClass(), "virtualSize", 1227103734);
        setDoubleField(term16997, term16997.getClass(), "epsilon", 1.0E-12);
        term17002 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term17003 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term17004 = (int[]) newIntArray(32);
        double[] term17005 = (double[]) newDoubleArray(32);
        byte[] term17006 = (byte[]) newByteArray(32);
        setField(term17003, term17003.getClass(), "keys", term17004);
        setField(term17003, term17003.getClass(), "values", term17005);
        setField(term17003, term17003.getClass(), "states", term17006);
        setDoubleField(term17003, term17003.getClass(), "missingEntries", 0.0);
        setIntField(term17003, term17003.getClass(), "size", 0);
        setIntField(term17003, term17003.getClass(), "mask", 31);
        setIntField(term17003, term17003.getClass(), "count", 0);
        setField(term17002, term17002.getClass(), "entries", term17003);
        setIntField(term17002, term17002.getClass(), "virtualSize", 1227103734);
        setDoubleField(term17002, term17002.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term262;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16997));
        assertTrue(recursiveEquals(term262, term17002));
    }

};


