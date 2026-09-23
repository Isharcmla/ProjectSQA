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

public class Rotation_getAngle_178364987878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18379;
     Object term18404;

    public Rotation_getAngle_178364987878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18379 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term18379, term18379.getClass(), "q0", -1.5312238733059684E16);
        setDoubleField(term18379, term18379.getClass(), "q1", 0.0);
        setDoubleField(term18379, term18379.getClass(), "q2", 0.0);
        setDoubleField(term18379, term18379.getClass(), "q3", 0.0);
        term18404 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term18404, term18404.getClass(), "q0", -1.5312238733059684E16);
        setDoubleField(term18404, term18404.getClass(), "q1", 0.0);
        setDoubleField(term18404, term18404.getClass(), "q2", 0.0);
        setDoubleField(term18404, term18404.getClass(), "q3", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAngle", argTypes, term18379, args);
        assertTrue(recursiveEquals(term18379, term18404));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


