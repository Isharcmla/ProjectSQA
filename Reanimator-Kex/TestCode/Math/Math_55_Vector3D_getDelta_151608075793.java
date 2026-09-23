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

public class Vector3D_getDelta_151608075793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5386;
     Object term5405;

    public Vector3D_getDelta_151608075793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5386 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term5386, term5386.getClass(), "z", 4.6071824188000174E18);
        setDoubleField(term5386, term5386.getClass(), "x", 0.0);
        setDoubleField(term5386, term5386.getClass(), "y", 0.0);
        term5405 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term5405, term5405.getClass(), "x", 0.0);
        setDoubleField(term5405, term5405.getClass(), "y", 0.0);
        setDoubleField(term5405, term5405.getClass(), "z", 4.6071824188000174E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDelta", argTypes, term5386, args);
        assertTrue(recursiveEquals(term5386, term5405));
        assertTrue(recursiveEquals(retValue, 1.5707963267948966));
    }

};


