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

public class Vector3D_distance1_768944965223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37283;
     Object term37371;

    public Vector3D_distance1_768944965223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37283 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term37283, term37283.getClass(), "x", -9.1828396399232287E18);
        setDoubleField(term37283, term37283.getClass(), "y", -9.2233632407617536E18);
        setDoubleField(term37283, term37283.getClass(), "z", -4.5936876355154084E18);
        term37371 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term37371, term37371.getClass(), "x", -9.2233720368547103E18);
        setDoubleField(term37371, term37371.getClass(), "y", -9.2233632407617536E18);
        setDoubleField(term37371, term37371.getClass(), "z", 4.7558012064950641E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term37283;
        args[1] = term37371;
        callMethod(klass, "distance1", argTypes, null, args);
    }

};


