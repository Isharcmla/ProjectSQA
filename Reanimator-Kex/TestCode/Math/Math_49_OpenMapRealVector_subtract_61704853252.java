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

public class OpenMapRealVector_subtract_61704853252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10117;

    public OpenMapRealVector_subtract_61704853252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10117 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term10118 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term10119 = (int[]) newIntArray(32);
        double[] term10152 = (double[]) newDoubleArray(32);
        byte[] term10185 = (byte[]) newByteArray(32);
        setField(term10118, term10118.getClass(), "keys", term10119);
        setField(term10118, term10118.getClass(), "values", term10152);
        setField(term10118, term10118.getClass(), "states", term10185);
        setDoubleField(term10118, term10118.getClass(), "missingEntries", 0.0);
        setIntField(term10118, term10118.getClass(), "size", 0);
        setIntField(term10118, term10118.getClass(), "mask", 31);
        setIntField(term10118, term10118.getClass(), "count", 0);
        setField(term10117, term10117.getClass(), "entries", term10118);
        setIntField(term10117, term10117.getClass(), "virtualSize", -1371869594);
        setDoubleField(term10117, term10117.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "subtract", argTypes, term10117, args);
    }

};


