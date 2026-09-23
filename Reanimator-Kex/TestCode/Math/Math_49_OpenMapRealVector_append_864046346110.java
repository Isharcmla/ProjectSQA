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

public class OpenMapRealVector_append_864046346110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88935;
     Object term88473;

    public OpenMapRealVector_append_864046346110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88935 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term89043 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term88767 = (int[]) newIntArray(1);
        setIntField(term88935, term88935.getClass(), "virtualSize", -2147483648);
        setField(term89043, term89043.getClass(), "keys", term88767);
        setField(term89043, term89043.getClass(), "values", null);
        setField(term89043, term89043.getClass(), "states", null);
        setDoubleField(term89043, term89043.getClass(), "missingEntries", 0.0);
        setIntField(term89043, term89043.getClass(), "size", 0);
        setIntField(term89043, term89043.getClass(), "mask", 0);
        setIntField(term89043, term89043.getClass(), "count", 0);
        setField(term88935, term88935.getClass(), "entries", term89043);
        setDoubleField(term88935, term88935.getClass(), "epsilon", 0.0);
        term88473 = (double[]) newDoubleArray(283);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term88473;
        callMethod(klass, "append", argTypes, term88935, args);
    }

};


