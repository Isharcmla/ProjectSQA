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

public class Rotation_distance_1501425762102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27198;
     Object term27320;
     Object term27369;
     Object term27370;

    public Rotation_distance_1501425762102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27198 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term27198, term27198.getClass(), "q0", 0.0);
        setDoubleField(term27198, term27198.getClass(), "q1", 0.0);
        setDoubleField(term27198, term27198.getClass(), "q2", 0.0);
        setDoubleField(term27198, term27198.getClass(), "q3", 0.0);
        term27320 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term27320, term27320.getClass(), "q0", 0.0);
        setDoubleField(term27320, term27320.getClass(), "q1", 0.0);
        setDoubleField(term27320, term27320.getClass(), "q2", 0.0);
        setDoubleField(term27320, term27320.getClass(), "q3", 0.0);
        term27369 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term27369, term27369.getClass(), "q0", 0.0);
        setDoubleField(term27369, term27369.getClass(), "q1", 0.0);
        setDoubleField(term27369, term27369.getClass(), "q2", 0.0);
        setDoubleField(term27369, term27369.getClass(), "q3", 0.0);
        term27370 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term27370, term27370.getClass(), "q0", 0.0);
        setDoubleField(term27370, term27370.getClass(), "q1", 0.0);
        setDoubleField(term27370, term27370.getClass(), "q2", 0.0);
        setDoubleField(term27370, term27370.getClass(), "q3", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Object[] args = new Object[2];
        args[0] = term27198;
        args[1] = term27320;
        Object retValue = callMethod(klass, "distance", argTypes, null, args);
        assertTrue(recursiveEquals(term27198, term27369));
        assertTrue(recursiveEquals(term27320, term27370));
        assertTrue(recursiveEquals(retValue, 3.141592653589793));
    }

};


