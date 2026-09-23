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

public class MathUtils_distance_210840937762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343;
     Object term350;

    public MathUtils_distance_210840937762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term343 = (double[]) newDoubleArray(6);
        setDoubleElement(term343, 0, 0.9126850255993704);
        setDoubleElement(term343, 1, 0.11179067076100713);
        setDoubleElement(term343, 2, 0.5306473989087822);
        setDoubleElement(term343, 3, 0.022483645678509023);
        setDoubleElement(term343, 4, 0.025133051616627267);
        setDoubleElement(term343, 5, 0.016575281023182953);
        term350 = (double[]) newDoubleArray(5);
        setDoubleElement(term350, 0, 0.5308350402051779);
        setDoubleElement(term350, 1, 0.7154795600170818);
        setDoubleElement(term350, 2, 0.6355029654528058);
        setDoubleElement(term350, 3, 0.0022646783892913414);
        setDoubleElement(term350, 4, 0.36226058076369927);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term343;
        args[1] = term350;
        callMethod(klass, "distance", argTypes, null, args);
    }

};


