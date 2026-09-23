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

public class ArrayRealVector_ebeDivide_165971144856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241;
     Object term243;

    public ArrayRealVector_ebeDivide_165971144856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term242 = (double[]) newDoubleArray(0);
        setField(term241, term241.getClass(), "data", term242);
        term243 = (double[]) newDoubleArray(5);
        setDoubleElement(term243, 0, 0.15917839663695388);
        setDoubleElement(term243, 1, 0.9374115574082594);
        setDoubleElement(term243, 2, 0.8454723071922143);
        setDoubleElement(term243, 3, 0.8566567697571895);
        setDoubleElement(term243, 4, 0.9203805380592256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term243;
        callMethod(klass, "ebeDivide", argTypes, term241, args);
    }

};


