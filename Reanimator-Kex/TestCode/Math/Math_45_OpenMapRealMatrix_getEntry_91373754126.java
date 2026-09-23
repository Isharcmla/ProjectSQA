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
import org.apache.commons.math.exception.OutOfRangeException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;
import java.lang.Integer;

public class OpenMapRealMatrix_getEntry_91373754126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2445;
     Object term2552;
     Object term2554;

    public OpenMapRealMatrix_getEntry_91373754126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2445 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term2448 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term2449 = (int[]) newIntArray(32);
        double[] term2482 = (double[]) newDoubleArray(32);
        byte[] term2515 = (byte[]) newByteArray(32);
        setIntField(term2445, term2445.getClass(), "rows", -1786399638);
        setIntField(term2445, term2445.getClass(), "columns", 2055867847);
        setField(term2448, term2448.getClass(), "keys", term2449);
        setField(term2448, term2448.getClass(), "values", term2482);
        setField(term2448, term2448.getClass(), "states", term2515);
        setDoubleField(term2448, term2448.getClass(), "missingEntries", Double.NaN);
        setIntField(term2448, term2448.getClass(), "size", -1048298087);
        setIntField(term2448, term2448.getClass(), "mask", 31);
        setIntField(term2448, term2448.getClass(), "count", 292681826);
        setField(term2445, term2445.getClass(), "entries", term2448);
        term2552 = new Integer(458147407);
        term2554 = new Integer(-184153539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2552;
        args[1] = term2554;
        try {
            callMethod(klass, "getEntry", argTypes, term2445, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


