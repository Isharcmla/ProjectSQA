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

public class OpenMapRealVector_getDistance_43355253592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5163;

    public OpenMapRealVector_getDistance_43355253592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5163 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term5164 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term5165 = (int[]) newIntArray(32);
        double[] term5198 = (double[]) newDoubleArray(32);
        byte[] term5231 = (byte[]) newByteArray(32);
        setField(term5164, term5164.getClass(), "keys", term5165);
        setField(term5164, term5164.getClass(), "values", term5198);
        setField(term5164, term5164.getClass(), "states", term5231);
        setDoubleField(term5164, term5164.getClass(), "missingEntries", 0.0);
        setIntField(term5164, term5164.getClass(), "size", 0);
        setIntField(term5164, term5164.getClass(), "mask", 31);
        setIntField(term5164, term5164.getClass(), "count", 0);
        setField(term5163, term5163.getClass(), "entries", term5164);
        setIntField(term5163, term5163.getClass(), "virtualSize", 1193880199);
        setDoubleField(term5163, term5163.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getDistance", argTypes, term5163, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


