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

public class OpenMapRealVector_equals_111460338659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11543;
     Object term11650;

    public OpenMapRealVector_equals_111460338659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11543 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term11544 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term11545 = (int[]) newIntArray(32);
        double[] term11578 = (double[]) newDoubleArray(32);
        byte[] term11611 = (byte[]) newByteArray(32);
        setField(term11544, term11544.getClass(), "keys", term11545);
        setField(term11544, term11544.getClass(), "values", term11578);
        setField(term11544, term11544.getClass(), "states", term11611);
        setDoubleField(term11544, term11544.getClass(), "missingEntries", 0.0);
        setIntField(term11544, term11544.getClass(), "size", 0);
        setIntField(term11544, term11544.getClass(), "mask", 31);
        setIntField(term11544, term11544.getClass(), "count", 0);
        setField(term11543, term11543.getClass(), "entries", term11544);
        setIntField(term11543, term11543.getClass(), "virtualSize", 933028652);
        setDoubleField(term11543, term11543.getClass(), "epsilon", 1.0E-12);
        term11650 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term11650;
        callMethod(klass, "equals", argTypes, term11543, args);
    }

};


