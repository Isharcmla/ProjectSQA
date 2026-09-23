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

public class Vector3D_equals_2126608378159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23011;
     Object term23099;
     Object term23126;
     Object term23127;

    public Vector3D_equals_2126608378159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23011 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term23011, term23011.getClass(), "x", -8.9351416607030641E18);
        setDoubleField(term23011, term23011.getClass(), "y", -9.2143648376000348E18);
        setDoubleField(term23011, term23011.getClass(), "z", 4.8008596227746693E18);
        term23099 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term23099, term23099.getClass(), "x", -8.9351416607030641E18);
        setDoubleField(term23099, term23099.getClass(), "y", -9.2143648376000348E18);
        setDoubleField(term23099, term23099.getClass(), "z", -4.5170880062548869E18);
        term23126 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term23126, term23126.getClass(), "x", -8.9351416607030641E18);
        setDoubleField(term23126, term23126.getClass(), "y", -9.2143648376000348E18);
        setDoubleField(term23126, term23126.getClass(), "z", 4.8008596227746693E18);
        term23127 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term23127, term23127.getClass(), "x", -8.9351416607030641E18);
        setDoubleField(term23127, term23127.getClass(), "y", -9.2143648376000348E18);
        setDoubleField(term23127, term23127.getClass(), "z", -4.5170880062548869E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term23099;
        Object retValue = callMethod(klass, "equals", argTypes, term23011, args);
        assertTrue(recursiveEquals(term23011, term23126));
        assertTrue(recursiveEquals(term23099, term23127));
        assertTrue(recursiveEquals(retValue, false));
    }

};


