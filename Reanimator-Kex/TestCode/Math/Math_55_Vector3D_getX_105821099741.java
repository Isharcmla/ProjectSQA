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

public class Vector3D_getX_105821099741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71;
     Object term708;

    public Vector3D_getX_105821099741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term71, term71.getClass(), "x", 0.5873228247510078);
        setDoubleField(term71, term71.getClass(), "y", 0.8823181080774973);
        setDoubleField(term71, term71.getClass(), "z", 0.2192450926212024);
        term708 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term708, term708.getClass(), "x", 0.5873228247510078);
        setDoubleField(term708, term708.getClass(), "y", 0.8823181080774973);
        setDoubleField(term708, term708.getClass(), "z", 0.2192450926212024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getX", argTypes, term71, args);
        assertTrue(recursiveEquals(term71, term708));
        assertTrue(recursiveEquals(retValue, 0.5873228247510078));
    }

};


