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

public class Rotation_orthogonalizeMatrix_1652275401128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36713;
     Object term35080;

    public Rotation_orthogonalizeMatrix_1652275401128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36713 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        term35080 = (Object[]) newArray("[D", 491);
        double[] term35081 = (double[]) newDoubleArray(491);
        setDoubleElement(term35081, 0, 1.0);
        setDoubleElement(term35081, 1, 1.0);
        setElement(term35080, 0, term35081);
        setElement(term35080, 1, term35081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term35080;
        args[1] = 0.0;
        try {
            callMethod(klass, "orthogonalizeMatrix", argTypes, term36713, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


