package org.apache.commons.math3.util;

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
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MathArrays_distanceInf_34156920211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149;
     Object term158;

    public MathArrays_distanceInf_34156920211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149 = (double[]) newDoubleArray(8);
        setDoubleElement(term149, 0, 0.5804948995371725);
        setDoubleElement(term149, 1, 0.20737514139742264);
        setDoubleElement(term149, 2, 0.7919370314903882);
        setDoubleElement(term149, 3, 0.2109867221632754);
        setDoubleElement(term149, 4, 0.3227335400819148);
        setDoubleElement(term149, 5, 0.43337207054070237);
        setDoubleElement(term149, 6, 0.13246999699526574);
        setDoubleElement(term149, 7, 0.9126850255993704);
        term158 = (double[]) newDoubleArray(6);
        setDoubleElement(term158, 0, 0.11179067076100713);
        setDoubleElement(term158, 1, 0.5306473989087822);
        setDoubleElement(term158, 2, 0.022483645678509023);
        setDoubleElement(term158, 3, 0.025133051616627267);
        setDoubleElement(term158, 4, 0.016575281023182953);
        setDoubleElement(term158, 5, 0.5308350402051779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term149;
        args[1] = term158;
        callMethod(klass, "distanceInf", argTypes, null, args);
    }

};


