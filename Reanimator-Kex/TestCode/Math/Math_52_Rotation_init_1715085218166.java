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

public class Rotation_init_1715085218166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69842;

    public Rotation_init_1715085218166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term69991 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        term69842 = (Object[]) newArray("[D", 3);
        double[] term69843 = (double[]) newDoubleArray(3);
        setDoubleElement(term69843, 0, 1.0);
        setElement(term69842, 0, term69843);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term69842;
        args[1] = 0.0;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


