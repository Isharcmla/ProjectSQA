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

public class Rotation_distance_150142576272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17448;
     Object term17570;
     Object term17619;
     Object term17620;

    public Rotation_distance_150142576272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17448 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term17448, term17448.getClass(), "q0", 0.0);
        setDoubleField(term17448, term17448.getClass(), "q1", 0.0);
        setDoubleField(term17448, term17448.getClass(), "q2", 0.0);
        setDoubleField(term17448, term17448.getClass(), "q3", 0.0);
        term17570 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term17570, term17570.getClass(), "q0", 0.0);
        setDoubleField(term17570, term17570.getClass(), "q1", 0.0);
        setDoubleField(term17570, term17570.getClass(), "q2", 0.0);
        setDoubleField(term17570, term17570.getClass(), "q3", 0.0);
        term17619 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term17619, term17619.getClass(), "q0", 0.0);
        setDoubleField(term17619, term17619.getClass(), "q1", 0.0);
        setDoubleField(term17619, term17619.getClass(), "q2", 0.0);
        setDoubleField(term17619, term17619.getClass(), "q3", 0.0);
        term17620 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term17620, term17620.getClass(), "q0", 0.0);
        setDoubleField(term17620, term17620.getClass(), "q1", 0.0);
        setDoubleField(term17620, term17620.getClass(), "q2", 0.0);
        setDoubleField(term17620, term17620.getClass(), "q3", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Object[] args = new Object[2];
        args[0] = term17448;
        args[1] = term17570;
        Object retValue = callMethod(klass, "distance", argTypes, null, args);
        assertTrue(recursiveEquals(term17448, term17619));
        assertTrue(recursiveEquals(term17570, term17620));
        assertTrue(recursiveEquals(retValue, 3.141592653589793));
    }

};


