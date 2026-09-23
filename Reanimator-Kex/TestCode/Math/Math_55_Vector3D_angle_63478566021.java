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

public class Vector3D_angle_63478566021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151;
     Object term155;

    public Vector3D_angle_63478566021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term151, term151.getClass(), "x", 0.07417792024383196);
        setDoubleField(term151, term151.getClass(), "y", 0.686293604788188);
        setDoubleField(term151, term151.getClass(), "z", 0.12764449157430724);
        term155 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term155, term155.getClass(), "x", 0.39446728256884744);
        setDoubleField(term155, term155.getClass(), "y", 0.7865909711092062);
        setDoubleField(term155, term155.getClass(), "z", 0.06587158449170749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term151;
        args[1] = term155;
        callMethod(klass, "angle", argTypes, null, args);
    }

};


