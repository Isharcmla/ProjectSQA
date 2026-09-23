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

public class Vector3D_distanceInf_912218133224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37496;
     Object term37584;

    public Vector3D_distanceInf_912218133224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37496 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term37496, term37496.getClass(), "x", 6.01433128828931E14);
        setDoubleField(term37496, term37496.getClass(), "y", -9.2058760580442358E18);
        term37584 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term37584, term37584.getClass(), "x", -9.2188332528553165E18);
        setDoubleField(term37584, term37584.getClass(), "y", -9.2059134414731346E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term37496;
        args[1] = term37584;
        callMethod(klass, "distanceInf", argTypes, null, args);
    }

};


