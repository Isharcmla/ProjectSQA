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
import static org.apache.commons.math.linear.EqualityUtils.*;
import java.lang.Boolean;

public class ArrayRealVector_init_1282497371113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58;
     Object term60;
     Object term3242;
     Object term3244;

    public ArrayRealVector_init_1282497371113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term59 = (double[]) newDoubleArray(0);
        setField(term58, term58.getClass(), "data", term59);
        term60 = new Boolean(false);
        term3242 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3243 = (double[]) newDoubleArray(0);
        setField(term3242, term3242.getClass(), "data", term3243);
        term3244 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3245 = (double[]) newDoubleArray(0);
        setField(term3244, term3244.getClass(), "data", term3245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term58;
        args[1] = term60;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3242));
        assertTrue(recursiveEquals(term58, term3244));
        assertTrue(recursiveEquals(term60, false));
    }

};


