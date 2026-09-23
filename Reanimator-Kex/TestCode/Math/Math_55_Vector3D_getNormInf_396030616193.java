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

public class Vector3D_getNormInf_396030616193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29904;
     Object term29940;

    public Vector3D_getNormInf_396030616193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29904 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term29904, term29904.getClass(), "x", 0.0);
        setDoubleField(term29904, term29904.getClass(), "y", 4.503599627370497E15);
        term29940 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term29940, term29940.getClass(), "x", 0.0);
        setDoubleField(term29940, term29940.getClass(), "y", 4.503599627370497E15);
        setDoubleField(term29940, term29940.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNormInf", argTypes, term29904, args);
        assertTrue(recursiveEquals(term29904, term29940));
        assertTrue(recursiveEquals(retValue, 4.503599627370497E15));
    }

};


