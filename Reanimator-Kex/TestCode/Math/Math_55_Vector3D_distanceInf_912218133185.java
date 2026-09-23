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
import static org.apache.commons.math.geometry.EqualityUtils.*;

public class Vector3D_distanceInf_912218133185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27902;
     Object term27990;
     Object term28028;
     Object term28029;

    public Vector3D_distanceInf_912218133185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27902 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term27902, term27902.getClass(), "x", -9.223372036854776E18);
        term27990 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term27990, term27990.getClass(), "x", 0.0);
        term28028 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term28028, term28028.getClass(), "x", -9.223372036854776E18);
        setDoubleField(term28028, term28028.getClass(), "y", 0.0);
        setDoubleField(term28028, term28028.getClass(), "z", 0.0);
        term28029 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term28029, term28029.getClass(), "x", 0.0);
        setDoubleField(term28029, term28029.getClass(), "y", 0.0);
        setDoubleField(term28029, term28029.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term27902;
        args[1] = term27990;
        Object retValue = callMethod(klass, "distanceInf", argTypes, null, args);
        assertTrue(recursiveEquals(term27902, term28028));
        assertTrue(recursiveEquals(term27990, term28029));
        assertTrue(recursiveEquals(retValue, 9.223372036854776E18));
    }

};


