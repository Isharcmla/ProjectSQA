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

public class OpenMapRealMatrix_multiplyEntry_58590889530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3273;
     Object term3380;
     Object term3382;
     Object term3384;

    public OpenMapRealMatrix_multiplyEntry_58590889530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3273 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term3276 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term3277 = (int[]) newIntArray(32);
        double[] term3310 = (double[]) newDoubleArray(32);
        byte[] term3343 = (byte[]) newByteArray(32);
        setIntField(term3273, term3273.getClass(), "rows", 335112684);
        setIntField(term3273, term3273.getClass(), "columns", 1551099402);
        setField(term3276, term3276.getClass(), "keys", term3277);
        setField(term3276, term3276.getClass(), "values", term3310);
        setField(term3276, term3276.getClass(), "states", term3343);
        setDoubleField(term3276, term3276.getClass(), "missingEntries", Double.NaN);
        setIntField(term3276, term3276.getClass(), "size", -2027534003);
        setIntField(term3276, term3276.getClass(), "mask", 31);
        setIntField(term3276, term3276.getClass(), "count", 1063420942);
        setField(term3273, term3273.getClass(), "entries", term3276);
        term3380 = new Integer(1375330971);
        term3382 = new Integer(-478195677);
        term3384 = new Double(0.5523635872663106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term3380;
        args[1] = term3382;
        args[2] = term3384;
        try {
            callMethod(klass, "multiplyEntry", argTypes, term3273, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


