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
import java.lang.NullPointerException;
import static org.apache.commons.math3.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OpenMapRealVector_ebeDivide_92946496872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3108;

    public OpenMapRealVector_ebeDivide_92946496872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3108 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term3109 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term3110 = (int[]) newIntArray(32);
        double[] term3143 = (double[]) newDoubleArray(32);
        byte[] term3176 = (byte[]) newByteArray(32);
        setField(term3109, term3109.getClass(), "keys", term3110);
        setField(term3109, term3109.getClass(), "values", term3143);
        setField(term3109, term3109.getClass(), "states", term3176);
        setDoubleField(term3109, term3109.getClass(), "missingEntries", 0.0);
        setIntField(term3109, term3109.getClass(), "size", 0);
        setIntField(term3109, term3109.getClass(), "mask", 31);
        setIntField(term3109, term3109.getClass(), "count", 0);
        setField(term3108, term3108.getClass(), "entries", term3109);
        setIntField(term3108, term3108.getClass(), "virtualSize", -2068769794);
        setDoubleField(term3108, term3108.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "ebeDivide", argTypes, term3108, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


