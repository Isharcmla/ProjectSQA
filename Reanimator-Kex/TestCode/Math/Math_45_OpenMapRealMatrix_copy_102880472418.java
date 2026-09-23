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

public class OpenMapRealMatrix_copy_102880472418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208;
     Object term5207;
     Object term4785;

    public OpenMapRealMatrix_copy_102880472418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term211 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term212 = (int[]) newIntArray(32);
        double[] term245 = (double[]) newDoubleArray(32);
        byte[] term278 = (byte[]) newByteArray(32);
        setIntField(term208, term208.getClass(), "rows", -1955890973);
        setIntField(term208, term208.getClass(), "columns", -2038273078);
        setField(term211, term211.getClass(), "keys", term212);
        setField(term211, term211.getClass(), "values", term245);
        setField(term211, term211.getClass(), "states", term278);
        setDoubleField(term211, term211.getClass(), "missingEntries", Double.NaN);
        setIntField(term211, term211.getClass(), "size", 1227103734);
        setIntField(term211, term211.getClass(), "mask", 31);
        setIntField(term211, term211.getClass(), "count", -1339778481);
        setField(term208, term208.getClass(), "entries", term211);
        term5207 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term5208 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term5209 = (int[]) newIntArray(32);
        double[] term5210 = (double[]) newDoubleArray(32);
        byte[] term5211 = (byte[]) newByteArray(32);
        setIntField(term5207, term5207.getClass(), "rows", -1955890973);
        setIntField(term5207, term5207.getClass(), "columns", -2038273078);
        setField(term5208, term5208.getClass(), "keys", term5209);
        setField(term5208, term5208.getClass(), "values", term5210);
        setField(term5208, term5208.getClass(), "states", term5211);
        setDoubleField(term5208, term5208.getClass(), "missingEntries", Double.NaN);
        setIntField(term5208, term5208.getClass(), "size", 1227103734);
        setIntField(term5208, term5208.getClass(), "mask", 31);
        setIntField(term5208, term5208.getClass(), "count", -1339778481);
        setField(term5207, term5207.getClass(), "entries", term5208);
        term4785 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term4788 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term4789 = (int[]) newIntArray(32);
        double[] term4822 = (double[]) newDoubleArray(32);
        byte[] term4855 = (byte[]) newByteArray(32);
        setIntField(term4785, term4785.getClass(), "rows", -1955890973);
        setIntField(term4785, term4785.getClass(), "columns", -2038273078);
        setField(term4788, term4788.getClass(), "keys", term4789);
        setField(term4788, term4788.getClass(), "values", term4822);
        setField(term4788, term4788.getClass(), "states", term4855);
        setDoubleField(term4788, term4788.getClass(), "missingEntries", Double.NaN);
        setIntField(term4788, term4788.getClass(), "size", 1227103734);
        setIntField(term4788, term4788.getClass(), "mask", 31);
        setIntField(term4788, term4788.getClass(), "count", -1339778481);
        setField(term4785, term4785.getClass(), "entries", term4788);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "copy", argTypes, term208, args);
        assertTrue(recursiveEquals(term208, term5207));
        assertTrue(recursiveEquals(retValue, term4785));
    }

};


