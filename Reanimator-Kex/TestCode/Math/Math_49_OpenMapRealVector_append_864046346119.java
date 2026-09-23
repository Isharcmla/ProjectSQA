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

public class OpenMapRealVector_append_864046346119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106143;
     Object term98754;

    public OpenMapRealVector_append_864046346119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106143 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term106251 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term99239 = (int[]) newIntArray(513);
        setIntField(term106143, term106143.getClass(), "virtualSize", 550);
        setField(term106251, term106251.getClass(), "keys", term99239);
        setField(term106251, term106251.getClass(), "values", null);
        setField(term106251, term106251.getClass(), "states", null);
        setDoubleField(term106251, term106251.getClass(), "missingEntries", 0.0);
        setIntField(term106251, term106251.getClass(), "size", -10238);
        setIntField(term106251, term106251.getClass(), "mask", 1073676287);
        setIntField(term106251, term106251.getClass(), "count", 0);
        setField(term106143, term106143.getClass(), "entries", term106251);
        setDoubleField(term106143, term106143.getClass(), "epsilon", 0.0);
        term98754 = (double[]) newDoubleArray(474);
        setDoubleElement(term98754, 0, 9.2199950265572577E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term98754;
        callMethod(klass, "append", argTypes, term106143, args);
    }

};


