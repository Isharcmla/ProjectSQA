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
import java.lang.Object;

public class OpenMapRealVector_append_517582264137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136249;
     Object term136459;

    public OpenMapRealVector_append_517582264137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136249 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term136357 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term115836 = (int[]) newIntArray(716);
        setIntField(term136249, term136249.getClass(), "virtualSize", 0);
        setField(term136357, term136357.getClass(), "keys", term115836);
        setField(term136357, term136357.getClass(), "values", null);
        setField(term136357, term136357.getClass(), "states", null);
        setDoubleField(term136357, term136357.getClass(), "missingEntries", 0.0);
        setIntField(term136357, term136357.getClass(), "size", 0);
        setIntField(term136357, term136357.getClass(), "mask", 0);
        setIntField(term136357, term136357.getClass(), "count", 0);
        setField(term136249, term136249.getClass(), "entries", term136357);
        setDoubleField(term136249, term136249.getClass(), "epsilon", 0.0);
        term136459 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term136567 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term121580 = (byte[]) newByteArray(511);
        setIntField(term136459, term136459.getClass(), "virtualSize", 0);
        setIntField(term136567, term136567.getClass(), "count", 0);
        setByteElement(term121580, 0, (byte) -128);
        setByteElement(term121580, 1, (byte) -128);
        setByteElement(term121580, 2, (byte) -128);
        setByteElement(term121580, 3, (byte) -128);
        setByteElement(term121580, 4, (byte) -128);
        setByteElement(term121580, 5, (byte) -128);
        setByteElement(term121580, 6, (byte) -128);
        setByteElement(term121580, 7, (byte) -128);
        setByteElement(term121580, 8, (byte) -128);
        setByteElement(term121580, 9, (byte) -128);
        setByteElement(term121580, 10, (byte) -128);
        setByteElement(term121580, 11, (byte) -128);
        setByteElement(term121580, 12, (byte) -128);
        setByteElement(term121580, 13, (byte) -128);
        setByteElement(term121580, 14, (byte) -128);
        setByteElement(term121580, 15, (byte) -128);
        setByteElement(term121580, 16, (byte) -128);
        setByteElement(term121580, 17, (byte) -128);
        setByteElement(term121580, 18, (byte) -128);
        setByteElement(term121580, 19, (byte) -128);
        setByteElement(term121580, 20, (byte) -128);
        setByteElement(term121580, 21, (byte) -128);
        setByteElement(term121580, 22, (byte) -128);
        setByteElement(term121580, 23, (byte) -128);
        setByteElement(term121580, 24, (byte) -128);
        setByteElement(term121580, 25, (byte) -128);
        setByteElement(term121580, 26, (byte) -128);
        setByteElement(term121580, 27, (byte) 1);
        setField(term136567, term136567.getClass(), "states", term121580);
        setField(term136459, term136459.getClass(), "entries", term136567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term136459;
        callMethod(klass, "append", argTypes, term136249, args);
    }

};


