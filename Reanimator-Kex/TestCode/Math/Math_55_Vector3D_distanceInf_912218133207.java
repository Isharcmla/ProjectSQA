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

public class Vector3D_distanceInf_912218133207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34349;
     Object term34437;

    public Vector3D_distanceInf_912218133207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34349 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term34349, term34349.getClass(), "x", -1.08765927093491123E18);
        setDoubleField(term34349, term34349.getClass(), "y", 2.251791257711136E15);
        setDoubleField(term34349, term34349.getClass(), "z", -9.223372036854776E18);
        term34437 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term34437, term34437.getClass(), "x", -1.08265384232046925E18);
        setDoubleField(term34437, term34437.getClass(), "y", 6.75539944210432E15);
        setDoubleField(term34437, term34437.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term34349;
        args[1] = term34437;
        callMethod(klass, "distanceInf", argTypes, null, args);
    }

};


