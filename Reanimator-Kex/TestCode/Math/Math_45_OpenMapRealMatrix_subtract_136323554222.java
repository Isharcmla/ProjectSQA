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
import java.lang.NullPointerException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class OpenMapRealMatrix_subtract_136323554222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1227;

    public OpenMapRealMatrix_subtract_136323554222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1227 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term1230 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term1231 = (int[]) newIntArray(32);
        double[] term1264 = (double[]) newDoubleArray(32);
        byte[] term1297 = (byte[]) newByteArray(32);
        setIntField(term1227, term1227.getClass(), "rows", -1275173084);
        setIntField(term1227, term1227.getClass(), "columns", -244121226);
        setField(term1230, term1230.getClass(), "keys", term1231);
        setField(term1230, term1230.getClass(), "values", term1264);
        setField(term1230, term1230.getClass(), "states", term1297);
        setDoubleField(term1230, term1230.getClass(), "missingEntries", Double.NaN);
        setIntField(term1230, term1230.getClass(), "size", -203030934);
        setIntField(term1230, term1230.getClass(), "mask", 31);
        setIntField(term1230, term1230.getClass(), "count", -1179120542);
        setField(term1227, term1227.getClass(), "entries", term1230);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "subtract", argTypes, term1227, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


