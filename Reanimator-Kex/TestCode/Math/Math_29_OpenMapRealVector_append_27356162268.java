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
import org.apache.commons.math3.exception.OutOfRangeException;
import static org.apache.commons.math3.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class OpenMapRealVector_append_27356162268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2091;
     Object term2198;

    public OpenMapRealVector_append_27356162268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2091 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term2092 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term2093 = (int[]) newIntArray(32);
        double[] term2126 = (double[]) newDoubleArray(32);
        byte[] term2159 = (byte[]) newByteArray(32);
        setField(term2092, term2092.getClass(), "keys", term2093);
        setField(term2092, term2092.getClass(), "values", term2126);
        setField(term2092, term2092.getClass(), "states", term2159);
        setDoubleField(term2092, term2092.getClass(), "missingEntries", 0.0);
        setIntField(term2092, term2092.getClass(), "size", 0);
        setIntField(term2092, term2092.getClass(), "mask", 31);
        setIntField(term2092, term2092.getClass(), "count", 0);
        setField(term2091, term2091.getClass(), "entries", term2092);
        setIntField(term2091, term2091.getClass(), "virtualSize", -1456670397);
        setDoubleField(term2091, term2091.getClass(), "epsilon", 1.0E-12);
        term2198 = new Double(0.7031006357544823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term2198;
        try {
            callMethod(klass, "append", argTypes, term2091, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


