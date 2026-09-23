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
import java.lang.Object;

public class OpenMapRealVector_append_61324337104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138623;
     Object term138837;

    public OpenMapRealVector_append_61324337104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138623 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term138733 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term123447 = (int[]) newIntArray(0);
        setIntField(term138623, term138623.getClass(), "virtualSize", 0);
        setField(term138733, term138733.getClass(), "keys", term123447);
        setField(term138733, term138733.getClass(), "values", null);
        setField(term138733, term138733.getClass(), "states", null);
        setDoubleField(term138733, term138733.getClass(), "missingEntries", 0.0);
        setIntField(term138733, term138733.getClass(), "size", 0);
        setIntField(term138733, term138733.getClass(), "mask", 0);
        setIntField(term138733, term138733.getClass(), "count", 0);
        setField(term138623, term138623.getClass(), "entries", term138733);
        setDoubleField(term138623, term138623.getClass(), "epsilon", 0.0);
        term138837 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term138947 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] term123463 = (byte[]) newByteArray(510);
        setIntField(term138837, term138837.getClass(), "virtualSize", 0);
        setIntField(term138947, term138947.getClass(), "count", 0);
        setByteElement(term123463, 0, (byte) -128);
        setByteElement(term123463, 1, (byte) -128);
        setByteElement(term123463, 2, (byte) -128);
        setByteElement(term123463, 3, (byte) -128);
        setByteElement(term123463, 4, (byte) -128);
        setByteElement(term123463, 5, (byte) -128);
        setByteElement(term123463, 6, (byte) -128);
        setByteElement(term123463, 7, (byte) -128);
        setByteElement(term123463, 8, (byte) -128);
        setByteElement(term123463, 9, (byte) -128);
        setByteElement(term123463, 10, (byte) -128);
        setByteElement(term123463, 11, (byte) -128);
        setByteElement(term123463, 12, (byte) -128);
        setByteElement(term123463, 13, (byte) -128);
        setByteElement(term123463, 14, (byte) -128);
        setByteElement(term123463, 15, (byte) -128);
        setByteElement(term123463, 16, (byte) -128);
        setByteElement(term123463, 17, (byte) -128);
        setByteElement(term123463, 18, (byte) -128);
        setByteElement(term123463, 19, (byte) -128);
        setByteElement(term123463, 20, (byte) -128);
        setByteElement(term123463, 21, (byte) -128);
        setByteElement(term123463, 22, (byte) -128);
        setByteElement(term123463, 23, (byte) -128);
        setByteElement(term123463, 24, (byte) -128);
        setByteElement(term123463, 25, (byte) -128);
        setByteElement(term123463, 26, (byte) -128);
        setByteElement(term123463, 27, (byte) -128);
        setByteElement(term123463, 28, (byte) 1);
        setField(term138947, term138947.getClass(), "states", term123463);
        setField(term138837, term138837.getClass(), "entries", term138947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term138837;
        callMethod(klass, "append", argTypes, term138623, args);
    }

};


