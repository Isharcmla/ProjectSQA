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

public class Vector3D_equals_2126608378109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7898;
     Object term7986;
     Object term8013;
     Object term8014;

    public Vector3D_equals_2126608378109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7898 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        term7986 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        term8013 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term8013, term8013.getClass(), "x", 0.0);
        setDoubleField(term8013, term8013.getClass(), "y", 0.0);
        setDoubleField(term8013, term8013.getClass(), "z", 0.0);
        term8014 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term8014, term8014.getClass(), "x", 0.0);
        setDoubleField(term8014, term8014.getClass(), "y", 0.0);
        setDoubleField(term8014, term8014.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7986;
        Object retValue = callMethod(klass, "equals", argTypes, term7898, args);
        assertTrue(recursiveEquals(term7898, term8013));
        assertTrue(recursiveEquals(term7986, term8014));
        assertTrue(recursiveEquals(retValue, true));
    }

};


