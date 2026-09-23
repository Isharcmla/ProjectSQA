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

public class OpenMapRealVector_append_864046346126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104334;
     Object term103872;

    public OpenMapRealVector_append_864046346126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104334 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term104442 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term104166 = (int[]) newIntArray(1);
        setIntField(term104334, term104334.getClass(), "virtualSize", -2147483648);
        setField(term104442, term104442.getClass(), "keys", term104166);
        setField(term104442, term104442.getClass(), "values", null);
        setField(term104442, term104442.getClass(), "states", null);
        setDoubleField(term104442, term104442.getClass(), "missingEntries", 0.0);
        setIntField(term104442, term104442.getClass(), "size", 0);
        setIntField(term104442, term104442.getClass(), "mask", 0);
        setIntField(term104442, term104442.getClass(), "count", 0);
        setField(term104334, term104334.getClass(), "entries", term104442);
        setDoubleField(term104334, term104334.getClass(), "epsilon", 0.0);
        term103872 = (double[]) newDoubleArray(283);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term103872;
        callMethod(klass, "append", argTypes, term104334, args);
    }

};


