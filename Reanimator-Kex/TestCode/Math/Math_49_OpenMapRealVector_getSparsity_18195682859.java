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

public class OpenMapRealVector_getSparsity_18195682859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11544;

    public OpenMapRealVector_getSparsity_18195682859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11544 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term11545 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term11546 = (int[]) newIntArray(32);
        double[] term11579 = (double[]) newDoubleArray(32);
        byte[] term11612 = (byte[]) newByteArray(32);
        setField(term11545, term11545.getClass(), "keys", term11546);
        setField(term11545, term11545.getClass(), "values", term11579);
        setField(term11545, term11545.getClass(), "states", term11612);
        setDoubleField(term11545, term11545.getClass(), "missingEntries", 0.0);
        setIntField(term11545, term11545.getClass(), "size", 0);
        setIntField(term11545, term11545.getClass(), "mask", 31);
        setIntField(term11545, term11545.getClass(), "count", 0);
        setField(term11544, term11544.getClass(), "entries", term11545);
        setIntField(term11544, term11544.getClass(), "virtualSize", 933028652);
        setDoubleField(term11544, term11544.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSparsity", argTypes, term11544, args);
    }

};


