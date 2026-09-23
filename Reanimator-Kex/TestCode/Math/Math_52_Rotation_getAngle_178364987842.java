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

public class Rotation_getAngle_178364987842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2618;
     Object term3987;

    public Rotation_getAngle_178364987842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2618 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term2618, term2618.getClass(), "q0", 0.0);
        setDoubleField(term2618, term2618.getClass(), "q1", 0.0);
        setDoubleField(term2618, term2618.getClass(), "q2", 0.0);
        setDoubleField(term2618, term2618.getClass(), "q3", 0.0);
        term3987 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term3987, term3987.getClass(), "q0", 0.0);
        setDoubleField(term3987, term3987.getClass(), "q1", 0.0);
        setDoubleField(term3987, term3987.getClass(), "q2", 0.0);
        setDoubleField(term3987, term3987.getClass(), "q3", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAngle", argTypes, term2618, args);
        assertTrue(recursiveEquals(term2618, term3987));
        assertTrue(recursiveEquals(retValue, 3.141592653589793));
    }

};


