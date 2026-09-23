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

public class Vector3D_distance1_768944965131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17455;
     Object term17543;
     Object term17571;
     Object term17572;

    public Vector3D_distance1_768944965131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17455 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term17455, term17455.getClass(), "x", -9.223372036854776E18);
        term17543 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term17543, term17543.getClass(), "x", 0.0);
        term17571 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term17571, term17571.getClass(), "x", -9.223372036854776E18);
        setDoubleField(term17571, term17571.getClass(), "y", 0.0);
        setDoubleField(term17571, term17571.getClass(), "z", 0.0);
        term17572 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term17572, term17572.getClass(), "x", 0.0);
        setDoubleField(term17572, term17572.getClass(), "y", 0.0);
        setDoubleField(term17572, term17572.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term17455;
        args[1] = term17543;
        Object retValue = callMethod(klass, "distance1", argTypes, null, args);
        assertTrue(recursiveEquals(term17455, term17571));
        assertTrue(recursiveEquals(term17543, term17572));
        assertTrue(recursiveEquals(retValue, 9.223372036854776E18));
    }

};


