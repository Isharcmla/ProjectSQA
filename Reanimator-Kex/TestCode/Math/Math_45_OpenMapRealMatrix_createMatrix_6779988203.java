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
import java.lang.Object;
import java.lang.Double;
import java.lang.Integer;

public class OpenMapRealMatrix_createMatrix_6779988203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411;
     Object term518;
     Object term520;

    public OpenMapRealMatrix_createMatrix_6779988203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term411 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term414 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term415 = (int[]) newIntArray(32);
        double[] term448 = (double[]) newDoubleArray(32);
        byte[] term481 = (byte[]) newByteArray(32);
        setIntField(term411, term411.getClass(), "rows", 1725571209);
        setIntField(term411, term411.getClass(), "columns", -522618178);
        setField(term414, term414.getClass(), "keys", term415);
        setField(term414, term414.getClass(), "values", term448);
        setField(term414, term414.getClass(), "states", term481);
        setDoubleField(term414, term414.getClass(), "missingEntries", Double.NaN);
        setIntField(term414, term414.getClass(), "size", 1134449235);
        setIntField(term414, term414.getClass(), "mask", 31);
        setIntField(term414, term414.getClass(), "count", -883034806);
        setField(term411, term411.getClass(), "entries", term414);
        term518 = new Integer(1585847225);
        term520 = new Integer(597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term518;
        args[1] = term520;
        callMethod(klass, "createMatrix", argTypes, term411, args);
    }

};


