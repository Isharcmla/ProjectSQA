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
import java.lang.Object;

public class ArrayRealVector_init_61720804290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71551;
     Object term73848;
     Object term73850;

    public ArrayRealVector_init_61720804290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term71665 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        term71551 = (double[]) newDoubleArray(0);
        term73848 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term73849 = (double[]) newDoubleArray(0);
        setField(term73848, term73848.getClass(), "data", term73849);
        term73850 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term71551;
        args[1] = 0;
        args[2] = 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term73848));
        assertTrue(recursiveEquals(term71551, term73850));
    }

};


