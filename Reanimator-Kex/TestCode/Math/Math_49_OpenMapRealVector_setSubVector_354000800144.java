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

public class OpenMapRealVector_setSubVector_354000800144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9085;
     Object term9192;

    public OpenMapRealVector_setSubVector_354000800144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9085 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term9086 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term9087 = (int[]) newIntArray(32);
        double[] term9120 = (double[]) newDoubleArray(32);
        byte[] term9153 = (byte[]) newByteArray(32);
        setField(term9086, term9086.getClass(), "keys", term9087);
        setField(term9086, term9086.getClass(), "values", term9120);
        setField(term9086, term9086.getClass(), "states", term9153);
        setDoubleField(term9086, term9086.getClass(), "missingEntries", 0.0);
        setIntField(term9086, term9086.getClass(), "size", 0);
        setIntField(term9086, term9086.getClass(), "mask", 31);
        setIntField(term9086, term9086.getClass(), "count", 0);
        setField(term9085, term9085.getClass(), "entries", term9086);
        setIntField(term9085, term9085.getClass(), "virtualSize", 292681826);
        setDoubleField(term9085, term9085.getClass(), "epsilon", 1.0E-12);
        term9192 = new Integer(458147407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.apache.commons.math.linear.RealVector");
        Object[] args = new Object[2];
        args[0] = term9192;
        args[1] = null;
        try {
            callMethod(klass, "setSubVector", argTypes, term9085, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


