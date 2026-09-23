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

public class OpenMapRealVector_append_517582264208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250154;
     Object term250364;

    public OpenMapRealVector_append_517582264208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250154 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term250262 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term249147 = (int[]) newIntArray(0);
        setIntField(term250154, term250154.getClass(), "virtualSize", 0);
        setField(term250262, term250262.getClass(), "keys", term249147);
        setField(term250262, term250262.getClass(), "values", null);
        setField(term250262, term250262.getClass(), "states", null);
        setDoubleField(term250262, term250262.getClass(), "missingEntries", 0.0);
        setIntField(term250262, term250262.getClass(), "size", 0);
        setIntField(term250262, term250262.getClass(), "mask", 0);
        setIntField(term250262, term250262.getClass(), "count", 0);
        setField(term250154, term250154.getClass(), "entries", term250262);
        setDoubleField(term250154, term250154.getClass(), "epsilon", 0.0);
        term250364 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term250472 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term249163 = (byte[]) newByteArray(25);
        setIntField(term250364, term250364.getClass(), "virtualSize", 0);
        setIntField(term250472, term250472.getClass(), "count", 0);
        setByteElement(term249163, 0, (byte) -128);
        setByteElement(term249163, 1, (byte) -128);
        setByteElement(term249163, 2, (byte) -128);
        setByteElement(term249163, 3, (byte) -128);
        setByteElement(term249163, 4, (byte) -128);
        setByteElement(term249163, 5, (byte) -128);
        setByteElement(term249163, 6, (byte) -128);
        setByteElement(term249163, 7, (byte) -128);
        setByteElement(term249163, 8, (byte) -128);
        setByteElement(term249163, 9, (byte) -128);
        setByteElement(term249163, 10, (byte) -128);
        setByteElement(term249163, 11, (byte) -128);
        setByteElement(term249163, 12, (byte) -128);
        setByteElement(term249163, 13, (byte) -128);
        setByteElement(term249163, 14, (byte) -128);
        setByteElement(term249163, 15, (byte) -128);
        setByteElement(term249163, 16, (byte) -128);
        setByteElement(term249163, 17, (byte) -128);
        setByteElement(term249163, 18, (byte) -128);
        setByteElement(term249163, 19, (byte) -128);
        setByteElement(term249163, 20, (byte) -128);
        setByteElement(term249163, 21, (byte) -128);
        setByteElement(term249163, 22, (byte) -128);
        setByteElement(term249163, 23, (byte) -128);
        setByteElement(term249163, 24, (byte) -128);
        setField(term250472, term250472.getClass(), "states", term249163);
        setField(term250364, term250364.getClass(), "entries", term250472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term250364;
        callMethod(klass, "append", argTypes, term250154, args);
    }

};


