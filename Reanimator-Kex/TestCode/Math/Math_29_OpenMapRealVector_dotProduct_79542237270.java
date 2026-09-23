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
import org.apache.commons.math3.exception.DimensionMismatchException;
import static org.apache.commons.math3.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OpenMapRealVector_dotProduct_79542237270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2499;
     Object term2606;

    public OpenMapRealVector_dotProduct_79542237270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2499 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term2500 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term2501 = (int[]) newIntArray(32);
        double[] term2534 = (double[]) newDoubleArray(32);
        byte[] term2567 = (byte[]) newByteArray(32);
        setField(term2500, term2500.getClass(), "keys", term2501);
        setField(term2500, term2500.getClass(), "values", term2534);
        setField(term2500, term2500.getClass(), "states", term2567);
        setDoubleField(term2500, term2500.getClass(), "missingEntries", 0.0);
        setIntField(term2500, term2500.getClass(), "size", 0);
        setIntField(term2500, term2500.getClass(), "mask", 31);
        setIntField(term2500, term2500.getClass(), "count", 0);
        setField(term2499, term2499.getClass(), "entries", term2500);
        setIntField(term2499, term2499.getClass(), "virtualSize", 1048535127);
        setDoubleField(term2499, term2499.getClass(), "epsilon", 1.0E-12);
        term2606 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term2607 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term2608 = (int[]) newIntArray(32);
        double[] term2641 = (double[]) newDoubleArray(32);
        byte[] term2674 = (byte[]) newByteArray(32);
        setField(term2607, term2607.getClass(), "keys", term2608);
        setField(term2607, term2607.getClass(), "values", term2641);
        setField(term2607, term2607.getClass(), "states", term2674);
        setDoubleField(term2607, term2607.getClass(), "missingEntries", 0.0);
        setIntField(term2607, term2607.getClass(), "size", 0);
        setIntField(term2607, term2607.getClass(), "mask", 31);
        setIntField(term2607, term2607.getClass(), "count", 0);
        setField(term2606, term2606.getClass(), "entries", term2607);
        setIntField(term2606, term2606.getClass(), "virtualSize", -655067527);
        setDoubleField(term2606, term2606.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term2606;
        try {
            callMethod(klass, "dotProduct", argTypes, term2499, args);
            assertTrue(false);
        }
        catch (DimensionMismatchException e) {
        }

    }

};


