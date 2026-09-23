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
import static org.apache.commons.math.linear.EqualityUtils.*;
import java.lang.Object;
import java.lang.Double;

public class OpenMapRealMatrix_getRowDimension_47603499227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2652;
     Object term13181;

    public OpenMapRealMatrix_getRowDimension_47603499227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2652 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term2655 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term2656 = (int[]) newIntArray(32);
        double[] term2689 = (double[]) newDoubleArray(32);
        byte[] term2722 = (byte[]) newByteArray(32);
        setIntField(term2652, term2652.getClass(), "rows", 493620644);
        setIntField(term2652, term2652.getClass(), "columns", 1328271830);
        setField(term2655, term2655.getClass(), "keys", term2656);
        setField(term2655, term2655.getClass(), "values", term2689);
        setField(term2655, term2655.getClass(), "states", term2722);
        setDoubleField(term2655, term2655.getClass(), "missingEntries", Double.NaN);
        setIntField(term2655, term2655.getClass(), "size", 1596070772);
        setIntField(term2655, term2655.getClass(), "mask", 31);
        setIntField(term2655, term2655.getClass(), "count", 97029295);
        setField(term2652, term2652.getClass(), "entries", term2655);
        term13181 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term13182 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term13183 = (int[]) newIntArray(32);
        double[] term13184 = (double[]) newDoubleArray(32);
        byte[] term13185 = (byte[]) newByteArray(32);
        setIntField(term13181, term13181.getClass(), "rows", 493620644);
        setIntField(term13181, term13181.getClass(), "columns", 1328271830);
        setField(term13182, term13182.getClass(), "keys", term13183);
        setField(term13182, term13182.getClass(), "values", term13184);
        setField(term13182, term13182.getClass(), "states", term13185);
        setDoubleField(term13182, term13182.getClass(), "missingEntries", Double.NaN);
        setIntField(term13182, term13182.getClass(), "size", 1596070772);
        setIntField(term13182, term13182.getClass(), "mask", 31);
        setIntField(term13182, term13182.getClass(), "count", 97029295);
        setField(term13181, term13181.getClass(), "entries", term13182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRowDimension", argTypes, term2652, args);
        assertTrue(recursiveEquals(term2652, term13181));
        assertTrue(recursiveEquals(retValue, 493620644));
    }

};


