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

public class Vector3D_getDelta_1516080757137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18061;
     Object term18080;

    public Vector3D_getDelta_1516080757137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18061 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term18061, term18061.getClass(), "z", 4.6071824188000174E18);
        setDoubleField(term18061, term18061.getClass(), "x", 0.0);
        setDoubleField(term18061, term18061.getClass(), "y", 0.0);
        term18080 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term18080, term18080.getClass(), "x", 0.0);
        setDoubleField(term18080, term18080.getClass(), "y", 0.0);
        setDoubleField(term18080, term18080.getClass(), "z", 4.6071824188000174E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDelta", argTypes, term18061, args);
        assertTrue(recursiveEquals(term18061, term18080));
        assertTrue(recursiveEquals(retValue, 1.5707963267948966));
    }

};


