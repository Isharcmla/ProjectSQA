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

public class OpenMapRealMatrix_addToEntry_57531557529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3064;
     Object term3171;
     Object term3173;
     Object term3175;

    public OpenMapRealMatrix_addToEntry_57531557529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3064 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term3067 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term3068 = (int[]) newIntArray(32);
        double[] term3101 = (double[]) newDoubleArray(32);
        byte[] term3134 = (byte[]) newByteArray(32);
        setIntField(term3064, term3064.getClass(), "rows", -112921587);
        setIntField(term3064, term3064.getClass(), "columns", 933028652);
        setField(term3067, term3067.getClass(), "keys", term3068);
        setField(term3067, term3067.getClass(), "values", term3101);
        setField(term3067, term3067.getClass(), "states", term3134);
        setDoubleField(term3067, term3067.getClass(), "missingEntries", Double.NaN);
        setIntField(term3067, term3067.getClass(), "size", 287287233);
        setIntField(term3067, term3067.getClass(), "mask", 31);
        setIntField(term3067, term3067.getClass(), "count", 962840079);
        setField(term3064, term3064.getClass(), "entries", term3067);
        term3171 = new Integer(1540719661);
        term3173 = new Integer(1265463001);
        term3175 = new Double(0.3455959125047594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term3171;
        args[1] = term3173;
        args[2] = term3175;
        try {
            callMethod(klass, "addToEntry", argTypes, term3064, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


