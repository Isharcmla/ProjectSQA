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

public class Rotation_distance_150142576288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20526;
     Object term20648;
     Object term20697;
     Object term20698;

    public Rotation_distance_150142576288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20526 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term20526, term20526.getClass(), "q0", 0.0);
        setDoubleField(term20526, term20526.getClass(), "q1", 0.0);
        setDoubleField(term20526, term20526.getClass(), "q2", 0.0);
        setDoubleField(term20526, term20526.getClass(), "q3", 0.0);
        term20648 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term20648, term20648.getClass(), "q0", 0.0);
        setDoubleField(term20648, term20648.getClass(), "q1", 0.0);
        setDoubleField(term20648, term20648.getClass(), "q2", 0.0);
        setDoubleField(term20648, term20648.getClass(), "q3", 0.0);
        term20697 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term20697, term20697.getClass(), "q0", 0.0);
        setDoubleField(term20697, term20697.getClass(), "q1", 0.0);
        setDoubleField(term20697, term20697.getClass(), "q2", 0.0);
        setDoubleField(term20697, term20697.getClass(), "q3", 0.0);
        term20698 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term20698, term20698.getClass(), "q0", 0.0);
        setDoubleField(term20698, term20698.getClass(), "q1", 0.0);
        setDoubleField(term20698, term20698.getClass(), "q2", 0.0);
        setDoubleField(term20698, term20698.getClass(), "q3", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Object[] args = new Object[2];
        args[0] = term20526;
        args[1] = term20648;
        Object retValue = callMethod(klass, "distance", argTypes, null, args);
        assertTrue(recursiveEquals(term20526, term20697));
        assertTrue(recursiveEquals(term20648, term20698));
        assertTrue(recursiveEquals(retValue, 3.141592653589793));
    }

};


