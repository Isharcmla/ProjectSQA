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
     Object term90491;
     Object term89329;

    public OpenMapRealVector_append_864046346111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90491 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term90599 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term90329 = (int[]) newIntArray(0);
        setIntField(term90491, term90491.getClass(), "virtualSize", 2147482664);
        setField(term90599, term90599.getClass(), "keys", term90329);
        setField(term90599, term90599.getClass(), "values", null);
        setField(term90599, term90599.getClass(), "states", null);
        setDoubleField(term90599, term90599.getClass(), "missingEntries", 0.0);
        setIntField(term90599, term90599.getClass(), "size", 0);
        setIntField(term90599, term90599.getClass(), "mask", 0);
        setIntField(term90599, term90599.getClass(), "count", 0);
        setField(term90491, term90491.getClass(), "entries", term90599);
        setDoubleField(term90491, term90491.getClass(), "epsilon", 0.0);
        term89329 = (double[]) newDoubleArray(989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term89329;
        callMethod(klass, "append", argTypes, term90491, args);
    }

};


