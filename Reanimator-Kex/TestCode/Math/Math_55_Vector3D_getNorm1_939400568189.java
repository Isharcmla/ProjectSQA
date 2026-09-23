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

public class Vector3D_getNorm1_939400568189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29523;
     Object term29547;

    public Vector3D_getNorm1_939400568189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29523 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term29523, term29523.getClass(), "x", 0.0);
        term29547 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term29547, term29547.getClass(), "x", 0.0);
        setDoubleField(term29547, term29547.getClass(), "y", 0.0);
        setDoubleField(term29547, term29547.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNorm1", argTypes, term29523, args);
        assertTrue(recursiveEquals(term29523, term29547));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


