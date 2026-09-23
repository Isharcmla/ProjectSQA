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

public class OpenMapRealVector_getLInfDistance_101367443482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5753;

    public OpenMapRealVector_getLInfDistance_101367443482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5753 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term5754 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term5755 = (int[]) newIntArray(32);
        double[] term5788 = (double[]) newDoubleArray(32);
        byte[] term5821 = (byte[]) newByteArray(32);
        setField(term5754, term5754.getClass(), "keys", term5755);
        setField(term5754, term5754.getClass(), "values", term5788);
        setField(term5754, term5754.getClass(), "states", term5821);
        setDoubleField(term5754, term5754.getClass(), "missingEntries", 0.0);
        setIntField(term5754, term5754.getClass(), "size", 0);
        setIntField(term5754, term5754.getClass(), "mask", 31);
        setIntField(term5754, term5754.getClass(), "count", 0);
        setField(term5753, term5753.getClass(), "entries", term5754);
        setIntField(term5753, term5753.getClass(), "virtualSize", -1145578966);
        setDoubleField(term5753, term5753.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getLInfDistance", argTypes, term5753, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


