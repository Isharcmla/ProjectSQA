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

public class OpenMapRealVector_getLInfDistance_42518087840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7426;
     Object term7533;

    public OpenMapRealVector_getLInfDistance_42518087840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7426 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term7427 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term7428 = (int[]) newIntArray(32);
        double[] term7461 = (double[]) newDoubleArray(32);
        byte[] term7494 = (byte[]) newByteArray(32);
        setField(term7427, term7427.getClass(), "keys", term7428);
        setField(term7427, term7427.getClass(), "values", term7461);
        setField(term7427, term7427.getClass(), "states", term7494);
        setDoubleField(term7427, term7427.getClass(), "missingEntries", 0.0);
        setIntField(term7427, term7427.getClass(), "size", 0);
        setIntField(term7427, term7427.getClass(), "mask", 31);
        setIntField(term7427, term7427.getClass(), "count", 0);
        setField(term7426, term7426.getClass(), "entries", term7427);
        setIntField(term7426, term7426.getClass(), "virtualSize", -1016503459);
        setDoubleField(term7426, term7426.getClass(), "epsilon", 1.0E-12);
        term7533 = (double[]) newDoubleArray(1);
        setDoubleElement(term7533, 0, 0.07802449704920456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term7533;
        callMethod(klass, "getLInfDistance", argTypes, term7426, args);
    }

};


