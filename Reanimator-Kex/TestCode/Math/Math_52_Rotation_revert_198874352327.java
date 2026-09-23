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

public class Rotation_revert_198874352327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126;
     Object term2548;
     Object term2533;

    public Rotation_revert_198874352327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term126, term126.getClass(), "q0", 0.20737514139742264);
        setDoubleField(term126, term126.getClass(), "q1", 0.7919370314903882);
        setDoubleField(term126, term126.getClass(), "q2", 0.2109867221632754);
        setDoubleField(term126, term126.getClass(), "q3", 0.3227335400819148);
        term2548 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term2548, term2548.getClass(), "q0", 0.20737514139742264);
        setDoubleField(term2548, term2548.getClass(), "q1", 0.7919370314903882);
        setDoubleField(term2548, term2548.getClass(), "q2", 0.2109867221632754);
        setDoubleField(term2548, term2548.getClass(), "q3", 0.3227335400819148);
        term2533 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term2533, term2533.getClass(), "q0", -0.20737514139742264);
        setDoubleField(term2533, term2533.getClass(), "q1", 0.7919370314903882);
        setDoubleField(term2533, term2533.getClass(), "q2", 0.2109867221632754);
        setDoubleField(term2533, term2533.getClass(), "q3", 0.3227335400819148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "revert", argTypes, term126, args);
        assertTrue(recursiveEquals(term126, term2548));
        assertTrue(recursiveEquals(retValue, term2533));
    }

};


