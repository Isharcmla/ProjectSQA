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

public class Rotation_init_33670335651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6854;

    public Rotation_init_33670335651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6722 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        term6854 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.RotationOrder"));
        Object term6976 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term6976, term6976.getClass(), "x", 0.0);
        setDoubleField(term6976, term6976.getClass(), "y", 0.0);
        setDoubleField(term6976, term6976.getClass(), "z", 0.0);
        setField(term6854, term6854.getClass(), "a1", term6976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.RotationOrder");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term6854;
        args[1] = 0.0;
        args[2] = 0.0;
        args[3] = 0.0;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


