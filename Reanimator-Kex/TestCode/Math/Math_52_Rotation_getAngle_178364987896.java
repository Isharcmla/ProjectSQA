package org.apache.commons.math.geometry.euclidean.threed;

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
import static org.apache.commons.math.geometry.euclidean.threed.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.geometry.euclidean.threed.EqualityUtils.*;

public class Rotation_getAngle_178364987896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26545;
     Object term26570;

    public Rotation_getAngle_178364987896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26545 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term26545, term26545.getClass(), "q0", -1.531216987936522E16);
        setDoubleField(term26545, term26545.getClass(), "q1", 0.0);
        setDoubleField(term26545, term26545.getClass(), "q2", 0.0);
        setDoubleField(term26545, term26545.getClass(), "q3", 0.0);
        term26570 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term26570, term26570.getClass(), "q0", -1.531216987936522E16);
        setDoubleField(term26570, term26570.getClass(), "q1", 0.0);
        setDoubleField(term26570, term26570.getClass(), "q2", 0.0);
        setDoubleField(term26570, term26570.getClass(), "q3", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAngle", argTypes, term26545, args);
        assertTrue(recursiveEquals(term26545, term26570));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


