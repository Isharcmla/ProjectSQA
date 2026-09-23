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

public class Vector3D_isInfinite_169081290689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5084;
     Object term5098;

    public Vector3D_isInfinite_169081290689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5084 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term5084, term5084.getClass(), "x", 9.2188684372274053E18);
        setDoubleField(term5084, term5084.getClass(), "y", -9.2188684372274053E18);
        setDoubleField(term5084, term5084.getClass(), "z", -9.2188684372274053E18);
        term5098 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term5098, term5098.getClass(), "x", 9.2188684372274053E18);
        setDoubleField(term5098, term5098.getClass(), "y", -9.2188684372274053E18);
        setDoubleField(term5098, term5098.getClass(), "z", -9.2188684372274053E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isInfinite", argTypes, term5084, args);
        assertTrue(recursiveEquals(term5084, term5098));
        assertTrue(recursiveEquals(retValue, false));
    }

};


