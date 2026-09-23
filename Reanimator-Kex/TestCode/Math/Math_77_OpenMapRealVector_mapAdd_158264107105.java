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

public class OpenMapRealVector_mapAdd_158264107105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8038;
     Object term8145;
     Object term94007;
     Object term93900;

    public OpenMapRealVector_mapAdd_158264107105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8038 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term8039 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term8040 = (int[]) newIntArray(32);
        double[] term8073 = (double[]) newDoubleArray(32);
        byte[] term8106 = (byte[]) newByteArray(32);
        setField(term8039, term8039.getClass(), "keys", term8040);
        setField(term8039, term8039.getClass(), "values", term8073);
        setField(term8039, term8039.getClass(), "states", term8106);
        setDoubleField(term8039, term8039.getClass(), "missingEntries", 0.0);
        setIntField(term8039, term8039.getClass(), "size", 0);
        setIntField(term8039, term8039.getClass(), "mask", 31);
        setIntField(term8039, term8039.getClass(), "count", 0);
        setField(term8038, term8038.getClass(), "entries", term8039);
        setIntField(term8038, term8038.getClass(), "virtualSize", -14890619);
        setDoubleField(term8038, term8038.getClass(), "epsilon", 1.0E-12);
        term8145 = new Double(0.5279279537140873);
        term94007 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term94008 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term94009 = (int[]) newIntArray(32);
        double[] term94010 = (double[]) newDoubleArray(32);
        byte[] term94011 = (byte[]) newByteArray(32);
        setField(term94008, term94008.getClass(), "keys", term94009);
        setField(term94008, term94008.getClass(), "values", term94010);
        setField(term94008, term94008.getClass(), "states", term94011);
        setDoubleField(term94008, term94008.getClass(), "missingEntries", 0.0);
        setIntField(term94008, term94008.getClass(), "size", 0);
        setIntField(term94008, term94008.getClass(), "mask", 31);
        setIntField(term94008, term94008.getClass(), "count", 0);
        setField(term94007, term94007.getClass(), "entries", term94008);
        setIntField(term94007, term94007.getClass(), "virtualSize", -14890619);
        setDoubleField(term94007, term94007.getClass(), "epsilon", 1.0E-12);
        term93900 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term93901 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term93902 = (int[]) newIntArray(32);
        double[] term93935 = (double[]) newDoubleArray(32);
        byte[] term93968 = (byte[]) newByteArray(32);
        setField(term93901, term93901.getClass(), "keys", term93902);
        setField(term93901, term93901.getClass(), "values", term93935);
        setField(term93901, term93901.getClass(), "states", term93968);
        setDoubleField(term93901, term93901.getClass(), "missingEntries", 0.0);
        setIntField(term93901, term93901.getClass(), "size", 0);
        setIntField(term93901, term93901.getClass(), "mask", 31);
        setIntField(term93901, term93901.getClass(), "count", 0);
        setField(term93900, term93900.getClass(), "entries", term93901);
        setIntField(term93900, term93900.getClass(), "virtualSize", -14890619);
        setDoubleField(term93900, term93900.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term8145;
        Object retValue = callMethod(klass, "mapAdd", argTypes, term8038, args);
        assertTrue(recursiveEquals(term8038, term94007));
        assertTrue(recursiveEquals(term8145, 0.5279279537140873));
        assertTrue(recursiveEquals(retValue, term93900));
    }

};


