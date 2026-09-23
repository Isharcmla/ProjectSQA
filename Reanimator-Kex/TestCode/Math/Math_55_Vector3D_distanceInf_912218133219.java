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

public class Vector3D_distanceInf_912218133219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36371;
     Object term36459;

    public Vector3D_distanceInf_912218133219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36371 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term36371, term36371.getClass(), "x", -3.4227181246155305E18);
        setDoubleField(term36371, term36371.getClass(), "y", -9.2211186178384036E18);
        setDoubleField(term36371, term36371.getClass(), "z", 5.62954516824064E14);
        term36459 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term36459, term36459.getClass(), "x", -3.4587645138200166E18);
        setDoubleField(term36459, term36459.getClass(), "y", -9.2188707381234893E18);
        setDoubleField(term36459, term36459.getClass(), "z", 5.62954516824064E14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term36371;
        args[1] = term36459;
        callMethod(klass, "distanceInf", argTypes, null, args);
    }

};


