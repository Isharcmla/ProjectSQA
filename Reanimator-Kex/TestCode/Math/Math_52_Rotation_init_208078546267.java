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
import java.lang.Object;

public class Rotation_init_208078546267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16418;

    public Rotation_init_208078546267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16296 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        term16418 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term16418, term16418.getClass(), "x", 0.0);
        setDoubleField(term16418, term16418.getClass(), "y", 0.0);
        setDoubleField(term16418, term16418.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term16418;
        args[1] = -0.0;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


