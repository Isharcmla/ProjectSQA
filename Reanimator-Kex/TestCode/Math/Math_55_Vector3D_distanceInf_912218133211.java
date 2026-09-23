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

public class Vector3D_distanceInf_912218133211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35119;
     Object term35207;

    public Vector3D_distanceInf_912218133211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35119 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term35119, term35119.getClass(), "x", 6.4691854655488E13);
        setDoubleField(term35119, term35119.getClass(), "y", -9.223372036854776E18);
        term35207 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term35207, term35207.getClass(), "x", -9.218868437226881E18);
        setDoubleField(term35207, term35207.getClass(), "y", -9.0792568487789199E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term35119;
        args[1] = term35207;
        callMethod(klass, "distanceInf", argTypes, null, args);
    }

};


