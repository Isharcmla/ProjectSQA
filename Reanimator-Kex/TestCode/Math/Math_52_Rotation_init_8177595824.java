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

public class Rotation_init_8177595824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77;
     Object term81;

    public Rotation_init_8177595824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term77, term77.getClass(), "x", 0.3202192021706908);
        setDoubleField(term77, term77.getClass(), "y", 0.22651340641904605);
        setDoubleField(term77, term77.getClass(), "z", 0.8878841294187743);
        term81 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term81, term81.getClass(), "x", 0.6588948704887806);
        setDoubleField(term81, term81.getClass(), "y", 0.6397214730945112);
        setDoubleField(term81, term81.getClass(), "z", 0.25937345430928016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D");
        Object[] args = new Object[2];
        args[0] = term77;
        args[1] = term81;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


