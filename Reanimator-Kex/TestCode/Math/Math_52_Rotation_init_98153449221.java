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
import java.lang.Double;
import java.lang.Boolean;

public class Rotation_init_98153449221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term5;
     Object term7;
     Object term9;
     Object term301;

    public Rotation_init_98153449221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Double(0.13238746331190498);
        term3 = new Double(0.3455959125047594);
        term5 = new Double(0.5523635872663106);
        term7 = new Double(0.544608645520025);
        term9 = new Boolean(false);
        term301 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term301, term301.getClass(), "q0", 0.13238746331190498);
        setDoubleField(term301, term301.getClass(), "q1", 0.3455959125047594);
        setDoubleField(term301, term301.getClass(), "q2", 0.5523635872663106);
        setDoubleField(term301, term301.getClass(), "q3", 0.544608645520025);
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
        args[0] = term1;
        args[1] = term3;
        args[2] = term5;
        args[3] = term7;
        args[4] = term9;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term301));
        assertTrue(recursiveEquals(term1, 0.13238746331190498));
        assertTrue(recursiveEquals(term3, 0.3455959125047594));
        assertTrue(recursiveEquals(term5, 0.5523635872663106));
        assertTrue(recursiveEquals(term7, 0.544608645520025));
        assertTrue(recursiveEquals(term9, false));
    }

};


