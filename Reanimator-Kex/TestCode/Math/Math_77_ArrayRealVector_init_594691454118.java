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

public class ArrayRealVector_init_594691454118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85;
     Object term88;
     Object term4025;
     Object term4027;
     Object term4029;

    public ArrayRealVector_init_594691454118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85 = (double[]) newDoubleArray(2);
        setDoubleElement(term85, 0, 0.7332741045694002);
        setDoubleElement(term85, 1, 0.4569171842750229);
        term88 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term89 = (double[]) newDoubleArray(0);
        setField(term88, term88.getClass(), "data", term89);
        term4025 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term4026 = (double[]) newDoubleArray(2);
        setDoubleElement(term4026, 0, 0.7332741045694002);
        setDoubleElement(term4026, 1, 0.4569171842750229);
        setField(term4025, term4025.getClass(), "data", term4026);
        term4027 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term4028 = (double[]) newDoubleArray(0);
        setField(term4027, term4027.getClass(), "data", term4028);
        term4029 = (double[]) newDoubleArray(2);
        setDoubleElement(term4029, 0, 0.7332741045694002);
        setDoubleElement(term4029, 1, 0.4569171842750229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[2];
        args[0] = term85;
        args[1] = term88;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4025));
        assertTrue(recursiveEquals(term85, term4027));
        assertTrue(recursiveEquals(term88, term4029));
    }

};


