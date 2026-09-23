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

public class OpenMapRealVector_getDistance_127843632732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5366;
     Object term5473;

    public OpenMapRealVector_getDistance_127843632732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5366 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term5367 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term5368 = (int[]) newIntArray(32);
        double[] term5401 = (double[]) newDoubleArray(32);
        byte[] term5434 = (byte[]) newByteArray(32);
        setField(term5367, term5367.getClass(), "keys", term5368);
        setField(term5367, term5367.getClass(), "values", term5401);
        setField(term5367, term5367.getClass(), "states", term5434);
        setDoubleField(term5367, term5367.getClass(), "missingEntries", 0.0);
        setIntField(term5367, term5367.getClass(), "size", 0);
        setIntField(term5367, term5367.getClass(), "mask", 31);
        setIntField(term5367, term5367.getClass(), "count", 0);
        setField(term5366, term5366.getClass(), "entries", term5367);
        setIntField(term5366, term5366.getClass(), "virtualSize", -1087774327);
        setDoubleField(term5366, term5366.getClass(), "epsilon", 1.0E-12);
        term5473 = (double[]) newDoubleArray(6);
        setDoubleElement(term5473, 0, 0.13481025392611334);
        setDoubleElement(term5473, 1, 0.3800088629986428);
        setDoubleElement(term5473, 2, 0.5840714198152577);
        setDoubleElement(term5473, 3, 0.7559240768573477);
        setDoubleElement(term5473, 4, 0.10667076642995188);
        setDoubleElement(term5473, 5, 0.11493000848982304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5473;
        callMethod(klass, "getDistance", argTypes, term5366, args);
    }

};


