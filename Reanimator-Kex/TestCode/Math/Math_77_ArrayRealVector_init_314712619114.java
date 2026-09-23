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

public class ArrayRealVector_init_314712619114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62;
     Object term64;
     Object term3252;
     Object term3254;
     Object term3256;

    public ArrayRealVector_init_314712619114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term63 = (double[]) newDoubleArray(0);
        setField(term62, term62.getClass(), "data", term63);
        term64 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term65 = (double[]) newDoubleArray(0);
        setField(term64, term64.getClass(), "data", term65);
        term3252 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3253 = (double[]) newDoubleArray(0);
        setField(term3252, term3252.getClass(), "data", term3253);
        term3254 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3255 = (double[]) newDoubleArray(0);
        setField(term3254, term3254.getClass(), "data", term3255);
        term3256 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term3257 = (double[]) newDoubleArray(0);
        setField(term3256, term3256.getClass(), "data", term3257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        argTypes[1] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[2];
        args[0] = term62;
        args[1] = term64;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3252));
        assertTrue(recursiveEquals(term62, term3254));
        assertTrue(recursiveEquals(term64, term3256));
    }

};


