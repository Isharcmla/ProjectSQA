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

public class Vector3D_toString_1208912553129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16186;
     Object term17002;

    public Vector3D_toString_1208912553129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16186 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term16186, term16186.getClass(), "x", -9.2166166374137201E18);
        setDoubleField(term16186, term16186.getClass(), "y", -9.2166166374137201E18);
        term17002 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term17002, term17002.getClass(), "x", -9.2166166374137201E18);
        setDoubleField(term17002, term17002.getClass(), "y", -9.2166166374137201E18);
        setDoubleField(term17002, term17002.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term16186, args);
        assertTrue(recursiveEquals(term16186, term17002));
        assertTrue(recursiveEquals(retValue, "{-9,216,616,637,413,720,100; -9,216,616,637,413,720,100; 0}"));
    }

};


