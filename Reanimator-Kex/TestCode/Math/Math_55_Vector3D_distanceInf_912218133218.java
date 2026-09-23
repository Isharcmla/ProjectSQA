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

public class Vector3D_distanceInf_912218133218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36147;
     Object term36235;

    public Vector3D_distanceInf_912218133218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36147 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term36147, term36147.getClass(), "x", 9.2188684372274053E18);
        setDoubleField(term36147, term36147.getClass(), "y", -9.223372036854776E18);
        setDoubleField(term36147, term36147.getClass(), "z", 4.6071824188000174E18);
        term36235 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term36235, term36235.getClass(), "x", -4.503599627370496E15);
        setDoubleField(term36235, term36235.getClass(), "y", -9.218866238202708E18);
        setDoubleField(term36235, term36235.getClass(), "z", 9.2188684372274053E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term36147;
        args[1] = term36235;
        callMethod(klass, "distanceInf", argTypes, null, args);
    }

};


