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
import org.apache.commons.math.linear.MatrixDimensionMismatchException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class OpenMapRealMatrix_add_85192727921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term821;
     Object term928;

    public OpenMapRealMatrix_add_85192727921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term821 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term824 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term825 = (int[]) newIntArray(32);
        double[] term858 = (double[]) newDoubleArray(32);
        byte[] term891 = (byte[]) newByteArray(32);
        setIntField(term821, term821.getClass(), "rows", -655067527);
        setIntField(term821, term821.getClass(), "columns", -6029667);
        setField(term824, term824.getClass(), "keys", term825);
        setField(term824, term824.getClass(), "values", term858);
        setField(term824, term824.getClass(), "states", term891);
        setDoubleField(term824, term824.getClass(), "missingEntries", Double.NaN);
        setIntField(term824, term824.getClass(), "size", -2068769794);
        setIntField(term824, term824.getClass(), "mask", 31);
        setIntField(term824, term824.getClass(), "count", -117576464);
        setField(term821, term821.getClass(), "entries", term824);
        term928 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term931 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term932 = (int[]) newIntArray(32);
        double[] term965 = (double[]) newDoubleArray(32);
        byte[] term998 = (byte[]) newByteArray(32);
        setIntField(term928, term928.getClass(), "rows", -1007160944);
        setIntField(term928, term928.getClass(), "columns", 1135664017);
        setField(term931, term931.getClass(), "keys", term932);
        setField(term931, term931.getClass(), "values", term965);
        setField(term931, term931.getClass(), "states", term998);
        setDoubleField(term931, term931.getClass(), "missingEntries", Double.NaN);
        setIntField(term931, term931.getClass(), "size", 590364439);
        setIntField(term931, term931.getClass(), "mask", 31);
        setIntField(term931, term931.getClass(), "count", 865208305);
        setField(term928, term928.getClass(), "entries", term931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Object[] args = new Object[1];
        args[0] = term928;
        try {
            callMethod(klass, "add", argTypes, term821, args);
            assertTrue(false);
        }
        catch (MatrixDimensionMismatchException e) {
        }

    }

};


