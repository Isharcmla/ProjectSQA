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

public class OpenMapRealVector_getEntry_141731667794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5582;
     Object term5689;

    public OpenMapRealVector_getEntry_141731667794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5582 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term5583 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term5584 = (int[]) newIntArray(32);
        double[] term5617 = (double[]) newDoubleArray(32);
        byte[] term5650 = (byte[]) newByteArray(32);
        setField(term5583, term5583.getClass(), "keys", term5584);
        setField(term5583, term5583.getClass(), "values", term5617);
        setField(term5583, term5583.getClass(), "states", term5650);
        setDoubleField(term5583, term5583.getClass(), "missingEntries", 0.0);
        setIntField(term5583, term5583.getClass(), "size", 0);
        setIntField(term5583, term5583.getClass(), "mask", 31);
        setIntField(term5583, term5583.getClass(), "count", 0);
        setField(term5582, term5582.getClass(), "entries", term5583);
        setIntField(term5582, term5582.getClass(), "virtualSize", -1530420153);
        setDoubleField(term5582, term5582.getClass(), "epsilon", 1.0E-12);
        term5689 = new Integer(-469968304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5689;
        try {
            callMethod(klass, "getEntry", argTypes, term5582, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


