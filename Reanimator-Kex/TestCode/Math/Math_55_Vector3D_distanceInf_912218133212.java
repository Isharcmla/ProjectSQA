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

public class Vector3D_distanceInf_912218133212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35339;
     Object term35427;

    public Vector3D_distanceInf_912218133212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35339 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term35339, term35339.getClass(), "x", -2.3257573638159729E18);
        setDoubleField(term35339, term35339.getClass(), "y", 9.042695347503872E15);
        setDoubleField(term35339, term35339.getClass(), "z", 9.2188684372274053E18);
        term35427 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term35427, term35427.getClass(), "x", -2.3080019002948321E18);
        setDoubleField(term35427, term35427.getClass(), "y", 1.680053767241728E15);
        setDoubleField(term35427, term35427.getClass(), "z", -4.503599627370496E15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term35339;
        args[1] = term35427;
        callMethod(klass, "distanceInf", argTypes, null, args);
    }

};


