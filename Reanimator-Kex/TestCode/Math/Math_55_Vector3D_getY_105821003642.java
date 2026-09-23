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

public class Vector3D_getY_105821003642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;
     Object term709;

    public Vector3D_getY_105821003642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term75, term75.getClass(), "x", 0.7591353014991907);
        setDoubleField(term75, term75.getClass(), "y", 0.791695029600875);
        setDoubleField(term75, term75.getClass(), "z", 0.6862221294683138);
        term709 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term709, term709.getClass(), "x", 0.7591353014991907);
        setDoubleField(term709, term709.getClass(), "y", 0.791695029600875);
        setDoubleField(term709, term709.getClass(), "z", 0.6862221294683138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getY", argTypes, term75, args);
        assertTrue(recursiveEquals(term75, term709));
        assertTrue(recursiveEquals(retValue, 0.791695029600875));
    }

};


