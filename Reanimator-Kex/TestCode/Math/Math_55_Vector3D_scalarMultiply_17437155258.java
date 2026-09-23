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
import java.lang.Double;

public class Vector3D_scalarMultiply_17437155258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163;
     Object term167;
     Object term2092;
     Object term2080;

    public Vector3D_scalarMultiply_17437155258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term163, term163.getClass(), "x", 0.09037487793444521);
        setDoubleField(term163, term163.getClass(), "y", 0.6561919196821765);
        setDoubleField(term163, term163.getClass(), "z", 0.7330178886612495);
        term167 = new Double(0.7618164754425794);
        term2092 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term2092, term2092.getClass(), "x", 0.09037487793444521);
        setDoubleField(term2092, term2092.getClass(), "y", 0.6561919196821765);
        setDoubleField(term2092, term2092.getClass(), "z", 0.7330178886612495);
        term2080 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term2080, term2080.getClass(), "x", 0.06884907097657239);
        setDoubleField(term2080, term2080.getClass(), "y", 0.4998978154661758);
        setDoubleField(term2080, term2080.getClass(), "z", 0.5584251043762741);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term167;
        Object retValue = callMethod(klass, "scalarMultiply", argTypes, term163, args);
        assertTrue(recursiveEquals(term163, term2092));
        assertTrue(recursiveEquals(term167, 0.7618164754425794));
        assertTrue(recursiveEquals(retValue, term2080));
    }

};


