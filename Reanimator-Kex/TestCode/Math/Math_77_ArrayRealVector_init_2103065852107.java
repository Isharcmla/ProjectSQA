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

public class ArrayRealVector_init_2103065852107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18;
     Object term23;
     Object term1243;
     Object term1245;

    public ArrayRealVector_init_2103065852107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18 = (double[]) newDoubleArray(4);
        setDoubleElement(term18, 0, 0.2641345529914265);
        setDoubleElement(term18, 1, 0.36923381893433327);
        setDoubleElement(term18, 2, 0.6076495596892013);
        setDoubleElement(term18, 3, 0.37773193782763337);
        term23 = new Boolean(false);
        term1243 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1244 = (double[]) newDoubleArray(4);
        setDoubleElement(term1244, 0, 0.2641345529914265);
        setDoubleElement(term1244, 1, 0.36923381893433327);
        setDoubleElement(term1244, 2, 0.6076495596892013);
        setDoubleElement(term1244, 3, 0.37773193782763337);
        setField(term1243, term1243.getClass(), "data", term1244);
        term1245 = (double[]) newDoubleArray(4);
        setDoubleElement(term1245, 0, 0.2641345529914265);
        setDoubleElement(term1245, 1, 0.36923381893433327);
        setDoubleElement(term1245, 2, 0.6076495596892013);
        setDoubleElement(term1245, 3, 0.37773193782763337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term18;
        args[1] = term23;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1243));
        assertTrue(recursiveEquals(term18, term1245));
        assertTrue(recursiveEquals(term23, false));
    }

};


