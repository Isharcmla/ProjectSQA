package org.apache.commons.math3.linear;

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
import static org.apache.commons.math3.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OpenMapRealVector_getSparsity_189847139748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9217;

    public OpenMapRealVector_getSparsity_189847139748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9217 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term9218 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term9219 = (int[]) newIntArray(32);
        double[] term9252 = (double[]) newDoubleArray(32);
        byte[] term9285 = (byte[]) newByteArray(32);
        setField(term9218, term9218.getClass(), "keys", term9219);
        setField(term9218, term9218.getClass(), "values", term9252);
        setField(term9218, term9218.getClass(), "states", term9285);
        setDoubleField(term9218, term9218.getClass(), "missingEntries", 0.0);
        setIntField(term9218, term9218.getClass(), "size", 0);
        setIntField(term9218, term9218.getClass(), "mask", 31);
        setIntField(term9218, term9218.getClass(), "count", 0);
        setField(term9217, term9217.getClass(), "entries", term9218);
        setIntField(term9217, term9217.getClass(), "virtualSize", -184153539);
        setDoubleField(term9217, term9217.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSparsity", argTypes, term9217, args);
    }

};


