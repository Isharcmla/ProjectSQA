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

public class Vector3D_equals_2126608378155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22509;
     Object term22597;
     Object term22622;
     Object term22623;

    public Vector3D_equals_2126608378155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22509 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term22509, term22509.getClass(), "x", -9.21872769973905E18);
        setDoubleField(term22509, term22509.getClass(), "y", 4.7040098223312087E18);
        term22597 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term22597, term22597.getClass(), "x", -9.21872769973905E18);
        setDoubleField(term22597, term22597.getClass(), "y", 1.86899396078601216E17);
        setDoubleField(term22597, term22597.getClass(), "z", -8.6469112834776105E18);
        term22622 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term22622, term22622.getClass(), "x", -9.21872769973905E18);
        setDoubleField(term22622, term22622.getClass(), "y", 4.7040098223312087E18);
        setDoubleField(term22622, term22622.getClass(), "z", 0.0);
        term22623 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term22623, term22623.getClass(), "x", -9.21872769973905E18);
        setDoubleField(term22623, term22623.getClass(), "y", 1.86899396078601216E17);
        setDoubleField(term22623, term22623.getClass(), "z", -8.6469112834776105E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term22597;
        Object retValue = callMethod(klass, "equals", argTypes, term22509, args);
        assertTrue(recursiveEquals(term22509, term22622));
        assertTrue(recursiveEquals(term22597, term22623));
        assertTrue(recursiveEquals(retValue, false));
    }

};


