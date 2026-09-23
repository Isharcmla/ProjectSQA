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

public class ArrayRealVector_init_159601752335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78018;
     Object term98543;
     Object term98545;

    public ArrayRealVector_init_159601752335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78132 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        term78018 = (Object[]) newArray("java.lang.Double", 105);
        term98543 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term98544 = (double[]) newDoubleArray(0);
        setField(term98543, term98543.getClass(), "data", term98544);
        term98545 = (Object[]) newArray("java.lang.Double", 105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Double"), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term78018;
        args[1] = 105;
        args[2] = 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term98543));
        assertTrue(recursiveEquals(term78018, term98545));
    }

};


