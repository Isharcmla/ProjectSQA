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

public class Rotation_distance_150142576282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18781;
     Object term18903;
     Object term19692;
     Object term19693;

    public Rotation_distance_150142576282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18781 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term18781, term18781.getClass(), "q0", 0.0);
        setDoubleField(term18781, term18781.getClass(), "q1", 0.0);
        setDoubleField(term18781, term18781.getClass(), "q2", 0.0);
        setDoubleField(term18781, term18781.getClass(), "q3", 0.0);
        term18903 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term18903, term18903.getClass(), "q0", 0.0);
        setDoubleField(term18903, term18903.getClass(), "q1", 0.0);
        setDoubleField(term18903, term18903.getClass(), "q2", 0.0);
        setDoubleField(term18903, term18903.getClass(), "q3", 0.0);
        term19692 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term19692, term19692.getClass(), "q0", 0.0);
        setDoubleField(term19692, term19692.getClass(), "q1", 0.0);
        setDoubleField(term19692, term19692.getClass(), "q2", 0.0);
        setDoubleField(term19692, term19692.getClass(), "q3", 0.0);
        term19693 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term19693, term19693.getClass(), "q0", 0.0);
        setDoubleField(term19693, term19693.getClass(), "q1", 0.0);
        setDoubleField(term19693, term19693.getClass(), "q2", 0.0);
        setDoubleField(term19693, term19693.getClass(), "q3", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Object[] args = new Object[2];
        args[0] = term18781;
        args[1] = term18903;
        Object retValue = callMethod(klass, "distance", argTypes, null, args);
        assertTrue(recursiveEquals(term18781, term19692));
        assertTrue(recursiveEquals(term18903, term19693));
        assertTrue(recursiveEquals(retValue, 3.141592653589793));
    }

};


