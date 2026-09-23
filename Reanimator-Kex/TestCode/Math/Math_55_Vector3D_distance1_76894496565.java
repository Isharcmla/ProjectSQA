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

public class Vector3D_distance1_76894496565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202;
     Object term206;
     Object term2197;
     Object term2198;

    public Vector3D_distance1_76894496565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term202, term202.getClass(), "x", 0.4355627280318103);
        setDoubleField(term202, term202.getClass(), "y", 0.841460835734741);
        setDoubleField(term202, term202.getClass(), "z", 0.7859316615744082);
        term206 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term206, term206.getClass(), "x", 0.6428742553484879);
        setDoubleField(term206, term206.getClass(), "y", 0.6584165706677267);
        setDoubleField(term206, term206.getClass(), "z", 0.44268490778872205);
        term2197 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term2197, term2197.getClass(), "x", 0.4355627280318103);
        setDoubleField(term2197, term2197.getClass(), "y", 0.841460835734741);
        setDoubleField(term2197, term2197.getClass(), "z", 0.7859316615744082);
        term2198 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term2198, term2198.getClass(), "x", 0.6428742553484879);
        setDoubleField(term2198, term2198.getClass(), "y", 0.6584165706677267);
        setDoubleField(term2198, term2198.getClass(), "z", 0.44268490778872205);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term202;
        args[1] = term206;
        Object retValue = callMethod(klass, "distance1", argTypes, null, args);
        assertTrue(recursiveEquals(term202, term2197));
        assertTrue(recursiveEquals(term206, term2198));
        assertTrue(recursiveEquals(retValue, 0.7336025461693779));
    }

};


