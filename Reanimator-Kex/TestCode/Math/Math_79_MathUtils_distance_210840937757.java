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

public class MathUtils_distance_210840937757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327;
     Object term335;

    public MathUtils_distance_210840937757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term327 = (double[]) newDoubleArray(7);
        setDoubleElement(term327, 0, 0.6862221294683138);
        setDoubleElement(term327, 1, 0.15917839663695388);
        setDoubleElement(term327, 2, 0.9374115574082594);
        setDoubleElement(term327, 3, 0.8454723071922143);
        setDoubleElement(term327, 4, 0.8566567697571895);
        setDoubleElement(term327, 5, 0.9203805380592256);
        setDoubleElement(term327, 6, 0.5804948995371725);
        term335 = (double[]) newDoubleArray(1);
        setDoubleElement(term335, 0, 0.20737514139742264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term327;
        args[1] = term335;
        callMethod(klass, "distance", argTypes, null, args);
    }

};


