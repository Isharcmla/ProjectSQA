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

public class Rotation_distance_150142576286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20113;
     Object term20235;
     Object term20284;
     Object term20285;

    public Rotation_distance_150142576286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20113 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term20113, term20113.getClass(), "q0", 0.0);
        setDoubleField(term20113, term20113.getClass(), "q1", 0.0);
        setDoubleField(term20113, term20113.getClass(), "q2", 0.0);
        setDoubleField(term20113, term20113.getClass(), "q3", 0.0);
        term20235 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term20235, term20235.getClass(), "q0", 0.0);
        setDoubleField(term20235, term20235.getClass(), "q1", 0.0);
        setDoubleField(term20235, term20235.getClass(), "q2", 0.0);
        setDoubleField(term20235, term20235.getClass(), "q3", 0.0);
        term20284 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term20284, term20284.getClass(), "q0", 0.0);
        setDoubleField(term20284, term20284.getClass(), "q1", 0.0);
        setDoubleField(term20284, term20284.getClass(), "q2", 0.0);
        setDoubleField(term20284, term20284.getClass(), "q3", 0.0);
        term20285 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term20285, term20285.getClass(), "q0", 0.0);
        setDoubleField(term20285, term20285.getClass(), "q1", 0.0);
        setDoubleField(term20285, term20285.getClass(), "q2", 0.0);
        setDoubleField(term20285, term20285.getClass(), "q3", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Object[] args = new Object[2];
        args[0] = term20113;
        args[1] = term20235;
        Object retValue = callMethod(klass, "distance", argTypes, null, args);
        assertTrue(recursiveEquals(term20113, term20284));
        assertTrue(recursiveEquals(term20235, term20285));
        assertTrue(recursiveEquals(retValue, 3.141592653589793));
    }

};


