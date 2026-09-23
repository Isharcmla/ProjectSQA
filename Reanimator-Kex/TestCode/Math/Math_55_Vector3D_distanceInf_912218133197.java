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

public class Vector3D_distanceInf_912218133197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31574;
     Object term31662;

    public Vector3D_distanceInf_912218133197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31574 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term31574, term31574.getClass(), "x", 4.5751701321297434E18);
        setDoubleField(term31574, term31574.getClass(), "y", 3.377699720527872E15);
        setDoubleField(term31574, term31574.getClass(), "z", -4.6071648264937697E18);
        term31662 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term31662, term31662.getClass(), "x", -4.6150854532197048E18);
        setDoubleField(term31662, term31662.getClass(), "y", 3.377699720527873E15);
        setDoubleField(term31662, term31662.getClass(), "z", 4.6076771996254945E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term31574;
        args[1] = term31662;
        callMethod(klass, "distanceInf", argTypes, null, args);
    }

};


