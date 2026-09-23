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

public class Vector3D_getNorm1_939400568181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27632;
     Object term27656;

    public Vector3D_getNorm1_939400568181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27632 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term27632, term27632.getClass(), "x", 9.00719925474112E15);
        setDoubleField(term27632, term27632.getClass(), "y", 0.0);
        setDoubleField(term27632, term27632.getClass(), "z", 4.503599627370497E15);
        term27656 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term27656, term27656.getClass(), "x", 9.00719925474112E15);
        setDoubleField(term27656, term27656.getClass(), "y", 0.0);
        setDoubleField(term27656, term27656.getClass(), "z", 4.503599627370497E15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNorm1", argTypes, term27632, args);
        assertTrue(recursiveEquals(term27632, term27656));
        assertTrue(recursiveEquals(retValue, 1.3510798882111616E16));
    }

};


