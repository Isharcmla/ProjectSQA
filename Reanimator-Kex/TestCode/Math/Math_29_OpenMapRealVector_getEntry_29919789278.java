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
import java.lang.Integer;

public class OpenMapRealVector_getEntry_29919789278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4533;
     Object term4640;

    public OpenMapRealVector_getEntry_29919789278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4533 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term4534 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term4535 = (int[]) newIntArray(32);
        double[] term4568 = (double[]) newDoubleArray(32);
        byte[] term4601 = (byte[]) newByteArray(32);
        setField(term4534, term4534.getClass(), "keys", term4535);
        setField(term4534, term4534.getClass(), "values", term4568);
        setField(term4534, term4534.getClass(), "states", term4601);
        setDoubleField(term4534, term4534.getClass(), "missingEntries", 0.0);
        setIntField(term4534, term4534.getClass(), "size", 0);
        setIntField(term4534, term4534.getClass(), "mask", 31);
        setIntField(term4534, term4534.getClass(), "count", 0);
        setField(term4533, term4533.getClass(), "entries", term4534);
        setIntField(term4533, term4533.getClass(), "virtualSize", -1179120542);
        setDoubleField(term4533, term4533.getClass(), "epsilon", 1.0E-12);
        term4640 = new Integer(-73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4640;
        try {
            callMethod(klass, "getEntry", argTypes, term4533, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


