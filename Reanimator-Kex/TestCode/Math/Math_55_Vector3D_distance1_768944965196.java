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

public class Vector3D_distance1_768944965196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31349;
     Object term31437;

    public Vector3D_distance1_768944965196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31349 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term31349, term31349.getClass(), "x", 6.4691854655488E13);
        setDoubleField(term31349, term31349.getClass(), "y", -9.223372036854776E18);
        term31437 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term31437, term31437.getClass(), "x", -9.218868437226881E18);
        setDoubleField(term31437, term31437.getClass(), "y", -9.0792568487789199E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term31349;
        args[1] = term31437;
        callMethod(klass, "distance1", argTypes, null, args);
    }

};


