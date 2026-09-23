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

public class OpenMapRealVector_append_517582264183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186014;
     Object term186224;

    public OpenMapRealVector_append_517582264183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186014 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term186122 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term185079 = (int[]) newIntArray(12);
        setIntField(term186014, term186014.getClass(), "virtualSize", 0);
        setField(term186122, term186122.getClass(), "keys", term185079);
        setField(term186122, term186122.getClass(), "values", null);
        setField(term186122, term186122.getClass(), "states", null);
        setDoubleField(term186122, term186122.getClass(), "missingEntries", 0.0);
        setIntField(term186122, term186122.getClass(), "size", 0);
        setIntField(term186122, term186122.getClass(), "mask", 0);
        setIntField(term186122, term186122.getClass(), "count", 0);
        setField(term186014, term186014.getClass(), "entries", term186122);
        setDoubleField(term186014, term186014.getClass(), "epsilon", 0.0);
        term186224 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term186332 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term185191 = (byte[]) newByteArray(22);
        setIntField(term186224, term186224.getClass(), "virtualSize", 0);
        setIntField(term186332, term186332.getClass(), "count", 0);
        setByteElement(term185191, 0, (byte) -128);
        setByteElement(term185191, 1, (byte) -128);
        setByteElement(term185191, 2, (byte) -128);
        setByteElement(term185191, 3, (byte) -128);
        setByteElement(term185191, 4, (byte) -128);
        setByteElement(term185191, 5, (byte) -128);
        setByteElement(term185191, 6, (byte) -128);
        setByteElement(term185191, 7, (byte) -128);
        setByteElement(term185191, 8, (byte) -128);
        setByteElement(term185191, 9, (byte) -128);
        setByteElement(term185191, 10, (byte) -128);
        setByteElement(term185191, 11, (byte) -128);
        setByteElement(term185191, 12, (byte) -128);
        setByteElement(term185191, 13, (byte) -128);
        setByteElement(term185191, 14, (byte) -128);
        setByteElement(term185191, 15, (byte) -128);
        setByteElement(term185191, 16, (byte) -128);
        setByteElement(term185191, 17, (byte) -128);
        setByteElement(term185191, 18, (byte) -128);
        setByteElement(term185191, 19, (byte) -128);
        setByteElement(term185191, 20, (byte) -128);
        setByteElement(term185191, 21, (byte) -128);
        setField(term186332, term186332.getClass(), "states", term185191);
        setField(term186224, term186224.getClass(), "entries", term186332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term186224;
        callMethod(klass, "append", argTypes, term186014, args);
    }

};


