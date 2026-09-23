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

public class OpenMapRealVector_toArray_103468866756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10934;

    public OpenMapRealVector_toArray_103468866756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10934 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term10935 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term10936 = (int[]) newIntArray(32);
        double[] term10969 = (double[]) newDoubleArray(32);
        byte[] term11002 = (byte[]) newByteArray(32);
        setField(term10935, term10935.getClass(), "keys", term10936);
        setField(term10935, term10935.getClass(), "values", term10969);
        setField(term10935, term10935.getClass(), "states", term11002);
        setDoubleField(term10935, term10935.getClass(), "missingEntries", 0.0);
        setIntField(term10935, term10935.getClass(), "size", 0);
        setIntField(term10935, term10935.getClass(), "mask", 31);
        setIntField(term10935, term10935.getClass(), "count", 0);
        setField(term10934, term10934.getClass(), "entries", term10935);
        setIntField(term10934, term10934.getClass(), "virtualSize", -1588772968);
        setDoubleField(term10934, term10934.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toArray", argTypes, term10934, args);
    }

};


