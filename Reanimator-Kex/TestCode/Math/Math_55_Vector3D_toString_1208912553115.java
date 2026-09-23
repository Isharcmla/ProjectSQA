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

public class Vector3D_toString_1208912553115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9453;
     Object term10150;

    public Vector3D_toString_1208912553115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9453 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term9453, term9453.getClass(), "x", 9.2188684372274053E18);
        term10150 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term10150, term10150.getClass(), "x", 9.2188684372274053E18);
        setDoubleField(term10150, term10150.getClass(), "y", 0.0);
        setDoubleField(term10150, term10150.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term9453, args);
        assertTrue(recursiveEquals(term9453, term10150));
        assertTrue(recursiveEquals(retValue, "{9,218,868,437,227,405,300; 0; 0}"));
    }

};


