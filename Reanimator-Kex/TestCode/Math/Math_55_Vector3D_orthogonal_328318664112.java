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

public class Vector3D_orthogonal_328318664112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8142;
     Object term8346;
     Object term8342;

    public Vector3D_orthogonal_328318664112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8142 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term8142, term8142.getClass(), "x", -9.2206698766756383E18);
        setDoubleField(term8142, term8142.getClass(), "y", 0.0);
        setDoubleField(term8142, term8142.getClass(), "z", 0.0);
        term8346 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term8346, term8346.getClass(), "x", -9.2206698766756383E18);
        setDoubleField(term8346, term8346.getClass(), "y", 0.0);
        setDoubleField(term8346, term8346.getClass(), "z", 0.0);
        term8342 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term8342, term8342.getClass(), "x", -0.0);
        setDoubleField(term8342, term8342.getClass(), "y", 0.0);
        setDoubleField(term8342, term8342.getClass(), "z", -1.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "orthogonal", argTypes, term8142, args);
        assertTrue(recursiveEquals(term8142, term8346));
        assertTrue(recursiveEquals(retValue, term8342));
    }

};


