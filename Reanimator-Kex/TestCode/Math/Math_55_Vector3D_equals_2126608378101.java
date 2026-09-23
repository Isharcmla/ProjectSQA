package org.apache.commons.math.geometry;

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
import static org.apache.commons.math.geometry.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.geometry.EqualityUtils.*;

public class Vector3D_equals_2126608378101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6884;
     Object term6891;
     Object term6892;

    public Vector3D_equals_2126608378101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6884 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        term6891 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term6891, term6891.getClass(), "x", 0.0);
        setDoubleField(term6891, term6891.getClass(), "y", 0.0);
        setDoubleField(term6891, term6891.getClass(), "z", 0.0);
        term6892 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term6892, term6892.getClass(), "x", 0.0);
        setDoubleField(term6892, term6892.getClass(), "y", 0.0);
        setDoubleField(term6892, term6892.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6884;
        Object retValue = callMethod(klass, "equals", argTypes, term6884, args);
        assertTrue(recursiveEquals(term6884, term6891));
        assertTrue(recursiveEquals(term6884, term6892));
        assertTrue(recursiveEquals(retValue, true));
    }

};


