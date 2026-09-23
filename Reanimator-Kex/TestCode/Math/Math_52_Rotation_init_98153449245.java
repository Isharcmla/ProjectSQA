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
import java.lang.Object;
import java.lang.Double;

public class Rotation_init_98153449245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4301;

    public Rotation_init_98153449245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4150 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        term4301 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term4301, term4301.getClass(), "q0", Double.NaN);
        setDoubleField(term4301, term4301.getClass(), "q1", Double.NaN);
        setDoubleField(term4301, term4301.getClass(), "q2", Double.NaN);
        setDoubleField(term4301, term4301.getClass(), "q3", Double.NaN);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = 0.0;
        args[1] = 0.0;
        args[2] = 0.0;
        args[3] = 0.0;
        args[4] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4301));
    }

};


