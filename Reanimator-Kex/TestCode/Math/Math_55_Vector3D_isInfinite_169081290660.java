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

public class Vector3D_isInfinite_169081290660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173;
     Object term2116;

    public Vector3D_isInfinite_169081290660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term173, term173.getClass(), "x", 0.3074693824288357);
        setDoubleField(term173, term173.getClass(), "y", 0.1245258965512791);
        setDoubleField(term173, term173.getClass(), "z", 0.9511861072660375);
        term2116 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term2116, term2116.getClass(), "x", 0.3074693824288357);
        setDoubleField(term2116, term2116.getClass(), "y", 0.1245258965512791);
        setDoubleField(term2116, term2116.getClass(), "z", 0.9511861072660375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isInfinite", argTypes, term173, args);
        assertTrue(recursiveEquals(term173, term2116));
        assertTrue(recursiveEquals(retValue, false));
    }

};


