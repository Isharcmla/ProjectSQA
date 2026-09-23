package org.apache.commons.math.geometry.euclidean.threed;

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
import java.lang.NullPointerException;
import static org.apache.commons.math.geometry.euclidean.threed.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Rotation_init_1715085218147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49529;

    public Rotation_init_1715085218147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term49685 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        term49529 = (Object[]) newArray("[D", 3);
        double[] term49530 = (double[]) newDoubleArray(3);
        setDoubleElement(term49530, 0, 1.0);
        setDoubleElement(term49530, 1, 1.0);
        setElement(term49529, 0, term49530);
        setElement(term49529, 1, term49530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term49529;
        args[1] = 0.0;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


