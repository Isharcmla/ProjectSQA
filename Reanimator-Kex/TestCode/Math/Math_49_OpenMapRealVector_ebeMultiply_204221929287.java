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
import org.apache.commons.math.exception.DimensionMismatchException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OpenMapRealVector_ebeMultiply_204221929287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3936;
     Object term4043;

    public OpenMapRealVector_ebeMultiply_204221929287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3936 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term3937 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term3938 = (int[]) newIntArray(32);
        double[] term3971 = (double[]) newDoubleArray(32);
        byte[] term4004 = (byte[]) newByteArray(32);
        setField(term3937, term3937.getClass(), "keys", term3938);
        setField(term3937, term3937.getClass(), "values", term3971);
        setField(term3937, term3937.getClass(), "states", term4004);
        setDoubleField(term3937, term3937.getClass(), "missingEntries", 0.0);
        setIntField(term3937, term3937.getClass(), "size", 0);
        setIntField(term3937, term3937.getClass(), "mask", 31);
        setIntField(term3937, term3937.getClass(), "count", 0);
        setField(term3936, term3936.getClass(), "entries", term3937);
        setIntField(term3936, term3936.getClass(), "virtualSize", 590364439);
        setDoubleField(term3936, term3936.getClass(), "epsilon", 1.0E-12);
        term4043 = (double[]) newDoubleArray(2);
        setDoubleElement(term4043, 0, 0.43692187681405226);
        setDoubleElement(term4043, 1, 0.7633268466829064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4043;
        try {
            callMethod(klass, "ebeMultiply", argTypes, term3936, args);
            assertTrue(false);
        }
        catch (DimensionMismatchException e) {
        }

    }

};


