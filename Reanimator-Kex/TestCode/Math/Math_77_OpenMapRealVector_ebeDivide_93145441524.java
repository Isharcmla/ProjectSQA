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

public class OpenMapRealVector_ebeDivide_93145441524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3517;
     Object term3624;

    public OpenMapRealVector_ebeDivide_93145441524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3517 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term3518 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term3519 = (int[]) newIntArray(32);
        double[] term3552 = (double[]) newDoubleArray(32);
        byte[] term3585 = (byte[]) newByteArray(32);
        setField(term3518, term3518.getClass(), "keys", term3519);
        setField(term3518, term3518.getClass(), "values", term3552);
        setField(term3518, term3518.getClass(), "states", term3585);
        setDoubleField(term3518, term3518.getClass(), "missingEntries", 0.0);
        setIntField(term3518, term3518.getClass(), "size", 0);
        setIntField(term3518, term3518.getClass(), "mask", 31);
        setIntField(term3518, term3518.getClass(), "count", 0);
        setField(term3517, term3517.getClass(), "entries", term3518);
        setIntField(term3517, term3517.getClass(), "virtualSize", -1007160944);
        setDoubleField(term3517, term3517.getClass(), "epsilon", 1.0E-12);
        term3624 = (double[]) newDoubleArray(6);
        setDoubleElement(term3624, 0, 0.9828442029246764);
        setDoubleElement(term3624, 1, 0.2779719046761513);
        setDoubleElement(term3624, 2, 0.6436713023569729);
        setDoubleElement(term3624, 3, 0.7332741045694002);
        setDoubleElement(term3624, 4, 0.4569171842750229);
        setDoubleElement(term3624, 5, 0.8598297828918529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3624;
        callMethod(klass, "ebeDivide", argTypes, term3517, args);
    }

};


