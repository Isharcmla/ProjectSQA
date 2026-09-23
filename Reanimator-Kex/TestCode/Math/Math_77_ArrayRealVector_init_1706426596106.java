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

public class ArrayRealVector_init_1706426596106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term1210;
     Object term1212;

    public ArrayRealVector_init_1706426596106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = (double[]) newDoubleArray(5);
        setDoubleElement(term7, 0, 0.3455959125047594);
        setDoubleElement(term7, 1, 0.5523635872663106);
        setDoubleElement(term7, 2, 0.544608645520025);
        setDoubleElement(term7, 3, 0.28570734989730284);
        setDoubleElement(term7, 4, 0.40176586625454525);
        term1210 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1211 = (double[]) newDoubleArray(5);
        setDoubleElement(term1211, 0, 0.3455959125047594);
        setDoubleElement(term1211, 1, 0.5523635872663106);
        setDoubleElement(term1211, 2, 0.544608645520025);
        setDoubleElement(term1211, 3, 0.28570734989730284);
        setDoubleElement(term1211, 4, 0.40176586625454525);
        setField(term1210, term1210.getClass(), "data", term1211);
        term1212 = (double[]) newDoubleArray(5);
        setDoubleElement(term1212, 0, 0.3455959125047594);
        setDoubleElement(term1212, 1, 0.5523635872663106);
        setDoubleElement(term1212, 2, 0.544608645520025);
        setDoubleElement(term1212, 3, 0.28570734989730284);
        setDoubleElement(term1212, 4, 0.40176586625454525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term7;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1210));
        assertTrue(recursiveEquals(term7, term1212));
    }

};


