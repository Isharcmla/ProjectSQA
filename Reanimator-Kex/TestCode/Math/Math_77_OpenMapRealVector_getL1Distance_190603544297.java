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

public class OpenMapRealVector_getL1Distance_190603544297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6193;

    public OpenMapRealVector_getL1Distance_190603544297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6193 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term6194 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term6195 = (int[]) newIntArray(32);
        double[] term6228 = (double[]) newDoubleArray(32);
        byte[] term6261 = (byte[]) newByteArray(32);
        setField(term6194, term6194.getClass(), "keys", term6195);
        setField(term6194, term6194.getClass(), "values", term6228);
        setField(term6194, term6194.getClass(), "states", term6261);
        setDoubleField(term6194, term6194.getClass(), "missingEntries", 0.0);
        setIntField(term6194, term6194.getClass(), "size", 0);
        setIntField(term6194, term6194.getClass(), "mask", 31);
        setIntField(term6194, term6194.getClass(), "count", 0);
        setField(term6193, term6193.getClass(), "entries", term6194);
        setIntField(term6193, term6193.getClass(), "virtualSize", 1962444399);
        setDoubleField(term6193, term6193.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getL1Distance", argTypes, term6193, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


