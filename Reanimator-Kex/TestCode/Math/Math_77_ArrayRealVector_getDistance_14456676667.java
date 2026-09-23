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

public class ArrayRealVector_getDistance_14456676667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283;
     Object term285;

    public ArrayRealVector_getDistance_14456676667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term284 = (double[]) newDoubleArray(0);
        setField(term283, term283.getClass(), "data", term284);
        term285 = (double[]) newDoubleArray(3);
        setDoubleElement(term285, 0, 0.7919370314903882);
        setDoubleElement(term285, 1, 0.2109867221632754);
        setDoubleElement(term285, 2, 0.3227335400819148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term285;
        callMethod(klass, "getDistance", argTypes, term283, args);
    }

};


