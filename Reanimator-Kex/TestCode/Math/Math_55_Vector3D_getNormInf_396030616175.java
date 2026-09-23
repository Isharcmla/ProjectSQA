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

public class Vector3D_getNormInf_396030616175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27203;
     Object term27235;

    public Vector3D_getNormInf_396030616175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27203 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term27203, term27203.getClass(), "x", -9.2053576383452938E18);
        setDoubleField(term27203, term27203.getClass(), "y", 0.0);
        setDoubleField(term27203, term27203.getClass(), "z", -9.2188684372274053E18);
        term27235 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term27235, term27235.getClass(), "x", -9.2053576383452938E18);
        setDoubleField(term27235, term27235.getClass(), "y", 0.0);
        setDoubleField(term27235, term27235.getClass(), "z", -9.2188684372274053E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNormInf", argTypes, term27203, args);
        assertTrue(recursiveEquals(term27203, term27235));
        assertTrue(recursiveEquals(retValue, 9.2188684372274053E18));
    }

};


