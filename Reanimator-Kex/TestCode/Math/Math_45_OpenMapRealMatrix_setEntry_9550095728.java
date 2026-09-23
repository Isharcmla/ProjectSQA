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

public class OpenMapRealMatrix_setEntry_9550095728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2855;
     Object term2962;
     Object term2964;
     Object term2966;

    public OpenMapRealMatrix_setEntry_9550095728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2855 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term2858 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term2859 = (int[]) newIntArray(32);
        double[] term2892 = (double[]) newDoubleArray(32);
        byte[] term2925 = (byte[]) newByteArray(32);
        setIntField(term2855, term2855.getClass(), "rows", -1371869594);
        setIntField(term2855, term2855.getClass(), "columns", -2095575670);
        setField(term2858, term2858.getClass(), "keys", term2859);
        setField(term2858, term2858.getClass(), "values", term2892);
        setField(term2858, term2858.getClass(), "states", term2925);
        setDoubleField(term2858, term2858.getClass(), "missingEntries", Double.NaN);
        setIntField(term2858, term2858.getClass(), "size", 1225272962);
        setIntField(term2858, term2858.getClass(), "mask", 31);
        setIntField(term2858, term2858.getClass(), "count", 1324040357);
        setField(term2855, term2855.getClass(), "entries", term2858);
        term2962 = new Integer(-1588772968);
        term2964 = new Integer(-93135961);
        term2966 = new Double(0.13238746331190498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term2962;
        args[1] = term2964;
        args[2] = term2966;
        try {
            callMethod(klass, "setEntry", argTypes, term2855, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


