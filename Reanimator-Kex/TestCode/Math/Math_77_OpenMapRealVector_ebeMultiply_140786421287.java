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
import java.lang.NullPointerException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OpenMapRealVector_ebeMultiply_140786421287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3733;

    public OpenMapRealVector_ebeMultiply_140786421287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3733 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term3734 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term3735 = (int[]) newIntArray(32);
        double[] term3768 = (double[]) newDoubleArray(32);
        byte[] term3801 = (byte[]) newByteArray(32);
        setField(term3734, term3734.getClass(), "keys", term3735);
        setField(term3734, term3734.getClass(), "values", term3768);
        setField(term3734, term3734.getClass(), "states", term3801);
        setDoubleField(term3734, term3734.getClass(), "missingEntries", 0.0);
        setIntField(term3734, term3734.getClass(), "size", 0);
        setIntField(term3734, term3734.getClass(), "mask", 31);
        setIntField(term3734, term3734.getClass(), "count", 0);
        setField(term3733, term3733.getClass(), "entries", term3734);
        setIntField(term3733, term3733.getClass(), "virtualSize", 1135664017);
        setDoubleField(term3733, term3733.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "ebeMultiply", argTypes, term3733, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


