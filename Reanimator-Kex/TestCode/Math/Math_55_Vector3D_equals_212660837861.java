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

public class Vector3D_equals_212660837861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177;
     Object term181;
     Object term2126;
     Object term2127;

    public Vector3D_equals_212660837861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term177, term177.getClass(), "x", 0.05880719443135807);
        setDoubleField(term177, term177.getClass(), "y", 0.34010089048558567);
        setDoubleField(term177, term177.getClass(), "z", 0.19625398866403143);
        term181 = newInstance(Class.forName("java.lang.Object"));
        term2126 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term2126, term2126.getClass(), "x", 0.05880719443135807);
        setDoubleField(term2126, term2126.getClass(), "y", 0.34010089048558567);
        setDoubleField(term2126, term2126.getClass(), "z", 0.19625398866403143);
        term2127 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term181;
        Object retValue = callMethod(klass, "equals", argTypes, term177, args);
        assertTrue(recursiveEquals(term177, term2126));
        assertTrue(recursiveEquals(term181, term2127));
        assertTrue(recursiveEquals(retValue, false));
    }

};


