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

public class Vector3D_distanceInf_912218133202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33023;
     Object term33111;

    public Vector3D_distanceInf_912218133202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33023 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term33023, term33023.getClass(), "x", 0.0);
        setDoubleField(term33023, term33023.getClass(), "y", -9.223372036854776E18);
        setDoubleField(term33023, term33023.getClass(), "z", -9.223372036854776E18);
        term33111 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term33111, term33111.getClass(), "x", -4.503599627370496E15);
        setDoubleField(term33111, term33111.getClass(), "y", 0.0);
        setDoubleField(term33111, term33111.getClass(), "z", -8.0704505322479288E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term33023;
        args[1] = term33111;
        callMethod(klass, "distanceInf", argTypes, null, args);
    }

};


