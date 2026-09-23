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

public class Rotation_distance_1501425762112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29229;
     Object term29351;
     Object term29400;
     Object term29401;

    public Rotation_distance_1501425762112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29229 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term29229, term29229.getClass(), "q0", 0.0);
        setDoubleField(term29229, term29229.getClass(), "q1", 0.0);
        setDoubleField(term29229, term29229.getClass(), "q2", 0.0);
        setDoubleField(term29229, term29229.getClass(), "q3", 0.0);
        term29351 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term29351, term29351.getClass(), "q0", 0.0);
        setDoubleField(term29351, term29351.getClass(), "q1", 0.0);
        setDoubleField(term29351, term29351.getClass(), "q2", 0.0);
        setDoubleField(term29351, term29351.getClass(), "q3", 0.0);
        term29400 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term29400, term29400.getClass(), "q0", 0.0);
        setDoubleField(term29400, term29400.getClass(), "q1", 0.0);
        setDoubleField(term29400, term29400.getClass(), "q2", 0.0);
        setDoubleField(term29400, term29400.getClass(), "q3", 0.0);
        term29401 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term29401, term29401.getClass(), "q0", 0.0);
        setDoubleField(term29401, term29401.getClass(), "q1", 0.0);
        setDoubleField(term29401, term29401.getClass(), "q2", 0.0);
        setDoubleField(term29401, term29401.getClass(), "q3", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Object[] args = new Object[2];
        args[0] = term29229;
        args[1] = term29351;
        Object retValue = callMethod(klass, "distance", argTypes, null, args);
        assertTrue(recursiveEquals(term29229, term29400));
        assertTrue(recursiveEquals(term29351, term29401));
        assertTrue(recursiveEquals(retValue, 3.141592653589793));
    }

};


