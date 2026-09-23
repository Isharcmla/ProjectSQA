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

public class Rotation_getAxis_17229678054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7765;
     Object term7788;
     Object term7779;

    public Rotation_getAxis_17229678054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7765 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term7765, term7765.getClass(), "q1", 2.4739921184E10);
        setDoubleField(term7765, term7765.getClass(), "q2", 2.19198964826216858E18);
        setDoubleField(term7765, term7765.getClass(), "q3", 2.3413475162728479E18);
        setDoubleField(term7765, term7765.getClass(), "q0", -9.2188684372274053E18);
        term7788 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term7788, term7788.getClass(), "q0", -9.2188684372274053E18);
        setDoubleField(term7788, term7788.getClass(), "q1", 2.4739921184E10);
        setDoubleField(term7788, term7788.getClass(), "q2", 2.19198964826216858E18);
        setDoubleField(term7788, term7788.getClass(), "q3", 2.3413475162728479E18);
        term7779 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term7779, term7779.getClass(), "x", 7.713646081394781E-9);
        setDoubleField(term7779, term7779.getClass(), "y", 0.6834392169248472);
        setDoubleField(term7779, term7779.getClass(), "z", 0.73000742240689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAxis", argTypes, term7765, args);
        assertTrue(recursiveEquals(term7765, term7788));
        assertTrue(recursiveEquals(retValue, term7779));
    }

};


