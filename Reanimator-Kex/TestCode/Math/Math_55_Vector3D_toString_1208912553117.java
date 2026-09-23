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

public class Vector3D_toString_1208912553117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10823;
     Object term11637;

    public Vector3D_toString_1208912553117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10823 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term10823, term10823.getClass(), "x", -9.2166166374137201E18);
        setDoubleField(term10823, term10823.getClass(), "y", 9.2188684372274053E18);
        term11637 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term11637, term11637.getClass(), "x", -9.2166166374137201E18);
        setDoubleField(term11637, term11637.getClass(), "y", 9.2188684372274053E18);
        setDoubleField(term11637, term11637.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term10823, args);
        assertTrue(recursiveEquals(term10823, term11637));
        assertTrue(recursiveEquals(retValue, "{-9,216,616,637,413,720,100; 9,218,868,437,227,405,300; 0}"));
    }

};


