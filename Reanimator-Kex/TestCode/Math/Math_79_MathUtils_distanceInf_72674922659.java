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

public class MathUtils_distanceInf_72674922659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369;
     Object term375;

    public MathUtils_distanceInf_72674922659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369 = (double[]) newDoubleArray(5);
        setDoubleElement(term369, 0, 0.7919370314903882);
        setDoubleElement(term369, 1, 0.2109867221632754);
        setDoubleElement(term369, 2, 0.3227335400819148);
        setDoubleElement(term369, 3, 0.43337207054070237);
        setDoubleElement(term369, 4, 0.13246999699526574);
        term375 = (double[]) newDoubleArray(2);
        setDoubleElement(term375, 0, 0.9126850255993704);
        setDoubleElement(term375, 1, 0.11179067076100713);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term369;
        args[1] = term375;
        callMethod(klass, "distanceInf", argTypes, null, args);
    }

};


