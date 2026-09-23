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

public class Rotation_getQ2_203696540430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141;
     Object term2569;

    public Rotation_getQ2_203696540430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term141, term141.getClass(), "q0", 0.5308350402051779);
        setDoubleField(term141, term141.getClass(), "q1", 0.7154795600170818);
        setDoubleField(term141, term141.getClass(), "q2", 0.6355029654528058);
        setDoubleField(term141, term141.getClass(), "q3", 0.0022646783892913414);
        term2569 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term2569, term2569.getClass(), "q0", 0.5308350402051779);
        setDoubleField(term2569, term2569.getClass(), "q1", 0.7154795600170818);
        setDoubleField(term2569, term2569.getClass(), "q2", 0.6355029654528058);
        setDoubleField(term2569, term2569.getClass(), "q3", 0.0022646783892913414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getQ2", argTypes, term141, args);
        assertTrue(recursiveEquals(term141, term2569));
        assertTrue(recursiveEquals(retValue, 0.6355029654528058));
    }

};


