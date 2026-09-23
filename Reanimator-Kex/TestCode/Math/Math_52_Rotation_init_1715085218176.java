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
import static org.apache.commons.math.geometry.euclidean.threed.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.geometry.euclidean.threed.EqualityUtils.*;
import java.lang.Object;

public class Rotation_init_1715085218176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81226;
     Object term81589;
     Object term81590;

    public Rotation_init_1715085218176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term81528 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        term81226 = (Object[]) newArray("[D", 3);
        double[] term81227 = (double[]) newDoubleArray(3);
        double[] term81231 = (double[]) newDoubleArray(3);
        double[] term81235 = (double[]) newDoubleArray(3);
        setElement(term81226, 0, term81227);
        setElement(term81226, 1, term81231);
        setElement(term81226, 2, term81235);
        term81589 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term81589, term81589.getClass(), "q0", 0.5);
        setDoubleField(term81589, term81589.getClass(), "q1", 0.0);
        setDoubleField(term81589, term81589.getClass(), "q2", 0.0);
        setDoubleField(term81589, term81589.getClass(), "q3", 0.0);
        term81590 = (Object[]) newArray("[D", 3);
        double[] term81591 = (double[]) newDoubleArray(3);
        double[] term81592 = (double[]) newDoubleArray(3);
        double[] term81593 = (double[]) newDoubleArray(3);
        setElement(term81590, 0, term81591);
        setElement(term81590, 1, term81592);
        setElement(term81590, 2, term81593);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term81226;
        args[1] = 0.0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term81589));
        assertTrue(recursiveEquals(term81226, term81590));
    }

};


