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

public class OpenMapRealMatrix_subtract_86327686023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1430;
     Object term1537;

    public OpenMapRealMatrix_subtract_86327686023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1430 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term1433 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term1434 = (int[]) newIntArray(32);
        double[] term1467 = (double[]) newDoubleArray(32);
        byte[] term1500 = (byte[]) newByteArray(32);
        setIntField(term1430, term1430.getClass(), "rows", -73683645);
        setIntField(term1430, term1430.getClass(), "columns", -226514366);
        setField(term1433, term1433.getClass(), "keys", term1434);
        setField(term1433, term1433.getClass(), "values", term1467);
        setField(term1433, term1433.getClass(), "states", term1500);
        setDoubleField(term1433, term1433.getClass(), "missingEntries", Double.NaN);
        setIntField(term1433, term1433.getClass(), "size", 1193880199);
        setIntField(term1433, term1433.getClass(), "mask", 31);
        setIntField(term1433, term1433.getClass(), "count", -1087774327);
        setField(term1430, term1430.getClass(), "entries", term1433);
        term1537 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term1540 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term1541 = (int[]) newIntArray(32);
        double[] term1574 = (double[]) newDoubleArray(32);
        byte[] term1607 = (byte[]) newByteArray(32);
        setIntField(term1537, term1537.getClass(), "rows", -1530420153);
        setIntField(term1537, term1537.getClass(), "columns", -469968304);
        setField(term1540, term1540.getClass(), "keys", term1541);
        setField(term1540, term1540.getClass(), "values", term1574);
        setField(term1540, term1540.getClass(), "states", term1607);
        setDoubleField(term1540, term1540.getClass(), "missingEntries", Double.NaN);
        setIntField(term1540, term1540.getClass(), "size", -1145578966);
        setIntField(term1540, term1540.getClass(), "mask", 31);
        setIntField(term1540, term1540.getClass(), "count", 679763016);
        setField(term1537, term1537.getClass(), "entries", term1540);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Object[] args = new Object[1];
        args[0] = term1537;
        try {
            callMethod(klass, "subtract", argTypes, term1430, args);
            assertTrue(false);
        }
        catch (MatrixDimensionMismatchException e) {
        }

    }

};


