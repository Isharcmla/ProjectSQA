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

public class Rotation_distance_1501425762116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29811;
     Object term29933;
     Object term29982;
     Object term29983;

    public Rotation_distance_1501425762116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29811 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term29811, term29811.getClass(), "q0", 0.0);
        setDoubleField(term29811, term29811.getClass(), "q1", 0.0);
        setDoubleField(term29811, term29811.getClass(), "q2", 0.0);
        setDoubleField(term29811, term29811.getClass(), "q3", 0.0);
        term29933 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term29933, term29933.getClass(), "q0", 0.0);
        setDoubleField(term29933, term29933.getClass(), "q1", 0.0);
        setDoubleField(term29933, term29933.getClass(), "q2", 0.0);
        setDoubleField(term29933, term29933.getClass(), "q3", 0.0);
        term29982 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term29982, term29982.getClass(), "q0", 0.0);
        setDoubleField(term29982, term29982.getClass(), "q1", 0.0);
        setDoubleField(term29982, term29982.getClass(), "q2", 0.0);
        setDoubleField(term29982, term29982.getClass(), "q3", 0.0);
        term29983 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term29983, term29983.getClass(), "q0", 0.0);
        setDoubleField(term29983, term29983.getClass(), "q1", 0.0);
        setDoubleField(term29983, term29983.getClass(), "q2", 0.0);
        setDoubleField(term29983, term29983.getClass(), "q3", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Object[] args = new Object[2];
        args[0] = term29811;
        args[1] = term29933;
        Object retValue = callMethod(klass, "distance", argTypes, null, args);
        assertTrue(recursiveEquals(term29811, term29982));
        assertTrue(recursiveEquals(term29933, term29983));
        assertTrue(recursiveEquals(retValue, 3.141592653589793));
    }

};


