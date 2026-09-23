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

public class OpenMapRealVector_init_7304252971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262;
     Object term16502;
     Object term16507;

    public OpenMapRealVector_init_7304252971() {
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
        term16502 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term16503 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term16504 = (int[]) newIntArray(32);
        double[] term16505 = (double[]) newDoubleArray(32);
        byte[] term16506 = (byte[]) newByteArray(32);
        setField(term16503, term16503.getClass(), "keys", term16504);
        setField(term16503, term16503.getClass(), "values", term16505);
        setField(term16503, term16503.getClass(), "states", term16506);
        setDoubleField(term16503, term16503.getClass(), "missingEntries", 0.0);
        setIntField(term16503, term16503.getClass(), "size", 0);
        setIntField(term16503, term16503.getClass(), "mask", 31);
        setIntField(term16503, term16503.getClass(), "count", 0);
        setField(term16502, term16502.getClass(), "entries", term16503);
        setIntField(term16502, term16502.getClass(), "virtualSize", 1227103734);
        setDoubleField(term16502, term16502.getClass(), "epsilon", 1.0E-12);
        term16507 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term16508 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term16509 = (int[]) newIntArray(32);
        double[] term16510 = (double[]) newDoubleArray(32);
        byte[] term16511 = (byte[]) newByteArray(32);
        setField(term16508, term16508.getClass(), "keys", term16509);
        setField(term16508, term16508.getClass(), "values", term16510);
        setField(term16508, term16508.getClass(), "states", term16511);
        setDoubleField(term16508, term16508.getClass(), "missingEntries", 0.0);
        setIntField(term16508, term16508.getClass(), "size", 0);
        setIntField(term16508, term16508.getClass(), "mask", 31);
        setIntField(term16508, term16508.getClass(), "count", 0);
        setField(term16507, term16507.getClass(), "entries", term16508);
        setIntField(term16507, term16507.getClass(), "virtualSize", 1227103734);
        setDoubleField(term16507, term16507.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term262;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16502));
        assertTrue(recursiveEquals(term262, term16507));
    }

};


