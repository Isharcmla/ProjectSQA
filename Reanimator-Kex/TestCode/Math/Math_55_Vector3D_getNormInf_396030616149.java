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

public class Vector3D_getNormInf_396030616149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20568;
     Object term20602;

    public Vector3D_getNormInf_396030616149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20568 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term20568, term20568.getClass(), "x", 0.0);
        setDoubleField(term20568, term20568.getClass(), "y", -9.2188684372274053E18);
        term20602 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term20602, term20602.getClass(), "x", 0.0);
        setDoubleField(term20602, term20602.getClass(), "y", -9.2188684372274053E18);
        setDoubleField(term20602, term20602.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNormInf", argTypes, term20568, args);
        assertTrue(recursiveEquals(term20568, term20602));
        assertTrue(recursiveEquals(retValue, 9.2188684372274053E18));
    }

};


