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

public class ArrayRealVector_getL1Distance_161704967370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298;
     Object term300;

    public ArrayRealVector_getL1Distance_161704967370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term298 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term299 = (double[]) newDoubleArray(0);
        setField(term298, term298.getClass(), "data", term299);
        term300 = (double[]) newDoubleArray(1);
        setDoubleElement(term300, 0, 0.43337207054070237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term300;
        callMethod(klass, "getL1Distance", argTypes, term298, args);
    }

};


