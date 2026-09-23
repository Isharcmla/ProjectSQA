package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MathUtils_distance1_87002239460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307;
     Object term310;

    public MathUtils_distance1_87002239460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term307 = (double[]) newDoubleArray(2);
        setDoubleElement(term307, 0, 0.9203805380592256);
        setDoubleElement(term307, 1, 0.5804948995371725);
        term310 = (double[]) newDoubleArray(6);
        setDoubleElement(term310, 0, 0.20737514139742264);
        setDoubleElement(term310, 1, 0.7919370314903882);
        setDoubleElement(term310, 2, 0.2109867221632754);
        setDoubleElement(term310, 3, 0.3227335400819148);
        setDoubleElement(term310, 4, 0.43337207054070237);
        setDoubleElement(term310, 5, 0.13246999699526574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term307;
        args[1] = term310;
        callMethod(klass, "distance1", argTypes, null, args);
    }

};


