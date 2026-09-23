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

public class Vector3D_toString_1208912553141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18892;
     Object term19830;

    public Vector3D_toString_1208912553141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18892 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term18892, term18892.getClass(), "x", -9.2188684200475361E18);
        setDoubleField(term18892, term18892.getClass(), "y", -9.2188678874715914E18);
        setDoubleField(term18892, term18892.getClass(), "z", -9.2166166374137201E18);
        term19830 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term19830, term19830.getClass(), "x", -9.2188684200475361E18);
        setDoubleField(term19830, term19830.getClass(), "y", -9.2188678874715914E18);
        setDoubleField(term19830, term19830.getClass(), "z", -9.2166166374137201E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term18892, args);
        assertTrue(recursiveEquals(term18892, term19830));
        assertTrue(recursiveEquals(retValue, "{-9,218,868,420,047,536,100; -9,218,867,887,471,591,400; -9,216,616,637,413,720,100}"));
    }

};


