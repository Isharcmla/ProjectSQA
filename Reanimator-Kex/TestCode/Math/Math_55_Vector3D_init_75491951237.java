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
import java.lang.Double;

public class Vector3D_init_75491951237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11;
     Object term13;
     Object term622;
     Object term623;

    public Vector3D_init_75491951237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11 = new Double(0.40176586625454525);
        term13 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term13, term13.getClass(), "x", 0.2641345529914265);
        setDoubleField(term13, term13.getClass(), "y", 0.36923381893433327);
        setDoubleField(term13, term13.getClass(), "z", 0.6076495596892013);
        term622 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term622, term622.getClass(), "x", 0.10612024749035756);
        setDoubleField(term622, term622.getClass(), "y", 0.1483455451146263);
        setDoubleField(term622, term622.getClass(), "z", 0.24413285172772498);
        term623 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term623, term623.getClass(), "x", 0.2641345529914265);
        setDoubleField(term623, term623.getClass(), "y", 0.36923381893433327);
        setDoubleField(term623, term623.getClass(), "z", 0.6076495596892013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term11;
        args[1] = term13;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term622));
        assertTrue(recursiveEquals(term11, 0.40176586625454525));
        assertTrue(recursiveEquals(term13, term623));
    }

};


