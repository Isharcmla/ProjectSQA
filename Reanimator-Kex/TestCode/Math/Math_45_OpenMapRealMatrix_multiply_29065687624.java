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
import java.lang.Double;

public class OpenMapRealMatrix_multiply_29065687624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1836;

    public OpenMapRealMatrix_multiply_29065687624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1836 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term1839 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term1840 = (int[]) newIntArray(32);
        double[] term1873 = (double[]) newDoubleArray(32);
        byte[] term1906 = (byte[]) newByteArray(32);
        setIntField(term1836, term1836.getClass(), "rows", 1962444399);
        setIntField(term1836, term1836.getClass(), "columns", 767834723);
        setField(term1839, term1839.getClass(), "keys", term1840);
        setField(term1839, term1839.getClass(), "values", term1873);
        setField(term1839, term1839.getClass(), "states", term1906);
        setDoubleField(term1839, term1839.getClass(), "missingEntries", Double.NaN);
        setIntField(term1839, term1839.getClass(), "size", -602026508);
        setIntField(term1839, term1839.getClass(), "mask", 31);
        setIntField(term1839, term1839.getClass(), "count", -157887805);
        setField(term1836, term1836.getClass(), "entries", term1839);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "multiply", argTypes, term1836, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


