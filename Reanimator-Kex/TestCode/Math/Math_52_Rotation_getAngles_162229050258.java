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
import org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException;
import static org.apache.commons.math.geometry.euclidean.threed.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Rotation_getAngles_162229050258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8437;
     Object term8569;

    public Rotation_getAngles_162229050258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8437 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        term8569 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.RotationOrder"));
        Object term8729 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        Object term8851 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        Object term8973 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        setField(term8569, term8569.getClass(), "name", "XYZ");
        setDoubleField(term8729, term8729.getClass(), "x", 4.6071824188000174E18);
        setDoubleField(term8729, term8729.getClass(), "y", 0.0);
        setDoubleField(term8729, term8729.getClass(), "z", 0.0);
        setField(term8569, term8569.getClass(), "a1", term8729);
        setDoubleField(term8851, term8851.getClass(), "x", 0.0);
        setDoubleField(term8851, term8851.getClass(), "y", 4.6071824188000174E18);
        setDoubleField(term8851, term8851.getClass(), "z", 0.0);
        setField(term8569, term8569.getClass(), "a2", term8851);
        setDoubleField(term8973, term8973.getClass(), "x", 0.0);
        setDoubleField(term8973, term8973.getClass(), "y", 0.0);
        setDoubleField(term8973, term8973.getClass(), "z", 4.6071824188000174E18);
        setField(term8569, term8569.getClass(), "a3", term8973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.RotationOrder");
        Object[] args = new Object[1];
        args[0] = term8569;
        try {
            callMethod(klass, "getAngles", argTypes, term8437, args);
            assertTrue(false);
        }
        catch (CardanEulerSingularityException e) {
        }

    }

};


