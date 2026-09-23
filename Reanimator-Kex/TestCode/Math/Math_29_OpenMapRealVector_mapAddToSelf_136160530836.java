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
import java.lang.Double;

public class OpenMapRealVector_mapAddToSelf_136160530836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6567;
     Object term6674;

    public OpenMapRealVector_mapAddToSelf_136160530836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6567 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term6568 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term6569 = (int[]) newIntArray(32);
        double[] term6602 = (double[]) newDoubleArray(32);
        byte[] term6635 = (byte[]) newByteArray(32);
        setField(term6568, term6568.getClass(), "keys", term6569);
        setField(term6568, term6568.getClass(), "values", term6602);
        setField(term6568, term6568.getClass(), "states", term6635);
        setDoubleField(term6568, term6568.getClass(), "missingEntries", 0.0);
        setIntField(term6568, term6568.getClass(), "size", 0);
        setIntField(term6568, term6568.getClass(), "mask", 31);
        setIntField(term6568, term6568.getClass(), "count", 0);
        setField(term6567, term6567.getClass(), "entries", term6568);
        setIntField(term6567, term6567.getClass(), "virtualSize", -602026508);
        setDoubleField(term6567, term6567.getClass(), "epsilon", 1.0E-12);
        term6674 = new Double(0.9828442029246764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term6674;
        callMethod(klass, "mapAddToSelf", argTypes, term6567, args);
    }

};


