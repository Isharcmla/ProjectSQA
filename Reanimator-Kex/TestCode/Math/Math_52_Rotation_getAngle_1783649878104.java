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

public class Rotation_getAngle_1783649878104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27529;
     Object term27556;

    public Rotation_getAngle_1783649878104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27529 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term27529, term27529.getClass(), "q0", 4.6116860184273879E18);
        setDoubleField(term27529, term27529.getClass(), "q1", 0.0);
        setDoubleField(term27529, term27529.getClass(), "q2", 0.0);
        setDoubleField(term27529, term27529.getClass(), "q3", 0.0);
        term27556 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term27556, term27556.getClass(), "q0", 4.6116860184273879E18);
        setDoubleField(term27556, term27556.getClass(), "q1", 0.0);
        setDoubleField(term27556, term27556.getClass(), "q2", 0.0);
        setDoubleField(term27556, term27556.getClass(), "q3", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAngle", argTypes, term27529, args);
        assertTrue(recursiveEquals(term27529, term27556));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


