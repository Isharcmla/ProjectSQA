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

public class Rotation_getAngle_178364987898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26738;
     Object term26765;

    public Rotation_getAngle_178364987898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26738 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term26738, term26738.getClass(), "q0", 4.596373779734594E18);
        setDoubleField(term26738, term26738.getClass(), "q1", 0.0);
        setDoubleField(term26738, term26738.getClass(), "q2", 0.0);
        setDoubleField(term26738, term26738.getClass(), "q3", 0.0);
        term26765 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term26765, term26765.getClass(), "q0", 4.596373779734594E18);
        setDoubleField(term26765, term26765.getClass(), "q1", 0.0);
        setDoubleField(term26765, term26765.getClass(), "q2", 0.0);
        setDoubleField(term26765, term26765.getClass(), "q3", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAngle", argTypes, term26738, args);
        assertTrue(recursiveEquals(term26738, term26765));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


