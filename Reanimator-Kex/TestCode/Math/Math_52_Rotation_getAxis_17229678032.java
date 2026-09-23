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

public class Rotation_getAxis_17229678032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151;
     Object term2599;
     Object term2590;

    public Rotation_getAxis_17229678032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term151, term151.getClass(), "q0", 0.48862955528902696);
        setDoubleField(term151, term151.getClass(), "q1", 0.426231085465289);
        setDoubleField(term151, term151.getClass(), "q2", 0.0027299293098262956);
        setDoubleField(term151, term151.getClass(), "q3", 0.29874017652881824);
        term2599 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term2599, term2599.getClass(), "q0", 0.48862955528902696);
        setDoubleField(term2599, term2599.getClass(), "q1", 0.426231085465289);
        setDoubleField(term2599, term2599.getClass(), "q2", 0.0027299293098262956);
        setDoubleField(term2599, term2599.getClass(), "q3", 0.29874017652881824);
        term2590 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term2590, term2590.getClass(), "x", -0.818878955737392);
        setDoubleField(term2590, term2590.getClass(), "y", -0.005244764492076229);
        setDoubleField(term2590, term2590.getClass(), "z", -0.573942286554895);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAxis", argTypes, term151, args);
        assertTrue(recursiveEquals(term151, term2599));
        assertTrue(recursiveEquals(retValue, term2590));
    }

};


