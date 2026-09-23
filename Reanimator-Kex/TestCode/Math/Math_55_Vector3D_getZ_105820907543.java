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

public class Vector3D_getZ_105820907543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79;
     Object term710;

    public Vector3D_getZ_105820907543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term79, term79.getClass(), "x", 0.15917839663695388);
        setDoubleField(term79, term79.getClass(), "y", 0.9374115574082594);
        setDoubleField(term79, term79.getClass(), "z", 0.8454723071922143);
        term710 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term710, term710.getClass(), "x", 0.15917839663695388);
        setDoubleField(term710, term710.getClass(), "y", 0.9374115574082594);
        setDoubleField(term710, term710.getClass(), "z", 0.8454723071922143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getZ", argTypes, term79, args);
        assertTrue(recursiveEquals(term79, term710));
        assertTrue(recursiveEquals(retValue, 0.8454723071922143));
    }

};


