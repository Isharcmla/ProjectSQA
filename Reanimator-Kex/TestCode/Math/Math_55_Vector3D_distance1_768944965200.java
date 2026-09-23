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

public class Vector3D_distance1_768944965200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32145;
     Object term32233;

    public Vector3D_distance1_768944965200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32145 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term32145, term32145.getClass(), "x", -1.16980780418623078E18);
        setDoubleField(term32145, term32145.getClass(), "y", 4.8819547726277509E18);
        term32233 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term32233, term32233.getClass(), "x", 8.0597546205718774E18);
        setDoubleField(term32233, term32233.getClass(), "y", 4.8976733908584366E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term32145;
        args[1] = term32233;
        callMethod(klass, "distance1", argTypes, null, args);
    }

};


