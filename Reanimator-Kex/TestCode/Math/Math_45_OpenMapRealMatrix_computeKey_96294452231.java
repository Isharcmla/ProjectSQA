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
import java.lang.Integer;

public class OpenMapRealMatrix_computeKey_96294452231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3482;
     Object term3589;
     Object term3591;
     Object term17005;

    public OpenMapRealMatrix_computeKey_96294452231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3482 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term3485 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term3486 = (int[]) newIntArray(32);
        double[] term3519 = (double[]) newDoubleArray(32);
        byte[] term3552 = (byte[]) newByteArray(32);
        setIntField(term3482, term3482.getClass(), "rows", 972867650);
        setIntField(term3482, term3482.getClass(), "columns", 1655935355);
        setField(term3485, term3485.getClass(), "keys", term3486);
        setField(term3485, term3485.getClass(), "values", term3519);
        setField(term3485, term3485.getClass(), "states", term3552);
        setDoubleField(term3485, term3485.getClass(), "missingEntries", Double.NaN);
        setIntField(term3485, term3485.getClass(), "size", -481533957);
        setIntField(term3485, term3485.getClass(), "mask", 31);
        setIntField(term3485, term3485.getClass(), "count", 1240914516);
        setField(term3482, term3482.getClass(), "entries", term3485);
        term3589 = new Integer(-1465035361);
        term3591 = new Integer(1090617576);
        term17005 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term17006 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term17007 = (int[]) newIntArray(32);
        double[] term17008 = (double[]) newDoubleArray(32);
        byte[] term17009 = (byte[]) newByteArray(32);
        setIntField(term17005, term17005.getClass(), "rows", 972867650);
        setIntField(term17005, term17005.getClass(), "columns", 1655935355);
        setField(term17006, term17006.getClass(), "keys", term17007);
        setField(term17006, term17006.getClass(), "values", term17008);
        setField(term17006, term17006.getClass(), "states", term17009);
        setDoubleField(term17006, term17006.getClass(), "missingEntries", Double.NaN);
        setIntField(term17006, term17006.getClass(), "size", -481533957);
        setIntField(term17006, term17006.getClass(), "mask", 31);
        setIntField(term17006, term17006.getClass(), "count", 1240914516);
        setField(term17005, term17005.getClass(), "entries", term17006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3589;
        args[1] = term3591;
        Object retValue = callMethod(klass, "computeKey", argTypes, term3482, args);
        assertTrue(recursiveEquals(term3482, term17005));
        assertTrue(recursiveEquals(term3589, -1465035361));
        assertTrue(recursiveEquals(term3591, 1090617576));
        assertTrue(recursiveEquals(retValue, 905294669));
    }

};


