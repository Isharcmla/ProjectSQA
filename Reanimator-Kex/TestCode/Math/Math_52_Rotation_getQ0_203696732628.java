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

public class Rotation_getQ0_203696732628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131;
     Object term2555;

    public Rotation_getQ0_203696732628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term131, term131.getClass(), "q0", 0.43337207054070237);
        setDoubleField(term131, term131.getClass(), "q1", 0.13246999699526574);
        setDoubleField(term131, term131.getClass(), "q2", 0.9126850255993704);
        setDoubleField(term131, term131.getClass(), "q3", 0.11179067076100713);
        term2555 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term2555, term2555.getClass(), "q0", 0.43337207054070237);
        setDoubleField(term2555, term2555.getClass(), "q1", 0.13246999699526574);
        setDoubleField(term2555, term2555.getClass(), "q2", 0.9126850255993704);
        setDoubleField(term2555, term2555.getClass(), "q3", 0.11179067076100713);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getQ0", argTypes, term131, args);
        assertTrue(recursiveEquals(term131, term2555));
        assertTrue(recursiveEquals(retValue, 0.43337207054070237));
    }

};


