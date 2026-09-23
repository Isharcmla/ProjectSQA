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

public class ArrayRealVector_init_1954185645112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56;
     Object term3232;
     Object term3234;

    public ArrayRealVector_init_1954185645112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term57 = (double[]) newDoubleArray(0);
        setField(term56, term56.getClass(), "data", term57);
        term3232 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3233 = (double[]) newDoubleArray(0);
        setField(term3232, term3232.getClass(), "data", term3233);
        term3234 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3235 = (double[]) newDoubleArray(0);
        setField(term3234, term3234.getClass(), "data", term3235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[1];
        args[0] = term56;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3232));
        assertTrue(recursiveEquals(term56, term3234));
    }

};


