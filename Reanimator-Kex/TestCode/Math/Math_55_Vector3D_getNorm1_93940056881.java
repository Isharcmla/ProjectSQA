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

public class Vector3D_getNorm1_93940056881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3794;
     Object term3818;

    public Vector3D_getNorm1_93940056881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3794 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term3794, term3794.getClass(), "x", 1.125899906842624E16);
        setDoubleField(term3794, term3794.getClass(), "y", 4.503599627370497E15);
        setDoubleField(term3794, term3794.getClass(), "z", 0.0);
        term3818 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term3818, term3818.getClass(), "x", 1.125899906842624E16);
        setDoubleField(term3818, term3818.getClass(), "y", 4.503599627370497E15);
        setDoubleField(term3818, term3818.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNorm1", argTypes, term3794, args);
        assertTrue(recursiveEquals(term3794, term3818));
        assertTrue(recursiveEquals(retValue, 1.5762598695796736E16));
    }

};


