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

public class OpenMapRealVector_append_517582264174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177330;
     Object term177540;

    public OpenMapRealVector_append_517582264174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177330 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term177438 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term176773 = (int[]) newIntArray(0);
        setIntField(term177330, term177330.getClass(), "virtualSize", 0);
        setField(term177438, term177438.getClass(), "keys", term176773);
        setField(term177438, term177438.getClass(), "values", null);
        setField(term177438, term177438.getClass(), "states", null);
        setDoubleField(term177438, term177438.getClass(), "missingEntries", 0.0);
        setIntField(term177438, term177438.getClass(), "size", 0);
        setIntField(term177438, term177438.getClass(), "mask", 0);
        setIntField(term177438, term177438.getClass(), "count", 0);
        setField(term177330, term177330.getClass(), "entries", term177438);
        setDoubleField(term177330, term177330.getClass(), "epsilon", 0.0);
        term177540 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term177648 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term176789 = (byte[]) newByteArray(16);
        setIntField(term177540, term177540.getClass(), "virtualSize", 0);
        setIntField(term177648, term177648.getClass(), "count", 0);
        setByteElement(term176789, 0, (byte) -128);
        setByteElement(term176789, 1, (byte) -128);
        setByteElement(term176789, 2, (byte) -128);
        setByteElement(term176789, 3, (byte) -128);
        setByteElement(term176789, 4, (byte) -128);
        setByteElement(term176789, 5, (byte) -128);
        setByteElement(term176789, 6, (byte) -128);
        setByteElement(term176789, 7, (byte) -128);
        setByteElement(term176789, 8, (byte) -128);
        setByteElement(term176789, 9, (byte) -128);
        setByteElement(term176789, 10, (byte) -128);
        setByteElement(term176789, 11, (byte) -128);
        setByteElement(term176789, 12, (byte) -128);
        setByteElement(term176789, 13, (byte) -128);
        setByteElement(term176789, 14, (byte) -128);
        setByteElement(term176789, 15, (byte) -128);
        setField(term177648, term177648.getClass(), "states", term176789);
        setField(term177540, term177540.getClass(), "entries", term177648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term177540;
        callMethod(klass, "append", argTypes, term177330, args);
    }

};


