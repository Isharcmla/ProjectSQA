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

public class OpenMapRealVector_set_187370622151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9709;
     Object term9816;

    public OpenMapRealVector_set_187370622151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9709 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term9710 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term9711 = (int[]) newIntArray(32);
        double[] term9744 = (double[]) newDoubleArray(32);
        byte[] term9777 = (byte[]) newByteArray(32);
        setField(term9710, term9710.getClass(), "keys", term9711);
        setField(term9710, term9710.getClass(), "values", term9744);
        setField(term9710, term9710.getClass(), "states", term9777);
        setDoubleField(term9710, term9710.getClass(), "missingEntries", 0.0);
        setIntField(term9710, term9710.getClass(), "size", 0);
        setIntField(term9710, term9710.getClass(), "mask", 31);
        setIntField(term9710, term9710.getClass(), "count", 0);
        setField(term9709, term9709.getClass(), "entries", term9710);
        setIntField(term9709, term9709.getClass(), "virtualSize", 1596070772);
        setDoubleField(term9709, term9709.getClass(), "epsilon", 1.0E-12);
        term9816 = new Double(0.20737514139742264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term9816;
        callMethod(klass, "set", argTypes, term9709, args);
    }

};


