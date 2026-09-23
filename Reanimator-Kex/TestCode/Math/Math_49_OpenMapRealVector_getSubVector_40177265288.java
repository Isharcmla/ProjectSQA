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
import org.apache.commons.math.exception.OutOfRangeException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class OpenMapRealVector_getSubVector_40177265288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4144;
     Object term4251;
     Object term4253;

    public OpenMapRealVector_getSubVector_40177265288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4144 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term4145 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term4146 = (int[]) newIntArray(32);
        double[] term4179 = (double[]) newDoubleArray(32);
        byte[] term4212 = (byte[]) newByteArray(32);
        setField(term4145, term4145.getClass(), "keys", term4146);
        setField(term4145, term4145.getClass(), "values", term4179);
        setField(term4145, term4145.getClass(), "states", term4212);
        setDoubleField(term4145, term4145.getClass(), "missingEntries", 0.0);
        setIntField(term4145, term4145.getClass(), "size", 0);
        setIntField(term4145, term4145.getClass(), "mask", 31);
        setIntField(term4145, term4145.getClass(), "count", 0);
        setField(term4144, term4144.getClass(), "entries", term4145);
        setIntField(term4144, term4144.getClass(), "virtualSize", 865208305);
        setDoubleField(term4144, term4144.getClass(), "epsilon", 1.0E-12);
        term4251 = new Integer(-1275173084);
        term4253 = new Integer(-244121226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4251;
        args[1] = term4253;
        try {
            callMethod(klass, "getSubVector", argTypes, term4144, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


