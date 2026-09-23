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

public class Rotation_init_363350978170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75138;

    public Rotation_init_363350978170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term74894 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        term75138 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term75138, term75138.getClass(), "x", 0.0);
        setDoubleField(term75138, term75138.getClass(), "y", 0.0);
        setDoubleField(term75138, term75138.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D");
        argTypes[2] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D");
        argTypes[3] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D");
        Object[] args = new Object[4];
        args[0] = term75138;
        args[1] = term75138;
        args[2] = term75138;
        args[3] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


