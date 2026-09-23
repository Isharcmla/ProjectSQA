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

public class OpenMapRealVector_copy_78613726882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2502;
     Object term29505;
     Object term28978;

    public OpenMapRealVector_copy_78613726882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2502 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term2503 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term2504 = (int[]) newIntArray(32);
        double[] term2537 = (double[]) newDoubleArray(32);
        byte[] term2570 = (byte[]) newByteArray(32);
        setField(term2503, term2503.getClass(), "keys", term2504);
        setField(term2503, term2503.getClass(), "values", term2537);
        setField(term2503, term2503.getClass(), "states", term2570);
        setDoubleField(term2503, term2503.getClass(), "missingEntries", 0.0);
        setIntField(term2503, term2503.getClass(), "size", 0);
        setIntField(term2503, term2503.getClass(), "mask", 31);
        setIntField(term2503, term2503.getClass(), "count", 0);
        setField(term2502, term2502.getClass(), "entries", term2503);
        setIntField(term2502, term2502.getClass(), "virtualSize", 1048535127);
        setDoubleField(term2502, term2502.getClass(), "epsilon", 1.0E-12);
        term29505 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term29506 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term29507 = (int[]) newIntArray(32);
        double[] term29508 = (double[]) newDoubleArray(32);
        byte[] term29509 = (byte[]) newByteArray(32);
        setField(term29506, term29506.getClass(), "keys", term29507);
        setField(term29506, term29506.getClass(), "values", term29508);
        setField(term29506, term29506.getClass(), "states", term29509);
        setDoubleField(term29506, term29506.getClass(), "missingEntries", 0.0);
        setIntField(term29506, term29506.getClass(), "size", 0);
        setIntField(term29506, term29506.getClass(), "mask", 31);
        setIntField(term29506, term29506.getClass(), "count", 0);
        setField(term29505, term29505.getClass(), "entries", term29506);
        setIntField(term29505, term29505.getClass(), "virtualSize", 1048535127);
        setDoubleField(term29505, term29505.getClass(), "epsilon", 1.0E-12);
        term28978 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term28979 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term28980 = (int[]) newIntArray(32);
        double[] term29013 = (double[]) newDoubleArray(32);
        byte[] term29046 = (byte[]) newByteArray(32);
        setField(term28979, term28979.getClass(), "keys", term28980);
        setField(term28979, term28979.getClass(), "values", term29013);
        setField(term28979, term28979.getClass(), "states", term29046);
        setDoubleField(term28979, term28979.getClass(), "missingEntries", 0.0);
        setIntField(term28979, term28979.getClass(), "size", 0);
        setIntField(term28979, term28979.getClass(), "mask", 31);
        setIntField(term28979, term28979.getClass(), "count", 0);
        setField(term28978, term28978.getClass(), "entries", term28979);
        setIntField(term28978, term28978.getClass(), "virtualSize", 1048535127);
        setDoubleField(term28978, term28978.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "copy", argTypes, term2502, args);
        assertTrue(recursiveEquals(term2502, term29505));
        assertTrue(recursiveEquals(retValue, term28978));
    }

};


