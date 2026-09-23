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

public class Vector3D_getNorm1_939400568173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27062;
     Object term27084;

    public Vector3D_getNorm1_939400568173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27062 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term27062, term27062.getClass(), "x", 4.503599627370497E15);
        setDoubleField(term27062, term27062.getClass(), "y", 0.0);
        setDoubleField(term27062, term27062.getClass(), "z", -9.2188684372274053E18);
        term27084 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term27084, term27084.getClass(), "x", 4.503599627370497E15);
        setDoubleField(term27084, term27084.getClass(), "y", 0.0);
        setDoubleField(term27084, term27084.getClass(), "z", -9.2188684372274053E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNorm1", argTypes, term27062, args);
        assertTrue(recursiveEquals(term27062, term27084));
        assertTrue(recursiveEquals(retValue, 9.223372036854776E18));
    }

};


