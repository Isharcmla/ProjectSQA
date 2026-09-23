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

public class Vector3D_toString_1208912553169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26020;
     Object term26750;

    public Vector3D_toString_1208912553169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26020 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term26020, term26020.getClass(), "x", -9.2166166374137201E18);
        term26750 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term26750, term26750.getClass(), "x", -9.2166166374137201E18);
        setDoubleField(term26750, term26750.getClass(), "y", 0.0);
        setDoubleField(term26750, term26750.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term26020, args);
        assertTrue(recursiveEquals(term26020, term26750));
        assertTrue(recursiveEquals(retValue, "{-9,216,616,637,413,720,100; 0; 0}"));
    }

};


