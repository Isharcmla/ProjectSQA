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
import java.lang.Integer;
import java.lang.Double;

public class OpenMapRealVector_setEntry_600867553143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8878;
     Object term8985;
     Object term8987;

    public OpenMapRealVector_setEntry_600867553143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8878 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term8879 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term8880 = (int[]) newIntArray(32);
        double[] term8913 = (double[]) newDoubleArray(32);
        byte[] term8946 = (byte[]) newByteArray(32);
        setField(term8879, term8879.getClass(), "keys", term8880);
        setField(term8879, term8879.getClass(), "values", term8913);
        setField(term8879, term8879.getClass(), "states", term8946);
        setDoubleField(term8879, term8879.getClass(), "missingEntries", 0.0);
        setIntField(term8879, term8879.getClass(), "size", 0);
        setIntField(term8879, term8879.getClass(), "mask", 31);
        setIntField(term8879, term8879.getClass(), "count", 0);
        setField(term8878, term8878.getClass(), "entries", term8879);
        setIntField(term8878, term8878.getClass(), "virtualSize", 2055867847);
        setDoubleField(term8878, term8878.getClass(), "epsilon", 1.0E-12);
        term8985 = new Integer(-1048298087);
        term8987 = new Double(0.15917839663695388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term8985;
        args[1] = term8987;
        try {
            callMethod(klass, "setEntry", argTypes, term8878, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


