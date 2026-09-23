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

public class Rotation_distance_150142576266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16092;
     Object term16136;
     Object term16137;

    public Rotation_distance_150142576266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16092 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term16092, term16092.getClass(), "q0", 0.0);
        setDoubleField(term16092, term16092.getClass(), "q1", 0.0);
        setDoubleField(term16092, term16092.getClass(), "q2", 0.0);
        setDoubleField(term16092, term16092.getClass(), "q3", 0.0);
        term16136 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term16136, term16136.getClass(), "q0", 0.0);
        setDoubleField(term16136, term16136.getClass(), "q1", 0.0);
        setDoubleField(term16136, term16136.getClass(), "q2", 0.0);
        setDoubleField(term16136, term16136.getClass(), "q3", 0.0);
        term16137 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term16137, term16137.getClass(), "q0", 0.0);
        setDoubleField(term16137, term16137.getClass(), "q1", 0.0);
        setDoubleField(term16137, term16137.getClass(), "q2", 0.0);
        setDoubleField(term16137, term16137.getClass(), "q3", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Object[] args = new Object[2];
        args[0] = term16092;
        args[1] = term16092;
        Object retValue = callMethod(klass, "distance", argTypes, null, args);
        assertTrue(recursiveEquals(term16092, term16136));
        assertTrue(recursiveEquals(term16092, term16137));
        assertTrue(recursiveEquals(retValue, 3.141592653589793));
    }

};


