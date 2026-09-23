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

public class OpenMapRealVector_mapAddToSelf_179575402044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8243;
     Object term8350;

    public OpenMapRealVector_mapAddToSelf_179575402044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8243 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term8244 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term8245 = (int[]) newIntArray(32);
        double[] term8278 = (double[]) newDoubleArray(32);
        byte[] term8311 = (byte[]) newByteArray(32);
        setField(term8244, term8244.getClass(), "keys", term8245);
        setField(term8244, term8244.getClass(), "values", term8278);
        setField(term8244, term8244.getClass(), "states", term8311);
        setDoubleField(term8244, term8244.getClass(), "missingEntries", 0.0);
        setIntField(term8244, term8244.getClass(), "size", 0);
        setIntField(term8244, term8244.getClass(), "mask", 31);
        setIntField(term8244, term8244.getClass(), "count", 0);
        setField(term8243, term8243.getClass(), "entries", term8244);
        setIntField(term8243, term8243.getClass(), "virtualSize", 1632125673);
        setDoubleField(term8243, term8243.getClass(), "epsilon", 1.0E-12);
        term8350 = new Double(0.3202192021706908);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term8350;
        callMethod(klass, "mapAddToSelf", argTypes, term8243, args);
    }

};


