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

public class Vector3D_toString_1208912553123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12722;
     Object term13538;

    public Vector3D_toString_1208912553123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12722 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term12722, term12722.getClass(), "x", -9.2166166374137201E18);
        setDoubleField(term12722, term12722.getClass(), "y", -9.2166166374137201E18);
        term13538 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term13538, term13538.getClass(), "x", -9.2166166374137201E18);
        setDoubleField(term13538, term13538.getClass(), "y", -9.2166166374137201E18);
        setDoubleField(term13538, term13538.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term12722, args);
        assertTrue(recursiveEquals(term12722, term13538));
        assertTrue(recursiveEquals(retValue, "{-9,216,616,637,413,720,100; -9,216,616,637,413,720,100; 0}"));
    }

};


