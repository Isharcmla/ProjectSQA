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

public class OpenMapRealVector_init_78889562960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262;
     Object term14175;
     Object term14180;

    public OpenMapRealVector_init_78889562960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term263 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
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
        term14175 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term14176 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term14177 = (int[]) newIntArray(32);
        double[] term14178 = (double[]) newDoubleArray(32);
        byte[] term14179 = (byte[]) newByteArray(32);
        setField(term14176, term14176.getClass(), "keys", term14177);
        setField(term14176, term14176.getClass(), "values", term14178);
        setField(term14176, term14176.getClass(), "states", term14179);
        setDoubleField(term14176, term14176.getClass(), "missingEntries", 0.0);
        setIntField(term14176, term14176.getClass(), "size", 0);
        setIntField(term14176, term14176.getClass(), "mask", 31);
        setIntField(term14176, term14176.getClass(), "count", 0);
        setField(term14175, term14175.getClass(), "entries", term14176);
        setIntField(term14175, term14175.getClass(), "virtualSize", 1227103734);
        setDoubleField(term14175, term14175.getClass(), "epsilon", 1.0E-12);
        term14180 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term14181 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term14182 = (int[]) newIntArray(32);
        double[] term14183 = (double[]) newDoubleArray(32);
        byte[] term14184 = (byte[]) newByteArray(32);
        setField(term14181, term14181.getClass(), "keys", term14182);
        setField(term14181, term14181.getClass(), "values", term14183);
        setField(term14181, term14181.getClass(), "states", term14184);
        setDoubleField(term14181, term14181.getClass(), "missingEntries", 0.0);
        setIntField(term14181, term14181.getClass(), "size", 0);
        setIntField(term14181, term14181.getClass(), "mask", 31);
        setIntField(term14181, term14181.getClass(), "count", 0);
        setField(term14180, term14180.getClass(), "entries", term14181);
        setIntField(term14180, term14180.getClass(), "virtualSize", 1227103734);
        setDoubleField(term14180, term14180.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term262;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14175));
        assertTrue(recursiveEquals(term262, term14180));
    }

};


