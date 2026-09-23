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

public class OpenMapRealVector_append_864046346111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96598;
     Object term95157;

    public OpenMapRealVector_append_864046346111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96598 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term96706 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term95307 = (int[]) newIntArray(140);
        setIntField(term96598, term96598.getClass(), "virtualSize", 0);
        setField(term96706, term96706.getClass(), "keys", term95307);
        setField(term96706, term96706.getClass(), "values", null);
        setField(term96706, term96706.getClass(), "states", null);
        setDoubleField(term96706, term96706.getClass(), "missingEntries", 0.0);
        setIntField(term96706, term96706.getClass(), "size", 0);
        setIntField(term96706, term96706.getClass(), "mask", 0);
        setIntField(term96706, term96706.getClass(), "count", 0);
        setField(term96598, term96598.getClass(), "entries", term96706);
        setDoubleField(term96598, term96598.getClass(), "epsilon", 0.0);
        term95157 = (double[]) newDoubleArray(139);
        setDoubleElement(term95157, 0, 4.503599627371008E15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term95157;
        callMethod(klass, "append", argTypes, term96598, args);
    }

};


