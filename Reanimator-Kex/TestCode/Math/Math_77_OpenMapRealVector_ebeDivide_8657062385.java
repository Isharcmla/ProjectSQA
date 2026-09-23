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

public class OpenMapRealVector_ebeDivide_8657062385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3314;

    public OpenMapRealVector_ebeDivide_8657062385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3314 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term3315 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term3316 = (int[]) newIntArray(32);
        double[] term3349 = (double[]) newDoubleArray(32);
        byte[] term3382 = (byte[]) newByteArray(32);
        setField(term3315, term3315.getClass(), "keys", term3316);
        setField(term3315, term3315.getClass(), "values", term3349);
        setField(term3315, term3315.getClass(), "states", term3382);
        setDoubleField(term3315, term3315.getClass(), "missingEntries", 0.0);
        setIntField(term3315, term3315.getClass(), "size", 0);
        setIntField(term3315, term3315.getClass(), "mask", 31);
        setIntField(term3315, term3315.getClass(), "count", 0);
        setField(term3314, term3314.getClass(), "entries", term3315);
        setIntField(term3314, term3314.getClass(), "virtualSize", -117576464);
        setDoubleField(term3314, term3314.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "ebeDivide", argTypes, term3314, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


