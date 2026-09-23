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

public class OpenMapRealVector_append_6132433793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82238;
     Object term82452;

    public OpenMapRealVector_append_6132433793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82238 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term82348 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term81229 = (int[]) newIntArray(0);
        setIntField(term82238, term82238.getClass(), "virtualSize", 0);
        setField(term82348, term82348.getClass(), "keys", term81229);
        setField(term82348, term82348.getClass(), "values", null);
        setField(term82348, term82348.getClass(), "states", null);
        setDoubleField(term82348, term82348.getClass(), "missingEntries", 0.0);
        setIntField(term82348, term82348.getClass(), "size", 0);
        setIntField(term82348, term82348.getClass(), "mask", 0);
        setIntField(term82348, term82348.getClass(), "count", 0);
        setField(term82238, term82238.getClass(), "entries", term82348);
        setDoubleField(term82238, term82238.getClass(), "epsilon", 0.0);
        term82452 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term82562 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] term81245 = (byte[]) newByteArray(25);
        setIntField(term82452, term82452.getClass(), "virtualSize", 0);
        setIntField(term82562, term82562.getClass(), "count", 0);
        setByteElement(term81245, 0, (byte) -128);
        setByteElement(term81245, 1, (byte) -128);
        setByteElement(term81245, 2, (byte) -128);
        setByteElement(term81245, 3, (byte) -128);
        setByteElement(term81245, 4, (byte) -128);
        setByteElement(term81245, 5, (byte) -128);
        setByteElement(term81245, 6, (byte) -128);
        setByteElement(term81245, 7, (byte) -128);
        setByteElement(term81245, 8, (byte) -128);
        setByteElement(term81245, 9, (byte) -128);
        setByteElement(term81245, 10, (byte) -128);
        setByteElement(term81245, 11, (byte) -128);
        setByteElement(term81245, 12, (byte) -128);
        setByteElement(term81245, 13, (byte) -128);
        setByteElement(term81245, 14, (byte) -128);
        setByteElement(term81245, 15, (byte) -128);
        setByteElement(term81245, 16, (byte) -128);
        setByteElement(term81245, 17, (byte) -128);
        setByteElement(term81245, 18, (byte) -128);
        setByteElement(term81245, 19, (byte) -128);
        setByteElement(term81245, 20, (byte) -128);
        setByteElement(term81245, 21, (byte) -128);
        setByteElement(term81245, 22, (byte) -128);
        setByteElement(term81245, 23, (byte) -128);
        setByteElement(term81245, 24, (byte) -128);
        setField(term82562, term82562.getClass(), "states", term81245);
        setField(term82452, term82452.getClass(), "entries", term82562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term82452;
        callMethod(klass, "append", argTypes, term82238, args);
    }

};


