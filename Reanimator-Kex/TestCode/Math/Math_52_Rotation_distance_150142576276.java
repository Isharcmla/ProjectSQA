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

public class Rotation_distance_150142576276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18046;
     Object term18168;
     Object term18217;
     Object term18218;

    public Rotation_distance_150142576276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18046 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term18046, term18046.getClass(), "q0", 0.0);
        setDoubleField(term18046, term18046.getClass(), "q1", 0.0);
        setDoubleField(term18046, term18046.getClass(), "q2", 0.0);
        setDoubleField(term18046, term18046.getClass(), "q3", 0.0);
        term18168 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term18168, term18168.getClass(), "q0", 0.0);
        setDoubleField(term18168, term18168.getClass(), "q1", 0.0);
        setDoubleField(term18168, term18168.getClass(), "q2", 0.0);
        setDoubleField(term18168, term18168.getClass(), "q3", 0.0);
        term18217 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term18217, term18217.getClass(), "q0", 0.0);
        setDoubleField(term18217, term18217.getClass(), "q1", 0.0);
        setDoubleField(term18217, term18217.getClass(), "q2", 0.0);
        setDoubleField(term18217, term18217.getClass(), "q3", 0.0);
        term18218 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term18218, term18218.getClass(), "q0", 0.0);
        setDoubleField(term18218, term18218.getClass(), "q1", 0.0);
        setDoubleField(term18218, term18218.getClass(), "q2", 0.0);
        setDoubleField(term18218, term18218.getClass(), "q3", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Object[] args = new Object[2];
        args[0] = term18046;
        args[1] = term18168;
        Object retValue = callMethod(klass, "distance", argTypes, null, args);
        assertTrue(recursiveEquals(term18046, term18217));
        assertTrue(recursiveEquals(term18168, term18218));
        assertTrue(recursiveEquals(retValue, 3.141592653589793));
    }

};


