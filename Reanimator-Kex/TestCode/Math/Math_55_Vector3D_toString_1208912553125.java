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

public class Vector3D_toString_1208912553125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14251;
     Object term15187;

    public Vector3D_toString_1208912553125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14251 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term14251, term14251.getClass(), "x", -9.2188673377157775E18);
        setDoubleField(term14251, term14251.getClass(), "y", -9.2166166374137201E18);
        setDoubleField(term14251, term14251.getClass(), "z", 9.2188684372274053E18);
        term15187 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term15187, term15187.getClass(), "x", -9.2188673377157775E18);
        setDoubleField(term15187, term15187.getClass(), "y", -9.2166166374137201E18);
        setDoubleField(term15187, term15187.getClass(), "z", 9.2188684372274053E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term14251, args);
        assertTrue(recursiveEquals(term14251, term15187));
        assertTrue(recursiveEquals(retValue, "{-9,218,867,337,715,777,500; -9,216,616,637,413,720,100; 9,218,868,437,227,405,300}"));
    }

};


