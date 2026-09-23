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

public class Vector3D_getAlpha_320116145177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27342;
     Object term27365;

    public Vector3D_getAlpha_320116145177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27342 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term27342, term27342.getClass(), "y", 0.0);
        setDoubleField(term27342, term27342.getClass(), "x", -9.2188684372274053E18);
        term27365 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term27365, term27365.getClass(), "x", -9.2188684372274053E18);
        setDoubleField(term27365, term27365.getClass(), "y", 0.0);
        setDoubleField(term27365, term27365.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAlpha", argTypes, term27342, args);
        assertTrue(recursiveEquals(term27342, term27365));
        assertTrue(recursiveEquals(retValue, 3.141592653589793));
    }

};


