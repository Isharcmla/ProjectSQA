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
import java.lang.Double;

public class OpenMapRealMatrix_multiply_32050171625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2039;
     Object term2146;

    public OpenMapRealMatrix_multiply_32050171625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2039 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term2042 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term2043 = (int[]) newIntArray(32);
        double[] term2076 = (double[]) newDoubleArray(32);
        byte[] term2109 = (byte[]) newByteArray(32);
        setIntField(term2039, term2039.getClass(), "rows", 1876565163);
        setIntField(term2039, term2039.getClass(), "columns", -817164822);
        setField(term2042, term2042.getClass(), "keys", term2043);
        setField(term2042, term2042.getClass(), "values", term2076);
        setField(term2042, term2042.getClass(), "states", term2109);
        setDoubleField(term2042, term2042.getClass(), "missingEntries", Double.NaN);
        setIntField(term2042, term2042.getClass(), "size", -1016503459);
        setIntField(term2042, term2042.getClass(), "mask", 31);
        setIntField(term2042, term2042.getClass(), "count", -1968847291);
        setField(term2039, term2039.getClass(), "entries", term2042);
        term2146 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term2149 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term2150 = (int[]) newIntArray(32);
        double[] term2183 = (double[]) newDoubleArray(32);
        byte[] term2216 = (byte[]) newByteArray(32);
        setIntField(term2146, term2146.getClass(), "rows", 579005622);
        setIntField(term2146, term2146.getClass(), "columns", -14890619);
        setField(term2149, term2149.getClass(), "keys", term2150);
        setField(term2149, term2149.getClass(), "values", term2183);
        setField(term2149, term2149.getClass(), "states", term2216);
        setDoubleField(term2149, term2149.getClass(), "missingEntries", Double.NaN);
        setIntField(term2149, term2149.getClass(), "size", 1632125673);
        setIntField(term2149, term2149.getClass(), "mask", 31);
        setIntField(term2149, term2149.getClass(), "count", 454281060);
        setField(term2146, term2146.getClass(), "entries", term2149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Object[] args = new Object[1];
        args[0] = term2146;
        try {
            callMethod(klass, "multiply", argTypes, term2039, args);
            assertTrue(false);
        }
        catch (DimensionMismatchException e) {
        }

    }

};


